package ru.barsopen.plsqlconverter.ast.typed;
public class merge_update_clause implements _baseNode {
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

  public java.util.List<merge_element> merge_elements = new java.util.ArrayList<merge_element>();
  public java.util.List<merge_element> get_merge_elements() { return this.merge_elements; }
  public void add_merge_elements(merge_element value) {
    insert_merge_elements(merge_elements.size(), value);
  }
  public void insert_merge_elements(int pos, merge_element value) {
    this.merge_elements.add(pos, value);
    value._setParent(this);
  }
  public void remove_merge_elements(int pos) {
    this.merge_elements.get(pos)._setParent(null);
    this.merge_elements.remove(pos);
  }
  public void remove_merge_elements(merge_element value) {
    this.remove_merge_elements(this.merge_elements.indexOf(value));
  }
  public where_clause where_clause = null;
  public where_clause get_where_clause() { return this.where_clause; }
  public void set_where_clause(where_clause value) {
    if (this.where_clause != null) { this.where_clause._setParent(null); }
    this.where_clause = value;
    if (this.where_clause != null) { this.where_clause._setParent(this); }
  }
  public boolean is_where_clause() { return this.where_clause != null; }
  public merge_update_delete_part merge_update_delete_part = null;
  public merge_update_delete_part get_merge_update_delete_part() { return this.merge_update_delete_part; }
  public void set_merge_update_delete_part(merge_update_delete_part value) {
    if (this.merge_update_delete_part != null) { this.merge_update_delete_part._setParent(null); }
    this.merge_update_delete_part = value;
    if (this.merge_update_delete_part != null) { this.merge_update_delete_part._setParent(this); }
  }
  public boolean is_merge_update_delete_part() { return this.merge_update_delete_part != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (merge_element _value: this.merge_elements) {
      _value._walk(visitor);
    }
    if (this.where_clause != null) {
      this.where_clause._walk(visitor);
    }
    if (this.merge_update_delete_part != null) {
      this.merge_update_delete_part._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.merge_elements);
    if (this.where_clause != null) {
      result.add(this.where_clause);
    }
    if (this.merge_update_delete_part != null) {
      result.add(this.merge_update_delete_part);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.merge_elements.size(); ++_i) {
      if (this.merge_elements.get(_i) == child) {
        this.remove_merge_elements(_i);
        this.insert_merge_elements(_i, (ru.barsopen.plsqlconverter.ast.typed.merge_element)replacement);
        return;
      }
    }
    if (this.where_clause == child) {
      this.set_where_clause((ru.barsopen.plsqlconverter.ast.typed.where_clause)replacement);
      return;
    }
    if (this.merge_update_delete_part == child) {
      this.set_merge_update_delete_part((ru.barsopen.plsqlconverter.ast.typed.merge_update_delete_part)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.MERGE_UPDATE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("MERGE_UPDATE");
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
    if (merge_elements.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < merge_elements.size(); ++i) {
      _result.addChild(merge_elements.get(i).unparse());
    }


    if (where_clause != null) {
      _result.addChild(where_clause.unparse());
    }


    if (merge_update_delete_part != null) {
      _result.addChild(merge_update_delete_part.unparse());
    }


    return _result;
  }

}
