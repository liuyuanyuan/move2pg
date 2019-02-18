package ru.barsopen.plsqlconverter.ast.typed;
public class alter_function implements unit_statement, _baseNode {
  public int _line = -1;
  public int _col = -1;
  public int _tokenStartIndex = -1;
  public int _tokenStopIndex = -1;
  public _baseNode _parent = null;
  public _baseNode _getParent() { return _parent; }
  public void _setParent(_baseNode value) { _parent = value; }
  public void _setBaseNode(_baseNode value) { this._parent = value; }
  public int _getLine() { return _line; }
  public int _getCol() { return _col; }
  public int _getTokenStartIndex() { return _tokenStartIndex; }
  public int _getTokenStopIndex() { return _tokenStopIndex; }
ru.barsopen.plsqlconverter.util.AttachedComments _comments;
public void setComments(ru.barsopen.plsqlconverter.util.AttachedComments comments) { this._comments = comments; }
public ru.barsopen.plsqlconverter.util.AttachedComments getAttachedComments() { return this._comments; }
public void _setCol(int col) { this._col = col; }
public void _setLine(int line) { this._line = line; }

  public function_name function_name = null;
  public function_name get_function_name() { return this.function_name; }
  public void set_function_name(function_name value) {
    if (this.function_name != null) { this.function_name._setParent(null); }
    this.function_name = value;
    if (this.function_name != null) { this.function_name._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree DEBUG_VK = null;
  public org.antlr.runtime.tree.Tree get_DEBUG_VK() { return this.DEBUG_VK; }
  public void set_DEBUG_VK(org.antlr.runtime.tree.Tree value) {
    this.DEBUG_VK = value;
  }
  public boolean is_DEBUG_VK() { return this.DEBUG_VK != null; }
  public org.antlr.runtime.tree.Tree REUSE_VK = null;
  public org.antlr.runtime.tree.Tree get_REUSE_VK() { return this.REUSE_VK; }
  public void set_REUSE_VK(org.antlr.runtime.tree.Tree value) {
    this.REUSE_VK = value;
  }
  public boolean is_REUSE_VK() { return this.REUSE_VK != null; }
  public java.util.List<compiler_parameters_clause> compiler_parameters_clauses = new java.util.ArrayList<compiler_parameters_clause>();
  public java.util.List<compiler_parameters_clause> get_compiler_parameters_clauses() { return this.compiler_parameters_clauses; }
  public void add_compiler_parameters_clauses(compiler_parameters_clause value) {
    insert_compiler_parameters_clauses(compiler_parameters_clauses.size(), value);
  }
  public void insert_compiler_parameters_clauses(int pos, compiler_parameters_clause value) {
    this.compiler_parameters_clauses.add(pos, value);
    value._setParent(this);
  }
  public void remove_compiler_parameters_clauses(int pos) {
    this.compiler_parameters_clauses.get(pos)._setParent(null);
    this.compiler_parameters_clauses.remove(pos);
  }
  public void remove_compiler_parameters_clauses(compiler_parameters_clause value) {
    this.remove_compiler_parameters_clauses(this.compiler_parameters_clauses.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.function_name != null) {
      this.function_name._walk(visitor);
    }
    if (this.DEBUG_VK != null) {
      visitor.visit(this.DEBUG_VK);
    }
    if (this.REUSE_VK != null) {
      visitor.visit(this.REUSE_VK);
    }
    for (compiler_parameters_clause _value: this.compiler_parameters_clauses) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.function_name != null) {
      result.add(this.function_name);
    }
    result.addAll(this.compiler_parameters_clauses);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.function_name == child) {
      this.set_function_name((ru.barsopen.plsqlconverter.ast.typed.function_name)replacement);
      return;
    }
    for (int _i = 0; _i < this.compiler_parameters_clauses.size(); ++_i) {
      if (this.compiler_parameters_clauses.get(_i) == child) {
        this.remove_compiler_parameters_clauses(_i);
        this.insert_compiler_parameters_clauses(_i, (ru.barsopen.plsqlconverter.ast.typed.compiler_parameters_clause)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.ALTER_FUNCTION);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("ALTER_FUNCTION");
    org.antlr.runtime.tree.CommonTree _result = new org.antlr.runtime.tree.CommonTree(_token);

if (_comments != null) {
  org.antlr.runtime.tree.CommonTree commentsNode = new org.antlr.runtime.tree.CommonTree(
    new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.COMMENT));
  org.antlr.runtime.tree.CommonTree commentsBeforeNode = new org.antlr.runtime.tree.CommonTree(
    new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.COMMENT, _comments.getBefore()));
  org.antlr.runtime.tree.CommonTree commentsAfterNode = new org.antlr.runtime.tree.CommonTree(
    new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.COMMENT, _comments.getAfter()));
  org.antlr.runtime.tree.CommonTree commentsInsideNode = new org.antlr.runtime.tree.CommonTree(
    new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.COMMENT, _comments.getInside()));
  commentsNode.addChild(commentsBeforeNode);
  commentsNode.addChild(commentsInsideNode);
  commentsNode.addChild(commentsAfterNode);
  _result.addChild(commentsNode);
}

    _result.setTokenStartIndex(_tokenStartIndex);
    _result.setTokenStopIndex(_tokenStopIndex);
    if (function_name == null) { throw new RuntimeException(); }
    _result.addChild(function_name.unparse());


    if (DEBUG_VK != null) {
      _result.addChild(DEBUG_VK);
    }


    if (REUSE_VK != null) {
      _result.addChild(REUSE_VK);
    }


    for (int i = 0; i < compiler_parameters_clauses.size(); ++i) {
      _result.addChild(compiler_parameters_clauses.get(i).unparse());
    }


    return _result;
  }

}
