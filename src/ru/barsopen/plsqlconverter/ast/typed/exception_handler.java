package ru.barsopen.plsqlconverter.ast.typed;
public class exception_handler implements _baseNode {
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

  public java.util.List<exception_name> exception_names = new java.util.ArrayList<exception_name>();
  public java.util.List<exception_name> get_exception_names() { return this.exception_names; }
  public void add_exception_names(exception_name value) {
    insert_exception_names(exception_names.size(), value);
  }
  public void insert_exception_names(int pos, exception_name value) {
    this.exception_names.add(pos, value);
    value._setParent(this);
  }
  public void remove_exception_names(int pos) {
    this.exception_names.get(pos)._setParent(null);
    this.exception_names.remove(pos);
  }
  public void remove_exception_names(exception_name value) {
    this.remove_exception_names(this.exception_names.indexOf(value));
  }
  public seq_of_statements seq_of_statements = null;
  public seq_of_statements get_seq_of_statements() { return this.seq_of_statements; }
  public void set_seq_of_statements(seq_of_statements value) {
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(null); }
    this.seq_of_statements = value;
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (exception_name _value: this.exception_names) {
      _value._walk(visitor);
    }
    if (this.seq_of_statements != null) {
      this.seq_of_statements._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.exception_names);
    if (this.seq_of_statements != null) {
      result.add(this.seq_of_statements);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.exception_names.size(); ++_i) {
      if (this.exception_names.get(_i) == child) {
        this.remove_exception_names(_i);
        this.insert_exception_names(_i, (ru.barsopen.plsqlconverter.ast.typed.exception_name)replacement);
        return;
      }
    }
    if (this.seq_of_statements == child) {
      this.set_seq_of_statements((ru.barsopen.plsqlconverter.ast.typed.seq_of_statements)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL92_RESERVED_WHEN);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_WHEN");
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
    if (exception_names.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < exception_names.size(); ++i) {
      _result.addChild(exception_names.get(i).unparse());
    }


    if (seq_of_statements == null) { throw new RuntimeException(); }
    _result.addChild(seq_of_statements.unparse());


    return _result;
  }

}
