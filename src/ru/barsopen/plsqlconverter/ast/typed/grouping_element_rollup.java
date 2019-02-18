package ru.barsopen.plsqlconverter.ast.typed;
public class grouping_element_rollup implements grouping_element, _baseNode {
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

  public java.util.List<grouping_element> grouping_elements = new java.util.ArrayList<grouping_element>();
  public java.util.List<grouping_element> get_grouping_elements() { return this.grouping_elements; }
  public void add_grouping_elements(grouping_element value) {
    insert_grouping_elements(grouping_elements.size(), value);
  }
  public void insert_grouping_elements(int pos, grouping_element value) {
    this.grouping_elements.add(pos, value);
    value._setParent(this);
  }
  public void remove_grouping_elements(int pos) {
    this.grouping_elements.get(pos)._setParent(null);
    this.grouping_elements.remove(pos);
  }
  public void remove_grouping_elements(grouping_element value) {
    this.remove_grouping_elements(this.grouping_elements.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (grouping_element _value: this.grouping_elements) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.grouping_elements);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.grouping_elements.size(); ++_i) {
      if (this.grouping_elements.get(_i) == child) {
        this.remove_grouping_elements(_i);
        this.insert_grouping_elements(_i, (ru.barsopen.plsqlconverter.ast.typed.grouping_element)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.ROLLUP_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("ROLLUP_VK");
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
    if (grouping_elements.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < grouping_elements.size(); ++i) {
      _result.addChild(grouping_elements.get(i).unparse());
    }


    return _result;
  }

}
