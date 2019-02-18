package ru.barsopen.plsqlconverter.ast.typed;
public class native_datatype_spec implements type_spec, _baseNode {
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

  public org.antlr.runtime.tree.Tree name = null;
  public org.antlr.runtime.tree.Tree get_name() { return this.name; }
  public void set_name(org.antlr.runtime.tree.Tree value) {
    this.name = value;
  }
  public type_precision type_precision = null;
  public type_precision get_type_precision() { return this.type_precision; }
  public void set_type_precision(type_precision value) {
    if (this.type_precision != null) { this.type_precision._setParent(null); }
    this.type_precision = value;
    if (this.type_precision != null) { this.type_precision._setParent(this); }
  }
  public boolean is_type_precision() { return this.type_precision != null; }
  public org.antlr.runtime.tree.Tree TIME_VK = null;
  public org.antlr.runtime.tree.Tree get_TIME_VK() { return this.TIME_VK; }
  public void set_TIME_VK(org.antlr.runtime.tree.Tree value) {
    this.TIME_VK = value;
  }
  public boolean is_TIME_VK() { return this.TIME_VK != null; }
  public org.antlr.runtime.tree.Tree LOCAL_VK = null;
  public org.antlr.runtime.tree.Tree get_LOCAL_VK() { return this.LOCAL_VK; }
  public void set_LOCAL_VK(org.antlr.runtime.tree.Tree value) {
    this.LOCAL_VK = value;
  }
  public boolean is_LOCAL_VK() { return this.LOCAL_VK != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.name != null) {
      visitor.visit(this.name);
    }
    if (this.type_precision != null) {
      this.type_precision._walk(visitor);
    }
    if (this.TIME_VK != null) {
      visitor.visit(this.TIME_VK);
    }
    if (this.LOCAL_VK != null) {
      visitor.visit(this.LOCAL_VK);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.type_precision != null) {
      result.add(this.type_precision);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.type_precision == child) {
      this.set_type_precision((ru.barsopen.plsqlconverter.ast.typed.type_precision)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.NATIVE_DATATYPE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("NATIVE_DATATYPE");
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
    if (name == null) { throw new RuntimeException(); }
    _result.addChild(name);


    if (type_precision != null) {
      _result.addChild(type_precision.unparse());
    }


    if (TIME_VK != null) {
      _result.addChild(TIME_VK);
    }


    if (LOCAL_VK != null) {
      _result.addChild(LOCAL_VK);
    }


    return _result;
  }

}
