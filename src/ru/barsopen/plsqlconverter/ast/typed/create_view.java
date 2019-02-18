package ru.barsopen.plsqlconverter.ast.typed;
public class create_view implements unit_statement, _baseNode {
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

  public org.antlr.runtime.tree.Tree REPLACE_VK = null;
  public org.antlr.runtime.tree.Tree get_REPLACE_VK() { return this.REPLACE_VK; }
  public void set_REPLACE_VK(org.antlr.runtime.tree.Tree value) {
    this.REPLACE_VK = value;
  }
  public boolean is_REPLACE_VK() { return this.REPLACE_VK != null; }
  public create_view_force_clause create_view_force_clause = null;
  public create_view_force_clause get_create_view_force_clause() { return this.create_view_force_clause; }
  public void set_create_view_force_clause(create_view_force_clause value) {
    if (this.create_view_force_clause != null) { this.create_view_force_clause._setParent(null); }
    this.create_view_force_clause = value;
    if (this.create_view_force_clause != null) { this.create_view_force_clause._setParent(this); }
  }
  public boolean is_create_view_force_clause() { return this.create_view_force_clause != null; }
  public view_name view_name = null;
  public view_name get_view_name() { return this.view_name; }
  public void set_view_name(view_name value) {
    if (this.view_name != null) { this.view_name._setParent(null); }
    this.view_name = value;
    if (this.view_name != null) { this.view_name._setParent(this); }
  }
  public view_type_clause view_type_clause = null;
  public view_type_clause get_view_type_clause() { return this.view_type_clause; }
  public void set_view_type_clause(view_type_clause value) {
    if (this.view_type_clause != null) { this.view_type_clause._setParent(null); }
    this.view_type_clause = value;
    if (this.view_type_clause != null) { this.view_type_clause._setParent(this); }
  }
  public boolean is_view_type_clause() { return this.view_type_clause != null; }
  public subquery subquery = null;
  public subquery get_subquery() { return this.subquery; }
  public void set_subquery(subquery value) {
    if (this.subquery != null) { this.subquery._setParent(null); }
    this.subquery = value;
    if (this.subquery != null) { this.subquery._setParent(this); }
  }
  public subquery_restriction_clause subquery_restriction_clause = null;
  public subquery_restriction_clause get_subquery_restriction_clause() { return this.subquery_restriction_clause; }
  public void set_subquery_restriction_clause(subquery_restriction_clause value) {
    if (this.subquery_restriction_clause != null) { this.subquery_restriction_clause._setParent(null); }
    this.subquery_restriction_clause = value;
    if (this.subquery_restriction_clause != null) { this.subquery_restriction_clause._setParent(this); }
  }
  public boolean is_subquery_restriction_clause() { return this.subquery_restriction_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.REPLACE_VK != null) {
      visitor.visit(this.REPLACE_VK);
    }
    if (this.create_view_force_clause != null) {
      this.create_view_force_clause._walk(visitor);
    }
    if (this.view_name != null) {
      this.view_name._walk(visitor);
    }
    if (this.view_type_clause != null) {
      this.view_type_clause._walk(visitor);
    }
    if (this.subquery != null) {
      this.subquery._walk(visitor);
    }
    if (this.subquery_restriction_clause != null) {
      this.subquery_restriction_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.create_view_force_clause != null) {
      result.add(this.create_view_force_clause);
    }
    if (this.view_name != null) {
      result.add(this.view_name);
    }
    if (this.view_type_clause != null) {
      result.add(this.view_type_clause);
    }
    if (this.subquery != null) {
      result.add(this.subquery);
    }
    if (this.subquery_restriction_clause != null) {
      result.add(this.subquery_restriction_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.create_view_force_clause == child) {
      this.set_create_view_force_clause((ru.barsopen.plsqlconverter.ast.typed.create_view_force_clause)replacement);
      return;
    }
    if (this.view_name == child) {
      this.set_view_name((ru.barsopen.plsqlconverter.ast.typed.view_name)replacement);
      return;
    }
    if (this.view_type_clause == child) {
      this.set_view_type_clause((ru.barsopen.plsqlconverter.ast.typed.view_type_clause)replacement);
      return;
    }
    if (this.subquery == child) {
      this.set_subquery((ru.barsopen.plsqlconverter.ast.typed.subquery)replacement);
      return;
    }
    if (this.subquery_restriction_clause == child) {
      this.set_subquery_restriction_clause((ru.barsopen.plsqlconverter.ast.typed.subquery_restriction_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.CREATE_VIEW);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("CREATE_VIEW");
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
    if (REPLACE_VK != null) {
      _result.addChild(REPLACE_VK);
    }


    if (create_view_force_clause != null) {
      _result.addChild(create_view_force_clause.unparse());
    }


    if (view_name == null) { throw new RuntimeException(); }
    _result.addChild(view_name.unparse());


    if (view_type_clause != null) {
      _result.addChild(view_type_clause.unparse());
    }


    if (subquery == null) { throw new RuntimeException(); }
    _result.addChild(subquery.unparse());


    if (subquery_restriction_clause != null) {
      _result.addChild(subquery_restriction_clause.unparse());
    }


    return _result;
  }

}
