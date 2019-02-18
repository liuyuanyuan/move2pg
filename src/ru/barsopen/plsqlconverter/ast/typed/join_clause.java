package ru.barsopen.plsqlconverter.ast.typed;
public class join_clause implements _baseNode {
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

  public query_partition_clause qpc1 = null;
  public query_partition_clause get_qpc1() { return this.qpc1; }
  public void set_qpc1(query_partition_clause value) {
    if (this.qpc1 != null) { this.qpc1._setParent(null); }
    this.qpc1 = value;
    if (this.qpc1 != null) { this.qpc1._setParent(this); }
  }
  public org.antlr.runtime.tree.Tree CROSS_VK = null;
  public org.antlr.runtime.tree.Tree get_CROSS_VK() { return this.CROSS_VK; }
  public void set_CROSS_VK(org.antlr.runtime.tree.Tree value) {
    this.CROSS_VK = value;
  }
  public boolean is_CROSS_VK() { return this.CROSS_VK != null; }
  public org.antlr.runtime.tree.Tree NATURAL_VK = null;
  public org.antlr.runtime.tree.Tree get_NATURAL_VK() { return this.NATURAL_VK; }
  public void set_NATURAL_VK(org.antlr.runtime.tree.Tree value) {
    this.NATURAL_VK = value;
  }
  public boolean is_NATURAL_VK() { return this.NATURAL_VK != null; }
  public org.antlr.runtime.tree.Tree INNER_VK = null;
  public org.antlr.runtime.tree.Tree get_INNER_VK() { return this.INNER_VK; }
  public void set_INNER_VK(org.antlr.runtime.tree.Tree value) {
    this.INNER_VK = value;
  }
  public boolean is_INNER_VK() { return this.INNER_VK != null; }
  public org.antlr.runtime.tree.Tree FULL_VK = null;
  public org.antlr.runtime.tree.Tree get_FULL_VK() { return this.FULL_VK; }
  public void set_FULL_VK(org.antlr.runtime.tree.Tree value) {
    this.FULL_VK = value;
  }
  public boolean is_FULL_VK() { return this.FULL_VK != null; }
  public org.antlr.runtime.tree.Tree LEFT_VK = null;
  public org.antlr.runtime.tree.Tree get_LEFT_VK() { return this.LEFT_VK; }
  public void set_LEFT_VK(org.antlr.runtime.tree.Tree value) {
    this.LEFT_VK = value;
  }
  public boolean is_LEFT_VK() { return this.LEFT_VK != null; }
  public org.antlr.runtime.tree.Tree RIGHT_VK = null;
  public org.antlr.runtime.tree.Tree get_RIGHT_VK() { return this.RIGHT_VK; }
  public void set_RIGHT_VK(org.antlr.runtime.tree.Tree value) {
    this.RIGHT_VK = value;
  }
  public boolean is_RIGHT_VK() { return this.RIGHT_VK != null; }
  public table_ref_aux table_ref_aux = null;
  public table_ref_aux get_table_ref_aux() { return this.table_ref_aux; }
  public void set_table_ref_aux(table_ref_aux value) {
    if (this.table_ref_aux != null) { this.table_ref_aux._setParent(null); }
    this.table_ref_aux = value;
    if (this.table_ref_aux != null) { this.table_ref_aux._setParent(this); }
  }
  public query_partition_clause qpc2 = null;
  public query_partition_clause get_qpc2() { return this.qpc2; }
  public void set_qpc2(query_partition_clause value) {
    if (this.qpc2 != null) { this.qpc2._setParent(null); }
    this.qpc2 = value;
    if (this.qpc2 != null) { this.qpc2._setParent(this); }
  }
  public join_on_part join_on_part = null;
  public join_on_part get_join_on_part() { return this.join_on_part; }
  public void set_join_on_part(join_on_part value) {
    if (this.join_on_part != null) { this.join_on_part._setParent(null); }
    this.join_on_part = value;
    if (this.join_on_part != null) { this.join_on_part._setParent(this); }
  }
  public boolean is_join_on_part() { return this.join_on_part != null; }
  public join_using_part join_using_part = null;
  public join_using_part get_join_using_part() { return this.join_using_part; }
  public void set_join_using_part(join_using_part value) {
    if (this.join_using_part != null) { this.join_using_part._setParent(null); }
    this.join_using_part = value;
    if (this.join_using_part != null) { this.join_using_part._setParent(this); }
  }
  public boolean is_join_using_part() { return this.join_using_part != null; }

