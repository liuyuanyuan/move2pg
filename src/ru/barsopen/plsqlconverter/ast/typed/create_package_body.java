package ru.barsopen.plsqlconverter.ast.typed;
public class create_package_body implements create_package, _baseNode {
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
  public java.util.List<package_obj_body> package_obj_bodys = new java.util.ArrayList<package_obj_body>();
  public java.util.List<package_obj_body> get_package_obj_bodys() { return this.package_obj_bodys; }
  public void add_package_obj_bodys(package_obj_body value) {
    insert_package_obj_bodys(package_obj_bodys.size(), value);
  }
  public void insert_package_obj_bodys(int pos, package_obj_body value) {
    this.package_obj_bodys.add(pos, value);
    value._setParent(this);
  }
  public void remove_package_obj_bodys(int pos) {
    this.package_obj_bodys.get(pos)._setParent(null);
    this.package_obj_bodys.remove(pos);
  }
  public void remove_package_obj_bodys(package_obj_body value) {
    this.remove_package_obj_bodys(this.package_obj_bodys.indexOf(value));
  }
  public seq_of_statements seq_of_statements = null;
  public seq_of_statements get_seq_of_statements() { return this.seq_of_statements; }
  public void set_seq_of_statements(seq_of_statements value) {
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(null); }
    this.seq_of_statements = value;
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(this); }
  }
  public boolean is_seq_of_statements() { return this.seq_of_statements != null; }
  public exception_clause exception_clause = null;
  public exception_clause get_exception_clause() { return this.exception_clause; }
  public void set_exception_clause(exception_clause value) {
    if (this.exception_clause != null) { this.exception_clause._setParent(null); }
    this.exception_clause = value;
    if (this.exception_clause != null) { this.exception_clause._setParent(this); }
  }
  public boolean is_exception_clause() { return this.exception_clause != null; }

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
    for (package_obj_body _value: this.package_obj_bodys) {
      _value._walk(visitor);
    }
    if (this.seq_of_statements != null) {
      this.seq_of_statements._walk(visitor);
    }
    if (this.exception_clause != null) {
      this.exception_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.package_name != null) {
      result.add(this.package_name);
    }
    result.addAll(this.package_obj_bodys);
    if (this.seq_of_statements != null) {
      result.add(this.seq_of_statements);
    }
    if (this.exception_clause != null) {
      result.add(this.exception_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.package_name == child) {
      this.set_package_name((ru.barsopen.plsqlconverter.ast.typed.package_name)replacement);
      return;
    }
    for (int _i = 0; _i < this.package_obj_bodys.size(); ++_i) {
      if (this.package_obj_bodys.get(_i) == child) {
        this.remove_package_obj_bodys(_i);
        this.insert_package_obj_bodys(_i, (ru.barsopen.plsqlconverter.ast.typed.package_obj_body)replacement);
        return;
      }
    }
    if (this.seq_of_statements == child) {
      this.set_seq_of_statements((ru.barsopen.plsqlconverter.ast.typed.seq_of_statements)replacement);
      return;
    }
    if (this.exception_clause == child) {
      this.set_exception_clause((ru.barsopen.plsqlconverter.ast.typed.exception_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.CREATE_PACKAGE_BODY);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("CREATE_PACKAGE_BODY");
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


    for (int i = 0; i < package_obj_bodys.size(); ++i) {
      _result.addChild(package_obj_bodys.get(i).unparse());
    }


    if (seq_of_statements != null) {
      _result.addChild(seq_of_statements.unparse());
    }


    if (exception_clause != null) {
      _result.addChild(exception_clause.unparse());
    }


    return _result;
  }

}
