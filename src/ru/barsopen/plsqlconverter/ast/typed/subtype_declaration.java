package ru.barsopen.plsqlconverter.ast.typed;
public class subtype_declaration implements package_obj_spec, package_obj_body, declare_spec, _baseNode {
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

  public type_name type_name = null;
  public type_name get_type_name() { return this.type_name; }
  public void set_type_name(type_name value) {
    if (this.type_name != null) { this.type_name._setParent(null); }
    this.type_name = value;
    if (this.type_name != null) { this.type_name._setParent(this); }
  }
  public type_spec type_spec = null;
  public type_spec get_type_spec() { return this.type_spec; }
  public void set_type_spec(type_spec value) {
    if (this.type_spec != null) { this.type_spec._setParent(null); }
    this.type_spec = value;
    if (this.type_spec != null) { this.type_spec._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree SQL92_RESERVED_NULL = null;
  public org.antlr.runtime.tree.Tree get_SQL92_RESERVED_NULL() { return this.SQL92_RESERVED_NULL; }
  public void set_SQL92_RESERVED_NULL(org.antlr.runtime.tree.Tree value) {
    this.SQL92_RESERVED_NULL = value;
  }
  public boolean is_SQL92_RESERVED_NULL() { return this.SQL92_RESERVED_NULL != null; }
  public subtype_range subtype_range = null;
  public subtype_range get_subtype_range() { return this.subtype_range; }
  public void set_subtype_range(subtype_range value) {
    if (this.subtype_range != null) { this.subtype_range._setParent(null); }
    this.subtype_range = value;
    if (this.subtype_range != null) { this.subtype_range._setParent(this); }
  }
  public boolean is_subtype_range() { return this.subtype_range != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.type_name != null) {
      this.type_name._walk(visitor);
    }
    if (this.type_spec != null) {
      this.type_spec._walk(visitor);
    }
    if (this.SQL92_RESERVED_NULL != null) {
      visitor.visit(this.SQL92_RESERVED_NULL);
    }
    if (this.subtype_range != null) {
      this.subtype_range._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.type_name != null) {
      result.add(this.type_name);
    }
    if (this.type_spec != null) {
      result.add(this.type_spec);
    }
    if (this.subtype_range != null) {
      result.add(this.subtype_range);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.type_name == child) {
      this.set_type_name((ru.barsopen.plsqlconverter.ast.typed.type_name)replacement);
      return;
    }
    if (this.type_spec == child) {
      this.set_type_spec((ru.barsopen.plsqlconverter.ast.typed.type_spec)replacement);
      return;
    }
    if (this.subtype_range == child) {
      this.set_subtype_range((ru.barsopen.plsqlconverter.ast.typed.subtype_range)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SUBTYPE_DECLARE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SUBTYPE_DECLARE");
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
    if (type_name == null) { throw new RuntimeException(); }
    _result.addChild(type_name.unparse());


    if (type_spec == null) { throw new RuntimeException(); }
    _result.addChild(type_spec.unparse());


    if (SQL92_RESERVED_NULL != null) {
      _result.addChild(SQL92_RESERVED_NULL);
    }


    if (subtype_range != null) {
      _result.addChild(subtype_range.unparse());
    }


    return _result;
  }

}
