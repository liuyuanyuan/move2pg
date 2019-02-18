package ru.barsopen.plsqlconverter.ast.typed;
public class error_logging_clause implements _baseNode {
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

  public error_logging_into_part error_logging_into_part = null;
  public error_logging_into_part get_error_logging_into_part() { return this.error_logging_into_part; }
  public void set_error_logging_into_part(error_logging_into_part value) {
    if (this.error_logging_into_part != null) { this.error_logging_into_part._setParent(null); }
    this.error_logging_into_part = value;
    if (this.error_logging_into_part != null) { this.error_logging_into_part._setParent(this); }
  }
  public boolean is_error_logging_into_part() { return this.error_logging_into_part != null; }
  public expression expression = null;
  public expression get_expression() { return this.expression; }
  public void set_expression(expression value) {
    if (this.expression != null) { this.expression._setParent(null); }
    this.expression = value;
    if (this.expression != null) { this.expression._setParent(this); }
  }
  public boolean is_expression() { return this.expression != null; }
  public error_logging_reject_part error_logging_reject_part = null;
  public error_logging_reject_part get_error_logging_reject_part() { return this.error_logging_reject_part; }
  public void set_error_logging_reject_part(error_logging_reject_part value) {
    if (this.error_logging_reject_part != null) { this.error_logging_reject_part._setParent(null); }
    this.error_logging_reject_part = value;
    if (this.error_logging_reject_part != null) { this.error_logging_reject_part._setParent(this); }
  }
  public boolean is_error_logging_reject_part() { return this.error_logging_reject_part != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.error_logging_into_part != null) {
      this.error_logging_into_part._walk(visitor);
    }
    if (this.expression != null) {
      this.expression._walk(visitor);
    }
    if (this.error_logging_reject_part != null) {
      this.error_logging_reject_part._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.error_logging_into_part != null) {
      result.add(this.error_logging_into_part);
    }
    if (this.expression != null) {
      result.add(this.expression);
    }
    if (this.error_logging_reject_part != null) {
      result.add(this.error_logging_reject_part);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.error_logging_into_part == child) {
      this.set_error_logging_into_part((ru.barsopen.plsqlconverter.ast.typed.error_logging_into_part)replacement);
      return;
    }
    if (this.expression == child) {
      this.set_expression((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    if (this.error_logging_reject_part == child) {
      this.set_error_logging_reject_part((ru.barsopen.plsqlconverter.ast.typed.error_logging_reject_part)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.LOG_VK);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("LOG_VK");
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
    if (error_logging_into_part != null) {
      _result.addChild(error_logging_into_part.unparse());
    }


    if (expression != null) {
      _result.addChild(expression.unparse());
    }


    if (error_logging_reject_part != null) {
      _result.addChild(error_logging_reject_part.unparse());
    }


    return _result;
  }

}
