package ru.barsopen.plsqlconverter.ast.typed;
public class general_table_ref implements _baseNode {
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

  public alias alias = null;
  public alias get_alias() { return this.alias; }
  public void set_alias(alias value) {
    if (this.alias != null) { this.alias._setParent(null); }
    this.alias = value;
    if (this.alias != null) { this.alias._setParent(this); }
  }
  public boolean is_alias() { return this.alias != null; }
  public dml_table_expression_clause dml_table_expression_clause = null;
  public dml_table_expression_clause get_dml_table_expression_clause() { return this.dml_table_expression_clause; }
  public void set_dml_table_expression_clause(dml_table_expression_clause value) {
    if (this.dml_table_expression_clause != null) { this.dml_table_expression_clause._setParent(null); }
    this.dml_table_expression_clause = value;
    if (this.dml_table_expression_clause != null) { this.dml_table_expression_clause._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree ONLY_VK = null;
  public org.antlr.runtime.tree.Tree get_ONLY_VK() { return this.ONLY_VK; }
  public void set_ONLY_VK(org.antlr.runtime.tree.Tree value) {
    this.ONLY_VK = value;
  }
  public boolean is_ONLY_VK() { return this.ONLY_VK != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.alias != null) {
      this.alias._walk(visitor);
    }
    if (this.dml_table_expression_clause != null) {
      this.dml_table_expression_clause._walk(visitor);
    }
    if (this.ONLY_VK != null) {
      visitor.visit(this.ONLY_VK);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.alias != null) {
      result.add(this.alias);
    }
    if (this.dml_table_expression_clause != null) {
      result.add(this.dml_table_expression_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.alias == child) {
      this.set_alias((ru.barsopen.plsqlconverter.ast.typed.alias)replacement);
      return;
    }
    if (this.dml_table_expression_clause == child) {
      this.set_dml_table_expression_clause((ru.barsopen.plsqlconverter.ast.typed.dml_table_expression_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.TABLE_REF);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("TABLE_REF");
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
    if (alias != null) {
      _result.addChild(alias.unparse());
    }


    if (dml_table_expression_clause == null) { throw new RuntimeException(); }
    _result.addChild(dml_table_expression_clause.unparse());


    if (ONLY_VK != null) {
      _result.addChild(ONLY_VK);
    }


    return _result;
  }

}
