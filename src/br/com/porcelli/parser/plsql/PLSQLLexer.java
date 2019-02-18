// $ANTLR 3.5.2 F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g 2018-10-06 11:19:12

/**
 * Oracle(c) PL/SQL 11g Parser  
 *
 * Copyright (c) 2009-2011 Alexandre Porcelli <alexandre.porcelli@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.porcelli.parser.plsql;

import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * Oracle(c) PL/SQL 11g Parser  
 *
 * Copyright (c) 2009-2011 Alexandre Porcelli <alexandre.porcelli@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@SuppressWarnings("all")
public class PLSQLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AMPERSAND=5;
	public static final int APPROXIMATE_NUM_LIT=6;
	public static final int ASSIGN_OP=7;
	public static final int ASTERISK=8;
	public static final int AT_SIGN=9;
	public static final int B=10;
	public static final int BINDVAR=11;
	public static final int BIT_STRING_LIT=12;
	public static final int C=13;
	public static final int CARRET_OPERATOR_PART=14;
	public static final int CHAR_STRING=15;
	public static final int CHAR_STRING_PERL=16;
	public static final int COLON=17;
	public static final int COMMA=18;
	public static final int COMMENT=19;
	public static final int COMMENT_FRAGMENT=20;
	public static final int CONCATENATION_OP=21;
	public static final int D=22;
	public static final int DELIMITED_ID=23;
	public static final int DOUBLE_ASTERISK=24;
	public static final int DOUBLE_PERIOD=25;
	public static final int E=26;
	public static final int EQUALS_OP=27;
	public static final int EXACT_NUM_LIT=28;
	public static final int EXCLAMATION_OPERATOR_PART=29;
	public static final int F=30;
	public static final int G=31;
	public static final int GREATER_THAN_OP=32;
	public static final int GREATER_THAN_OR_EQUALS_OP=33;
	public static final int H=34;
	public static final int HEX_STRING_LIT=35;
	public static final int I=36;
	public static final int INTRODUCER=37;
	public static final int J=38;
	public static final int K=39;
	public static final int L=40;
	public static final int LEFT_BRACKET=41;
	public static final int LEFT_PAREN=42;
	public static final int LESS_THAN_OP=43;
	public static final int LESS_THAN_OR_EQUALS_OP=44;
	public static final int M=45;
	public static final int MINUS_SIGN=46;
	public static final int N=47;
	public static final int NATIONAL_CHAR_STRING_LIT=48;
	public static final int NEWLINE=49;
	public static final int NOT_EQUAL_OP=50;
	public static final int O=51;
	public static final int P=52;
	public static final int PERCENT=53;
	public static final int PERIOD=54;
	public static final int PLSQL_NON_RESERVED_CONNECT_BY_ROOT=55;
	public static final int PLSQL_NON_RESERVED_ELSIF=56;
	public static final int PLSQL_NON_RESERVED_MODEL=57;
	public static final int PLSQL_NON_RESERVED_PIVOT=58;
	public static final int PLSQL_NON_RESERVED_UNPIVOT=59;
	public static final int PLSQL_NON_RESERVED_USING=60;
	public static final int PLSQL_RESERVED_CLUSTERS=61;
	public static final int PLSQL_RESERVED_COLAUTH=62;
	public static final int PLSQL_RESERVED_COMPRESS=63;
	public static final int PLSQL_RESERVED_CRASH=64;
	public static final int PLSQL_RESERVED_EXCLUSIVE=65;
	public static final int PLSQL_RESERVED_IDENTIFIED=66;
	public static final int PLSQL_RESERVED_IF=67;
	public static final int PLSQL_RESERVED_INDEX=68;
	public static final int PLSQL_RESERVED_INDEXES=69;
	public static final int PLSQL_RESERVED_LOCK=70;
	public static final int PLSQL_RESERVED_MINUS=71;
	public static final int PLSQL_RESERVED_MODE=72;
	public static final int PLSQL_RESERVED_NOCOMPRESS=73;
	public static final int PLSQL_RESERVED_NOWAIT=74;
	public static final int PLSQL_RESERVED_RESOURCE=75;
	public static final int PLSQL_RESERVED_SHARE=76;
	public static final int PLSQL_RESERVED_START=77;
	public static final int PLSQL_RESERVED_TABAUTH=78;
	public static final int PLSQL_RESERVED_VIEWS=79;
	public static final int PLUS_SIGN=80;
	public static final int PROMPT=81;
	public static final int Q=82;
	public static final int QS_ANGLE=83;
	public static final int QS_BRACE=84;
	public static final int QS_BRACK=85;
	public static final int QS_OTHER=86;
	public static final int QS_OTHER_CH=87;
	public static final int QS_PAREN=88;
	public static final int QUESTION_MARK=89;
	public static final int QUOTE=90;
	public static final int R=91;
	public static final int REGULAR_ID=92;
	public static final int RIGHT_BRACKET=93;
	public static final int RIGHT_PAREN=94;
	public static final int S=95;
	public static final int SEMICOLON=96;
	public static final int SEPARATOR=97;
	public static final int SIMPLE_LETTER=98;
	public static final int SOLIDUS=99;
	public static final int SPACE=100;
	public static final int SQL92_RESERVED_ALL=101;
	public static final int SQL92_RESERVED_ALTER=102;
	public static final int SQL92_RESERVED_AND=103;
	public static final int SQL92_RESERVED_ANY=104;
	public static final int SQL92_RESERVED_AS=105;
	public static final int SQL92_RESERVED_ASC=106;
	public static final int SQL92_RESERVED_BEGIN=107;
	public static final int SQL92_RESERVED_BETWEEN=108;
	public static final int SQL92_RESERVED_BY=109;
	public static final int SQL92_RESERVED_CASE=110;
	public static final int SQL92_RESERVED_CHECK=111;
	public static final int SQL92_RESERVED_CONNECT=112;
	public static final int SQL92_RESERVED_CREATE=113;
	public static final int SQL92_RESERVED_CURRENT=114;
	public static final int SQL92_RESERVED_CURSOR=115;
	public static final int SQL92_RESERVED_DATE=116;
	public static final int SQL92_RESERVED_DECLARE=117;
	public static final int SQL92_RESERVED_DEFAULT=118;
	public static final int SQL92_RESERVED_DELETE=119;
	public static final int SQL92_RESERVED_DESC=120;
	public static final int SQL92_RESERVED_DISTINCT=121;
	public static final int SQL92_RESERVED_DROP=122;
	public static final int SQL92_RESERVED_ELSE=123;
	public static final int SQL92_RESERVED_END=124;
	public static final int SQL92_RESERVED_EXCEPTION=125;
	public static final int SQL92_RESERVED_EXISTS=126;
	public static final int SQL92_RESERVED_FALSE=127;
	public static final int SQL92_RESERVED_FETCH=128;
	public static final int SQL92_RESERVED_FOR=129;
	public static final int SQL92_RESERVED_FROM=130;
	public static final int SQL92_RESERVED_GOTO=131;
	public static final int SQL92_RESERVED_GRANT=132;
	public static final int SQL92_RESERVED_GROUP=133;
	public static final int SQL92_RESERVED_HAVING=134;
	public static final int SQL92_RESERVED_IN=135;
	public static final int SQL92_RESERVED_INSERT=136;
	public static final int SQL92_RESERVED_INTERSECT=137;
	public static final int SQL92_RESERVED_INTO=138;
	public static final int SQL92_RESERVED_IS=139;
	public static final int SQL92_RESERVED_LIKE=140;
	public static final int SQL92_RESERVED_NOT=141;
	public static final int SQL92_RESERVED_NULL=142;
	public static final int SQL92_RESERVED_OF=143;
	public static final int SQL92_RESERVED_ON=144;
	public static final int SQL92_RESERVED_OPTION=145;
	public static final int SQL92_RESERVED_OR=146;
	public static final int SQL92_RESERVED_ORDER=147;
	public static final int SQL92_RESERVED_OVERLAPS=148;
	public static final int SQL92_RESERVED_PRIOR=149;
	public static final int SQL92_RESERVED_PROCEDURE=150;
	public static final int SQL92_RESERVED_PUBLIC=151;
	public static final int SQL92_RESERVED_REVOKE=152;
	public static final int SQL92_RESERVED_SELECT=153;
	public static final int SQL92_RESERVED_SIZE=154;
	public static final int SQL92_RESERVED_TABLE=155;
	public static final int SQL92_RESERVED_THE=156;
	public static final int SQL92_RESERVED_THEN=157;
	public static final int SQL92_RESERVED_TO=158;
	public static final int SQL92_RESERVED_TRUE=159;
	public static final int SQL92_RESERVED_UNION=160;
	public static final int SQL92_RESERVED_UNIQUE=161;
	public static final int SQL92_RESERVED_UPDATE=162;
	public static final int SQL92_RESERVED_VALUES=163;
	public static final int SQL92_RESERVED_VIEW=164;
	public static final int SQL92_RESERVED_WHEN=165;
	public static final int SQL92_RESERVED_WHERE=166;
	public static final int SQL92_RESERVED_WITH=167;
	public static final int T=168;
	public static final int TILDE_OPERATOR_PART=169;
	public static final int U=170;
	public static final int UNDERSCORE=171;
	public static final int UNSIGNED_INTEGER=172;
	public static final int V=173;
	public static final int VERTICAL_BAR=174;
	public static final int W=175;
	public static final int X=176;
	public static final int Y=177;
	public static final int Z=178;
	public static final int ZV=179;

	    // buffer (queue) to hold the emit()'d tokens
	    private LinkedList<Token> tokenBuffer = new LinkedList<Token>();

	    public void emit(Token t) {
	        tokenBuffer.add(t);
	    }

	    private void advanceInput(){
	        state.tokenStartCharIndex = input.index();
	        state.tokenStartCharPositionInLine = input.getCharPositionInLine();
	        state.tokenStartLine = input.getLine();
	    }


	    /**
	     * Return a token from this source; i.e., match a token on the char stream.
	     */
	    public Token nextToken() {
	        while (true) {
	            if (tokenBuffer.size() == 0) {
	                state.token = null;
	                state.channel = Token.DEFAULT_CHANNEL;
	                state.tokenStartCharIndex = input.index();
	                state.tokenStartCharPositionInLine = input.getCharPositionInLine();
	                state.tokenStartLine = input.getLine();
	                state.text = null;
	                if (input.LA(1) == CharStream.EOF) {
	                    return getEOFToken();
	                }
	                try {
	                    int m = input.mark();
	                    state.backtracking = 1;
	                    state.failed = false;
	                    mTokens();
	                    state.backtracking = 0;

	                    if (state.failed) {
	                        input.rewind(m);
	                        input.consume();
	                    } else {
	                        emit();
	                    }
	                } catch (RecognitionException re) {
	                    // shouldn't happen in backtracking mode, but...
	                    reportError(re);
	                    recover(re);
	                }
	            } else {
	                Token result = tokenBuffer.poll();
	                if (result == Token.SKIP_TOKEN || result.getType() == Token.INVALID_TOKEN_TYPE || result == null)
	                {
	                    // discard
	                    // SKIP & INVALID
	                    // tokens
	                    continue;
	                }
	                return result;
	            }
	        }
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PLSQLLexer() {} 
	public PLSQLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PLSQLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g"; }

	// $ANTLR start "NATIONAL_CHAR_STRING_LIT"
	public final void mNATIONAL_CHAR_STRING_LIT() throws RecognitionException {
		try {
			int _type = NATIONAL_CHAR_STRING_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:118:5: ( ( 'N' | 'n' ) '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:118:10: ( 'N' | 'n' ) '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:118:27: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
			loop1:
			while (true) {
				int alt1=4;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\'') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='\'') ) {
						alt1=2;
					}

				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}
				else if ( (LA1_0=='\n'||LA1_0=='\r') ) {
					alt1=3;
				}

				switch (alt1) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:118:51: ~ ( '\\'' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:118:76: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					}
					break;
				case 3 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:118:88: NEWLINE
					{
					mNEWLINE(); 

					}
					break;

				default :
					break loop1;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIONAL_CHAR_STRING_LIT"

	// $ANTLR start "BIT_STRING_LIT"
	public final void mBIT_STRING_LIT() throws RecognitionException {
		try {
			int _type = BIT_STRING_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:5: ( ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+ )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:10: ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:22: ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\'') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:23: '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )?
					{
					match('\''); 
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:28: ( '0' | '1' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '1')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					match('\''); 
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:46: ( SEPARATOR )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' '||LA3_0=='-'||LA3_0=='/') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:125:46: SEPARATOR
							{
							mSEPARATOR(); 

							}
							break;

					}

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_STRING_LIT"

	// $ANTLR start "HEX_STRING_LIT"
	public final void mHEX_STRING_LIT() throws RecognitionException {
		try {
			int _type = HEX_STRING_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:5: ( ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+ )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:10: ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:22: ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\'') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:23: '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )?
					{
					match('\''); 
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:28: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'F')||(LA5_0 >= 'a' && LA5_0 <= 'f')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					match('\''); 
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:67: ( SEPARATOR )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' '||LA6_0=='-'||LA6_0=='/') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:133:67: SEPARATOR
							{
							mSEPARATOR(); 

							}
							break;

					}

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_STRING_LIT"

	// $ANTLR start "PERIOD"
	public final void mPERIOD() throws RecognitionException {
		try {
			int _type = PERIOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:138:5: ( '.' | '..' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='.') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='.') ) {
					alt8=2;
				}

				else {
					alt8=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:138:10: '.'
					{
					match('.'); 
					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:139:10: '..'
					{
					match(".."); 

					 _type = DOUBLE_PERIOD; 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERIOD"

	// $ANTLR start "EXACT_NUM_LIT"
	public final void mEXACT_NUM_LIT() throws RecognitionException {
		try {
			int _type = EXACT_NUM_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:148:5: ( ( UNSIGNED_INTEGER ({...}? => '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? ) ( 'D' | 'd' | 'f' | 'F' )? )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:148:7: ( UNSIGNED_INTEGER ({...}? => '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? ) ( 'D' | 'd' | 'f' | 'F' )?
			{
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:148:7: ( UNSIGNED_INTEGER ({...}? => '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
				alt14=1;
			}
			else if ( (LA14_0=='.') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:149:13: UNSIGNED_INTEGER ({...}? => '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
					{
					mUNSIGNED_INTEGER(); 

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:150:13: ({...}? => '.' UNSIGNED_INTEGER |)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='.') && ((input.LA(1) == '.' && input.LA(2) != '.'))) {
						alt9=1;
					}

					switch (alt9) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:151:15: {...}? => '.' UNSIGNED_INTEGER
							{
							if ( !((input.LA(1) == '.' && input.LA(2) != '.')) ) {
								throw new FailedPredicateException(input, "EXACT_NUM_LIT", "input.LA(1) == '.' && input.LA(2) != '.'");
							}
							match('.'); 
							mUNSIGNED_INTEGER(); 

							}
							break;
						case 2 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:152:17: 
							{
							_type = UNSIGNED_INTEGER;
							}
							break;

					}

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:154:13: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:154:15: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
							{
							if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:154:27: ( '+' | '-' )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0=='+'||LA10_0=='-') ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
									{
									if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							mUNSIGNED_INTEGER(); 

							_type = APPROXIMATE_NUM_LIT;
							}
							break;

					}

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:155:10: '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
					{
					match('.'); 
					mUNSIGNED_INTEGER(); 

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:155:31: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='E'||LA13_0=='e') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:155:33: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
							{
							if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:155:45: ( '+' | '-' )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0=='+'||LA12_0=='-') ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
									{
									if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							mUNSIGNED_INTEGER(); 

							_type = APPROXIMATE_NUM_LIT;
							}
							break;

					}

					}
					break;

			}

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:157:5: ( 'D' | 'd' | 'f' | 'F' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='D'||LA15_0=='F'||LA15_0=='d'||LA15_0=='f') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
					{
					if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXACT_NUM_LIT"

	// $ANTLR start "CHAR_STRING"
	public final void mCHAR_STRING() throws RecognitionException {
		try {
			int _type = CHAR_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:164:5: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:164:10: '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
			{
			match('\''); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:164:15: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
			loop16:
			while (true) {
				int alt16=4;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\'') ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1=='\'') ) {
						alt16=2;
					}

				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}
				else if ( (LA16_0=='\n'||LA16_0=='\r') ) {
					alt16=3;
				}

				switch (alt16) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:164:39: ~ ( '\\'' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:164:63: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					}
					break;
				case 3 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:164:75: NEWLINE
					{
					mNEWLINE(); 

					}
					break;

				default :
					break loop16;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_STRING"

	// $ANTLR start "CHAR_STRING_PERL"
	public final void mCHAR_STRING_PERL() throws RecognitionException {
		try {
			int _type = CHAR_STRING_PERL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:21: ( ( 'q' | 'Q' ) ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:23: ( 'q' | 'Q' ) ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER )
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:33: ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER )
			int alt17=5;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\'') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='<') ) {
					alt17=1;
				}
				else if ( (LA17_1=='{') ) {
					alt17=2;
				}
				else if ( (LA17_1=='[') ) {
					alt17=3;
				}
				else if ( (LA17_1=='(') ) {
					alt17=4;
				}
				else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '\b')||(LA17_1 >= '\u000B' && LA17_1 <= '\f')||(LA17_1 >= '\u000E' && LA17_1 <= '\u001F')||(LA17_1 >= '!' && LA17_1 <= '\'')||(LA17_1 >= ')' && LA17_1 <= ';')||(LA17_1 >= '=' && LA17_1 <= 'Z')||(LA17_1 >= '\\' && LA17_1 <= 'z')||(LA17_1 >= '|' && LA17_1 <= '\uFFFF')) ) {
					alt17=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:35: QS_ANGLE
					{
					mQS_ANGLE(); 

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:46: QS_BRACE
					{
					mQS_BRACE(); 

					}
					break;
				case 3 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:57: QS_BRACK
					{
					mQS_BRACK(); 

					}
					break;
				case 4 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:68: QS_PAREN
					{
					mQS_PAREN(); 

					}
					break;
				case 5 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:169:79: QS_OTHER
					{
					mQS_OTHER(); 

					}
					break;

			}

			_type = CHAR_STRING;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_STRING_PERL"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:170:21: ( '\\'' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:170:23: '\\''
			{
			match('\''); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "QS_ANGLE"
	public final void mQS_ANGLE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:171:21: ( QUOTE '<' ( options {greedy=false; } : . )* '>' QUOTE )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:171:23: QUOTE '<' ( options {greedy=false; } : . )* '>' QUOTE
			{
			mQUOTE(); 

			match('<'); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:171:33: ( options {greedy=false; } : . )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='>') ) {
					int LA18_1 = input.LA(2);
					if ( (LA18_1=='\'') ) {
						alt18=2;
					}
					else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '&')||(LA18_1 >= '(' && LA18_1 <= '\uFFFF')) ) {
						alt18=1;
					}

				}
				else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '=')||(LA18_0 >= '?' && LA18_0 <= '\uFFFF')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:171:61: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop18;
				}
			}

			match('>'); 
			mQUOTE(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QS_ANGLE"

	// $ANTLR start "QS_BRACE"
	public final void mQS_BRACE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:172:21: ( QUOTE '{' ( options {greedy=false; } : . )* '}' QUOTE )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:172:23: QUOTE '{' ( options {greedy=false; } : . )* '}' QUOTE
			{
			mQUOTE(); 

			match('{'); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:172:33: ( options {greedy=false; } : . )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='}') ) {
					int LA19_1 = input.LA(2);
					if ( (LA19_1=='\'') ) {
						alt19=2;
					}
					else if ( ((LA19_1 >= '\u0000' && LA19_1 <= '&')||(LA19_1 >= '(' && LA19_1 <= '\uFFFF')) ) {
						alt19=1;
					}

				}
				else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '|')||(LA19_0 >= '~' && LA19_0 <= '\uFFFF')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:172:61: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop19;
				}
			}

			match('}'); 
			mQUOTE(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QS_BRACE"

	// $ANTLR start "QS_BRACK"
	public final void mQS_BRACK() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:173:21: ( QUOTE '[' ( options {greedy=false; } : . )* ']' QUOTE )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:173:23: QUOTE '[' ( options {greedy=false; } : . )* ']' QUOTE
			{
			mQUOTE(); 

			match('['); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:173:33: ( options {greedy=false; } : . )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==']') ) {
					int LA20_1 = input.LA(2);
					if ( (LA20_1=='\'') ) {
						alt20=2;
					}
					else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '&')||(LA20_1 >= '(' && LA20_1 <= '\uFFFF')) ) {
						alt20=1;
					}

				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\\')||(LA20_0 >= '^' && LA20_0 <= '\uFFFF')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:173:61: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop20;
				}
			}

			match(']'); 
			mQUOTE(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QS_BRACK"

	// $ANTLR start "QS_PAREN"
	public final void mQS_PAREN() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:174:21: ( QUOTE '(' ( options {greedy=false; } : . )* ')' QUOTE )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:174:23: QUOTE '(' ( options {greedy=false; } : . )* ')' QUOTE
			{
			mQUOTE(); 

			match('('); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:174:33: ( options {greedy=false; } : . )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==')') ) {
					int LA21_1 = input.LA(2);
					if ( (LA21_1=='\'') ) {
						alt21=2;
					}
					else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '&')||(LA21_1 >= '(' && LA21_1 <= '\uFFFF')) ) {
						alt21=1;
					}

				}
				else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '(')||(LA21_0 >= '*' && LA21_0 <= '\uFFFF')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:174:61: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop21;
				}
			}

			match(')'); 
			mQUOTE(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QS_PAREN"

	// $ANTLR start "QS_OTHER_CH"
	public final void mQS_OTHER_CH() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:176:21: (~ ( '<' | '{' | '[' | '(' | ' ' | '\\t' | '\\n' | '\\r' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\'')||(input.LA(1) >= ')' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= 'Z')||(input.LA(1) >= '\\' && input.LA(1) <= 'z')||(input.LA(1) >= '|' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QS_OTHER_CH"

	// $ANTLR start "QS_OTHER"
	public final void mQS_OTHER() throws RecognitionException {
		try {
			CommonToken delimiter=null;

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:186:3: ( QUOTE delimiter= QS_OTHER_CH ({...}? => . )* ({...}? => . ) QUOTE )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:187:3: QUOTE delimiter= QS_OTHER_CH ({...}? => . )* ({...}? => . ) QUOTE
			{
			mQUOTE(); 

			int delimiterStart792 = getCharIndex();
			int delimiterStartLine792 = getLine();
			int delimiterStartCharPos792 = getCharPositionInLine();
			mQS_OTHER_CH(); 
			delimiter = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, delimiterStart792, getCharIndex()-1);
			delimiter.setLine(delimiterStartLine792);
			delimiter.setCharPositionInLine(delimiterStartCharPos792);

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:189:5: ({...}? => . )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\uFFFF')) && ((( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') )||( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) == '\'' )))) {
					int LA22_1 = input.LA(2);
					if ( (LA22_1=='\'') && ((( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') )||( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) == '\'' )))) {
						int LA22_2 = input.LA(3);
						if ( ((LA22_2 >= '\u0000' && LA22_2 <= '\uFFFF')) && (( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') ))) {
							alt22=1;
						}

					}
					else if ( ((LA22_1 >= '\u0000' && LA22_1 <= '&')||(LA22_1 >= '(' && LA22_1 <= '\uFFFF')) && (( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') ))) {
						alt22=1;
					}

				}

				switch (alt22) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:189:7: {...}? => .
					{
					if ( !(( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') )) ) {
						throw new FailedPredicateException(input, "QS_OTHER", " input.LT(1) != $delimiter.text.charAt(0) || ( input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) != '\\'') ");
					}
					matchAny(); 
					}
					break;

				default :
					break loop22;
				}
			}

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:190:5: ({...}? => . )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:190:7: {...}? => .
			{
			if ( !(( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) == '\'' )) ) {
				throw new FailedPredicateException(input, "QS_OTHER", " input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) == '\\'' ");
			}
			matchAny(); 
			}

			mQUOTE(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QS_OTHER"

	// $ANTLR start "DELIMITED_ID"
	public final void mDELIMITED_ID() throws RecognitionException {
		try {
			int _type = DELIMITED_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:200:5: ( '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:200:10: '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"'
			{
			match('\"'); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:200:14: (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0=='\"') ) {
					int LA23_1 = input.LA(2);
					if ( (LA23_1=='\"') ) {
						alt23=2;
					}

				}
				else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '!')||(LA23_0 >= '#' && LA23_0 <= '\uFFFF')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:200:15: ~ ( '\"' | '\\r' | '\\n' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:200:38: '\"' '\"'
					{
					match('\"'); 
					match('\"'); 
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELIMITED_ID"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:206:5: ( '%' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:206:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:210:5: ( '&' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:210:10: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "LEFT_PAREN"
	public final void mLEFT_PAREN() throws RecognitionException {
		try {
			int _type = LEFT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:214:5: ( '(' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:214:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PAREN"

	// $ANTLR start "RIGHT_PAREN"
	public final void mRIGHT_PAREN() throws RecognitionException {
		try {
			int _type = RIGHT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:218:5: ( ')' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:218:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PAREN"

	// $ANTLR start "DOUBLE_ASTERISK"
	public final void mDOUBLE_ASTERISK() throws RecognitionException {
		try {
			int _type = DOUBLE_ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:222:5: ( '**' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:222:10: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_ASTERISK"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:226:5: ( '*' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:226:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASTERISK"

	// $ANTLR start "PLUS_SIGN"
	public final void mPLUS_SIGN() throws RecognitionException {
		try {
			int _type = PLUS_SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:230:5: ( '+' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:230:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_SIGN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:234:5: ( ',' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:234:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SOLIDUS"
	public final void mSOLIDUS() throws RecognitionException {
		try {
			int _type = SOLIDUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:238:5: ( '/' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:238:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOLIDUS"

	// $ANTLR start "AT_SIGN"
	public final void mAT_SIGN() throws RecognitionException {
		try {
			int _type = AT_SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:242:5: ( '@' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:242:10: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT_SIGN"

	// $ANTLR start "ASSIGN_OP"
	public final void mASSIGN_OP() throws RecognitionException {
		try {
			int _type = ASSIGN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:246:5: ( ':=' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:246:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OP"

	// $ANTLR start "BINDVAR"
	public final void mBINDVAR() throws RecognitionException {
		try {
			int _type = BINDVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:251:5: ( COLON SIMPLE_LETTER ( SIMPLE_LETTER | '0' .. '9' | '_' )* | COLON DELIMITED_ID | COLON UNSIGNED_INTEGER | QUESTION_MARK )
			int alt25=4;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==':') ) {
				switch ( input.LA(2) ) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt25=1;
					}
					break;
				case '\"':
					{
					alt25=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt25=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA25_0=='?') ) {
				alt25=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:251:10: COLON SIMPLE_LETTER ( SIMPLE_LETTER | '0' .. '9' | '_' )*
					{
					mCOLON(); 

					mSIMPLE_LETTER(); 

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:251:31: ( SIMPLE_LETTER | '0' .. '9' | '_' )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '0' && LA24_0 <= '9')||(LA24_0 >= 'A' && LA24_0 <= 'Z')||LA24_0=='_'||(LA24_0 >= 'a' && LA24_0 <= 'z')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:252:10: COLON DELIMITED_ID
					{
					mCOLON(); 

					mDELIMITED_ID(); 

					}
					break;
				case 3 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:253:10: COLON UNSIGNED_INTEGER
					{
					mCOLON(); 

					mUNSIGNED_INTEGER(); 

					}
					break;
				case 4 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:254:10: QUESTION_MARK
					{
					mQUESTION_MARK(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINDVAR"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:258:5: ( ':' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:258:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:262:5: ( ';' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:262:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LESS_THAN_OR_EQUALS_OP"
	public final void mLESS_THAN_OR_EQUALS_OP() throws RecognitionException {
		try {
			int _type = LESS_THAN_OR_EQUALS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:266:5: ( '<=' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:266:10: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN_OR_EQUALS_OP"

	// $ANTLR start "LESS_THAN_OP"
	public final void mLESS_THAN_OP() throws RecognitionException {
		try {
			int _type = LESS_THAN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:270:5: ( '<' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:270:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN_OP"

	// $ANTLR start "GREATER_THAN_OR_EQUALS_OP"
	public final void mGREATER_THAN_OR_EQUALS_OP() throws RecognitionException {
		try {
			int _type = GREATER_THAN_OR_EQUALS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:274:5: ( '>=' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:274:10: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN_OR_EQUALS_OP"

	// $ANTLR start "NOT_EQUAL_OP"
	public final void mNOT_EQUAL_OP() throws RecognitionException {
		try {
			int _type = NOT_EQUAL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:278:5: ( '!=' | '<>' | '^=' | '~=' )
			int alt26=4;
			switch ( input.LA(1) ) {
			case '!':
				{
				alt26=1;
				}
				break;
			case '<':
				{
				alt26=2;
				}
				break;
			case '^':
				{
				alt26=3;
				}
				break;
			case '~':
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:278:10: '!='
					{
					match("!="); 

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:279:10: '<>'
					{
					match("<>"); 

					}
					break;
				case 3 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:280:10: '^='
					{
					match("^="); 

					}
					break;
				case 4 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:281:10: '~='
					{
					match("~="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUAL_OP"

	// $ANTLR start "CARRET_OPERATOR_PART"
	public final void mCARRET_OPERATOR_PART() throws RecognitionException {
		try {
			int _type = CARRET_OPERATOR_PART;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:284:5: ( '^' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:284:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CARRET_OPERATOR_PART"

	// $ANTLR start "TILDE_OPERATOR_PART"
	public final void mTILDE_OPERATOR_PART() throws RecognitionException {
		try {
			int _type = TILDE_OPERATOR_PART;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:288:5: ( '~' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:288:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE_OPERATOR_PART"

	// $ANTLR start "EXCLAMATION_OPERATOR_PART"
	public final void mEXCLAMATION_OPERATOR_PART() throws RecognitionException {
		try {
			int _type = EXCLAMATION_OPERATOR_PART;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:292:5: ( '!' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:292:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCLAMATION_OPERATOR_PART"

	// $ANTLR start "GREATER_THAN_OP"
	public final void mGREATER_THAN_OP() throws RecognitionException {
		try {
			int _type = GREATER_THAN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:296:5: ( '>' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:296:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN_OP"

	// $ANTLR start "QUESTION_MARK"
	public final void mQUESTION_MARK() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:301:5: ( '?' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:301:10: '?'
			{
			match('?'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_MARK"

	// $ANTLR start "CONCATENATION_OP"
	public final void mCONCATENATION_OP() throws RecognitionException {
		try {
			int _type = CONCATENATION_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:306:5: ( '||' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:306:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONCATENATION_OP"

	// $ANTLR start "VERTICAL_BAR"
	public final void mVERTICAL_BAR() throws RecognitionException {
		try {
			int _type = VERTICAL_BAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:310:5: ( '|' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:310:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERTICAL_BAR"

	// $ANTLR start "EQUALS_OP"
	public final void mEQUALS_OP() throws RecognitionException {
		try {
			int _type = EQUALS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:314:5: ( '=' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:314:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS_OP"

	// $ANTLR start "LEFT_BRACKET"
	public final void mLEFT_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:319:5: ( '[' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:319:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACKET"

	// $ANTLR start "RIGHT_BRACKET"
	public final void mRIGHT_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:323:5: ( ']' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:323:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACKET"

	// $ANTLR start "INTRODUCER"
	public final void mINTRODUCER() throws RecognitionException {
		try {
			int _type = INTRODUCER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:330:5: ( '_' ( SEPARATOR )? )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:330:10: '_' ( SEPARATOR )?
			{
			match('_'); 
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:330:14: ( SEPARATOR )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( ((LA27_0 >= '\t' && LA27_0 <= '\n')||LA27_0=='\r'||LA27_0==' '||LA27_0=='-'||LA27_0=='/') ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:330:15: SEPARATOR
					{
					mSEPARATOR(); 

					_type = UNDERSCORE;
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTRODUCER"

	// $ANTLR start "SEPARATOR"
	public final void mSEPARATOR() throws RecognitionException {
		try {
			int _type = SEPARATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:336:5: ( '-' | COMMENT_FRAGMENT | ( SPACE | NEWLINE )+ )
			int alt29=3;
			switch ( input.LA(1) ) {
			case '-':
				{
				int LA29_1 = input.LA(2);
				if ( (LA29_1=='-') ) {
					alt29=2;
				}

				else {
					alt29=1;
				}

				}
				break;
			case '/':
				{
				alt29=2;
				}
				break;
			case '\t':
			case '\n':
			case '\r':
			case ' ':
				{
				alt29=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:336:10: '-'
					{
					match('-'); 
					_type = MINUS_SIGN;
					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:337:10: COMMENT_FRAGMENT
					{
					mCOMMENT_FRAGMENT(); 

					 _channel=HIDDEN; _type = COMMENT; 
					}
					break;
				case 3 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:338:10: ( SPACE | NEWLINE )+
					{
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:338:10: ( SPACE | NEWLINE )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=3;
						int LA28_0 = input.LA(1);
						if ( (LA28_0=='\t'||LA28_0==' ') ) {
							alt28=1;
						}
						else if ( (LA28_0=='\n'||LA28_0=='\r') ) {
							alt28=2;
						}

						switch (alt28) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:338:11: SPACE
							{
							mSPACE(); 

							}
							break;
						case 2 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:338:19: NEWLINE
							{
							mNEWLINE(); 

							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					 _channel=HIDDEN; 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEPARATOR"

	// $ANTLR start "SIMPLE_LETTER"
	public final void mSIMPLE_LETTER() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:346:5: ( 'a' .. 'z' | 'A' .. 'Z' | 'а' .. 'я' | 'А' .. 'Я' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIMPLE_LETTER"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:354:11: ( ( 'a' | 'A' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:355:11: ( ( 'b' | 'B' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:356:11: ( ( 'c' | 'C' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:357:11: ( ( 'd' | 'D' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:358:11: ( ( 'e' | 'E' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:359:11: ( ( 'f' | 'F' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:360:11: ( ( 'g' | 'G' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:361:11: ( ( 'h' | 'H' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:362:11: ( ( 'i' | 'I' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:363:11: ( ( 'j' | 'J' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:364:11: ( ( 'k' | 'K' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:365:11: ( ( 'l' | 'L' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:366:11: ( ( 'm' | 'M' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:367:11: ( ( 'n' | 'N' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:368:11: ( ( 'o' | 'O' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:369:11: ( ( 'p' | 'P' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:370:11: ( ( 'q' | 'Q' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:371:11: ( ( 'r' | 'R' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:372:11: ( ( 's' | 'S' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:373:11: ( ( 't' | 'T' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:374:11: ( ( 'u' | 'U' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:375:11: ( ( 'v' | 'V' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:376:11: ( ( 'w' | 'W' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:377:11: ( ( 'x' | 'X' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:378:11: ( ( 'y' | 'Y' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:379:11: ( ( 'z' | 'Z' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "UNSIGNED_INTEGER"
	public final void mUNSIGNED_INTEGER() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:385:5: ( ( '0' .. '9' )+ )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:385:10: ( '0' .. '9' )+
			{
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:385:10: ( '0' .. '9' )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= '0' && LA30_0 <= '9')) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_INTEGER"

	// $ANTLR start "COMMENT_FRAGMENT"
	public final void mCOMMENT_FRAGMENT() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:392:5: ( '--' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='-') ) {
				alt34=1;
			}
			else if ( (LA34_0=='/') ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:392:10: '--' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
					{
					match("--"); 

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:392:15: (~ ( '\\r' | '\\n' ) )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( ((LA31_0 >= '\u0000' && LA31_0 <= '\t')||(LA31_0 >= '\u000B' && LA31_0 <= '\f')||(LA31_0 >= '\u000E' && LA31_0 <= '\uFFFF')) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop31;
						}
					}

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:392:35: ( NEWLINE | EOF )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0=='\n'||LA32_0=='\r') ) {
						alt32=1;
					}

					else {
						alt32=2;
					}

					switch (alt32) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:392:36: NEWLINE
							{
							mNEWLINE(); 

							}
							break;
						case 2 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:392:44: EOF
							{
							match(EOF); 

							}
							break;

					}

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:393:10: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:393:15: ( options {greedy=false; } : . )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0=='*') ) {
							int LA33_1 = input.LA(2);
							if ( (LA33_1=='/') ) {
								alt33=2;
							}
							else if ( ((LA33_1 >= '\u0000' && LA33_1 <= '.')||(LA33_1 >= '0' && LA33_1 <= '\uFFFF')) ) {
								alt33=1;
							}

						}
						else if ( ((LA33_0 >= '\u0000' && LA33_0 <= ')')||(LA33_0 >= '+' && LA33_0 <= '\uFFFF')) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:393:41: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop33;
						}
					}

					match("*/"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT_FRAGMENT"

	// $ANTLR start "PROMPT"
	public final void mPROMPT() throws RecognitionException {
		try {
			int _type = PROMPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:400:2: ( 'prompt' SPACE (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:400:4: 'prompt' SPACE (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
			{
			match("prompt"); 

			mSPACE(); 

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:400:19: (~ ( '\\r' | '\\n' ) )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( ((LA35_0 >= '\u0000' && LA35_0 <= '\t')||(LA35_0 >= '\u000B' && LA35_0 <= '\f')||(LA35_0 >= '\u000E' && LA35_0 <= '\uFFFF')) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop35;
				}
			}

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:400:39: ( NEWLINE | EOF )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0=='\n'||LA36_0=='\r') ) {
				alt36=1;
			}

			else {
				alt36=2;
			}

			switch (alt36) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:400:40: NEWLINE
					{
					mNEWLINE(); 

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:400:48: EOF
					{
					match(EOF); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROMPT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:409:5: ( '\\r' ( options {greedy=true; } : '\\n' )? | '\\n' )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0=='\r') ) {
				alt38=1;
			}
			else if ( (LA38_0=='\n') ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:409:10: '\\r' ( options {greedy=true; } : '\\n' )?
					{
					match('\r'); 
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:409:15: ( options {greedy=true; } : '\\n' )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0=='\n') ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:409:39: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:410:10: '\\n'
					{
					match('\n'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:416:10: ( ' ' | '\\t' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "APPROXIMATE_NUM_LIT"
	public final void mAPPROXIMATE_NUM_LIT() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:421:29: ()
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:421:31: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APPROXIMATE_NUM_LIT"

	// $ANTLR start "MINUS_SIGN"
	public final void mMINUS_SIGN() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:422:20: ()
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:422:22: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_SIGN"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:423:20: ()
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:423:22: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "DOUBLE_PERIOD"
	public final void mDOUBLE_PERIOD() throws RecognitionException {
		try {
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:424:23: ()
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:424:25: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_PERIOD"

	// $ANTLR start "SQL92_RESERVED_ALL"
	public final void mSQL92_RESERVED_ALL() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:430:5: ( A L L )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:430:10: A L L
			{
			mA(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ALL"

	// $ANTLR start "SQL92_RESERVED_ALTER"
	public final void mSQL92_RESERVED_ALTER() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:434:5: ( A L T E R )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:434:10: A L T E R
			{
			mA(); 

			mL(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ALTER"

	// $ANTLR start "SQL92_RESERVED_AND"
	public final void mSQL92_RESERVED_AND() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:438:5: ( A N D )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:438:10: A N D
			{
			mA(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_AND"

	// $ANTLR start "SQL92_RESERVED_ANY"
	public final void mSQL92_RESERVED_ANY() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:442:5: ( A N Y )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:442:10: A N Y
			{
			mA(); 

			mN(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ANY"

	// $ANTLR start "SQL92_RESERVED_AS"
	public final void mSQL92_RESERVED_AS() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:446:5: ( A S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:446:10: A S
			{
			mA(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_AS"

	// $ANTLR start "SQL92_RESERVED_ASC"
	public final void mSQL92_RESERVED_ASC() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:450:5: ( A S C )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:450:10: A S C
			{
			mA(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ASC"

	// $ANTLR start "SQL92_RESERVED_BEGIN"
	public final void mSQL92_RESERVED_BEGIN() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:458:5: ( B E G I N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:458:10: B E G I N
			{
			mB(); 

			mE(); 

			mG(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_BEGIN"

	// $ANTLR start "SQL92_RESERVED_BETWEEN"
	public final void mSQL92_RESERVED_BETWEEN() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:462:5: ( B E T W E E N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:462:10: B E T W E E N
			{
			mB(); 

			mE(); 

			mT(); 

			mW(); 

			mE(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_BETWEEN"

	// $ANTLR start "SQL92_RESERVED_BY"
	public final void mSQL92_RESERVED_BY() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:466:5: ( B Y )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:466:10: B Y
			{
			mB(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_BY"

	// $ANTLR start "SQL92_RESERVED_CASE"
	public final void mSQL92_RESERVED_CASE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:470:5: ( C A S E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:470:10: C A S E
			{
			mC(); 

			mA(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_CASE"

	// $ANTLR start "SQL92_RESERVED_CHECK"
	public final void mSQL92_RESERVED_CHECK() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_CHECK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:474:5: ( C H E C K )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:474:10: C H E C K
			{
			mC(); 

			mH(); 

			mE(); 

			mC(); 

			mK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_CHECK"

	// $ANTLR start "PLSQL_RESERVED_CLUSTERS"
	public final void mPLSQL_RESERVED_CLUSTERS() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_CLUSTERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:478:5: ( C L U S T E R S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:478:10: C L U S T E R S
			{
			mC(); 

			mL(); 

			mU(); 

			mS(); 

			mT(); 

			mE(); 

			mR(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_CLUSTERS"

	// $ANTLR start "PLSQL_RESERVED_COLAUTH"
	public final void mPLSQL_RESERVED_COLAUTH() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_COLAUTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:482:5: ( C O L A U T H )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:482:10: C O L A U T H
			{
			mC(); 

			mO(); 

			mL(); 

			mA(); 

			mU(); 

			mT(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_COLAUTH"

	// $ANTLR start "PLSQL_RESERVED_COMPRESS"
	public final void mPLSQL_RESERVED_COMPRESS() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_COMPRESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:486:5: ( C O M P R E S S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:486:10: C O M P R E S S
			{
			mC(); 

			mO(); 

			mM(); 

			mP(); 

			mR(); 

			mE(); 

			mS(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_COMPRESS"

	// $ANTLR start "SQL92_RESERVED_CONNECT"
	public final void mSQL92_RESERVED_CONNECT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_CONNECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:490:5: ( C O N N E C T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:490:10: C O N N E C T
			{
			mC(); 

			mO(); 

			mN(); 

			mN(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_CONNECT"

	// $ANTLR start "PLSQL_NON_RESERVED_CONNECT_BY_ROOT"
	public final void mPLSQL_NON_RESERVED_CONNECT_BY_ROOT() throws RecognitionException {
		try {
			int _type = PLSQL_NON_RESERVED_CONNECT_BY_ROOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:498:5: ( C O N N E C T '_' B Y '_' R O O T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:498:10: C O N N E C T '_' B Y '_' R O O T
			{
			mC(); 

			mO(); 

			mN(); 

			mN(); 

			mE(); 

			mC(); 

			mT(); 

			match('_'); 
			mB(); 

			mY(); 

			match('_'); 
			mR(); 

			mO(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_NON_RESERVED_CONNECT_BY_ROOT"

	// $ANTLR start "PLSQL_RESERVED_CRASH"
	public final void mPLSQL_RESERVED_CRASH() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_CRASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:502:5: ( C R A S H )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:502:10: C R A S H
			{
			mC(); 

			mR(); 

			mA(); 

			mS(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_CRASH"

	// $ANTLR start "SQL92_RESERVED_CREATE"
	public final void mSQL92_RESERVED_CREATE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:506:5: ( C R E A T E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:506:10: C R E A T E
			{
			mC(); 

			mR(); 

			mE(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_CREATE"

	// $ANTLR start "SQL92_RESERVED_CURRENT"
	public final void mSQL92_RESERVED_CURRENT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:510:5: ( C U R R E N T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:510:10: C U R R E N T
			{
			mC(); 

			mU(); 

			mR(); 

			mR(); 

			mE(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_CURRENT"

	// $ANTLR start "SQL92_RESERVED_CURSOR"
	public final void mSQL92_RESERVED_CURSOR() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:514:5: ( C U R S O R )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:514:10: C U R S O R
			{
			mC(); 

			mU(); 

			mR(); 

			mS(); 

			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_CURSOR"

	// $ANTLR start "SQL92_RESERVED_DATE"
	public final void mSQL92_RESERVED_DATE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:518:5: ( D A T E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:518:10: D A T E
			{
			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DATE"

	// $ANTLR start "SQL92_RESERVED_DECLARE"
	public final void mSQL92_RESERVED_DECLARE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DECLARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:522:5: ( D E C L A R E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:522:10: D E C L A R E
			{
			mD(); 

			mE(); 

			mC(); 

			mL(); 

			mA(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DECLARE"

	// $ANTLR start "SQL92_RESERVED_DEFAULT"
	public final void mSQL92_RESERVED_DEFAULT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:526:5: ( D E F A U L T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:526:10: D E F A U L T
			{
			mD(); 

			mE(); 

			mF(); 

			mA(); 

			mU(); 

			mL(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DEFAULT"

	// $ANTLR start "SQL92_RESERVED_DELETE"
	public final void mSQL92_RESERVED_DELETE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:530:5: ( D E L E T E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:530:10: D E L E T E
			{
			mD(); 

			mE(); 

			mL(); 

			mE(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DELETE"

	// $ANTLR start "SQL92_RESERVED_DESC"
	public final void mSQL92_RESERVED_DESC() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:534:5: ( D E S C )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:534:10: D E S C
			{
			mD(); 

			mE(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DESC"

	// $ANTLR start "SQL92_RESERVED_DISTINCT"
	public final void mSQL92_RESERVED_DISTINCT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:538:5: ( D I S T I N C T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:538:10: D I S T I N C T
			{
			mD(); 

			mI(); 

			mS(); 

			mT(); 

			mI(); 

			mN(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DISTINCT"

	// $ANTLR start "SQL92_RESERVED_DROP"
	public final void mSQL92_RESERVED_DROP() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:542:5: ( D R O P )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:542:10: D R O P
			{
			mD(); 

			mR(); 

			mO(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_DROP"

	// $ANTLR start "SQL92_RESERVED_ELSE"
	public final void mSQL92_RESERVED_ELSE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:546:5: ( E L S E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:546:10: E L S E
			{
			mE(); 

			mL(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ELSE"

	// $ANTLR start "SQL92_RESERVED_END"
	public final void mSQL92_RESERVED_END() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:550:5: ( E N D )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:550:10: E N D
			{
			mE(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_END"

	// $ANTLR start "SQL92_RESERVED_EXCEPTION"
	public final void mSQL92_RESERVED_EXCEPTION() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_EXCEPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken e=null;

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:554:5: ( (e= 'exception' |e= 'EXCEPTION' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:554:10: (e= 'exception' |e= 'EXCEPTION' )
			{
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:554:10: (e= 'exception' |e= 'EXCEPTION' )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0=='e') ) {
				alt39=1;
			}
			else if ( (LA39_0=='E') ) {
				alt39=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:554:11: e= 'exception'
					{
					int eStart = getCharIndex();
					match("exception"); 
					int eStartLine3106 = getLine();
					int eStartCharPos3106 = getCharPositionInLine();
					e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);
					e.setLine(eStartLine3106);
					e.setCharPositionInLine(eStartCharPos3106);

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:554:27: e= 'EXCEPTION'
					{
					int eStart = getCharIndex();
					match("EXCEPTION"); 
					int eStartLine3112 = getLine();
					int eStartCharPos3112 = getCharPositionInLine();
					e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);
					e.setLine(eStartLine3112);
					e.setCharPositionInLine(eStartCharPos3112);

					}
					break;

			}


			    e.setType(SQL92_RESERVED_EXCEPTION);
			    emit(e);
			    advanceInput();

			    _type = Token.INVALID_TOKEN_TYPE;
			    int markModel = input.mark();

			    // Now loop over next Tokens in the input and eventually set Token's type to REGULAR_ID

			    // Subclassed version will return NULL unless EOF is reached.
			    // nextToken either returns NULL => then the next token is put into the queue tokenBuffer
			    // or it returns Token.EOF, then nothing is put into the queue
			    Token t1 = super.nextToken();
			    {    // This "if" handles the situation when the "model" is the last text in the input.
			        if( t1 != null && t1.getType() == Token.EOF)
			        {
			             e.setType(REGULAR_ID);
			        } else {
			             t1 = tokenBuffer.pollLast(); // "withdraw" the next token from the queue
			             while(true)
			             {
			                 if(t1.getType() == EOF)   // is it EOF?
			                 {
			                     e.setType(REGULAR_ID);
			                     break;
			                 }

			                 if(t1.getChannel() == HIDDEN) // is it a white space? then advance to the next token
			                 {
			                     t1 = super.nextToken(); if( t1 == null) { t1 = tokenBuffer.pollLast(); };
			                     continue;
			                 }

			                 if( t1.getType() != SQL92_RESERVED_WHEN && t1.getType() != SEMICOLON) // is something other than "when"
			                 {
			                     e.setType(REGULAR_ID);
			                     break;
			                 }

			                 break; // we are in the model_clase do not rewrite anything
			              } // while true
			         } // else if( t1 != null && t1.getType() == Token.EOF)
			    }
			    input.rewind(markModel);
			    
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_EXCEPTION"

	// $ANTLR start "PLSQL_RESERVED_EXCLUSIVE"
	public final void mPLSQL_RESERVED_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:607:5: ( E X C L U S I V E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:607:10: E X C L U S I V E
			{
			mE(); 

			mX(); 

			mC(); 

			mL(); 

			mU(); 

			mS(); 

			mI(); 

			mV(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_EXCLUSIVE"

	// $ANTLR start "SQL92_RESERVED_EXISTS"
	public final void mSQL92_RESERVED_EXISTS() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:611:5: ( E X I S T S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:611:10: E X I S T S
			{
			mE(); 

			mX(); 

			mI(); 

			mS(); 

			mT(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_EXISTS"

	// $ANTLR start "SQL92_RESERVED_FALSE"
	public final void mSQL92_RESERVED_FALSE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:615:5: ( F A L S E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:615:10: F A L S E
			{
			mF(); 

			mA(); 

			mL(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_FALSE"

	// $ANTLR start "SQL92_RESERVED_FETCH"
	public final void mSQL92_RESERVED_FETCH() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:619:5: ( F E T C H )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:619:10: F E T C H
			{
			mF(); 

			mE(); 

			mT(); 

			mC(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_FETCH"

	// $ANTLR start "SQL92_RESERVED_FOR"
	public final void mSQL92_RESERVED_FOR() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:623:5: ( F O R )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:623:10: F O R
			{
			mF(); 

			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_FOR"

	// $ANTLR start "SQL92_RESERVED_FROM"
	public final void mSQL92_RESERVED_FROM() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:627:5: ( F R O M )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:627:10: F R O M
			{
			mF(); 

			mR(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_FROM"

	// $ANTLR start "SQL92_RESERVED_GOTO"
	public final void mSQL92_RESERVED_GOTO() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:631:5: ( G O T O )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:631:10: G O T O
			{
			mG(); 

			mO(); 

			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_GOTO"

	// $ANTLR start "SQL92_RESERVED_GRANT"
	public final void mSQL92_RESERVED_GRANT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:635:5: ( G R A N T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:635:10: G R A N T
			{
			mG(); 

			mR(); 

			mA(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_GRANT"

	// $ANTLR start "SQL92_RESERVED_GROUP"
	public final void mSQL92_RESERVED_GROUP() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:639:5: ( G R O U P )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:639:10: G R O U P
			{
			mG(); 

			mR(); 

			mO(); 

			mU(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_GROUP"

	// $ANTLR start "SQL92_RESERVED_HAVING"
	public final void mSQL92_RESERVED_HAVING() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:643:5: ( H A V I N G )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:643:10: H A V I N G
			{
			mH(); 

			mA(); 

			mV(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_HAVING"

	// $ANTLR start "PLSQL_RESERVED_IDENTIFIED"
	public final void mPLSQL_RESERVED_IDENTIFIED() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_IDENTIFIED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:647:5: ( I D E N T I F I E D )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:647:10: I D E N T I F I E D
			{
			mI(); 

			mD(); 

			mE(); 

			mN(); 

			mT(); 

			mI(); 

			mF(); 

			mI(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_IDENTIFIED"

	// $ANTLR start "PLSQL_RESERVED_IF"
	public final void mPLSQL_RESERVED_IF() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:651:5: ( I F )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:651:10: I F
			{
			mI(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_IF"

	// $ANTLR start "SQL92_RESERVED_IN"
	public final void mSQL92_RESERVED_IN() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:655:5: ( I N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:655:10: I N
			{
			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_IN"

	// $ANTLR start "PLSQL_RESERVED_INDEX"
	public final void mPLSQL_RESERVED_INDEX() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:659:5: ( I N D E X )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:659:10: I N D E X
			{
			mI(); 

			mN(); 

			mD(); 

			mE(); 

			mX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_INDEX"

	// $ANTLR start "PLSQL_RESERVED_INDEXES"
	public final void mPLSQL_RESERVED_INDEXES() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:663:5: ( I N D E X E S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:663:10: I N D E X E S
			{
			mI(); 

			mN(); 

			mD(); 

			mE(); 

			mX(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_INDEXES"

	// $ANTLR start "SQL92_RESERVED_INSERT"
	public final void mSQL92_RESERVED_INSERT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:667:5: ( I N S E R T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:667:10: I N S E R T
			{
			mI(); 

			mN(); 

			mS(); 

			mE(); 

			mR(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_INSERT"

	// $ANTLR start "SQL92_RESERVED_INTERSECT"
	public final void mSQL92_RESERVED_INTERSECT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:671:5: ( I N T E R S E C T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:671:10: I N T E R S E C T
			{
			mI(); 

			mN(); 

			mT(); 

			mE(); 

			mR(); 

			mS(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_INTERSECT"

	// $ANTLR start "SQL92_RESERVED_INTO"
	public final void mSQL92_RESERVED_INTO() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:675:5: ( I N T O )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:675:10: I N T O
			{
			mI(); 

			mN(); 

			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_INTO"

	// $ANTLR start "SQL92_RESERVED_IS"
	public final void mSQL92_RESERVED_IS() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:679:5: ( I S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:679:10: I S
			{
			mI(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_IS"

	// $ANTLR start "SQL92_RESERVED_LIKE"
	public final void mSQL92_RESERVED_LIKE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:683:5: ( L I K E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:683:10: L I K E
			{
			mL(); 

			mI(); 

			mK(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_LIKE"

	// $ANTLR start "PLSQL_RESERVED_LOCK"
	public final void mPLSQL_RESERVED_LOCK() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:687:5: ( L O C K )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:687:10: L O C K
			{
			mL(); 

			mO(); 

			mC(); 

			mK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_LOCK"

	// $ANTLR start "PLSQL_RESERVED_MINUS"
	public final void mPLSQL_RESERVED_MINUS() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:691:5: ( M I N U S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:691:10: M I N U S
			{
			mM(); 

			mI(); 

			mN(); 

			mU(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_MINUS"

	// $ANTLR start "PLSQL_RESERVED_MODE"
	public final void mPLSQL_RESERVED_MODE() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_MODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:695:5: ( M O D E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:695:10: M O D E
			{
			mM(); 

			mO(); 

			mD(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_MODE"

	// $ANTLR start "PLSQL_RESERVED_NOCOMPRESS"
	public final void mPLSQL_RESERVED_NOCOMPRESS() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_NOCOMPRESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:699:5: ( N O C O M P R E S S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:699:10: N O C O M P R E S S
			{
			mN(); 

			mO(); 

			mC(); 

			mO(); 

			mM(); 

			mP(); 

			mR(); 

			mE(); 

			mS(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_NOCOMPRESS"

	// $ANTLR start "SQL92_RESERVED_NOT"
	public final void mSQL92_RESERVED_NOT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:703:5: ( N O T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:703:10: N O T
			{
			mN(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_NOT"

	// $ANTLR start "PLSQL_RESERVED_NOWAIT"
	public final void mPLSQL_RESERVED_NOWAIT() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_NOWAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:707:5: ( N O W A I T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:707:10: N O W A I T
			{
			mN(); 

			mO(); 

			mW(); 

			mA(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_NOWAIT"

	// $ANTLR start "SQL92_RESERVED_NULL"
	public final void mSQL92_RESERVED_NULL() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:711:5: ( N U L L )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:711:10: N U L L
			{
			mN(); 

			mU(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_NULL"

	// $ANTLR start "SQL92_RESERVED_OF"
	public final void mSQL92_RESERVED_OF() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:715:5: ( O F )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:715:10: O F
			{
			mO(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_OF"

	// $ANTLR start "SQL92_RESERVED_ON"
	public final void mSQL92_RESERVED_ON() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:719:5: ( O N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:719:10: O N
			{
			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ON"

	// $ANTLR start "SQL92_RESERVED_OPTION"
	public final void mSQL92_RESERVED_OPTION() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:723:5: ( O P T I O N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:723:10: O P T I O N
			{
			mO(); 

			mP(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_OPTION"

	// $ANTLR start "SQL92_RESERVED_OR"
	public final void mSQL92_RESERVED_OR() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:727:5: ( O R )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:727:10: O R
			{
			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_OR"

	// $ANTLR start "SQL92_RESERVED_ORDER"
	public final void mSQL92_RESERVED_ORDER() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:731:5: ( O R D E R )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:731:10: O R D E R
			{
			mO(); 

			mR(); 

			mD(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_ORDER"

	// $ANTLR start "SQL92_RESERVED_OVERLAPS"
	public final void mSQL92_RESERVED_OVERLAPS() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_OVERLAPS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:735:5: ( O V E R L A P S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:735:10: O V E R L A P S
			{
			mO(); 

			mV(); 

			mE(); 

			mR(); 

			mL(); 

			mA(); 

			mP(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_OVERLAPS"

	// $ANTLR start "SQL92_RESERVED_PRIOR"
	public final void mSQL92_RESERVED_PRIOR() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_PRIOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:739:5: ( P R I O R )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:739:10: P R I O R
			{
			mP(); 

			mR(); 

			mI(); 

			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_PRIOR"

	// $ANTLR start "SQL92_RESERVED_PROCEDURE"
	public final void mSQL92_RESERVED_PROCEDURE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:743:5: ( P R O C E D U R E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:743:10: P R O C E D U R E
			{
			mP(); 

			mR(); 

			mO(); 

			mC(); 

			mE(); 

			mD(); 

			mU(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_PROCEDURE"

	// $ANTLR start "SQL92_RESERVED_PUBLIC"
	public final void mSQL92_RESERVED_PUBLIC() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:747:5: ( P U B L I C )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:747:10: P U B L I C
			{
			mP(); 

			mU(); 

			mB(); 

			mL(); 

			mI(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_PUBLIC"

	// $ANTLR start "PLSQL_RESERVED_RESOURCE"
	public final void mPLSQL_RESERVED_RESOURCE() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_RESOURCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:751:5: ( R E S O U R C E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:751:10: R E S O U R C E
			{
			mR(); 

			mE(); 

			mS(); 

			mO(); 

			mU(); 

			mR(); 

			mC(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_RESOURCE"

	// $ANTLR start "SQL92_RESERVED_REVOKE"
	public final void mSQL92_RESERVED_REVOKE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:755:5: ( R E V O K E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:755:10: R E V O K E
			{
			mR(); 

			mE(); 

			mV(); 

			mO(); 

			mK(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_REVOKE"

	// $ANTLR start "SQL92_RESERVED_SELECT"
	public final void mSQL92_RESERVED_SELECT() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:759:5: ( S E L E C T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:759:10: S E L E C T
			{
			mS(); 

			mE(); 

			mL(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_SELECT"

	// $ANTLR start "PLSQL_RESERVED_SHARE"
	public final void mPLSQL_RESERVED_SHARE() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_SHARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:763:5: ( S H A R E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:763:10: S H A R E
			{
			mS(); 

			mH(); 

			mA(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_SHARE"

	// $ANTLR start "SQL92_RESERVED_SIZE"
	public final void mSQL92_RESERVED_SIZE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_SIZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:767:5: ( S I Z E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:767:10: S I Z E
			{
			mS(); 

			mI(); 

			mZ(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_SIZE"

	// $ANTLR start "PLSQL_RESERVED_START"
	public final void mPLSQL_RESERVED_START() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:775:5: ( S T A R T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:775:10: S T A R T
			{
			mS(); 

			mT(); 

			mA(); 

			mR(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_START"

	// $ANTLR start "PLSQL_RESERVED_TABAUTH"
	public final void mPLSQL_RESERVED_TABAUTH() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_TABAUTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:779:5: ( T A B A U T H )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:779:10: T A B A U T H
			{
			mT(); 

			mA(); 

			mB(); 

			mA(); 

			mU(); 

			mT(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_TABAUTH"

	// $ANTLR start "SQL92_RESERVED_TABLE"
	public final void mSQL92_RESERVED_TABLE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:783:5: ( T A B L E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:783:10: T A B L E
			{
			mT(); 

			mA(); 

			mB(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_TABLE"

	// $ANTLR start "SQL92_RESERVED_THE"
	public final void mSQL92_RESERVED_THE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_THE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:787:5: ( T H E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:787:10: T H E
			{
			mT(); 

			mH(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_THE"

	// $ANTLR start "SQL92_RESERVED_THEN"
	public final void mSQL92_RESERVED_THEN() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:791:5: ( T H E N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:791:10: T H E N
			{
			mT(); 

			mH(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_THEN"

	// $ANTLR start "SQL92_RESERVED_TO"
	public final void mSQL92_RESERVED_TO() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:795:5: ( T O )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:795:10: T O
			{
			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_TO"

	// $ANTLR start "SQL92_RESERVED_TRUE"
	public final void mSQL92_RESERVED_TRUE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:799:5: ( T R U E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:799:10: T R U E
			{
			mT(); 

			mR(); 

			mU(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_TRUE"

	// $ANTLR start "SQL92_RESERVED_UNION"
	public final void mSQL92_RESERVED_UNION() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:803:5: ( U N I O N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:803:10: U N I O N
			{
			mU(); 

			mN(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_UNION"

	// $ANTLR start "SQL92_RESERVED_UNIQUE"
	public final void mSQL92_RESERVED_UNIQUE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:807:5: ( U N I Q U E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:807:10: U N I Q U E
			{
			mU(); 

			mN(); 

			mI(); 

			mQ(); 

			mU(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_UNIQUE"

	// $ANTLR start "SQL92_RESERVED_UPDATE"
	public final void mSQL92_RESERVED_UPDATE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:811:5: ( U P D A T E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:811:10: U P D A T E
			{
			mU(); 

			mP(); 

			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_UPDATE"

	// $ANTLR start "SQL92_RESERVED_VALUES"
	public final void mSQL92_RESERVED_VALUES() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:815:5: ( V A L U E S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:815:10: V A L U E S
			{
			mV(); 

			mA(); 

			mL(); 

			mU(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_VALUES"

	// $ANTLR start "SQL92_RESERVED_VIEW"
	public final void mSQL92_RESERVED_VIEW() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:819:5: ( V I E W )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:819:10: V I E W
			{
			mV(); 

			mI(); 

			mE(); 

			mW(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_VIEW"

	// $ANTLR start "PLSQL_RESERVED_VIEWS"
	public final void mPLSQL_RESERVED_VIEWS() throws RecognitionException {
		try {
			int _type = PLSQL_RESERVED_VIEWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:823:5: ( V I E W S )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:823:10: V I E W S
			{
			mV(); 

			mI(); 

			mE(); 

			mW(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_RESERVED_VIEWS"

	// $ANTLR start "SQL92_RESERVED_WHEN"
	public final void mSQL92_RESERVED_WHEN() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:827:5: ( W H E N )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:827:10: W H E N
			{
			mW(); 

			mH(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_WHEN"

	// $ANTLR start "SQL92_RESERVED_WHERE"
	public final void mSQL92_RESERVED_WHERE() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:831:5: ( W H E R E )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:831:10: W H E R E
			{
			mW(); 

			mH(); 

			mE(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_WHERE"

	// $ANTLR start "SQL92_RESERVED_WITH"
	public final void mSQL92_RESERVED_WITH() throws RecognitionException {
		try {
			int _type = SQL92_RESERVED_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:835:5: ( W I T H )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:835:10: W I T H
			{
			mW(); 

			mI(); 

			mT(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQL92_RESERVED_WITH"

	// $ANTLR start "PLSQL_NON_RESERVED_USING"
	public final void mPLSQL_NON_RESERVED_USING() throws RecognitionException {
		try {
			int _type = PLSQL_NON_RESERVED_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:839:5: ( U S I N G )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:839:10: U S I N G
			{
			mU(); 

			mS(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_NON_RESERVED_USING"

	// $ANTLR start "PLSQL_NON_RESERVED_MODEL"
	public final void mPLSQL_NON_RESERVED_MODEL() throws RecognitionException {
		try {
			int _type = PLSQL_NON_RESERVED_MODEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken m=null;

			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:843:5: ( (m= 'model' |m= 'MODEL' ) )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:843:10: (m= 'model' |m= 'MODEL' )
			{
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:843:10: (m= 'model' |m= 'MODEL' )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0=='m') ) {
				alt40=1;
			}
			else if ( (LA40_0=='M') ) {
				alt40=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:843:11: m= 'model'
					{
					int mStart = getCharIndex();
					match("model"); 
					int mStartLine4791 = getLine();
					int mStartCharPos4791 = getCharPositionInLine();
					m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart, getCharIndex()-1);
					m.setLine(mStartLine4791);
					m.setCharPositionInLine(mStartCharPos4791);

					}
					break;
				case 2 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:843:23: m= 'MODEL'
					{
					int mStart = getCharIndex();
					match("MODEL"); 
					int mStartLine4797 = getLine();
					int mStartCharPos4797 = getCharPositionInLine();
					m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart, getCharIndex()-1);
					m.setLine(mStartLine4797);
					m.setCharPositionInLine(mStartCharPos4797);

					}
					break;

			}


			         // "model" is a keyword if and only if it is followed by ("main"|"partition"|"dimension")
			         // otherwise it is a identifier(REGULAR_ID).
			         // This wodoo implements something like context sensitive lexer.
			         // Here we've matched the word "model". Then the Token is created and en-queued in tokenBuffer
			         // We still remember the reference(m) onto this Token
			         m.setType(PLSQL_NON_RESERVED_MODEL);
			         emit(m);
			         advanceInput();

			         _type = Token.INVALID_TOKEN_TYPE;
			         int markModel = input.mark();

			         // Now loop over next Tokens in the input and eventually set Token's type to REGULAR_ID

			         // Subclassed version will return NULL unless EOF is reached.
			         // nextToken either returns NULL => then the next token is put into the queue tokenBuffer
			         // or it returns Token.EOF, then nothing is put into the queue
			         Token t1 = super.nextToken();
			         {    // This "if" handles the situation when the "model" is the last text in the input.
			              if( t1 != null && t1.getType() == Token.EOF)
			              {
			                  m.setType(REGULAR_ID);
			              } else {
			                  t1 = tokenBuffer.pollLast(); // "withdraw" the next token from the queue
			                  while(true)
			                  {
			                     if(t1.getType() == EOF)   // is it EOF?
			                     {
			                         m.setType(REGULAR_ID);
			                         break;
			                     }

			                     if(t1.getChannel() == HIDDEN) // is it a white space? then advance to the next token
			                     {
			                         t1 = super.nextToken(); if( t1 == null) { t1 = tokenBuffer.pollLast(); };
			                         continue;
			                     }

			                     if( t1.getType() != REGULAR_ID || // is something other than ("main"|"partition"|"dimension")
			                        ( !t1.getText().equalsIgnoreCase("main") &&
			                          !t1.getText().equalsIgnoreCase("partition") &&
			                          !t1.getText().equalsIgnoreCase("dimension")
			                       ))
			                     {
			                         m.setType(REGULAR_ID);
			                         break;
			                     }

			                     break; // we are in the model_clase do not rewrite anything
			                  } // while true
			              } // else if( t1 != null && t1.getType() == Token.EOF)
			         }
			         input.rewind(markModel);
			    
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_NON_RESERVED_MODEL"

	// $ANTLR start "PLSQL_NON_RESERVED_ELSIF"
	public final void mPLSQL_NON_RESERVED_ELSIF() throws RecognitionException {
		try {
			int _type = PLSQL_NON_RESERVED_ELSIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:902:5: ( E L S I F )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:902:10: E L S I F
			{
			mE(); 

			mL(); 

			mS(); 

			mI(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_NON_RESERVED_ELSIF"

	// $ANTLR start "PLSQL_NON_RESERVED_PIVOT"
	public final void mPLSQL_NON_RESERVED_PIVOT() throws RecognitionException {
		try {
			int _type = PLSQL_NON_RESERVED_PIVOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:906:5: ( P I V O T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:906:10: P I V O T
			{
			mP(); 

			mI(); 

			mV(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_NON_RESERVED_PIVOT"

	// $ANTLR start "PLSQL_NON_RESERVED_UNPIVOT"
	public final void mPLSQL_NON_RESERVED_UNPIVOT() throws RecognitionException {
		try {
			int _type = PLSQL_NON_RESERVED_UNPIVOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:910:5: ( U N P I V O T )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:910:10: U N P I V O T
			{
			mU(); 

			mN(); 

			mP(); 

			mI(); 

			mV(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLSQL_NON_RESERVED_UNPIVOT"

	// $ANTLR start "REGULAR_ID"
	public final void mREGULAR_ID() throws RecognitionException {
		try {
			int _type = REGULAR_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:914:5: ( ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )* )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:914:10: ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:914:26: ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= '#' && LA41_0 <= '$')||(LA41_0 >= '0' && LA41_0 <= '9')||(LA41_0 >= 'A' && LA41_0 <= 'Z')||LA41_0=='_'||(LA41_0 >= 'a' && LA41_0 <= 'z')) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:
					{
					if ( (input.LA(1) >= '#' && input.LA(1) <= '$')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop41;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGULAR_ID"

	// $ANTLR start "ZV"
	public final void mZV() throws RecognitionException {
		try {
			int _type = ZV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:918:5: ( '@!' )
			// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:918:10: '@!'
			{
			match("@!"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZV"

	@Override
	public void mTokens() throws RecognitionException {
		// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:8: ( NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | PERIOD | EXACT_NUM_LIT | CHAR_STRING | CHAR_STRING_PERL | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | DOUBLE_ASTERISK | ASTERISK | PLUS_SIGN | COMMA | SOLIDUS | AT_SIGN | ASSIGN_OP | BINDVAR | COLON | SEMICOLON | LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OR_EQUALS_OP | NOT_EQUAL_OP | CARRET_OPERATOR_PART | TILDE_OPERATOR_PART | EXCLAMATION_OPERATOR_PART | GREATER_THAN_OP | CONCATENATION_OP | VERTICAL_BAR | EQUALS_OP | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR | PROMPT | SQL92_RESERVED_ALL | SQL92_RESERVED_ALTER | SQL92_RESERVED_AND | SQL92_RESERVED_ANY | SQL92_RESERVED_AS | SQL92_RESERVED_ASC | SQL92_RESERVED_BEGIN | SQL92_RESERVED_BETWEEN | SQL92_RESERVED_BY | SQL92_RESERVED_CASE | SQL92_RESERVED_CHECK | PLSQL_RESERVED_CLUSTERS | PLSQL_RESERVED_COLAUTH | PLSQL_RESERVED_COMPRESS | SQL92_RESERVED_CONNECT | PLSQL_NON_RESERVED_CONNECT_BY_ROOT | PLSQL_RESERVED_CRASH | SQL92_RESERVED_CREATE | SQL92_RESERVED_CURRENT | SQL92_RESERVED_CURSOR | SQL92_RESERVED_DATE | SQL92_RESERVED_DECLARE | SQL92_RESERVED_DEFAULT | SQL92_RESERVED_DELETE | SQL92_RESERVED_DESC | SQL92_RESERVED_DISTINCT | SQL92_RESERVED_DROP | SQL92_RESERVED_ELSE | SQL92_RESERVED_END | SQL92_RESERVED_EXCEPTION | PLSQL_RESERVED_EXCLUSIVE | SQL92_RESERVED_EXISTS | SQL92_RESERVED_FALSE | SQL92_RESERVED_FETCH | SQL92_RESERVED_FOR | SQL92_RESERVED_FROM | SQL92_RESERVED_GOTO | SQL92_RESERVED_GRANT | SQL92_RESERVED_GROUP | SQL92_RESERVED_HAVING | PLSQL_RESERVED_IDENTIFIED | PLSQL_RESERVED_IF | SQL92_RESERVED_IN | PLSQL_RESERVED_INDEX | PLSQL_RESERVED_INDEXES | SQL92_RESERVED_INSERT | SQL92_RESERVED_INTERSECT | SQL92_RESERVED_INTO | SQL92_RESERVED_IS | SQL92_RESERVED_LIKE | PLSQL_RESERVED_LOCK | PLSQL_RESERVED_MINUS | PLSQL_RESERVED_MODE | PLSQL_RESERVED_NOCOMPRESS | SQL92_RESERVED_NOT | PLSQL_RESERVED_NOWAIT | SQL92_RESERVED_NULL | SQL92_RESERVED_OF | SQL92_RESERVED_ON | SQL92_RESERVED_OPTION | SQL92_RESERVED_OR | SQL92_RESERVED_ORDER | SQL92_RESERVED_OVERLAPS | SQL92_RESERVED_PRIOR | SQL92_RESERVED_PROCEDURE | SQL92_RESERVED_PUBLIC | PLSQL_RESERVED_RESOURCE | SQL92_RESERVED_REVOKE | SQL92_RESERVED_SELECT | PLSQL_RESERVED_SHARE | SQL92_RESERVED_SIZE | PLSQL_RESERVED_START | PLSQL_RESERVED_TABAUTH | SQL92_RESERVED_TABLE | SQL92_RESERVED_THE | SQL92_RESERVED_THEN | SQL92_RESERVED_TO | SQL92_RESERVED_TRUE | SQL92_RESERVED_UNION | SQL92_RESERVED_UNIQUE | SQL92_RESERVED_UPDATE | SQL92_RESERVED_VALUES | SQL92_RESERVED_VIEW | PLSQL_RESERVED_VIEWS | SQL92_RESERVED_WHEN | SQL92_RESERVED_WHERE | SQL92_RESERVED_WITH | PLSQL_NON_RESERVED_USING | PLSQL_NON_RESERVED_MODEL | PLSQL_NON_RESERVED_ELSIF | PLSQL_NON_RESERVED_PIVOT | PLSQL_NON_RESERVED_UNPIVOT | REGULAR_ID | ZV )
		int alt42=132;
		alt42 = dfa42.predict(input);
		switch (alt42) {
			case 1 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:10: NATIONAL_CHAR_STRING_LIT
				{
				mNATIONAL_CHAR_STRING_LIT(); 

				}
				break;
			case 2 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:35: BIT_STRING_LIT
				{
				mBIT_STRING_LIT(); 

				}
				break;
			case 3 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:50: HEX_STRING_LIT
				{
				mHEX_STRING_LIT(); 

				}
				break;
			case 4 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:65: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 5 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:72: EXACT_NUM_LIT
				{
				mEXACT_NUM_LIT(); 

				}
				break;
			case 6 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:86: CHAR_STRING
				{
				mCHAR_STRING(); 

				}
				break;
			case 7 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:98: CHAR_STRING_PERL
				{
				mCHAR_STRING_PERL(); 

				}
				break;
			case 8 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:115: DELIMITED_ID
				{
				mDELIMITED_ID(); 

				}
				break;
			case 9 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:128: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 10 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:136: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 11 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:146: LEFT_PAREN
				{
				mLEFT_PAREN(); 

				}
				break;
			case 12 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:157: RIGHT_PAREN
				{
				mRIGHT_PAREN(); 

				}
				break;
			case 13 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:169: DOUBLE_ASTERISK
				{
				mDOUBLE_ASTERISK(); 

				}
				break;
			case 14 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:185: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 15 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:194: PLUS_SIGN
				{
				mPLUS_SIGN(); 

				}
				break;
			case 16 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:204: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 17 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:210: SOLIDUS
				{
				mSOLIDUS(); 

				}
				break;
			case 18 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:218: AT_SIGN
				{
				mAT_SIGN(); 

				}
				break;
			case 19 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:226: ASSIGN_OP
				{
				mASSIGN_OP(); 

				}
				break;
			case 20 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:236: BINDVAR
				{
				mBINDVAR(); 

				}
				break;
			case 21 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:244: COLON
				{
				mCOLON(); 

				}
				break;
			case 22 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:250: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 23 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:260: LESS_THAN_OR_EQUALS_OP
				{
				mLESS_THAN_OR_EQUALS_OP(); 

				}
				break;
			case 24 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:283: LESS_THAN_OP
				{
				mLESS_THAN_OP(); 

				}
				break;
			case 25 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:296: GREATER_THAN_OR_EQUALS_OP
				{
				mGREATER_THAN_OR_EQUALS_OP(); 

				}
				break;
			case 26 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:322: NOT_EQUAL_OP
				{
				mNOT_EQUAL_OP(); 

				}
				break;
			case 27 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:335: CARRET_OPERATOR_PART
				{
				mCARRET_OPERATOR_PART(); 

				}
				break;
			case 28 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:356: TILDE_OPERATOR_PART
				{
				mTILDE_OPERATOR_PART(); 

				}
				break;
			case 29 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:376: EXCLAMATION_OPERATOR_PART
				{
				mEXCLAMATION_OPERATOR_PART(); 

				}
				break;
			case 30 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:402: GREATER_THAN_OP
				{
				mGREATER_THAN_OP(); 

				}
				break;
			case 31 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:418: CONCATENATION_OP
				{
				mCONCATENATION_OP(); 

				}
				break;
			case 32 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:435: VERTICAL_BAR
				{
				mVERTICAL_BAR(); 

				}
				break;
			case 33 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:448: EQUALS_OP
				{
				mEQUALS_OP(); 

				}
				break;
			case 34 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:458: LEFT_BRACKET
				{
				mLEFT_BRACKET(); 

				}
				break;
			case 35 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:471: RIGHT_BRACKET
				{
				mRIGHT_BRACKET(); 

				}
				break;
			case 36 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:485: INTRODUCER
				{
				mINTRODUCER(); 

				}
				break;
			case 37 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:496: SEPARATOR
				{
				mSEPARATOR(); 

				}
				break;
			case 38 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:506: PROMPT
				{
				mPROMPT(); 

				}
				break;
			case 39 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:513: SQL92_RESERVED_ALL
				{
				mSQL92_RESERVED_ALL(); 

				}
				break;
			case 40 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:532: SQL92_RESERVED_ALTER
				{
				mSQL92_RESERVED_ALTER(); 

				}
				break;
			case 41 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:553: SQL92_RESERVED_AND
				{
				mSQL92_RESERVED_AND(); 

				}
				break;
			case 42 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:572: SQL92_RESERVED_ANY
				{
				mSQL92_RESERVED_ANY(); 

				}
				break;
			case 43 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:591: SQL92_RESERVED_AS
				{
				mSQL92_RESERVED_AS(); 

				}
				break;
			case 44 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:609: SQL92_RESERVED_ASC
				{
				mSQL92_RESERVED_ASC(); 

				}
				break;
			case 45 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:628: SQL92_RESERVED_BEGIN
				{
				mSQL92_RESERVED_BEGIN(); 

				}
				break;
			case 46 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:649: SQL92_RESERVED_BETWEEN
				{
				mSQL92_RESERVED_BETWEEN(); 

				}
				break;
			case 47 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:672: SQL92_RESERVED_BY
				{
				mSQL92_RESERVED_BY(); 

				}
				break;
			case 48 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:690: SQL92_RESERVED_CASE
				{
				mSQL92_RESERVED_CASE(); 

				}
				break;
			case 49 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:710: SQL92_RESERVED_CHECK
				{
				mSQL92_RESERVED_CHECK(); 

				}
				break;
			case 50 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:731: PLSQL_RESERVED_CLUSTERS
				{
				mPLSQL_RESERVED_CLUSTERS(); 

				}
				break;
			case 51 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:755: PLSQL_RESERVED_COLAUTH
				{
				mPLSQL_RESERVED_COLAUTH(); 

				}
				break;
			case 52 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:778: PLSQL_RESERVED_COMPRESS
				{
				mPLSQL_RESERVED_COMPRESS(); 

				}
				break;
			case 53 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:802: SQL92_RESERVED_CONNECT
				{
				mSQL92_RESERVED_CONNECT(); 

				}
				break;
			case 54 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:825: PLSQL_NON_RESERVED_CONNECT_BY_ROOT
				{
				mPLSQL_NON_RESERVED_CONNECT_BY_ROOT(); 

				}
				break;
			case 55 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:860: PLSQL_RESERVED_CRASH
				{
				mPLSQL_RESERVED_CRASH(); 

				}
				break;
			case 56 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:881: SQL92_RESERVED_CREATE
				{
				mSQL92_RESERVED_CREATE(); 

				}
				break;
			case 57 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:903: SQL92_RESERVED_CURRENT
				{
				mSQL92_RESERVED_CURRENT(); 

				}
				break;
			case 58 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:926: SQL92_RESERVED_CURSOR
				{
				mSQL92_RESERVED_CURSOR(); 

				}
				break;
			case 59 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:948: SQL92_RESERVED_DATE
				{
				mSQL92_RESERVED_DATE(); 

				}
				break;
			case 60 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:968: SQL92_RESERVED_DECLARE
				{
				mSQL92_RESERVED_DECLARE(); 

				}
				break;
			case 61 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:991: SQL92_RESERVED_DEFAULT
				{
				mSQL92_RESERVED_DEFAULT(); 

				}
				break;
			case 62 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1014: SQL92_RESERVED_DELETE
				{
				mSQL92_RESERVED_DELETE(); 

				}
				break;
			case 63 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1036: SQL92_RESERVED_DESC
				{
				mSQL92_RESERVED_DESC(); 

				}
				break;
			case 64 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1056: SQL92_RESERVED_DISTINCT
				{
				mSQL92_RESERVED_DISTINCT(); 

				}
				break;
			case 65 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1080: SQL92_RESERVED_DROP
				{
				mSQL92_RESERVED_DROP(); 

				}
				break;
			case 66 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1100: SQL92_RESERVED_ELSE
				{
				mSQL92_RESERVED_ELSE(); 

				}
				break;
			case 67 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1120: SQL92_RESERVED_END
				{
				mSQL92_RESERVED_END(); 

				}
				break;
			case 68 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1139: SQL92_RESERVED_EXCEPTION
				{
				mSQL92_RESERVED_EXCEPTION(); 

				}
				break;
			case 69 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1164: PLSQL_RESERVED_EXCLUSIVE
				{
				mPLSQL_RESERVED_EXCLUSIVE(); 

				}
				break;
			case 70 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1189: SQL92_RESERVED_EXISTS
				{
				mSQL92_RESERVED_EXISTS(); 

				}
				break;
			case 71 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1211: SQL92_RESERVED_FALSE
				{
				mSQL92_RESERVED_FALSE(); 

				}
				break;
			case 72 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1232: SQL92_RESERVED_FETCH
				{
				mSQL92_RESERVED_FETCH(); 

				}
				break;
			case 73 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1253: SQL92_RESERVED_FOR
				{
				mSQL92_RESERVED_FOR(); 

				}
				break;
			case 74 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1272: SQL92_RESERVED_FROM
				{
				mSQL92_RESERVED_FROM(); 

				}
				break;
			case 75 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1292: SQL92_RESERVED_GOTO
				{
				mSQL92_RESERVED_GOTO(); 

				}
				break;
			case 76 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1312: SQL92_RESERVED_GRANT
				{
				mSQL92_RESERVED_GRANT(); 

				}
				break;
			case 77 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1333: SQL92_RESERVED_GROUP
				{
				mSQL92_RESERVED_GROUP(); 

				}
				break;
			case 78 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1354: SQL92_RESERVED_HAVING
				{
				mSQL92_RESERVED_HAVING(); 

				}
				break;
			case 79 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1376: PLSQL_RESERVED_IDENTIFIED
				{
				mPLSQL_RESERVED_IDENTIFIED(); 

				}
				break;
			case 80 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1402: PLSQL_RESERVED_IF
				{
				mPLSQL_RESERVED_IF(); 

				}
				break;
			case 81 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1420: SQL92_RESERVED_IN
				{
				mSQL92_RESERVED_IN(); 

				}
				break;
			case 82 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1438: PLSQL_RESERVED_INDEX
				{
				mPLSQL_RESERVED_INDEX(); 

				}
				break;
			case 83 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1459: PLSQL_RESERVED_INDEXES
				{
				mPLSQL_RESERVED_INDEXES(); 

				}
				break;
			case 84 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1482: SQL92_RESERVED_INSERT
				{
				mSQL92_RESERVED_INSERT(); 

				}
				break;
			case 85 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1504: SQL92_RESERVED_INTERSECT
				{
				mSQL92_RESERVED_INTERSECT(); 

				}
				break;
			case 86 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1529: SQL92_RESERVED_INTO
				{
				mSQL92_RESERVED_INTO(); 

				}
				break;
			case 87 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1549: SQL92_RESERVED_IS
				{
				mSQL92_RESERVED_IS(); 

				}
				break;
			case 88 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1567: SQL92_RESERVED_LIKE
				{
				mSQL92_RESERVED_LIKE(); 

				}
				break;
			case 89 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1587: PLSQL_RESERVED_LOCK
				{
				mPLSQL_RESERVED_LOCK(); 

				}
				break;
			case 90 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1607: PLSQL_RESERVED_MINUS
				{
				mPLSQL_RESERVED_MINUS(); 

				}
				break;
			case 91 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1628: PLSQL_RESERVED_MODE
				{
				mPLSQL_RESERVED_MODE(); 

				}
				break;
			case 92 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1648: PLSQL_RESERVED_NOCOMPRESS
				{
				mPLSQL_RESERVED_NOCOMPRESS(); 

				}
				break;
			case 93 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1674: SQL92_RESERVED_NOT
				{
				mSQL92_RESERVED_NOT(); 

				}
				break;
			case 94 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1693: PLSQL_RESERVED_NOWAIT
				{
				mPLSQL_RESERVED_NOWAIT(); 

				}
				break;
			case 95 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1715: SQL92_RESERVED_NULL
				{
				mSQL92_RESERVED_NULL(); 

				}
				break;
			case 96 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1735: SQL92_RESERVED_OF
				{
				mSQL92_RESERVED_OF(); 

				}
				break;
			case 97 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1753: SQL92_RESERVED_ON
				{
				mSQL92_RESERVED_ON(); 

				}
				break;
			case 98 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1771: SQL92_RESERVED_OPTION
				{
				mSQL92_RESERVED_OPTION(); 

				}
				break;
			case 99 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1793: SQL92_RESERVED_OR
				{
				mSQL92_RESERVED_OR(); 

				}
				break;
			case 100 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1811: SQL92_RESERVED_ORDER
				{
				mSQL92_RESERVED_ORDER(); 

				}
				break;
			case 101 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1832: SQL92_RESERVED_OVERLAPS
				{
				mSQL92_RESERVED_OVERLAPS(); 

				}
				break;
			case 102 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1856: SQL92_RESERVED_PRIOR
				{
				mSQL92_RESERVED_PRIOR(); 

				}
				break;
			case 103 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1877: SQL92_RESERVED_PROCEDURE
				{
				mSQL92_RESERVED_PROCEDURE(); 

				}
				break;
			case 104 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1902: SQL92_RESERVED_PUBLIC
				{
				mSQL92_RESERVED_PUBLIC(); 

				}
				break;
			case 105 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1924: PLSQL_RESERVED_RESOURCE
				{
				mPLSQL_RESERVED_RESOURCE(); 

				}
				break;
			case 106 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1948: SQL92_RESERVED_REVOKE
				{
				mSQL92_RESERVED_REVOKE(); 

				}
				break;
			case 107 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1970: SQL92_RESERVED_SELECT
				{
				mSQL92_RESERVED_SELECT(); 

				}
				break;
			case 108 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:1992: PLSQL_RESERVED_SHARE
				{
				mPLSQL_RESERVED_SHARE(); 

				}
				break;
			case 109 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2013: SQL92_RESERVED_SIZE
				{
				mSQL92_RESERVED_SIZE(); 

				}
				break;
			case 110 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2033: PLSQL_RESERVED_START
				{
				mPLSQL_RESERVED_START(); 

				}
				break;
			case 111 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2054: PLSQL_RESERVED_TABAUTH
				{
				mPLSQL_RESERVED_TABAUTH(); 

				}
				break;
			case 112 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2077: SQL92_RESERVED_TABLE
				{
				mSQL92_RESERVED_TABLE(); 

				}
				break;
			case 113 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2098: SQL92_RESERVED_THE
				{
				mSQL92_RESERVED_THE(); 

				}
				break;
			case 114 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2117: SQL92_RESERVED_THEN
				{
				mSQL92_RESERVED_THEN(); 

				}
				break;
			case 115 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2137: SQL92_RESERVED_TO
				{
				mSQL92_RESERVED_TO(); 

				}
				break;
			case 116 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2155: SQL92_RESERVED_TRUE
				{
				mSQL92_RESERVED_TRUE(); 

				}
				break;
			case 117 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2175: SQL92_RESERVED_UNION
				{
				mSQL92_RESERVED_UNION(); 

				}
				break;
			case 118 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2196: SQL92_RESERVED_UNIQUE
				{
				mSQL92_RESERVED_UNIQUE(); 

				}
				break;
			case 119 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2218: SQL92_RESERVED_UPDATE
				{
				mSQL92_RESERVED_UPDATE(); 

				}
				break;
			case 120 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2240: SQL92_RESERVED_VALUES
				{
				mSQL92_RESERVED_VALUES(); 

				}
				break;
			case 121 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2262: SQL92_RESERVED_VIEW
				{
				mSQL92_RESERVED_VIEW(); 

				}
				break;
			case 122 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2282: PLSQL_RESERVED_VIEWS
				{
				mPLSQL_RESERVED_VIEWS(); 

				}
				break;
			case 123 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2303: SQL92_RESERVED_WHEN
				{
				mSQL92_RESERVED_WHEN(); 

				}
				break;
			case 124 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2323: SQL92_RESERVED_WHERE
				{
				mSQL92_RESERVED_WHERE(); 

				}
				break;
			case 125 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2344: SQL92_RESERVED_WITH
				{
				mSQL92_RESERVED_WITH(); 

				}
				break;
			case 126 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2364: PLSQL_NON_RESERVED_USING
				{
				mPLSQL_NON_RESERVED_USING(); 

				}
				break;
			case 127 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2389: PLSQL_NON_RESERVED_MODEL
				{
				mPLSQL_NON_RESERVED_MODEL(); 

				}
				break;
			case 128 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2414: PLSQL_NON_RESERVED_ELSIF
				{
				mPLSQL_NON_RESERVED_ELSIF(); 

				}
				break;
			case 129 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2439: PLSQL_NON_RESERVED_PIVOT
				{
				mPLSQL_NON_RESERVED_PIVOT(); 

				}
				break;
			case 130 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2464: PLSQL_NON_RESERVED_UNPIVOT
				{
				mPLSQL_NON_RESERVED_UNPIVOT(); 

				}
				break;
			case 131 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2491: REGULAR_ID
				{
				mREGULAR_ID(); 

				}
				break;
			case 132 :
				// F:\\Antlr\\plsql-postgresql-converter-master\\plsql-parser\\lexer-parser-walker/src/main/antlr3/br/com/porcelli/parser/plsql/PLSQLLexer.g:1:2502: ZV
				{
				mZV(); 

				}
				break;

		}
	}


	protected DFA42 dfa42 = new DFA42(this);
	static final String DFA42_eotS =
		"\1\uffff\3\65\1\75\2\uffff\1\65\5\uffff\1\100\2\uffff\1\101\1\103\1\105"+
		"\2\uffff\1\110\1\112\1\113\1\114\1\115\1\117\5\uffff\25\65\2\uffff\2\65"+
		"\1\uffff\1\65\1\u0092\24\uffff\6\65\1\u009c\27\65\1\u00bd\1\u00be\1\u00c2"+
		"\5\65\1\u00c8\1\u00c9\1\65\1\u00cb\10\65\1\u00d6\12\65\1\u00e2\4\65\1"+
		"\uffff\5\65\1\u00ec\1\65\1\u00ee\1\u00ef\1\uffff\1\u00f0\24\65\1\u0107"+
		"\3\65\1\u010b\6\65\2\uffff\3\65\1\uffff\5\65\2\uffff\1\65\1\uffff\11\65"+
		"\1\u0126\1\uffff\13\65\1\uffff\1\65\1\u0136\7\65\1\uffff\1\65\3\uffff"+
		"\1\u013f\11\65\1\u0149\3\65\1\u014d\1\65\1\u014f\3\65\1\u0153\1\65\1\uffff"+
		"\3\65\1\uffff\1\u0158\1\u0159\7\65\1\u0161\1\u0162\1\u0163\2\u0165\10"+
		"\65\1\u016e\3\65\1\uffff\1\u0172\1\u0173\6\65\1\u017a\1\u017c\1\65\1\u017e"+
		"\1\u0165\2\65\1\uffff\1\u0182\3\65\1\u0186\1\65\1\u0188\1\u0189\1\uffff"+
		"\1\u018a\4\65\1\u018f\3\65\1\uffff\3\65\1\uffff\1\65\1\uffff\3\65\1\uffff"+
		"\1\u019a\1\65\1\u019c\1\u019d\2\uffff\1\u019e\1\u019f\2\65\1\u01a2\2\65"+
		"\3\uffff\1\u01a6\1\uffff\1\u01a7\1\65\1\u01a9\4\65\1\u01ae\1\uffff\1\u01af"+
		"\1\65\1\u01b1\2\uffff\1\u01b2\3\65\1\u01b6\1\65\1\uffff\1\u01b8\1\uffff"+
		"\1\u01b9\1\uffff\1\u01a6\1\65\1\u01bb\1\uffff\3\65\1\uffff\1\u01bf\3\uffff"+
		"\4\65\1\uffff\1\u01c4\1\65\1\u01c6\2\65\1\u01c9\3\65\1\u01cd\1\uffff\1"+
		"\65\4\uffff\1\u01cf\1\65\1\uffff\1\65\1\u01d2\1\65\2\uffff\1\u01d4\1\uffff"+
		"\2\65\1\u01d7\1\u01d8\2\uffff\1\65\2\uffff\1\u01da\1\65\1\u01dc\1\uffff"+
		"\1\u01dd\2\uffff\1\65\1\uffff\1\u01df\1\uffff\1\65\1\uffff\1\65\1\u01e2"+
		"\1\65\1\u01e4\1\uffff\1\u01e6\1\uffff\1\u01e7\1\u01e8\1\uffff\3\65\1\uffff"+
		"\1\65\1\uffff\1\65\1\u01ee\1\uffff\1\65\1\uffff\2\65\2\uffff\1\u01f2\1"+
		"\uffff\1\u01f3\2\uffff\1\65\1\uffff\1\65\1\u01f6\1\uffff\1\u01f7\1\uffff"+
		"\1\65\3\uffff\1\u01f9\4\65\1\uffff\1\65\1\u01ff\1\u0200\2\uffff\1\65\1"+
		"\u0202\2\uffff\1\65\1\uffff\1\u0204\1\u0205\1\u0204\1\65\1\u0207\2\uffff"+
		"\1\u0208\1\uffff\1\65\2\uffff\1\u020a\2\uffff\1\65\1\uffff\3\65\1\u020f"+
		"\1\uffff";
	static final String DFA42_eofS =
		"\u0210\uffff";
	static final String DFA42_minS =
		"\1\11\3\47\1\60\2\uffff\1\47\5\uffff\1\52\2\uffff\1\52\1\41\1\42\2\uffff"+
		"\5\75\1\174\5\uffff\1\111\1\114\2\101\2\114\1\101\1\117\1\101\1\104\2"+
		"\111\1\106\1\111\2\105\1\101\1\116\1\101\1\110\1\111\2\uffff\1\103\1\114"+
		"\1\uffff\1\107\1\43\24\uffff\2\111\1\102\1\126\1\114\1\104\1\43\1\123"+
		"\1\105\1\125\1\114\1\101\1\122\1\124\1\103\1\123\1\117\1\103\1\123\1\104"+
		"\2\103\1\114\1\124\1\122\1\117\1\124\1\101\1\126\1\105\3\43\1\113\1\103"+
		"\1\104\1\116\1\104\2\43\1\124\1\43\1\105\1\123\1\114\1\101\1\132\1\101"+
		"\1\102\1\105\1\43\1\125\1\111\1\104\1\111\1\114\2\105\1\124\1\104\1\117"+
		"\1\43\1\101\1\114\1\111\1\127\1\uffff\1\103\1\117\1\103\1\114\1\117\1"+
		"\43\1\105\2\43\1\uffff\1\43\1\105\1\103\1\123\1\101\1\120\1\116\1\123"+
		"\1\101\1\122\1\105\1\114\1\101\1\105\1\103\1\124\1\120\2\114\1\123\1\105"+
		"\1\43\1\105\1\123\1\103\1\43\1\115\1\117\1\116\1\125\1\111\1\116\2\uffff"+
		"\3\105\1\uffff\1\105\1\113\2\105\1\125\2\uffff\1\111\1\uffff\1\105\1\122"+
		"\2\117\1\105\1\122\1\105\1\122\1\101\1\43\1\uffff\1\105\1\117\1\111\1"+
		"\101\1\116\1\125\1\127\1\116\1\110\1\105\1\115\1\uffff\1\111\1\43\1\116"+
		"\1\105\1\160\1\105\1\122\1\111\1\124\1\uffff\1\122\3\uffff\1\43\1\113"+
		"\1\124\1\125\1\122\1\105\1\110\1\124\1\105\1\117\1\43\1\101\1\125\1\124"+
		"\1\43\1\111\1\43\1\160\1\125\1\124\1\43\1\106\1\uffff\1\120\1\105\1\110"+
		"\1\uffff\2\43\1\124\1\120\1\116\1\124\1\130\2\122\5\43\1\123\1\117\1\122"+
		"\1\114\1\125\1\113\1\103\1\105\1\43\1\124\1\125\1\105\1\uffff\2\43\1\116"+
		"\1\125\1\126\1\124\1\107\1\105\2\43\1\105\2\43\1\120\1\124\1\uffff\1\43"+
		"\1\105\1\164\1\104\1\43\1\103\2\43\1\uffff\1\43\1\105\1\124\1\105\1\103"+
		"\1\43\1\105\1\116\1\122\1\uffff\1\122\1\114\1\105\1\uffff\1\116\1\uffff"+
		"\1\164\2\123\1\uffff\1\43\1\124\2\43\2\uffff\2\43\1\107\1\111\1\43\1\124"+
		"\1\123\3\uffff\1\43\1\uffff\1\43\1\116\1\43\1\101\1\122\1\105\1\124\1"+
		"\43\1\uffff\1\43\1\124\1\43\2\uffff\1\43\1\105\1\117\1\105\1\43\1\123"+
		"\1\uffff\1\43\1\uffff\1\43\1\uffff\1\43\1\122\1\43\1\uffff\1\116\1\11"+
		"\1\125\1\uffff\1\43\3\uffff\1\122\1\110\1\123\1\124\1\uffff\1\43\1\124"+
		"\1\43\1\105\1\124\1\43\1\103\1\151\1\111\1\43\1\uffff\1\111\4\uffff\1"+
		"\43\1\106\1\uffff\1\123\1\43\1\105\2\uffff\1\43\1\uffff\1\120\1\103\2"+
		"\43\2\uffff\1\110\2\uffff\1\43\1\124\1\43\1\uffff\1\43\2\uffff\1\105\1"+
		"\uffff\1\43\1\uffff\1\122\1\uffff\1\123\1\43\1\123\1\43\1\uffff\1\43\1"+
		"\uffff\2\43\1\uffff\1\124\1\157\1\126\1\uffff\1\117\1\uffff\1\111\1\43"+
		"\1\uffff\1\103\1\uffff\1\123\1\105\2\uffff\1\43\1\uffff\1\43\2\uffff\1"+
		"\123\1\uffff\1\105\1\43\1\uffff\1\43\1\uffff\1\102\3\uffff\1\43\1\156"+
		"\1\105\1\116\1\105\1\uffff\1\124\2\43\2\uffff\1\123\1\43\2\uffff\1\131"+
		"\1\uffff\3\43\1\104\1\43\2\uffff\1\43\1\uffff\1\137\2\uffff\1\43\2\uffff"+
		"\1\122\1\uffff\2\117\1\124\1\43\1\uffff";
	static final String DFA42_maxS =
		"\1\176\1\165\1\171\1\47\1\71\2\uffff\1\47\5\uffff\1\52\2\uffff\1\52\1"+
		"\41\1\172\2\uffff\1\76\4\75\1\174\5\uffff\1\165\1\163\1\165\1\162\2\170"+
		"\2\162\1\141\1\163\2\157\1\166\1\165\1\145\1\164\1\162\1\163\2\151\1\157"+
		"\2\uffff\1\167\1\154\1\uffff\1\164\1\172\24\uffff\2\157\1\142\1\166\1"+
		"\164\1\171\1\172\1\163\1\145\1\165\1\156\1\145\1\162\1\164\2\163\1\157"+
		"\1\151\1\163\1\144\2\151\1\154\1\164\1\162\1\157\1\164\1\157\1\166\1\145"+
		"\3\172\1\153\1\143\1\144\1\156\1\144\2\172\1\164\1\172\1\145\1\166\1\154"+
		"\1\141\1\172\1\141\1\142\1\145\1\172\1\165\1\160\1\144\1\151\1\154\2\145"+
		"\1\164\1\144\1\157\1\172\1\141\1\154\1\151\1\167\1\uffff\1\155\1\157\1"+
		"\143\1\154\1\157\1\172\1\145\2\172\1\uffff\1\172\1\145\1\143\1\163\1\141"+
		"\1\160\1\156\1\163\1\141\1\163\1\145\1\154\1\141\1\145\1\143\1\164\1\160"+
		"\2\154\1\163\1\151\1\172\1\154\1\163\1\143\1\172\1\155\1\157\1\156\1\165"+
		"\1\151\1\156\2\uffff\2\145\1\157\1\uffff\1\145\1\153\2\145\1\165\2\uffff"+
		"\1\151\1\uffff\1\145\1\162\2\157\1\145\1\162\1\145\1\162\1\154\1\172\1"+
		"\uffff\1\145\1\161\1\151\1\141\1\156\1\165\1\167\1\162\1\150\1\145\1\155"+
		"\1\uffff\1\151\1\172\1\156\1\145\1\160\1\145\1\162\1\151\1\164\1\uffff"+
		"\1\162\3\uffff\1\172\1\153\1\164\1\165\1\162\1\145\1\150\1\164\1\145\1"+
		"\157\1\172\1\141\1\165\1\164\1\172\1\151\1\172\1\160\1\165\1\164\1\172"+
		"\1\146\1\uffff\1\120\1\145\1\150\1\uffff\2\172\1\164\1\160\1\156\1\164"+
		"\1\170\2\162\5\172\1\163\1\157\1\162\1\154\1\165\1\153\1\143\1\145\1\172"+
		"\1\164\1\165\1\145\1\uffff\2\172\1\156\1\165\1\166\1\164\1\147\1\145\2"+
		"\172\1\145\2\172\1\160\1\164\1\uffff\1\172\1\145\1\164\1\144\1\172\1\143"+
		"\2\172\1\uffff\1\172\1\145\1\164\1\145\1\143\1\172\1\145\1\156\1\162\1"+
		"\uffff\1\162\1\154\1\145\1\uffff\1\156\1\uffff\1\164\2\163\1\uffff\1\172"+
		"\1\124\2\172\2\uffff\2\172\1\147\1\151\1\172\1\164\1\163\3\uffff\1\172"+
		"\1\uffff\1\172\1\156\1\172\1\141\1\162\1\145\1\164\1\172\1\uffff\1\172"+
		"\1\164\1\172\2\uffff\1\172\1\145\1\157\1\145\1\172\1\163\1\uffff\1\172"+
		"\1\uffff\1\172\1\uffff\1\172\1\162\1\172\1\uffff\1\156\1\40\1\165\1\uffff"+
		"\1\172\3\uffff\1\162\1\150\1\163\1\164\1\uffff\1\172\1\164\1\172\1\145"+
		"\1\164\1\172\1\143\2\151\1\172\1\uffff\1\111\4\uffff\1\172\1\146\1\uffff"+
		"\1\163\1\172\1\145\2\uffff\1\172\1\uffff\1\160\1\143\2\172\2\uffff\1\150"+
		"\2\uffff\1\172\1\164\1\172\1\uffff\1\172\2\uffff\1\145\1\uffff\1\172\1"+
		"\uffff\1\162\1\uffff\1\163\1\172\1\163\1\172\1\uffff\1\172\1\uffff\2\172"+
		"\1\uffff\1\164\1\157\1\166\1\uffff\1\117\1\uffff\1\151\1\172\1\uffff\1"+
		"\143\1\uffff\1\163\1\145\2\uffff\1\172\1\uffff\1\172\2\uffff\1\163\1\uffff"+
		"\1\145\1\172\1\uffff\1\172\1\uffff\1\142\3\uffff\1\172\1\156\1\145\1\116"+
		"\1\145\1\uffff\1\164\2\172\2\uffff\1\163\1\172\2\uffff\1\171\1\uffff\3"+
		"\172\1\144\1\172\2\uffff\1\172\1\uffff\1\137\2\uffff\1\172\2\uffff\1\162"+
		"\1\uffff\2\157\1\164\1\172\1\uffff";
	static final String DFA42_acceptS =
		"\5\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\17\1\20\3"+
		"\uffff\1\24\1\26\6\uffff\1\41\1\42\1\43\1\44\1\45\25\uffff\1\u0083\1\1"+
		"\2\uffff\1\2\2\uffff\1\3\1\4\1\7\1\15\1\16\1\21\1\u0084\1\22\1\23\1\25"+
		"\1\27\1\32\1\30\1\31\1\36\1\35\1\33\1\34\1\37\1\40\102\uffff\1\57\11\uffff"+
		"\1\53\40\uffff\1\120\1\121\3\uffff\1\127\5\uffff\1\140\1\141\1\uffff\1"+
		"\143\12\uffff\1\163\13\uffff\1\135\11\uffff\1\47\1\uffff\1\51\1\52\1\54"+
		"\26\uffff\1\103\3\uffff\1\111\32\uffff\1\161\17\uffff\1\137\10\uffff\1"+
		"\60\11\uffff\1\73\3\uffff\1\77\1\uffff\1\101\3\uffff\1\102\4\uffff\1\112"+
		"\1\113\7\uffff\1\126\1\130\1\131\1\uffff\1\133\10\uffff\1\155\3\uffff"+
		"\1\162\1\164\6\uffff\1\171\1\uffff\1\173\1\uffff\1\175\3\uffff\1\55\3"+
		"\uffff\1\146\1\uffff\1\u0081\1\50\1\61\4\uffff\1\67\12\uffff\1\u0080\1"+
		"\uffff\1\107\1\110\1\114\1\115\2\uffff\1\122\3\uffff\1\177\1\132\1\uffff"+
		"\1\144\4\uffff\1\154\1\156\1\uffff\1\160\1\165\3\uffff\1\176\1\uffff\1"+
		"\172\1\174\1\uffff\1\136\1\uffff\1\46\1\uffff\1\150\4\uffff\1\70\1\uffff"+
		"\1\72\2\uffff\1\76\3\uffff\1\106\1\uffff\1\116\2\uffff\1\124\1\uffff\1"+
		"\142\2\uffff\1\152\1\153\1\uffff\1\166\1\uffff\1\167\1\170\1\uffff\1\56"+
		"\2\uffff\1\63\1\uffff\1\65\1\uffff\1\71\1\74\1\75\5\uffff\1\123\3\uffff"+
		"\1\157\1\u0082\2\uffff\1\62\1\64\1\uffff\1\100\5\uffff\1\145\1\151\1\uffff"+
		"\1\147\1\uffff\1\104\1\105\1\uffff\1\125\1\134\1\uffff\1\117\4\uffff\1"+
		"\66";
	static final String DFA42_specialS =
		"\u0210\uffff}>";
	static final String[] DFA42_transitionS = {
			"\2\37\2\uffff\1\37\22\uffff\1\37\1\27\1\10\2\uffff\1\11\1\12\1\6\1\13"+
			"\1\14\1\15\1\16\1\17\1\37\1\4\1\20\12\5\1\22\1\24\1\25\1\33\1\26\1\23"+
			"\1\21\1\41\1\2\1\42\1\43\1\45\1\46\1\47\1\50\1\51\2\65\1\52\1\64\1\1"+
			"\1\54\1\55\1\7\1\56\1\57\1\60\1\61\1\62\1\63\1\3\2\65\1\34\1\uffff\1"+
			"\35\1\30\1\36\1\uffff\1\41\1\2\1\42\1\43\1\44\1\46\1\47\1\50\1\51\2\65"+
			"\1\52\1\53\1\1\1\54\1\40\1\7\1\56\1\57\1\60\1\61\1\62\1\63\1\3\2\65\1"+
			"\uffff\1\32\1\uffff\1\31",
			"\1\66\47\uffff\1\67\5\uffff\1\70\31\uffff\1\67\5\uffff\1\70",
			"\1\71\35\uffff\1\72\23\uffff\1\73\13\uffff\1\72\23\uffff\1\73",
			"\1\74",
			"\12\5",
			"",
			"",
			"\1\76",
			"",
			"",
			"",
			"",
			"",
			"\1\77",
			"",
			"",
			"\1\37",
			"\1\102",
			"\1\23\15\uffff\12\23\3\uffff\1\104\3\uffff\32\23\6\uffff\32\23",
			"",
			"",
			"\1\106\1\107",
			"\1\111",
			"\1\107",
			"\1\107",
			"\1\107",
			"\1\116",
			"",
			"",
			"",
			"",
			"",
			"\1\123\10\uffff\1\121\2\uffff\1\122\23\uffff\1\123\10\uffff\1\120\2"+
			"\uffff\1\122",
			"\1\124\1\uffff\1\125\4\uffff\1\126\30\uffff\1\124\1\uffff\1\125\4\uffff"+
			"\1\126",
			"\1\127\6\uffff\1\130\3\uffff\1\131\2\uffff\1\132\2\uffff\1\133\2\uffff"+
			"\1\134\13\uffff\1\127\6\uffff\1\130\3\uffff\1\131\2\uffff\1\132\2\uffff"+
			"\1\133\2\uffff\1\134",
			"\1\135\3\uffff\1\136\3\uffff\1\137\10\uffff\1\140\16\uffff\1\135\3\uffff"+
			"\1\136\3\uffff\1\137\10\uffff\1\140",
			"\1\142\1\uffff\1\143\11\uffff\1\144\23\uffff\1\142\1\uffff\1\143\11"+
			"\uffff\1\141",
			"\1\142\1\uffff\1\143\11\uffff\1\145\23\uffff\1\142\1\uffff\1\143\11"+
			"\uffff\1\144",
			"\1\146\3\uffff\1\147\11\uffff\1\150\2\uffff\1\151\16\uffff\1\146\3\uffff"+
			"\1\147\11\uffff\1\150\2\uffff\1\151",
			"\1\152\2\uffff\1\153\34\uffff\1\152\2\uffff\1\153",
			"\1\154\37\uffff\1\154",
			"\1\155\1\uffff\1\156\7\uffff\1\157\4\uffff\1\160\20\uffff\1\155\1\uffff"+
			"\1\156\7\uffff\1\157\4\uffff\1\160",
			"\1\161\5\uffff\1\162\31\uffff\1\161\5\uffff\1\162",
			"\1\164\5\uffff\1\165\31\uffff\1\164\5\uffff\1\163",
			"\1\166\7\uffff\1\167\1\uffff\1\170\1\uffff\1\171\3\uffff\1\172\17\uffff"+
			"\1\166\7\uffff\1\167\1\uffff\1\170\1\uffff\1\171\3\uffff\1\172",
			"\1\123\10\uffff\1\121\2\uffff\1\122\23\uffff\1\123\10\uffff\1\121\2"+
			"\uffff\1\122",
			"\1\173\37\uffff\1\173",
			"\1\174\2\uffff\1\175\1\176\12\uffff\1\177\20\uffff\1\174\2\uffff\1\175"+
			"\1\176\12\uffff\1\177",
			"\1\u0080\6\uffff\1\u0081\6\uffff\1\u0082\2\uffff\1\u0083\16\uffff\1"+
			"\u0080\6\uffff\1\u0081\6\uffff\1\u0082\2\uffff\1\u0083",
			"\1\u0084\1\uffff\1\u0085\2\uffff\1\u0086\32\uffff\1\u0084\1\uffff\1"+
			"\u0085\2\uffff\1\u0086",
			"\1\u0087\7\uffff\1\u0088\27\uffff\1\u0087\7\uffff\1\u0088",
			"\1\u0089\1\u008a\36\uffff\1\u0089\1\u008a",
			"\1\164\5\uffff\1\u008b\31\uffff\1\164\5\uffff\1\165",
			"",
			"",
			"\1\u008c\20\uffff\1\u008d\2\uffff\1\u008e\13\uffff\1\u008c\20\uffff"+
			"\1\u008d\2\uffff\1\u008e",
			"\1\u008f\37\uffff\1\u008f",
			"",
			"\1\u0090\14\uffff\1\u0091\22\uffff\1\u0090\14\uffff\1\u0091",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0094\5\uffff\1\u0095\31\uffff\1\u0094\5\uffff\1\u0093",
			"\1\u0094\5\uffff\1\u0095\31\uffff\1\u0094\5\uffff\1\u0095",
			"\1\u0096\37\uffff\1\u0096",
			"\1\u0097\37\uffff\1\u0097",
			"\1\u0098\7\uffff\1\u0099\27\uffff\1\u0098\7\uffff\1\u0099",
			"\1\u009a\24\uffff\1\u009b\12\uffff\1\u009a\24\uffff\1\u009b",
			"\2\65\13\uffff\12\65\7\uffff\2\65\1\u009d\27\65\4\uffff\1\65\1\uffff"+
			"\2\65\1\u009d\27\65",
			"\1\u009e\37\uffff\1\u009e",
			"\1\u009f\37\uffff\1\u009f",
			"\1\u00a0\37\uffff\1\u00a0",
			"\1\u00a1\1\u00a2\1\u00a3\35\uffff\1\u00a1\1\u00a2\1\u00a3",
			"\1\u00a4\3\uffff\1\u00a5\33\uffff\1\u00a4\3\uffff\1\u00a5",
			"\1\u00a6\37\uffff\1\u00a6",
			"\1\u00a7\37\uffff\1\u00a7",
			"\1\u00a8\2\uffff\1\u00a9\5\uffff\1\u00aa\6\uffff\1\u00ab\17\uffff\1"+
			"\u00a8\2\uffff\1\u00a9\5\uffff\1\u00aa\6\uffff\1\u00ab",
			"\1\u00ac\37\uffff\1\u00ac",
			"\1\u00ad\37\uffff\1\u00ad",
			"\1\u00af\5\uffff\1\u00b0\31\uffff\1\u00ae\5\uffff\1\u00b0",
			"\1\u00b1\37\uffff\1\u00b1",
			"\1\u00b2\37\uffff\1\u00b2",
			"\1\u00af\5\uffff\1\u00b0\31\uffff\1\u00af\5\uffff\1\u00b0",
			"\1\u00b3\5\uffff\1\u00b0\31\uffff\1\u00af\5\uffff\1\u00b0",
			"\1\u00b4\37\uffff\1\u00b4",
			"\1\u00b5\37\uffff\1\u00b5",
			"\1\u00b6\37\uffff\1\u00b6",
			"\1\u00b7\37\uffff\1\u00b7",
			"\1\u00b8\37\uffff\1\u00b8",
			"\1\u00b9\15\uffff\1\u00ba\21\uffff\1\u00b9\15\uffff\1\u00ba",
			"\1\u00bb\37\uffff\1\u00bb",
			"\1\u00bc\37\uffff\1\u00bc",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\3\65\1\u00bf\16\65\1\u00c0\1\u00c1\6\65"+
			"\4\uffff\1\65\1\uffff\3\65\1\u00bf\16\65\1\u00c0\1\u00c1\6\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00c3\37\uffff\1\u00c3",
			"\1\u00c4\37\uffff\1\u00c4",
			"\1\u00c6\37\uffff\1\u00c5",
			"\1\u00c7\37\uffff\1\u00c7",
			"\1\u00c6\37\uffff\1\u00c6",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00ca\37\uffff\1\u00ca",
			"\2\65\13\uffff\12\65\7\uffff\3\65\1\u00cc\26\65\4\uffff\1\65\1\uffff"+
			"\3\65\1\u00cc\26\65",
			"\1\u00cd\37\uffff\1\u00cd",
			"\1\u00ce\2\uffff\1\u00cf\34\uffff\1\u00ce\2\uffff\1\u00cf",
			"\1\u00d0\37\uffff\1\u00d0",
			"\1\u00d1\37\uffff\1\u00d1",
			"\1\u00d2\37\uffff\1\u00d2",
			"\1\u00d3\37\uffff\1\u00d3",
			"\1\u00d4\37\uffff\1\u00d4",
			"\1\u00d5\37\uffff\1\u00d5",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00d7\37\uffff\1\u00d7",
			"\1\u00d8\6\uffff\1\u00d9\30\uffff\1\u00d8\6\uffff\1\u00d9",
			"\1\u00da\37\uffff\1\u00da",
			"\1\u00db\37\uffff\1\u00db",
			"\1\u00dc\37\uffff\1\u00dc",
			"\1\u00dd\37\uffff\1\u00dd",
			"\1\u00de\37\uffff\1\u00de",
			"\1\u00df\37\uffff\1\u00df",
			"\1\u00e0\37\uffff\1\u00c6",
			"\1\u00e1\37\uffff\1\u00e1",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00e3\37\uffff\1\u00e3",
			"\1\u00e4\37\uffff\1\u00e4",
			"\1\u00e5\37\uffff\1\u00e5",
			"\1\u00e6\37\uffff\1\u00e6",
			"",
			"\1\u00e8\37\uffff\1\u00e8\11\uffff\1\u00e7",
			"\1\u00e9\37\uffff\1\u00e9",
			"\1\u00e8\37\uffff\1\u00e8",
			"\1\u00ea\37\uffff\1\u00ea",
			"\1\u00eb\37\uffff\1\u00eb",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00ed\37\uffff\1\u00ed",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00f1\37\uffff\1\u00f1",
			"\1\u00f2\37\uffff\1\u00f2",
			"\1\u00f3\37\uffff\1\u00f3",
			"\1\u00f4\37\uffff\1\u00f4",
			"\1\u00f5\37\uffff\1\u00f5",
			"\1\u00f6\37\uffff\1\u00f6",
			"\1\u00f7\37\uffff\1\u00f7",
			"\1\u00f8\37\uffff\1\u00f8",
			"\1\u00f9\1\u00fa\36\uffff\1\u00f9\1\u00fa",
			"\1\u00fb\37\uffff\1\u00fb",
			"\1\u00fc\37\uffff\1\u00fc",
			"\1\u00fd\37\uffff\1\u00fd",
			"\1\u00fe\37\uffff\1\u00fe",
			"\1\u00ff\37\uffff\1\u00ff",
			"\1\u0100\37\uffff\1\u0100",
			"\1\u0101\37\uffff\1\u0101",
			"\1\u0103\30\uffff\1\u0102\6\uffff\1\u0103",
			"\1\u0103\37\uffff\1\u0103",
			"\1\u0104\37\uffff\1\u0104",
			"\1\u0105\3\uffff\1\u0106\33\uffff\1\u0105\3\uffff\1\u0106",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0108\6\uffff\1\u0103\37\uffff\1\u0103",
			"\1\u0109\37\uffff\1\u0109",
			"\1\u010a\37\uffff\1\u010a",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u010c\37\uffff\1\u010c",
			"\1\u010d\37\uffff\1\u010d",
			"\1\u010e\37\uffff\1\u010e",
			"\1\u010f\37\uffff\1\u010f",
			"\1\u0110\37\uffff\1\u0110",
			"\1\u0111\37\uffff\1\u0111",
			"",
			"",
			"\1\u0112\37\uffff\1\u0112",
			"\1\u0113\37\uffff\1\u0113",
			"\1\u0114\11\uffff\1\u0115\25\uffff\1\u0114\11\uffff\1\u0115",
			"",
			"\1\u0116\37\uffff\1\u0116",
			"\1\u0117\37\uffff\1\u0117",
			"\1\u0119\37\uffff\1\u0118",
			"\1\u0119\37\uffff\1\u0119",
			"\1\u011a\37\uffff\1\u011a",
			"",
			"",
			"\1\u011b\37\uffff\1\u011b",
			"",
			"\1\u011c\37\uffff\1\u011c",
			"\1\u011d\37\uffff\1\u011d",
			"\1\u011e\37\uffff\1\u011e",
			"\1\u011f\37\uffff\1\u011f",
			"\1\u0120\37\uffff\1\u0120",
			"\1\u0121\37\uffff\1\u0121",
			"\1\u0122\37\uffff\1\u0122",
			"\1\u0123\37\uffff\1\u0123",
			"\1\u0124\12\uffff\1\u0125\24\uffff\1\u0124\12\uffff\1\u0125",
			"\2\65\13\uffff\12\65\7\uffff\15\65\1\u0127\14\65\4\uffff\1\65\1\uffff"+
			"\15\65\1\u0127\14\65",
			"",
			"\1\u0128\37\uffff\1\u0128",
			"\1\u0129\1\uffff\1\u012a\35\uffff\1\u0129\1\uffff\1\u012a",
			"\1\u012b\37\uffff\1\u012b",
			"\1\u012c\37\uffff\1\u012c",
			"\1\u012d\37\uffff\1\u012d",
			"\1\u012e\37\uffff\1\u012e",
			"\1\u012f\37\uffff\1\u012f",
			"\1\u0130\3\uffff\1\u0131\33\uffff\1\u0130\3\uffff\1\u0131",
			"\1\u0132\37\uffff\1\u0132",
			"\1\u0133\37\uffff\1\u0119",
			"\1\u0134\37\uffff\1\u0134",
			"",
			"\1\u0135\37\uffff\1\u0135",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0137\37\uffff\1\u0137",
			"\1\u0138\37\uffff\1\u0138",
			"\1\u0139",
			"\1\u013a\37\uffff\1\u013a",
			"\1\u013b\37\uffff\1\u013b",
			"\1\u013c\37\uffff\1\u013c",
			"\1\u013d\37\uffff\1\u013d",
			"",
			"\1\u013e\37\uffff\1\u013e",
			"",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0140\37\uffff\1\u0140",
			"\1\u0141\37\uffff\1\u0141",
			"\1\u0142\37\uffff\1\u0142",
			"\1\u0143\37\uffff\1\u0143",
			"\1\u0144\37\uffff\1\u0144",
			"\1\u0145\37\uffff\1\u0145",
			"\1\u0146\37\uffff\1\u0146",
			"\1\u0147\37\uffff\1\u0147",
			"\1\u0148\37\uffff\1\u0148",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014a\37\uffff\1\u014a",
			"\1\u014b\37\uffff\1\u014b",
			"\1\u014c\37\uffff\1\u014c",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014e\37\uffff\1\u014e",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0150",
			"\1\u0151\37\uffff\1\u0151",
			"\1\u0152\37\uffff\1\u0152",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0154\37\uffff\1\u0154",
			"",
			"\1\u0155",
			"\1\u0156\37\uffff\1\u0156",
			"\1\u0157\37\uffff\1\u0157",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u015a\37\uffff\1\u015a",
			"\1\u015b\37\uffff\1\u015b",
			"\1\u015c\37\uffff\1\u015c",
			"\1\u015d\37\uffff\1\u015d",
			"\1\u015e\37\uffff\1\u015e",
			"\1\u015f\37\uffff\1\u015f",
			"\1\u0160\37\uffff\1\u0160",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0164"+
			"\16\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0166\37\uffff\1\u0166",
			"\1\u0167\37\uffff\1\u0167",
			"\1\u0168\37\uffff\1\u0168",
			"\1\u0169\37\uffff\1\u0169",
			"\1\u016a\37\uffff\1\u016a",
			"\1\u016b\37\uffff\1\u016b",
			"\1\u016c\37\uffff\1\u016c",
			"\1\u016d\37\uffff\1\u016d",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u016f\37\uffff\1\u016f",
			"\1\u0170\37\uffff\1\u0170",
			"\1\u0171\37\uffff\1\u0171",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0174\37\uffff\1\u0174",
			"\1\u0175\37\uffff\1\u0175",
			"\1\u0176\37\uffff\1\u0176",
			"\1\u0177\37\uffff\1\u0177",
			"\1\u0178\37\uffff\1\u0178",
			"\1\u0179\37\uffff\1\u0179",
			"\2\65\13\uffff\12\65\7\uffff\22\65\1\u017b\7\65\4\uffff\1\65\1\uffff"+
			"\22\65\1\u017b\7\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u017d\37\uffff\1\u017d",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\13\65\1\u017f\16\65\4\uffff\1\65\1\uffff"+
			"\32\65",
			"\1\u0180\37\uffff\1\u0180",
			"\1\u0181\37\uffff\1\u0181",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0183\37\uffff\1\u0183",
			"\1\u0184",
			"\1\u0185\37\uffff\1\u0185",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0187\37\uffff\1\u0187",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u018b\37\uffff\1\u018b",
			"\1\u018c\37\uffff\1\u018c",
			"\1\u018d\37\uffff\1\u018d",
			"\1\u018e\37\uffff\1\u018e",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0190\37\uffff\1\u0190",
			"\1\u0191\37\uffff\1\u0191",
			"\1\u0192\37\uffff\1\u0192",
			"",
			"\1\u0193\37\uffff\1\u0193",
			"\1\u0194\37\uffff\1\u0194",
			"\1\u0195\37\uffff\1\u0195",
			"",
			"\1\u0196\37\uffff\1\u0196",
			"",
			"\1\u0197",
			"\1\u0198\37\uffff\1\u0198",
			"\1\u0199\37\uffff\1\u0199",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u019b",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a0\37\uffff\1\u01a0",
			"\1\u01a1\37\uffff\1\u01a1",
			"\2\65\13\uffff\12\65\7\uffff\4\65\1\u01a3\25\65\4\uffff\1\65\1\uffff"+
			"\4\65\1\u01a3\25\65",
			"\1\u01a4\37\uffff\1\u01a4",
			"\1\u01a5\37\uffff\1\u01a5",
			"",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a8\37\uffff\1\u01a8",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01aa\37\uffff\1\u01aa",
			"\1\u01ab\37\uffff\1\u01ab",
			"\1\u01ac\37\uffff\1\u01ac",
			"\1\u01ad\37\uffff\1\u01ad",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01b0\37\uffff\1\u01b0",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01b3\37\uffff\1\u01b3",
			"\1\u01b4\37\uffff\1\u01b4",
			"\1\u01b5\37\uffff\1\u01b5",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01b7\37\uffff\1\u01b7",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ba\37\uffff\1\u01ba",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01bc\37\uffff\1\u01bc",
			"\1\u01bd\26\uffff\1\u01bd",
			"\1\u01be\37\uffff\1\u01be",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u01c0\37\uffff\1\u01c0",
			"\1\u01c1\37\uffff\1\u01c1",
			"\1\u01c2\37\uffff\1\u01c2",
			"\1\u01c3\37\uffff\1\u01c3",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01c5\37\uffff\1\u01c5",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01c7\37\uffff\1\u01c7",
			"\1\u01c8\37\uffff\1\u01c8",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ca\37\uffff\1\u01ca",
			"\1\u01cb",
			"\1\u01cc\37\uffff\1\u01cc",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01ce",
			"",
			"",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01d0\37\uffff\1\u01d0",
			"",
			"\1\u01d1\37\uffff\1\u01d1",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01d3\37\uffff\1\u01d3",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01d5\37\uffff\1\u01d5",
			"\1\u01d6\37\uffff\1\u01d6",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u01d9\37\uffff\1\u01d9",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01db\37\uffff\1\u01db",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u01de\37\uffff\1\u01de",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01e0\37\uffff\1\u01e0",
			"",
			"\1\u01e1\37\uffff\1\u01e1",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01e3\37\uffff\1\u01e3",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\u01e5\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01e9\37\uffff\1\u01e9",
			"\1\u01ea",
			"\1\u01eb\37\uffff\1\u01eb",
			"",
			"\1\u01ec",
			"",
			"\1\u01ed\37\uffff\1\u01ed",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01ef\37\uffff\1\u01ef",
			"",
			"\1\u01f0\37\uffff\1\u01f0",
			"\1\u01f1\37\uffff\1\u01f1",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u01f4\37\uffff\1\u01f4",
			"",
			"\1\u01f5\37\uffff\1\u01f5",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01f8\37\uffff\1\u01f8",
			"",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01fa",
			"\1\u01fb\37\uffff\1\u01fb",
			"\1\u01fc",
			"\1\u01fd\37\uffff\1\u01fd",
			"",
			"\1\u01fe\37\uffff\1\u01fe",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0201\37\uffff\1\u0201",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u0203\37\uffff\1\u0203",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0206\37\uffff\1\u0206",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0209",
			"",
			"",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u020b\37\uffff\1\u020b",
			"",
			"\1\u020c\37\uffff\1\u020c",
			"\1\u020d\37\uffff\1\u020d",
			"\1\u020e\37\uffff\1\u020e",
			"\2\65\13\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			""
	};

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	protected class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | PERIOD | EXACT_NUM_LIT | CHAR_STRING | CHAR_STRING_PERL | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | DOUBLE_ASTERISK | ASTERISK | PLUS_SIGN | COMMA | SOLIDUS | AT_SIGN | ASSIGN_OP | BINDVAR | COLON | SEMICOLON | LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OR_EQUALS_OP | NOT_EQUAL_OP | CARRET_OPERATOR_PART | TILDE_OPERATOR_PART | EXCLAMATION_OPERATOR_PART | GREATER_THAN_OP | CONCATENATION_OP | VERTICAL_BAR | EQUALS_OP | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR | PROMPT | SQL92_RESERVED_ALL | SQL92_RESERVED_ALTER | SQL92_RESERVED_AND | SQL92_RESERVED_ANY | SQL92_RESERVED_AS | SQL92_RESERVED_ASC | SQL92_RESERVED_BEGIN | SQL92_RESERVED_BETWEEN | SQL92_RESERVED_BY | SQL92_RESERVED_CASE | SQL92_RESERVED_CHECK | PLSQL_RESERVED_CLUSTERS | PLSQL_RESERVED_COLAUTH | PLSQL_RESERVED_COMPRESS | SQL92_RESERVED_CONNECT | PLSQL_NON_RESERVED_CONNECT_BY_ROOT | PLSQL_RESERVED_CRASH | SQL92_RESERVED_CREATE | SQL92_RESERVED_CURRENT | SQL92_RESERVED_CURSOR | SQL92_RESERVED_DATE | SQL92_RESERVED_DECLARE | SQL92_RESERVED_DEFAULT | SQL92_RESERVED_DELETE | SQL92_RESERVED_DESC | SQL92_RESERVED_DISTINCT | SQL92_RESERVED_DROP | SQL92_RESERVED_ELSE | SQL92_RESERVED_END | SQL92_RESERVED_EXCEPTION | PLSQL_RESERVED_EXCLUSIVE | SQL92_RESERVED_EXISTS | SQL92_RESERVED_FALSE | SQL92_RESERVED_FETCH | SQL92_RESERVED_FOR | SQL92_RESERVED_FROM | SQL92_RESERVED_GOTO | SQL92_RESERVED_GRANT | SQL92_RESERVED_GROUP | SQL92_RESERVED_HAVING | PLSQL_RESERVED_IDENTIFIED | PLSQL_RESERVED_IF | SQL92_RESERVED_IN | PLSQL_RESERVED_INDEX | PLSQL_RESERVED_INDEXES | SQL92_RESERVED_INSERT | SQL92_RESERVED_INTERSECT | SQL92_RESERVED_INTO | SQL92_RESERVED_IS | SQL92_RESERVED_LIKE | PLSQL_RESERVED_LOCK | PLSQL_RESERVED_MINUS | PLSQL_RESERVED_MODE | PLSQL_RESERVED_NOCOMPRESS | SQL92_RESERVED_NOT | PLSQL_RESERVED_NOWAIT | SQL92_RESERVED_NULL | SQL92_RESERVED_OF | SQL92_RESERVED_ON | SQL92_RESERVED_OPTION | SQL92_RESERVED_OR | SQL92_RESERVED_ORDER | SQL92_RESERVED_OVERLAPS | SQL92_RESERVED_PRIOR | SQL92_RESERVED_PROCEDURE | SQL92_RESERVED_PUBLIC | PLSQL_RESERVED_RESOURCE | SQL92_RESERVED_REVOKE | SQL92_RESERVED_SELECT | PLSQL_RESERVED_SHARE | SQL92_RESERVED_SIZE | PLSQL_RESERVED_START | PLSQL_RESERVED_TABAUTH | SQL92_RESERVED_TABLE | SQL92_RESERVED_THE | SQL92_RESERVED_THEN | SQL92_RESERVED_TO | SQL92_RESERVED_TRUE | SQL92_RESERVED_UNION | SQL92_RESERVED_UNIQUE | SQL92_RESERVED_UPDATE | SQL92_RESERVED_VALUES | SQL92_RESERVED_VIEW | PLSQL_RESERVED_VIEWS | SQL92_RESERVED_WHEN | SQL92_RESERVED_WHERE | SQL92_RESERVED_WITH | PLSQL_NON_RESERVED_USING | PLSQL_NON_RESERVED_MODEL | PLSQL_NON_RESERVED_ELSIF | PLSQL_NON_RESERVED_PIVOT | PLSQL_NON_RESERVED_UNPIVOT | REGULAR_ID | ZV );";
		}
	}

}
