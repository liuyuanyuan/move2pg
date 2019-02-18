package ru.barsopen.plsqlconverter.ast.typed;
public class for_update_clause implements _baseNode {
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

  public for_update_of_part for_update_of_part = null;
  public for_update_of_part get_for_update_of_part() { return this.for_update_of_part; }
  public void set_for_update_of_part(for_update_of_part value) {
    if (this.for_update_of_part != null) { this.for_update_of_part._setParent(null); }
    this.for_update_of_part = value;
    if (this.for_update_of_part != null) { this.for_update_of_part._setParent(this); }
  }
  public boolean is_for_update_of_part() { return this.for_update_of_part != null; }
  public for_update_options for_update_options = null;
  public for_update_options get_for_update_options() { return this.for_update_options; }
  public void set_for_update_options(for_update_options value) {
    if (this.for_update_options != null) { this.for_update_options._setParent(null); }
    this.for_update_options = value;
    if (this.for_update_options != null) { this.for_update_options._setParent(this); }
  }
  public boolean is_for_update_options() { return this.for_update_options != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.for_update_of_part != null) {
      this.for_update_of_part._walk(visitor);
    }
    if (this.for_update_options != null) {
      this.for_update_options._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.for_update_of_part != null) {
      result.add(this.for_update_of_part);
    }
    if (this.for_update_options != null) {
      result.add(this.for_update_options);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.for_update_of_part == child) {
      this.set_for_update_of_part((ru.barsopen.plsqlconverter.ast.typed.for_update_of_part)replacement);
      return;
    }
    if (this.for_update_options == child) {
      this.set_for_update_options((ru.barsopen.plsqlconverter.ast.typed.for_update_options)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL92_RESERVED_FOR);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_FOR");
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
    if (for_update_of_part != null) {
      _result.addChild(for_update_of_part.unparse());
    }


    if (for_update_options != null) {
      _result.addChild(for_update_options.unparse());
    }


    return _result;
  }

}
