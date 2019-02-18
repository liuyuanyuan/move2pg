package ru.barsopen.plsqlconverter.ast.typed;
public class labeled_statement implements stat_or_label, _baseNode {
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

  public label_name label_name = null;
  public label_name get_label_name() { return this.label_name; }
  public void set_label_name(label_name value) {
    if (this.label_name != null) { this.label_name._setParent(null); }
    this.label_name = value;
    if (this.label_name != null) { this.label_name._setParent(this); }
  }
  public statement statement = null;
  public statement get_statement() { return this.statement; }
  public void set_statement(statement value) {
    if (this.statement != null) { this.statement._setParent(null); }
    this.statement = value;
    if (this.statement != null) { this.statement._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.label_name != null) {
      this.label_name._walk(visitor);
    }
    if (this.statement != null) {
      this.statement._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.label_name != null) {
      result.add(this.label_name);
    }
    if (this.statement != null) {
      result.add(this.statement);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.label_name == child) {
      this.set_label_name((ru.barsopen.plsqlconverter.ast.typed.label_name)replacement);
      return;
    }
    if (this.statement == child) {
      this.set_statement((ru.barsopen.plsqlconverter.ast.typed.statement)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.LABEL_DECLARE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("LABEL_DECLARE");
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
    if (label_name == null) { throw new RuntimeException(); }
    _result.addChild(label_name.unparse());


    if (statement == null) { throw new RuntimeException(); }
    _result.addChild(statement.unparse());


    return _result;
  }

}
