package ru.barsopen.plsqlconverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.barsopen.plsqlconverter.ast.transforms.AstParser;
import ru.barsopen.plsqlconverter.ast.transforms.AstPrinter;
import ru.barsopen.plsqlconverter.ast.transforms.AstSerializer;
import ru.barsopen.plsqlconverter.ast.transforms.AstUtil;
import ru.barsopen.plsqlconverter.ast.transforms.AstXml;
import ru.barsopen.plsqlconverter.ast.transforms.CustomTypesConversionTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.DatatypeConversionTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.IntoStrictConversionTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.MiscConversionsTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.NestedFunctionConversionTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.OracleOuterJoinTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.PackageConversionTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.ParseResult;
import ru.barsopen.plsqlconverter.ast.transforms.PrintResult;
import ru.barsopen.plsqlconverter.ast.transforms.ProcedurePerformConversionTransformer;
import ru.barsopen.plsqlconverter.ast.transforms.ProcedureToFunctionConversionTransformer;
import ru.barsopen.plsqlconverter.ast.typed.*;
import ru.barsopen.plsqlconverter.util.AttachedComments;
import ru.barsopen.plsqlconverter.util.ReflectionUtil;
import ru.barsopen.plsqlconverter.util.TokenCounter;
import br.com.porcelli.parser.plsql.PLSQLLexer;
import br.com.porcelli.parser.plsql.PLSQLParser;
import ru.barsopen.plsqlconverter.ast.transforms.Oracle2PGSyntaxTransformer;

public class Main
{
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception 
	{
                //normal exapmle
		/*
		String inSql = "CREATE OR REPLACE FUNCTION totalCustomers\n" + 
				"RETURN number IS\n" + 
				"   total number(2) := 0;\n" + 
				"   ts date;\n" + 
				"BEGIN\n" + 
				"\n" + 
				"   ts := add_years(now(), 1);\n" + 
				"\n" + 
				"   SELECT count(*) into total\n" + 
				"   FROM customers;\n" + 
				"   \n" + 
				"   RETURN total;\n" + 
				"END;";	
                //inSql = inSql + "\n" + inSql;
		*/
            
            //package name exapmle
//            String inSql = "CREATE OR REPLACE package body TEST.pkg_lyy\n"
//                    + "as\n"
//                    + "    procedure spStr(str out varchar)\n"
//                    + "    is\n"
//                    + "    begin\n"
//                    + "        select name into str from lyy where id=1;\n"
//                    + "    end spStr;\n"
//                    + "end pkg_lyy;";
                              
                //comment example
//		String inSql = "CREATE OR REPLACE PROCEDURE test.testcmt(id int)\n"
//				+ " is\n"
//				+ "/* c line1\n"
//				+ "/* c line2\n"
//				+ "/* cline3 */\n"
//				+ " num int;\n"
//				+ " begin\n"
//				+ " select id into num from lyy;\n"
//				+ " end;";
                
                //left join example
//               String inSql = "create or replace function test.testjoin\n"
//                    + "   return int\n"
//                    + "   is\n"
//                    + "   age int;\n"
//                    + "begin\n"
//                    + "   select lyy2.age into age from lyy,lyy2 where lyy.id=lyy2.id(+);\n"
//                    + "   return age;\n"
//                    + "end;";
                      
                //end name example
//            String inSql = "CREATE OR REPLACE procedure TEST.test_endname(str out lyy.name%type)\n"
//                    + "as\n"
//                    + "begin\n"
//                    + "   select name into str from lyy where id=1;\n"
//                    + "end test_endname;";
            
                 //select unique->select distinct
//                String inSql = "CREATE OR REPLACE procedure TEST.test_unique2(num out int)\n"
//                    + "as\n"
//                    + "begin\n"
//                    + "    select unique id into num from  lyy;\n"
//                    + "end;";
                		
                 //select count(*) ... order by -> select count(*)
//                 String inSql = "CREATE OR REPLACE procedure TEST.test_count_orderyby(count out int)\n"
//                    + "as\n"
//                    + "begin\n"
//                    + "select count(*) into count from lyy group by id order by id;\n"
//                    + "end;";
                 //rowid->ctid
//                String inSql = "create or replace procedure test_rowid2(row out rowid)\n"
//                    + "as\n"
//                    + "begin\n"
//                    + "select rowid into row from lyy where id>1 order by rowid;\n"
//                    + "end;";
            
            //joint
            String inSql = " create or replace procedure test_joint(row out varchar)\n"
                    + " as\n"
                    + " begin\n"
                    + " select 'test'||id||name into row from lyy where name is null order by 'test'||id \n"
                    + ";\n"
                    + " end;";

               //is null
//            String inSql = "create or replace procedure test_isnull(row out varchar)\n"
//                    + "as\n"
//                    + "begin\n"
//                    + "select  case when name is null then '123' else '234' end into row from lyy\n"
//                    + " where id is not null;\n"
//                    + "end;";
                 
		//String inSql = "create table yy(id int);";
		try 
		{
                        logger.debug(inSql);
			//[0] core method
			String outSql = new Main().convert(inSql);
			logger.debug("outSql = " + outSql);
		} catch (Exception e) 
		{
			e.printStackTrace();
			logger.error(e.getMessage());
			throw new Exception(e);
		}
	}	
	
