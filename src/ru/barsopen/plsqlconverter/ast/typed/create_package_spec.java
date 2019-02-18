package ru.barsopen.plsqlconverter.ast.typed;
public class create_package_spec implements create_package, _baseNode {
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

  public org.antlr.runtime.tree.Tree REPLACE_VK = null;
  public org.antlr.runtime.tree.Tree get_REPLACE_VK() { return this.REPLACE_VK; }
  public void set_REPLACE_VK(org.antlr.runtime.tree.Tree value) {
    this.REPLACE_VK = value;
  }
  public boolean is_REPLACE_VK() { return this.REPLACE_VK != null; }
  public package_name package_name = null;
  public package_name get_package_name() { return this.package_name; }
  public void set_package_name(package_name value) {
    if (this.package_name != null) { this.package_name._setParent(null); }
    this.package_name = value;
    if (this.package_name != null) { this.package_name._setParent(this); }
  }
  public invoker_rights_clause invoker_rights_clause = null;
  public invoker_rights_clause get_invoker_rights_clause() { return this.invoker_rights_clause; }
  public void set_invoker_rights_clause(invoker_rights_clause value) {
    if (this.invoker_rights_clause != null) { this.invoker_rights_clause._setParent(null); }
    this.invoker_rights_clause = value;
    if (this.invoker_rights_clause != null) { this.invoker_rights_clause._setParent(this); }
  }
  public boolean is_invoker_rights_clause() { return this.invoker_rights_clause != null; }
  public java.util.List<package_obj_spec> package_obj_specs = new java.util.ArrayList<package_obj_spec>();
  public java.util.List<package_obj_spec> get_package_obj_specs() { return this.package_obj_specs; }
  public void add_package_obj_specs(package_obj_spec value) {
    insert_package_obj_specs(package_obj_specs.size(), value);
  }
  public void insert_package_obj_specs(int pos, package_obj_spec value) {
    this.package_obj_specs.add(pos, value);
    value._setParent(this);
  }
  public void remove_package_obj_specs(int pos) {
    this.package_obj_specs.get(pos)._setParent(null);
    this.package_obj_specs.remove(pos);
  }
  public void remove_package_obj_specs(package_obj_spec value) {
    this.remove_package_obj_specs(this.package_obj_specs.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.REPLACE_VK != null) {
      visitor.visit(this.REPLACE_VK);
    }
    if (this.package_name != null) {
      this.package_name._walk(visitor);
    }
    if (this.invoker_rights_clause != null) {
      this.invoker_rights_clause._walk(visitor);
    }
    for (package_obj_spec _value: this.package_obj_specs) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.package_name != null) {
      result.add(this.package_name);
    }
    if (this.invoker_rights_clause != null) {
      result.add(this.invoker_rights_clause);
    }
    result.addAll(this.package_obj_specs);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.package_name == child) {
      this.set_package_name((ru.barsopen.plsqlconverter.ast.typed.package_name)replacement);
      return;
    }
    if (this.invoker_rights_clause == child) {
      this.set_invoker_rights_clause((ru.barsopen.plsqlconverter.ast.typed.invoker_rights_clause)replacement);
      return;
    }
    for (int _i = 0; _i < this.package_obj_specs.size(); ++_i) {
      if (this.package_obj_specs.get(_i) == child) {
        this.remove_package_obj_specs(_i);
        this.insert_package_obj_specs(_i, (ru.barsopen.plsqlconverter.ast.typed.package_obj_spec)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.CREATE_PACKAGE_SPEC);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("CREATE_PACKAGE_SPEC");
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
    if (REPLACE_VK != null) {
      _result.addChild(REPLACE_VK);
    }


    if (package_name == null) { throw new RuntimeException(); }
    _result.addChild(package_name.unparse());


    if (invoker_rights_clause != null) {
      _result.addChild(invoker_rights_clause.unparse());
    }


    for (int i = 0; i < package_obj_specs.size(); ++i) {
      _result.addChild(package_obj_specs.get(i).unparse());
    }


    return _result;
  }

}
