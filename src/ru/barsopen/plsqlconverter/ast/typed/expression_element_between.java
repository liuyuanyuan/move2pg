package ru.barsopen.plsqlconverter.ast.typed;
public class expression_element_between implements expression_element, _baseNode {
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

  public expression_element arg = null;
  public expression_element get_arg() { return this.arg; }
  public void set_arg(expression_element value) {
    if (this.arg != null) { this.arg._setParent(null); }
    this.arg = value;
    if (this.arg != null) { this.arg._setParent(this); }
  }
  public expression_element expr_low = null;
  public expression_element get_expr_low() { return this.expr_low; }
  public void set_expr_low(expression_element value) {
    if (this.expr_low != null) { this.expr_low._setParent(null); }
    this.expr_low = value;
    if (this.expr_low != null) { this.expr_low._setParent(this); }
  }
  public expression_element expr_high = null;
  public expression_element get_expr_high() { return this.expr_high; }
  public void set_expr_high(expression_element value) {
    if (this.expr_high != null) { this.expr_high._setParent(null); }
    this.expr_high = value;
    if (this.expr_high != null) { this.expr_high._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.arg != null) {
      this.arg._walk(visitor);
    }
    if (this.expr_low != null) {
      this.expr_low._walk(visitor);
    }
    if (this.expr_high != null) {
      this.expr_high._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.arg != null) {
      result.add(this.arg);
    }
    if (this.expr_low != null) {
      result.add(this.expr_low);
    }
    if (this.expr_high != null) {
      result.add(this.expr_high);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.arg == child) {
      this.set_arg((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    if (this.expr_low == child) {
      this.set_expr_low((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    if (this.expr_high == child) {
      this.set_expr_high((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL92_RESERVED_BETWEEN);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_BETWEEN");
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
    if (arg == null) { throw new RuntimeException(); }
    _result.addChild(arg.unparse());


    if (expr_low == null) { throw new RuntimeException(); }
    _result.addChild(expr_low.unparse());


    if (expr_high == null) { throw new RuntimeException(); }
    _result.addChild(expr_high.unparse());


    return _result;
  }

}
