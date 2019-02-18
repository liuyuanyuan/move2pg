package ru.barsopen.plsqlconverter.ast.typed;
public class type_spec_interval implements type_spec, _baseNode {
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

  public interval_type_spec_first interval_type_spec_first = null;
  public interval_type_spec_first get_interval_type_spec_first() { return this.interval_type_spec_first; }
  public void set_interval_type_spec_first(interval_type_spec_first value) {
    if (this.interval_type_spec_first != null) { this.interval_type_spec_first._setParent(null); }
    this.interval_type_spec_first = value;
    if (this.interval_type_spec_first != null) { this.interval_type_spec_first._setParent(this); }
  }
  public interval_type_spec_second interval_type_spec_second = null;
  public interval_type_spec_second get_interval_type_spec_second() { return this.interval_type_spec_second; }
  public void set_interval_type_spec_second(interval_type_spec_second value) {
    if (this.interval_type_spec_second != null) { this.interval_type_spec_second._setParent(null); }
    this.interval_type_spec_second = value;
    if (this.interval_type_spec_second != null) { this.interval_type_spec_second._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.interval_type_spec_first != null) {
      this.interval_type_spec_first._walk(visitor);
    }
    if (this.interval_type_spec_second != null) {
      this.interval_type_spec_second._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.interval_type_spec_first != null) {
      result.add(this.interval_type_spec_first);
    }
    if (this.interval_type_spec_second != null) {
      result.add(this.interval_type_spec_second);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.interval_type_spec_first == child) {
      this.set_interval_type_spec_first((ru.barsopen.plsqlconverter.ast.typed.interval_type_spec_first)replacement);
      return;
    }
    if (this.interval_type_spec_second == child) {
      this.set_interval_type_spec_second((ru.barsopen.plsqlconverter.ast.typed.interval_type_spec_second)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.INTERVAL_DATATYPE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("INTERVAL_DATATYPE");
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
    if (interval_type_spec_first == null) { throw new RuntimeException(); }
    _result.addChild(interval_type_spec_first.unparse());


    if (interval_type_spec_second == null) { throw new RuntimeException(); }
    _result.addChild(interval_type_spec_second.unparse());


    return _result;
  }

}
