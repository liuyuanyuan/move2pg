package ru.barsopen.plsqlconverter.ast.typed;
public class type_precision implements _baseNode {
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

  public constant size1 = null;
  public constant get_size1() { return this.size1; }
  public void set_size1(constant value) {
    if (this.size1 != null) { this.size1._setParent(null); }
    this.size1 = value;
    if (this.size1 != null) { this.size1._setParent(this); }
  }
  public constant size2 = null;
  public constant get_size2() { return this.size2; }
  public void set_size2(constant value) {
    if (this.size2 != null) { this.size2._setParent(null); }
    this.size2 = value;
    if (this.size2 != null) { this.size2._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree CHAR_VK = null;
  public org.antlr.runtime.tree.Tree get_CHAR_VK() { return this.CHAR_VK; }
  public void set_CHAR_VK(org.antlr.runtime.tree.Tree value) {
    this.CHAR_VK = value;
  }
  public boolean is_CHAR_VK() { return this.CHAR_VK != null; }
  public org.antlr.runtime.tree.Tree BYTE_VK = null;
  public org.antlr.runtime.tree.Tree get_BYTE_VK() { return this.BYTE_VK; }
  public void set_BYTE_VK(org.antlr.runtime.tree.Tree value) {
    this.BYTE_VK = value;
  }
  public boolean is_BYTE_VK() { return this.BYTE_VK != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.size1 != null) {
      this.size1._walk(visitor);
    }
    if (this.size2 != null) {
      this.size2._walk(visitor);
    }
    if (this.CHAR_VK != null) {
      visitor.visit(this.CHAR_VK);
    }
    if (this.BYTE_VK != null) {
      visitor.visit(this.BYTE_VK);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.size1 != null) {
      result.add(this.size1);
    }
    if (this.size2 != null) {
      result.add(this.size2);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.size1 == child) {
      this.set_size1((ru.barsopen.plsqlconverter.ast.typed.constant)replacement);
      return;
    }
    if (this.size2 == child) {
      this.set_size2((ru.barsopen.plsqlconverter.ast.typed.constant)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.PRECISION);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("PRECISION");
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
    if (size1 == null) { throw new RuntimeException(); }
    _result.addChild(size1.unparse());


    if (size2 != null) {
      _result.addChild(size2.unparse());
    }


    if (CHAR_VK != null) {
      _result.addChild(CHAR_VK);
    }


    if (BYTE_VK != null) {
      _result.addChild(BYTE_VK);
    }


    return _result;
  }

}
