package ru.barsopen.plsqlconverter.ast.transforms;

import br.com.porcelli.parser.plsql.PLSQLLexer;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.barsopen.plsqlconverter.ast.DerivedSqlLexer;
import ru.barsopen.plsqlconverter.ast.DerivedSqlParser;
import ru.barsopen.plsqlconverter.util.ReflectionUtil;
/*
 * 
 */
public class AstParser {
	private static Logger logger = LoggerFactory.getLogger(AstParser.class);
	
	/*
	 * inputContent: an single statement
	 * printTokens : 
	 * treeType: one of sql_script|statement|expression 
	 */
	public static ParseResult parseTreeFromString(String inputContent, boolean printTokens, String treeType)
			throws RecognitionException 
	{
		logger.debug("Enter: printTokens=" + printTokens + ", treeType=" + treeType);
		ANTLRStringStream input = new ANTLRStringStream(inputContent);
		DerivedSqlLexer l = new DerivedSqlLexer(input);
		CommonTokenStream cts = new CommonTokenStream(l);
		
		if (printTokens)
		{
			cts.fill();
			List<? extends Token> tokens = cts.getTokens();
			DerivedSqlParser p = new DerivedSqlParser(cts);
			String[] tokenNames = p.getTokenNames();
			for (Token t: tokens) {
				int type = t.getType();
				if (type != Token.EOF && t.getChannel() != Token.HIDDEN_CHANNEL) {
					String s = tokenNames[type];
					String tokenText = t.getText();
					System.out.printf("%s '%s' %d\n", s, tokenText, t.getChannel());
				}
			}
			System.exit(0);
		}
		
		// (by lyy) remove name after end
		cts.fill();
		// logger.debug("Before Tokens=" + cts.getTokens());
		//cts.getTokens().stream().forEach((t) ->{});
                for(Token t : cts.getTokens())
                {
			if (t.getType() == PLSQLLexer.SQL92_RESERVED_END)
			{
				int index = t.getTokenIndex();
				if (cts.getTokens().size() > (index + 2)
						&& cts.getTokens().get(index + 1).getType() == PLSQLLexer.SEPARATOR
						&& cts.getTokens().get(index + 2).getType() == PLSQLLexer.REGULAR_ID)
				{
					cts.getTokens().get(index + 2).setText("");
					logger.debug("tokens=" + cts.getTokens().toString());
				}
			}
		}//);
		logger.debug("After Tokens=" + cts.getTokens());
                
		DerivedSqlParser p = new DerivedSqlParser(cts);
		Object tree = ReflectionUtil.callMethod(ReflectionUtil.callMethod(p, treeType), "getTree");
	
		org.antlr.runtime.tree.Tree theTree = (org.antlr.runtime.tree.Tree)tree;
		ParseResult result = new ParseResult();
		result.tokens = new ArrayList<Token>();
		result.tokens.addAll(cts.getTokens());
		result.tree = theTree;
		result.lexerErrors = l.errors;
		result.parserErrors = p.errors;
		
		logger.debug("Return:" + result.toString());
		return result;
	}
}
