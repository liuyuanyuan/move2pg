package ru.barsopen.plsqlconverter.ast.typed;
public class record_var_dec implements record_declaration, _baseNode {
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

  public record_name record_name = null;
  public record_name get_record_name() { return this.record_name; }
  public void set_record_name(record_name value) {
    if (this.record_name != null) { this.record_name._setParent(null); }
    this.record_name = value;
    if (this.record_name != null) { this.record_name._setParent(this); }
  }
  public type_name type_name = null;
  public type_name get_type_name() { return this.type_name; }
  public void set_type_name(type_name value) {
    if (this.type_name != null) { this.type_name._setParent(null); }
    this.type_name = value;
    if (this.type_name != null) { this.type_name._setParent(this); }
  }
  public percent_type_or_rowtype percent_type_or_rowtype = null;
  public percent_type_or_rowtype get_percent_type_or_rowtype() { return this.percent_type_or_rowtype; }
  public void set_percent_type_or_rowtype(percent_type_or_rowtype value) {
    if (this.percent_type_or_rowtype != null) { this.percent_type_or_rowtype._setParent(null); }
    this.percent_type_or_rowtype = value;
    if (this.percent_type_or_rowtype != null) { this.percent_type_or_rowtype._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.record_name != null) {
      this.record_name._walk(visitor);
    }
    if (this.type_name != null) {
      this.type_name._walk(visitor);
    }
    if (this.percent_type_or_rowtype != null) {
      this.percent_type_or_rowtype._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.record_name != null) {
      result.add(this.record_name);
    }
    if (this.type_name != null) {
      result.add(this.type_name);
    }
    if (this.percent_type_or_rowtype != null) {
      result.add(this.percent_type_or_rowtype);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.record_name == child) {
      this.set_record_name((ru.barsopen.plsqlconverter.ast.typed.record_name)replacement);
      return;
    }
    if (this.type_name == child) {
      this.set_type_name((ru.barsopen.plsqlconverter.ast.typed.type_name)replacement);
      return;
    }
    if (this.percent_type_or_rowtype == child) {
      this.set_percent_type_or_rowtype((ru.barsopen.plsqlconverter.ast.typed.percent_type_or_rowtype)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.RECORD_VAR_DECLARE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("RECORD_VAR_DECLARE");
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
    if (record_name == null) { throw new RuntimeException(); }
    _result.addChild(record_name.unparse());


    if (type_name == null) { throw new RuntimeException(); }
    _result.addChild(type_name.unparse());


    if (percent_type_or_rowtype == null) { throw new RuntimeException(); }
    _result.addChild(percent_type_or_rowtype.unparse());


    return _result;
  }

}
