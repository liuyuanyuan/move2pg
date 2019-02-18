package ru.barsopen.plsqlconverter.ast.typed;
public class indexed_for implements cursor_loop_param, _baseNode {
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
  public org.antlr.runtime.tree.Tree REVERSE_VK = null;
  public org.antlr.runtime.tree.Tree get_REVERSE_VK() { return this.REVERSE_VK; }
  public void set_REVERSE_VK(org.antlr.runtime.tree.Tree value) {
    this.REVERSE_VK = value;
  }
  public boolean is_REVERSE_VK() { return this.REVERSE_VK != null; }
  public indexed_for_bounds indexed_for_bounds = null;
  public indexed_for_bounds get_indexed_for_bounds() { return this.indexed_for_bounds; }
  public void set_indexed_for_bounds(indexed_for_bounds value) {
    if (this.indexed_for_bounds != null) { this.indexed_for_bounds._setParent(null); }
    this.indexed_for_bounds = value;
    if (this.indexed_for_bounds != null) { this.indexed_for_bounds._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.index_name != null) {
      this.index_name._walk(visitor);
    }
    if (this.REVERSE_VK != null) {
      visitor.visit(this.REVERSE_VK);
    }
    if (this.indexed_for_bounds != null) {
      this.indexed_for_bounds._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.index_name != null) {
      result.add(this.index_name);
    }
    if (this.indexed_for_bounds != null) {
      result.add(this.indexed_for_bounds);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.index_name == child) {
      this.set_index_name((ru.barsopen.plsqlconverter.ast.typed.index_name)replacement);
      return;
    }
    if (this.indexed_for_bounds == child) {
      this.set_indexed_for_bounds((ru.barsopen.plsqlconverter.ast.typed.indexed_for_bounds)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.INDEXED_FOR);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("INDEXED_FOR");
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


    if (REVERSE_VK != null) {
      _result.addChild(REVERSE_VK);
    }


    if (indexed_for_bounds == null) { throw new RuntimeException(); }
    _result.addChild(indexed_for_bounds.unparse());


    return _result;
  }

}
