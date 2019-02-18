package ru.barsopen.plsqlconverter.ast.typed;
public class hierarchical_query_clause implements _baseNode {
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

  public start_part start_part = null;
  public start_part get_start_part() { return this.start_part; }
  public void set_start_part(start_part value) {
    if (this.start_part != null) { this.start_part._setParent(null); }
    this.start_part = value;
    if (this.start_part != null) { this.start_part._setParent(this); }
  }
  public boolean is_start_part() { return this.start_part != null; }
  public hierarchical_query_clause_connect hierarchical_query_clause_connect = null;
  public hierarchical_query_clause_connect get_hierarchical_query_clause_connect() { return this.hierarchical_query_clause_connect; }
  public void set_hierarchical_query_clause_connect(hierarchical_query_clause_connect value) {
    if (this.hierarchical_query_clause_connect != null) { this.hierarchical_query_clause_connect._setParent(null); }
    this.hierarchical_query_clause_connect = value;
    if (this.hierarchical_query_clause_connect != null) { this.hierarchical_query_clause_connect._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.start_part != null) {
      this.start_part._walk(visitor);
    }
    if (this.hierarchical_query_clause_connect != null) {
      this.hierarchical_query_clause_connect._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.start_part != null) {
      result.add(this.start_part);
    }
    if (this.hierarchical_query_clause_connect != null) {
      result.add(this.hierarchical_query_clause_connect);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.start_part == child) {
      this.set_start_part((ru.barsopen.plsqlconverter.ast.typed.start_part)replacement);
      return;
    }
    if (this.hierarchical_query_clause_connect == child) {
      this.set_hierarchical_query_clause_connect((ru.barsopen.plsqlconverter.ast.typed.hierarchical_query_clause_connect)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.HIERARCHICAL);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("HIERARCHICAL");
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
    if (start_part != null) {
      _result.addChild(start_part.unparse());
    }


    if (hierarchical_query_clause_connect == null) { throw new RuntimeException(); }
    _result.addChild(hierarchical_query_clause_connect.unparse());


    return _result;
  }

}