	public String convert(String inSql) throws Exception
	{
		String[] inArgs = new String[] {"--tree-type", "sql_script", "--input-sql", "*", "--output-sql", "*",
				"--convert", "--use-pgsql", "--debug"};//--tree-type only "sql_script" pass test
		String outSQL = execute(inArgs, inSql);
		outSQL = outSQL.trim();
		return outSQL;
	}

	public static String arrayToString(String[] args)
	{
		StringBuilder stb = new StringBuilder();
		if(args != null)
		{
			for(String s : args)
			{
				stb.append(s).append(" ");
			}
		}
		return stb.toString();
	}
	
	private String execute(String[] inArgs, String inSql) throws Exception
	{
		//logger.debug(new File("").getAbsolutePath());
		//current path: F:\mars_workspace\plsql-postgresql-converter\converter\
		
		logger.debug("Enter");
		//[0] check in parameter 
		if (inArgs == null 
                    || inSql == null || inSql.isEmpty()) {
			logger.error("inArgs or inSql is null, do nothing and return null.");
			return null;
		}
		logger.debug("inArgs=" + Main.arrayToString(inArgs));
		logger.debug("inSql=" + inSql);
		
		//[1]basic parse inArgs
		CliOptions options = CliOptions.parseCliOptions(inArgs);
		
		//args = --help
		if (options.help)
		{
			CliOptions.printUsage(System.out);
			return null;
		}
		
		//args: --all-packages --input-sql xxx.txt --validate-reparse --limit-all-packages intValue
		if (options.allPackages)
		{
			parseByParts(options.inputSqlPath, options.validateReparse, options.limitAllPackages);
			return null;
		}
		
		//[2]args: --tree-type sql_script --input-sql example.txt --output-sql - --convert --use-pgsql
		ParseResult parseResult = readInputSql(options, inSql);
		//[5]
		List<Token> comments = new ArrayList<Token>();
		for (Token token : parseResult.tokens)
		{
			//logger.debug("token index=" + token.getTokenIndex() + ", type=" + token.getType() + ", text=" + token.getText());
			if (token.getType() == PLSQLLexer.COMMENT)
			{
				comments.add(token);
			}                        
		}
        logger.debug("tokens=" + parseResult.tokens + ", tree=" +  parseResult.tree);
                

		//[6]parser.parsesql_script
		_baseNode ast = (_baseNode) ReflectionUtil.callStaticMethod(parser.class, "parse" + options.tree_type,
				parseResult.tree);
        logger.debug("ast=" + ast);
        
		//[7]
		attachComments(ast, comments, parseResult.tokens);

		logger.debug("validateReparse=" + options.validateReparse);
		if (options.validateReparse)
		{
			String errorMessage = validatePrintedTreeMatchesParsedTree(parseResult.tree,
					options.validateReparseOutputAstPath, options.tree_type);
			logger.debug("errorMessage=" + errorMessage);
			if (errorMessage != null)
			{
				//logger.error("Error comparing after print: %s\n", errorMessage);
				//System.exit(1);
				throw new Exception("Error comparing after print:" + errorMessage);
			}
		}

		//[8]
		if (options.convert)
		{
			OracleOuterJoinTransformer.isDebugEnabled = options.debug;
			logger.info("doing nested functions...");
			NestedFunctionConversionTransformer.transformAll(ast);
			logger.info("doing procedure to function...");                        
			ProcedureToFunctionConversionTransformer.transformAll(ast);
			// logger.info("doing named function result (forward)...");
			// FunctionNamedResultConversionTransformer.transformAllForward(ast);
			logger.info("doing misc conversion...");
			MiscConversionsTransformer.transformAll(ast);
			logger.info("doing outer joins...");
			OracleOuterJoinTransformer.transformAllQueries(ast);
                        logger.info("doing oracle2pg syntax transform...");
			Oracle2PGSyntaxTransformer.transformDiffs(ast);
			logger.info("doing packages...");
			PackageConversionTransformer.transformAllPackages(ast);
			logger.info("doing datatypes...");
			DatatypeConversionTransformer.transformAll(ast);
			logger.info("doing perform...");
			ProcedurePerformConversionTransformer.transformAll(ast);
                        // disable, bacause PG into needn't strict(strict only support for null or one record)
			//IntoStrictConversionTransformer.transformAll(ast);
			CustomTypesConversionTransformer.transformAll(ast);
		}

		//[9]
		Tree tree = ast.unparse();
		
		logger.debug("splitOutput=" + options.splitOutput);
		if (!options.splitOutput)//[10]
		{
			//[11]
			if (options.usePgSql && "*".equals(options.outputSqlPath)) 
			{
				//[12] final
				PrintResult printResult = AstPrinter.printTreeToPostgresqlString(tree, options.tree_type);
				logger.debug("Return: " + printResult.text);// print outSql
				return printResult.text;
			} else 
			{
				List<Token> tokens = parseResult.tokens;
				writeOutputTree(options, tree, tokens, null);
			}
		} else 
		{
			if (tree.getType() != PLSQLParser.SQL_SCRIPT)
			{
				logger.error("Parsed tree is not a SQL script");
			}

			sql_script script = (sql_script) ast;
			List<unit_statement> statements = new ArrayList<unit_statement>();
			for (sql_script_item item : script.sql_script_items)
			{
				if (item instanceof unit_statement)
				{
					unit_statement statement = (unit_statement) item;
					statements.add(statement);
					if (options.limitAllPackages != null && statements.size() == options.limitAllPackages)
					{
						break;
					}
				}
			}

			int idx = 0;
			for (unit_statement statement : statements)
			{
				++idx;
				// alter_function, alter_package, alter_procedure,
				// alter_sequence, alter_trigger,
				// alter_type, create_function_body, create_procedure_body,
				// create_package, create_sequence,
				// create_trigger, create_type, drop_function, drop_package,
				// drop_procedure,
				// drop_sequence, drop_trigger, drop_type

				StatementTypeAndName typeAndName = getStatementTypeAndName(statement);

				Tree newScript = new org.antlr.runtime.tree.CommonTree(
						new org.antlr.runtime.CommonToken(PLSQLParser.SQL_SCRIPT));
				newScript.addChild(statement.unparse());

				Map<String, String> replacements = new HashMap<String, String>();
				replacements.put("i", String.valueOf(idx));
				replacements.put("t", typeAndName.type);
				replacements.put("n", typeAndName.name);

				writeOutputTree(options, newScript, parseResult.tokens, replacements);				
			}
		}
		return null;
	}

