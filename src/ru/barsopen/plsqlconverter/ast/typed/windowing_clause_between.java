package ru.barsopen.plsqlconverter.ast.typed;
public class windowing_clause_between implements windowing_clause_spec, _baseNode {
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

  public windowing_elements e1 = null;
  public windowing_elements get_e1() { return this.e1; }
  public void set_e1(windowing_elements value) {
    if (this.e1 != null) { this.e1._setParent(null); }
    this.e1 = value;
    if (this.e1 != null) { this.e1._setParent(this); }
  }
  public windowing_elements e2 = null;
  public windowing_elements get_e2() { return this.e2; }
  public void set_e2(windowing_elements value) {
    if (this.e2 != null) { this.e2._setParent(null); }
    this.e2 = value;
    if (this.e2 != null) { this.e2._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.e1 != null) {
      this.e1._walk(visitor);
    }
    if (this.e2 != null) {
      this.e2._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.e1 != null) {
      result.add(this.e1);
    }
    if (this.e2 != null) {
      result.add(this.e2);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.e1 == child) {
      this.set_e1((ru.barsopen.plsqlconverter.ast.typed.windowing_elements)replacement);
      return;
    }
    if (this.e2 == child) {
      this.set_e2((ru.barsopen.plsqlconverter.ast.typed.windowing_elements)replacement);
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
    if (e1 == null) { throw new RuntimeException(); }
    _result.addChild(e1.unparse());


    if (e2 == null) { throw new RuntimeException(); }
    _result.addChild(e2.unparse());


    return _result;
  }

}
