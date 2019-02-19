package ru.barsopen.plsqlconverter.ast.typed;
public class pragma_declaration_exception_init implements pragma_declaration_impl, _baseNode {
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

  public exception_name exception_name = null;
  public exception_name get_exception_name() { return this.exception_name; }
  public void set_exception_name(exception_name value) {
    if (this.exception_name != null) { this.exception_name._setParent(null); }
    this.exception_name = value;
    if (this.exception_name != null) { this.exception_name._setParent(this); }
  }
  public constant constant = null;
  public constant get_constant() { return this.constant; }
  public void set_constant(constant value) {
    if (this.constant != null) { this.constant._setParent(null); }
    this.constant = value;
    if (this.constant != null) { this.constant._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.exception_name != null) {
      this.exception_name._walk(visitor);
    }
    if (this.constant != null) {
      this.constant._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.exception_name != null) {
      result.add(this.exception_name);
    }
    if (this.constant != null) {
      result.add(this.constant);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.exception_name == child) {
      this.set_exception_name((ru.barsopen.plsqlconverter.ast.typed.exception_name)replacement);
      return;
    }
    if (this.constant == child) {
      this.set_constant((ru.barsopen.plsqlconverter.ast.typed.constant)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.EXCEPTION_INIT_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("EXCEPTION_INIT_VK");
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
    if (exception_name == null) { throw new RuntimeException(); }
    _result.addChild(exception_name.unparse());


    if (constant == null) { throw new RuntimeException(); }
    _result.addChild(constant.unparse());


    return _result;
  }

}