	private static void attachComments(_baseNode node, List<Token> comments, List<Token> allTokens)
	{
		List<_baseNode> allNodes = AstUtil.getDescendantsOfType(node, _baseNode.class);
		List<_baseNode> attachableNodes = new ArrayList<_baseNode>();
		for (_baseNode n : allNodes)
		{
			if (n instanceof id/* || n instanceof constant */)
			{
				attachableNodes.add(n);
			}
		}
		Collections.sort(attachableNodes, new Comparator<_baseNode>() {
			@Override
			public int compare(_baseNode arg0, _baseNode arg1)
			{
				if (arg0._getLine() != arg1._getLine())
				{
					return arg0._getLine() - arg1._getLine();
				}
				return arg0._getCol() - arg1._getCol();
			}
		});

		int i = 0, j = 0;
		while (i < attachableNodes.size() && j < comments.size())
		{
			Token comment = comments.get(j);
			_baseNode c1 = (i < attachableNodes.size()) ? attachableNodes.get(i) : null;
			_baseNode c2 = (i + 1 < attachableNodes.size()) ? attachableNodes.get(i + 1) : null;
			if (c1 == null)
			{
				// bad luck
			} else if (c2 == null)
			{
				doAttach(c1, comment);
				++j;
			} else if (c2._getLine() < comment.getLine()
					|| (c2._getLine() == comment.getLine() && c2._getCol() < comment.getCharPositionInLine()))
			{
				++i;
			} else
			{
				// now: comment is between c1 and c2
				int l1 = Math.abs(c1._getLine() - comment.getLine());
				int l2 = Math.abs(c2._getLine() - comment.getLine());
				if (l1 < l2)
				{
					doAttach(c1, comment);
					++j;
				} else
				{
					doAttach(c2, comment);
					++j;
				}
			}
		}
	}

