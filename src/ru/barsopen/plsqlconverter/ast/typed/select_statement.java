package ru.barsopen.plsqlconverter.ast.typed;
public class select_statement implements data_manipulation_language_statements, selected_tableview_src, expression_or_select_statement, _baseNode {
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

  public subquery_factoring_clause subquery_factoring_clause = null;
  public subquery_factoring_clause get_subquery_factoring_clause() { return this.subquery_factoring_clause; }
  public void set_subquery_factoring_clause(subquery_factoring_clause value) {
    if (this.subquery_factoring_clause != null) { this.subquery_factoring_clause._setParent(null); }
    this.subquery_factoring_clause = value;
    if (this.subquery_factoring_clause != null) { this.subquery_factoring_clause._setParent(this); }
  }
  public boolean is_subquery_factoring_clause() { return this.subquery_factoring_clause != null; }
  public subquery subquery = null;
  public subquery get_subquery() { return this.subquery; }
  public void set_subquery(subquery value) {
    if (this.subquery != null) { this.subquery._setParent(null); }
    this.subquery = value;
    if (this.subquery != null) { this.subquery._setParent(this); }
  }
  public order_by_clause order_by_clause = null;
  public order_by_clause get_order_by_clause() { return this.order_by_clause; }
  public void set_order_by_clause(order_by_clause value) {
    if (this.order_by_clause != null) { this.order_by_clause._setParent(null); }
    this.order_by_clause = value;
    if (this.order_by_clause != null) { this.order_by_clause._setParent(this); }
  }
  public boolean is_order_by_clause() { return this.order_by_clause != null; }
  public for_update_clause for_update_clause = null;
  public for_update_clause get_for_update_clause() { return this.for_update_clause; }
  public void set_for_update_clause(for_update_clause value) {
    if (this.for_update_clause != null) { this.for_update_clause._setParent(null); }
    this.for_update_clause = value;
    if (this.for_update_clause != null) { this.for_update_clause._setParent(this); }
  }
  public boolean is_for_update_clause() { return this.for_update_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.subquery_factoring_clause != null) {
      this.subquery_factoring_clause._walk(visitor);
    }
    if (this.subquery != null) {
      this.subquery._walk(visitor);
    }
    if (this.order_by_clause != null) {
      this.order_by_clause._walk(visitor);
    }
    if (this.for_update_clause != null) {
      this.for_update_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.subquery_factoring_clause != null) {
      result.add(this.subquery_factoring_clause);
    }
    if (this.subquery != null) {
      result.add(this.subquery);
    }
    if (this.order_by_clause != null) {
      result.add(this.order_by_clause);
    }
    if (this.for_update_clause != null) {
      result.add(this.for_update_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.subquery_factoring_clause == child) {
      this.set_subquery_factoring_clause((ru.barsopen.plsqlconverter.ast.typed.subquery_factoring_clause)replacement);
      return;
    }
    if (this.subquery == child) {
      this.set_subquery((ru.barsopen.plsqlconverter.ast.typed.subquery)replacement);
      return;
    }
    if (this.order_by_clause == child) {
      this.set_order_by_clause((ru.barsopen.plsqlconverter.ast.typed.order_by_clause)replacement);
      return;
    }
    if (this.for_update_clause == child) {
      this.set_for_update_clause((ru.barsopen.plsqlconverter.ast.typed.for_update_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SELECT_STATEMENT);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SELECT_STATEMENT");
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
    if (subquery_factoring_clause != null) {
      _result.addChild(subquery_factoring_clause.unparse());
    }


    if (subquery == null) { throw new RuntimeException(); }
    _result.addChild(subquery.unparse());


    if (order_by_clause != null) {
      _result.addChild(order_by_clause.unparse());
    }


    if (for_update_clause != null) {
      _result.addChild(for_update_clause.unparse());
    }


    return _result;
  }

}
