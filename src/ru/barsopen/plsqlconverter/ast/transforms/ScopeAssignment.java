package ru.barsopen.plsqlconverter.ast.transforms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import ru.barsopen.plsqlconverter.ast.typed.*;

public class ScopeAssignment {
	public Scope globalScope;
	public Map<_baseNode, ScopeEntry> defToScopeEntry = new HashMap<_baseNode, ScopeEntry>();
	public Map<_baseNode, Scope> defToScope = new HashMap<_baseNode, Scope>();
	public Map<general_element, Scope> generalElementToScope = new HashMap<general_element, Scope>();
	
	public static ScopeAssignment compute(_baseNode ast) {
		final ScopeAssignment result = new ScopeAssignment();
		result.globalScope = new Scope();
		final Stack<Scope> scopeStack = new Stack<Scope>();
		scopeStack.push(result.globalScope);
		final Map<String, Scope> packageScopes = new HashMap<String, Scope>();
		ast._walk(new _visitor() {
			@Override
			public boolean enter(_baseNode node) {
				Scope currentScope = scopeStack.peek();
				
				if (node instanceof create_package_body) {
					String name = AstUtil.getLastIdString(((create_package_body)node).package_name.ids);
					currentScope.addEntry(name, node);
					
					Scope packageScope = packageScopes.get(name);
					if (packageScope == null) {
						packageScope = currentScope.createChild(String.format("package %s", name));
						packageScopes.put(name, packageScope);
					}
					result.defToScope.put(node, packageScope);
					scopeStack.push(packageScope);
				} else if (node instanceof create_package_spec) {
					String name = AstUtil.getLastIdString(((create_package_spec)node).package_name.ids);
					
					Scope packageScope = packageScopes.get(name);
					if (packageScope == null) {
						currentScope.addEntry(name, node);
						packageScope = currentScope.createChild(String.format("package %s", name));
						packageScopes.put(name, packageScope);
					}
					result.defToScope.put(node, packageScope);
					scopeStack.push(packageScope);
				} else if (node instanceof create_function_body) {
					String name = AstUtil.getLastIdString(((create_function_body)node).function_name.ids);
					currentScope.addEntry(name, node);
					
					Scope functionScope = currentScope.createChild(String.format("function %s", name));
					result.defToScope.put(node, functionScope);
					fillFunctionScope(functionScope, (create_function_body)node);
					scopeStack.push(functionScope);
				} else if (node instanceof create_procedure_body) {
					String name = AstUtil.getLastIdString(((create_procedure_body)node).procedure_name.ids);
					currentScope.addEntry(name, node);
					
					Scope procedureScope = currentScope.createChild(String.format("procedure %s", name));
					result.defToScope.put(node, procedureScope);
					fillProcedureScope(procedureScope, (create_procedure_body)node);
					scopeStack.push(procedureScope);
				} else if (node instanceof block) {
					String description = String.format("block at %d:%d", node._getLine(), node._getCol());
					
					Scope blockScope = currentScope.createChild(description);
					result.defToScope.put(node, blockScope);
					fillBlockScope(blockScope, (block)node);
					scopeStack.push(blockScope);
				} else if (node instanceof for_loop) {
					String description = String.format("loop at %d:%d", node._getLine(), node._getCol());
					
					Scope loopScope = currentScope.createChild(description);
					result.defToScope.put(node, loopScope);
					fillForLoopScope(loopScope, (for_loop)node);
					scopeStack.push(loopScope);
				} else if (node instanceof variable_declaration
							&& (node._getParent() instanceof create_package_spec
							|| node._getParent() instanceof create_package_body)) {
					variable_declaration varNode = (variable_declaration)node;
					String name = AstUtil.getLastIdString(varNode.variable_name.ids);
					currentScope.addEntry(name, node);
				} else if (node instanceof general_element) {
					result.generalElementToScope.put((general_element)node, currentScope);
				}
				
				return true;
			}
			
			@Override
			public void visit(Tree nonNode) {
			}
			
			@Override
			public void leave(_baseNode node) {
				
				if (node instanceof create_package_body
					|| node instanceof create_package_spec
					|| node instanceof create_function_body
					|| node instanceof create_procedure_body
					|| node instanceof block
					|| node instanceof for_loop) {
					scopeStack.pop();
				}
			}
		});
		computeDefToScope(result, result.globalScope);
		computeReferences(result);
		return result;
	}

