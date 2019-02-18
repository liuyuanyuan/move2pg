package ru.barsopen.plsqlconverter.ast.typed;
public class forall_statement implements statement, _baseNode {
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

  public index_name index_name = null;
  public index_name get_index_name() { return this.index_name; }
  public void set_index_name(index_name value) {
    if (this.index_name != null) { this.index_name._setParent(null); }
    this.index_name = value;
    if (this.index_name != null) { this.index_name._setParent(this); }
  }
  public bounds_clause bounds_clause = null;
  public bounds_clause get_bounds_clause() { return this.bounds_clause; }
  public void set_bounds_clause(bounds_clause value) {
    if (this.bounds_clause != null) { this.bounds_clause._setParent(null); }
    this.bounds_clause = value;
    if (this.bounds_clause != null) { this.bounds_clause._setParent(this); }
  }
  public sql_statement sql_statement = null;
  public sql_statement get_sql_statement() { return this.sql_statement; }
  public void set_sql_statement(sql_statement value) {
    if (this.sql_statement != null) { this.sql_statement._setParent(null); }
    this.sql_statement = value;
    if (this.sql_statement != null) { this.sql_statement._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree EXCEPTIONS_VK = null;
  public org.antlr.runtime.tree.Tree get_EXCEPTIONS_VK() { return this.EXCEPTIONS_VK; }
  public void set_EXCEPTIONS_VK(org.antlr.runtime.tree.Tree value) {
    this.EXCEPTIONS_VK = value;
  }
  public boolean is_EXCEPTIONS_VK() { return this.EXCEPTIONS_VK != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.index_name != null) {
      this.index_name._walk(visitor);
    }
    if (this.bounds_clause != null) {
      this.bounds_clause._walk(visitor);
    }
    if (this.sql_statement != null) {
      this.sql_statement._walk(visitor);
    }
    if (this.EXCEPTIONS_VK != null) {
      visitor.visit(this.EXCEPTIONS_VK);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.index_name != null) {
      result.add(this.index_name);
    }
    if (this.bounds_clause != null) {
      result.add(this.bounds_clause);
    }
    if (this.sql_statement != null) {
      result.add(this.sql_statement);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.index_name == child) {
      this.set_index_name((ru.barsopen.plsqlconverter.ast.typed.index_name)replacement);
      return;
    }
    if (this.bounds_clause == child) {
      this.set_bounds_clause((ru.barsopen.plsqlconverter.ast.typed.bounds_clause)replacement);
      return;
    }
    if (this.sql_statement == child) {
      this.set_sql_statement((ru.barsopen.plsqlconverter.ast.typed.sql_statement)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.FORALL_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("FORALL_VK");
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
    if (index_name == null) { throw new RuntimeException(); }
    _result.addChild(index_name.unparse());


    if (bounds_clause == null) { throw new RuntimeException(); }
    _result.addChild(bounds_clause.unparse());


    if (sql_statement == null) { throw new RuntimeException(); }
    _result.addChild(sql_statement.unparse());


    if (EXCEPTIONS_VK != null) {
      _result.addChild(EXCEPTIONS_VK);
    }


    return _result;
  }

}
