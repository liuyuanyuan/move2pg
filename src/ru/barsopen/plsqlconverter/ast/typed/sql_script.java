package ru.barsopen.plsqlconverter.ast.typed;
public class sql_script implements _baseNode {
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

  public java.util.List<sql_script_item> sql_script_items = new java.util.ArrayList<sql_script_item>();
  public java.util.List<sql_script_item> get_sql_script_items() { return this.sql_script_items; }
  public void add_sql_script_items(sql_script_item value) {
    insert_sql_script_items(sql_script_items.size(), value);
  }
  public void insert_sql_script_items(int pos, sql_script_item value) {
    this.sql_script_items.add(pos, value);
    value._setParent(this);
  }
  public void remove_sql_script_items(int pos) {
    this.sql_script_items.get(pos)._setParent(null);
    this.sql_script_items.remove(pos);
  }
  public void remove_sql_script_items(sql_script_item value) {
    this.remove_sql_script_items(this.sql_script_items.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (sql_script_item _value: this.sql_script_items) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.sql_script_items);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.sql_script_items.size(); ++_i) {
      if (this.sql_script_items.get(_i) == child) {
        this.remove_sql_script_items(_i);
        this.insert_sql_script_items(_i, (ru.barsopen.plsqlconverter.ast.typed.sql_script_item)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL_SCRIPT);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL_SCRIPT");
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
    if (sql_script_items.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < sql_script_items.size(); ++i) {
      _result.addChild(sql_script_items.get(i).unparse());
    }


    return _result;
  }

}
