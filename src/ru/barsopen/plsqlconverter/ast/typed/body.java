package ru.barsopen.plsqlconverter.ast.typed;
public class body implements statement, _baseNode {
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
  public boolean is_label_name() { return this.label_name != null; }
  public seq_of_statements seq_of_statements = null;
  public seq_of_statements get_seq_of_statements() { return this.seq_of_statements; }
  public void set_seq_of_statements(seq_of_statements value) {
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(null); }
    this.seq_of_statements = value;
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(this); }
  }
  public exception_clause exception_clause = null;
  public exception_clause get_exception_clause() { return this.exception_clause; }
  public void set_exception_clause(exception_clause value) {
    if (this.exception_clause != null) { this.exception_clause._setParent(null); }
    this.exception_clause = value;
    if (this.exception_clause != null) { this.exception_clause._setParent(this); }
  }
  public boolean is_exception_clause() { return this.exception_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.label_name != null) {
      this.label_name._walk(visitor);
    }
    if (this.seq_of_statements != null) {
      this.seq_of_statements._walk(visitor);
    }
    if (this.exception_clause != null) {
      this.exception_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.label_name != null) {
      result.add(this.label_name);
    }
    if (this.seq_of_statements != null) {
      result.add(this.seq_of_statements);
    }
    if (this.exception_clause != null) {
      result.add(this.exception_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.label_name == child) {
      this.set_label_name((ru.barsopen.plsqlconverter.ast.typed.label_name)replacement);
      return;
    }
    if (this.seq_of_statements == child) {
      this.set_seq_of_statements((ru.barsopen.plsqlconverter.ast.typed.seq_of_statements)replacement);
      return;
    }
    if (this.exception_clause == child) {
      this.set_exception_clause((ru.barsopen.plsqlconverter.ast.typed.exception_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.BODY);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("BODY");
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
    if (label_name != null) {
      _result.addChild(label_name.unparse());
    }


    if (seq_of_statements == null) { throw new RuntimeException(); }
    _result.addChild(seq_of_statements.unparse());


    if (exception_clause != null) {
      _result.addChild(exception_clause.unparse());
    }


    return _result;
  }

}
