package ru.barsopen.plsqlconverter.ast.typed;
public class using_element_element implements using_element, _baseNode {
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

  public org.antlr.runtime.tree.Tree SQL92_RESERVED_IN = null;
  public org.antlr.runtime.tree.Tree get_SQL92_RESERVED_IN() { return this.SQL92_RESERVED_IN; }
  public void set_SQL92_RESERVED_IN(org.antlr.runtime.tree.Tree value) {
    this.SQL92_RESERVED_IN = value;
  }
  public boolean is_SQL92_RESERVED_IN() { return this.SQL92_RESERVED_IN != null; }
  public org.antlr.runtime.tree.Tree OUT_VK = null;
  public org.antlr.runtime.tree.Tree get_OUT_VK() { return this.OUT_VK; }
  public void set_OUT_VK(org.antlr.runtime.tree.Tree value) {
    this.OUT_VK = value;
  }
  public boolean is_OUT_VK() { return this.OUT_VK != null; }
  public expression expression = null;
  public expression get_expression() { return this.expression; }
  public void set_expression(expression value) {
    if (this.expression != null) { this.expression._setParent(null); }
    this.expression = value;
    if (this.expression != null) { this.expression._setParent(this); }
  }
  public alias alias = null;
  public alias get_alias() { return this.alias; }
  public void set_alias(alias value) {
    if (this.alias != null) { this.alias._setParent(null); }
    this.alias = value;
    if (this.alias != null) { this.alias._setParent(this); }
  }
  public boolean is_alias() { return this.alias != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.SQL92_RESERVED_IN != null) {
      visitor.visit(this.SQL92_RESERVED_IN);
    }
    if (this.OUT_VK != null) {
      visitor.visit(this.OUT_VK);
    }
    if (this.expression != null) {
      this.expression._walk(visitor);
    }
    if (this.alias != null) {
      this.alias._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.expression != null) {
      result.add(this.expression);
    }
    if (this.alias != null) {
      result.add(this.alias);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.expression == child) {
      this.set_expression((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    if (this.alias == child) {
      this.set_alias((ru.barsopen.plsqlconverter.ast.typed.alias)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.ELEMENT);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("ELEMENT");
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
    if (SQL92_RESERVED_IN != null) {
      _result.addChild(SQL92_RESERVED_IN);
    }


    if (OUT_VK != null) {
      _result.addChild(OUT_VK);
    }


    if (expression == null) { throw new RuntimeException(); }
    _result.addChild(expression.unparse());


    if (alias != null) {
      _result.addChild(alias.unparse());
    }


    return _result;
  }

}
