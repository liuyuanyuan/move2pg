package ru.barsopen.plsqlconverter.ast.typed;
public class routine_name implements _baseNode {
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

  public char_set_name char_set_name = null;
  public char_set_name get_char_set_name() { return this.char_set_name; }
  public void set_char_set_name(char_set_name value) {
    if (this.char_set_name != null) { this.char_set_name._setParent(null); }
    this.char_set_name = value;
    if (this.char_set_name != null) { this.char_set_name._setParent(this); }
  }
  public boolean is_char_set_name() { return this.char_set_name != null; }
  public java.util.List<id> ids = new java.util.ArrayList<id>();
  public java.util.List<id> get_ids() { return this.ids; }
  public void add_ids(id value) {
    insert_ids(ids.size(), value);
  }
  public void insert_ids(int pos, id value) {
    this.ids.add(pos, value);
    value._setParent(this);
  }
  public void remove_ids(int pos) {
    this.ids.get(pos)._setParent(null);
    this.ids.remove(pos);
  }
  public void remove_ids(id value) {
    this.remove_ids(this.ids.indexOf(value));
  }
  public link_name link_name = null;
  public link_name get_link_name() { return this.link_name; }
  public void set_link_name(link_name value) {
    if (this.link_name != null) { this.link_name._setParent(null); }
    this.link_name = value;
    if (this.link_name != null) { this.link_name._setParent(this); }
  }
  public boolean is_link_name() { return this.link_name != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.char_set_name != null) {
      this.char_set_name._walk(visitor);
    }
    for (id _value: this.ids) {
      _value._walk(visitor);
    }
    if (this.link_name != null) {
      this.link_name._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.char_set_name != null) {
      result.add(this.char_set_name);
    }
    result.addAll(this.ids);
    if (this.link_name != null) {
      result.add(this.link_name);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.char_set_name == child) {
      this.set_char_set_name((ru.barsopen.plsqlconverter.ast.typed.char_set_name)replacement);
      return;
    }
    for (int _i = 0; _i < this.ids.size(); ++_i) {
      if (this.ids.get(_i) == child) {
        this.remove_ids(_i);
        this.insert_ids(_i, (ru.barsopen.plsqlconverter.ast.typed.id)replacement);
        return;
      }
    }
    if (this.link_name == child) {
      this.set_link_name((ru.barsopen.plsqlconverter.ast.typed.link_name)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.ROUTINE_NAME);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("ROUTINE_NAME");
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
    if (char_set_name != null) {
      _result.addChild(char_set_name.unparse());
    }


    if (ids.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < ids.size(); ++i) {
      _result.addChild(ids.get(i).unparse());
    }


    if (link_name != null) {
      _result.addChild(link_name.unparse());
    }


    return _result;
  }

}
