package ru.barsopen.plsqlconverter.ast.typed;
public class select_mode implements table_expression_element, _baseNode {
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

  public select_statement select_statement = null;
  public select_statement get_select_statement() { return this.select_statement; }
  public void set_select_statement(select_statement value) {
    if (this.select_statement != null) { this.select_statement._setParent(null); }
    this.select_statement = value;
    if (this.select_statement != null) { this.select_statement._setParent(this); }
  }
  public subquery_restriction_clause subquery_restriction_clause = null;
  public subquery_restriction_clause get_subquery_restriction_clause() { return this.subquery_restriction_clause; }
  public void set_subquery_restriction_clause(subquery_restriction_clause value) {
    if (this.subquery_restriction_clause != null) { this.subquery_restriction_clause._setParent(null); }
    this.subquery_restriction_clause = value;
    if (this.subquery_restriction_clause != null) { this.subquery_restriction_clause._setParent(this); }
  }
  public boolean is_subquery_restriction_clause() { return this.subquery_restriction_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.select_statement != null) {
      this.select_statement._walk(visitor);
    }
    if (this.subquery_restriction_clause != null) {
      this.subquery_restriction_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.select_statement != null) {
      result.add(this.select_statement);
    }
    if (this.subquery_restriction_clause != null) {
      result.add(this.subquery_restriction_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.select_statement == child) {
      this.set_select_statement((ru.barsopen.plsqlconverter.ast.typed.select_statement)replacement);
      return;
    }
    if (this.subquery_restriction_clause == child) {
      this.set_subquery_restriction_clause((ru.barsopen.plsqlconverter.ast.typed.subquery_restriction_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SELECT_MODE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SELECT_MODE");
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
    if (select_statement == null) { throw new RuntimeException(); }
    _result.addChild(select_statement.unparse());


    if (subquery_restriction_clause != null) {
      _result.addChild(subquery_restriction_clause.unparse());
    }


    return _result;
  }

}
