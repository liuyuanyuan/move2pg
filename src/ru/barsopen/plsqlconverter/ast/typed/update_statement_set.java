package ru.barsopen.plsqlconverter.ast.typed;
public class update_statement_set implements _baseNode {
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

  public java.util.List<update_set_elements> update_set_elementss = new java.util.ArrayList<update_set_elements>();
  public java.util.List<update_set_elements> get_update_set_elementss() { return this.update_set_elementss; }
  public void add_update_set_elementss(update_set_elements value) {
    insert_update_set_elementss(update_set_elementss.size(), value);
  }
  public void insert_update_set_elementss(int pos, update_set_elements value) {
    this.update_set_elementss.add(pos, value);
    value._setParent(this);
  }
  public void remove_update_set_elementss(int pos) {
    this.update_set_elementss.get(pos)._setParent(null);
    this.update_set_elementss.remove(pos);
  }
  public void remove_update_set_elementss(update_set_elements value) {
    this.remove_update_set_elementss(this.update_set_elementss.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (update_set_elements _value: this.update_set_elementss) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.update_set_elementss);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.update_set_elementss.size(); ++_i) {
      if (this.update_set_elementss.get(_i) == child) {
        this.remove_update_set_elementss(_i);
        this.insert_update_set_elementss(_i, (ru.barsopen.plsqlconverter.ast.typed.update_set_elements)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SET_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SET_VK");
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
    if (update_set_elementss.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < update_set_elementss.size(); ++i) {
      _result.addChild(update_set_elementss.get(i).unparse());
    }


    return _result;
  }

}
