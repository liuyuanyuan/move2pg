package ru.barsopen.plsqlconverter.ast.typed;
public class expression_element_like4 implements expression_element, _baseNode {
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

  public expression_element text = null;
  public expression_element get_text() { return this.text; }
  public void set_text(expression_element value) {
    if (this.text != null) { this.text._setParent(null); }
    this.text = value;
    if (this.text != null) { this.text._setParent(this); }
  }
  public expression_element pattern = null;
  public expression_element get_pattern() { return this.pattern; }
  public void set_pattern(expression_element value) {
    if (this.pattern != null) { this.pattern._setParent(null); }
    this.pattern = value;
    if (this.pattern != null) { this.pattern._setParent(this); }
  }
  public expression_element escape = null;
  public expression_element get_escape() { return this.escape; }
  public void set_escape(expression_element value) {
    if (this.escape != null) { this.escape._setParent(null); }
    this.escape = value;
    if (this.escape != null) { this.escape._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.text != null) {
      this.text._walk(visitor);
    }
    if (this.pattern != null) {
      this.pattern._walk(visitor);
    }
    if (this.escape != null) {
      this.escape._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.text != null) {
      result.add(this.text);
    }
    if (this.pattern != null) {
      result.add(this.pattern);
    }
    if (this.escape != null) {
      result.add(this.escape);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.text == child) {
      this.set_text((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    if (this.pattern == child) {
      this.set_pattern((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    if (this.escape == child) {
      this.set_escape((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.LIKE4_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("LIKE4_VK");
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
    if (text == null) { throw new RuntimeException(); }
    _result.addChild(text.unparse());


    if (pattern == null) { throw new RuntimeException(); }
    _result.addChild(pattern.unparse());


    if (escape != null) {
      _result.addChild(escape.unparse());
    }


    return _result;
  }

}
