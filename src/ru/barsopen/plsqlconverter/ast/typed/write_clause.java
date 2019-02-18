package ru.barsopen.plsqlconverter.ast.typed;
public class write_clause implements _baseNode {
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

  public org.antlr.runtime.tree.Tree WAIT_VK = null;
  public org.antlr.runtime.tree.Tree get_WAIT_VK() { return this.WAIT_VK; }
  public void set_WAIT_VK(org.antlr.runtime.tree.Tree value) {
    this.WAIT_VK = value;
  }
  public boolean is_WAIT_VK() { return this.WAIT_VK != null; }
  public org.antlr.runtime.tree.Tree PLSQL_RESERVED_NOWAIT = null;
  public org.antlr.runtime.tree.Tree get_PLSQL_RESERVED_NOWAIT() { return this.PLSQL_RESERVED_NOWAIT; }
  public void set_PLSQL_RESERVED_NOWAIT(org.antlr.runtime.tree.Tree value) {
    this.PLSQL_RESERVED_NOWAIT = value;
  }
  public boolean is_PLSQL_RESERVED_NOWAIT() { return this.PLSQL_RESERVED_NOWAIT != null; }
  public org.antlr.runtime.tree.Tree IMMEDIATE_VK = null;
  public org.antlr.runtime.tree.Tree get_IMMEDIATE_VK() { return this.IMMEDIATE_VK; }
  public void set_IMMEDIATE_VK(org.antlr.runtime.tree.Tree value) {
    this.IMMEDIATE_VK = value;
  }
  public boolean is_IMMEDIATE_VK() { return this.IMMEDIATE_VK != null; }
  public org.antlr.runtime.tree.Tree BATCH_VK = null;
  public org.antlr.runtime.tree.Tree get_BATCH_VK() { return this.BATCH_VK; }
  public void set_BATCH_VK(org.antlr.runtime.tree.Tree value) {
    this.BATCH_VK = value;
  }
  public boolean is_BATCH_VK() { return this.BATCH_VK != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.WAIT_VK != null) {
      visitor.visit(this.WAIT_VK);
    }
    if (this.PLSQL_RESERVED_NOWAIT != null) {
      visitor.visit(this.PLSQL_RESERVED_NOWAIT);
    }
    if (this.IMMEDIATE_VK != null) {
      visitor.visit(this.IMMEDIATE_VK);
    }
    if (this.BATCH_VK != null) {
      visitor.visit(this.BATCH_VK);
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
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.WRITE_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("WRITE_VK");
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
    if (WAIT_VK != null) {
      _result.addChild(WAIT_VK);
    }


    if (PLSQL_RESERVED_NOWAIT != null) {
      _result.addChild(PLSQL_RESERVED_NOWAIT);
    }


    if (IMMEDIATE_VK != null) {
      _result.addChild(IMMEDIATE_VK);
    }


    if (BATCH_VK != null) {
      _result.addChild(BATCH_VK);
    }


    return _result;
  }

}
