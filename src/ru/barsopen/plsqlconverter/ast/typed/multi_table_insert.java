package ru.barsopen.plsqlconverter.ast.typed;
public class multi_table_insert implements insert_statement_spec, _baseNode {
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

  public select_statement select_statement = null;
  public select_statement get_select_statement() { return this.select_statement; }
  public void set_select_statement(select_statement value) {
    if (this.select_statement != null) { this.select_statement._setParent(null); }
    this.select_statement = value;
    if (this.select_statement != null) { this.select_statement._setParent(this); }
  }
  public conditional_insert_clause conditional_insert_clause = null;
  public conditional_insert_clause get_conditional_insert_clause() { return this.conditional_insert_clause; }
  public void set_conditional_insert_clause(conditional_insert_clause value) {
    if (this.conditional_insert_clause != null) { this.conditional_insert_clause._setParent(null); }
    this.conditional_insert_clause = value;
    if (this.conditional_insert_clause != null) { this.conditional_insert_clause._setParent(this); }
  }
  public boolean is_conditional_insert_clause() { return this.conditional_insert_clause != null; }
  public java.util.List<multi_table_element> multi_table_elements = new java.util.ArrayList<multi_table_element>();
  public java.util.List<multi_table_element> get_multi_table_elements() { return this.multi_table_elements; }
  public void add_multi_table_elements(multi_table_element value) {
    insert_multi_table_elements(multi_table_elements.size(), value);
  }
  public void insert_multi_table_elements(int pos, multi_table_element value) {
    this.multi_table_elements.add(pos, value);
    value._setParent(this);
  }
  public void remove_multi_table_elements(int pos) {
    this.multi_table_elements.get(pos)._setParent(null);
    this.multi_table_elements.remove(pos);
  }
  public void remove_multi_table_elements(multi_table_element value) {
    this.remove_multi_table_elements(this.multi_table_elements.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.select_statement != null) {
      this.select_statement._walk(visitor);
    }
    if (this.conditional_insert_clause != null) {
      this.conditional_insert_clause._walk(visitor);
    }
    for (multi_table_element _value: this.multi_table_elements) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.select_statement != null) {
      result.add(this.select_statement);
    }
    if (this.conditional_insert_clause != null) {
      result.add(this.conditional_insert_clause);
    }
    result.addAll(this.multi_table_elements);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.select_statement == child) {
      this.set_select_statement((ru.barsopen.plsqlconverter.ast.typed.select_statement)replacement);
      return;
    }
    if (this.conditional_insert_clause == child) {
      this.set_conditional_insert_clause((ru.barsopen.plsqlconverter.ast.typed.conditional_insert_clause)replacement);
      return;
    }
    for (int _i = 0; _i < this.multi_table_elements.size(); ++_i) {
      if (this.multi_table_elements.get(_i) == child) {
        this.remove_multi_table_elements(_i);
        this.insert_multi_table_elements(_i, (ru.barsopen.plsqlconverter.ast.typed.multi_table_element)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.MULTI_TABLE_MODE);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("MULTI_TABLE_MODE");
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
    if (select_statement == null) { throw new RuntimeException(); }
    _result.addChild(select_statement.unparse());


    if (conditional_insert_clause != null) {
      _result.addChild(conditional_insert_clause.unparse());
    }


    for (int i = 0; i < multi_table_elements.size(); ++i) {
      _result.addChild(multi_table_elements.get(i).unparse());
    }


    return _result;
  }

}
