package ru.barsopen.plsqlconverter.ast.typed;
public class record_type_dec_record implements record_type_dec, _baseNode {
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
  public java.util.List<field_spec> field_specs = new java.util.ArrayList<field_spec>();
  public java.util.List<field_spec> get_field_specs() { return this.field_specs; }
  public void add_field_specs(field_spec value) {
    insert_field_specs(field_specs.size(), value);
  }
  public void insert_field_specs(int pos, field_spec value) {
    this.field_specs.add(pos, value);
    value._setParent(this);
  }
  public void remove_field_specs(int pos) {
    this.field_specs.get(pos)._setParent(null);
    this.field_specs.remove(pos);
  }
  public void remove_field_specs(field_spec value) {
    this.remove_field_specs(this.field_specs.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.type_name != null) {
      this.type_name._walk(visitor);
    }
    for (field_spec _value: this.field_specs) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.type_name != null) {
      result.add(this.type_name);
    }
    result.addAll(this.field_specs);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.type_name == child) {
      this.set_type_name((ru.barsopen.plsqlconverter.ast.typed.type_name)replacement);
      return;
    }
    for (int _i = 0; _i < this.field_specs.size(); ++_i) {
      if (this.field_specs.get(_i) == child) {
        this.remove_field_specs(_i);
        this.insert_field_specs(_i, (ru.barsopen.plsqlconverter.ast.typed.field_spec)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.RECORD_TYPE_DECLARE_FIELDS);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("RECORD_TYPE_DECLARE_FIELDS");
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


    if (field_specs.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < field_specs.size(); ++i) {
      _result.addChild(field_specs.get(i).unparse());
    }


    return _result;
  }

}
