package ru.barsopen.plsqlconverter.ast.typed;
public class insert_into_clause implements _baseNode {
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

  public general_table_ref general_table_ref = null;
  public general_table_ref get_general_table_ref() { return this.general_table_ref; }
  public void set_general_table_ref(general_table_ref value) {
    if (this.general_table_ref != null) { this.general_table_ref._setParent(null); }
    this.general_table_ref = value;
    if (this.general_table_ref != null) { this.general_table_ref._setParent(this); }
  }
  public insert_into_clause_columns insert_into_clause_columns = null;
  public insert_into_clause_columns get_insert_into_clause_columns() { return this.insert_into_clause_columns; }
  public void set_insert_into_clause_columns(insert_into_clause_columns value) {
    if (this.insert_into_clause_columns != null) { this.insert_into_clause_columns._setParent(null); }
    this.insert_into_clause_columns = value;
    if (this.insert_into_clause_columns != null) { this.insert_into_clause_columns._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.general_table_ref != null) {
      this.general_table_ref._walk(visitor);
    }
    if (this.insert_into_clause_columns != null) {
      this.insert_into_clause_columns._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.general_table_ref != null) {
      result.add(this.general_table_ref);
    }
    if (this.insert_into_clause_columns != null) {
      result.add(this.insert_into_clause_columns);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.general_table_ref == child) {
      this.set_general_table_ref((ru.barsopen.plsqlconverter.ast.typed.general_table_ref)replacement);
      return;
    }
    if (this.insert_into_clause_columns == child) {
      this.set_insert_into_clause_columns((ru.barsopen.plsqlconverter.ast.typed.insert_into_clause_columns)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL92_RESERVED_INTO);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_INTO");
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
    if (general_table_ref == null) { throw new RuntimeException(); }
    _result.addChild(general_table_ref.unparse());


    if (insert_into_clause_columns == null) { throw new RuntimeException(); }
    _result.addChild(insert_into_clause_columns.unparse());


    return _result;
  }

}