	private static void doAttach(_baseNode node, Token c)
	{
		if (node.getAttachedComments() == null)
		{
			node.setComments(new AttachedComments());
		}
		
                // compatibility for PG comment
		String cmt = c.getText();
		logger.debug("cmt before=" + cmt);
		if (cmt != null)
		{
			c.setText("/*" + (cmt.replace("/*", " ")).replace("*/", " ") + " */");
		}
                logger.debug("cmt after=" + cmt);
		
		boolean isBefore = c.getLine() < node._getLine()
				|| (c.getLine() == node._getLine() && c.getCharPositionInLine() < node._getCol());
		if (isBefore)
		{
			node.getAttachedComments().before.add(c);
		} else
		{
			node.getAttachedComments().after.add(c);
		}
	}

	private static void writeOutputTree(CliOptions options, org.antlr.runtime.tree.Tree tree, List<Token> tokens,
			Map<String, String> fileNameReplacements)
			throws FileNotFoundException, IOException, RecognitionException, Exception
	{
		if (options.outputAstPath != null)
		{
			String str = AstPrinter.prettyPrint(tree);

			if (options.outputAstPath.equals("-"))
			{
				if (options.splitOutput)
				{
					throw new Exception("--split-output can not be used with output to stdout");
					//System.exit(1);
				}
				System.out.println(str);
			} else
			{
				String path = options.outputAstPath;
				if (options.splitOutput)
				{
					path = doFileNameReplacements(path, fileNameReplacements);
				}
				Files.createDirectories(Paths.get(path).getParent());
				try (PrintStream out = new PrintStream(new FileOutputStream(path)))
				{
					out.println(str);
				}
			}
		}

		//[12]
		logger.debug("outputSqlPath=" + options.outputSqlPath);
		if (options.outputSqlPath != null)
		{
			PrintResult printResult;
			if (options.usePgSql)
			{
				printResult = AstPrinter.printTreeToPostgresqlString(tree, options.tree_type);
			} else
			{
				printResult = AstPrinter.printTreeToOracleString(tree, options.tree_type);
			}

			if (options.outputSqlPath.equals("-")) 
			{
				if (options.splitOutput) 
				{
					throw new Exception("--split-output can not be used with output to stdout");
					//System.exit(1);
				}
				System.out.println( printResult.text);
			} else
			{
				String path = options.outputSqlPath;
				if (options.splitOutput)
				{
					path = doFileNameReplacements(path, fileNameReplacements);
				}
				Files.createDirectories(Paths.get(path).getParent());
				try (PrintStream out = new PrintStream(new FileOutputStream(path)))
				{
					out.println(printResult.text);
				}
			}
		}

		if (options.outputXmlPath != null)
		{
			String astXml = AstXml.xmlToString(AstXml.astToXml(tokens, tree));

			if (options.outputXmlPath.equals("-"))
			{
				if (options.splitOutput)
				{
					throw new Exception("--split-output can not be used with output to stdout");
					//System.exit(1);
				}
				System.out.println(astXml);
			} else
			{
				String path = options.outputXmlPath;
				if (options.splitOutput)
				{
					path = doFileNameReplacements(path, fileNameReplacements);
				}
				Files.createDirectories(Paths.get(path).getParent());
				try (PrintStream out = new PrintStream(new FileOutputStream(path)))
				{
					out.println(astXml);
				}
			}
		}

		if (options.outputSerializedPath != null)
		{
			String path = options.outputSerializedPath;
			if (options.splitOutput)
			{
				path = doFileNameReplacements(path, fileNameReplacements);
			}
			Files.createDirectories(Paths.get(path).getParent());
			try (FileOutputStream stream = new FileOutputStream(path))
			{
				AstSerializer.serialiaseAst(stream, tokens, tree);
			}
		}
	}

	private static String doFileNameReplacements(String path, Map<String, String> fileNameReplacements)
	{
		for (Entry<String, String> entry : fileNameReplacements.entrySet())
		{
			path = path.replace(String.format("{%s}", entry.getKey()), entry.getValue());
		}
		return path;
	}

