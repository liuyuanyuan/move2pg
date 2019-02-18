package ru.barsopen.plsqlconverter.ast.typed;
public class subquery implements subquery_basic_elements, query_partition_clause_spec, expression_or_subquery, table_collection_expression, expression_element, in_elements, _baseNode {
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

  public subquery_basic_elements subquery_basic_elements = null;
  public subquery_basic_elements get_subquery_basic_elements() { return this.subquery_basic_elements; }
  public void set_subquery_basic_elements(subquery_basic_elements value) {
    if (this.subquery_basic_elements != null) { this.subquery_basic_elements._setParent(null); }
    this.subquery_basic_elements = value;
    if (this.subquery_basic_elements != null) { this.subquery_basic_elements._setParent(this); }
  }
  public java.util.List<subquery_operation_part> subquery_operation_parts = new java.util.ArrayList<subquery_operation_part>();
  public java.util.List<subquery_operation_part> get_subquery_operation_parts() { return this.subquery_operation_parts; }
  public void add_subquery_operation_parts(subquery_operation_part value) {
    insert_subquery_operation_parts(subquery_operation_parts.size(), value);
  }
  public void insert_subquery_operation_parts(int pos, subquery_operation_part value) {
    this.subquery_operation_parts.add(pos, value);
    value._setParent(this);
  }
  public void remove_subquery_operation_parts(int pos) {
    this.subquery_operation_parts.get(pos)._setParent(null);
    this.subquery_operation_parts.remove(pos);
  }
  public void remove_subquery_operation_parts(subquery_operation_part value) {
    this.remove_subquery_operation_parts(this.subquery_operation_parts.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.subquery_basic_elements != null) {
      this.subquery_basic_elements._walk(visitor);
    }
    for (subquery_operation_part _value: this.subquery_operation_parts) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.subquery_basic_elements != null) {
      result.add(this.subquery_basic_elements);
    }
    result.addAll(this.subquery_operation_parts);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.subquery_basic_elements == child) {
      this.set_subquery_basic_elements((ru.barsopen.plsqlconverter.ast.typed.subquery_basic_elements)replacement);
      return;
    }
    for (int _i = 0; _i < this.subquery_operation_parts.size(); ++_i) {
      if (this.subquery_operation_parts.get(_i) == child) {
        this.remove_subquery_operation_parts(_i);
        this.insert_subquery_operation_parts(_i, (ru.barsopen.plsqlconverter.ast.typed.subquery_operation_part)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SUBQUERY);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SUBQUERY");
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
    if (subquery_basic_elements == null) { throw new RuntimeException(); }
    _result.addChild(subquery_basic_elements.unparse());


    for (int i = 0; i < subquery_operation_parts.size(); ++i) {
      _result.addChild(subquery_operation_parts.get(i).unparse());
    }


    return _result;
  }

}