	protected static void fillForLoopScope(Scope scope, for_loop node) {
		if (node.cursor_loop_param instanceof indexed_for) {
			indexed_for loop_spec = (indexed_for)node.cursor_loop_param;
			String name = AstUtil.normalizeId(loop_spec.index_name.id.value);
			scope.addEntry(name, loop_spec);
		} else if (node.cursor_loop_param instanceof cursor_based_for) {
			cursor_based_for loop_spec = (cursor_based_for)node.cursor_loop_param;
			String name = AstUtil.normalizeId(loop_spec.record_name.id.value);
			scope.addEntry(name, loop_spec);
		} else if (node.cursor_loop_param instanceof select_based_for) {
			select_based_for loop_spec = (select_based_for)node.cursor_loop_param;
			String name = AstUtil.normalizeId(loop_spec.record_name.id.value);
			scope.addEntry(name, loop_spec);
		}
	}

	protected static void fillBlockScope(Scope scope, block node) {
		for (declare_spec spec: node.declare_specs) {
			if (spec instanceof variable_declaration) {
				variable_declaration varNode = (variable_declaration)spec;
				String name = AstUtil.getLastIdString(varNode.variable_name.ids);
				scope.addEntry(name, spec);
			} else if (spec instanceof cursor_declaration) {
				cursor_declaration cursorNode = (cursor_declaration)spec;
				String name = AstUtil.normalizeId(cursorNode.cursor_name.id.value);
				scope.addEntry(name, spec);
			}
		}
	}

	protected static void fillFunctionScope(Scope scope, create_function_body func) {
		for (parameter p: func.parameters.parameters) {
			String name = AstUtil.normalizeId(p.parameter_name.id.value);
			scope.addEntry(name, p);
		}
	}

	protected static void fillProcedureScope(Scope scope, create_procedure_body func) {
		for (parameter p: func.parameters.parameters) {
			String name = AstUtil.normalizeId(p.parameter_name.id.value);
			scope.addEntry(name, p);
		}
	}

	private static void computeDefToScope(ScopeAssignment sa,
			Scope scope) {
		for (ScopeEntry se: scope.entries.values()) {
			sa.defToScopeEntry.put(se.defNode, se);
		}
		for (Scope childScope: scope.children) {
			computeDefToScope(sa, childScope);
		}
	}

	private static void computeReferences(ScopeAssignment result) {
		for (Entry<general_element, Scope> ge_and_scope: result.generalElementToScope.entrySet()) {
			general_element elt = ge_and_scope.getKey();
			Scope scope = ge_and_scope.getValue();
			_baseNode target = getGeneralElementInitialTarget((general_element_id)elt.general_element_items.get(0), scope);
			if (target != null) {
				result.defToScopeEntry.get(target).references.add(elt.general_element_items.get(0));
				for (int i = 1; target != null && i < elt.general_element_items.size(); ++i) {
					general_element_item item = elt.general_element_items.get(i);
					target = getGeneralElementNextTarget(item, target, result);
					if (target != null) {
						result.defToScopeEntry.get(target).references.add(item);
					}
				}
			}
		}
	}
	
	public static boolean isInSqlStatement(_baseNode node) {
		while (node != null) {
			if (node instanceof merge_statement
				|| node instanceof lock_table_statement
				|| node instanceof select_statement
				|| node instanceof update_statement
				|| node instanceof delete_statement
				|| node instanceof insert_statement) {
				
				return true;
				
			} else {
				node = node._getParent();
			}
		}
		return false;
	}

	public static _baseNode getGeneralElementInitialTarget(general_element_id item, Scope scope) {
		String id = AstUtil.normalizeId(item.id.value);
		ScopeEntry scopeEntry = scope.lookup(id);
		if (scopeEntry == null) {
			if (!isInSqlStatement(item) && !isBuiltinObject(id)) {
				System.err.printf("For ID %s at %d:%d could not find entry in scope\n", id, item.id._line, item.id._col);
			}
			return null;
		}
		return scopeEntry.defNode;
	}
	