	private static ParseResult readInputSql(CliOptions options, String inSql)
			throws IOException, RecognitionException, Exception, FileNotFoundException
	{
		logger.debug("Enter");
		ParseResult parseResult = null;
		long parseStartTime = System.currentTimeMillis();

		if (options.inputSqlPath != null)
		{
			byte[] inputContentBytes;
			String inputContent;
			//[3] get inSql
			if("*".equals(options.inputSqlPath))
			{
				inputContent = inSql;
			} else if (options.inputSqlPath.equals("-"))
			{
				inputContentBytes = IOUtils.toByteArray(System.in);
				inputContent = new String(inputContentBytes, Charset.forName("UTF-8"));
			} else
			{
				inputContentBytes = Files.readAllBytes(Paths.get(options.inputSqlPath));
				inputContent = new String(inputContentBytes, Charset.forName("UTF-8"));
			}			
			logger.debug("inputContent=" + inputContent);
			//[4] [inSql string] -Lexer- [Token] -Parser- [ParserTree]
			parseResult = AstParser.parseTreeFromString(inputContent, false, options.tree_type);
		} else if (options.inputXmlPath != null)
		{
			byte[] inputContentBytes;
			if (options.inputXmlPath.equals("-"))
			{
				inputContentBytes = IOUtils.toByteArray(System.in);
			} else
			{
				inputContentBytes = Files.readAllBytes(Paths.get(options.inputXmlPath));
			}
			String inputContent = new String(inputContentBytes, Charset.forName("UTF-8"));
			parseResult = AstXml.xmlToAst(AstXml.stringToXml(inputContent));
		} else if (options.inputSerialiedPath != null)
		{
			try (FileInputStream stream = new FileInputStream(options.inputSerialiedPath))
			{
				parseResult = AstSerializer.deserializeAst(stream);
			}
		} else
		{
			throw new Exception("No --input-sql or --input-xml or --input-serialized specified");
			//System.exit(1);
		}
		System.err.printf("Parse took %f seconds\n", (System.currentTimeMillis() - parseStartTime) / 1000.0);

		if (parseResult.lexerErrors.size() > 0 || parseResult.parserErrors.size() > 0)
		{
			if (parseResult.lexerErrors.size() > 0) 
			{
				throw new Exception(parseResult.lexerErrors.get(0));
			}
			if (parseResult.parserErrors.size() > 0) 
			{
				throw new Exception(parseResult.parserErrors.get(0));
			}			
			//System.exit(1);
		}
		logger.debug("Return");
		return parseResult;
	}

	static class StatementTypeAndName
	{
		public String name;
		public String type;
	}

	static int counter = 0;

	private static StatementTypeAndName getStatementTypeAndName(unit_statement statement)
	{
		StatementTypeAndName result = new StatementTypeAndName();
		if (statement instanceof create_function_body)
		{
			create_function_body b = (create_function_body) statement;
			result.name = b.function_name.ids.get(b.function_name.ids.size() - 1).value;
			result.type = "func";
		} else if (statement instanceof create_procedure_body)
		{
			create_procedure_body b = (create_procedure_body) statement;
			result.name = b.procedure_name.ids.get(b.procedure_name.ids.size() - 1).value;
			result.type = "proc";
		} else if (statement instanceof create_package_spec)
		{
			create_package_spec p = (create_package_spec) statement;
			result.name = p.package_name.ids.get(p.package_name.ids.size() - 1).value;
			result.type = "pkgspec";
		} else if (statement instanceof create_package_body)
		{
			create_package_body p = (create_package_body) statement;
			result.name = p.package_name.ids.get(p.package_name.ids.size() - 1).value;
			result.type = "pkgbody";
		} else if (statement instanceof create_sequence)
		{
			result.name = "seq" + (++counter);
			result.type = "seq";
		} else if (statement instanceof create_trigger)
		{
			result.name = "trigger" + (++counter);
			result.type = "trigger";
		} else if (statement instanceof create_type)
		{
			result.name = "type" + (++counter);
			result.type = "type";
		} else
		{
			result.name = "other" + (++counter);
			result.type = "other";
		}
		result.name = AstUtil.normalizeId(result.name).toLowerCase();
		return result;
	}

