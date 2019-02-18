package ru.barsopen.plsqlconverter.ast.typed;
public class pivot_clause implements _baseNode {
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

  public org.antlr.runtime.tree.Tree XML_VK = null;
  public org.antlr.runtime.tree.Tree get_XML_VK() { return this.XML_VK; }
  public void set_XML_VK(org.antlr.runtime.tree.Tree value) {
    this.XML_VK = value;
  }
  public boolean is_XML_VK() { return this.XML_VK != null; }
  public java.util.List<pivot_element> pivot_elements = new java.util.ArrayList<pivot_element>();
  public java.util.List<pivot_element> get_pivot_elements() { return this.pivot_elements; }
  public void add_pivot_elements(pivot_element value) {
    insert_pivot_elements(pivot_elements.size(), value);
  }
  public void insert_pivot_elements(int pos, pivot_element value) {
    this.pivot_elements.add(pos, value);
    value._setParent(this);
  }
  public void remove_pivot_elements(int pos) {
    this.pivot_elements.get(pos)._setParent(null);
    this.pivot_elements.remove(pos);
  }
  public void remove_pivot_elements(pivot_element value) {
    this.remove_pivot_elements(this.pivot_elements.indexOf(value));
  }
  public pivot_for_clause pivot_for_clause = null;
  public pivot_for_clause get_pivot_for_clause() { return this.pivot_for_clause; }
  public void set_pivot_for_clause(pivot_for_clause value) {
    if (this.pivot_for_clause != null) { this.pivot_for_clause._setParent(null); }
    this.pivot_for_clause = value;
    if (this.pivot_for_clause != null) { this.pivot_for_clause._setParent(this); }
  }
  public pivot_in_clause pivot_in_clause = null;
  public pivot_in_clause get_pivot_in_clause() { return this.pivot_in_clause; }
  public void set_pivot_in_clause(pivot_in_clause value) {
    if (this.pivot_in_clause != null) { this.pivot_in_clause._setParent(null); }
    this.pivot_in_clause = value;
    if (this.pivot_in_clause != null) { this.pivot_in_clause._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.XML_VK != null) {
      visitor.visit(this.XML_VK);
    }
    for (pivot_element _value: this.pivot_elements) {
      _value._walk(visitor);
    }
    if (this.pivot_for_clause != null) {
      this.pivot_for_clause._walk(visitor);
    }
    if (this.pivot_in_clause != null) {
      this.pivot_in_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.pivot_elements);
    if (this.pivot_for_clause != null) {
      result.add(this.pivot_for_clause);
    }
    if (this.pivot_in_clause != null) {
      result.add(this.pivot_in_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.pivot_elements.size(); ++_i) {
      if (this.pivot_elements.get(_i) == child) {
        this.remove_pivot_elements(_i);
        this.insert_pivot_elements(_i, (ru.barsopen.plsqlconverter.ast.typed.pivot_element)replacement);
        return;
      }
    }
    if (this.pivot_for_clause == child) {
      this.set_pivot_for_clause((ru.barsopen.plsqlconverter.ast.typed.pivot_for_clause)replacement);
      return;
    }
    if (this.pivot_in_clause == child) {
      this.set_pivot_in_clause((ru.barsopen.plsqlconverter.ast.typed.pivot_in_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.PIVOT_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("PIVOT_VK");
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
    if (XML_VK != null) {
      _result.addChild(XML_VK);
    }


    if (pivot_elements.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < pivot_elements.size(); ++i) {
      _result.addChild(pivot_elements.get(i).unparse());
    }


    if (pivot_for_clause == null) { throw new RuntimeException(); }
    _result.addChild(pivot_for_clause.unparse());


    if (pivot_in_clause == null) { throw new RuntimeException(); }
    _result.addChild(pivot_in_clause.unparse());


    return _result;
  }

}
