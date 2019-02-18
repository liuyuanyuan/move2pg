package ru.barsopen.plsqlconverter.ast.typed;
public class pgsql_raise_statement implements statement, _baseNode {
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

  public pgsql_raise_level pgsql_raise_level = null;
  public pgsql_raise_level get_pgsql_raise_level() { return this.pgsql_raise_level; }
  public void set_pgsql_raise_level(pgsql_raise_level value) {
    if (this.pgsql_raise_level != null) { this.pgsql_raise_level._setParent(null); }
    this.pgsql_raise_level = value;
    if (this.pgsql_raise_level != null) { this.pgsql_raise_level._setParent(this); }
  }
  public constant_char_string format = null;
  public constant_char_string get_format() { return this.format; }
  public void set_format(constant_char_string value) {
    if (this.format != null) { this.format._setParent(null); }
    this.format = value;
    if (this.format != null) { this.format._setParent(this); }
  }
  public java.util.List<expression> expressions = new java.util.ArrayList<expression>();
  public java.util.List<expression> get_expressions() { return this.expressions; }
  public void add_expressions(expression value) {
    insert_expressions(expressions.size(), value);
  }
  public void insert_expressions(int pos, expression value) {
    this.expressions.add(pos, value);
    value._setParent(this);
  }
  public void remove_expressions(int pos) {
    this.expressions.get(pos)._setParent(null);
    this.expressions.remove(pos);
  }
  public void remove_expressions(expression value) {
    this.remove_expressions(this.expressions.indexOf(value));
  }
  public pgsql_raise_using_options using = null;
  public pgsql_raise_using_options get_using() { return this.using; }
  public void set_using(pgsql_raise_using_options value) {
    if (this.using != null) { this.using._setParent(null); }
    this.using = value;
    if (this.using != null) { this.using._setParent(this); }
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.pgsql_raise_level != null) {
      this.pgsql_raise_level._walk(visitor);
    }
    if (this.format != null) {
      this.format._walk(visitor);
    }
    for (expression _value: this.expressions) {
      _value._walk(visitor);
    }
    if (this.using != null) {
      this.using._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.pgsql_raise_level != null) {
      result.add(this.pgsql_raise_level);
    }
    if (this.format != null) {
      result.add(this.format);
    }
    result.addAll(this.expressions);
    if (this.using != null) {
      result.add(this.using);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.pgsql_raise_level == child) {
      this.set_pgsql_raise_level((ru.barsopen.plsqlconverter.ast.typed.pgsql_raise_level)replacement);
      return;
    }
    if (this.format == child) {
      this.set_format((ru.barsopen.plsqlconverter.ast.typed.constant_char_string)replacement);
      return;
    }
    for (int _i = 0; _i < this.expressions.size(); ++_i) {
      if (this.expressions.get(_i) == child) {
        this.remove_expressions(_i);
        this.insert_expressions(_i, (ru.barsopen.plsqlconverter.ast.typed.expression)replacement);
        return;
      }
    }
    if (this.using == child) {
      this.set_using((ru.barsopen.plsqlconverter.ast.typed.pgsql_raise_using_options)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.PGSQL_RAISE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("PGSQL_RAISE");
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
    if (pgsql_raise_level == null) { throw new RuntimeException(); }
    _result.addChild(pgsql_raise_level.unparse());


    if (format == null) { throw new RuntimeException(); }
    _result.addChild(format.unparse());


    for (int i = 0; i < expressions.size(); ++i) {
      _result.addChild(expressions.get(i).unparse());
    }


    if (using != null) {
      _result.addChild(using.unparse());
    }


    return _result;
  }

}