	static Set<String> builtins = new HashSet<String>();
	{
		String[] builtinsStr = {
			"COALESCE TRUNC CURRENT_TIMESTAMP SQLERRM TO_CHAR TO_NUMBER NVL SYSDATE CHR SQLCODE SQLERRM SUBSTR UPPER",
			"SYS INSTR DBMS_SQL LENGTH REPLACE TO_DATE DBMS_XMLDOM LOWER DBMS_METADATA DBMS_RANDOM ",
		     "INSTR DBMS_SQL CPARS LENGTH REPLACE TO_DATE DBMS_XMLDOM LOWER ROUND DBMS_OUTPUT DBMS_LOB LPAD UTL_RAW RPAD LTRIM RTRIM USER REGEXP_SUBSTR",
			 "INITCAP RAISE_APPLICATION_ERROR UTL_FILE MOD XMLTYPE REGEXP_REPLACE ADD_MONTHS LEAST ASCII MONTHS_BETWEEN",
			 "NLS_CHARSET_ID GREATEST CEIL EMPTY_BLOB REGEXP_LIKE ABS REGEXP_INSTR LAST_DAY EMPTY_CLOB TO_CLOB NEXT_DAY",
			 "UTL_HTTP POWER FLOOR CONVERT BFILENAME DBMS_SPACE DBMS_JOB UTL_I18N NLS_UPPER DBMS_PIPE DBMS_CRYPTO SYS_CONTEXT"
		};
		for (String str: builtinsStr) {
			for (String id: str.split("\\s+")) {
				builtins.add(id);
			}
		}
	}

	private static boolean isBuiltinObject(String id) {
		return builtins.contains(id);
	}

	public static _baseNode getGeneralElementNextTarget(general_element_item item, _baseNode prevTarget, ScopeAssignment sa) {
		if (item instanceof general_element_id) {
			id idNode = ((general_element_id)item).id;
			String attrName = AstUtil.normalizeId(idNode.value);
			if (prevTarget instanceof create_function_or_procedure_body) {
				Scope functionArgsScope = sa.defToScope.get(prevTarget);
				ScopeEntry entry = functionArgsScope.entries.get(attrName);
				if (entry == null) {
					//return null;
				} else {
					return entry.defNode;
				}
			} else if (prevTarget instanceof labeled_statement) {
				Scope labeledScope = sa.defToScope.get(prevTarget);
				ScopeEntry entry = labeledScope.lookup(attrName);
				if (entry == null) {
					//return null;
				} else {
					return entry.defNode;
				}
			} else if (prevTarget instanceof create_package_body) {
				Scope packageScope = sa.defToScope.get(prevTarget);
				ScopeEntry entry = packageScope.lookup(attrName);
				if (entry == null) {
					//return null;
				} else {
					return entry.defNode;
				}
			} else if (prevTarget instanceof variable_declaration
				|| prevTarget instanceof parameter
				|| prevTarget instanceof select_based_for
				|| prevTarget instanceof cursor_based_for
				|| prevTarget instanceof indexed_for) {
				return null; // VAR.ID -> method call or attr access, don't process those
			}
			if (!isInSqlStatement(item)) {
				System.err.printf("ScopeAssignment: Don't know how to process general_element_id %s (of %s) at %d:%d\n", attrName, prevTarget.getClass().getSimpleName(), idNode._line, idNode._col);
			}
		} else {
			if (prevTarget instanceof create_function_body) {
				create_function_body func = (create_function_body)prevTarget;
				//return func.type_spec; // should return definition for type, but it's not useful for us now -> since we don't traverse to arguments
				return null;
			} else if (prevTarget instanceof create_procedure_body) {
				return null; // Procedure have no more attributes
			} else {
				//id id1 = ((general_element_id)((general_element)item._getParent()).general_element_items.get(0)).id;
				//System.err.printf("Method call  case reached at ScopeAssignment.getGeneralElementNextTarget() at %d:%d\n", id1._line, id1._col);
				return null; // This is array indexing; won't process it
			}
		}
		
		return null;
	}
}
