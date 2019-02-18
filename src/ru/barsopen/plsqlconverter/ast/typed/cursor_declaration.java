package ru.barsopen.plsqlconverter.ast.typed;
public class cursor_declaration implements package_obj_spec, package_obj_body, declare_spec, _baseNode {
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

  public cursor_name cursor_name = null;
  public cursor_name get_cursor_name() { return this.cursor_name; }
  public void set_cursor_name(cursor_name value) {
    if (this.cursor_name != null) { this.cursor_name._setParent(null); }
    this.cursor_name = value;
    if (this.cursor_name != null) { this.cursor_name._setParent(this); }
  }
  public type_spec type_spec = null;
  public type_spec get_type_spec() { return this.type_spec; }
  public void set_type_spec(type_spec value) {
    if (this.type_spec != null) { this.type_spec._setParent(null); }
    this.type_spec = value;
    if (this.type_spec != null) { this.type_spec._setParent(this); }
  }
  public boolean is_type_spec() { return this.type_spec != null; }
  public select_statement select_statement = null;
  public select_statement get_select_statement() { return this.select_statement; }
  public void set_select_statement(select_statement value) {
    if (this.select_statement != null) { this.select_statement._setParent(null); }
    this.select_statement = value;
    if (this.select_statement != null) { this.select_statement._setParent(this); }
  }
  public boolean is_select_statement() { return this.select_statement != null; }
  public parameters parameters = null;
  public parameters get_parameters() { return this.parameters; }
  public void set_parameters(parameters value) {
    if (this.parameters != null) { this.parameters._setParent(null); }
    this.parameters = value;
    if (this.parameters != null) { this.parameters._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.cursor_name != null) {
      this.cursor_name._walk(visitor);
    }
    if (this.type_spec != null) {
      this.type_spec._walk(visitor);
    }
    if (this.select_statement != null) {
      this.select_statement._walk(visitor);
    }
    if (this.parameters != null) {
      this.parameters._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.cursor_name != null) {
      result.add(this.cursor_name);
    }
    if (this.type_spec != null) {
      result.add(this.type_spec);
    }
    if (this.select_statement != null) {
      result.add(this.select_statement);
    }
    if (this.parameters != null) {
      result.add(this.parameters);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.cursor_name == child) {
      this.set_cursor_name((ru.barsopen.plsqlconverter.ast.typed.cursor_name)replacement);
      return;
    }
    if (this.type_spec == child) {
      this.set_type_spec((ru.barsopen.plsqlconverter.ast.typed.type_spec)replacement);
      return;
    }
    if (this.select_statement == child) {
      this.set_select_statement((ru.barsopen.plsqlconverter.ast.typed.select_statement)replacement);
      return;
    }
    if (this.parameters == child) {
      this.set_parameters((ru.barsopen.plsqlconverter.ast.typed.parameters)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.CURSOR_DECLARE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("CURSOR_DECLARE");
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
    if (cursor_name == null) { throw new RuntimeException(); }
    _result.addChild(cursor_name.unparse());


    if (type_spec != null) {
      _result.addChild(type_spec.unparse());
    }


    if (select_statement != null) {
      _result.addChild(select_statement.unparse());
    }


    if (parameters == null) { throw new RuntimeException(); }
    _result.addChild(parameters.unparse());


    return _result;
  }

}
