package ru.barsopen.plsqlconverter.ast.typed;
public class object_type_def implements _baseNode {
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

  public object_as_or_under_part object_as_or_under_part = null;
  public object_as_or_under_part get_object_as_or_under_part() { return this.object_as_or_under_part; }
  public void set_object_as_or_under_part(object_as_or_under_part value) {
    if (this.object_as_or_under_part != null) { this.object_as_or_under_part._setParent(null); }
    this.object_as_or_under_part = value;
    if (this.object_as_or_under_part != null) { this.object_as_or_under_part._setParent(this); }
  }
  public invoker_rights_clause invoker_rights_clause = null;
  public invoker_rights_clause get_invoker_rights_clause() { return this.invoker_rights_clause; }
  public void set_invoker_rights_clause(invoker_rights_clause value) {
    if (this.invoker_rights_clause != null) { this.invoker_rights_clause._setParent(null); }
    this.invoker_rights_clause = value;
    if (this.invoker_rights_clause != null) { this.invoker_rights_clause._setParent(this); }
  }
  public boolean is_invoker_rights_clause() { return this.invoker_rights_clause != null; }
  public sqlj_object_type sqlj_object_type = null;
  public sqlj_object_type get_sqlj_object_type() { return this.sqlj_object_type; }
  public void set_sqlj_object_type(sqlj_object_type value) {
    if (this.sqlj_object_type != null) { this.sqlj_object_type._setParent(null); }
    this.sqlj_object_type = value;
    if (this.sqlj_object_type != null) { this.sqlj_object_type._setParent(this); }
  }
  public boolean is_sqlj_object_type() { return this.sqlj_object_type != null; }
  public java.util.List<modifier_clause> modifier_clauses = new java.util.ArrayList<modifier_clause>();
  public java.util.List<modifier_clause> get_modifier_clauses() { return this.modifier_clauses; }
  public void add_modifier_clauses(modifier_clause value) {
    insert_modifier_clauses(modifier_clauses.size(), value);
  }
  public void insert_modifier_clauses(int pos, modifier_clause value) {
    this.modifier_clauses.add(pos, value);
    value._setParent(this);
  }
  public void remove_modifier_clauses(int pos) {
    this.modifier_clauses.get(pos)._setParent(null);
    this.modifier_clauses.remove(pos);
  }
  public void remove_modifier_clauses(modifier_clause value) {
    this.remove_modifier_clauses(this.modifier_clauses.indexOf(value));
  }
  public object_type_def_members object_type_def_members = null;
  public object_type_def_members get_object_type_def_members() { return this.object_type_def_members; }
  public void set_object_type_def_members(object_type_def_members value) {
    if (this.object_type_def_members != null) { this.object_type_def_members._setParent(null); }
    this.object_type_def_members = value;
    if (this.object_type_def_members != null) { this.object_type_def_members._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.object_as_or_under_part != null) {
      this.object_as_or_under_part._walk(visitor);
    }
    if (this.invoker_rights_clause != null) {
      this.invoker_rights_clause._walk(visitor);
    }
    if (this.sqlj_object_type != null) {
      this.sqlj_object_type._walk(visitor);
    }
    for (modifier_clause _value: this.modifier_clauses) {
      _value._walk(visitor);
    }
    if (this.object_type_def_members != null) {
      this.object_type_def_members._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.object_as_or_under_part != null) {
      result.add(this.object_as_or_under_part);
    }
    if (this.invoker_rights_clause != null) {
      result.add(this.invoker_rights_clause);
    }
    if (this.sqlj_object_type != null) {
      result.add(this.sqlj_object_type);
    }
    result.addAll(this.modifier_clauses);
    if (this.object_type_def_members != null) {
      result.add(this.object_type_def_members);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.object_as_or_under_part == child) {
      this.set_object_as_or_under_part((ru.barsopen.plsqlconverter.ast.typed.object_as_or_under_part)replacement);
      return;
    }
    if (this.invoker_rights_clause == child) {
      this.set_invoker_rights_clause((ru.barsopen.plsqlconverter.ast.typed.invoker_rights_clause)replacement);
      return;
    }
    if (this.sqlj_object_type == child) {
      this.set_sqlj_object_type((ru.barsopen.plsqlconverter.ast.typed.sqlj_object_type)replacement);
      return;
    }
    for (int _i = 0; _i < this.modifier_clauses.size(); ++_i) {
      if (this.modifier_clauses.get(_i) == child) {
        this.remove_modifier_clauses(_i);
        this.insert_modifier_clauses(_i, (ru.barsopen.plsqlconverter.ast.typed.modifier_clause)replacement);
        return;
      }
    }
    if (this.object_type_def_members == child) {
      this.set_object_type_def_members((ru.barsopen.plsqlconverter.ast.typed.object_type_def_members)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.OBJECT_TYPE_DEF);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("OBJECT_TYPE_DEF");
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
    if (object_as_or_under_part == null) { throw new RuntimeException(); }
    _result.addChild(object_as_or_under_part.unparse());


    if (invoker_rights_clause != null) {
      _result.addChild(invoker_rights_clause.unparse());
    }


    if (sqlj_object_type != null) {
      _result.addChild(sqlj_object_type.unparse());
    }


    for (int i = 0; i < modifier_clauses.size(); ++i) {
      _result.addChild(modifier_clauses.get(i).unparse());
    }


    if (object_type_def_members == null) { throw new RuntimeException(); }
    _result.addChild(object_type_def_members.unparse());


    return _result;
  }

}