  public void _walk(_visitor visitor) {
    if (!visitor.enter(this)) {
      return;
    }
    if (this.qpc1 != null) {
      this.qpc1._walk(visitor);
    }
    if (this.CROSS_VK != null) {
      visitor.visit(this.CROSS_VK);
    }
    if (this.NATURAL_VK != null) {
      visitor.visit(this.NATURAL_VK);
    }
    if (this.INNER_VK != null) {
      visitor.visit(this.INNER_VK);
    }
    if (this.FULL_VK != null) {
      visitor.visit(this.FULL_VK);
    }
    if (this.LEFT_VK != null) {
      visitor.visit(this.LEFT_VK);
    }
    if (this.RIGHT_VK != null) {
      visitor.visit(this.RIGHT_VK);
    }
    if (this.table_ref_aux != null) {
      this.table_ref_aux._walk(visitor);
    }
    if (this.qpc2 != null) {
      this.qpc2._walk(visitor);
    }
    if (this.join_on_part != null) {
      this.join_on_part._walk(visitor);
    }
    if (this.join_using_part != null) {
      this.join_using_part._walk(visitor);
    }
    visitor.leave(this);
  }

  public java.util.List<_baseNode> _getChildren() {
    java.util.List<_baseNode> result = new java.util.ArrayList<_baseNode>();
    if (this.qpc1 != null) {
      result.add(this.qpc1);
    }
    if (this.table_ref_aux != null) {
      result.add(this.table_ref_aux);
    }
    if (this.qpc2 != null) {
      result.add(this.qpc2);
    }
    if (this.join_on_part != null) {
      result.add(this.join_on_part);
    }
    if (this.join_using_part != null) {
      result.add(this.join_using_part);
    }
    return result;
  }

  public void _replace(_baseNode child, _baseNode replacement) {
    if (this.qpc1 == child) {
      this.set_qpc1((ru.barsopen.plsqlconverter.ast.typed.query_partition_clause)replacement);
      return;
    }
    if (this.table_ref_aux == child) {
      this.set_table_ref_aux((ru.barsopen.plsqlconverter.ast.typed.table_ref_aux)replacement);
      return;
    }
    if (this.qpc2 == child) {
      this.set_qpc2((ru.barsopen.plsqlconverter.ast.typed.query_partition_clause)replacement);
      return;
    }
    if (this.join_on_part == child) {
      this.set_join_on_part((ru.barsopen.plsqlconverter.ast.typed.join_on_part)replacement);
      return;
    }
    if (this.join_using_part == child) {
      this.set_join_using_part((ru.barsopen.plsqlconverter.ast.typed.join_using_part)replacement);
      return;
    }
    throw new RuntimeException("Failed to replace node: no such node");
  }

  public org.antlr.runtime.tree.Tree unparse() {
    org.antlr.runtime.CommonToken _token = new org.antlr.runtime.CommonToken(ru.barsopen.plsqlconverter.PLSQLPrinter.JOIN_DEF);
    _token.setLine(_line);
    _token.setCharPositionInLine(_col);
    _token.setText("JOIN_DEF");
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
    if (qpc1 != null) {
      _result.addChild(qpc1.unparse());
    }


    if (CROSS_VK != null) {
      _result.addChild(CROSS_VK);
    }


    if (NATURAL_VK != null) {
      _result.addChild(NATURAL_VK);
    }


    if (INNER_VK != null) {
      _result.addChild(INNER_VK);
    }


    if (FULL_VK != null) {
      _result.addChild(FULL_VK);
    }


    if (LEFT_VK != null) {
      _result.addChild(LEFT_VK);
    }


    if (RIGHT_VK != null) {
      _result.addChild(RIGHT_VK);
    }


    if (table_ref_aux == null) { throw new RuntimeException(); }
    _result.addChild(table_ref_aux.unparse());


    if (qpc2 != null) {
      _result.addChild(qpc2.unparse());
    }


    if (join_on_part != null) {
      _result.addChild(join_on_part.unparse());
    }


    if (join_using_part != null) {
      _result.addChild(join_using_part.unparse());
    }


    return _result;
  }

}
