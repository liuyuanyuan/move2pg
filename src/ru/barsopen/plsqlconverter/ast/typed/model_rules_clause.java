package ru.barsopen.plsqlconverter.ast.typed;
public class model_rules_clause implements _baseNode {
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

  public java.util.List<model_rules_element> model_rules_elements = new java.util.ArrayList<model_rules_element>();
  public java.util.List<model_rules_element> get_model_rules_elements() { return this.model_rules_elements; }
  public void add_model_rules_elements(model_rules_element value) {
    insert_model_rules_elements(model_rules_elements.size(), value);
  }
  public void insert_model_rules_elements(int pos, model_rules_element value) {
    this.model_rules_elements.add(pos, value);
    value._setParent(this);
  }
  public void remove_model_rules_elements(int pos) {
    this.model_rules_elements.get(pos)._setParent(null);
    this.model_rules_elements.remove(pos);
  }
  public void remove_model_rules_elements(model_rules_element value) {
    this.remove_model_rules_elements(this.model_rules_elements.indexOf(value));
  }
  public model_rules_part model_rules_part = null;
  public model_rules_part get_model_rules_part() { return this.model_rules_part; }
  public void set_model_rules_part(model_rules_part value) {
    if (this.model_rules_part != null) { this.model_rules_part._setParent(null); }
    this.model_rules_part = value;
    if (this.model_rules_part != null) { this.model_rules_part._setParent(this); }
  }
  public boolean is_model_rules_part() { return this.model_rules_part != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    for (model_rules_element _value: this.model_rules_elements) {
      _value._walk(visitor);
    }
    if (this.model_rules_part != null) {
      this.model_rules_part._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    result.addAll(this.model_rules_elements);
    if (this.model_rules_part != null) {
      result.add(this.model_rules_part);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    for (int _i = 0; _i < this.model_rules_elements.size(); ++_i) {
      if (this.model_rules_elements.get(_i) == child) {
        this.remove_model_rules_elements(_i);
        this.insert_model_rules_elements(_i, (ru.barsopen.plsqlconverter.ast.typed.model_rules_element)replacement);
        return;
      }
    }
    if (this.model_rules_part == child) {
      this.set_model_rules_part((ru.barsopen.plsqlconverter.ast.typed.model_rules_part)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.MODEL_RULES);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("MODEL_RULES");
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
    if (model_rules_elements.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < model_rules_elements.size(); ++i) {
      _result.addChild(model_rules_elements.get(i).unparse());
    }


    if (model_rules_part != null) {
      _result.addChild(model_rules_part.unparse());
    }


    return _result;
  }

}