	private static void parseByParts(String path, boolean validateReparse, Integer limit) throws Exception
	{
		logger.debug("Enter:path=" + path + ", validateReparse=" + validateReparse + ", limit=" + limit);
		
		logger.debug("in sql file path: " + (new File(path)).getAbsolutePath());
		byte[] contentBytes = Files.readAllBytes(Paths.get(path));
		String contentString = new String(contentBytes, Charset.forName("UTF-8"));
		logger.debug("in sql: " + contentString);
		
		//閻忓繐妫滈崜濂稿嫉椤掞拷閸炲锟藉湱顢婅闁哄鍔掔拹鐔烘嫚椤撶偛缍栭柣銊ュ閺嗙喓绱掗崟鈺嬫嫹閿燂拷
		List<String> parts = splitContent(contentString);
		
		List<String> parseFailures = new ArrayList<String>();
		List<String> parseFailureBodies = new ArrayList<String>();
		List<String> printFailures = new ArrayList<String>();
		List<String> printFailureBodies = new ArrayList<String>();
		List<String> reparseFailures = new ArrayList<String>();
		List<String> reparseFailureBodies = new ArrayList<String>();
		List<String> successes = new ArrayList<String>();
		TokenCounter ctr = new TokenCounter();
		long ms_start_all = System.currentTimeMillis();
		int partIdx = 0;
		//part闁哄嫷鍨粩瀛樼▔椤忓嫮鏆氶柡浣割嚟濞堟垹鎷犻鐐茬稏
		for (String part : parts)
		{
			if (limit != null && partIdx >= limit)
			{
				break;
			}
			String header = part.substring(0, part.indexOf('\n'));
			System.out.print(header);

			long ms_start_1 = System.currentTimeMillis();
			//婵烇絽宕�瑰磭鎲撮敐鍡欙拷鑺ョ▔閿熻姤绋夐鍥跺殧闁告瑣鍎冲▓鎴﹀触閸曨亪鍤嬮柛妤佹礉閻︽繈宕仦鎯х瑩闁告帗顨呯粩椋庝沪閿燂拷
			ParseResult parseResult = AstParser.parseTreeFromString(part, false, "sql_script");
			String printedTree = "";
			long ms_end_1 = System.currentTimeMillis();
			System.out.printf(" %f s\n", (ms_end_1 - ms_start_1) / 1000.0);
			boolean failure = parseResult.lexerErrors.size() > 0 || parseResult.parserErrors.size() > 0;
			if (failure)
			{
				System.out.println("PARSE FAIL");
				parseFailures.add(header);
				parseFailureBodies.add(part);
			} else
			{
				ctr.addTree(parseResult.tree);

				boolean is_tree_walked;
				try
				{
					PrintResult printResult = AstPrinter.printTreeToOracleString(parseResult.tree, "sql_script");
					if (printResult.printErrors.size() > 0)
					{
						is_tree_walked = false;
					} else
					{
						printedTree = printResult.text;
						is_tree_walked = true;
					}
				} catch (Exception ex)
				{
					is_tree_walked = false;
					ex.printStackTrace();
				}
				if (is_tree_walked)
				{
					String compareResult = null;
					if (validateReparse)
					{
						compareResult = validatePrintedTreeMatchesParsedTree(parseResult.tree, "sql_script");
					}
					if (compareResult != null)
					{
						System.out.printf("Print&Reparse failed: %s\n", compareResult);
						reparseFailures.add(header);
						reparseFailureBodies.add(part);
					} else
					{
						successes.add(header);
					}
				} else
				{
					System.out.println("PRINT FAIL");
					printFailures.add(header);
					printFailureBodies.add(part);
				}
			}

			org.antlr.runtime.tree.Tree tree = parseResult.tree;
			String str;
			str = AstPrinter.prettyPrint(tree);

			String name = tryGuessPackageName(tree);
			if (name == null)
			{
				name = "unguessed";
			}

			try (PrintStream out = new PrintStream(
					new FileOutputStream(String.format("workdir/parsetrees/%d_%s_input.txt", partIdx, name))))
			{
				out.print(part);
			}

			try (PrintStream out = new PrintStream(new FileOutputStream(
					String.format("workdir/parsetrees/%d_%s_%s.txt", partIdx, name, failure ? "failure" : "success"))))
			{
				out.print(str);
			}

			try (PrintStream out = new PrintStream(
					new FileOutputStream(String.format("workdir/parsetrees/%d_%s_printed.txt", partIdx, name))))
			{
				out.print(printedTree);
			}

			++partIdx;
		}
		long ms_end_all = System.currentTimeMillis();
		System.out.printf("Total time: %f s\n", (ms_end_all - ms_start_all) / 1000.0);

		System.out.printf("%d succeeded, %d parse failed, %d print failed, %d reparse failed\n", successes.size(),
				parseFailures.size(), printFailures.size(), reparseFailures.size());
		int idx = 0;
		System.out.println("Parse failures:");
		for (int i = 0; i < parseFailures.size(); ++i)
		{
			System.out.printf("%d %s\n", idx, parseFailures.get(i));

			try (PrintStream out = new PrintStream(new FileOutputStream(String.format("workdir/failure%d.txt", idx))))
			{
				out.print(parseFailureBodies.get(i));
			}
			++idx;
		}
		System.out.println("Print failures:");
		for (int i = 0; i < printFailures.size(); ++i)
		{
			System.out.printf("%d %s\n", idx, printFailures.get(i));

			try (PrintStream out = new PrintStream(new FileOutputStream(String.format("workdir/failure%d.txt", idx))))
			{
				out.print(printFailureBodies.get(i));
			}
			++idx;
		}
		System.out.println("Reparse failures:");
		for (int i = 0; i < reparseFailures.size(); ++i)
		{
			System.out.printf("%d %s\n", idx, reparseFailures.get(i));

			try (PrintStream out = new PrintStream(new FileOutputStream(String.format("workdir/failure%d.txt", idx))))
			{
				out.print(reparseFailureBodies.get(i));
			}
			++idx;
		}
		if (limit == null)
		{
			try (PrintStream out = new PrintStream(new FileOutputStream("workdir/token_stats.txt")))
			{
				printTokenStats(ctr.getOccurences(), out);
			}
		}
	}

