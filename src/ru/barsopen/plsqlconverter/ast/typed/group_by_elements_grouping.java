package ru.barsopen.plsqlconverter.ast.typed;
public class group_by_elements_grouping implements group_by_elements, _baseNode {
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

  public java.util.List<groupin_set> groupin_sets = new java.util.ArrayList<groupin_set>();
  public java.util.List<groupin_set> get_groupin_sets() { return this.groupin_sets; }
  public void add_groupin_sets(groupin_set value) {
    insert_groupin_sets(groupin_sets.size(), value);
  }
  public void insert_groupin_sets(int pos, groupin_set value) {
    this.groupin_sets.add(pos, value);
    value._setParent(this);
  }
  public void remove_groupin_sets(int pos) {
    this.groupin_sets.get(pos)._setParent(null);
    this.groupin_sets.remove(pos);
  }
  public void remove_groupin_sets(groupin_set value) {
    this.remove_groupin_sets(this.groupin_sets.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (groupin_set _value: this.groupin_sets) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.groupin_sets);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.groupin_sets.size(); ++_i) {
      if (this.groupin_sets.get(_i) == child) {
        this.remove_groupin_sets(_i);
        this.insert_groupin_sets(_i, (ru.barsopen.plsqlconverter.ast.typed.groupin_set)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.GROUPING_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("GROUPING_VK");
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
    if (groupin_sets.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < groupin_sets.size(); ++i) {
      _result.addChild(groupin_sets.get(i).unparse());
    }


    return _result;
  }

}
