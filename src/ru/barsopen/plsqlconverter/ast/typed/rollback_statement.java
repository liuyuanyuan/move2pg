package ru.barsopen.plsqlconverter.ast.typed;
public class rollback_statement implements transaction_control_statements, _baseNode {
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

  public org.antlr.runtime.tree.Tree WORK_VK = null;
  public org.antlr.runtime.tree.Tree get_WORK_VK() { return this.WORK_VK; }
  public void set_WORK_VK(org.antlr.runtime.tree.Tree value) {
    this.WORK_VK = value;
  }
  public boolean is_WORK_VK() { return this.WORK_VK != null; }
  public rollback_statement_additional rollback_statement_additional = null;
  public rollback_statement_additional get_rollback_statement_additional() { return this.rollback_statement_additional; }
  public void set_rollback_statement_additional(rollback_statement_additional value) {
    if (this.rollback_statement_additional != null) { this.rollback_statement_additional._setParent(null); }
    this.rollback_statement_additional = value;
    if (this.rollback_statement_additional != null) { this.rollback_statement_additional._setParent(this); }
  }
  public boolean is_rollback_statement_additional() { return this.rollback_statement_additional != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.WORK_VK != null) {
      visitor.visit(this.WORK_VK);
    }
    if (this.rollback_statement_additional != null) {
      this.rollback_statement_additional._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.rollback_statement_additional != null) {
      result.add(this.rollback_statement_additional);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.rollback_statement_additional == child) {
      this.set_rollback_statement_additional((ru.barsopen.plsqlconverter.ast.typed.rollback_statement_additional)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.ROLLBACK_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("ROLLBACK_VK");
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
    if (WORK_VK != null) {
      _result.addChild(WORK_VK);
    }


    if (rollback_statement_additional != null) {
      _result.addChild(rollback_statement_additional.unparse());
    }


    return _result;
  }

}
