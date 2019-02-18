package ru.barsopen.plsqlconverter.ast.typed;
public class function_spec implements package_obj_spec, package_obj_body, _baseNode {
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

  public function_name function_name = null;
  public function_name get_function_name() { return this.function_name; }
  public void set_function_name(function_name value) {
    if (this.function_name != null) { this.function_name._setParent(null); }
    this.function_name = value;
    if (this.function_name != null) { this.function_name._setParent(this); }
  }
  public type_spec type_spec = null;
  public type_spec get_type_spec() { return this.type_spec; }
  public void set_type_spec(type_spec value) {
    if (this.type_spec != null) { this.type_spec._setParent(null); }
    this.type_spec = value;
    if (this.type_spec != null) { this.type_spec._setParent(this); }
  }
  public parameters parameters = null;
  public parameters get_parameters() { return this.parameters; }
  public void set_parameters(parameters value) {
    if (this.parameters != null) { this.parameters._setParent(null); }
    this.parameters = value;
    if (this.parameters != null) { this.parameters._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree PIPELINED_VK = null;
  public org.antlr.runtime.tree.Tree get_PIPELINED_VK() { return this.PIPELINED_VK; }
  public void set_PIPELINED_VK(org.antlr.runtime.tree.Tree value) {
    this.PIPELINED_VK = value;
  }
  public boolean is_PIPELINED_VK() { return this.PIPELINED_VK != null; }
  public org.antlr.runtime.tree.Tree RESULT_CACHE_VK = null;
  public org.antlr.runtime.tree.Tree get_RESULT_CACHE_VK() { return this.RESULT_CACHE_VK; }
  public void set_RESULT_CACHE_VK(org.antlr.runtime.tree.Tree value) {
    this.RESULT_CACHE_VK = value;
  }
  public boolean is_RESULT_CACHE_VK() { return this.RESULT_CACHE_VK != null; }
  public org.antlr.runtime.tree.Tree DETERMINISTIC_VK = null;
  public org.antlr.runtime.tree.Tree get_DETERMINISTIC_VK() { return this.DETERMINISTIC_VK; }
  public void set_DETERMINISTIC_VK(org.antlr.runtime.tree.Tree value) {
    this.DETERMINISTIC_VK = value;
  }
  public boolean is_DETERMINISTIC_VK() { return this.DETERMINISTIC_VK != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.function_name != null) {
      this.function_name._walk(visitor);
    }
    if (this.type_spec != null) {
      this.type_spec._walk(visitor);
    }
    if (this.parameters != null) {
      this.parameters._walk(visitor);
    }
    if (this.PIPELINED_VK != null) {
      visitor.visit(this.PIPELINED_VK);
    }
    if (this.RESULT_CACHE_VK != null) {
      visitor.visit(this.RESULT_CACHE_VK);
    }
    if (this.DETERMINISTIC_VK != null) {
      visitor.visit(this.DETERMINISTIC_VK);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.function_name != null) {
      result.add(this.function_name);
    }
    if (this.type_spec != null) {
      result.add(this.type_spec);
    }
    if (this.parameters != null) {
      result.add(this.parameters);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.function_name == child) {
      this.set_function_name((ru.barsopen.plsqlconverter.ast.typed.function_name)replacement);
      return;
    }
    if (this.type_spec == child) {
      this.set_type_spec((ru.barsopen.plsqlconverter.ast.typed.type_spec)replacement);
      return;
    }
    if (this.parameters == child) {
      this.set_parameters((ru.barsopen.plsqlconverter.ast.typed.parameters)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.FUNCTION_SPEC);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("FUNCTION_SPEC");
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
    if (function_name == null) { throw new RuntimeException(); }
    _result.addChild(function_name.unparse());


    if (type_spec == null) { throw new RuntimeException(); }
    _result.addChild(type_spec.unparse());


    if (parameters == null) { throw new RuntimeException(); }
    _result.addChild(parameters.unparse());


    if (PIPELINED_VK != null) {
      _result.addChild(PIPELINED_VK);
    }


    if (RESULT_CACHE_VK != null) {
      _result.addChild(RESULT_CACHE_VK);
    }


    if (DETERMINISTIC_VK != null) {
      _result.addChild(DETERMINISTIC_VK);
    }


    return _result;
  }

}