	private static String tryGuessPackageName(Tree tree)
	{
		if (tree.getType() == PLSQLParser.SQL_SCRIPT)
		{
			tree = tree.getChild(0);
		}
		if (tree.getType() == PLSQLParser.CREATE_PACKAGE_SPEC || tree.getType() == PLSQLParser.CREATE_PACKAGE_BODY)
		{
			for (int i = 0; i < tree.getChildCount(); ++i)
			{
				Tree childNode = tree.getChild(i);
				if (childNode.getType() == PLSQLParser.PACKAGE_NAME)
				{
					Tree nameNode = childNode.getChild(childNode.getChildCount() - 1);
					if (nameNode.getType() == PLSQLParser.ID)
					{
						String maybeQuotedName = nameNode.getText();
						if (maybeQuotedName.charAt(0) == '\"')
						{
							maybeQuotedName = maybeQuotedName.substring(1, maybeQuotedName.length() - 1);
						}
						if (tree.getType() == PLSQLParser.CREATE_PACKAGE_SPEC)
						{
							maybeQuotedName += "_spec";
						}
						return maybeQuotedName;
					}
				}
			}
		}
		return null;
	}

	//濠碘�冲�归悘澶愬嫉婢跺妯嬪☉鎾跺reate閻犲浂鍘艰ぐ鐐烘晬鐏炶棄鐏熼柟璺猴龚閸撳ジ寮甸鑳幀闁汇劌鍨籸eate閻犲浂鍘艰ぐ鐐哄礆閸℃纾婚柡锟介幆褍鐓傞柡浣瑰缁秵绋夐敓锟�
	private static List<String> splitContent(String contentString)
	{
		ArrayList<String> result = new ArrayList<String>();
		String pattern = "CREATE OR REPLACE";
		int idx = contentString.indexOf(pattern);
		while (idx < contentString.length() && idx >= 0)
		{
			int next = contentString.indexOf(pattern, idx + pattern.length());
			if (next == -1)
			{
				next = contentString.length();
			}
			String item = contentString.substring(idx, next);
			result.add(item);
			idx = next;
		}
		return result;
	}

