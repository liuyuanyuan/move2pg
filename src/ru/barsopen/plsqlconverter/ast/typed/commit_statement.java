package ru.barsopen.plsqlconverter.ast.typed;
public class commit_statement implements transaction_control_statements, _baseNode {
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
  public commit_statement_additional commit_statement_additional = null;
  public commit_statement_additional get_commit_statement_additional() { return this.commit_statement_additional; }
  public void set_commit_statement_additional(commit_statement_additional value) {
    if (this.commit_statement_additional != null) { this.commit_statement_additional._setParent(null); }
    this.commit_statement_additional = value;
    if (this.commit_statement_additional != null) { this.commit_statement_additional._setParent(this); }
  }
  public boolean is_commit_statement_additional() { return this.commit_statement_additional != null; }
  public write_clause write_clause = null;
  public write_clause get_write_clause() { return this.write_clause; }
  public void set_write_clause(write_clause value) {
    if (this.write_clause != null) { this.write_clause._setParent(null); }
    this.write_clause = value;
    if (this.write_clause != null) { this.write_clause._setParent(this); }
  }
  public boolean is_write_clause() { return this.write_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.WORK_VK != null) {
      visitor.visit(this.WORK_VK);
    }
    if (this.commit_statement_additional != null) {
      this.commit_statement_additional._walk(visitor);
    }
    if (this.write_clause != null) {
      this.write_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.commit_statement_additional != null) {
      result.add(this.commit_statement_additional);
    }
    if (this.write_clause != null) {
      result.add(this.write_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.commit_statement_additional == child) {
      this.set_commit_statement_additional((ru.barsopen.plsqlconverter.ast.typed.commit_statement_additional)replacement);
      return;
    }
    if (this.write_clause == child) {
      this.set_write_clause((ru.barsopen.plsqlconverter.ast.typed.write_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.COMMIT_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("COMMIT_VK");
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


    if (commit_statement_additional != null) {
      _result.addChild(commit_statement_additional.unparse());
    }


    if (write_clause != null) {
      _result.addChild(write_clause.unparse());
    }


    return _result;
  }

}
