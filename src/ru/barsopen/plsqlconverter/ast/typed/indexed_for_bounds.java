package ru.barsopen.plsqlconverter.ast.typed;
public class indexed_for_bounds implements _baseNode {
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

  public expression b1 = null;
  public expression get_b1() { return this.b1; }
  public void set_b1(expression value) {
    if (this.b1 != null) { this.b1._setParent(null); }
    this.b1 = value;
    if (this.b1 != null) { this.b1._setParent(this); }
  }
  public expression b2 = null;
  public expression get_b2() { return this.b2; }
  public void set_b2(expression value) {
    if (this.b2 != null) { this.b2._setParent(null); }
    this.b2 = value;
    if (this.b2 != null) { this.b2._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.b1 != null) {
      this.b1._walk(visitor);
    }
    if (this.b2 != null) {
      this.b2._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.b1 != null) {
      result.add(this.b1);
    }
    if (this.b2 != null) {
      result.add(this.b2);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.b1 == child) {
      this.set_b1((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    if (this.b2 == child) {
      this.set_b2((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SIMPLE_BOUND);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SIMPLE_BOUND");
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
    if (b1 == null) { throw new RuntimeException(); }
    _result.addChild(b1.unparse());


    if (b2 == null) { throw new RuntimeException(); }
    _result.addChild(b2.unparse());


    return _result;
  }

}
