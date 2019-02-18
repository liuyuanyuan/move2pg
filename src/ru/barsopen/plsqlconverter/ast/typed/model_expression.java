package ru.barsopen.plsqlconverter.ast.typed;
public class model_expression implements _baseNode {
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

  public expression_element expression_element = null;
  public expression_element get_expression_element() { return this.expression_element; }
  public void set_expression_element(expression_element value) {
    if (this.expression_element != null) { this.expression_element._setParent(null); }
    this.expression_element = value;
    if (this.expression_element != null) { this.expression_element._setParent(this); }
  }
  public java.util.List<model_expression_element> model_expression_elements = new java.util.ArrayList<model_expression_element>();
  public java.util.List<model_expression_element> get_model_expression_elements() { return this.model_expression_elements; }
  public void add_model_expression_elements(model_expression_element value) {
    insert_model_expression_elements(model_expression_elements.size(), value);
  }
  public void insert_model_expression_elements(int pos, model_expression_element value) {
    this.model_expression_elements.add(pos, value);
    value._setParent(this);
  }
  public void remove_model_expression_elements(int pos) {
    this.model_expression_elements.get(pos)._setParent(null);
    this.model_expression_elements.remove(pos);
  }
  public void remove_model_expression_elements(model_expression_element value) {
    this.remove_model_expression_elements(this.model_expression_elements.indexOf(value));
  }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.expression_element != null) {
      this.expression_element._walk(visitor);
    }
    for (model_expression_element _value: this.model_expression_elements) {
      _value._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.expression_element != null) {
      result.add(this.expression_element);
    }
    result.addAll(this.model_expression_elements);
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.expression_element == child) {
      this.set_expression_element((ru.barsopen.plsqlconverter.ast.typed.expression_element)replacement);
      return;
    }
    for (int _i = 0; _i < this.model_expression_elements.size(); ++_i) {
      if (this.model_expression_elements.get(_i) == child) {
        this.remove_model_expression_elements(_i);
        this.insert_model_expression_elements(_i, (ru.barsopen.plsqlconverter.ast.typed.model_expression_element)replacement);
        return;
      }
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.MODEL_EXPRESSION);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("MODEL_EXPRESSION");
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
    if (expression_element == null) { throw new RuntimeException(); }
    _result.addChild(expression_element.unparse());


    if (model_expression_elements.size() == 0) { throw new RuntimeException(); }
    for (int i = 0; i < model_expression_elements.size(); ++i) {
      _result.addChild(model_expression_elements.get(i).unparse());
    }


    return _result;
  }

}
