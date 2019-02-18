package ru.barsopen.plsqlconverter.ast.typed;
public class merge_insert_clause implements _baseNode {
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

  public insert_into_clause_columns insert_into_clause_columns = null;
  public insert_into_clause_columns get_insert_into_clause_columns() { return this.insert_into_clause_columns; }
  public void set_insert_into_clause_columns(insert_into_clause_columns value) {
    if (this.insert_into_clause_columns != null) { this.insert_into_clause_columns._setParent(null); }
    this.insert_into_clause_columns = value;
    if (this.insert_into_clause_columns != null) { this.insert_into_clause_columns._setParent(this); }
  }
  public expression_list expression_list = null;
  public expression_list get_expression_list() { return this.expression_list; }
  public void set_expression_list(expression_list value) {
    if (this.expression_list != null) { this.expression_list._setParent(null); }
    this.expression_list = value;
    if (this.expression_list != null) { this.expression_list._setParent(this); }
  }
  public where_clause where_clause = null;
  public where_clause get_where_clause() { return this.where_clause; }
  public void set_where_clause(where_clause value) {
    if (this.where_clause != null) { this.where_clause._setParent(null); }
    this.where_clause = value;
    if (this.where_clause != null) { this.where_clause._setParent(this); }
  }
  public boolean is_where_clause() { return this.where_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.insert_into_clause_columns != null) {
      this.insert_into_clause_columns._walk(visitor);
    }
    if (this.expression_list != null) {
      this.expression_list._walk(visitor);
    }
    if (this.where_clause != null) {
      this.where_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.insert_into_clause_columns != null) {
      result.add(this.insert_into_clause_columns);
    }
    if (this.expression_list != null) {
      result.add(this.expression_list);
    }
    if (this.where_clause != null) {
      result.add(this.where_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.insert_into_clause_columns == child) {
      this.set_insert_into_clause_columns((ru.barsopen.plsqlconverter.ast.typed.insert_into_clause_columns)replacement);
      return;
    }
    if (this.expression_list == child) {
      this.set_expression_list((ru.barsopen.plsqlconverter.ast.typed.expression_list)replacement);
      return;
    }
    if (this.where_clause == child) {
      this.set_where_clause((ru.barsopen.plsqlconverter.ast.typed.where_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.MERGE_INSERT);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("MERGE_INSERT");
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
    if (insert_into_clause_columns == null) { throw new RuntimeException(); }
    _result.addChild(insert_into_clause_columns.unparse());


    if (expression_list == null) { throw new RuntimeException(); }
    _result.addChild(expression_list.unparse());


    if (where_clause != null) {
      _result.addChild(where_clause.unparse());
    }


    return _result;
  }

}
