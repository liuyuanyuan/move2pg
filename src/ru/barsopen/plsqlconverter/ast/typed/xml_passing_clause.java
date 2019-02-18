package ru.barsopen.plsqlconverter.ast.typed;
public class xml_passing_clause implements _baseNode {
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

  public org.antlr.runtime.tree.Tree VALUE_VK = null;
  public org.antlr.runtime.tree.Tree get_VALUE_VK() { return this.VALUE_VK; }
  public void set_VALUE_VK(org.antlr.runtime.tree.Tree value) {
    this.VALUE_VK = value;
  }
  public boolean is_VALUE_VK() { return this.VALUE_VK != null; }
  public xml_passing_clause_expr xml_passing_clause_expr = null;
  public xml_passing_clause_expr get_xml_passing_clause_expr() { return this.xml_passing_clause_expr; }
  public void set_xml_passing_clause_expr(xml_passing_clause_expr value) {
    if (this.xml_passing_clause_expr != null) { this.xml_passing_clause_expr._setParent(null); }
    this.xml_passing_clause_expr = value;
    if (this.xml_passing_clause_expr != null) { this.xml_passing_clause_expr._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.VALUE_VK != null) {
      visitor.visit(this.VALUE_VK);
    }
    if (this.xml_passing_clause_expr != null) {
      this.xml_passing_clause_expr._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.xml_passing_clause_expr != null) {
      result.add(this.xml_passing_clause_expr);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.xml_passing_clause_expr == child) {
      this.set_xml_passing_clause_expr((ru.barsopen.plsqlconverter.ast.typed.xml_passing_clause_expr)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.PASSING_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("PASSING_VK");
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
    if (VALUE_VK != null) {
      _result.addChild(VALUE_VK);
    }


    if (xml_passing_clause_expr == null) { throw new RuntimeException(); }
    _result.addChild(xml_passing_clause_expr.unparse());


    return _result;
  }

}
