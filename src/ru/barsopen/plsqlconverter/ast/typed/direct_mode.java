package ru.barsopen.plsqlconverter.ast.typed;
public class direct_mode implements table_expression_element, _baseNode {
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

  public tableview_name tableview_name = null;
  public tableview_name get_tableview_name() { return this.tableview_name; }
  public void set_tableview_name(tableview_name value) {
    if (this.tableview_name != null) { this.tableview_name._setParent(null); }
    this.tableview_name = value;
    if (this.tableview_name != null) { this.tableview_name._setParent(this); }
  }
  public sample_clause sample_clause = null;
  public sample_clause get_sample_clause() { return this.sample_clause; }
  public void set_sample_clause(sample_clause value) {
    if (this.sample_clause != null) { this.sample_clause._setParent(null); }
    this.sample_clause = value;
    if (this.sample_clause != null) { this.sample_clause._setParent(this); }
  }
  public boolean is_sample_clause() { return this.sample_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.tableview_name != null) {
      this.tableview_name._walk(visitor);
    }
    if (this.sample_clause != null) {
      this.sample_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.tableview_name != null) {
      result.add(this.tableview_name);
    }
    if (this.sample_clause != null) {
      result.add(this.sample_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.tableview_name == child) {
      this.set_tableview_name((ru.barsopen.plsqlconverter.ast.typed.tableview_name)replacement);
      return;
    }
    if (this.sample_clause == child) {
      this.set_sample_clause((ru.barsopen.plsqlconverter.ast.typed.sample_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.DIRECT_MODE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("DIRECT_MODE");
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
    if (tableview_name == null) { throw new RuntimeException(); }
    _result.addChild(tableview_name.unparse());


    if (sample_clause != null) {
      _result.addChild(sample_clause.unparse());
    }


    return _result;
  }

}
