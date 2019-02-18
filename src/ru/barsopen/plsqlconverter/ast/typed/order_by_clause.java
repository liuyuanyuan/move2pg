package ru.barsopen.plsqlconverter.ast.typed;
public class order_by_clause implements _baseNode {
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

  public org.antlr.runtime.tree.Tree SIBLINGS_VK = null;
  public org.antlr.runtime.tree.Tree get_SIBLINGS_VK() { return this.SIBLINGS_VK; }
  public void set_SIBLINGS_VK(org.antlr.runtime.tree.Tree value) {
    this.SIBLINGS_VK = value;
  }
  public boolean is_SIBLINGS_VK() { return this.SIBLINGS_VK != null; }
  public order_by_elements_list order_by_elements_list = null;
  public order_by_elements_list get_order_by_elements_list() { return this.order_by_elements_list; }
  public void set_order_by_elements_list(order_by_elements_list value) {
    if (this.order_by_elements_list != null) { this.order_by_elements_list._setParent(null); }
    this.order_by_elements_list = value;
    if (this.order_by_elements_list != null) { this.order_by_elements_list._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.SIBLINGS_VK != null) {
      visitor.visit(this.SIBLINGS_VK);
    }
    if (this.order_by_elements_list != null) {
      this.order_by_elements_list._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.order_by_elements_list != null) {
      result.add(this.order_by_elements_list);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.order_by_elements_list == child) {
      this.set_order_by_elements_list((ru.barsopen.plsqlconverter.ast.typed.order_by_elements_list)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL92_RESERVED_ORDER);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_ORDER");
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
    if (SIBLINGS_VK != null) {
      _result.addChild(SIBLINGS_VK);
    }


    if (order_by_elements_list == null) { throw new RuntimeException(); }
    _result.addChild(order_by_elements_list.unparse());


    return _result;
  }

}
