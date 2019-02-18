package ru.barsopen.plsqlconverter.ast.typed;
public class factoring_element implements _baseNode {
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

  public query_name query_name = null;
  public query_name get_query_name() { return this.query_name; }
  public void set_query_name(query_name value) {
    if (this.query_name != null) { this.query_name._setParent(null); }
    this.query_name = value;
    if (this.query_name != null) { this.query_name._setParent(this); }
  }
  public java.util.List<column_name> column_names = new java.util.ArrayList<column_name>();
  public java.util.List<column_name> get_column_names() { return this.column_names; }
  public void add_column_names(column_name value) {
    insert_column_names(column_names.size(), value);
  }
  public void insert_column_names(int pos, column_name value) {
    this.column_names.add(pos, value);
    value._setParent(this);
  }
  public void remove_column_names(int pos) {
    this.column_names.get(pos)._setParent(null);
    this.column_names.remove(pos);
  }
  public void remove_column_names(column_name value) {
    this.remove_column_names(this.column_names.indexOf(value));
  }
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

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.query_name != null) {
      this.query_name._walk(visitor);
    }
    for (column_name _value: this.column_names) {
      _value._walk(visitor);
    }
    if (this.subquery != null) {
      this.subquery._walk(visitor);
    }
    if (this.order_by_clause != null) {
      this.order_by_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.query_name != null) {
      result.add(this.query_name);
    }
    result.addAll(this.column_names);
    if (this.subquery != null) {
      result.add(this.subquery);
    }
    if (this.order_by_clause != null) {
      result.add(this.order_by_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.query_name == child) {
      this.set_query_name((ru.barsopen.plsqlconverter.ast.typed.query_name)replacement);
      return;
    }
    for (int _i = 0; _i < this.column_names.size(); ++_i) {
      if (this.column_names.get(_i) == child) {
        this.remove_column_names(_i);
        this.insert_column_names(_i, (ru.barsopen.plsqlconverter.ast.typed.column_name)replacement);
        return;
      }
    }
    if (this.subquery == child) {
      this.set_subquery((ru.barsopen.plsqlconverter.ast.typed.subquery)replacement);
      return;
    }
    if (this.order_by_clause == child) {
      this.set_order_by_clause((ru.barsopen.plsqlconverter.ast.typed.order_by_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.FACTORING);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("FACTORING");
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
    if (query_name == null) { throw new RuntimeException(); }
    _result.addChild(query_name.unparse());


    for (int i = 0; i < column_names.size(); ++i) {
      _result.addChild(column_names.get(i).unparse());
    }


    if (subquery == null) { throw new RuntimeException(); }
    _result.addChild(subquery.unparse());


    if (order_by_clause != null) {
      _result.addChild(order_by_clause.unparse());
    }


    return _result;
  }

}
