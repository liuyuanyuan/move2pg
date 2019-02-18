package ru.barsopen.plsqlconverter.ast.typed;
public class query_block implements subquery_basic_elements, _baseNode {
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

  public from_clause from_clause = null;
  public from_clause get_from_clause() { return this.from_clause; }
  public void set_from_clause(from_clause value) {
    if (this.from_clause != null) { this.from_clause._setParent(null); }
    this.from_clause = value;
    if (this.from_clause != null) { this.from_clause._setParent(this); }
  }
  public boolean is_from_clause() { return this.from_clause != null; }
  public org.antlr.runtime.tree.Tree SQL92_RESERVED_DISTINCT = null;
  public org.antlr.runtime.tree.Tree get_SQL92_RESERVED_DISTINCT() { return this.SQL92_RESERVED_DISTINCT; }
  public void set_SQL92_RESERVED_DISTINCT(org.antlr.runtime.tree.Tree value) {
    this.SQL92_RESERVED_DISTINCT = value;
  }
  public boolean is_SQL92_RESERVED_DISTINCT() { return this.SQL92_RESERVED_DISTINCT != null; }
  public org.antlr.runtime.tree.Tree SQL92_RESERVED_UNIQUE = null;
  public org.antlr.runtime.tree.Tree get_SQL92_RESERVED_UNIQUE() { return this.SQL92_RESERVED_UNIQUE; }
  public void set_SQL92_RESERVED_UNIQUE(org.antlr.runtime.tree.Tree value) {
    this.SQL92_RESERVED_UNIQUE = value;
  }
  public boolean is_SQL92_RESERVED_UNIQUE() { return this.SQL92_RESERVED_UNIQUE != null; }
  public org.antlr.runtime.tree.Tree SQL92_RESERVED_ALL = null;
  public org.antlr.runtime.tree.Tree get_SQL92_RESERVED_ALL() { return this.SQL92_RESERVED_ALL; }
  public void set_SQL92_RESERVED_ALL(org.antlr.runtime.tree.Tree value) {
    this.SQL92_RESERVED_ALL = value;
  }
  public boolean is_SQL92_RESERVED_ALL() { return this.SQL92_RESERVED_ALL != null; }
  public query_block_projection query_block_projection = null;
  public query_block_projection get_query_block_projection() { return this.query_block_projection; }
  public void set_query_block_projection(query_block_projection value) {
    if (this.query_block_projection != null) { this.query_block_projection._setParent(null); }
    this.query_block_projection = value;
    if (this.query_block_projection != null) { this.query_block_projection._setParent(this); }
  }
  public into_clause into_clause = null;
  public into_clause get_into_clause() { return this.into_clause; }
  public void set_into_clause(into_clause value) {
    if (this.into_clause != null) { this.into_clause._setParent(null); }
    this.into_clause = value;
    if (this.into_clause != null) { this.into_clause._setParent(this); }
  }
  public boolean is_into_clause() { return this.into_clause != null; }
  public where_clause where_clause = null;
  public where_clause get_where_clause() { return this.where_clause; }
  public void set_where_clause(where_clause value) {
    if (this.where_clause != null) { this.where_clause._setParent(null); }
    this.where_clause = value;
    if (this.where_clause != null) { this.where_clause._setParent(this); }
  }
  public boolean is_where_clause() { return this.where_clause != null; }
  public hierarchical_query_clause hierarchical_query_clause = null;
  public hierarchical_query_clause get_hierarchical_query_clause() { return this.hierarchical_query_clause; }
  public void set_hierarchical_query_clause(hierarchical_query_clause value) {
    if (this.hierarchical_query_clause != null) { this.hierarchical_query_clause._setParent(null); }
    this.hierarchical_query_clause = value;
    if (this.hierarchical_query_clause != null) { this.hierarchical_query_clause._setParent(this); }
  }
  public boolean is_hierarchical_query_clause() { return this.hierarchical_query_clause != null; }
  public group_by_clause group_by_clause = null;
  public group_by_clause get_group_by_clause() { return this.group_by_clause; }
  public void set_group_by_clause(group_by_clause value) {
    if (this.group_by_clause != null) { this.group_by_clause._setParent(null); }
    this.group_by_clause = value;
    if (this.group_by_clause != null) { this.group_by_clause._setParent(this); }
  }
  public boolean is_group_by_clause() { return this.group_by_clause != null; }
  public model_clause model_clause = null;
  public model_clause get_model_clause() { return this.model_clause; }
  public void set_model_clause(model_clause value) {
    if (this.model_clause != null) { this.model_clause._setParent(null); }
    this.model_clause = value;
    if (this.model_clause != null) { this.model_clause._setParent(this); }
  }
  public boolean is_model_clause() { return this.model_clause != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.from_clause != null) {
      this.from_clause._walk(visitor);
    }
    if (this.SQL92_RESERVED_DISTINCT != null) {
      visitor.visit(this.SQL92_RESERVED_DISTINCT);
    }
    if (this.SQL92_RESERVED_UNIQUE != null) {
      visitor.visit(this.SQL92_RESERVED_UNIQUE);
    }
    if (this.SQL92_RESERVED_ALL != null) {
      visitor.visit(this.SQL92_RESERVED_ALL);
    }
    if (this.query_block_projection != null) {
      this.query_block_projection._walk(visitor);
    }
    if (this.into_clause != null) {
      this.into_clause._walk(visitor);
    }
    if (this.where_clause != null) {
      this.where_clause._walk(visitor);
    }
    if (this.hierarchical_query_clause != null) {
      this.hierarchical_query_clause._walk(visitor);
    }
    if (this.group_by_clause != null) {
      this.group_by_clause._walk(visitor);
    }
    if (this.model_clause != null) {
      this.model_clause._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.from_clause != null) {
      result.add(this.from_clause);
    }
    if (this.query_block_projection != null) {
      result.add(this.query_block_projection);
    }
    if (this.into_clause != null) {
      result.add(this.into_clause);
    }
    if (this.where_clause != null) {
      result.add(this.where_clause);
    }
    if (this.hierarchical_query_clause != null) {
      result.add(this.hierarchical_query_clause);
    }
    if (this.group_by_clause != null) {
      result.add(this.group_by_clause);
    }
    if (this.model_clause != null) {
      result.add(this.model_clause);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.from_clause == child) {
      this.set_from_clause((ru.barsopen.plsqlconverter.ast.typed.from_clause)replacement);
      return;
    }
    if (this.query_block_projection == child) {
      this.set_query_block_projection((ru.barsopen.plsqlconverter.ast.typed.query_block_projection)replacement);
      return;
    }
    if (this.into_clause == child) {
      this.set_into_clause((ru.barsopen.plsqlconverter.ast.typed.into_clause)replacement);
      return;
    }
    if (this.where_clause == child) {
      this.set_where_clause((ru.barsopen.plsqlconverter.ast.typed.where_clause)replacement);
      return;
    }
    if (this.hierarchical_query_clause == child) {
      this.set_hierarchical_query_clause((ru.barsopen.plsqlconverter.ast.typed.hierarchical_query_clause)replacement);
      return;
    }
    if (this.group_by_clause == child) {
      this.set_group_by_clause((ru.barsopen.plsqlconverter.ast.typed.group_by_clause)replacement);
      return;
    }
    if (this.model_clause == child) {
      this.set_model_clause((ru.barsopen.plsqlconverter.ast.typed.model_clause)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.SQL92_RESERVED_SELECT);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("SQL92_RESERVED_SELECT");
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
    if (from_clause != null) {
      _result.addChild(from_clause.unparse());
    }


    if (SQL92_RESERVED_DISTINCT != null) {
      _result.addChild(SQL92_RESERVED_DISTINCT);
    }


    if (SQL92_RESERVED_UNIQUE != null) {
      _result.addChild(SQL92_RESERVED_UNIQUE);
    }


    if (SQL92_RESERVED_ALL != null) {
      _result.addChild(SQL92_RESERVED_ALL);
    }


    if (query_block_projection == null) { throw new RuntimeException(); }
    _result.addChild(query_block_projection.unparse());


    if (into_clause != null) {
      _result.addChild(into_clause.unparse());
    }


    if (where_clause != null) {
      _result.addChild(where_clause.unparse());
    }


    if (hierarchical_query_clause != null) {
      _result.addChild(hierarchical_query_clause.unparse());
    }


    if (group_by_clause != null) {
      _result.addChild(group_by_clause.unparse());
    }


    if (model_clause != null) {
      _result.addChild(model_clause.unparse());
    }


    return _result;
  }

}
