package ru.barsopen.plsqlconverter.ast.typed;
public class block implements statement, _baseNode {
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

  public java.util.List<declare_spec> declare_specs = new java.util.ArrayList<declare_spec>();
  public java.util.List<declare_spec> get_declare_specs() { return this.declare_specs; }
  public void add_declare_specs(declare_spec value) {
    insert_declare_specs(declare_specs.size(), value);
  }
  public void insert_declare_specs(int pos, declare_spec value) {
    this.declare_specs.add(pos, value);
    value._setParent(this);
  }
  public void remove_declare_specs(int pos) {
    this.declare_specs.get(pos)._setParent(null);
    this.declare_specs.remove(pos);
  }
  public void remove_declare_specs(declare_spec value) {
    this.remove_declare_specs(this.declare_specs.indexOf(value));
  }
  public body body = null;
  public body get_body() { return this.body; }
  public void set_body(body value) {
    if (this.body != null) { this.body._setParent(null); }
    this.body = value;
    if (this.body != null) { this.body._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (declare_spec _value: this.declare_specs) {
      _value._walk(visitor);
    }
    if (this.body != null) {
      this.body._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.declare_specs);
    if (this.body != null) {
      result.add(this.body);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.declare_specs.size(); ++_i) {
      if (this.declare_specs.get(_i) == child) {
        this.remove_declare_specs(_i);
        this.insert_declare_specs(_i, (ru.barsopen.plsqlconverter.ast.typed.declare_spec)replacement);
        return;
      }
    }
    if (this.body == child) {
      this.set_body((ru.barsopen.plsqlconverter.ast.typed.body)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.BLOCK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("BLOCK");
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
    for (int i = 0; i < declare_specs.size(); ++i) {
      _result.addChild(declare_specs.get(i).unparse());
    }


    if (body == null) { throw new RuntimeException(); }
    _result.addChild(body.unparse());


    return _result;
  }

}
