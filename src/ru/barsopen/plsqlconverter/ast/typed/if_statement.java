package ru.barsopen.plsqlconverter.ast.typed;
public class if_statement implements statement, _baseNode {
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

  public expression expression = null;
  public expression get_expression() { return this.expression; }
  public void set_expression(expression value) {
    if (this.expression != null) { this.expression._setParent(null); }
    this.expression = value;
    if (this.expression != null) { this.expression._setParent(this); }
  }
  public seq_of_statements seq_of_statements = null;
  public seq_of_statements get_seq_of_statements() { return this.seq_of_statements; }
  public void set_seq_of_statements(seq_of_statements value) {
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(null); }
    this.seq_of_statements = value;
    if (this.seq_of_statements != null) { this.seq_of_statements._setParent(this); }
  }
  public java.util.List<elsif_part> elsif_parts = new java.util.ArrayList<elsif_part>();
  public java.util.List<elsif_part> get_elsif_parts() { return this.elsif_parts; }
  public void add_elsif_parts(elsif_part value) {
    insert_elsif_parts(elsif_parts.size(), value);
  }
  public void insert_elsif_parts(int pos, elsif_part value) {
    this.elsif_parts.add(pos, value);
    value._setParent(this);
  }
  public void remove_elsif_parts(int pos) {
    this.elsif_parts.get(pos)._setParent(null);
    this.elsif_parts.remove(pos);
  }
  public void remove_elsif_parts(elsif_part value) {
    this.remove_elsif_parts(this.elsif_parts.indexOf(value));
  }
  public else_part else_part = null;
  public else_part get_else_part() { return this.else_part; }
  public void set_else_part(else_part value) {
    if (this.else_part != null) { this.else_part._setParent(null); }
    this.else_part = value;
    if (this.else_part != null) { this.else_part._setParent(this); }
  }
  public boolean is_else_part() { return this.else_part != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.expression != null) {
      this.expression._walk(visitor);
    }
    if (this.seq_of_statements != null) {
      this.seq_of_statements._walk(visitor);
    }
    for (elsif_part _value: this.elsif_parts) {
      _value._walk(visitor);
    }
    if (this.else_part != null) {
      this.else_part._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.expression != null) {
      result.add(this.expression);
    }
    if (this.seq_of_statements != null) {
      result.add(this.seq_of_statements);
    }
    result.addAll(this.elsif_parts);
    if (this.else_part != null) {
      result.add(this.else_part);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.expression == child) {
      this.set_expression((ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
      return;
    }
    if (this.seq_of_statements == child) {
      this.set_seq_of_statements((ru.barsopen.plsqlconverter.ast.typed.seq_of_statements)replacement);
      return;
    }
    for (int _i = 0; _i < this.elsif_parts.size(); ++_i) {
      if (this.elsif_parts.get(_i) == child) {
        this.remove_elsif_parts(_i);
        this.insert_elsif_parts(_i, (ru.barsopen.plsqlconverter.ast.typed.elsif_part)replacement);
        return;
      }
    }
    if (this.else_part == child) {
      this.set_else_part((ru.barsopen.plsqlconverter.ast.typed.else_part)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.PLSQL_RESERVED_IF);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("PLSQL_RESERVED_IF");
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
    if (expression == null) { throw new RuntimeException(); }
    _result.addChild(expression.unparse());


    if (seq_of_statements == null) { throw new RuntimeException(); }
    _result.addChild(seq_of_statements.unparse());


    for (int i = 0; i < elsif_parts.size(); ++i) {
      _result.addChild(elsif_parts.get(i).unparse());
    }


    if (else_part != null) {
      _result.addChild(else_part.unparse());
    }


    return _result;
  }

}
