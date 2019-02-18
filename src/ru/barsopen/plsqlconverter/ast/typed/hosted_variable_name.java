package ru.barsopen.plsqlconverter.ast.typed;
public class hosted_variable_name implements assignment_target, expression_element, _baseNode {
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

  public org.antlr.runtime.tree.Tree BINDVAR = null;
  public org.antlr.runtime.tree.Tree get_BINDVAR() { return this.BINDVAR; }
  public void set_BINDVAR(org.antlr.runtime.tree.Tree value) {
    this.BINDVAR = value;
  }
  public boolean is_BINDVAR() { return this.BINDVAR != null; }
  public org.antlr.runtime.tree.Tree UNSIGNED_INTEGER = null;
  public org.antlr.runtime.tree.Tree get_UNSIGNED_INTEGER() { return this.UNSIGNED_INTEGER; }
  public void set_UNSIGNED_INTEGER(org.antlr.runtime.tree.Tree value) {
    this.UNSIGNED_INTEGER = value;
  }
  public boolean is_UNSIGNED_INTEGER() { return this.UNSIGNED_INTEGER != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.BINDVAR != null) {
      visitor.visit(this.BINDVAR);
    }
    if (this.UNSIGNED_INTEGER != null) {
      visitor.visit(this.UNSIGNED_INTEGER);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.HOSTED_VARIABLE_NAME);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("HOSTED_VARIABLE_NAME");
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
    if (BINDVAR != null) {
      _result.addChild(BINDVAR);
    }


    if (UNSIGNED_INTEGER != null) {
      _result.addChild(UNSIGNED_INTEGER);
    }


    return _result;
  }

}