	private static void printTokenStats(final Map<Integer, Integer> occurences, PrintStream out)
	{
		List<Integer> keys = new ArrayList<Integer>(occurences.keySet());
		Collections.sort(keys, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return occurences.get(o2) - occurences.get(o1);
			}
		});
		for (int key : keys)
		{
			out.printf("%s -> %d\n", AstUtil.tokenNames[key], occurences.get(key));
		}
	}

	private static String validatePrintedTreeMatchesParsedTree(Tree tree, String treeType) throws Exception
	{
		return validatePrintedTreeMatchesParsedTree(tree, null, treeType);
	}

	private static String validatePrintedTreeMatchesParsedTree(Tree tree, String reprintedTreeDestination,
			String treeType) throws Exception
	{
		PrintResult printResult = AstPrinter.printTreeToOracleString(tree, treeType);
		if (printResult.printErrors.size() > 0)
		{
			return "Printer errors";
		}
		if (printResult.text.contains("not implemented: "))
		{
			return "Printed text contains 'not implemented: '";
		}
		ParseResult reparseResult = AstParser.parseTreeFromString(printResult.text, false, treeType);
		if (reparseResult.lexerErrors.size() > 0)
		{
			return "Lexer errors (on printed tree)";
		}
		if (reparseResult.parserErrors.size() > 0)
		{
			return "Parser errors (on printed tree)";
		}
		PrintResult reprintResult = AstPrinter.printTreeToOracleString(reparseResult.tree, treeType);
		if (reprintedTreeDestination != null)
		{
			if (reprintedTreeDestination.equals("-"))
			{
				System.out.println(reprintResult.text);
			} else
			{
				try (PrintStream out = new PrintStream(new FileOutputStream(reprintedTreeDestination)))
				{
					out.println(reprintResult.text);
				}
			}
		}
		if (reprintResult.printErrors.size() > 0)
		{
			return "Printer errors (on printed tree)";
		}

		String text1 = printResult.text.replace("\r\n", "\n").replace("\r", "\n").replace(" ", "").replace("\t", "");
		String text2 = reprintResult.text.replace("\r\n", "\n").replace("\r", "\n").replace(" ", "").replace("\t", "");
		if (!text1.equals(text2))
		{
			TextPos mismatchPos = getStringMismatchIndex(text1, text2);
			Character c1 = mismatchPos.index < text1.length() ? text1.charAt(mismatchPos.index) : null;
			Character c2 = mismatchPos.index < text2.length() ? text2.charAt(mismatchPos.index) : null;
			return String.format("Texts mismatch at: '%s' <> '%s'", mismatchPos.line, mismatchPos.col, c1, c2);
		}
		Tree[] mismatchedTrees = getMismatchedTreeNodes(tree, reparseResult.tree);
		if (mismatchedTrees == null)
		{
			return null;
		}

		String token1Description = getTreeNodeDescription(mismatchedTrees[0]);
		String token2Description = getTreeNodeDescription(mismatchedTrees[1]);

		String result = String.format("Mismatch: %s <> %s", token1Description, token2Description);

		return result;
	}

	static class TextPos
	{
		public int line;
		public int col;
		public int index;
	}

	private static TextPos getStringMismatchIndex(String s1, String s2)
	{
		int n = Math.max(s1.length(), s2.length());
		int line = 1;
		int col = 1;
		for (int i = 0; i < n; ++i)
		{
			if (i >= s1.length() || i >= s2.length() || s1.charAt(i) != s2.charAt(i))
			{
				TextPos result = new TextPos();
				result.line = line;
				result.col = col;
				result.index = i;
				return result;
			}
			if (s1.charAt(i) == '\n')
			{
				++line;
				col = 1;
			} else
			{
				++col;
			}
		}
		return null;
	}

	private static String getTreeNodeDescription(Tree tree)
	{
		if (tree == null)
		{
			return "<missing>";
		}
		String result = String.format("%s '%s' at %d:%d", AstUtil.tokenNames[tree.getType()], tree.getText(),
				tree.getLine(), tree.getCharPositionInLine());
		return result;
	}

	private static Tree[] getMismatchedTreeNodes(Tree t1, Tree t2)
	{
		if (t1.getType() != t2.getType())
		{
			return new Tree[] { t1, t2 };
		}
		if (t1.getType() == PLSQLParser.ID)
		{
			if (!t1.getText().equals(t2.getText()))
			{
				return new Tree[] { t1, t2 };
			}
		}
		int n = Math.max(t1.getChildCount(), t2.getChildCount());
		for (int i = 0; i < n; ++i)
		{
			Tree child1 = i < t1.getChildCount() ? t1.getChild(i) : null;
			Tree child2 = i < t2.getChildCount() ? t2.getChild(i) : null;
			if (child1 == null || child2 == null)
			{
				return new Tree[] { child1, child2 };
			}
			Tree[] childResult = getMismatchedTreeNodes(child1, child2);
			if (childResult != null)
			{
				return childResult;
			}
		}
		return null;
	}
}
