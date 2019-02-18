package ru.barsopen.plsqlconverter.ast.typed;
public interface _visitor {
  /* returns false => don't process children, don't call leave */
  boolean enter(_baseNode node);
  void leave(_baseNode node);
  void visit(org.antlr.runtime.tree.Tree nonNode);
}
