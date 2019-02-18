package ru.barsopen.plsqlconverter.ast.typed;
public class standard_function_translate implements standard_function, _baseNode {
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

  public expression expr = null;
  public expression get_expr() { return this.expr; }
  public void set_expr(expression value) {
    if (this.expr != null) { this.expr._setParent(null); }
    this.expr = value;
    if (this.expr != null) { this.expr._setParent(this); }
  }
  public expression expr_from = null;
  public expression get_expr_from() { return this.expr_from; }
  public void set_expr_from(expression value) {
    if (this.expr_from != null) { this.expr_from._setParent(null); }
    this.expr_from = value;
    if (this.expr_from != null) { this.expr_from._setParent(this); }
  }
  public expression expr_to = null;
  public expression get_expr_to() { return this.expr_to; }
  public void set_expr_to(expression value) {
    if (this.expr_to != null) { this.expr_to._setParent(null); }
    this.expr_to = value;
    if (this.expr_to != null) { this.expr_to._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.expr != null) {
      this.expr._walk(visitor);
    }
    if (this.expr_from != null) {
      this.expr_from._walk(visitor);
    }
    if (this.expr_to != null) {
      this.expr_to._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.expr != null) {
      result.add(this.expr);
    }
    if (this.expr_from != null) {
      result.add(this.expr_from);
    }
    if (this.expr_to != null) {
      result.add(this.expr_to);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.expr == child) {
      this.set_expr((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    if (this.expr_from == child) {
      this.set_expr_from((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    if (this.expr_to == child) {
      this.set_expr_to((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.TRANSLATE_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("TRANSLATE_VK");
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
    if (expr == null) { throw new RuntimeException(); }
    _result.addChild(expr.unparse());


    if (expr_from == null) { throw new RuntimeException(); }
    _result.addChild(expr_from.unparse());


    if (expr_to == null) { throw new RuntimeException(); }
    _result.addChild(expr_to.unparse());


    return _result;
  }

}
