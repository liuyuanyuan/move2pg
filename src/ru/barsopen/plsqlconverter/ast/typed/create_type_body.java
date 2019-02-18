package ru.barsopen.plsqlconverter.ast.typed;
public class create_type_body implements create_type, _baseNode {
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

  public org.antlr.runtime.tree.Tree SQL92_RESERVED_CREATE = null;
  public org.antlr.runtime.tree.Tree get_SQL92_RESERVED_CREATE() { return this.SQL92_RESERVED_CREATE; }
  public void set_SQL92_RESERVED_CREATE(org.antlr.runtime.tree.Tree value) {
    this.SQL92_RESERVED_CREATE = value;
  }
  public boolean is_SQL92_RESERVED_CREATE() { return this.SQL92_RESERVED_CREATE != null; }
  public org.antlr.runtime.tree.Tree REPLACE_VK = null;
  public org.antlr.runtime.tree.Tree get_REPLACE_VK() { return this.REPLACE_VK; }
  public void set_REPLACE_VK(org.antlr.runtime.tree.Tree value) {
    this.REPLACE_VK = value;
  }
  public boolean is_REPLACE_VK() { return this.REPLACE_VK != null; }
  public type_name type_name = null;
  public type_name get_type_name() { return this.type_name; }
  public void set_type_name(type_name value) {
    if (this.type_name != null) { this.type_name._setParent(null); }
    this.type_name = value;
    if (this.type_name != null) { this.type_name._setParent(this); }
  }
  public create_type_body_elements create_type_body_elements = null;
  public create_type_body_elements get_create_type_body_elements() { return this.create_type_body_elements; }
  public void set_create_type_body_elements(create_type_body_elements value) {
    if (this.create_type_body_elements != null) { this.create_type_body_elements._setParent(null); }
    this.create_type_body_elements = value;
    if (this.create_type_body_elements != null) { this.create_type_body_elements._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.SQL92_RESERVED_CREATE != null) {
      visitor.visit(this.SQL92_RESERVED_CREATE);
    }
    if (this.REPLACE_VK != null) {
      visitor.visit(this.REPLACE_VK);
    }
    if (this.type_name != null) {
      this.type_name._walk(visitor);
    }
    if (this.create_type_body_elements != null) {
      this.create_type_body_elements._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.type_name != null) {
      result.add(this.type_name);
    }
    if (this.create_type_body_elements != null) {
      result.add(this.create_type_body_elements);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.type_name == child) {
      this.set_type_name((ru.barsopen.plsqlconverter.ast.typed.type_name)replacement);
      return;
    }
    if (this.create_type_body_elements == child) {
      this.set_create_type_body_elements((ru.barsopen.plsqlconverter.ast.typed.create_type_body_elements)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.CREATE_TYPE_BODY);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("CREATE_TYPE_BODY");
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
    if (SQL92_RESERVED_CREATE != null) {
      _result.addChild(SQL92_RESERVED_CREATE);
    }


    if (REPLACE_VK != null) {
      _result.addChild(REPLACE_VK);
    }


    if (type_name == null) { throw new RuntimeException(); }
    _result.addChild(type_name.unparse());


    if (create_type_body_elements == null) { throw new RuntimeException(); }
    _result.addChild(create_type_body_elements.unparse());


    return _result;
  }

}
