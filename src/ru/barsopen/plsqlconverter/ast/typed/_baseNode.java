package ru.barsopen.plsqlconverter.ast.typed;
public interface _baseNode {
  _baseNode _getParent();
  void _setParent(_baseNode parent);
  int _getLine();
  int _getCol();
  int _getTokenStartIndex();
  int _getTokenStopIndex();
  org.antlr.runtime.tree.Tree unparse();
  void _walk(_visitor visitor);
  void _replace(_baseNode child, _baseNode replacement);
  java.util.List<_baseNode> _getChildren();
void setComments(ru.barsopen.plsqlconverter.util.AttachedComments comments);
ru.barsopen.plsqlconverter.util.AttachedComments getAttachedComments();
void _setCol(int col);
void _setLine(int line);

}
