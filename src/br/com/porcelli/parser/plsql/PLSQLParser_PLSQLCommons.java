// $ANTLR 3.5.2 PLSQLCommons.g 2018-10-06 11:19:25

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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


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
public class PLSQLParser_PLSQLCommons extends Parser {
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
	public static final int ADD_VK=180;
	public static final int AFTER_EACH_ROW=181;
	public static final int AFTER_STATEMENT=182;
	public static final int AFTER_VK=183;
	public static final int AGENT_VK=184;
	public static final int AGGREGATE_VK=185;
	public static final int ALTER_ATTRIBUTE=186;
	public static final int ALTER_COLLECTION=187;
	public static final int ALTER_FUNCTION=188;
	public static final int ALTER_METHOD=189;
	public static final int ALTER_METHOD_ELEMENT=190;
	public static final int ALTER_PACKAGE=191;
	public static final int ALTER_PROCEDURE=192;
	public static final int ALTER_SEQUENCE=193;
	public static final int ALTER_TRIGGER=194;
	public static final int ALTER_TYPE=195;
	public static final int ANALYZE_VK=196;
	public static final int ANY_ELEMENT=197;
	public static final int ANY_MODE=198;
	public static final int ARGUMENT=200;
	public static final int ARGUMENTS=201;
	public static final int ASSIGN=202;
	public static final int ASSOCIATE_VK=203;
	public static final int ATTRIBUTE=205;
	public static final int ATTRIBUTES=206;
	public static final int ATTRIBUTE_NAME=207;
	public static final int AT_VK=209;
	public static final int AUDIT_VK=210;
	public static final int AUTHID_VK=211;
	public static final int AUTOMATIC_VK=212;
	public static final int AUTONOMOUS_TRANSACTION_VK=213;
	public static final int AUTO_VK=214;
	public static final int BATCH_VK=215;
	public static final int BEFORE_EACH_ROW=216;
	public static final int BEFORE_STATEMENT=217;
	public static final int BEFORE_VK=218;
	public static final int BFILE_VK=219;
	public static final int BINARY_DOUBLE_VK=220;
	public static final int BINARY_FLOAT_VK=221;
	public static final int BINARY_INTEGER_VK=222;
	public static final int BIT_VK=224;
	public static final int BLOB_VK=225;
	public static final int BLOCK=226;
	public static final int BLOCK_VK=227;
	public static final int BODY=228;
	public static final int BODY_MODE=229;
	public static final int BODY_VK=230;
	public static final int BOOLEAN_VK=231;
	public static final int BOTH_VK=232;
	public static final int BREADTH_VK=233;
	public static final int BULK_VK=234;
	public static final int BYTE_VK=235;
	public static final int CACHE_VK=236;
	public static final int CALL_MODE=237;
	public static final int CALL_VK=238;
	public static final int CANONICAL_VK=239;
	public static final int CASCADE_VK=241;
	public static final int CASCATED_ELEMENT=242;
	public static final int CAST_VK=243;
	public static final int CHARACTER_VK=244;
	public static final int CHAR_CS_VK=245;
	public static final int CHAR_SET_NAME=246;
	public static final int CHAR_VK=249;
	public static final int CHR_VK=250;
	public static final int CLOB_VK=251;
	public static final int CLOSE_VK=252;
	public static final int CLUSTER_VK=253;
	public static final int COLLECTION_MODE=254;
	public static final int COLLECTION_NAME=255;
	public static final int COLLECT_VK=256;
	public static final int COLUMNS=258;
	public static final int COLUMN_ALIAS=259;
	public static final int COLUMN_NAME=260;
	public static final int COMMENT_VK=262;
	public static final int COMMITTED_VK=263;
	public static final int COMMIT_VK=264;
	public static final int COMPATIBILITY_VK=265;
	public static final int COMPILATION_UNIT=266;
	public static final int COMPILER_PARAMETER=267;
	public static final int COMPILE_VK=268;
	public static final int COMPOUND_DML=269;
	public static final int COMPOUND_VK=270;
	public static final int CONDITIONAL_INSERT=272;
	public static final int CONSTANT_NEGATED=273;
	public static final int CONSTANT_VK=274;
	public static final int CONSTRAINT_NAME=275;
	public static final int CONSTRAINT_STATE=276;
	public static final int CONSTRAINT_VK=277;
	public static final int CONSTRUCTOR_SPEC=278;
	public static final int CONSTRUCTOR_VK=279;
	public static final int CONTENT_VK=280;
	public static final int CONTEXT_VK=281;
	public static final int CONTINUE_VK=282;
	public static final int CONVERT_VK=283;
	public static final int CORRUPT_XID_ALL_VK=284;
	public static final int CORRUPT_XID_VK=285;
	public static final int COST_CLASS_NAME=286;
	public static final int COST_VK=287;
	public static final int COUNT_VK=288;
	public static final int CREATE_FUNCTION=289;
	public static final int CREATE_PACKAGE_BODY=290;
	public static final int CREATE_PACKAGE_SPEC=291;
	public static final int CREATE_PROCEDURE=292;
	public static final int CREATE_SEQUENCE=293;
	public static final int CREATE_TRIGGER=294;
	public static final int CREATE_TYPE_BODY=295;
	public static final int CREATE_TYPE_SPEC=296;
	public static final int CREATE_VIEW=297;
	public static final int CROSS_VK=298;
	public static final int CUBE_VK=299;
	public static final int CURRENT_USER_VK=300;
	public static final int CURRENT_VK=301;
	public static final int CURSOR_BASED_FOR=302;
	public static final int CURSOR_DECLARE=303;
	public static final int CURSOR_NAME=304;
	public static final int CUSTOMDATUM_VK=305;
	public static final int CUSTOM_TYPE=306;
	public static final int CYCLE_VK=307;
	public static final int C_VK=308;
	public static final int DATABASE_VK=309;
	public static final int DATETIME_OP=310;
	public static final int DAY_VK=311;
	public static final int DBTIMEZONE_VK=312;
	public static final int DB_ROLE_CHANGE_VK=313;
	public static final int DDL_VK=314;
	public static final int DEBUG_VK=315;
	public static final int DECIMAL_VK=316;
	public static final int DECOMPOSE_VK=317;
	public static final int DECREMENT_VK=318;
	public static final int DEC_VK=319;
	public static final int DEFAULTS_VK=320;
	public static final int DEFAULT_VALUE=321;
	public static final int DEFERRABLE_VK=322;
	public static final int DEFERRED_VK=323;
	public static final int DEFINER_VK=324;
	public static final int DENSE_RANK_VK=326;
	public static final int DEPENDENT_HANDLING=327;
	public static final int DEPTH_VK=328;
	public static final int DETERMINISTIC_VK=329;
	public static final int DIMENSION_VK=330;
	public static final int DIRECT_MODE=331;
	public static final int DISABLE_VK=332;
	public static final int DISASSOCIATE_VK=333;
	public static final int DIV_VK=334;
	public static final int DML_EVENT=335;
	public static final int DML_EVENT_ELEMENT=336;
	public static final int DOCUMENT_VK=337;
	public static final int DOT_ASTERISK=338;
	public static final int DOUBLE_VK=339;
	public static final int DROP_FUNCTION=340;
	public static final int DROP_PACKAGE=341;
	public static final int DROP_PROCEDURE=342;
	public static final int DROP_SEQUENCE=343;
	public static final int DROP_TRIGGER=344;
	public static final int DROP_TYPE=345;
	public static final int DSINTERVAL_UNCONSTRAINED_VK=346;
	public static final int DYNAMIC_RETURN=347;
	public static final int ELEMENT=348;
	public static final int ELEMENTS_MODE=349;
	public static final int ELEMENT_SPEC=350;
	public static final int ENABLE_VK=351;
	public static final int ENCODING_VK=352;
	public static final int ENTITYESCAPING_VK=353;
	public static final int EVALNAME_VK=355;
	public static final int EXCEPTIONS_VK=357;
	public static final int EXCEPTION_DECLARE=358;
	public static final int EXCEPTION_INIT_VK=359;
	public static final int EXCEPTION_NAME=360;
	public static final int EXCLUDE_VK=362;
	public static final int EXECUTE_VK=363;
	public static final int EXIT_VK=364;
	public static final int EXPLAIN_STATEMENT=365;
	public static final int EXPR=366;
	public static final int EXPR_LIST=367;
	public static final int EXTERNAL_MODE=368;
	public static final int EXTERNAL_VK=369;
	public static final int EXTRACT_VK=370;
	public static final int FACTORING=371;
	public static final int FAILURE_VK=372;
	public static final int FIELDS=373;
	public static final int FIELD_SPEC=374;
	public static final int FINAL_VK=375;
	public static final int FIRST_VALUE_VK=376;
	public static final int FIRST_VK=377;
	public static final int FLOAT_VK=378;
	public static final int FOLLOWING_VK=379;
	public static final int FOLLOWS_VK=380;
	public static final int FORALL_VK=381;
	public static final int FORCE_VK=382;
	public static final int FOREIGN_KEY=383;
	public static final int FOREIGN_VK=384;
	public static final int FOR_EACH_ROW=385;
	public static final int FOR_LOOP=386;
	public static final int FOR_MULTI_COLUMN=387;
	public static final int FOR_SINGLE_COLUMN=388;
	public static final int FULL_VK=389;
	public static final int FUNCTION_ENABLING_OVER=390;
	public static final int FUNCTION_ENABLING_USING=391;
	public static final int FUNCTION_ENABLING_WITHIN_OR_OVER=392;
	public static final int FUNCTION_NAME=393;
	public static final int FUNCTION_SPEC=394;
	public static final int GROUPING_VK=397;
	public static final int GROUPIN_SET=398;
	public static final int GROUP_BY_ELEMENT=399;
	public static final int HASH_VK=400;
	public static final int HIDE_VK=401;
	public static final int HIERARCHICAL=402;
	public static final int HOSTED_VARIABLE=403;
	public static final int HOSTED_VARIABLE_NAME=404;
	public static final int HOSTED_VARIABLE_ROUTINE_CALL=405;
	public static final int HOUR_VK=406;
	public static final int ID=407;
	public static final int IGNORE_VK=408;
	public static final int IMMEDIATE_VK=409;
	public static final int IMPLEMENTATION_TYPE_NAME=410;
	public static final int INCLUDE_VK=411;
	public static final int INCLUDING_VK=412;
	public static final int INCREMENT_VK=413;
	public static final int INDENT_VK=414;
	public static final int INDEXED_BY=415;
	public static final int INDEXED_FOR=416;
	public static final int INDEX_NAME=417;
	public static final int INDICES_BOUND=418;
	public static final int INITIALLY_VK=419;
	public static final int INLINE_CONSTRAINT_CLAUSE=420;
	public static final int INLINE_VK=421;
	public static final int INNER_VK=422;
	public static final int INOUT_VK=423;
	public static final int INSTANTIABLE_VK=424;
	public static final int INSTEAD_VK=425;
	public static final int INTEGER_VK=426;
	public static final int INTERVAL_DATATYPE=427;
	public static final int INT_VK=429;
	public static final int INVALIDATE_VK=430;
	public static final int ISOLATION_VK=431;
	public static final int IS_A_SET=432;
	public static final int IS_EMPTY=433;
	public static final int IS_INFINITE=434;
	public static final int IS_NAN=435;
	public static final int IS_NOT_A_SET=436;
	public static final int IS_NOT_EMPTY=437;
	public static final int IS_NOT_INFINITE=438;
	public static final int IS_NOT_NAN=439;
	public static final int IS_NOT_NULL=440;
	public static final int IS_NOT_OF_TYPE=441;
	public static final int IS_NOT_PRESENT=442;
	public static final int IS_NULL=443;
	public static final int IS_OF_TYPE=444;
	public static final int IS_PRESENT=445;
	public static final int ITERATE_VK=446;
	public static final int JAVA_VK=447;
	public static final int JOIN_DEF=448;
	public static final int KEEP_VK=449;
	public static final int KEY_VK=450;
	public static final int LABEL_DECLARE=451;
	public static final int LABEL_NAME=452;
	public static final int LANGUAGE_VK=453;
	public static final int LAST_VALUE_VK=454;
	public static final int LAST_VK=455;
	public static final int LEADING_VK=456;
	public static final int LEFT_VK=459;
	public static final int LIBRARY_VK=462;
	public static final int LIKE2_VK=463;
	public static final int LIKE4_VK=464;
	public static final int LIKEC_VK=465;
	public static final int LIMIT_VK=466;
	public static final int LINK_NAME=467;
	public static final int LOCAL_VK=468;
	public static final int LOCK_TABLE_ELEMENT=469;
	public static final int LOGIC_EXPR=470;
	public static final int LOGOFF_VK=471;
	public static final int LOGON_VK=472;
	public static final int LOG_VK=473;
	public static final int LONG_RAW=474;
	public static final int LONG_VK=475;
	public static final int LOOP_VK=476;
	public static final int MAIN_MODEL=477;
	public static final int MAIN_MODEL_NAME=478;
	public static final int MAP_VK=479;
	public static final int MAXVALUE_VK=480;
	public static final int MEASURES_VK=481;
	public static final int MEMBER_VK=482;
	public static final int MERGE_INSERT=483;
	public static final int MERGE_UPDATE=484;
	public static final int MERGE_VK=485;
	public static final int MINUTE_VK=487;
	public static final int MINVALUE_VK=488;
	public static final int MLSLABEL_VK=489;
	public static final int MODEL_COLUMN=490;
	public static final int MODEL_COLUMNS=491;
	public static final int MODEL_EXPRESSION=492;
	public static final int MODEL_RULE=493;
	public static final int MODEL_RULES=494;
	public static final int MODIFIER=495;
	public static final int MODIFY_VK=496;
	public static final int MOD_VK=497;
	public static final int MONTH_VK=498;
	public static final int MULTI_TABLE_MODE=499;
	public static final int NAME_VK=500;
	public static final int NATIVE_DATATYPE=502;
	public static final int NATURALN_VK=503;
	public static final int NATURAL_VK=504;
	public static final int NAV_VK=505;
	public static final int NCHAR_CS_VK=506;
	public static final int NCHAR_VK=507;
	public static final int NCLOB_VK=508;
	public static final int NESTED_TABLE_TYPE_DEF=509;
	public static final int NESTED_VK=510;
	public static final int NEW_VK=511;
	public static final int NOAUDIT_VK=512;
	public static final int NOCACHE_VK=513;
	public static final int NOCOPY_VK=514;
	public static final int NOCYCLE_VK=515;
	public static final int NOENTITYESCAPING_VK=516;
	public static final int NOFORCE=517;
	public static final int NOMAXVALUE_VK=518;
	public static final int NOMINVALUE_VK=519;
	public static final int NONE_VK=520;
	public static final int NON_DML=521;
	public static final int NOORDER_VK=522;
	public static final int NORELY_VK=523;
	public static final int NOSCHEMACHECK_VK=524;
	public static final int NOT_BETWEEN=525;
	public static final int NOT_DEFERRABLE=526;
	public static final int NOT_IN=528;
	public static final int NOT_LIKE=529;
	public static final int NOT_NULL=530;
	public static final int NOVALIDATE_VK=531;
	public static final int NO_VK=532;
	public static final int NULLS_VK=533;
	public static final int NUMBER_VK=534;
	public static final int NUMERIC_VK=535;
	public static final int NVARCHAR2_VK=536;
	public static final int OBJECT_AS=537;
	public static final int OBJECT_MEMBERS=538;
	public static final int OBJECT_TYPE_DEF=539;
	public static final int OBJECT_VK=540;
	public static final int OFF_VK=541;
	public static final int OLD_VK=542;
	public static final int ONLY_VK=543;
	public static final int ON_DELETE=544;
	public static final int OPEN_FOR=545;
	public static final int OPEN_VK=546;
	public static final int ORADATA_VK=547;
	public static final int ORDER_BY_ELEMENT=548;
	public static final int ORDER_BY_ELEMENTS=549;
	public static final int ORDINALITY_VK=550;
	public static final int OSERROR_VK=551;
	public static final int OUTER_JOIN_SIGN=552;
	public static final int OUT_OF_LINE_CONSTRAINT=553;
	public static final int OUT_VK=554;
	public static final int OVERRIDING_VK=555;
	public static final int OVER_VK=556;
	public static final int PACKAGE_NAME=557;
	public static final int PACKAGE_VK=558;
	public static final int PARALLEL_ENABLE_VK=559;
	public static final int PARAMETER=560;
	public static final int PARAMETERS=561;
	public static final int PARAMETERS_VK=562;
	public static final int PARAMETER_NAME=563;
	public static final int PARENT_VK=564;
	public static final int PARTITION_VK=565;
	public static final int PASSING_VK=566;
	public static final int PERCENT_FOUND_VK=568;
	public static final int PERCENT_ISOPEN_VK=569;
	public static final int PERCENT_NOTFOUND_VK=570;
	public static final int PERCENT_ROWCOUNT_VK=571;
	public static final int PERCENT_ROWTYPE_VK=572;
	public static final int PERCENT_TYPE_VK=573;
	public static final int PIPELINED_VK=575;
	public static final int PIPE_ROW=576;
	public static final int PIPE_VK=577;
	public static final int PIVOT_ALIAS=578;
	public static final int PIVOT_ELEMENT=579;
	public static final int PIVOT_IN_ELEMENT=580;
	public static final int PIVOT_VK=581;
	public static final int PLS_INTEGER_VK=596;
	public static final int POSITIVEN_VK=598;
	public static final int POSITIVE_VK=599;
	public static final int PRAGMA_DECLARE=600;
	public static final int PRAGMA_VK=601;
	public static final int PRECEDING_VK=602;
	public static final int PRECISION=603;
	public static final int PRECISION_VK=604;
	public static final int PREDICTION_FUNCTION=605;
	public static final int PRIMARY_KEY=606;
	public static final int PRIMARY_VK=607;
	public static final int PROCEDURE_NAME=608;
	public static final int PROCEDURE_SPEC=609;
	public static final int QUERY_NAME=611;
	public static final int QUERY_PARTITION_CLAUSE_SPEC_EXPRESSIONS=612;
	public static final int RAISE_VK=613;
	public static final int RANGE_VK=614;
	public static final int RAW_VK=615;
	public static final int READ_VK=616;
	public static final int REAL_VK=617;
	public static final int RECORD_NAME=618;
	public static final int RECORD_TYPE_DECLARE_FIELDS=619;
	public static final int RECORD_TYPE_DECLARE_REFCURSOR=620;
	public static final int RECORD_VAR_DECLARE=621;
	public static final int RECURSIVE_VK=622;
	public static final int REFERENCES_CLAUSE=623;
	public static final int REFERENCES_VK=624;
	public static final int REFERENCE_MODEL_NAME=625;
	public static final int REFERENCE_VK=626;
	public static final int REFERENCING_VK=627;
	public static final int REF_VK=628;
	public static final int REJECT_VK=630;
	public static final int RELIES_ON_VK=631;
	public static final int RELY_VK=632;
	public static final int RENAME_VK=633;
	public static final int REPLACE_VK=634;
	public static final int RESPECT_VK=635;
	public static final int RESTRICT_REFERENCES_VK=636;
	public static final int RESULT_CACHE_VK=637;
	public static final int RETURN_VK=638;
	public static final int REUSE_VK=639;
	public static final int REVERSE_VK=640;
	public static final int RIGHT_VK=643;
	public static final int ROLLBACK_SEGMENT_NAME=644;
	public static final int ROLLBACK_VK=645;
	public static final int ROLLUP_VK=646;
	public static final int ROUTINE_CALL=647;
	public static final int ROUTINE_NAME=648;
	public static final int ROWID_VK=649;
	public static final int ROWS_VK=650;
	public static final int ROW_VK=651;
	public static final int RULES_VK=652;
	public static final int SAMPLE_VK=653;
	public static final int SAVEPOINT_NAME=654;
	public static final int SAVEPOINT_VK=655;
	public static final int SCHEMACHECK_VK=656;
	public static final int SCHEMA_NAME=657;
	public static final int SCHEMA_VK=658;
	public static final int SCN_VK=659;
	public static final int SEARCHED_CASE=660;
	public static final int SEARCH_VK=661;
	public static final int SECOND_VK=662;
	public static final int SEED_VK=663;
	public static final int SELECTED_TABLEVIEW=664;
	public static final int SELECT_BASED_FOR=665;
	public static final int SELECT_ITEM=666;
	public static final int SELECT_LIST=667;
	public static final int SELECT_MODE=668;
	public static final int SELECT_STATEMENT=669;
	public static final int SELF_VK=670;
	public static final int SEQUENCE_NAME=672;
	public static final int SEQUENCE_VK=673;
	public static final int SEQUENTIAL_VK=674;
	public static final int SERIALIZABLE_VK=675;
	public static final int SERIALLY_REUSABLE_VK=676;
	public static final int SERVERERROR_VK=677;
	public static final int SESSIONTIMEZONE_VK=678;
	public static final int SET_CONSTRAINT=679;
	public static final int SET_NULL=680;
	public static final int SET_SERVEROUTPUT=681;
	public static final int SET_TRANSACTION=682;
	public static final int SET_VK=683;
	public static final int SHOW_VK=684;
	public static final int SHUTDOWN_VK=685;
	public static final int SIBLINGS_VK=686;
	public static final int SIGNTYPE_VK=687;
	public static final int SIMPLE_BOUND=688;
	public static final int SIMPLE_CASE=689;
	public static final int SIMPLE_DML=690;
	public static final int SIMPLE_INTEGER_VK=691;
	public static final int SINGLE_TABLE_MODE=692;
	public static final int SINGLE_VK=693;
	public static final int SKIP_VK=694;
	public static final int SMALLINT_VK=695;
	public static final int SOME_VK=697;
	public static final int SPECIFICATION_VK=698;
	public static final int SQLDATA_VK=764;
	public static final int SQLERROR_VK=765;
	public static final int SQL_SCRIPT=766;
	public static final int STANDALONE_VK=767;
	public static final int STANDARD_FUNCTION=768;
	public static final int STARTUP_VK=769;
	public static final int STATEMENTS=770;
	public static final int STATIC_RETURNING=771;
	public static final int STATIC_VK=772;
	public static final int STATISTICS_VK=773;
	public static final int STREAMING_CLAUSE=774;
	public static final int STRING_VK=775;
	public static final int SUBMULTISET_VK=776;
	public static final int SUBPARTITION_VK=777;
	public static final int SUBQUERY=778;
	public static final int SUBTYPE_DECLARE=779;
	public static final int SUCCESS_VK=780;
	public static final int SUSPEND_VK=781;
	public static final int TABLEVIEW_NAME=782;
	public static final int TABLE_ALIAS=783;
	public static final int TABLE_ELEMENT=784;
	public static final int TABLE_EXPRESSION=785;
	public static final int TABLE_REF=786;
	public static final int TABLE_REF_ELEMENT=787;
	public static final int TABLE_TYPE_DECLARE=788;
	public static final int TABLE_VAR_DECLARE=789;
	public static final int TABLE_VAR_NAME=790;
	public static final int THREE_DOTS=791;
	public static final int TIMESTAMP_LTZ_UNCONSTRAINED_VK=792;
	public static final int TIMESTAMP_TZ_UNCONSTRAINED_VK=793;
	public static final int TIMESTAMP_UNCONSTRAINED_VK=794;
	public static final int TIMESTAMP_VK=795;
	public static final int TIMEZONE_ABBR_VK=796;
	public static final int TIMEZONE_HOUR_VK=797;
	public static final int TIMEZONE_MINUTE_VK=798;
	public static final int TIMEZONE_REGION_VK=799;
	public static final int TIME_VK=800;
	public static final int TRAILING_VK=801;
	public static final int TRANSLATE_VK=802;
	public static final int TREAT_VK=803;
	public static final int TRIGGER_NAME=804;
	public static final int TRIM_VK=805;
	public static final int TRUNCATE_VK=806;
	public static final int TYPE_BODY_ELEMENTS=807;
	public static final int TYPE_NAME=808;
	public static final int TYPE_VK=809;
	public static final int UNARY_MINUS=810;
	public static final int UNARY_PLUS=811;
	public static final int UNBOUNDED_VK=812;
	public static final int UNDER_VK=813;
	public static final int UNLIMITED_VK=814;
	public static final int UNPIVOT_IN_ELEMENT=815;
	public static final int UNPIVOT_VK=816;
	public static final int UNTIL_VK=818;
	public static final int UPDATED_VK=819;
	public static final int UPSERT_VK=820;
	public static final int UROWID_VK=821;
	public static final int USING_INDEX=822;
	public static final int USING_MODE=823;
	public static final int VALIDATE_VK=824;
	public static final int VALUES_BOUND=825;
	public static final int VALUE_VK=826;
	public static final int VARCHAR2_VK=827;
	public static final int VARCHAR_VK=828;
	public static final int VARIABLE_DECLARE=829;
	public static final int VARIABLE_NAME=830;
	public static final int VARR_ARRAY_DEF=831;
	public static final int VECTOR_EXPR=832;
	public static final int VERSIONS_VK=833;
	public static final int VERSION_VK=834;
	public static final int VIEW_NAME=836;
	public static final int VIEW_TYPE_CONSTRAINTS=837;
	public static final int VIEW_TYPE_CONSTRAINT_ITEM_INLINE=838;
	public static final int WAIT_VK=839;
	public static final int WARNING_VK=840;
	public static final int WELLFORMED_VK=841;
	public static final int WHENEVER_VK=842;
	public static final int WHILE_LOOP=843;
	public static final int WITHIN_VK=844;
	public static final int WORK_VK=845;
	public static final int WRITE_VK=846;
	public static final int XMLAGG_VK=847;
	public static final int XMLATTRIBUTES_VK=848;
	public static final int XMLCAST_VK=849;
	public static final int XMLCOLATTVAL_VK=850;
	public static final int XMLELEMENT_VK=851;
	public static final int XMLEXISTS_VK=852;
	public static final int XMLFOREST_VK=853;
	public static final int XMLNAMESPACES_VK=854;
	public static final int XMLPARSE_VK=855;
	public static final int XMLPI_VK=856;
	public static final int XMLQUERY_VK=857;
	public static final int XMLROOT_VK=858;
	public static final int XMLSERIALIZE_VK=859;
	public static final int XMLTABLE_VK=860;
	public static final int XML_ALIAS=861;
	public static final int XML_COLUMN=862;
	public static final int XML_COLUMN_NAME=863;
	public static final int XML_ELEMENT=864;
	public static final int XML_VK=865;
	public static final int YEAR_VK=866;
	public static final int YES_VK=867;
	public static final int YMINTERVAL_UNCONSTRAINED_VK=868;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public PLSQLParser gPLSQLParser;
	public PLSQLParser gParent;


	public PLSQLParser_PLSQLCommons(TokenStream input, PLSQLParser gPLSQLParser) {
		this(input, new RecognizerSharedState(), gPLSQLParser);
	}
	public PLSQLParser_PLSQLCommons(TokenStream input, RecognizerSharedState state, PLSQLParser gPLSQLParser) {
		super(input, state);
		this.gPLSQLParser = gPLSQLParser;
		gParent = gPLSQLParser;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PLSQLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "PLSQLCommons.g"; }


	public static class partition_extension_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "partition_extension_clause"
	// PLSQLCommons.g:81:1: partition_extension_clause : ( subpartition_key ^| partition_key ^) ( for_key !)? expression_list ;
	public final PLSQLParser_PLSQLCommons.partition_extension_clause_return partition_extension_clause() throws RecognitionException {
		PLSQLParser_PLSQLCommons.partition_extension_clause_return retval = new PLSQLParser_PLSQLCommons.partition_extension_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope subpartition_key1 =null;
		ParserRuleReturnScope partition_key2 =null;
		ParserRuleReturnScope for_key3 =null;
		ParserRuleReturnScope expression_list4 =null;


		try {
			// PLSQLCommons.g:82:5: ( ( subpartition_key ^| partition_key ^) ( for_key !)? expression_list )
			// PLSQLCommons.g:82:10: ( subpartition_key ^| partition_key ^) ( for_key !)? expression_list
			{
			root_0 = (Object)adaptor.nil();


			// PLSQLCommons.g:82:10: ( subpartition_key ^| partition_key ^)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("subpartition"))||(input.LT(1).getText().equalsIgnoreCase("partition"))))) {
				int LA1_1 = input.LA(2);
				if ( ((input.LT(1).getText().equalsIgnoreCase("subpartition"))) ) {
					alt1=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("partition"))) ) {
					alt1=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			switch (alt1) {
				case 1 :
					// PLSQLCommons.g:82:12: subpartition_key ^
					{
					pushFollow(FOLLOW_subpartition_key_in_partition_extension_clause402);
					subpartition_key1=gPLSQLParser.subpartition_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(subpartition_key1.getTree(), root_0);
					}
					break;
				case 2 :
					// PLSQLCommons.g:82:32: partition_key ^
					{
					pushFollow(FOLLOW_partition_key_in_partition_extension_clause407);
					partition_key2=gPLSQLParser.partition_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(partition_key2.getTree(), root_0);
					}
					break;

			}

			// PLSQLCommons.g:83:16: ( for_key !)?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SQL92_RESERVED_FOR) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// PLSQLCommons.g:83:16: for_key !
					{
					pushFollow(FOLLOW_for_key_in_partition_extension_clause421);
					for_key3=gPLSQLParser.for_key();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_expression_list_in_partition_extension_clause425);
			expression_list4=gPLSQLParser.expression_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_list4.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partition_extension_clause"


	public static class column_alias_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "column_alias"
	// PLSQLCommons.g:86:1: column_alias options {backtrack=true; } : ( ( as_key )? ( id | alias_quoted_string ) -> ^( COLUMN_ALIAS ( id )? ( alias_quoted_string )? ) | as_key );
	public final PLSQLParser_PLSQLCommons.column_alias_return column_alias() throws RecognitionException {
		PLSQLParser_PLSQLCommons.column_alias_return retval = new PLSQLParser_PLSQLCommons.column_alias_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope as_key5 =null;
		ParserRuleReturnScope id6 =null;
		ParserRuleReturnScope alias_quoted_string7 =null;
		ParserRuleReturnScope as_key8 =null;

		RewriteRuleSubtreeStream stream_as_key=new RewriteRuleSubtreeStream(adaptor,"rule as_key");
		RewriteRuleSubtreeStream stream_alias_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule alias_quoted_string");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:91:5: ( ( as_key )? ( id | alias_quoted_string ) -> ^( COLUMN_ALIAS ( id )? ( alias_quoted_string )? ) | as_key )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==SQL92_RESERVED_AS) ) {
				int LA5_1 = input.LA(2);
				if ( (synpred1_PLSQLCommons()) ) {
					alt5=1;
				}
				else if ( (true) ) {
					alt5=2;
				}

			}
			else if ( ((LA5_0 >= CHAR_STRING && LA5_0 <= CHAR_STRING_PERL)||LA5_0==DELIMITED_ID||LA5_0==INTRODUCER||LA5_0==NATIONAL_CHAR_STRING_LIT||LA5_0==REGULAR_ID) ) {
				alt5=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// PLSQLCommons.g:91:10: ( as_key )? ( id | alias_quoted_string )
					{
					// PLSQLCommons.g:91:10: ( as_key )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==SQL92_RESERVED_AS) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// PLSQLCommons.g:91:10: as_key
							{
							pushFollow(FOLLOW_as_key_in_column_alias454);
							as_key5=gPLSQLParser.as_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_as_key.add(as_key5.getTree());
							}
							break;

					}

					// PLSQLCommons.g:91:18: ( id | alias_quoted_string )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==DELIMITED_ID||LA4_0==INTRODUCER||LA4_0==REGULAR_ID) ) {
						alt4=1;
					}
					else if ( ((LA4_0 >= CHAR_STRING && LA4_0 <= CHAR_STRING_PERL)||LA4_0==NATIONAL_CHAR_STRING_LIT) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// PLSQLCommons.g:91:19: id
							{
							pushFollow(FOLLOW_id_in_column_alias458);
							id6=id();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_id.add(id6.getTree());
							}
							break;
						case 2 :
							// PLSQLCommons.g:91:22: alias_quoted_string
							{
							pushFollow(FOLLOW_alias_quoted_string_in_column_alias460);
							alias_quoted_string7=alias_quoted_string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_alias_quoted_string.add(alias_quoted_string7.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: id, alias_quoted_string
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:5: -> ^( COLUMN_ALIAS ( id )? ( alias_quoted_string )? )
					{
						// PLSQLCommons.g:92:11: ^( COLUMN_ALIAS ( id )? ( alias_quoted_string )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_ALIAS, "COLUMN_ALIAS"), root_1);
						// PLSQLCommons.g:92:26: ( id )?
						if ( stream_id.hasNext() ) {
							adaptor.addChild(root_1, stream_id.nextTree());
						}
						stream_id.reset();

						// PLSQLCommons.g:92:30: ( alias_quoted_string )?
						if ( stream_alias_quoted_string.hasNext() ) {
							adaptor.addChild(root_1, stream_alias_quoted_string.nextTree());
						}
						stream_alias_quoted_string.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:93:10: as_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_as_key_in_column_alias491);
					as_key8=gPLSQLParser.as_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, as_key8.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "column_alias"


	public static class table_alias_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_alias"
	// PLSQLCommons.g:96:1: table_alias : ( id | alias_quoted_string ) -> ^( TABLE_ALIAS ( id )? ( alias_quoted_string )? ) ;
	public final PLSQLParser_PLSQLCommons.table_alias_return table_alias() throws RecognitionException {
		PLSQLParser_PLSQLCommons.table_alias_return retval = new PLSQLParser_PLSQLCommons.table_alias_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id9 =null;
		ParserRuleReturnScope alias_quoted_string10 =null;

		RewriteRuleSubtreeStream stream_alias_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule alias_quoted_string");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:97:5: ( ( id | alias_quoted_string ) -> ^( TABLE_ALIAS ( id )? ( alias_quoted_string )? ) )
			// PLSQLCommons.g:97:10: ( id | alias_quoted_string )
			{
			// PLSQLCommons.g:97:10: ( id | alias_quoted_string )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==DELIMITED_ID||LA6_0==INTRODUCER||LA6_0==REGULAR_ID) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= CHAR_STRING && LA6_0 <= CHAR_STRING_PERL)||LA6_0==NATIONAL_CHAR_STRING_LIT) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// PLSQLCommons.g:97:12: id
					{
					pushFollow(FOLLOW_id_in_table_alias513);
					id9=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id9.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:97:17: alias_quoted_string
					{
					pushFollow(FOLLOW_alias_quoted_string_in_table_alias517);
					alias_quoted_string10=alias_quoted_string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alias_quoted_string.add(alias_quoted_string10.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: alias_quoted_string, id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:5: -> ^( TABLE_ALIAS ( id )? ( alias_quoted_string )? )
			{
				// PLSQLCommons.g:98:10: ^( TABLE_ALIAS ( id )? ( alias_quoted_string )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_ALIAS, "TABLE_ALIAS"), root_1);
				// PLSQLCommons.g:98:24: ( id )?
				if ( stream_id.hasNext() ) {
					adaptor.addChild(root_1, stream_id.nextTree());
				}
				stream_id.reset();

				// PLSQLCommons.g:98:28: ( alias_quoted_string )?
				if ( stream_alias_quoted_string.hasNext() ) {
					adaptor.addChild(root_1, stream_alias_quoted_string.nextTree());
				}
				stream_alias_quoted_string.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_alias"


	public static class alias_quoted_string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alias_quoted_string"
	// PLSQLCommons.g:101:1: alias_quoted_string : quoted_string -> ID[$quoted_string.start] ;
	public final PLSQLParser_PLSQLCommons.alias_quoted_string_return alias_quoted_string() throws RecognitionException {
		PLSQLParser_PLSQLCommons.alias_quoted_string_return retval = new PLSQLParser_PLSQLCommons.alias_quoted_string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope quoted_string11 =null;

		RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");

		try {
			// PLSQLCommons.g:102:5: ( quoted_string -> ID[$quoted_string.start] )
			// PLSQLCommons.g:102:10: quoted_string
			{
			pushFollow(FOLLOW_quoted_string_in_alias_quoted_string557);
			quoted_string11=quoted_string();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string11.getTree());
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:9: -> ID[$quoted_string.start]
			{
				adaptor.addChild(root_0, (Object)adaptor.create(ID, (quoted_string11!=null?(quoted_string11.start):null)));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alias_quoted_string"


	public static class where_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// PLSQLCommons.g:106:1: where_clause : where_key ^ ( current_of_clause | condition_wrapper ) ;
	public final PLSQLParser_PLSQLCommons.where_clause_return where_clause() throws RecognitionException {
		PLSQLParser_PLSQLCommons.where_clause_return retval = new PLSQLParser_PLSQLCommons.where_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope where_key12 =null;
		ParserRuleReturnScope current_of_clause13 =null;
		ParserRuleReturnScope condition_wrapper14 =null;


		try {
			// PLSQLCommons.g:107:5: ( where_key ^ ( current_of_clause | condition_wrapper ) )
			// PLSQLCommons.g:107:10: where_key ^ ( current_of_clause | condition_wrapper )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_where_key_in_where_clause590);
			where_key12=gPLSQLParser.where_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(where_key12.getTree(), root_0);
			// PLSQLCommons.g:107:21: ( current_of_clause | condition_wrapper )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==SQL92_RESERVED_CURRENT) ) {
				alt7=1;
			}
			else if ( (LA7_0==APPROXIMATE_NUM_LIT||LA7_0==BINDVAR||(LA7_0 >= CHAR_STRING && LA7_0 <= COLON)||LA7_0==DELIMITED_ID||LA7_0==EXACT_NUM_LIT||LA7_0==INTRODUCER||LA7_0==LEFT_PAREN||LA7_0==MINUS_SIGN||LA7_0==NATIONAL_CHAR_STRING_LIT||LA7_0==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA7_0==PLUS_SIGN||LA7_0==REGULAR_ID||LA7_0==SQL92_RESERVED_ALL||LA7_0==SQL92_RESERVED_ANY||LA7_0==SQL92_RESERVED_CASE||(LA7_0 >= SQL92_RESERVED_CURSOR && LA7_0 <= SQL92_RESERVED_DATE)||(LA7_0 >= SQL92_RESERVED_DEFAULT && LA7_0 <= SQL92_RESERVED_DELETE)||LA7_0==SQL92_RESERVED_DISTINCT||(LA7_0 >= SQL92_RESERVED_EXISTS && LA7_0 <= SQL92_RESERVED_FALSE)||(LA7_0 >= SQL92_RESERVED_NOT && LA7_0 <= SQL92_RESERVED_NULL)||LA7_0==SQL92_RESERVED_PRIOR||LA7_0==SQL92_RESERVED_TRUE||LA7_0==UNSIGNED_INTEGER) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// PLSQLCommons.g:107:22: current_of_clause
					{
					pushFollow(FOLLOW_current_of_clause_in_where_clause594);
					current_of_clause13=current_of_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, current_of_clause13.getTree());

					}
					break;
				case 2 :
					// PLSQLCommons.g:107:40: condition_wrapper
					{
					pushFollow(FOLLOW_condition_wrapper_in_where_clause596);
					condition_wrapper14=gPLSQLParser.condition_wrapper();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_wrapper14.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "where_clause"


	public static class current_of_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "current_of_clause"
	// PLSQLCommons.g:110:1: current_of_clause : current_key ^ of_key ! cursor_name ;
	public final PLSQLParser_PLSQLCommons.current_of_clause_return current_of_clause() throws RecognitionException {
		PLSQLParser_PLSQLCommons.current_of_clause_return retval = new PLSQLParser_PLSQLCommons.current_of_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope current_key15 =null;
		ParserRuleReturnScope of_key16 =null;
		ParserRuleReturnScope cursor_name17 =null;


		try {
			// PLSQLCommons.g:111:5: ( current_key ^ of_key ! cursor_name )
			// PLSQLCommons.g:111:10: current_key ^ of_key ! cursor_name
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_current_key_in_current_of_clause617);
			current_key15=gPLSQLParser.current_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(current_key15.getTree(), root_0);
			pushFollow(FOLLOW_of_key_in_current_of_clause620);
			of_key16=gPLSQLParser.of_key();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_cursor_name_in_current_of_clause623);
			cursor_name17=cursor_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, cursor_name17.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "current_of_clause"


	public static class into_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "into_clause"
	// PLSQLCommons.g:114:1: into_clause : ( into_key ^ general_element ( COMMA ! general_element )* | bulk_key ^ collect_key ! into_key ! general_element ( COMMA ! general_element )* );
	public final PLSQLParser_PLSQLCommons.into_clause_return into_clause() throws RecognitionException {
		PLSQLParser_PLSQLCommons.into_clause_return retval = new PLSQLParser_PLSQLCommons.into_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA20=null;
		Token COMMA26=null;
		ParserRuleReturnScope into_key18 =null;
		ParserRuleReturnScope general_element19 =null;
		ParserRuleReturnScope general_element21 =null;
		ParserRuleReturnScope bulk_key22 =null;
		ParserRuleReturnScope collect_key23 =null;
		ParserRuleReturnScope into_key24 =null;
		ParserRuleReturnScope general_element25 =null;
		ParserRuleReturnScope general_element27 =null;

		Object COMMA20_tree=null;
		Object COMMA26_tree=null;

		try {
			// PLSQLCommons.g:115:5: ( into_key ^ general_element ( COMMA ! general_element )* | bulk_key ^ collect_key ! into_key ! general_element ( COMMA ! general_element )* )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==SQL92_RESERVED_INTO) ) {
				alt10=1;
			}
			else if ( (LA10_0==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("bulk")))) {
				alt10=2;
			}

			switch (alt10) {
				case 1 :
					// PLSQLCommons.g:115:10: into_key ^ general_element ( COMMA ! general_element )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_into_key_in_into_clause643);
					into_key18=gPLSQLParser.into_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(into_key18.getTree(), root_0);
					pushFollow(FOLLOW_general_element_in_into_clause646);
					general_element19=general_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_element19.getTree());

					// PLSQLCommons.g:115:36: ( COMMA ! general_element )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// PLSQLCommons.g:115:37: COMMA ! general_element
							{
							COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause649); if (state.failed) return retval;
							pushFollow(FOLLOW_general_element_in_into_clause652);
							general_element21=general_element();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, general_element21.getTree());

							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:116:10: bulk_key ^ collect_key ! into_key ! general_element ( COMMA ! general_element )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bulk_key_in_into_clause666);
					bulk_key22=gPLSQLParser.bulk_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(bulk_key22.getTree(), root_0);
					pushFollow(FOLLOW_collect_key_in_into_clause669);
					collect_key23=gPLSQLParser.collect_key();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_into_key_in_into_clause672);
					into_key24=gPLSQLParser.into_key();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_general_element_in_into_clause675);
					general_element25=general_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_element25.getTree());

					// PLSQLCommons.g:116:59: ( COMMA ! general_element )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// PLSQLCommons.g:116:60: COMMA ! general_element
							{
							COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause678); if (state.failed) return retval;
							pushFollow(FOLLOW_general_element_in_into_clause681);
							general_element27=general_element();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, general_element27.getTree());

							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "into_clause"


	public static class xml_column_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "xml_column_name"
	// PLSQLCommons.g:123:1: xml_column_name : ( id -> ^( XML_COLUMN_NAME id ) | quoted_string -> ^( XML_COLUMN_NAME ID[$quoted_string.start] ) );
	public final PLSQLParser_PLSQLCommons.xml_column_name_return xml_column_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.xml_column_name_return retval = new PLSQLParser_PLSQLCommons.xml_column_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id28 =null;
		ParserRuleReturnScope quoted_string29 =null;

		RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:124:5: ( id -> ^( XML_COLUMN_NAME id ) | quoted_string -> ^( XML_COLUMN_NAME ID[$quoted_string.start] ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==DELIMITED_ID||LA11_0==INTRODUCER||LA11_0==REGULAR_ID) ) {
				alt11=1;
			}
			else if ( ((LA11_0 >= CHAR_STRING && LA11_0 <= CHAR_STRING_PERL)||LA11_0==NATIONAL_CHAR_STRING_LIT) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// PLSQLCommons.g:124:10: id
					{
					pushFollow(FOLLOW_id_in_xml_column_name708);
					id28=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id28.getTree());
					// AST REWRITE
					// elements: id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:13: -> ^( XML_COLUMN_NAME id )
					{
						// PLSQLCommons.g:124:16: ^( XML_COLUMN_NAME id )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_COLUMN_NAME, "XML_COLUMN_NAME"), root_1);
						adaptor.addChild(root_1, stream_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:125:10: quoted_string
					{
					pushFollow(FOLLOW_quoted_string_in_xml_column_name727);
					quoted_string29=quoted_string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string29.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:24: -> ^( XML_COLUMN_NAME ID[$quoted_string.start] )
					{
						// PLSQLCommons.g:125:27: ^( XML_COLUMN_NAME ID[$quoted_string.start] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_COLUMN_NAME, "XML_COLUMN_NAME"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(ID, (quoted_string29!=null?(quoted_string29.start):null)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "xml_column_name"


	public static class cost_class_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cost_class_name"
	// PLSQLCommons.g:128:1: cost_class_name : id -> ^( COST_CLASS_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.cost_class_name_return cost_class_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.cost_class_name_return retval = new PLSQLParser_PLSQLCommons.cost_class_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id30 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:129:5: ( id -> ^( COST_CLASS_NAME id ) )
			// PLSQLCommons.g:129:10: id
			{
			pushFollow(FOLLOW_id_in_cost_class_name756);
			id30=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id30.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:9: -> ^( COST_CLASS_NAME id )
			{
				// PLSQLCommons.g:130:12: ^( COST_CLASS_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COST_CLASS_NAME, "COST_CLASS_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cost_class_name"


	public static class attribute_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attribute_name"
	// PLSQLCommons.g:133:1: attribute_name : id -> ^( ATTRIBUTE_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.attribute_name_return attribute_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.attribute_name_return retval = new PLSQLParser_PLSQLCommons.attribute_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id31 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:134:5: ( id -> ^( ATTRIBUTE_NAME id ) )
			// PLSQLCommons.g:134:10: id
			{
			pushFollow(FOLLOW_id_in_attribute_name792);
			id31=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id31.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 135:9: -> ^( ATTRIBUTE_NAME id )
			{
				// PLSQLCommons.g:135:12: ^( ATTRIBUTE_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_NAME, "ATTRIBUTE_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribute_name"


	public static class savepoint_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "savepoint_name"
	// PLSQLCommons.g:138:1: savepoint_name : id -> ^( SAVEPOINT_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.savepoint_name_return savepoint_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.savepoint_name_return retval = new PLSQLParser_PLSQLCommons.savepoint_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id32 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:139:5: ( id -> ^( SAVEPOINT_NAME id ) )
			// PLSQLCommons.g:139:10: id
			{
			pushFollow(FOLLOW_id_in_savepoint_name828);
			id32=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id32.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 140:9: -> ^( SAVEPOINT_NAME id )
			{
				// PLSQLCommons.g:140:12: ^( SAVEPOINT_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SAVEPOINT_NAME, "SAVEPOINT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "savepoint_name"


	public static class rollback_segment_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rollback_segment_name"
	// PLSQLCommons.g:143:1: rollback_segment_name : id -> ^( ROLLBACK_SEGMENT_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.rollback_segment_name_return rollback_segment_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.rollback_segment_name_return retval = new PLSQLParser_PLSQLCommons.rollback_segment_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id33 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:144:5: ( id -> ^( ROLLBACK_SEGMENT_NAME id ) )
			// PLSQLCommons.g:144:10: id
			{
			pushFollow(FOLLOW_id_in_rollback_segment_name864);
			id33=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id33.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 145:9: -> ^( ROLLBACK_SEGMENT_NAME id )
			{
				// PLSQLCommons.g:145:12: ^( ROLLBACK_SEGMENT_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROLLBACK_SEGMENT_NAME, "ROLLBACK_SEGMENT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rollback_segment_name"


	public static class table_var_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_var_name"
	// PLSQLCommons.g:149:1: table_var_name : id -> ^( TABLE_VAR_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.table_var_name_return table_var_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.table_var_name_return retval = new PLSQLParser_PLSQLCommons.table_var_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id34 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:150:5: ( id -> ^( TABLE_VAR_NAME id ) )
			// PLSQLCommons.g:150:10: id
			{
			pushFollow(FOLLOW_id_in_table_var_name901);
			id34=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id34.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 151:9: -> ^( TABLE_VAR_NAME id )
			{
				// PLSQLCommons.g:151:12: ^( TABLE_VAR_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_VAR_NAME, "TABLE_VAR_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_var_name"


	public static class schema_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "schema_name"
	// PLSQLCommons.g:154:1: schema_name : id -> ^( SCHEMA_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.schema_name_return schema_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.schema_name_return retval = new PLSQLParser_PLSQLCommons.schema_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id35 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:155:5: ( id -> ^( SCHEMA_NAME id ) )
			// PLSQLCommons.g:155:10: id
			{
			pushFollow(FOLLOW_id_in_schema_name937);
			id35=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id35.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 156:9: -> ^( SCHEMA_NAME id )
			{
				// PLSQLCommons.g:156:12: ^( SCHEMA_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SCHEMA_NAME, "SCHEMA_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "schema_name"


	public static class routine_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "routine_name"
	// PLSQLCommons.g:159:1: routine_name : id ( routine_name_part_after_period )* ( AT_SIGN link_name )? -> ^( ROUTINE_NAME id ( routine_name_part_after_period )* ( link_name )? ) ;
	public final PLSQLParser_PLSQLCommons.routine_name_return routine_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.routine_name_return retval = new PLSQLParser_PLSQLCommons.routine_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AT_SIGN38=null;
		ParserRuleReturnScope id36 =null;
		ParserRuleReturnScope routine_name_part_after_period37 =null;
		ParserRuleReturnScope link_name39 =null;

		Object AT_SIGN38_tree=null;
		RewriteRuleTokenStream stream_AT_SIGN=new RewriteRuleTokenStream(adaptor,"token AT_SIGN");
		RewriteRuleSubtreeStream stream_routine_name_part_after_period=new RewriteRuleSubtreeStream(adaptor,"rule routine_name_part_after_period");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_link_name=new RewriteRuleSubtreeStream(adaptor,"rule link_name");

		try {
			// PLSQLCommons.g:160:5: ( id ( routine_name_part_after_period )* ( AT_SIGN link_name )? -> ^( ROUTINE_NAME id ( routine_name_part_after_period )* ( link_name )? ) )
			// PLSQLCommons.g:160:10: id ( routine_name_part_after_period )* ( AT_SIGN link_name )?
			{
			pushFollow(FOLLOW_id_in_routine_name973);
			id36=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id36.getTree());
			// PLSQLCommons.g:160:13: ( routine_name_part_after_period )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==PERIOD) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// PLSQLCommons.g:160:13: routine_name_part_after_period
					{
					pushFollow(FOLLOW_routine_name_part_after_period_in_routine_name975);
					routine_name_part_after_period37=routine_name_part_after_period();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_routine_name_part_after_period.add(routine_name_part_after_period37.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// PLSQLCommons.g:160:45: ( AT_SIGN link_name )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AT_SIGN) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// PLSQLCommons.g:160:46: AT_SIGN link_name
					{
					AT_SIGN38=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_routine_name979); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AT_SIGN.add(AT_SIGN38);

					pushFollow(FOLLOW_link_name_in_routine_name981);
					link_name39=link_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_link_name.add(link_name39.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: link_name, id, routine_name_part_after_period
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 161:9: -> ^( ROUTINE_NAME id ( routine_name_part_after_period )* ( link_name )? )
			{
				// PLSQLCommons.g:161:12: ^( ROUTINE_NAME id ( routine_name_part_after_period )* ( link_name )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROUTINE_NAME, "ROUTINE_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:161:30: ( routine_name_part_after_period )*
				while ( stream_routine_name_part_after_period.hasNext() ) {
					adaptor.addChild(root_1, stream_routine_name_part_after_period.nextTree());
				}
				stream_routine_name_part_after_period.reset();

				// PLSQLCommons.g:161:62: ( link_name )?
				if ( stream_link_name.hasNext() ) {
					adaptor.addChild(root_1, stream_link_name.nextTree());
				}
				stream_link_name.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "routine_name"


	public static class routine_name_part_after_period_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "routine_name_part_after_period"
	// PLSQLCommons.g:164:1: routine_name_part_after_period : ( PERIOD routine_id )=> PERIOD routine_id -> routine_id ;
	public final PLSQLParser_PLSQLCommons.routine_name_part_after_period_return routine_name_part_after_period() throws RecognitionException {
		PLSQLParser_PLSQLCommons.routine_name_part_after_period_return retval = new PLSQLParser_PLSQLCommons.routine_name_part_after_period_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD40=null;
		ParserRuleReturnScope routine_id41 =null;

		Object PERIOD40_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_routine_id=new RewriteRuleSubtreeStream(adaptor,"rule routine_id");

		try {
			// PLSQLCommons.g:165:5: ( ( PERIOD routine_id )=> PERIOD routine_id -> routine_id )
			// PLSQLCommons.g:166:11: ( PERIOD routine_id )=> PERIOD routine_id
			{
			PERIOD40=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_routine_name_part_after_period1043); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD40);

			pushFollow(FOLLOW_routine_id_in_routine_name_part_after_period1045);
			routine_id41=routine_id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_routine_id.add(routine_id41.getTree());
			// AST REWRITE
			// elements: routine_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 166:51: -> routine_id
			{
				adaptor.addChild(root_0, stream_routine_id.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "routine_name_part_after_period"


	public static class routine_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "routine_id"
	// PLSQLCommons.g:169:1: routine_id : ( id_expression -> id_expression | SQL92_RESERVED_DELETE -> ID[$SQL92_RESERVED_DELETE] | SQL92_RESERVED_EXISTS -> ID[$SQL92_RESERVED_EXISTS] | SQL92_RESERVED_PRIOR -> ID[$SQL92_RESERVED_PRIOR] );
	public final PLSQLParser_PLSQLCommons.routine_id_return routine_id() throws RecognitionException {
		PLSQLParser_PLSQLCommons.routine_id_return retval = new PLSQLParser_PLSQLCommons.routine_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SQL92_RESERVED_DELETE43=null;
		Token SQL92_RESERVED_EXISTS44=null;
		Token SQL92_RESERVED_PRIOR45=null;
		ParserRuleReturnScope id_expression42 =null;

		Object SQL92_RESERVED_DELETE43_tree=null;
		Object SQL92_RESERVED_EXISTS44_tree=null;
		Object SQL92_RESERVED_PRIOR45_tree=null;
		RewriteRuleTokenStream stream_SQL92_RESERVED_PRIOR=new RewriteRuleTokenStream(adaptor,"token SQL92_RESERVED_PRIOR");
		RewriteRuleTokenStream stream_SQL92_RESERVED_EXISTS=new RewriteRuleTokenStream(adaptor,"token SQL92_RESERVED_EXISTS");
		RewriteRuleTokenStream stream_SQL92_RESERVED_DELETE=new RewriteRuleTokenStream(adaptor,"token SQL92_RESERVED_DELETE");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");

		try {
			// PLSQLCommons.g:170:5: ( id_expression -> id_expression | SQL92_RESERVED_DELETE -> ID[$SQL92_RESERVED_DELETE] | SQL92_RESERVED_EXISTS -> ID[$SQL92_RESERVED_EXISTS] | SQL92_RESERVED_PRIOR -> ID[$SQL92_RESERVED_PRIOR] )
			int alt14=4;
			switch ( input.LA(1) ) {
			case DELIMITED_ID:
			case REGULAR_ID:
				{
				alt14=1;
				}
				break;
			case SQL92_RESERVED_DELETE:
				{
				alt14=2;
				}
				break;
			case SQL92_RESERVED_EXISTS:
				{
				alt14=3;
				}
				break;
			case SQL92_RESERVED_PRIOR:
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// PLSQLCommons.g:170:11: id_expression
					{
					pushFollow(FOLLOW_id_expression_in_routine_id1070);
					id_expression42=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression42.getTree());
					// AST REWRITE
					// elements: id_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:25: -> id_expression
					{
						adaptor.addChild(root_0, stream_id_expression.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:171:13: SQL92_RESERVED_DELETE
					{
					SQL92_RESERVED_DELETE43=(Token)match(input,SQL92_RESERVED_DELETE,FOLLOW_SQL92_RESERVED_DELETE_in_routine_id1088); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SQL92_RESERVED_DELETE.add(SQL92_RESERVED_DELETE43);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 171:35: -> ID[$SQL92_RESERVED_DELETE]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(ID, SQL92_RESERVED_DELETE43));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// PLSQLCommons.g:172:13: SQL92_RESERVED_EXISTS
					{
					SQL92_RESERVED_EXISTS44=(Token)match(input,SQL92_RESERVED_EXISTS,FOLLOW_SQL92_RESERVED_EXISTS_in_routine_id1107); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SQL92_RESERVED_EXISTS.add(SQL92_RESERVED_EXISTS44);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 172:35: -> ID[$SQL92_RESERVED_EXISTS]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(ID, SQL92_RESERVED_EXISTS44));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// PLSQLCommons.g:173:13: SQL92_RESERVED_PRIOR
					{
					SQL92_RESERVED_PRIOR45=(Token)match(input,SQL92_RESERVED_PRIOR,FOLLOW_SQL92_RESERVED_PRIOR_in_routine_id1126); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SQL92_RESERVED_PRIOR.add(SQL92_RESERVED_PRIOR45);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 173:34: -> ID[$SQL92_RESERVED_PRIOR]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(ID, SQL92_RESERVED_PRIOR45));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "routine_id"


	public static class package_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "package_name"
	// PLSQLCommons.g:176:1: package_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( PACKAGE_NAME id ( id_expression )? ) ;
	public final PLSQLParser_PLSQLCommons.package_name_return package_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.package_name_return retval = new PLSQLParser_PLSQLCommons.package_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD47=null;
		ParserRuleReturnScope id46 =null;
		ParserRuleReturnScope id_expression48 =null;

		Object PERIOD47_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:177:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( PACKAGE_NAME id ( id_expression )? ) )
			// PLSQLCommons.g:177:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_in_package_name1151);
			id46=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id46.getTree());
			// PLSQLCommons.g:177:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==PERIOD) && (synpred3_PLSQLCommons())) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// PLSQLCommons.g:177:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD47=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_package_name1161); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD47);

					pushFollow(FOLLOW_id_expression_in_package_name1163);
					id_expression48=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression48.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 178:9: -> ^( PACKAGE_NAME id ( id_expression )? )
			{
				// PLSQLCommons.g:178:12: ^( PACKAGE_NAME id ( id_expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACKAGE_NAME, "PACKAGE_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:178:30: ( id_expression )?
				if ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "package_name"


	public static class implementation_type_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "implementation_type_name"
	// PLSQLCommons.g:181:1: implementation_type_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? ) ;
	public final PLSQLParser_PLSQLCommons.implementation_type_name_return implementation_type_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.implementation_type_name_return retval = new PLSQLParser_PLSQLCommons.implementation_type_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD50=null;
		ParserRuleReturnScope id49 =null;
		ParserRuleReturnScope id_expression51 =null;

		Object PERIOD50_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:182:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? ) )
			// PLSQLCommons.g:182:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_in_implementation_type_name1204);
			id49=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id49.getTree());
			// PLSQLCommons.g:182:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==PERIOD) && (synpred4_PLSQLCommons())) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// PLSQLCommons.g:182:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD50=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_implementation_type_name1214); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD50);

					pushFollow(FOLLOW_id_expression_in_implementation_type_name1216);
					id_expression51=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression51.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 183:9: -> ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? )
			{
				// PLSQLCommons.g:183:12: ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLEMENTATION_TYPE_NAME, "IMPLEMENTATION_TYPE_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:183:42: ( id_expression )?
				if ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "implementation_type_name"


	public static class parameter_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameter_name"
	// PLSQLCommons.g:186:1: parameter_name : id -> ^( PARAMETER_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.parameter_name_return parameter_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.parameter_name_return retval = new PLSQLParser_PLSQLCommons.parameter_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id52 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:187:5: ( id -> ^( PARAMETER_NAME id ) )
			// PLSQLCommons.g:187:10: id
			{
			pushFollow(FOLLOW_id_in_parameter_name1257);
			id52=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id52.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 188:9: -> ^( PARAMETER_NAME id )
			{
				// PLSQLCommons.g:188:12: ^( PARAMETER_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETER_NAME, "PARAMETER_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_name"


	public static class reference_model_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reference_model_name"
	// PLSQLCommons.g:191:1: reference_model_name : id -> ^( REFERENCE_MODEL_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.reference_model_name_return reference_model_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.reference_model_name_return retval = new PLSQLParser_PLSQLCommons.reference_model_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id53 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:192:5: ( id -> ^( REFERENCE_MODEL_NAME id ) )
			// PLSQLCommons.g:192:10: id
			{
			pushFollow(FOLLOW_id_in_reference_model_name1293);
			id53=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id53.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:9: -> ^( REFERENCE_MODEL_NAME id )
			{
				// PLSQLCommons.g:193:12: ^( REFERENCE_MODEL_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE_MODEL_NAME, "REFERENCE_MODEL_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reference_model_name"


	public static class main_model_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_model_name"
	// PLSQLCommons.g:196:1: main_model_name : id -> ^( MAIN_MODEL_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.main_model_name_return main_model_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.main_model_name_return retval = new PLSQLParser_PLSQLCommons.main_model_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id54 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:197:5: ( id -> ^( MAIN_MODEL_NAME id ) )
			// PLSQLCommons.g:197:10: id
			{
			pushFollow(FOLLOW_id_in_main_model_name1329);
			id54=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id54.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 198:9: -> ^( MAIN_MODEL_NAME id )
			{
				// PLSQLCommons.g:198:12: ^( MAIN_MODEL_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAIN_MODEL_NAME, "MAIN_MODEL_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_model_name"


	public static class aggregate_function_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aggregate_function_name"
	// PLSQLCommons.g:201:1: aggregate_function_name :r+= general_element_id ( PERIOD r+= general_element_id )* -> ( $r)+ ;
	public final PLSQLParser_PLSQLCommons.aggregate_function_name_return aggregate_function_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.aggregate_function_name_return retval = new PLSQLParser_PLSQLCommons.aggregate_function_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD55=null;
		List<Object> list_r=null;
		RuleReturnScope r = null;
		Object PERIOD55_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_general_element_id=new RewriteRuleSubtreeStream(adaptor,"rule general_element_id");

		try {
			// PLSQLCommons.g:202:5: (r+= general_element_id ( PERIOD r+= general_element_id )* -> ( $r)+ )
			// PLSQLCommons.g:202:9: r+= general_element_id ( PERIOD r+= general_element_id )*
			{
			pushFollow(FOLLOW_general_element_id_in_aggregate_function_name1366);
			r=general_element_id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_general_element_id.add(r.getTree());
			if (list_r==null) list_r=new ArrayList<Object>();
			list_r.add(r.getTree());
			// PLSQLCommons.g:203:9: ( PERIOD r+= general_element_id )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==PERIOD) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// PLSQLCommons.g:204:13: PERIOD r+= general_element_id
					{
					PERIOD55=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_aggregate_function_name1390); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD55);

					pushFollow(FOLLOW_general_element_id_in_aggregate_function_name1394);
					r=general_element_id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_general_element_id.add(r.getTree());
					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			// AST REWRITE
			// elements: r
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: r
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",list_r);
			root_0 = (Object)adaptor.nil();
			// 206:9: -> ( $r)+
			{
				if ( !(stream_r.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_r.hasNext() ) {
					adaptor.addChild(root_0, stream_r.nextTree());
				}
				stream_r.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aggregate_function_name"


	public static class query_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query_name"
	// PLSQLCommons.g:209:1: query_name : id -> ^( QUERY_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.query_name_return query_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.query_name_return retval = new PLSQLParser_PLSQLCommons.query_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id56 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:210:5: ( id -> ^( QUERY_NAME id ) )
			// PLSQLCommons.g:210:10: id
			{
			pushFollow(FOLLOW_id_in_query_name1439);
			id56=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id56.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 211:9: -> ^( QUERY_NAME id )
			{
				// PLSQLCommons.g:211:12: ^( QUERY_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY_NAME, "QUERY_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query_name"


	public static class constraint_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraint_name"
	// PLSQLCommons.g:214:1: constraint_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )? -> ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? ) ;
	public final PLSQLParser_PLSQLCommons.constraint_name_return constraint_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.constraint_name_return retval = new PLSQLParser_PLSQLCommons.constraint_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD58=null;
		Token AT_SIGN60=null;
		ParserRuleReturnScope id57 =null;
		ParserRuleReturnScope id_expression59 =null;
		ParserRuleReturnScope link_name61 =null;

		Object PERIOD58_tree=null;
		Object AT_SIGN60_tree=null;
		RewriteRuleTokenStream stream_AT_SIGN=new RewriteRuleTokenStream(adaptor,"token AT_SIGN");
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_link_name=new RewriteRuleSubtreeStream(adaptor,"rule link_name");

		try {
			// PLSQLCommons.g:215:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )? -> ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? ) )
			// PLSQLCommons.g:215:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )?
			{
			pushFollow(FOLLOW_id_in_constraint_name1475);
			id57=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id57.getTree());
			// PLSQLCommons.g:215:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==PERIOD) && (synpred5_PLSQLCommons())) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// PLSQLCommons.g:215:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD58=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_constraint_name1485); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD58);

					pushFollow(FOLLOW_id_expression_in_constraint_name1487);
					id_expression59=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression59.getTree());
					}
					break;

				default :
					break loop18;
				}
			}

			// PLSQLCommons.g:215:62: ( AT_SIGN link_name )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==AT_SIGN) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// PLSQLCommons.g:215:63: AT_SIGN link_name
					{
					AT_SIGN60=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_constraint_name1492); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AT_SIGN.add(AT_SIGN60);

					pushFollow(FOLLOW_link_name_in_constraint_name1494);
					link_name61=link_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_link_name.add(link_name61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id_expression, id, link_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 216:9: -> ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? )
			{
				// PLSQLCommons.g:216:12: ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINT_NAME, "CONSTRAINT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:216:33: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				// PLSQLCommons.g:216:48: ( link_name )?
				if ( stream_link_name.hasNext() ) {
					adaptor.addChild(root_1, stream_link_name.nextTree());
				}
				stream_link_name.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraint_name"


	public static class label_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "label_name"
	// PLSQLCommons.g:219:1: label_name : id_expression -> ^( LABEL_NAME id_expression ) ;
	public final PLSQLParser_PLSQLCommons.label_name_return label_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.label_name_return retval = new PLSQLParser_PLSQLCommons.label_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id_expression62 =null;

		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");

		try {
			// PLSQLCommons.g:220:5: ( id_expression -> ^( LABEL_NAME id_expression ) )
			// PLSQLCommons.g:220:10: id_expression
			{
			pushFollow(FOLLOW_id_expression_in_label_name1538);
			id_expression62=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression62.getTree());
			// AST REWRITE
			// elements: id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 221:9: -> ^( LABEL_NAME id_expression )
			{
				// PLSQLCommons.g:221:12: ^( LABEL_NAME id_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LABEL_NAME, "LABEL_NAME"), root_1);
				adaptor.addChild(root_1, stream_id_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label_name"


	public static class type_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_name"
	// PLSQLCommons.g:224:1: type_name : id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( TYPE_NAME ( id_expression )+ ) ;
	public final PLSQLParser_PLSQLCommons.type_name_return type_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.type_name_return retval = new PLSQLParser_PLSQLCommons.type_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD64=null;
		ParserRuleReturnScope id_expression63 =null;
		ParserRuleReturnScope id_expression65 =null;

		Object PERIOD64_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");

		try {
			// PLSQLCommons.g:225:5: ( id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( TYPE_NAME ( id_expression )+ ) )
			// PLSQLCommons.g:225:10: id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )*
			{
			pushFollow(FOLLOW_id_expression_in_type_name1574);
			id_expression63=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression63.getTree());
			// PLSQLCommons.g:225:24: ( ( PERIOD id_expression )=> PERIOD id_expression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==PERIOD) && (synpred6_PLSQLCommons())) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// PLSQLCommons.g:225:25: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD64=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_type_name1584); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD64);

					pushFollow(FOLLOW_id_expression_in_type_name1586);
					id_expression65=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression65.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			// AST REWRITE
			// elements: id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 226:9: -> ^( TYPE_NAME ( id_expression )+ )
			{
				// PLSQLCommons.g:226:12: ^( TYPE_NAME ( id_expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_NAME, "TYPE_NAME"), root_1);
				if ( !(stream_id_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_name"


	public static class sequence_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sequence_name"
	// PLSQLCommons.g:229:1: sequence_name : id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( SEQUENCE_NAME ( id_expression )+ ) ;
	public final PLSQLParser_PLSQLCommons.sequence_name_return sequence_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.sequence_name_return retval = new PLSQLParser_PLSQLCommons.sequence_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD67=null;
		ParserRuleReturnScope id_expression66 =null;
		ParserRuleReturnScope id_expression68 =null;

		Object PERIOD67_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");

		try {
			// PLSQLCommons.g:230:5: ( id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( SEQUENCE_NAME ( id_expression )+ ) )
			// PLSQLCommons.g:230:10: id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )*
			{
			pushFollow(FOLLOW_id_expression_in_sequence_name1625);
			id_expression66=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression66.getTree());
			// PLSQLCommons.g:230:24: ( ( PERIOD id_expression )=> PERIOD id_expression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==PERIOD) && (synpred7_PLSQLCommons())) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// PLSQLCommons.g:230:25: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD67=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_sequence_name1635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD67);

					pushFollow(FOLLOW_id_expression_in_sequence_name1637);
					id_expression68=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression68.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			// AST REWRITE
			// elements: id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 231:9: -> ^( SEQUENCE_NAME ( id_expression )+ )
			{
				// PLSQLCommons.g:231:12: ^( SEQUENCE_NAME ( id_expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE_NAME, "SEQUENCE_NAME"), root_1);
				if ( !(stream_id_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequence_name"


	public static class exception_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exception_name"
	// PLSQLCommons.g:234:1: exception_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( EXCEPTION_NAME id ( id_expression )* ) ;
	public final PLSQLParser_PLSQLCommons.exception_name_return exception_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.exception_name_return retval = new PLSQLParser_PLSQLCommons.exception_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD70=null;
		ParserRuleReturnScope id69 =null;
		ParserRuleReturnScope id_expression71 =null;

		Object PERIOD70_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:235:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( EXCEPTION_NAME id ( id_expression )* ) )
			// PLSQLCommons.g:235:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )*
			{
			pushFollow(FOLLOW_id_in_exception_name1676);
			id69=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id69.getTree());
			// PLSQLCommons.g:235:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==PERIOD) && (synpred8_PLSQLCommons())) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// PLSQLCommons.g:235:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD70=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_exception_name1686); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD70);

					pushFollow(FOLLOW_id_expression_in_exception_name1688);
					id_expression71=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression71.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			// AST REWRITE
			// elements: id_expression, id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 236:9: -> ^( EXCEPTION_NAME id ( id_expression )* )
			{
				// PLSQLCommons.g:236:11: ^( EXCEPTION_NAME id ( id_expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXCEPTION_NAME, "EXCEPTION_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:236:31: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exception_name"


	public static class function_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_name"
	// PLSQLCommons.g:239:1: function_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( FUNCTION_NAME id ( id_expression )* ) ;
	public final PLSQLParser_PLSQLCommons.function_name_return function_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.function_name_return retval = new PLSQLParser_PLSQLCommons.function_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD73=null;
		ParserRuleReturnScope id72 =null;
		ParserRuleReturnScope id_expression74 =null;

		Object PERIOD73_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:240:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( FUNCTION_NAME id ( id_expression )* ) )
			// PLSQLCommons.g:240:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_in_function_name1729);
			id72=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id72.getTree());
			// PLSQLCommons.g:240:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==PERIOD) && (synpred9_PLSQLCommons())) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// PLSQLCommons.g:240:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD73=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function_name1739); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD73);

					pushFollow(FOLLOW_id_expression_in_function_name1741);
					id_expression74=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression74.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 241:9: -> ^( FUNCTION_NAME id ( id_expression )* )
			{
				// PLSQLCommons.g:241:12: ^( FUNCTION_NAME id ( id_expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_NAME, "FUNCTION_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:241:31: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_name"


	public static class procedure_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedure_name"
	// PLSQLCommons.g:244:1: procedure_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( PROCEDURE_NAME id ( id_expression )* ) ;
	public final PLSQLParser_PLSQLCommons.procedure_name_return procedure_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.procedure_name_return retval = new PLSQLParser_PLSQLCommons.procedure_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD76=null;
		ParserRuleReturnScope id75 =null;
		ParserRuleReturnScope id_expression77 =null;

		Object PERIOD76_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:245:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( PROCEDURE_NAME id ( id_expression )* ) )
			// PLSQLCommons.g:245:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_in_procedure_name1782);
			id75=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id75.getTree());
			// PLSQLCommons.g:245:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==PERIOD) && (synpred10_PLSQLCommons())) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// PLSQLCommons.g:245:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD76=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_procedure_name1792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD76);

					pushFollow(FOLLOW_id_expression_in_procedure_name1794);
					id_expression77=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression77.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 246:9: -> ^( PROCEDURE_NAME id ( id_expression )* )
			{
				// PLSQLCommons.g:246:12: ^( PROCEDURE_NAME id ( id_expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_NAME, "PROCEDURE_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:246:32: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedure_name"


	public static class trigger_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trigger_name"
	// PLSQLCommons.g:249:1: trigger_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( TRIGGER_NAME id ( id_expression )* ) ;
	public final PLSQLParser_PLSQLCommons.trigger_name_return trigger_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.trigger_name_return retval = new PLSQLParser_PLSQLCommons.trigger_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD79=null;
		ParserRuleReturnScope id78 =null;
		ParserRuleReturnScope id_expression80 =null;

		Object PERIOD79_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:250:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( TRIGGER_NAME id ( id_expression )* ) )
			// PLSQLCommons.g:250:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_in_trigger_name1835);
			id78=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id78.getTree());
			// PLSQLCommons.g:250:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==PERIOD) && (synpred11_PLSQLCommons())) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// PLSQLCommons.g:250:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD79=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_trigger_name1845); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD79);

					pushFollow(FOLLOW_id_expression_in_trigger_name1847);
					id_expression80=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression80.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id_expression, id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 251:9: -> ^( TRIGGER_NAME id ( id_expression )* )
			{
				// PLSQLCommons.g:251:11: ^( TRIGGER_NAME id ( id_expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIGGER_NAME, "TRIGGER_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:251:29: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_name"


	public static class variable_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable_name"
	// PLSQLCommons.g:254:1: variable_name : ( ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* ) | bind_variable -> ^( HOSTED_VARIABLE_NAME bind_variable ) );
	public final PLSQLParser_PLSQLCommons.variable_name_return variable_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.variable_name_return retval = new PLSQLParser_PLSQLCommons.variable_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRODUCER81=null;
		Token PERIOD84=null;
		ParserRuleReturnScope char_set_name82 =null;
		ParserRuleReturnScope id_expression83 =null;
		ParserRuleReturnScope id_expression85 =null;
		ParserRuleReturnScope bind_variable86 =null;

		Object INTRODUCER81_tree=null;
		Object PERIOD84_tree=null;
		RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");
		RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");

		try {
			// PLSQLCommons.g:255:5: ( ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* ) | bind_variable -> ^( HOSTED_VARIABLE_NAME bind_variable ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==DELIMITED_ID||LA28_0==INTRODUCER||LA28_0==REGULAR_ID) ) {
				alt28=1;
			}
			else if ( (LA28_0==BINDVAR||LA28_0==COLON) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// PLSQLCommons.g:255:10: ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )?
					{
					// PLSQLCommons.g:255:10: ( INTRODUCER char_set_name )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==INTRODUCER) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// PLSQLCommons.g:255:11: INTRODUCER char_set_name
							{
							INTRODUCER81=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_variable_name1888); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER81);

							pushFollow(FOLLOW_char_set_name_in_variable_name1890);
							char_set_name82=char_set_name();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name82.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_id_expression_in_variable_name1906);
					id_expression83=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression83.getTree());
					// PLSQLCommons.g:256:27: ( ( PERIOD id_expression )=> PERIOD id_expression )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==PERIOD) && (synpred12_PLSQLCommons())) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// PLSQLCommons.g:256:28: ( PERIOD id_expression )=> PERIOD id_expression
							{
							PERIOD84=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable_name1916); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD84);

							pushFollow(FOLLOW_id_expression_in_variable_name1918);
							id_expression85=id_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_id_expression.add(id_expression85.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: id_expression, char_set_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 257:9: -> ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* )
					{
						// PLSQLCommons.g:257:12: ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE_NAME, "VARIABLE_NAME"), root_1);
						// PLSQLCommons.g:257:28: ( char_set_name )?
						if ( stream_char_set_name.hasNext() ) {
							adaptor.addChild(root_1, stream_char_set_name.nextTree());
						}
						stream_char_set_name.reset();

						// PLSQLCommons.g:257:43: ( id_expression )*
						while ( stream_id_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_id_expression.nextTree());
						}
						stream_id_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:258:10: bind_variable
					{
					pushFollow(FOLLOW_bind_variable_in_variable_name1951);
					bind_variable86=bind_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bind_variable.add(bind_variable86.getTree());
					// AST REWRITE
					// elements: bind_variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 259:9: -> ^( HOSTED_VARIABLE_NAME bind_variable )
					{
						// PLSQLCommons.g:259:12: ^( HOSTED_VARIABLE_NAME bind_variable )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOSTED_VARIABLE_NAME, "HOSTED_VARIABLE_NAME"), root_1);
						adaptor.addChild(root_1, stream_bind_variable.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_name"


	public static class index_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_name"
	// PLSQLCommons.g:262:1: index_name : id -> ^( INDEX_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.index_name_return index_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.index_name_return retval = new PLSQLParser_PLSQLCommons.index_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id87 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:263:5: ( id -> ^( INDEX_NAME id ) )
			// PLSQLCommons.g:263:10: id
			{
			pushFollow(FOLLOW_id_in_index_name1987);
			id87=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id87.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 264:9: -> ^( INDEX_NAME id )
			{
				// PLSQLCommons.g:264:12: ^( INDEX_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEX_NAME, "INDEX_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_name"


	public static class cursor_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cursor_name"
	// PLSQLCommons.g:267:1: cursor_name : ( id | bind_variable ) -> ^( CURSOR_NAME ( id )? ( bind_variable )? ) ;
	public final PLSQLParser_PLSQLCommons.cursor_name_return cursor_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.cursor_name_return retval = new PLSQLParser_PLSQLCommons.cursor_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id88 =null;
		ParserRuleReturnScope bind_variable89 =null;

		RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:268:5: ( ( id | bind_variable ) -> ^( CURSOR_NAME ( id )? ( bind_variable )? ) )
			// PLSQLCommons.g:268:10: ( id | bind_variable )
			{
			// PLSQLCommons.g:268:10: ( id | bind_variable )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==DELIMITED_ID||LA29_0==INTRODUCER||LA29_0==REGULAR_ID) ) {
				alt29=1;
			}
			else if ( (LA29_0==BINDVAR||LA29_0==COLON) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// PLSQLCommons.g:268:11: id
					{
					pushFollow(FOLLOW_id_in_cursor_name2024);
					id88=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id88.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:268:16: bind_variable
					{
					pushFollow(FOLLOW_bind_variable_in_cursor_name2028);
					bind_variable89=bind_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bind_variable.add(bind_variable89.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, bind_variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 269:9: -> ^( CURSOR_NAME ( id )? ( bind_variable )? )
			{
				// PLSQLCommons.g:269:12: ^( CURSOR_NAME ( id )? ( bind_variable )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CURSOR_NAME, "CURSOR_NAME"), root_1);
				// PLSQLCommons.g:269:26: ( id )?
				if ( stream_id.hasNext() ) {
					adaptor.addChild(root_1, stream_id.nextTree());
				}
				stream_id.reset();

				// PLSQLCommons.g:269:30: ( bind_variable )?
				if ( stream_bind_variable.hasNext() ) {
					adaptor.addChild(root_1, stream_bind_variable.nextTree());
				}
				stream_bind_variable.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cursor_name"


	public static class record_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "record_name"
	// PLSQLCommons.g:272:1: record_name : ( id | bind_variable ) -> ^( RECORD_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.record_name_return record_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.record_name_return retval = new PLSQLParser_PLSQLCommons.record_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id90 =null;
		ParserRuleReturnScope bind_variable91 =null;

		RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:273:5: ( ( id | bind_variable ) -> ^( RECORD_NAME id ) )
			// PLSQLCommons.g:273:10: ( id | bind_variable )
			{
			// PLSQLCommons.g:273:10: ( id | bind_variable )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==DELIMITED_ID||LA30_0==INTRODUCER||LA30_0==REGULAR_ID) ) {
				alt30=1;
			}
			else if ( (LA30_0==BINDVAR||LA30_0==COLON) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// PLSQLCommons.g:273:11: id
					{
					pushFollow(FOLLOW_id_in_record_name2070);
					id90=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id90.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:273:16: bind_variable
					{
					pushFollow(FOLLOW_bind_variable_in_record_name2074);
					bind_variable91=bind_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bind_variable.add(bind_variable91.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 274:9: -> ^( RECORD_NAME id )
			{
				// PLSQLCommons.g:274:11: ^( RECORD_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECORD_NAME, "RECORD_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "record_name"


	public static class collection_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_name"
	// PLSQLCommons.g:277:1: collection_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( COLLECTION_NAME id ( id_expression )? ) ;
	public final PLSQLParser_PLSQLCommons.collection_name_return collection_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.collection_name_return retval = new PLSQLParser_PLSQLCommons.collection_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD93=null;
		ParserRuleReturnScope id92 =null;
		ParserRuleReturnScope id_expression94 =null;

		Object PERIOD93_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:278:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( COLLECTION_NAME id ( id_expression )? ) )
			// PLSQLCommons.g:278:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_in_collection_name2110);
			id92=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id92.getTree());
			// PLSQLCommons.g:278:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==PERIOD) && (synpred13_PLSQLCommons())) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// PLSQLCommons.g:278:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD93=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_collection_name2120); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD93);

					pushFollow(FOLLOW_id_expression_in_collection_name2122);
					id_expression94=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression94.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 279:9: -> ^( COLLECTION_NAME id ( id_expression )? )
			{
				// PLSQLCommons.g:279:11: ^( COLLECTION_NAME id ( id_expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION_NAME, "COLLECTION_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:279:32: ( id_expression )?
				if ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_name"


	public static class link_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "link_name"
	// PLSQLCommons.g:282:1: link_name : id -> ^( LINK_NAME id ) ;
	public final PLSQLParser_PLSQLCommons.link_name_return link_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.link_name_return retval = new PLSQLParser_PLSQLCommons.link_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id95 =null;

		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:283:5: ( id -> ^( LINK_NAME id ) )
			// PLSQLCommons.g:283:10: id
			{
			pushFollow(FOLLOW_id_in_link_name2162);
			id95=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id95.getTree());
			// AST REWRITE
			// elements: id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 284:9: -> ^( LINK_NAME id )
			{
				// PLSQLCommons.g:284:12: ^( LINK_NAME id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LINK_NAME, "LINK_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "link_name"


	public static class column_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "column_name"
	// PLSQLCommons.g:287:1: column_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( COLUMN_NAME id ( id_expression )* ) ;
	public final PLSQLParser_PLSQLCommons.column_name_return column_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.column_name_return retval = new PLSQLParser_PLSQLCommons.column_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD97=null;
		ParserRuleReturnScope id96 =null;
		ParserRuleReturnScope id_expression98 =null;

		Object PERIOD97_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// PLSQLCommons.g:288:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( COLUMN_NAME id ( id_expression )* ) )
			// PLSQLCommons.g:288:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )*
			{
			pushFollow(FOLLOW_id_in_column_name2198);
			id96=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id96.getTree());
			// PLSQLCommons.g:288:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==PERIOD) && (synpred14_PLSQLCommons())) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// PLSQLCommons.g:288:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD97=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_column_name2208); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD97);

					pushFollow(FOLLOW_id_expression_in_column_name2210);
					id_expression98=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression98.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: id_expression, id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 289:9: -> ^( COLUMN_NAME id ( id_expression )* )
			{
				// PLSQLCommons.g:289:12: ^( COLUMN_NAME id ( id_expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_NAME, "COLUMN_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:289:29: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "column_name"


	public static class tableview_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tableview_name"
	// PLSQLCommons.g:292:1: tableview_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? ( AT_SIGN link_name |{...}? => partition_extension_clause )? -> ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? ) ;
	public final PLSQLParser_PLSQLCommons.tableview_name_return tableview_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.tableview_name_return retval = new PLSQLParser_PLSQLCommons.tableview_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD100=null;
		Token AT_SIGN102=null;
		ParserRuleReturnScope id99 =null;
		ParserRuleReturnScope id_expression101 =null;
		ParserRuleReturnScope link_name103 =null;
		ParserRuleReturnScope partition_extension_clause104 =null;

		Object PERIOD100_tree=null;
		Object AT_SIGN102_tree=null;
		RewriteRuleTokenStream stream_AT_SIGN=new RewriteRuleTokenStream(adaptor,"token AT_SIGN");
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_partition_extension_clause=new RewriteRuleSubtreeStream(adaptor,"rule partition_extension_clause");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_link_name=new RewriteRuleSubtreeStream(adaptor,"rule link_name");

		try {
			// PLSQLCommons.g:293:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? ( AT_SIGN link_name |{...}? => partition_extension_clause )? -> ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? ) )
			// PLSQLCommons.g:293:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )? ( AT_SIGN link_name |{...}? => partition_extension_clause )?
			{
			pushFollow(FOLLOW_id_in_tableview_name2251);
			id99=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id99.getTree());
			// PLSQLCommons.g:293:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==PERIOD) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==REGULAR_ID) && (synpred15_PLSQLCommons())) {
					alt33=1;
				}
				else if ( (LA33_1==DELIMITED_ID) && (synpred15_PLSQLCommons())) {
					alt33=1;
				}
			}
			switch (alt33) {
				case 1 :
					// PLSQLCommons.g:293:14: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD100=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_tableview_name2261); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD100);

					pushFollow(FOLLOW_id_expression_in_tableview_name2263);
					id_expression101=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression101.getTree());
					}
					break;

			}

			// PLSQLCommons.g:294:5: ( AT_SIGN link_name |{...}? => partition_extension_clause )?
			int alt34=3;
			alt34 = dfa34.predict(input);
			switch (alt34) {
				case 1 :
					// PLSQLCommons.g:294:10: AT_SIGN link_name
					{
					AT_SIGN102=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_tableview_name2277); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AT_SIGN.add(AT_SIGN102);

					pushFollow(FOLLOW_link_name_in_tableview_name2279);
					link_name103=link_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_link_name.add(link_name103.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:295:10: {...}? => partition_extension_clause
					{
					if ( !((!(input.LA(2) == SQL92_RESERVED_BY))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "tableview_name", "!(input.LA(2) == SQL92_RESERVED_BY)");
					}
					pushFollow(FOLLOW_partition_extension_clause_in_tableview_name2293);
					partition_extension_clause104=partition_extension_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partition_extension_clause.add(partition_extension_clause104.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id, link_name, partition_extension_clause, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 297:9: -> ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? )
			{
				// PLSQLCommons.g:297:12: ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLEVIEW_NAME, "TABLEVIEW_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// PLSQLCommons.g:297:32: ( id_expression )?
				if ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				// PLSQLCommons.g:297:47: ( link_name )?
				if ( stream_link_name.hasNext() ) {
					adaptor.addChild(root_1, stream_link_name.nextTree());
				}
				stream_link_name.reset();

				// PLSQLCommons.g:297:58: ( partition_extension_clause )?
				if ( stream_partition_extension_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_partition_extension_clause.nextTree());
				}
				stream_partition_extension_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableview_name"


	public static class view_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "view_name"
	// PLSQLCommons.g:300:1: view_name : id_expression ( PERIOD id_expression )? -> ^( VIEW_NAME ( id_expression )* ) ;
	public final PLSQLParser_PLSQLCommons.view_name_return view_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.view_name_return retval = new PLSQLParser_PLSQLCommons.view_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD106=null;
		ParserRuleReturnScope id_expression105 =null;
		ParserRuleReturnScope id_expression107 =null;

		Object PERIOD106_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");

		try {
			// PLSQLCommons.g:301:5: ( id_expression ( PERIOD id_expression )? -> ^( VIEW_NAME ( id_expression )* ) )
			// PLSQLCommons.g:301:9: id_expression ( PERIOD id_expression )?
			{
			pushFollow(FOLLOW_id_expression_in_view_name2348);
			id_expression105=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression105.getTree());
			// PLSQLCommons.g:301:23: ( PERIOD id_expression )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==PERIOD) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// PLSQLCommons.g:301:24: PERIOD id_expression
					{
					PERIOD106=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_view_name2351); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD106);

					pushFollow(FOLLOW_id_expression_in_view_name2353);
					id_expression107=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression107.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 302:9: -> ^( VIEW_NAME ( id_expression )* )
			{
				// PLSQLCommons.g:302:12: ^( VIEW_NAME ( id_expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VIEW_NAME, "VIEW_NAME"), root_1);
				// PLSQLCommons.g:302:24: ( id_expression )*
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "view_name"


	public static class char_set_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "char_set_name"
	// PLSQLCommons.g:304:1: char_set_name : id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( CHAR_SET_NAME ( id_expression )+ ) ;
	public final PLSQLParser_PLSQLCommons.char_set_name_return char_set_name() throws RecognitionException {
		PLSQLParser_PLSQLCommons.char_set_name_return retval = new PLSQLParser_PLSQLCommons.char_set_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD109=null;
		ParserRuleReturnScope id_expression108 =null;
		ParserRuleReturnScope id_expression110 =null;

		Object PERIOD109_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");

		try {
			// PLSQLCommons.g:305:5: ( id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( CHAR_SET_NAME ( id_expression )+ ) )
			// PLSQLCommons.g:305:10: id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )*
			{
			pushFollow(FOLLOW_id_expression_in_char_set_name2387);
			id_expression108=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression108.getTree());
			// PLSQLCommons.g:305:24: ( ( PERIOD id_expression )=> PERIOD id_expression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==PERIOD) && (synpred16_PLSQLCommons())) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// PLSQLCommons.g:305:25: ( PERIOD id_expression )=> PERIOD id_expression
					{
					PERIOD109=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_char_set_name2397); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD109);

					pushFollow(FOLLOW_id_expression_in_char_set_name2399);
					id_expression110=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression110.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			// AST REWRITE
			// elements: id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 306:9: -> ^( CHAR_SET_NAME ( id_expression )+ )
			{
				// PLSQLCommons.g:306:11: ^( CHAR_SET_NAME ( id_expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHAR_SET_NAME, "CHAR_SET_NAME"), root_1);
				if ( !(stream_id_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "char_set_name"


	public static class keep_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "keep_clause"
	// PLSQLCommons.g:314:1: keep_clause : keep_key ^ LEFT_PAREN ! dense_rank_key ( first_key | last_key ) order_by_clause RIGHT_PAREN ! ( over_clause )? ;
	public final PLSQLParser_PLSQLCommons.keep_clause_return keep_clause() throws RecognitionException {
		PLSQLParser_PLSQLCommons.keep_clause_return retval = new PLSQLParser_PLSQLCommons.keep_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN112=null;
		Token RIGHT_PAREN117=null;
		ParserRuleReturnScope keep_key111 =null;
		ParserRuleReturnScope dense_rank_key113 =null;
		ParserRuleReturnScope first_key114 =null;
		ParserRuleReturnScope last_key115 =null;
		ParserRuleReturnScope order_by_clause116 =null;
		ParserRuleReturnScope over_clause118 =null;

		Object LEFT_PAREN112_tree=null;
		Object RIGHT_PAREN117_tree=null;

		try {
			// PLSQLCommons.g:315:5: ( keep_key ^ LEFT_PAREN ! dense_rank_key ( first_key | last_key ) order_by_clause RIGHT_PAREN ! ( over_clause )? )
			// PLSQLCommons.g:315:9: keep_key ^ LEFT_PAREN ! dense_rank_key ( first_key | last_key ) order_by_clause RIGHT_PAREN ! ( over_clause )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_keep_key_in_keep_clause2441);
			keep_key111=gPLSQLParser.keep_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(keep_key111.getTree(), root_0);
			LEFT_PAREN112=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keep_clause2452); if (state.failed) return retval;
			pushFollow(FOLLOW_dense_rank_key_in_keep_clause2467);
			dense_rank_key113=gPLSQLParser.dense_rank_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, dense_rank_key113.getTree());

			// PLSQLCommons.g:317:28: ( first_key | last_key )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("first"))||(input.LT(1).getText().equalsIgnoreCase("last"))))) {
				int LA37_1 = input.LA(2);
				if ( ((input.LT(1).getText().equalsIgnoreCase("first"))) ) {
					alt37=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("last"))) ) {
					alt37=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			switch (alt37) {
				case 1 :
					// PLSQLCommons.g:317:29: first_key
					{
					pushFollow(FOLLOW_first_key_in_keep_clause2470);
					first_key114=gPLSQLParser.first_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, first_key114.getTree());

					}
					break;
				case 2 :
					// PLSQLCommons.g:317:39: last_key
					{
					pushFollow(FOLLOW_last_key_in_keep_clause2472);
					last_key115=gPLSQLParser.last_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, last_key115.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_order_by_clause_in_keep_clause2488);
			order_by_clause116=gPLSQLParser.order_by_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, order_by_clause116.getTree());

			RIGHT_PAREN117=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keep_clause2498); if (state.failed) return retval;
			// PLSQLCommons.g:319:22: ( over_clause )?
			int alt38=2;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// PLSQLCommons.g:319:22: over_clause
					{
					pushFollow(FOLLOW_over_clause_in_keep_clause2501);
					over_clause118=gPLSQLParser.over_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, over_clause118.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "keep_clause"


	public static class function_argument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_argument"
	// PLSQLCommons.g:322:1: function_argument : LEFT_PAREN ( argument )? ( COMMA argument )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) ;
	public final PLSQLParser_PLSQLCommons.function_argument_return function_argument() throws RecognitionException {
		PLSQLParser_PLSQLCommons.function_argument_return retval = new PLSQLParser_PLSQLCommons.function_argument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN119=null;
		Token COMMA121=null;
		Token RIGHT_PAREN123=null;
		ParserRuleReturnScope argument120 =null;
		ParserRuleReturnScope argument122 =null;
		ParserRuleReturnScope keep_clause124 =null;

		Object LEFT_PAREN119_tree=null;
		Object COMMA121_tree=null;
		Object RIGHT_PAREN123_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
		RewriteRuleSubtreeStream stream_keep_clause=new RewriteRuleSubtreeStream(adaptor,"rule keep_clause");

		try {
			// PLSQLCommons.g:323:5: ( LEFT_PAREN ( argument )? ( COMMA argument )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) )
			// PLSQLCommons.g:323:10: LEFT_PAREN ( argument )? ( COMMA argument )* RIGHT_PAREN ( keep_clause )?
			{
			LEFT_PAREN119=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_argument2522); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN119);

			// PLSQLCommons.g:324:13: ( argument )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==APPROXIMATE_NUM_LIT||LA39_0==BINDVAR||(LA39_0 >= CHAR_STRING && LA39_0 <= COLON)||LA39_0==DELIMITED_ID||LA39_0==EXACT_NUM_LIT||LA39_0==INTRODUCER||LA39_0==LEFT_PAREN||LA39_0==MINUS_SIGN||LA39_0==NATIONAL_CHAR_STRING_LIT||LA39_0==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA39_0==PLUS_SIGN||LA39_0==REGULAR_ID||LA39_0==SQL92_RESERVED_ALL||LA39_0==SQL92_RESERVED_ANY||LA39_0==SQL92_RESERVED_CASE||(LA39_0 >= SQL92_RESERVED_CURSOR && LA39_0 <= SQL92_RESERVED_DATE)||(LA39_0 >= SQL92_RESERVED_DEFAULT && LA39_0 <= SQL92_RESERVED_DELETE)||LA39_0==SQL92_RESERVED_DISTINCT||(LA39_0 >= SQL92_RESERVED_EXISTS && LA39_0 <= SQL92_RESERVED_FALSE)||(LA39_0 >= SQL92_RESERVED_NOT && LA39_0 <= SQL92_RESERVED_NULL)||LA39_0==SQL92_RESERVED_PRIOR||LA39_0==SQL92_RESERVED_TRUE||LA39_0==UNSIGNED_INTEGER) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// PLSQLCommons.g:324:13: argument
					{
					pushFollow(FOLLOW_argument_in_function_argument2537);
					argument120=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument120.getTree());
					}
					break;

			}

			// PLSQLCommons.g:324:23: ( COMMA argument )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==COMMA) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// PLSQLCommons.g:324:24: COMMA argument
					{
					COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument2541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA121);

					pushFollow(FOLLOW_argument_in_function_argument2543);
					argument122=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument122.getTree());
					}
					break;

				default :
					break loop40;
				}
			}

			RIGHT_PAREN123=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_argument2557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN123);

			// PLSQLCommons.g:326:9: ( keep_clause )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==REGULAR_ID) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==LEFT_PAREN) ) {
					int LA41_3 = input.LA(3);
					if ( (LA41_3==REGULAR_ID) ) {
						int LA41_10 = input.LA(4);
						if ( (LA41_10==REGULAR_ID) ) {
							int LA41_17 = input.LA(5);
							if ( (LA41_17==SQL92_RESERVED_ORDER) && ((input.LT(1).getText().equalsIgnoreCase("keep")))) {
								alt41=1;
							}
						}
					}
				}
			}
			switch (alt41) {
				case 1 :
					// PLSQLCommons.g:326:9: keep_clause
					{
					pushFollow(FOLLOW_keep_clause_in_function_argument2567);
					keep_clause124=keep_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_keep_clause.add(keep_clause124.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: keep_clause, argument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 327:9: -> ^( ARGUMENTS ( argument )* ( keep_clause )? )
			{
				// PLSQLCommons.g:327:12: ^( ARGUMENTS ( argument )* ( keep_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				// PLSQLCommons.g:327:24: ( argument )*
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				// PLSQLCommons.g:327:34: ( keep_clause )?
				if ( stream_keep_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_keep_clause.nextTree());
				}
				stream_keep_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_argument"


	public static class function_argument_analytic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_argument_analytic"
	// PLSQLCommons.g:330:1: function_argument_analytic : LEFT_PAREN ( argument ( respect_or_ignore_nulls )? )? ( COMMA argument ( respect_or_ignore_nulls )? )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) ;
	public final PLSQLParser_PLSQLCommons.function_argument_analytic_return function_argument_analytic() throws RecognitionException {
		PLSQLParser_PLSQLCommons.function_argument_analytic_return retval = new PLSQLParser_PLSQLCommons.function_argument_analytic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN125=null;
		Token COMMA128=null;
		Token RIGHT_PAREN131=null;
		ParserRuleReturnScope argument126 =null;
		ParserRuleReturnScope respect_or_ignore_nulls127 =null;
		ParserRuleReturnScope argument129 =null;
		ParserRuleReturnScope respect_or_ignore_nulls130 =null;
		ParserRuleReturnScope keep_clause132 =null;

		Object LEFT_PAREN125_tree=null;
		Object COMMA128_tree=null;
		Object RIGHT_PAREN131_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
		RewriteRuleSubtreeStream stream_respect_or_ignore_nulls=new RewriteRuleSubtreeStream(adaptor,"rule respect_or_ignore_nulls");
		RewriteRuleSubtreeStream stream_keep_clause=new RewriteRuleSubtreeStream(adaptor,"rule keep_clause");

		try {
			// PLSQLCommons.g:331:5: ( LEFT_PAREN ( argument ( respect_or_ignore_nulls )? )? ( COMMA argument ( respect_or_ignore_nulls )? )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) )
			// PLSQLCommons.g:331:10: LEFT_PAREN ( argument ( respect_or_ignore_nulls )? )? ( COMMA argument ( respect_or_ignore_nulls )? )* RIGHT_PAREN ( keep_clause )?
			{
			LEFT_PAREN125=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_argument_analytic2608); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN125);

			// PLSQLCommons.g:332:13: ( argument ( respect_or_ignore_nulls )? )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==APPROXIMATE_NUM_LIT||LA43_0==BINDVAR||(LA43_0 >= CHAR_STRING && LA43_0 <= COLON)||LA43_0==DELIMITED_ID||LA43_0==EXACT_NUM_LIT||LA43_0==INTRODUCER||LA43_0==LEFT_PAREN||LA43_0==MINUS_SIGN||LA43_0==NATIONAL_CHAR_STRING_LIT||LA43_0==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA43_0==PLUS_SIGN||LA43_0==REGULAR_ID||LA43_0==SQL92_RESERVED_ALL||LA43_0==SQL92_RESERVED_ANY||LA43_0==SQL92_RESERVED_CASE||(LA43_0 >= SQL92_RESERVED_CURSOR && LA43_0 <= SQL92_RESERVED_DATE)||(LA43_0 >= SQL92_RESERVED_DEFAULT && LA43_0 <= SQL92_RESERVED_DELETE)||LA43_0==SQL92_RESERVED_DISTINCT||(LA43_0 >= SQL92_RESERVED_EXISTS && LA43_0 <= SQL92_RESERVED_FALSE)||(LA43_0 >= SQL92_RESERVED_NOT && LA43_0 <= SQL92_RESERVED_NULL)||LA43_0==SQL92_RESERVED_PRIOR||LA43_0==SQL92_RESERVED_TRUE||LA43_0==UNSIGNED_INTEGER) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// PLSQLCommons.g:332:14: argument ( respect_or_ignore_nulls )?
					{
					pushFollow(FOLLOW_argument_in_function_argument_analytic2623);
					argument126=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument126.getTree());
					// PLSQLCommons.g:332:23: ( respect_or_ignore_nulls )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// PLSQLCommons.g:332:23: respect_or_ignore_nulls
							{
							pushFollow(FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2625);
							respect_or_ignore_nulls127=respect_or_ignore_nulls();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_respect_or_ignore_nulls.add(respect_or_ignore_nulls127.getTree());
							}
							break;

					}

					}
					break;

			}

			// PLSQLCommons.g:333:13: ( COMMA argument ( respect_or_ignore_nulls )? )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==COMMA) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// PLSQLCommons.g:333:14: COMMA argument ( respect_or_ignore_nulls )?
					{
					COMMA128=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_analytic2643); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA128);

					pushFollow(FOLLOW_argument_in_function_argument_analytic2645);
					argument129=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument129.getTree());
					// PLSQLCommons.g:333:29: ( respect_or_ignore_nulls )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// PLSQLCommons.g:333:29: respect_or_ignore_nulls
							{
							pushFollow(FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2647);
							respect_or_ignore_nulls130=respect_or_ignore_nulls();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_respect_or_ignore_nulls.add(respect_or_ignore_nulls130.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop45;
				}
			}

			RIGHT_PAREN131=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_argument_analytic2662); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN131);

			// PLSQLCommons.g:335:10: ( keep_clause )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("keep"))||(input.LT(1).getText().equalsIgnoreCase("over"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==LEFT_PAREN) && (((input.LT(1).getText().equalsIgnoreCase("keep"))||(input.LT(1).getText().equalsIgnoreCase("over"))))) {
					int LA46_2 = input.LA(3);
					if ( (LA46_2==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("keep"))||(input.LT(1).getText().equalsIgnoreCase("over"))))) {
						int LA46_4 = input.LA(4);
						if ( (LA46_4==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("keep")))) {
							alt46=1;
						}
					}
				}
			}
			switch (alt46) {
				case 1 :
					// PLSQLCommons.g:335:10: keep_clause
					{
					pushFollow(FOLLOW_keep_clause_in_function_argument_analytic2673);
					keep_clause132=keep_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_keep_clause.add(keep_clause132.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: argument, keep_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 336:10: -> ^( ARGUMENTS ( argument )* ( keep_clause )? )
			{
				// PLSQLCommons.g:336:13: ^( ARGUMENTS ( argument )* ( keep_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				// PLSQLCommons.g:336:25: ( argument )*
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				// PLSQLCommons.g:336:35: ( keep_clause )?
				if ( stream_keep_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_keep_clause.nextTree());
				}
				stream_keep_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_argument_analytic"


	public static class function_argument_modeling_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_argument_modeling"
	// PLSQLCommons.g:339:1: function_argument_modeling : LEFT_PAREN column_name ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )? using_key ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* ) RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS column_name ( keep_clause )? ) ;
	public final PLSQLParser_PLSQLCommons.function_argument_modeling_return function_argument_modeling() throws RecognitionException {
		PLSQLParser_PLSQLCommons.function_argument_modeling_return retval = new PLSQLParser_PLSQLCommons.function_argument_modeling_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN133=null;
		Token COMMA135=null;
		Token COMMA138=null;
		Token PERIOD143=null;
		Token ASTERISK144=null;
		Token ASTERISK145=null;
		Token COMMA148=null;
		Token RIGHT_PAREN151=null;
		ParserRuleReturnScope column_name134 =null;
		ParserRuleReturnScope numeric136 =null;
		ParserRuleReturnScope null_key137 =null;
		ParserRuleReturnScope numeric139 =null;
		ParserRuleReturnScope null_key140 =null;
		ParserRuleReturnScope using_key141 =null;
		ParserRuleReturnScope tableview_name142 =null;
		ParserRuleReturnScope expression146 =null;
		ParserRuleReturnScope column_alias147 =null;
		ParserRuleReturnScope expression149 =null;
		ParserRuleReturnScope column_alias150 =null;
		ParserRuleReturnScope keep_clause152 =null;

		Object LEFT_PAREN133_tree=null;
		Object COMMA135_tree=null;
		Object COMMA138_tree=null;
		Object PERIOD143_tree=null;
		Object ASTERISK144_tree=null;
		Object ASTERISK145_tree=null;
		Object COMMA148_tree=null;
		Object RIGHT_PAREN151_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_tableview_name=new RewriteRuleSubtreeStream(adaptor,"rule tableview_name");
		RewriteRuleSubtreeStream stream_null_key=new RewriteRuleSubtreeStream(adaptor,"rule null_key");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias");
		RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name");
		RewriteRuleSubtreeStream stream_numeric=new RewriteRuleSubtreeStream(adaptor,"rule numeric");
		RewriteRuleSubtreeStream stream_keep_clause=new RewriteRuleSubtreeStream(adaptor,"rule keep_clause");
		RewriteRuleSubtreeStream stream_using_key=new RewriteRuleSubtreeStream(adaptor,"rule using_key");

		try {
			// PLSQLCommons.g:340:5: ( LEFT_PAREN column_name ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )? using_key ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* ) RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS column_name ( keep_clause )? ) )
			// PLSQLCommons.g:340:10: LEFT_PAREN column_name ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )? using_key ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* ) RIGHT_PAREN ( keep_clause )?
			{
			LEFT_PAREN133=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_argument_modeling2715); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN133);

			pushFollow(FOLLOW_column_name_in_function_argument_modeling2729);
			column_name134=column_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_column_name.add(column_name134.getTree());
			// PLSQLCommons.g:341:25: ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==COMMA) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// PLSQLCommons.g:341:26: COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )?
					{
					COMMA135=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_modeling2732); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA135);

					// PLSQLCommons.g:341:32: ( numeric | null_key )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==APPROXIMATE_NUM_LIT||LA47_0==EXACT_NUM_LIT||LA47_0==MINUS_SIGN||LA47_0==UNSIGNED_INTEGER) ) {
						alt47=1;
					}
					else if ( (LA47_0==SQL92_RESERVED_NULL) ) {
						alt47=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// PLSQLCommons.g:341:33: numeric
							{
							pushFollow(FOLLOW_numeric_in_function_argument_modeling2735);
							numeric136=numeric();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_numeric.add(numeric136.getTree());
							}
							break;
						case 2 :
							// PLSQLCommons.g:341:41: null_key
							{
							pushFollow(FOLLOW_null_key_in_function_argument_modeling2737);
							null_key137=gPLSQLParser.null_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_null_key.add(null_key137.getTree());
							}
							break;

					}

					// PLSQLCommons.g:341:51: ( COMMA ( numeric | null_key ) )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==COMMA) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// PLSQLCommons.g:341:52: COMMA ( numeric | null_key )
							{
							COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_modeling2741); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA138);

							// PLSQLCommons.g:341:58: ( numeric | null_key )
							int alt48=2;
							int LA48_0 = input.LA(1);
							if ( (LA48_0==APPROXIMATE_NUM_LIT||LA48_0==EXACT_NUM_LIT||LA48_0==MINUS_SIGN||LA48_0==UNSIGNED_INTEGER) ) {
								alt48=1;
							}
							else if ( (LA48_0==SQL92_RESERVED_NULL) ) {
								alt48=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 48, 0, input);
								throw nvae;
							}

							switch (alt48) {
								case 1 :
									// PLSQLCommons.g:341:59: numeric
									{
									pushFollow(FOLLOW_numeric_in_function_argument_modeling2744);
									numeric139=numeric();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_numeric.add(numeric139.getTree());
									}
									break;
								case 2 :
									// PLSQLCommons.g:341:67: null_key
									{
									pushFollow(FOLLOW_null_key_in_function_argument_modeling2746);
									null_key140=gPLSQLParser.null_key();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_null_key.add(null_key140.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_using_key_in_function_argument_modeling2767);
			using_key141=gPLSQLParser.using_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_using_key.add(using_key141.getTree());
			// PLSQLCommons.g:343:17: ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* )
			int alt54=3;
			switch ( input.LA(1) ) {
			case INTRODUCER:
				{
				int LA54_1 = input.LA(2);
				if ( (synpred17_PLSQLCommons()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=3;
				}

				}
				break;
			case REGULAR_ID:
				{
				int LA54_2 = input.LA(2);
				if ( (synpred17_PLSQLCommons()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=3;
				}

				}
				break;
			case DELIMITED_ID:
				{
				int LA54_3 = input.LA(2);
				if ( (synpred17_PLSQLCommons()) ) {
					alt54=1;
				}
				else if ( (true) ) {
					alt54=3;
				}

				}
				break;
			case ASTERISK:
				{
				alt54=2;
				}
				break;
			case APPROXIMATE_NUM_LIT:
			case BINDVAR:
			case CHAR_STRING:
			case CHAR_STRING_PERL:
			case COLON:
			case EXACT_NUM_LIT:
			case LEFT_PAREN:
			case MINUS_SIGN:
			case NATIONAL_CHAR_STRING_LIT:
			case PLSQL_NON_RESERVED_CONNECT_BY_ROOT:
			case PLUS_SIGN:
			case SQL92_RESERVED_ALL:
			case SQL92_RESERVED_ANY:
			case SQL92_RESERVED_CASE:
			case SQL92_RESERVED_CURSOR:
			case SQL92_RESERVED_DATE:
			case SQL92_RESERVED_DEFAULT:
			case SQL92_RESERVED_DELETE:
			case SQL92_RESERVED_DISTINCT:
			case SQL92_RESERVED_EXISTS:
			case SQL92_RESERVED_FALSE:
			case SQL92_RESERVED_NOT:
			case SQL92_RESERVED_NULL:
			case SQL92_RESERVED_PRIOR:
			case SQL92_RESERVED_TRUE:
			case UNSIGNED_INTEGER:
				{
				alt54=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// PLSQLCommons.g:343:19: ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK
					{
					pushFollow(FOLLOW_tableview_name_in_function_argument_modeling2796);
					tableview_name142=tableview_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableview_name.add(tableview_name142.getTree());
					PERIOD143=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function_argument_modeling2798); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD143);

					ASTERISK144=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_function_argument_modeling2800); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK144);

					}
					break;
				case 2 :
					// PLSQLCommons.g:344:19: ASTERISK
					{
					ASTERISK145=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_function_argument_modeling2820); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK145);

					}
					break;
				case 3 :
					// PLSQLCommons.g:345:19: expression ( column_alias )? ( COMMA expression ( column_alias )? )*
					{
					pushFollow(FOLLOW_expression_in_function_argument_modeling2840);
					expression146=gPLSQLParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression146.getTree());
					// PLSQLCommons.g:345:30: ( column_alias )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( ((LA51_0 >= CHAR_STRING && LA51_0 <= CHAR_STRING_PERL)||LA51_0==DELIMITED_ID||LA51_0==INTRODUCER||LA51_0==NATIONAL_CHAR_STRING_LIT||LA51_0==REGULAR_ID||LA51_0==SQL92_RESERVED_AS) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// PLSQLCommons.g:345:30: column_alias
							{
							pushFollow(FOLLOW_column_alias_in_function_argument_modeling2842);
							column_alias147=column_alias();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_column_alias.add(column_alias147.getTree());
							}
							break;

					}

					// PLSQLCommons.g:345:44: ( COMMA expression ( column_alias )? )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==COMMA) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// PLSQLCommons.g:345:45: COMMA expression ( column_alias )?
							{
							COMMA148=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_modeling2846); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA148);

							pushFollow(FOLLOW_expression_in_function_argument_modeling2848);
							expression149=gPLSQLParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression149.getTree());
							// PLSQLCommons.g:345:62: ( column_alias )?
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( ((LA52_0 >= CHAR_STRING && LA52_0 <= CHAR_STRING_PERL)||LA52_0==DELIMITED_ID||LA52_0==INTRODUCER||LA52_0==NATIONAL_CHAR_STRING_LIT||LA52_0==REGULAR_ID||LA52_0==SQL92_RESERVED_AS) ) {
								alt52=1;
							}
							switch (alt52) {
								case 1 :
									// PLSQLCommons.g:345:62: column_alias
									{
									pushFollow(FOLLOW_column_alias_in_function_argument_modeling2850);
									column_alias150=column_alias();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_column_alias.add(column_alias150.getTree());
									}
									break;

							}

							}
							break;

						default :
							break loop53;
						}
					}

					}
					break;

			}

			RIGHT_PAREN151=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_argument_modeling2882); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN151);

			// PLSQLCommons.g:348:10: ( keep_clause )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("keep")))) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// PLSQLCommons.g:348:10: keep_clause
					{
					pushFollow(FOLLOW_keep_clause_in_function_argument_modeling2893);
					keep_clause152=keep_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_keep_clause.add(keep_clause152.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: column_name, keep_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 349:10: -> ^( ARGUMENTS column_name ( keep_clause )? )
			{
				// PLSQLCommons.g:349:13: ^( ARGUMENTS column_name ( keep_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				adaptor.addChild(root_1, stream_column_name.nextTree());
				// PLSQLCommons.g:349:37: ( keep_clause )?
				if ( stream_keep_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_keep_clause.nextTree());
				}
				stream_keep_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_argument_modeling"


	public static class respect_or_ignore_nulls_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "respect_or_ignore_nulls"
	// PLSQLCommons.g:352:1: respect_or_ignore_nulls : ( respect_key | ignore_key ) nulls_key ;
	public final PLSQLParser_PLSQLCommons.respect_or_ignore_nulls_return respect_or_ignore_nulls() throws RecognitionException {
		PLSQLParser_PLSQLCommons.respect_or_ignore_nulls_return retval = new PLSQLParser_PLSQLCommons.respect_or_ignore_nulls_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope respect_key153 =null;
		ParserRuleReturnScope ignore_key154 =null;
		ParserRuleReturnScope nulls_key155 =null;


		try {
			// PLSQLCommons.g:353:5: ( ( respect_key | ignore_key ) nulls_key )
			// PLSQLCommons.g:353:10: ( respect_key | ignore_key ) nulls_key
			{
			root_0 = (Object)adaptor.nil();


			// PLSQLCommons.g:353:10: ( respect_key | ignore_key )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
				int LA56_1 = input.LA(2);
				if ( ((input.LT(1).getText().equalsIgnoreCase("respect"))) ) {
					alt56=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("ignore"))) ) {
					alt56=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			switch (alt56) {
				case 1 :
					// PLSQLCommons.g:353:11: respect_key
					{
					pushFollow(FOLLOW_respect_key_in_respect_or_ignore_nulls2935);
					respect_key153=gPLSQLParser.respect_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, respect_key153.getTree());

					}
					break;
				case 2 :
					// PLSQLCommons.g:353:25: ignore_key
					{
					pushFollow(FOLLOW_ignore_key_in_respect_or_ignore_nulls2939);
					ignore_key154=gPLSQLParser.ignore_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ignore_key154.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_nulls_key_in_respect_or_ignore_nulls2942);
			nulls_key155=gPLSQLParser.nulls_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nulls_key155.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "respect_or_ignore_nulls"


	public static class argument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "argument"
	// PLSQLCommons.g:356:1: argument : ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )? expression_wrapper -> {mode == 1}? ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) ) -> ^( ARGUMENT expression_wrapper ) ;
	public final PLSQLParser_PLSQLCommons.argument_return argument() throws RecognitionException {
		PLSQLParser_PLSQLCommons.argument_return retval = new PLSQLParser_PLSQLCommons.argument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQUALS_OP157=null;
		Token GREATER_THAN_OP158=null;
		ParserRuleReturnScope id156 =null;
		ParserRuleReturnScope expression_wrapper159 =null;

		Object EQUALS_OP157_tree=null;
		Object GREATER_THAN_OP158_tree=null;
		RewriteRuleTokenStream stream_EQUALS_OP=new RewriteRuleTokenStream(adaptor,"token EQUALS_OP");
		RewriteRuleTokenStream stream_GREATER_THAN_OP=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OP");
		RewriteRuleSubtreeStream stream_expression_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule expression_wrapper");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		    int mode = 0;    
		try {
			// PLSQLCommons.g:358:5: ( ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )? expression_wrapper -> {mode == 1}? ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) ) -> ^( ARGUMENT expression_wrapper ) )
			// PLSQLCommons.g:358:10: ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )? expression_wrapper
			{
			// PLSQLCommons.g:358:10: ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )?
			int alt57=2;
			alt57 = dfa57.predict(input);
			switch (alt57) {
				case 1 :
					// PLSQLCommons.g:358:11: ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP
					{
					pushFollow(FOLLOW_id_in_argument2980);
					id156=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id156.getTree());
					EQUALS_OP157=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_argument2982); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS_OP.add(EQUALS_OP157);

					GREATER_THAN_OP158=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_argument2984); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GREATER_THAN_OP.add(GREATER_THAN_OP158);

					if ( state.backtracking==0 ) {mode = 1;}
					}
					break;

			}

			pushFollow(FOLLOW_expression_wrapper_in_argument2990);
			expression_wrapper159=gPLSQLParser.expression_wrapper();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression_wrapper.add(expression_wrapper159.getTree());
			// AST REWRITE
			// elements: expression_wrapper, expression_wrapper, id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 359:9: -> {mode == 1}? ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) )
			if (mode == 1) {
				// PLSQLCommons.g:359:24: ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);
				adaptor.addChild(root_1, stream_expression_wrapper.nextTree());
				// PLSQLCommons.g:359:54: ^( PARAMETER_NAME[$EQUALS_OP] id )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETER_NAME, EQUALS_OP157), root_2);
				adaptor.addChild(root_2, stream_id.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 360:9: -> ^( ARGUMENT expression_wrapper )
			{
				// PLSQLCommons.g:360:12: ^( ARGUMENT expression_wrapper )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);
				adaptor.addChild(root_1, stream_expression_wrapper.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argument"


	public static class type_spec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_spec"
	// PLSQLCommons.g:363:1: type_spec : ( datatype | ( ref_key )? type_name ( percent_rowtype_key | percent_type_key )? -> ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? ) );
	public final PLSQLParser_PLSQLCommons.type_spec_return type_spec() throws RecognitionException {
		PLSQLParser_PLSQLCommons.type_spec_return retval = new PLSQLParser_PLSQLCommons.type_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope datatype160 =null;
		ParserRuleReturnScope ref_key161 =null;
		ParserRuleReturnScope type_name162 =null;
		ParserRuleReturnScope percent_rowtype_key163 =null;
		ParserRuleReturnScope percent_type_key164 =null;

		RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
		RewriteRuleSubtreeStream stream_ref_key=new RewriteRuleSubtreeStream(adaptor,"rule ref_key");
		RewriteRuleSubtreeStream stream_percent_rowtype_key=new RewriteRuleSubtreeStream(adaptor,"rule percent_rowtype_key");
		RewriteRuleSubtreeStream stream_percent_type_key=new RewriteRuleSubtreeStream(adaptor,"rule percent_type_key");

		try {
			// PLSQLCommons.g:364:5: ( datatype | ( ref_key )? type_name ( percent_rowtype_key | percent_type_key )? -> ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? ) )
			int alt60=2;
			switch ( input.LA(1) ) {
			case REGULAR_ID:
				{
				int LA60_1 = input.LA(2);
				if ( (((input.LT(1).getText().equalsIgnoreCase("positiven"))||(input.LT(1).getText().equalsIgnoreCase("hour"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_ltz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("mlslabel"))||(input.LT(1).getText().equalsIgnoreCase("bfile"))||(input.LT(1).getText().equalsIgnoreCase("timezone_minute"))||(input.LT(1).getText().equalsIgnoreCase("urowid"))||(input.LT(1).getText().equalsIgnoreCase("pls_integer"))||(input.LT(1).getText().equalsIgnoreCase("double"))||(input.LT(1).getText().equalsIgnoreCase("varchar"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_tz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("dec"))||(input.LT(1).getText().equalsIgnoreCase("smallint"))||(input.LT(1).getText().equalsIgnoreCase("signtype"))||(input.LT(1).getText().equalsIgnoreCase("character"))||(input.LT(1).getText().equalsIgnoreCase("nvarchar2"))||(input.LT(1).getText().equalsIgnoreCase("decimal"))||(input.LT(1).getText().equalsIgnoreCase("blob"))||(input.LT(1).getText().equalsIgnoreCase("timezone_hour"))||(input.LT(1).getText().equalsIgnoreCase("binary_float"))||(input.LT(1).getText().equalsIgnoreCase("yminterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("integer"))||(input.LT(1).getText().equalsIgnoreCase("nchar"))||(input.LT(1).getText().equalsIgnoreCase("day"))||(input.LT(1).getText().equalsIgnoreCase("varchar2"))||(input.LT(1).getText().equalsIgnoreCase("natural"))||(input.LT(1).getText().equalsIgnoreCase("binary_double"))||(input.LT(1).getText().equalsIgnoreCase("string"))||(input.LT(1).getText().equalsIgnoreCase("real"))||(input.LT(1).getText().equalsIgnoreCase("nclob"))||(input.LT(1).getText().equalsIgnoreCase("timestamp"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("raw"))||(input.LT(1).getText().equalsIgnoreCase("interval"))||(input.LT(1).getText().equalsIgnoreCase("year"))||(input.LT(1).getText().equalsIgnoreCase("rowid"))||(input.LT(1).getText().equalsIgnoreCase("timezone_region"))||(input.LT(1).getText().equalsIgnoreCase("timezone_abbr"))||(input.LT(1).getText().equalsIgnoreCase("simple_integer"))||(input.LT(1).getText().equalsIgnoreCase("int"))||(input.LT(1).getText().equalsIgnoreCase("month"))||(input.LT(1).getText().equalsIgnoreCase("minute"))||(input.LT(1).getText().equalsIgnoreCase("naturaln"))||(input.LT(1).getText().equalsIgnoreCase("dsinterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("char"))||(input.LT(1).getText().equalsIgnoreCase("second"))||(input.LT(1).getText().equalsIgnoreCase("number"))||(input.LT(1).getText().equalsIgnoreCase("float"))||(input.LT(1).getText().equalsIgnoreCase("positive"))||(input.LT(1).getText().equalsIgnoreCase("numeric"))||(input.LT(1).getText().equalsIgnoreCase("boolean"))||(input.LT(1).getText().equalsIgnoreCase("clob"))||(input.LT(1).getText().equalsIgnoreCase("binary_integer"))||(input.LT(1).getText().equalsIgnoreCase("long")))) ) {
					alt60=1;
				}
				else if ( (true) ) {
					alt60=2;
				}

				}
				break;
			case SQL92_RESERVED_DATE:
				{
				alt60=1;
				}
				break;
			case DELIMITED_ID:
				{
				alt60=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// PLSQLCommons.g:364:11: datatype
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datatype_in_type_spec3051);
					datatype160=datatype();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype160.getTree());

					}
					break;
				case 2 :
					// PLSQLCommons.g:365:10: ( ref_key )? type_name ( percent_rowtype_key | percent_type_key )?
					{
					// PLSQLCommons.g:365:10: ( ref_key )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==REGULAR_ID) ) {
						int LA58_1 = input.LA(2);
						if ( (LA58_1==REGULAR_ID) ) {
							int LA58_3 = input.LA(3);
							if ( ((input.LT(1).getText().equalsIgnoreCase("ref"))) ) {
								alt58=1;
							}
						}
						else if ( (LA58_1==DELIMITED_ID) && ((input.LT(1).getText().equalsIgnoreCase("ref")))) {
							alt58=1;
						}
					}
					switch (alt58) {
						case 1 :
							// PLSQLCommons.g:365:10: ref_key
							{
							pushFollow(FOLLOW_ref_key_in_type_spec3062);
							ref_key161=gPLSQLParser.ref_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ref_key.add(ref_key161.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_type_name_in_type_spec3065);
					type_name162=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name162.getTree());
					// PLSQLCommons.g:365:29: ( percent_rowtype_key | percent_type_key )?
					int alt59=3;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==PERCENT) && (((input.LT(2).getText().equalsIgnoreCase("type"))||(input.LT(2).getText().equalsIgnoreCase("rowtype"))))) {
						int LA59_1 = input.LA(2);
						if ( (LA59_1==REGULAR_ID) && (((input.LT(2).getText().equalsIgnoreCase("type"))||(input.LT(2).getText().equalsIgnoreCase("rowtype"))))) {
							int LA59_3 = input.LA(3);
							if ( ((input.LT(2).getText().equalsIgnoreCase("rowtype"))) ) {
								alt59=1;
							}
							else if ( ((input.LT(2).getText().equalsIgnoreCase("type"))) ) {
								alt59=2;
							}
						}
					}
					switch (alt59) {
						case 1 :
							// PLSQLCommons.g:365:30: percent_rowtype_key
							{
							pushFollow(FOLLOW_percent_rowtype_key_in_type_spec3068);
							percent_rowtype_key163=gPLSQLParser.percent_rowtype_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_percent_rowtype_key.add(percent_rowtype_key163.getTree());
							}
							break;
						case 2 :
							// PLSQLCommons.g:365:50: percent_type_key
							{
							pushFollow(FOLLOW_percent_type_key_in_type_spec3070);
							percent_type_key164=gPLSQLParser.percent_type_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_percent_type_key.add(percent_type_key164.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: percent_rowtype_key, type_name, percent_type_key, ref_key
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 365:69: -> ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? )
					{
						// PLSQLCommons.g:365:72: ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CUSTOM_TYPE, "CUSTOM_TYPE"), root_1);
						adaptor.addChild(root_1, stream_type_name.nextTree());
						// PLSQLCommons.g:365:96: ( ref_key )?
						if ( stream_ref_key.hasNext() ) {
							adaptor.addChild(root_1, stream_ref_key.nextTree());
						}
						stream_ref_key.reset();

						// PLSQLCommons.g:365:105: ( percent_rowtype_key )?
						if ( stream_percent_rowtype_key.hasNext() ) {
							adaptor.addChild(root_1, stream_percent_rowtype_key.nextTree());
						}
						stream_percent_rowtype_key.reset();

						// PLSQLCommons.g:365:126: ( percent_type_key )?
						if ( stream_percent_type_key.hasNext() ) {
							adaptor.addChild(root_1, stream_percent_type_key.nextTree());
						}
						stream_percent_type_key.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_spec"


	public static class datatype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "datatype"
	// PLSQLCommons.g:368:1: datatype : ( native_datatype_element ( precision_part )? ( with_key ( local_key )? time_key zone_key )? -> ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? ) | interval_key (i1= year_key |i1= day_key ) ( LEFT_PAREN e1= expression_wrapper RIGHT_PAREN )? to_key (i2= month_key |i2= second_key ) ( LEFT_PAREN e2= expression_wrapper RIGHT_PAREN )? -> ^( INTERVAL_DATATYPE[$interval_key.start] ^( $i1 ( $e1)? ) ^( $i2 ( $e2)? ) ) );
	public final PLSQLParser_PLSQLCommons.datatype_return datatype() throws RecognitionException {
		PLSQLParser_PLSQLCommons.datatype_return retval = new PLSQLParser_PLSQLCommons.datatype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN172=null;
		Token RIGHT_PAREN173=null;
		Token LEFT_PAREN175=null;
		Token RIGHT_PAREN176=null;
		ParserRuleReturnScope i1 =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope i2 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope native_datatype_element165 =null;
		ParserRuleReturnScope precision_part166 =null;
		ParserRuleReturnScope with_key167 =null;
		ParserRuleReturnScope local_key168 =null;
		ParserRuleReturnScope time_key169 =null;
		ParserRuleReturnScope zone_key170 =null;
		ParserRuleReturnScope interval_key171 =null;
		ParserRuleReturnScope to_key174 =null;

		Object LEFT_PAREN172_tree=null;
		Object RIGHT_PAREN173_tree=null;
		Object LEFT_PAREN175_tree=null;
		Object RIGHT_PAREN176_tree=null;
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_to_key=new RewriteRuleSubtreeStream(adaptor,"rule to_key");
		RewriteRuleSubtreeStream stream_year_key=new RewriteRuleSubtreeStream(adaptor,"rule year_key");
		RewriteRuleSubtreeStream stream_local_key=new RewriteRuleSubtreeStream(adaptor,"rule local_key");
		RewriteRuleSubtreeStream stream_month_key=new RewriteRuleSubtreeStream(adaptor,"rule month_key");
		RewriteRuleSubtreeStream stream_precision_part=new RewriteRuleSubtreeStream(adaptor,"rule precision_part");
		RewriteRuleSubtreeStream stream_native_datatype_element=new RewriteRuleSubtreeStream(adaptor,"rule native_datatype_element");
		RewriteRuleSubtreeStream stream_with_key=new RewriteRuleSubtreeStream(adaptor,"rule with_key");
		RewriteRuleSubtreeStream stream_interval_key=new RewriteRuleSubtreeStream(adaptor,"rule interval_key");
		RewriteRuleSubtreeStream stream_day_key=new RewriteRuleSubtreeStream(adaptor,"rule day_key");
		RewriteRuleSubtreeStream stream_zone_key=new RewriteRuleSubtreeStream(adaptor,"rule zone_key");
		RewriteRuleSubtreeStream stream_expression_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule expression_wrapper");
		RewriteRuleSubtreeStream stream_second_key=new RewriteRuleSubtreeStream(adaptor,"rule second_key");
		RewriteRuleSubtreeStream stream_time_key=new RewriteRuleSubtreeStream(adaptor,"rule time_key");

		try {
			// PLSQLCommons.g:369:5: ( native_datatype_element ( precision_part )? ( with_key ( local_key )? time_key zone_key )? -> ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? ) | interval_key (i1= year_key |i1= day_key ) ( LEFT_PAREN e1= expression_wrapper RIGHT_PAREN )? to_key (i2= month_key |i2= second_key ) ( LEFT_PAREN e2= expression_wrapper RIGHT_PAREN )? -> ^( INTERVAL_DATATYPE[$interval_key.start] ^( $i1 ( $e1)? ) ^( $i2 ( $e2)? ) ) )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==REGULAR_ID) ) {
				int LA68_1 = input.LA(2);
				if ( (((input.LT(1).getText().equalsIgnoreCase("positiven"))||(input.LT(1).getText().equalsIgnoreCase("hour"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_ltz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("mlslabel"))||(input.LT(1).getText().equalsIgnoreCase("bfile"))||(input.LT(1).getText().equalsIgnoreCase("timezone_minute"))||(input.LT(1).getText().equalsIgnoreCase("urowid"))||(input.LT(1).getText().equalsIgnoreCase("pls_integer"))||(input.LT(1).getText().equalsIgnoreCase("double"))||(input.LT(1).getText().equalsIgnoreCase("varchar"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_tz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("dec"))||(input.LT(1).getText().equalsIgnoreCase("smallint"))||(input.LT(1).getText().equalsIgnoreCase("signtype"))||(input.LT(1).getText().equalsIgnoreCase("character"))||(input.LT(1).getText().equalsIgnoreCase("nvarchar2"))||(input.LT(1).getText().equalsIgnoreCase("decimal"))||(input.LT(1).getText().equalsIgnoreCase("blob"))||(input.LT(1).getText().equalsIgnoreCase("timezone_hour"))||(input.LT(1).getText().equalsIgnoreCase("binary_float"))||(input.LT(1).getText().equalsIgnoreCase("yminterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("integer"))||(input.LT(1).getText().equalsIgnoreCase("nchar"))||(input.LT(1).getText().equalsIgnoreCase("day"))||(input.LT(1).getText().equalsIgnoreCase("varchar2"))||(input.LT(1).getText().equalsIgnoreCase("natural"))||(input.LT(1).getText().equalsIgnoreCase("binary_double"))||(input.LT(1).getText().equalsIgnoreCase("string"))||(input.LT(1).getText().equalsIgnoreCase("real"))||(input.LT(1).getText().equalsIgnoreCase("nclob"))||(input.LT(1).getText().equalsIgnoreCase("timestamp"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("raw"))||(input.LT(1).getText().equalsIgnoreCase("year"))||(input.LT(1).getText().equalsIgnoreCase("rowid"))||(input.LT(1).getText().equalsIgnoreCase("timezone_region"))||(input.LT(1).getText().equalsIgnoreCase("timezone_abbr"))||(input.LT(1).getText().equalsIgnoreCase("simple_integer"))||(input.LT(1).getText().equalsIgnoreCase("int"))||(input.LT(1).getText().equalsIgnoreCase("month"))||(input.LT(1).getText().equalsIgnoreCase("minute"))||(input.LT(1).getText().equalsIgnoreCase("naturaln"))||(input.LT(1).getText().equalsIgnoreCase("dsinterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("char"))||(input.LT(1).getText().equalsIgnoreCase("second"))||(input.LT(1).getText().equalsIgnoreCase("number"))||(input.LT(1).getText().equalsIgnoreCase("float"))||(input.LT(1).getText().equalsIgnoreCase("positive"))||(input.LT(1).getText().equalsIgnoreCase("numeric"))||(input.LT(1).getText().equalsIgnoreCase("boolean"))||(input.LT(1).getText().equalsIgnoreCase("clob"))||(input.LT(1).getText().equalsIgnoreCase("binary_integer"))||(input.LT(1).getText().equalsIgnoreCase("long")))) ) {
					alt68=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("interval"))) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA68_0==SQL92_RESERVED_DATE) ) {
				alt68=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// PLSQLCommons.g:369:10: native_datatype_element ( precision_part )? ( with_key ( local_key )? time_key zone_key )?
					{
					pushFollow(FOLLOW_native_datatype_element_in_datatype3109);
					native_datatype_element165=native_datatype_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_native_datatype_element.add(native_datatype_element165.getTree());
					// PLSQLCommons.g:370:9: ( precision_part )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( (LA61_0==LEFT_PAREN) ) {
						alt61=1;
					}
					switch (alt61) {
						case 1 :
							// PLSQLCommons.g:370:9: precision_part
							{
							pushFollow(FOLLOW_precision_part_in_datatype3119);
							precision_part166=precision_part();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_precision_part.add(precision_part166.getTree());
							}
							break;

					}

					// PLSQLCommons.g:371:9: ( with_key ( local_key )? time_key zone_key )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==SQL92_RESERVED_WITH) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// PLSQLCommons.g:371:10: with_key ( local_key )? time_key zone_key
							{
							pushFollow(FOLLOW_with_key_in_datatype3131);
							with_key167=gPLSQLParser.with_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_with_key.add(with_key167.getTree());
							// PLSQLCommons.g:371:19: ( local_key )?
							int alt62=2;
							int LA62_0 = input.LA(1);
							if ( (LA62_0==REGULAR_ID) ) {
								int LA62_1 = input.LA(2);
								if ( (LA62_1==REGULAR_ID) ) {
									int LA62_2 = input.LA(3);
									if ( (LA62_2==REGULAR_ID) ) {
										int LA62_4 = input.LA(4);
										if ( ((input.LT(1).getText().equalsIgnoreCase("local"))) ) {
											alt62=1;
										}
									}
								}
							}
							switch (alt62) {
								case 1 :
									// PLSQLCommons.g:371:19: local_key
									{
									pushFollow(FOLLOW_local_key_in_datatype3133);
									local_key168=gPLSQLParser.local_key();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_local_key.add(local_key168.getTree());
									}
									break;

							}

							pushFollow(FOLLOW_time_key_in_datatype3136);
							time_key169=gPLSQLParser.time_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_time_key.add(time_key169.getTree());
							pushFollow(FOLLOW_zone_key_in_datatype3138);
							zone_key170=gPLSQLParser.zone_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_zone_key.add(zone_key170.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: precision_part, local_key, time_key, native_datatype_element
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 372:9: -> ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? )
					{
						// PLSQLCommons.g:372:12: ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NATIVE_DATATYPE, "NATIVE_DATATYPE"), root_1);
						adaptor.addChild(root_1, stream_native_datatype_element.nextTree());
						// PLSQLCommons.g:372:54: ( precision_part )?
						if ( stream_precision_part.hasNext() ) {
							adaptor.addChild(root_1, stream_precision_part.nextTree());
						}
						stream_precision_part.reset();

						// PLSQLCommons.g:372:70: ( time_key )?
						if ( stream_time_key.hasNext() ) {
							adaptor.addChild(root_1, stream_time_key.nextTree());
						}
						stream_time_key.reset();

						// PLSQLCommons.g:372:80: ( local_key )?
						if ( stream_local_key.hasNext() ) {
							adaptor.addChild(root_1, stream_local_key.nextTree());
						}
						stream_local_key.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:373:10: interval_key (i1= year_key |i1= day_key ) ( LEFT_PAREN e1= expression_wrapper RIGHT_PAREN )? to_key (i2= month_key |i2= second_key ) ( LEFT_PAREN e2= expression_wrapper RIGHT_PAREN )?
					{
					pushFollow(FOLLOW_interval_key_in_datatype3176);
					interval_key171=gPLSQLParser.interval_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interval_key.add(interval_key171.getTree());
					// PLSQLCommons.g:373:23: (i1= year_key |i1= day_key )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("year"))||(input.LT(1).getText().equalsIgnoreCase("day"))))) {
						int LA64_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("year"))) ) {
							alt64=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
							alt64=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 64, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					switch (alt64) {
						case 1 :
							// PLSQLCommons.g:373:24: i1= year_key
							{
							pushFollow(FOLLOW_year_key_in_datatype3181);
							i1=gPLSQLParser.year_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_year_key.add(i1.getTree());
							}
							break;
						case 2 :
							// PLSQLCommons.g:373:36: i1= day_key
							{
							pushFollow(FOLLOW_day_key_in_datatype3185);
							i1=gPLSQLParser.day_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_day_key.add(i1.getTree());
							}
							break;

					}

					// PLSQLCommons.g:374:17: ( LEFT_PAREN e1= expression_wrapper RIGHT_PAREN )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==LEFT_PAREN) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// PLSQLCommons.g:374:18: LEFT_PAREN e1= expression_wrapper RIGHT_PAREN
							{
							LEFT_PAREN172=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_datatype3205); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN172);

							pushFollow(FOLLOW_expression_wrapper_in_datatype3209);
							e1=gPLSQLParser.expression_wrapper();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression_wrapper.add(e1.getTree());
							RIGHT_PAREN173=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_datatype3211); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN173);

							}
							break;

					}

					pushFollow(FOLLOW_to_key_in_datatype3228);
					to_key174=gPLSQLParser.to_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_to_key.add(to_key174.getTree());
					// PLSQLCommons.g:375:20: (i2= month_key |i2= second_key )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==REGULAR_ID) ) {
						int LA66_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("month"))) ) {
							alt66=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
							alt66=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 66, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// PLSQLCommons.g:375:21: i2= month_key
							{
							pushFollow(FOLLOW_month_key_in_datatype3233);
							i2=gPLSQLParser.month_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_month_key.add(i2.getTree());
							}
							break;
						case 2 :
							// PLSQLCommons.g:375:34: i2= second_key
							{
							pushFollow(FOLLOW_second_key_in_datatype3237);
							i2=gPLSQLParser.second_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_second_key.add(i2.getTree());
							}
							break;

					}

					// PLSQLCommons.g:376:17: ( LEFT_PAREN e2= expression_wrapper RIGHT_PAREN )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==LEFT_PAREN) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// PLSQLCommons.g:376:18: LEFT_PAREN e2= expression_wrapper RIGHT_PAREN
							{
							LEFT_PAREN175=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_datatype3258); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN175);

							pushFollow(FOLLOW_expression_wrapper_in_datatype3262);
							e2=gPLSQLParser.expression_wrapper();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression_wrapper.add(e2.getTree());
							RIGHT_PAREN176=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_datatype3264); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN176);

							}
							break;

					}

					// AST REWRITE
					// elements: e1, e2, i1, i2
					// token labels: 
					// rule labels: i1, i2, e1, e2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_i1=new RewriteRuleSubtreeStream(adaptor,"rule i1",i1!=null?i1.getTree():null);
					RewriteRuleSubtreeStream stream_i2=new RewriteRuleSubtreeStream(adaptor,"rule i2",i2!=null?i2.getTree():null);
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 377:9: -> ^( INTERVAL_DATATYPE[$interval_key.start] ^( $i1 ( $e1)? ) ^( $i2 ( $e2)? ) )
					{
						// PLSQLCommons.g:377:12: ^( INTERVAL_DATATYPE[$interval_key.start] ^( $i1 ( $e1)? ) ^( $i2 ( $e2)? ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INTERVAL_DATATYPE, (interval_key171!=null?(interval_key171.start):null)), root_1);
						// PLSQLCommons.g:377:53: ^( $i1 ( $e1)? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot(stream_i1.nextNode(), root_2);
						// PLSQLCommons.g:377:60: ( $e1)?
						if ( stream_e1.hasNext() ) {
							adaptor.addChild(root_2, stream_e1.nextTree());
						}
						stream_e1.reset();

						adaptor.addChild(root_1, root_2);
						}

						// PLSQLCommons.g:377:65: ^( $i2 ( $e2)? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot(stream_i2.nextNode(), root_2);
						// PLSQLCommons.g:377:72: ( $e2)?
						if ( stream_e2.hasNext() ) {
							adaptor.addChild(root_2, stream_e2.nextTree());
						}
						stream_e2.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "datatype"


	public static class precision_part_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "precision_part"
	// PLSQLCommons.g:380:1: precision_part : LEFT_PAREN numeric ( COMMA numeric )? ( char_key | byte_key )? RIGHT_PAREN -> ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? ) ;
	public final PLSQLParser_PLSQLCommons.precision_part_return precision_part() throws RecognitionException {
		PLSQLParser_PLSQLCommons.precision_part_return retval = new PLSQLParser_PLSQLCommons.precision_part_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN177=null;
		Token COMMA179=null;
		Token RIGHT_PAREN183=null;
		ParserRuleReturnScope numeric178 =null;
		ParserRuleReturnScope numeric180 =null;
		ParserRuleReturnScope char_key181 =null;
		ParserRuleReturnScope byte_key182 =null;

		Object LEFT_PAREN177_tree=null;
		Object COMMA179_tree=null;
		Object RIGHT_PAREN183_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
		RewriteRuleSubtreeStream stream_char_key=new RewriteRuleSubtreeStream(adaptor,"rule char_key");
		RewriteRuleSubtreeStream stream_numeric=new RewriteRuleSubtreeStream(adaptor,"rule numeric");
		RewriteRuleSubtreeStream stream_byte_key=new RewriteRuleSubtreeStream(adaptor,"rule byte_key");

		try {
			// PLSQLCommons.g:381:5: ( LEFT_PAREN numeric ( COMMA numeric )? ( char_key | byte_key )? RIGHT_PAREN -> ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? ) )
			// PLSQLCommons.g:381:10: LEFT_PAREN numeric ( COMMA numeric )? ( char_key | byte_key )? RIGHT_PAREN
			{
			LEFT_PAREN177=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_part3319); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN177);

			pushFollow(FOLLOW_numeric_in_precision_part3321);
			numeric178=numeric();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_numeric.add(numeric178.getTree());
			// PLSQLCommons.g:381:29: ( COMMA numeric )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==COMMA) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// PLSQLCommons.g:381:30: COMMA numeric
					{
					COMMA179=(Token)match(input,COMMA,FOLLOW_COMMA_in_precision_part3324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA179);

					pushFollow(FOLLOW_numeric_in_precision_part3326);
					numeric180=numeric();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric.add(numeric180.getTree());
					}
					break;

			}

			// PLSQLCommons.g:381:46: ( char_key | byte_key )?
			int alt70=3;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("char"))||(input.LT(1).getText().equalsIgnoreCase("byte"))))) {
				int LA70_1 = input.LA(2);
				if ( ((input.LT(1).getText().equalsIgnoreCase("char"))) ) {
					alt70=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("byte"))) ) {
					alt70=2;
				}
			}
			switch (alt70) {
				case 1 :
					// PLSQLCommons.g:381:47: char_key
					{
					pushFollow(FOLLOW_char_key_in_precision_part3331);
					char_key181=gPLSQLParser.char_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_char_key.add(char_key181.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:381:58: byte_key
					{
					pushFollow(FOLLOW_byte_key_in_precision_part3335);
					byte_key182=gPLSQLParser.byte_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_byte_key.add(byte_key182.getTree());
					}
					break;

			}

			RIGHT_PAREN183=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_part3339); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN183);

			// AST REWRITE
			// elements: char_key, byte_key, numeric
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 382:9: -> ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? )
			{
				// PLSQLCommons.g:382:12: ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECISION, "PRECISION"), root_1);
				if ( !(stream_numeric.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_numeric.hasNext() ) {
					adaptor.addChild(root_1, stream_numeric.nextTree());
				}
				stream_numeric.reset();

				// PLSQLCommons.g:382:33: ( char_key )?
				if ( stream_char_key.hasNext() ) {
					adaptor.addChild(root_1, stream_char_key.nextTree());
				}
				stream_char_key.reset();

				// PLSQLCommons.g:382:43: ( byte_key )?
				if ( stream_byte_key.hasNext() ) {
					adaptor.addChild(root_1, stream_byte_key.nextTree());
				}
				stream_byte_key.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "precision_part"


	public static class native_datatype_element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "native_datatype_element"
	// PLSQLCommons.g:385:1: native_datatype_element : ( binary_integer_key | pls_integer_key | natural_key | binary_float_key | binary_double_key | naturaln_key | positive_key | positiven_key | signtype_key | simple_integer_key | nvarchar2_key | dec_key | integer_key | int_key | numeric_key | smallint_key | number_key | decimal_key | double_key ( precision_key !)? | float_key | real_key | nchar_key | long_key | long_key raw_key -> ^( LONG_RAW[$long_key.start, \"LONG_RAW\"] ) | char_key | character_key | varchar2_key | varchar_key | string_key | raw_key | boolean_key | date_key | rowid_key | urowid_key | year_key | month_key | day_key | hour_key | minute_key | second_key | timezone_hour_key | timezone_minute_key | timezone_region_key | timezone_abbr_key | timestamp_key | timestamp_unconstrained_key | timestamp_tz_unconstrained_key | timestamp_ltz_unconstrained_key | yminterval_unconstrained_key | dsinterval_unconstrained_key | bfile_key | blob_key | clob_key | nclob_key | mlslabel_key );
	public final PLSQLParser_PLSQLCommons.native_datatype_element_return native_datatype_element() throws RecognitionException {
		PLSQLParser_PLSQLCommons.native_datatype_element_return retval = new PLSQLParser_PLSQLCommons.native_datatype_element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope binary_integer_key184 =null;
		ParserRuleReturnScope pls_integer_key185 =null;
		ParserRuleReturnScope natural_key186 =null;
		ParserRuleReturnScope binary_float_key187 =null;
		ParserRuleReturnScope binary_double_key188 =null;
		ParserRuleReturnScope naturaln_key189 =null;
		ParserRuleReturnScope positive_key190 =null;
		ParserRuleReturnScope positiven_key191 =null;
		ParserRuleReturnScope signtype_key192 =null;
		ParserRuleReturnScope simple_integer_key193 =null;
		ParserRuleReturnScope nvarchar2_key194 =null;
		ParserRuleReturnScope dec_key195 =null;
		ParserRuleReturnScope integer_key196 =null;
		ParserRuleReturnScope int_key197 =null;
		ParserRuleReturnScope numeric_key198 =null;
		ParserRuleReturnScope smallint_key199 =null;
		ParserRuleReturnScope number_key200 =null;
		ParserRuleReturnScope decimal_key201 =null;
		ParserRuleReturnScope double_key202 =null;
		ParserRuleReturnScope precision_key203 =null;
		ParserRuleReturnScope float_key204 =null;
		ParserRuleReturnScope real_key205 =null;
		ParserRuleReturnScope nchar_key206 =null;
		ParserRuleReturnScope long_key207 =null;
		ParserRuleReturnScope long_key208 =null;
		ParserRuleReturnScope raw_key209 =null;
		ParserRuleReturnScope char_key210 =null;
		ParserRuleReturnScope character_key211 =null;
		ParserRuleReturnScope varchar2_key212 =null;
		ParserRuleReturnScope varchar_key213 =null;
		ParserRuleReturnScope string_key214 =null;
		ParserRuleReturnScope raw_key215 =null;
		ParserRuleReturnScope boolean_key216 =null;
		ParserRuleReturnScope date_key217 =null;
		ParserRuleReturnScope rowid_key218 =null;
		ParserRuleReturnScope urowid_key219 =null;
		ParserRuleReturnScope year_key220 =null;
		ParserRuleReturnScope month_key221 =null;
		ParserRuleReturnScope day_key222 =null;
		ParserRuleReturnScope hour_key223 =null;
		ParserRuleReturnScope minute_key224 =null;
		ParserRuleReturnScope second_key225 =null;
		ParserRuleReturnScope timezone_hour_key226 =null;
		ParserRuleReturnScope timezone_minute_key227 =null;
		ParserRuleReturnScope timezone_region_key228 =null;
		ParserRuleReturnScope timezone_abbr_key229 =null;
		ParserRuleReturnScope timestamp_key230 =null;
		ParserRuleReturnScope timestamp_unconstrained_key231 =null;
		ParserRuleReturnScope timestamp_tz_unconstrained_key232 =null;
		ParserRuleReturnScope timestamp_ltz_unconstrained_key233 =null;
		ParserRuleReturnScope yminterval_unconstrained_key234 =null;
		ParserRuleReturnScope dsinterval_unconstrained_key235 =null;
		ParserRuleReturnScope bfile_key236 =null;
		ParserRuleReturnScope blob_key237 =null;
		ParserRuleReturnScope clob_key238 =null;
		ParserRuleReturnScope nclob_key239 =null;
		ParserRuleReturnScope mlslabel_key240 =null;

		RewriteRuleSubtreeStream stream_long_key=new RewriteRuleSubtreeStream(adaptor,"rule long_key");
		RewriteRuleSubtreeStream stream_raw_key=new RewriteRuleSubtreeStream(adaptor,"rule raw_key");

		try {
			// PLSQLCommons.g:386:5: ( binary_integer_key | pls_integer_key | natural_key | binary_float_key | binary_double_key | naturaln_key | positive_key | positiven_key | signtype_key | simple_integer_key | nvarchar2_key | dec_key | integer_key | int_key | numeric_key | smallint_key | number_key | decimal_key | double_key ( precision_key !)? | float_key | real_key | nchar_key | long_key | long_key raw_key -> ^( LONG_RAW[$long_key.start, \"LONG_RAW\"] ) | char_key | character_key | varchar2_key | varchar_key | string_key | raw_key | boolean_key | date_key | rowid_key | urowid_key | year_key | month_key | day_key | hour_key | minute_key | second_key | timezone_hour_key | timezone_minute_key | timezone_region_key | timezone_abbr_key | timestamp_key | timestamp_unconstrained_key | timestamp_tz_unconstrained_key | timestamp_ltz_unconstrained_key | yminterval_unconstrained_key | dsinterval_unconstrained_key | bfile_key | blob_key | clob_key | nclob_key | mlslabel_key )
			int alt72=55;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==REGULAR_ID) ) {
				int LA72_1 = input.LA(2);
				if ( (LA72_1==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("long")))) {
					alt72=24;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("binary_integer"))) ) {
					alt72=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("pls_integer"))) ) {
					alt72=2;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("natural"))) ) {
					alt72=3;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("binary_float"))) ) {
					alt72=4;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("binary_double"))) ) {
					alt72=5;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("naturaln"))) ) {
					alt72=6;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("positive"))) ) {
					alt72=7;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("positiven"))) ) {
					alt72=8;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("signtype"))) ) {
					alt72=9;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("simple_integer"))) ) {
					alt72=10;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("nvarchar2"))) ) {
					alt72=11;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("dec"))) ) {
					alt72=12;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("integer"))) ) {
					alt72=13;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("int"))) ) {
					alt72=14;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("numeric"))) ) {
					alt72=15;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("smallint"))) ) {
					alt72=16;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("number"))) ) {
					alt72=17;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("decimal"))) ) {
					alt72=18;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("double"))) ) {
					alt72=19;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("float"))) ) {
					alt72=20;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("real"))) ) {
					alt72=21;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("nchar"))) ) {
					alt72=22;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("long"))) ) {
					alt72=23;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("char"))) ) {
					alt72=25;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("character"))) ) {
					alt72=26;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("varchar2"))) ) {
					alt72=27;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("varchar"))) ) {
					alt72=28;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("string"))) ) {
					alt72=29;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("raw"))) ) {
					alt72=30;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("boolean"))) ) {
					alt72=31;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("rowid"))) ) {
					alt72=33;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("urowid"))) ) {
					alt72=34;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("year"))) ) {
					alt72=35;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("month"))) ) {
					alt72=36;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
					alt72=37;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("hour"))) ) {
					alt72=38;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("minute"))) ) {
					alt72=39;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
					alt72=40;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_hour"))) ) {
					alt72=41;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_minute"))) ) {
					alt72=42;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_region"))) ) {
					alt72=43;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_abbr"))) ) {
					alt72=44;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp"))) ) {
					alt72=45;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp_unconstrained"))) ) {
					alt72=46;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp_tz_unconstrained"))) ) {
					alt72=47;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp_ltz_unconstrained"))) ) {
					alt72=48;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("yminterval_unconstrained"))) ) {
					alt72=49;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("dsinterval_unconstrained"))) ) {
					alt72=50;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("bfile"))) ) {
					alt72=51;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("blob"))) ) {
					alt72=52;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("clob"))) ) {
					alt72=53;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("nclob"))) ) {
					alt72=54;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("mlslabel"))) ) {
					alt72=55;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA72_0==SQL92_RESERVED_DATE) ) {
				alt72=32;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// PLSQLCommons.g:386:10: binary_integer_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_binary_integer_key_in_native_datatype_element3382);
					binary_integer_key184=gPLSQLParser.binary_integer_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_integer_key184.getTree());

					}
					break;
				case 2 :
					// PLSQLCommons.g:387:10: pls_integer_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pls_integer_key_in_native_datatype_element3393);
					pls_integer_key185=gPLSQLParser.pls_integer_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pls_integer_key185.getTree());

					}
					break;
				case 3 :
					// PLSQLCommons.g:388:10: natural_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_natural_key_in_native_datatype_element3404);
					natural_key186=gPLSQLParser.natural_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_key186.getTree());

					}
					break;
				case 4 :
					// PLSQLCommons.g:389:10: binary_float_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_binary_float_key_in_native_datatype_element3415);
					binary_float_key187=gPLSQLParser.binary_float_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_float_key187.getTree());

					}
					break;
				case 5 :
					// PLSQLCommons.g:390:10: binary_double_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_binary_double_key_in_native_datatype_element3426);
					binary_double_key188=gPLSQLParser.binary_double_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_double_key188.getTree());

					}
					break;
				case 6 :
					// PLSQLCommons.g:391:10: naturaln_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_naturaln_key_in_native_datatype_element3437);
					naturaln_key189=gPLSQLParser.naturaln_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, naturaln_key189.getTree());

					}
					break;
				case 7 :
					// PLSQLCommons.g:392:10: positive_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_positive_key_in_native_datatype_element3448);
					positive_key190=gPLSQLParser.positive_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, positive_key190.getTree());

					}
					break;
				case 8 :
					// PLSQLCommons.g:393:10: positiven_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_positiven_key_in_native_datatype_element3459);
					positiven_key191=gPLSQLParser.positiven_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, positiven_key191.getTree());

					}
					break;
				case 9 :
					// PLSQLCommons.g:394:10: signtype_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_signtype_key_in_native_datatype_element3470);
					signtype_key192=gPLSQLParser.signtype_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, signtype_key192.getTree());

					}
					break;
				case 10 :
					// PLSQLCommons.g:395:10: simple_integer_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_integer_key_in_native_datatype_element3481);
					simple_integer_key193=gPLSQLParser.simple_integer_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_integer_key193.getTree());

					}
					break;
				case 11 :
					// PLSQLCommons.g:396:10: nvarchar2_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nvarchar2_key_in_native_datatype_element3492);
					nvarchar2_key194=gPLSQLParser.nvarchar2_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nvarchar2_key194.getTree());

					}
					break;
				case 12 :
					// PLSQLCommons.g:397:10: dec_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_dec_key_in_native_datatype_element3503);
					dec_key195=gPLSQLParser.dec_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dec_key195.getTree());

					}
					break;
				case 13 :
					// PLSQLCommons.g:398:10: integer_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integer_key_in_native_datatype_element3514);
					integer_key196=gPLSQLParser.integer_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, integer_key196.getTree());

					}
					break;
				case 14 :
					// PLSQLCommons.g:399:10: int_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_int_key_in_native_datatype_element3525);
					int_key197=gPLSQLParser.int_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int_key197.getTree());

					}
					break;
				case 15 :
					// PLSQLCommons.g:400:10: numeric_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numeric_key_in_native_datatype_element3536);
					numeric_key198=gPLSQLParser.numeric_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_key198.getTree());

					}
					break;
				case 16 :
					// PLSQLCommons.g:401:10: smallint_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_smallint_key_in_native_datatype_element3547);
					smallint_key199=gPLSQLParser.smallint_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, smallint_key199.getTree());

					}
					break;
				case 17 :
					// PLSQLCommons.g:402:10: number_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_key_in_native_datatype_element3558);
					number_key200=gPLSQLParser.number_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number_key200.getTree());

					}
					break;
				case 18 :
					// PLSQLCommons.g:403:10: decimal_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decimal_key_in_native_datatype_element3569);
					decimal_key201=gPLSQLParser.decimal_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decimal_key201.getTree());

					}
					break;
				case 19 :
					// PLSQLCommons.g:404:10: double_key ( precision_key !)?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_double_key_in_native_datatype_element3581);
					double_key202=gPLSQLParser.double_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, double_key202.getTree());

					// PLSQLCommons.g:404:34: ( precision_key !)?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==REGULAR_ID) ) {
						int LA71_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("precision"))) ) {
							alt71=1;
						}
					}
					switch (alt71) {
						case 1 :
							// PLSQLCommons.g:404:34: precision_key !
							{
							pushFollow(FOLLOW_precision_key_in_native_datatype_element3583);
							precision_key203=gPLSQLParser.precision_key();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 20 :
					// PLSQLCommons.g:405:10: float_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_float_key_in_native_datatype_element3596);
					float_key204=gPLSQLParser.float_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, float_key204.getTree());

					}
					break;
				case 21 :
					// PLSQLCommons.g:406:10: real_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_real_key_in_native_datatype_element3607);
					real_key205=gPLSQLParser.real_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, real_key205.getTree());

					}
					break;
				case 22 :
					// PLSQLCommons.g:407:10: nchar_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nchar_key_in_native_datatype_element3618);
					nchar_key206=gPLSQLParser.nchar_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nchar_key206.getTree());

					}
					break;
				case 23 :
					// PLSQLCommons.g:408:10: long_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_long_key_in_native_datatype_element3629);
					long_key207=gPLSQLParser.long_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, long_key207.getTree());

					}
					break;
				case 24 :
					// PLSQLCommons.g:409:10: long_key raw_key
					{
					pushFollow(FOLLOW_long_key_in_native_datatype_element3640);
					long_key208=gPLSQLParser.long_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_long_key.add(long_key208.getTree());
					pushFollow(FOLLOW_raw_key_in_native_datatype_element3642);
					raw_key209=gPLSQLParser.raw_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_raw_key.add(raw_key209.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 409:27: -> ^( LONG_RAW[$long_key.start, \"LONG_RAW\"] )
					{
						// PLSQLCommons.g:409:30: ^( LONG_RAW[$long_key.start, \"LONG_RAW\"] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LONG_RAW, (long_key208!=null?(long_key208.start):null), "LONG_RAW"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 25 :
					// PLSQLCommons.g:410:10: char_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_char_key_in_native_datatype_element3660);
					char_key210=gPLSQLParser.char_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, char_key210.getTree());

					}
					break;
				case 26 :
					// PLSQLCommons.g:411:10: character_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_character_key_in_native_datatype_element3673);
					character_key211=gPLSQLParser.character_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, character_key211.getTree());

					}
					break;
				case 27 :
					// PLSQLCommons.g:412:10: varchar2_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_varchar2_key_in_native_datatype_element3685);
					varchar2_key212=gPLSQLParser.varchar2_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar2_key212.getTree());

					}
					break;
				case 28 :
					// PLSQLCommons.g:413:10: varchar_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_varchar_key_in_native_datatype_element3696);
					varchar_key213=gPLSQLParser.varchar_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar_key213.getTree());

					}
					break;
				case 29 :
					// PLSQLCommons.g:414:10: string_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_key_in_native_datatype_element3707);
					string_key214=gPLSQLParser.string_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_key214.getTree());

					}
					break;
				case 30 :
					// PLSQLCommons.g:415:10: raw_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_raw_key_in_native_datatype_element3718);
					raw_key215=gPLSQLParser.raw_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, raw_key215.getTree());

					}
					break;
				case 31 :
					// PLSQLCommons.g:416:10: boolean_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_key_in_native_datatype_element3729);
					boolean_key216=gPLSQLParser.boolean_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_key216.getTree());

					}
					break;
				case 32 :
					// PLSQLCommons.g:417:10: date_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_key_in_native_datatype_element3740);
					date_key217=gPLSQLParser.date_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_key217.getTree());

					}
					break;
				case 33 :
					// PLSQLCommons.g:418:10: rowid_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_rowid_key_in_native_datatype_element3751);
					rowid_key218=gPLSQLParser.rowid_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rowid_key218.getTree());

					}
					break;
				case 34 :
					// PLSQLCommons.g:419:10: urowid_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_urowid_key_in_native_datatype_element3762);
					urowid_key219=gPLSQLParser.urowid_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, urowid_key219.getTree());

					}
					break;
				case 35 :
					// PLSQLCommons.g:420:10: year_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_year_key_in_native_datatype_element3773);
					year_key220=gPLSQLParser.year_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, year_key220.getTree());

					}
					break;
				case 36 :
					// PLSQLCommons.g:421:10: month_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_month_key_in_native_datatype_element3784);
					month_key221=gPLSQLParser.month_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, month_key221.getTree());

					}
					break;
				case 37 :
					// PLSQLCommons.g:422:10: day_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_day_key_in_native_datatype_element3795);
					day_key222=gPLSQLParser.day_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, day_key222.getTree());

					}
					break;
				case 38 :
					// PLSQLCommons.g:423:10: hour_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hour_key_in_native_datatype_element3806);
					hour_key223=gPLSQLParser.hour_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, hour_key223.getTree());

					}
					break;
				case 39 :
					// PLSQLCommons.g:424:10: minute_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_minute_key_in_native_datatype_element3817);
					minute_key224=gPLSQLParser.minute_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, minute_key224.getTree());

					}
					break;
				case 40 :
					// PLSQLCommons.g:425:10: second_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_second_key_in_native_datatype_element3828);
					second_key225=gPLSQLParser.second_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, second_key225.getTree());

					}
					break;
				case 41 :
					// PLSQLCommons.g:426:10: timezone_hour_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timezone_hour_key_in_native_datatype_element3839);
					timezone_hour_key226=gPLSQLParser.timezone_hour_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_hour_key226.getTree());

					}
					break;
				case 42 :
					// PLSQLCommons.g:427:10: timezone_minute_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timezone_minute_key_in_native_datatype_element3850);
					timezone_minute_key227=gPLSQLParser.timezone_minute_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_minute_key227.getTree());

					}
					break;
				case 43 :
					// PLSQLCommons.g:428:10: timezone_region_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timezone_region_key_in_native_datatype_element3861);
					timezone_region_key228=gPLSQLParser.timezone_region_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_region_key228.getTree());

					}
					break;
				case 44 :
					// PLSQLCommons.g:429:10: timezone_abbr_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timezone_abbr_key_in_native_datatype_element3872);
					timezone_abbr_key229=gPLSQLParser.timezone_abbr_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_abbr_key229.getTree());

					}
					break;
				case 45 :
					// PLSQLCommons.g:430:10: timestamp_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timestamp_key_in_native_datatype_element3883);
					timestamp_key230=gPLSQLParser.timestamp_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_key230.getTree());

					}
					break;
				case 46 :
					// PLSQLCommons.g:431:10: timestamp_unconstrained_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timestamp_unconstrained_key_in_native_datatype_element3894);
					timestamp_unconstrained_key231=gPLSQLParser.timestamp_unconstrained_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_unconstrained_key231.getTree());

					}
					break;
				case 47 :
					// PLSQLCommons.g:432:10: timestamp_tz_unconstrained_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timestamp_tz_unconstrained_key_in_native_datatype_element3905);
					timestamp_tz_unconstrained_key232=gPLSQLParser.timestamp_tz_unconstrained_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_tz_unconstrained_key232.getTree());

					}
					break;
				case 48 :
					// PLSQLCommons.g:433:10: timestamp_ltz_unconstrained_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timestamp_ltz_unconstrained_key_in_native_datatype_element3916);
					timestamp_ltz_unconstrained_key233=gPLSQLParser.timestamp_ltz_unconstrained_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_ltz_unconstrained_key233.getTree());

					}
					break;
				case 49 :
					// PLSQLCommons.g:434:10: yminterval_unconstrained_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_yminterval_unconstrained_key_in_native_datatype_element3927);
					yminterval_unconstrained_key234=gPLSQLParser.yminterval_unconstrained_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, yminterval_unconstrained_key234.getTree());

					}
					break;
				case 50 :
					// PLSQLCommons.g:435:10: dsinterval_unconstrained_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_dsinterval_unconstrained_key_in_native_datatype_element3938);
					dsinterval_unconstrained_key235=gPLSQLParser.dsinterval_unconstrained_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dsinterval_unconstrained_key235.getTree());

					}
					break;
				case 51 :
					// PLSQLCommons.g:436:10: bfile_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bfile_key_in_native_datatype_element3949);
					bfile_key236=gPLSQLParser.bfile_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bfile_key236.getTree());

					}
					break;
				case 52 :
					// PLSQLCommons.g:437:10: blob_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_blob_key_in_native_datatype_element3960);
					blob_key237=gPLSQLParser.blob_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, blob_key237.getTree());

					}
					break;
				case 53 :
					// PLSQLCommons.g:438:10: clob_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_clob_key_in_native_datatype_element3971);
					clob_key238=gPLSQLParser.clob_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, clob_key238.getTree());

					}
					break;
				case 54 :
					// PLSQLCommons.g:439:10: nclob_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nclob_key_in_native_datatype_element3982);
					nclob_key239=gPLSQLParser.nclob_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nclob_key239.getTree());

					}
					break;
				case 55 :
					// PLSQLCommons.g:440:10: mlslabel_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mlslabel_key_in_native_datatype_element3993);
					mlslabel_key240=gPLSQLParser.mlslabel_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mlslabel_key240.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "native_datatype_element"


	public static class bind_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bind_variable"
	// PLSQLCommons.g:443:1: bind_variable : (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER ) ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )? ( ( PERIOD general_element_id )=> PERIOD general_element_id )* -> ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_id )* ) ;
	public final PLSQLParser_PLSQLCommons.bind_variable_return bind_variable() throws RecognitionException {
		PLSQLParser_PLSQLCommons.bind_variable_return retval = new PLSQLParser_PLSQLCommons.bind_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token b1=null;
		Token u1=null;
		Token b2=null;
		Token u2=null;
		Token COLON241=null;
		Token COLON243=null;
		Token PERIOD244=null;
		ParserRuleReturnScope indicator_key242 =null;
		ParserRuleReturnScope general_element_id245 =null;

		Object b1_tree=null;
		Object u1_tree=null;
		Object b2_tree=null;
		Object u2_tree=null;
		Object COLON241_tree=null;
		Object COLON243_tree=null;
		Object PERIOD244_tree=null;
		RewriteRuleTokenStream stream_BINDVAR=new RewriteRuleTokenStream(adaptor,"token BINDVAR");
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_UNSIGNED_INTEGER=new RewriteRuleTokenStream(adaptor,"token UNSIGNED_INTEGER");
		RewriteRuleSubtreeStream stream_general_element_id=new RewriteRuleSubtreeStream(adaptor,"rule general_element_id");
		RewriteRuleSubtreeStream stream_indicator_key=new RewriteRuleSubtreeStream(adaptor,"rule indicator_key");

		try {
			// PLSQLCommons.g:444:5: ( (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER ) ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )? ( ( PERIOD general_element_id )=> PERIOD general_element_id )* -> ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_id )* ) )
			// PLSQLCommons.g:444:10: (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER ) ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )? ( ( PERIOD general_element_id )=> PERIOD general_element_id )*
			{
			// PLSQLCommons.g:444:10: (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==BINDVAR) ) {
				alt73=1;
			}
			else if ( (LA73_0==COLON) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// PLSQLCommons.g:444:12: b1= BINDVAR
					{
					b1=(Token)match(input,BINDVAR,FOLLOW_BINDVAR_in_bind_variable4017); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BINDVAR.add(b1);

					}
					break;
				case 2 :
					// PLSQLCommons.g:444:25: COLON u1= UNSIGNED_INTEGER
					{
					COLON241=(Token)match(input,COLON,FOLLOW_COLON_in_bind_variable4021); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON.add(COLON241);

					u1=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_bind_variable4025); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UNSIGNED_INTEGER.add(u1);

					}
					break;

			}

			// PLSQLCommons.g:445:10: ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==REGULAR_ID) ) {
				int LA76_1 = input.LA(2);
				if ( (LA76_1==BINDVAR) ) {
					int LA76_4 = input.LA(3);
					if ( ((input.LT(1).getText().equalsIgnoreCase("indicator"))) ) {
						alt76=1;
					}
				}
				else if ( (LA76_1==COLON) ) {
					int LA76_5 = input.LA(3);
					if ( (LA76_5==UNSIGNED_INTEGER) ) {
						int LA76_11 = input.LA(4);
						if ( ((input.LT(1).getText().equalsIgnoreCase("indicator"))) ) {
							alt76=1;
						}
					}
				}
			}
			else if ( (LA76_0==BINDVAR||LA76_0==COLON) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// PLSQLCommons.g:445:12: ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER )
					{
					// PLSQLCommons.g:445:12: ( indicator_key )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==REGULAR_ID) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// PLSQLCommons.g:445:12: indicator_key
							{
							pushFollow(FOLLOW_indicator_key_in_bind_variable4039);
							indicator_key242=gPLSQLParser.indicator_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indicator_key.add(indicator_key242.getTree());
							}
							break;

					}

					// PLSQLCommons.g:445:27: (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER )
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==BINDVAR) ) {
						alt75=1;
					}
					else if ( (LA75_0==COLON) ) {
						alt75=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 75, 0, input);
						throw nvae;
					}

					switch (alt75) {
						case 1 :
							// PLSQLCommons.g:445:28: b2= BINDVAR
							{
							b2=(Token)match(input,BINDVAR,FOLLOW_BINDVAR_in_bind_variable4045); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_BINDVAR.add(b2);

							}
							break;
						case 2 :
							// PLSQLCommons.g:445:41: COLON u2= UNSIGNED_INTEGER
							{
							COLON243=(Token)match(input,COLON,FOLLOW_COLON_in_bind_variable4049); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(COLON243);

							u2=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_bind_variable4053); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_UNSIGNED_INTEGER.add(u2);

							}
							break;

					}

					}
					break;

			}

			// PLSQLCommons.g:446:10: ( ( PERIOD general_element_id )=> PERIOD general_element_id )*
			loop77:
			while (true) {
				int alt77=2;
				alt77 = dfa77.predict(input);
				switch (alt77) {
				case 1 :
					// PLSQLCommons.g:446:11: ( PERIOD general_element_id )=> PERIOD general_element_id
					{
					PERIOD244=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_bind_variable4075); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD244);

					pushFollow(FOLLOW_general_element_id_in_bind_variable4077);
					general_element_id245=general_element_id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_general_element_id.add(general_element_id245.getTree());
					}
					break;

				default :
					break loop77;
				}
			}

			// AST REWRITE
			// elements: indicator_key, u1, u2, b1, b2, general_element_id
			// token labels: b2, u1, u2, b1
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_b2=new RewriteRuleTokenStream(adaptor,"token b2",b2);
			RewriteRuleTokenStream stream_u1=new RewriteRuleTokenStream(adaptor,"token u1",u1);
			RewriteRuleTokenStream stream_u2=new RewriteRuleTokenStream(adaptor,"token u2",u2);
			RewriteRuleTokenStream stream_b1=new RewriteRuleTokenStream(adaptor,"token b1",b1);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 447:10: -> ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_id )* )
			{
				// PLSQLCommons.g:447:12: ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_id )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOSTED_VARIABLE_NAME, "HOSTED_VARIABLE_NAME"), root_1);
				// PLSQLCommons.g:447:36: ( $b1)?
				if ( stream_b1.hasNext() ) {
					adaptor.addChild(root_1, stream_b1.nextNode());
				}
				stream_b1.reset();

				// PLSQLCommons.g:447:41: ( $u1)?
				if ( stream_u1.hasNext() ) {
					adaptor.addChild(root_1, stream_u1.nextNode());
				}
				stream_u1.reset();

				// PLSQLCommons.g:447:45: ( indicator_key )?
				if ( stream_indicator_key.hasNext() ) {
					adaptor.addChild(root_1, stream_indicator_key.nextTree());
				}
				stream_indicator_key.reset();

				// PLSQLCommons.g:447:61: ( $b2)?
				if ( stream_b2.hasNext() ) {
					adaptor.addChild(root_1, stream_b2.nextNode());
				}
				stream_b2.reset();

				// PLSQLCommons.g:447:66: ( $u2)?
				if ( stream_u2.hasNext() ) {
					adaptor.addChild(root_1, stream_u2.nextNode());
				}
				stream_u2.reset();

				// PLSQLCommons.g:447:70: ( general_element_id )*
				while ( stream_general_element_id.hasNext() ) {
					adaptor.addChild(root_1, stream_general_element_id.nextTree());
				}
				stream_general_element_id.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bind_variable"


	public static class general_element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_element"
	// PLSQLCommons.g:450:1: general_element : (r+= general_element_id |r+= bind_variable ) ( PERIOD r+= general_element_id | ( LEFT_PAREN ~ PLUS_SIGN )=>r+= function_argument )* -> ^( CASCATED_ELEMENT ( $r)+ ) ;
	public final PLSQLParser_PLSQLCommons.general_element_return general_element() throws RecognitionException {
		PLSQLParser_PLSQLCommons.general_element_return retval = new PLSQLParser_PLSQLCommons.general_element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PERIOD246=null;
		List<Object> list_r=null;
		RuleReturnScope r = null;
		Object PERIOD246_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_general_element_id=new RewriteRuleSubtreeStream(adaptor,"rule general_element_id");
		RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
		RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");

		try {
			// PLSQLCommons.g:451:5: ( (r+= general_element_id |r+= bind_variable ) ( PERIOD r+= general_element_id | ( LEFT_PAREN ~ PLUS_SIGN )=>r+= function_argument )* -> ^( CASCATED_ELEMENT ( $r)+ ) )
			// PLSQLCommons.g:451:9: (r+= general_element_id |r+= bind_variable ) ( PERIOD r+= general_element_id | ( LEFT_PAREN ~ PLUS_SIGN )=>r+= function_argument )*
			{
			// PLSQLCommons.g:451:9: (r+= general_element_id |r+= bind_variable )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DELIMITED_ID||LA78_0==INTRODUCER||LA78_0==REGULAR_ID||LA78_0==SQL92_RESERVED_DELETE||LA78_0==SQL92_RESERVED_EXISTS||LA78_0==SQL92_RESERVED_PRIOR) ) {
				alt78=1;
			}
			else if ( (LA78_0==BINDVAR||LA78_0==COLON) ) {
				alt78=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// PLSQLCommons.g:451:10: r+= general_element_id
					{
					pushFollow(FOLLOW_general_element_id_in_general_element4137);
					r=general_element_id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_general_element_id.add(r.getTree());
					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:451:32: r+= bind_variable
					{
					pushFollow(FOLLOW_bind_variable_in_general_element4141);
					r=bind_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bind_variable.add(r.getTree());
					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					}
					break;

			}

			// PLSQLCommons.g:452:9: ( PERIOD r+= general_element_id | ( LEFT_PAREN ~ PLUS_SIGN )=>r+= function_argument )*
			loop79:
			while (true) {
				int alt79=3;
				alt79 = dfa79.predict(input);
				switch (alt79) {
				case 1 :
					// PLSQLCommons.g:453:13: PERIOD r+= general_element_id
					{
					PERIOD246=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_general_element4166); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD246);

					pushFollow(FOLLOW_general_element_id_in_general_element4170);
					r=general_element_id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_general_element_id.add(r.getTree());
					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					}
					break;
				case 2 :
					// PLSQLCommons.g:454:15: ( LEFT_PAREN ~ PLUS_SIGN )=>r+= function_argument
					{
					pushFollow(FOLLOW_function_argument_in_general_element4197);
					r=function_argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function_argument.add(r.getTree());
					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					}
					break;

				default :
					break loop79;
				}
			}

			// AST REWRITE
			// elements: r
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: r
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"token r",list_r);
			root_0 = (Object)adaptor.nil();
			// 456:9: -> ^( CASCATED_ELEMENT ( $r)+ )
			{
				// PLSQLCommons.g:456:12: ^( CASCATED_ELEMENT ( $r)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CASCATED_ELEMENT, "CASCATED_ELEMENT"), root_1);
				if ( !(stream_r.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_r.hasNext() ) {
					adaptor.addChild(root_1, stream_r.nextTree());
				}
				stream_r.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_element"


	public static class general_element_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_element_id"
	// PLSQLCommons.g:459:1: general_element_id : ( INTRODUCER char_set_name )? routine_id -> ^( ANY_ELEMENT ( char_set_name )? routine_id ) ;
	public final PLSQLParser_PLSQLCommons.general_element_id_return general_element_id() throws RecognitionException {
		PLSQLParser_PLSQLCommons.general_element_id_return retval = new PLSQLParser_PLSQLCommons.general_element_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRODUCER247=null;
		ParserRuleReturnScope char_set_name248 =null;
		ParserRuleReturnScope routine_id249 =null;

		Object INTRODUCER247_tree=null;
		RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
		RewriteRuleSubtreeStream stream_routine_id=new RewriteRuleSubtreeStream(adaptor,"rule routine_id");
		RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");

		try {
			// PLSQLCommons.g:460:5: ( ( INTRODUCER char_set_name )? routine_id -> ^( ANY_ELEMENT ( char_set_name )? routine_id ) )
			// PLSQLCommons.g:460:10: ( INTRODUCER char_set_name )? routine_id
			{
			// PLSQLCommons.g:460:10: ( INTRODUCER char_set_name )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==INTRODUCER) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// PLSQLCommons.g:460:11: INTRODUCER char_set_name
					{
					INTRODUCER247=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_general_element_id4247); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER247);

					pushFollow(FOLLOW_char_set_name_in_general_element_id4249);
					char_set_name248=char_set_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name248.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_routine_id_in_general_element_id4253);
			routine_id249=routine_id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_routine_id.add(routine_id249.getTree());
			// AST REWRITE
			// elements: char_set_name, routine_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 460:49: -> ^( ANY_ELEMENT ( char_set_name )? routine_id )
			{
				// PLSQLCommons.g:460:52: ^( ANY_ELEMENT ( char_set_name )? routine_id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANY_ELEMENT, "ANY_ELEMENT"), root_1);
				// PLSQLCommons.g:460:66: ( char_set_name )?
				if ( stream_char_set_name.hasNext() ) {
					adaptor.addChild(root_1, stream_char_set_name.nextTree());
				}
				stream_char_set_name.reset();

				adaptor.addChild(root_1, stream_routine_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_element_id"


	public static class table_element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_element"
	// PLSQLCommons.g:463:1: table_element : ( INTRODUCER char_set_name )? id_expression ( PERIOD id_expression )* -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ ) ;
	public final PLSQLParser_PLSQLCommons.table_element_return table_element() throws RecognitionException {
		PLSQLParser_PLSQLCommons.table_element_return retval = new PLSQLParser_PLSQLCommons.table_element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRODUCER250=null;
		Token PERIOD253=null;
		ParserRuleReturnScope char_set_name251 =null;
		ParserRuleReturnScope id_expression252 =null;
		ParserRuleReturnScope id_expression254 =null;

		Object INTRODUCER250_tree=null;
		Object PERIOD253_tree=null;
		RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");

		try {
			// PLSQLCommons.g:464:5: ( ( INTRODUCER char_set_name )? id_expression ( PERIOD id_expression )* -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ ) )
			// PLSQLCommons.g:464:10: ( INTRODUCER char_set_name )? id_expression ( PERIOD id_expression )*
			{
			// PLSQLCommons.g:464:10: ( INTRODUCER char_set_name )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==INTRODUCER) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// PLSQLCommons.g:464:11: INTRODUCER char_set_name
					{
					INTRODUCER250=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_table_element4285); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER250);

					pushFollow(FOLLOW_char_set_name_in_table_element4287);
					char_set_name251=char_set_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name251.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_id_expression_in_table_element4291);
			id_expression252=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression252.getTree());
			// PLSQLCommons.g:464:52: ( PERIOD id_expression )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==PERIOD) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// PLSQLCommons.g:464:53: PERIOD id_expression
					{
					PERIOD253=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_table_element4294); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD253);

					pushFollow(FOLLOW_id_expression_in_table_element4296);
					id_expression254=id_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id_expression.add(id_expression254.getTree());
					}
					break;

				default :
					break loop82;
				}
			}

			// AST REWRITE
			// elements: id_expression, char_set_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 465:10: -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ )
			{
				// PLSQLCommons.g:465:13: ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANY_ELEMENT, "ANY_ELEMENT"), root_1);
				// PLSQLCommons.g:465:27: ( char_set_name )?
				if ( stream_char_set_name.hasNext() ) {
					adaptor.addChild(root_1, stream_char_set_name.nextTree());
				}
				stream_char_set_name.reset();

				if ( !(stream_id_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_id_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_id_expression.nextTree());
				}
				stream_id_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "table_element"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// PLSQLCommons.g:472:1: constant : ( timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )? | interval_key ( quoted_string | bind_variable | general_element_id ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )? | numeric | date_key quoted_string | quoted_string | null_key | true_key | false_key | dbtimezone_key | sessiontimezone_key | minvalue_key | maxvalue_key | default_key );
	public final PLSQLParser_PLSQLCommons.constant_return constant() throws RecognitionException {
		PLSQLParser_PLSQLCommons.constant_return retval = new PLSQLParser_PLSQLCommons.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN270=null;
		Token UNSIGNED_INTEGER271=null;
		Token COMMA273=null;
		Token UNSIGNED_INTEGER274=null;
		Token RIGHT_PAREN276=null;
		Token LEFT_PAREN282=null;
		Token UNSIGNED_INTEGER283=null;
		Token RIGHT_PAREN285=null;
		ParserRuleReturnScope timestamp_key255 =null;
		ParserRuleReturnScope quoted_string256 =null;
		ParserRuleReturnScope bind_variable257 =null;
		ParserRuleReturnScope at_key258 =null;
		ParserRuleReturnScope time_key259 =null;
		ParserRuleReturnScope zone_key260 =null;
		ParserRuleReturnScope quoted_string261 =null;
		ParserRuleReturnScope interval_key262 =null;
		ParserRuleReturnScope quoted_string263 =null;
		ParserRuleReturnScope bind_variable264 =null;
		ParserRuleReturnScope general_element_id265 =null;
		ParserRuleReturnScope day_key266 =null;
		ParserRuleReturnScope hour_key267 =null;
		ParserRuleReturnScope minute_key268 =null;
		ParserRuleReturnScope second_key269 =null;
		ParserRuleReturnScope bind_variable272 =null;
		ParserRuleReturnScope bind_variable275 =null;
		ParserRuleReturnScope to_key277 =null;
		ParserRuleReturnScope day_key278 =null;
		ParserRuleReturnScope hour_key279 =null;
		ParserRuleReturnScope minute_key280 =null;
		ParserRuleReturnScope second_key281 =null;
		ParserRuleReturnScope bind_variable284 =null;
		ParserRuleReturnScope numeric286 =null;
		ParserRuleReturnScope date_key287 =null;
		ParserRuleReturnScope quoted_string288 =null;
		ParserRuleReturnScope quoted_string289 =null;
		ParserRuleReturnScope null_key290 =null;
		ParserRuleReturnScope true_key291 =null;
		ParserRuleReturnScope false_key292 =null;
		ParserRuleReturnScope dbtimezone_key293 =null;
		ParserRuleReturnScope sessiontimezone_key294 =null;
		ParserRuleReturnScope minvalue_key295 =null;
		ParserRuleReturnScope maxvalue_key296 =null;
		ParserRuleReturnScope default_key297 =null;

		Object LEFT_PAREN270_tree=null;
		Object UNSIGNED_INTEGER271_tree=null;
		Object COMMA273_tree=null;
		Object UNSIGNED_INTEGER274_tree=null;
		Object RIGHT_PAREN276_tree=null;
		Object LEFT_PAREN282_tree=null;
		Object UNSIGNED_INTEGER283_tree=null;
		Object RIGHT_PAREN285_tree=null;

		try {
			// PLSQLCommons.g:473:5: ( timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )? | interval_key ( quoted_string | bind_variable | general_element_id ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )? | numeric | date_key quoted_string | quoted_string | null_key | true_key | false_key | dbtimezone_key | sessiontimezone_key | minvalue_key | maxvalue_key | default_key )
			int alt95=13;
			alt95 = dfa95.predict(input);
			switch (alt95) {
				case 1 :
					// PLSQLCommons.g:473:10: timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timestamp_key_in_constant4343);
					timestamp_key255=gPLSQLParser.timestamp_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_key255.getTree());

					// PLSQLCommons.g:473:24: ( quoted_string | bind_variable )
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( ((LA83_0 >= CHAR_STRING && LA83_0 <= CHAR_STRING_PERL)||LA83_0==NATIONAL_CHAR_STRING_LIT) ) {
						alt83=1;
					}
					else if ( (LA83_0==BINDVAR||LA83_0==COLON) ) {
						alt83=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 83, 0, input);
						throw nvae;
					}

					switch (alt83) {
						case 1 :
							// PLSQLCommons.g:473:25: quoted_string
							{
							pushFollow(FOLLOW_quoted_string_in_constant4346);
							quoted_string256=quoted_string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string256.getTree());

							}
							break;
						case 2 :
							// PLSQLCommons.g:473:41: bind_variable
							{
							pushFollow(FOLLOW_bind_variable_in_constant4350);
							bind_variable257=bind_variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable257.getTree());

							}
							break;

					}

					// PLSQLCommons.g:473:56: ( at_key time_key zone_key quoted_string )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==REGULAR_ID) ) {
						int LA84_1 = input.LA(2);
						if ( (LA84_1==REGULAR_ID) ) {
							int LA84_3 = input.LA(3);
							if ( (LA84_3==REGULAR_ID) ) {
								int LA84_12 = input.LA(4);
								if ( ((LA84_12 >= CHAR_STRING && LA84_12 <= CHAR_STRING_PERL)||LA84_12==NATIONAL_CHAR_STRING_LIT) ) {
									int LA84_13 = input.LA(5);
									if ( ((input.LT(1).getText().equalsIgnoreCase("at"))) ) {
										alt84=1;
									}
								}
							}
						}
					}
					switch (alt84) {
						case 1 :
							// PLSQLCommons.g:473:57: at_key time_key zone_key quoted_string
							{
							pushFollow(FOLLOW_at_key_in_constant4354);
							at_key258=gPLSQLParser.at_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, at_key258.getTree());

							pushFollow(FOLLOW_time_key_in_constant4356);
							time_key259=gPLSQLParser.time_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, time_key259.getTree());

							pushFollow(FOLLOW_zone_key_in_constant4358);
							zone_key260=gPLSQLParser.zone_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, zone_key260.getTree());

							pushFollow(FOLLOW_quoted_string_in_constant4360);
							quoted_string261=quoted_string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string261.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:474:10: interval_key ( quoted_string | bind_variable | general_element_id ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_interval_key_in_constant4373);
					interval_key262=gPLSQLParser.interval_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interval_key262.getTree());

					// PLSQLCommons.g:474:23: ( quoted_string | bind_variable | general_element_id )
					int alt85=3;
					switch ( input.LA(1) ) {
					case CHAR_STRING:
					case CHAR_STRING_PERL:
					case NATIONAL_CHAR_STRING_LIT:
						{
						alt85=1;
						}
						break;
					case BINDVAR:
					case COLON:
						{
						alt85=2;
						}
						break;
					case DELIMITED_ID:
					case INTRODUCER:
					case REGULAR_ID:
					case SQL92_RESERVED_DELETE:
					case SQL92_RESERVED_EXISTS:
					case SQL92_RESERVED_PRIOR:
						{
						alt85=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 85, 0, input);
						throw nvae;
					}
					switch (alt85) {
						case 1 :
							// PLSQLCommons.g:474:24: quoted_string
							{
							pushFollow(FOLLOW_quoted_string_in_constant4376);
							quoted_string263=quoted_string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string263.getTree());

							}
							break;
						case 2 :
							// PLSQLCommons.g:474:40: bind_variable
							{
							pushFollow(FOLLOW_bind_variable_in_constant4380);
							bind_variable264=bind_variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable264.getTree());

							}
							break;
						case 3 :
							// PLSQLCommons.g:474:56: general_element_id
							{
							pushFollow(FOLLOW_general_element_id_in_constant4384);
							general_element_id265=general_element_id();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, general_element_id265.getTree());

							}
							break;

					}

					// PLSQLCommons.g:475:10: ( day_key | hour_key | minute_key | second_key )
					int alt86=4;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==REGULAR_ID) ) {
						int LA86_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
							alt86=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("hour"))) ) {
							alt86=2;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("minute"))) ) {
							alt86=3;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
							alt86=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 86, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 86, 0, input);
						throw nvae;
					}

					switch (alt86) {
						case 1 :
							// PLSQLCommons.g:475:12: day_key
							{
							pushFollow(FOLLOW_day_key_in_constant4398);
							day_key266=gPLSQLParser.day_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, day_key266.getTree());

							}
							break;
						case 2 :
							// PLSQLCommons.g:475:22: hour_key
							{
							pushFollow(FOLLOW_hour_key_in_constant4402);
							hour_key267=gPLSQLParser.hour_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, hour_key267.getTree());

							}
							break;
						case 3 :
							// PLSQLCommons.g:475:33: minute_key
							{
							pushFollow(FOLLOW_minute_key_in_constant4406);
							minute_key268=gPLSQLParser.minute_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, minute_key268.getTree());

							}
							break;
						case 4 :
							// PLSQLCommons.g:475:46: second_key
							{
							pushFollow(FOLLOW_second_key_in_constant4410);
							second_key269=gPLSQLParser.second_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, second_key269.getTree());

							}
							break;

					}

					// PLSQLCommons.g:476:10: ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==LEFT_PAREN) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// PLSQLCommons.g:476:12: LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN
							{
							LEFT_PAREN270=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_constant4424); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LEFT_PAREN270_tree = (Object)adaptor.create(LEFT_PAREN270);
							adaptor.addChild(root_0, LEFT_PAREN270_tree);
							}

							// PLSQLCommons.g:476:23: ( UNSIGNED_INTEGER | bind_variable )
							int alt87=2;
							int LA87_0 = input.LA(1);
							if ( (LA87_0==UNSIGNED_INTEGER) ) {
								alt87=1;
							}
							else if ( (LA87_0==BINDVAR||LA87_0==COLON) ) {
								alt87=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 87, 0, input);
								throw nvae;
							}

							switch (alt87) {
								case 1 :
									// PLSQLCommons.g:476:24: UNSIGNED_INTEGER
									{
									UNSIGNED_INTEGER271=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant4427); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									UNSIGNED_INTEGER271_tree = (Object)adaptor.create(UNSIGNED_INTEGER271);
									adaptor.addChild(root_0, UNSIGNED_INTEGER271_tree);
									}

									}
									break;
								case 2 :
									// PLSQLCommons.g:476:43: bind_variable
									{
									pushFollow(FOLLOW_bind_variable_in_constant4431);
									bind_variable272=bind_variable();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable272.getTree());

									}
									break;

							}

							// PLSQLCommons.g:476:58: ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )?
							int alt89=2;
							int LA89_0 = input.LA(1);
							if ( (LA89_0==COMMA) ) {
								alt89=1;
							}
							switch (alt89) {
								case 1 :
									// PLSQLCommons.g:476:59: COMMA ( UNSIGNED_INTEGER | bind_variable )
									{
									COMMA273=(Token)match(input,COMMA,FOLLOW_COMMA_in_constant4435); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									COMMA273_tree = (Object)adaptor.create(COMMA273);
									adaptor.addChild(root_0, COMMA273_tree);
									}

									// PLSQLCommons.g:476:65: ( UNSIGNED_INTEGER | bind_variable )
									int alt88=2;
									int LA88_0 = input.LA(1);
									if ( (LA88_0==UNSIGNED_INTEGER) ) {
										alt88=1;
									}
									else if ( (LA88_0==BINDVAR||LA88_0==COLON) ) {
										alt88=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										NoViableAltException nvae =
											new NoViableAltException("", 88, 0, input);
										throw nvae;
									}

									switch (alt88) {
										case 1 :
											// PLSQLCommons.g:476:66: UNSIGNED_INTEGER
											{
											UNSIGNED_INTEGER274=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant4438); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											UNSIGNED_INTEGER274_tree = (Object)adaptor.create(UNSIGNED_INTEGER274);
											adaptor.addChild(root_0, UNSIGNED_INTEGER274_tree);
											}

											}
											break;
										case 2 :
											// PLSQLCommons.g:476:85: bind_variable
											{
											pushFollow(FOLLOW_bind_variable_in_constant4442);
											bind_variable275=bind_variable();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable275.getTree());

											}
											break;

									}

									}
									break;

							}

							RIGHT_PAREN276=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_constant4448); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							RIGHT_PAREN276_tree = (Object)adaptor.create(RIGHT_PAREN276);
							adaptor.addChild(root_0, RIGHT_PAREN276_tree);
							}

							}
							break;

					}

					// PLSQLCommons.g:477:10: ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==SQL92_RESERVED_TO) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// PLSQLCommons.g:477:12: to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? )
							{
							pushFollow(FOLLOW_to_key_in_constant4463);
							to_key277=gPLSQLParser.to_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, to_key277.getTree());

							// PLSQLCommons.g:478:14: ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? )
							int alt93=4;
							int LA93_0 = input.LA(1);
							if ( (LA93_0==REGULAR_ID) ) {
								int LA93_1 = input.LA(2);
								if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
									alt93=1;
								}
								else if ( ((input.LT(1).getText().equalsIgnoreCase("hour"))) ) {
									alt93=2;
								}
								else if ( ((input.LT(1).getText().equalsIgnoreCase("minute"))) ) {
									alt93=3;
								}
								else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
									alt93=4;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 93, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 93, 0, input);
								throw nvae;
							}

							switch (alt93) {
								case 1 :
									// PLSQLCommons.g:478:16: day_key
									{
									pushFollow(FOLLOW_day_key_in_constant4480);
									day_key278=gPLSQLParser.day_key();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, day_key278.getTree());

									}
									break;
								case 2 :
									// PLSQLCommons.g:478:26: hour_key
									{
									pushFollow(FOLLOW_hour_key_in_constant4484);
									hour_key279=gPLSQLParser.hour_key();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, hour_key279.getTree());

									}
									break;
								case 3 :
									// PLSQLCommons.g:478:37: minute_key
									{
									pushFollow(FOLLOW_minute_key_in_constant4488);
									minute_key280=gPLSQLParser.minute_key();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, minute_key280.getTree());

									}
									break;
								case 4 :
									// PLSQLCommons.g:478:50: second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )?
									{
									pushFollow(FOLLOW_second_key_in_constant4492);
									second_key281=gPLSQLParser.second_key();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, second_key281.getTree());

									// PLSQLCommons.g:478:61: ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )?
									int alt92=2;
									int LA92_0 = input.LA(1);
									if ( (LA92_0==LEFT_PAREN) ) {
										alt92=1;
									}
									switch (alt92) {
										case 1 :
											// PLSQLCommons.g:478:62: LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN
											{
											LEFT_PAREN282=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_constant4495); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											LEFT_PAREN282_tree = (Object)adaptor.create(LEFT_PAREN282);
											adaptor.addChild(root_0, LEFT_PAREN282_tree);
											}

											// PLSQLCommons.g:478:73: ( UNSIGNED_INTEGER | bind_variable )
											int alt91=2;
											int LA91_0 = input.LA(1);
											if ( (LA91_0==UNSIGNED_INTEGER) ) {
												alt91=1;
											}
											else if ( (LA91_0==BINDVAR||LA91_0==COLON) ) {
												alt91=2;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												NoViableAltException nvae =
													new NoViableAltException("", 91, 0, input);
												throw nvae;
											}

											switch (alt91) {
												case 1 :
													// PLSQLCommons.g:478:74: UNSIGNED_INTEGER
													{
													UNSIGNED_INTEGER283=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant4498); if (state.failed) return retval;
													if ( state.backtracking==0 ) {
													UNSIGNED_INTEGER283_tree = (Object)adaptor.create(UNSIGNED_INTEGER283);
													adaptor.addChild(root_0, UNSIGNED_INTEGER283_tree);
													}

													}
													break;
												case 2 :
													// PLSQLCommons.g:478:93: bind_variable
													{
													pushFollow(FOLLOW_bind_variable_in_constant4502);
													bind_variable284=bind_variable();
													state._fsp--;
													if (state.failed) return retval;
													if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable284.getTree());

													}
													break;

											}

											RIGHT_PAREN285=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_constant4505); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											RIGHT_PAREN285_tree = (Object)adaptor.create(RIGHT_PAREN285);
											adaptor.addChild(root_0, RIGHT_PAREN285_tree);
											}

											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 3 :
					// PLSQLCommons.g:480:10: numeric
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numeric_in_constant4532);
					numeric286=numeric();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric286.getTree());

					}
					break;
				case 4 :
					// PLSQLCommons.g:481:10: date_key quoted_string
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_key_in_constant4543);
					date_key287=gPLSQLParser.date_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_key287.getTree());

					pushFollow(FOLLOW_quoted_string_in_constant4545);
					quoted_string288=quoted_string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string288.getTree());

					}
					break;
				case 5 :
					// PLSQLCommons.g:482:10: quoted_string
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quoted_string_in_constant4556);
					quoted_string289=quoted_string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string289.getTree());

					}
					break;
				case 6 :
					// PLSQLCommons.g:483:10: null_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_null_key_in_constant4567);
					null_key290=gPLSQLParser.null_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_key290.getTree());

					}
					break;
				case 7 :
					// PLSQLCommons.g:484:10: true_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_true_key_in_constant4578);
					true_key291=gPLSQLParser.true_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, true_key291.getTree());

					}
					break;
				case 8 :
					// PLSQLCommons.g:485:10: false_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_false_key_in_constant4589);
					false_key292=gPLSQLParser.false_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, false_key292.getTree());

					}
					break;
				case 9 :
					// PLSQLCommons.g:486:10: dbtimezone_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_dbtimezone_key_in_constant4600);
					dbtimezone_key293=gPLSQLParser.dbtimezone_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dbtimezone_key293.getTree());

					}
					break;
				case 10 :
					// PLSQLCommons.g:487:10: sessiontimezone_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sessiontimezone_key_in_constant4612);
					sessiontimezone_key294=gPLSQLParser.sessiontimezone_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sessiontimezone_key294.getTree());

					}
					break;
				case 11 :
					// PLSQLCommons.g:488:10: minvalue_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_minvalue_key_in_constant4623);
					minvalue_key295=gPLSQLParser.minvalue_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, minvalue_key295.getTree());

					}
					break;
				case 12 :
					// PLSQLCommons.g:489:10: maxvalue_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_maxvalue_key_in_constant4634);
					maxvalue_key296=gPLSQLParser.maxvalue_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, maxvalue_key296.getTree());

					}
					break;
				case 13 :
					// PLSQLCommons.g:490:10: default_key
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_default_key_in_constant4645);
					default_key297=gPLSQLParser.default_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, default_key297.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class numeric_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numeric"
	// PLSQLCommons.g:493:1: numeric : ( UNSIGNED_INTEGER | MINUS_SIGN UNSIGNED_INTEGER -> ^( CONSTANT_NEGATED[$MINUS_SIGN] UNSIGNED_INTEGER ) | EXACT_NUM_LIT | APPROXIMATE_NUM_LIT );
	public final PLSQLParser_PLSQLCommons.numeric_return numeric() throws RecognitionException {
		PLSQLParser_PLSQLCommons.numeric_return retval = new PLSQLParser_PLSQLCommons.numeric_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token UNSIGNED_INTEGER298=null;
		Token MINUS_SIGN299=null;
		Token UNSIGNED_INTEGER300=null;
		Token EXACT_NUM_LIT301=null;
		Token APPROXIMATE_NUM_LIT302=null;

		Object UNSIGNED_INTEGER298_tree=null;
		Object MINUS_SIGN299_tree=null;
		Object UNSIGNED_INTEGER300_tree=null;
		Object EXACT_NUM_LIT301_tree=null;
		Object APPROXIMATE_NUM_LIT302_tree=null;
		RewriteRuleTokenStream stream_MINUS_SIGN=new RewriteRuleTokenStream(adaptor,"token MINUS_SIGN");
		RewriteRuleTokenStream stream_UNSIGNED_INTEGER=new RewriteRuleTokenStream(adaptor,"token UNSIGNED_INTEGER");

		try {
			// PLSQLCommons.g:494:5: ( UNSIGNED_INTEGER | MINUS_SIGN UNSIGNED_INTEGER -> ^( CONSTANT_NEGATED[$MINUS_SIGN] UNSIGNED_INTEGER ) | EXACT_NUM_LIT | APPROXIMATE_NUM_LIT )
			int alt96=4;
			switch ( input.LA(1) ) {
			case UNSIGNED_INTEGER:
				{
				alt96=1;
				}
				break;
			case MINUS_SIGN:
				{
				alt96=2;
				}
				break;
			case EXACT_NUM_LIT:
				{
				alt96=3;
				}
				break;
			case APPROXIMATE_NUM_LIT:
				{
				alt96=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// PLSQLCommons.g:494:10: UNSIGNED_INTEGER
					{
					root_0 = (Object)adaptor.nil();


					UNSIGNED_INTEGER298=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_numeric4665); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UNSIGNED_INTEGER298_tree = (Object)adaptor.create(UNSIGNED_INTEGER298);
					adaptor.addChild(root_0, UNSIGNED_INTEGER298_tree);
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:495:10: MINUS_SIGN UNSIGNED_INTEGER
					{
					MINUS_SIGN299=(Token)match(input,MINUS_SIGN,FOLLOW_MINUS_SIGN_in_numeric4676); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS_SIGN.add(MINUS_SIGN299);

					UNSIGNED_INTEGER300=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_numeric4678); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UNSIGNED_INTEGER.add(UNSIGNED_INTEGER300);

					// AST REWRITE
					// elements: UNSIGNED_INTEGER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 495:38: -> ^( CONSTANT_NEGATED[$MINUS_SIGN] UNSIGNED_INTEGER )
					{
						// PLSQLCommons.g:495:41: ^( CONSTANT_NEGATED[$MINUS_SIGN] UNSIGNED_INTEGER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANT_NEGATED, MINUS_SIGN299), root_1);
						adaptor.addChild(root_1, stream_UNSIGNED_INTEGER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// PLSQLCommons.g:496:10: EXACT_NUM_LIT
					{
					root_0 = (Object)adaptor.nil();


					EXACT_NUM_LIT301=(Token)match(input,EXACT_NUM_LIT,FOLLOW_EXACT_NUM_LIT_in_numeric4698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXACT_NUM_LIT301_tree = (Object)adaptor.create(EXACT_NUM_LIT301);
					adaptor.addChild(root_0, EXACT_NUM_LIT301_tree);
					}

					}
					break;
				case 4 :
					// PLSQLCommons.g:497:10: APPROXIMATE_NUM_LIT
					{
					root_0 = (Object)adaptor.nil();


					APPROXIMATE_NUM_LIT302=(Token)match(input,APPROXIMATE_NUM_LIT,FOLLOW_APPROXIMATE_NUM_LIT_in_numeric4709); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					APPROXIMATE_NUM_LIT302_tree = (Object)adaptor.create(APPROXIMATE_NUM_LIT302);
					adaptor.addChild(root_0, APPROXIMATE_NUM_LIT302_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numeric"


	public static class quoted_string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quoted_string"
	// PLSQLCommons.g:499:1: quoted_string : ( CHAR_STRING | CHAR_STRING_PERL | NATIONAL_CHAR_STRING_LIT );
	public final PLSQLParser_PLSQLCommons.quoted_string_return quoted_string() throws RecognitionException {
		PLSQLParser_PLSQLCommons.quoted_string_return retval = new PLSQLParser_PLSQLCommons.quoted_string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set303=null;

		Object set303_tree=null;

		try {
			// PLSQLCommons.g:500:5: ( CHAR_STRING | CHAR_STRING_PERL | NATIONAL_CHAR_STRING_LIT )
			// PLSQLCommons.g:
			{
			root_0 = (Object)adaptor.nil();


			set303=input.LT(1);
			if ( (input.LA(1) >= CHAR_STRING && input.LA(1) <= CHAR_STRING_PERL)||input.LA(1)==NATIONAL_CHAR_STRING_LIT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set303));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quoted_string"


	public static class id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id"
	// PLSQLCommons.g:505:1: id : ( INTRODUCER char_set_name )? id_expression -> ( char_set_name )? id_expression ;
	public final PLSQLParser_PLSQLCommons.id_return id() throws RecognitionException {
		PLSQLParser_PLSQLCommons.id_return retval = new PLSQLParser_PLSQLCommons.id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTRODUCER304=null;
		ParserRuleReturnScope char_set_name305 =null;
		ParserRuleReturnScope id_expression306 =null;

		Object INTRODUCER304_tree=null;
		RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
		RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
		RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");

		try {
			// PLSQLCommons.g:506:5: ( ( INTRODUCER char_set_name )? id_expression -> ( char_set_name )? id_expression )
			// PLSQLCommons.g:506:10: ( INTRODUCER char_set_name )? id_expression
			{
			// PLSQLCommons.g:506:10: ( INTRODUCER char_set_name )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==INTRODUCER) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// PLSQLCommons.g:506:11: INTRODUCER char_set_name
					{
					INTRODUCER304=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_id4767); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER304);

					pushFollow(FOLLOW_char_set_name_in_id4769);
					char_set_name305=char_set_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name305.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_id_expression_in_id4781);
			id_expression306=id_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id_expression.add(id_expression306.getTree());
			// AST REWRITE
			// elements: char_set_name, id_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 508:9: -> ( char_set_name )? id_expression
			{
				// PLSQLCommons.g:508:12: ( char_set_name )?
				if ( stream_char_set_name.hasNext() ) {
					adaptor.addChild(root_0, stream_char_set_name.nextTree());
				}
				stream_char_set_name.reset();

				adaptor.addChild(root_0, stream_id_expression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id"


	public static class id_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_expression"
	// PLSQLCommons.g:511:1: id_expression : ( REGULAR_ID -> ID[$REGULAR_ID] | DELIMITED_ID -> ID[$DELIMITED_ID] );
	public final PLSQLParser_PLSQLCommons.id_expression_return id_expression() throws RecognitionException {
		PLSQLParser_PLSQLCommons.id_expression_return retval = new PLSQLParser_PLSQLCommons.id_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token REGULAR_ID307=null;
		Token DELIMITED_ID308=null;

		Object REGULAR_ID307_tree=null;
		Object DELIMITED_ID308_tree=null;
		RewriteRuleTokenStream stream_REGULAR_ID=new RewriteRuleTokenStream(adaptor,"token REGULAR_ID");
		RewriteRuleTokenStream stream_DELIMITED_ID=new RewriteRuleTokenStream(adaptor,"token DELIMITED_ID");

		try {
			// PLSQLCommons.g:512:5: ( REGULAR_ID -> ID[$REGULAR_ID] | DELIMITED_ID -> ID[$DELIMITED_ID] )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==REGULAR_ID) ) {
				alt98=1;
			}
			else if ( (LA98_0==DELIMITED_ID) ) {
				alt98=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// PLSQLCommons.g:512:10: REGULAR_ID
					{
					REGULAR_ID307=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_id_expression4816); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REGULAR_ID.add(REGULAR_ID307);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 512:21: -> ID[$REGULAR_ID]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(ID, REGULAR_ID307));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:513:10: DELIMITED_ID
					{
					DELIMITED_ID308=(Token)match(input,DELIMITED_ID,FOLLOW_DELIMITED_ID_in_id_expression4835); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DELIMITED_ID.add(DELIMITED_ID308);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 513:23: -> ID[$DELIMITED_ID]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(ID, DELIMITED_ID308));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_expression"


	public static class not_equal_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "not_equal_op"
	// PLSQLCommons.g:516:1: not_equal_op : ( NOT_EQUAL_OP | LESS_THAN_OP GREATER_THAN_OP -> NOT_EQUAL_OP[$LESS_THAN_OP, \"<>\"] | EXCLAMATION_OPERATOR_PART EQUALS_OP -> NOT_EQUAL_OP[$EXCLAMATION_OPERATOR_PART, \"!=\"] | CARRET_OPERATOR_PART EQUALS_OP -> NOT_EQUAL_OP[$CARRET_OPERATOR_PART, \"~=\"] );
	public final PLSQLParser_PLSQLCommons.not_equal_op_return not_equal_op() throws RecognitionException {
		PLSQLParser_PLSQLCommons.not_equal_op_return retval = new PLSQLParser_PLSQLCommons.not_equal_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT_EQUAL_OP309=null;
		Token LESS_THAN_OP310=null;
		Token GREATER_THAN_OP311=null;
		Token EXCLAMATION_OPERATOR_PART312=null;
		Token EQUALS_OP313=null;
		Token CARRET_OPERATOR_PART314=null;
		Token EQUALS_OP315=null;

		Object NOT_EQUAL_OP309_tree=null;
		Object LESS_THAN_OP310_tree=null;
		Object GREATER_THAN_OP311_tree=null;
		Object EXCLAMATION_OPERATOR_PART312_tree=null;
		Object EQUALS_OP313_tree=null;
		Object CARRET_OPERATOR_PART314_tree=null;
		Object EQUALS_OP315_tree=null;
		RewriteRuleTokenStream stream_EQUALS_OP=new RewriteRuleTokenStream(adaptor,"token EQUALS_OP");
		RewriteRuleTokenStream stream_CARRET_OPERATOR_PART=new RewriteRuleTokenStream(adaptor,"token CARRET_OPERATOR_PART");
		RewriteRuleTokenStream stream_LESS_THAN_OP=new RewriteRuleTokenStream(adaptor,"token LESS_THAN_OP");
		RewriteRuleTokenStream stream_GREATER_THAN_OP=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OP");
		RewriteRuleTokenStream stream_EXCLAMATION_OPERATOR_PART=new RewriteRuleTokenStream(adaptor,"token EXCLAMATION_OPERATOR_PART");

		try {
			// PLSQLCommons.g:517:5: ( NOT_EQUAL_OP | LESS_THAN_OP GREATER_THAN_OP -> NOT_EQUAL_OP[$LESS_THAN_OP, \"<>\"] | EXCLAMATION_OPERATOR_PART EQUALS_OP -> NOT_EQUAL_OP[$EXCLAMATION_OPERATOR_PART, \"!=\"] | CARRET_OPERATOR_PART EQUALS_OP -> NOT_EQUAL_OP[$CARRET_OPERATOR_PART, \"~=\"] )
			int alt99=4;
			switch ( input.LA(1) ) {
			case NOT_EQUAL_OP:
				{
				alt99=1;
				}
				break;
			case LESS_THAN_OP:
				{
				alt99=2;
				}
				break;
			case EXCLAMATION_OPERATOR_PART:
				{
				alt99=3;
				}
				break;
			case CARRET_OPERATOR_PART:
				{
				alt99=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// PLSQLCommons.g:517:10: NOT_EQUAL_OP
					{
					root_0 = (Object)adaptor.nil();


					NOT_EQUAL_OP309=(Token)match(input,NOT_EQUAL_OP,FOLLOW_NOT_EQUAL_OP_in_not_equal_op4864); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT_EQUAL_OP309_tree = (Object)adaptor.create(NOT_EQUAL_OP309);
					adaptor.addChild(root_0, NOT_EQUAL_OP309_tree);
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:518:10: LESS_THAN_OP GREATER_THAN_OP
					{
					LESS_THAN_OP310=(Token)match(input,LESS_THAN_OP,FOLLOW_LESS_THAN_OP_in_not_equal_op4875); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LESS_THAN_OP.add(LESS_THAN_OP310);

					GREATER_THAN_OP311=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_not_equal_op4877); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GREATER_THAN_OP.add(GREATER_THAN_OP311);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 518:39: -> NOT_EQUAL_OP[$LESS_THAN_OP, \"<>\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NOT_EQUAL_OP, LESS_THAN_OP310, "<>"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// PLSQLCommons.g:519:10: EXCLAMATION_OPERATOR_PART EQUALS_OP
					{
					EXCLAMATION_OPERATOR_PART312=(Token)match(input,EXCLAMATION_OPERATOR_PART,FOLLOW_EXCLAMATION_OPERATOR_PART_in_not_equal_op4893); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EXCLAMATION_OPERATOR_PART.add(EXCLAMATION_OPERATOR_PART312);

					EQUALS_OP313=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_not_equal_op4895); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS_OP.add(EQUALS_OP313);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 519:46: -> NOT_EQUAL_OP[$EXCLAMATION_OPERATOR_PART, \"!=\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NOT_EQUAL_OP, EXCLAMATION_OPERATOR_PART312, "!="));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// PLSQLCommons.g:520:10: CARRET_OPERATOR_PART EQUALS_OP
					{
					CARRET_OPERATOR_PART314=(Token)match(input,CARRET_OPERATOR_PART,FOLLOW_CARRET_OPERATOR_PART_in_not_equal_op4911); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CARRET_OPERATOR_PART.add(CARRET_OPERATOR_PART314);

					EQUALS_OP315=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_not_equal_op4913); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS_OP.add(EQUALS_OP315);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 520:41: -> NOT_EQUAL_OP[$CARRET_OPERATOR_PART, \"~=\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NOT_EQUAL_OP, CARRET_OPERATOR_PART314, "~="));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "not_equal_op"


	public static class greater_than_or_equals_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "greater_than_or_equals_op"
	// PLSQLCommons.g:523:1: greater_than_or_equals_op : ( GREATER_THAN_OR_EQUALS_OP | GREATER_THAN_OP EQUALS_OP -> GREATER_THAN_OR_EQUALS_OP[$GREATER_THAN_OP, \">=\"] );
	public final PLSQLParser_PLSQLCommons.greater_than_or_equals_op_return greater_than_or_equals_op() throws RecognitionException {
		PLSQLParser_PLSQLCommons.greater_than_or_equals_op_return retval = new PLSQLParser_PLSQLCommons.greater_than_or_equals_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GREATER_THAN_OR_EQUALS_OP316=null;
		Token GREATER_THAN_OP317=null;
		Token EQUALS_OP318=null;

		Object GREATER_THAN_OR_EQUALS_OP316_tree=null;
		Object GREATER_THAN_OP317_tree=null;
		Object EQUALS_OP318_tree=null;
		RewriteRuleTokenStream stream_EQUALS_OP=new RewriteRuleTokenStream(adaptor,"token EQUALS_OP");
		RewriteRuleTokenStream stream_GREATER_THAN_OP=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OP");

		try {
			// PLSQLCommons.g:524:5: ( GREATER_THAN_OR_EQUALS_OP | GREATER_THAN_OP EQUALS_OP -> GREATER_THAN_OR_EQUALS_OP[$GREATER_THAN_OP, \">=\"] )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==GREATER_THAN_OR_EQUALS_OP) ) {
				alt100=1;
			}
			else if ( (LA100_0==GREATER_THAN_OP) ) {
				alt100=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// PLSQLCommons.g:524:10: GREATER_THAN_OR_EQUALS_OP
					{
					root_0 = (Object)adaptor.nil();


					GREATER_THAN_OR_EQUALS_OP316=(Token)match(input,GREATER_THAN_OR_EQUALS_OP,FOLLOW_GREATER_THAN_OR_EQUALS_OP_in_greater_than_or_equals_op4938); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					GREATER_THAN_OR_EQUALS_OP316_tree = (Object)adaptor.create(GREATER_THAN_OR_EQUALS_OP316);
					adaptor.addChild(root_0, GREATER_THAN_OR_EQUALS_OP316_tree);
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:525:10: GREATER_THAN_OP EQUALS_OP
					{
					GREATER_THAN_OP317=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_greater_than_or_equals_op4949); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GREATER_THAN_OP.add(GREATER_THAN_OP317);

					EQUALS_OP318=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_greater_than_or_equals_op4951); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS_OP.add(EQUALS_OP318);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 525:36: -> GREATER_THAN_OR_EQUALS_OP[$GREATER_THAN_OP, \">=\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(GREATER_THAN_OR_EQUALS_OP, GREATER_THAN_OP317, ">="));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "greater_than_or_equals_op"


	public static class less_than_or_equals_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "less_than_or_equals_op"
	// PLSQLCommons.g:528:1: less_than_or_equals_op : ( LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP EQUALS_OP -> LESS_THAN_OR_EQUALS_OP[$LESS_THAN_OP, \"<=\"] );
	public final PLSQLParser_PLSQLCommons.less_than_or_equals_op_return less_than_or_equals_op() throws RecognitionException {
		PLSQLParser_PLSQLCommons.less_than_or_equals_op_return retval = new PLSQLParser_PLSQLCommons.less_than_or_equals_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LESS_THAN_OR_EQUALS_OP319=null;
		Token LESS_THAN_OP320=null;
		Token EQUALS_OP321=null;

		Object LESS_THAN_OR_EQUALS_OP319_tree=null;
		Object LESS_THAN_OP320_tree=null;
		Object EQUALS_OP321_tree=null;
		RewriteRuleTokenStream stream_EQUALS_OP=new RewriteRuleTokenStream(adaptor,"token EQUALS_OP");
		RewriteRuleTokenStream stream_LESS_THAN_OP=new RewriteRuleTokenStream(adaptor,"token LESS_THAN_OP");

		try {
			// PLSQLCommons.g:529:5: ( LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP EQUALS_OP -> LESS_THAN_OR_EQUALS_OP[$LESS_THAN_OP, \"<=\"] )
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LESS_THAN_OR_EQUALS_OP) ) {
				alt101=1;
			}
			else if ( (LA101_0==LESS_THAN_OP) ) {
				alt101=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}

			switch (alt101) {
				case 1 :
					// PLSQLCommons.g:529:10: LESS_THAN_OR_EQUALS_OP
					{
					root_0 = (Object)adaptor.nil();


					LESS_THAN_OR_EQUALS_OP319=(Token)match(input,LESS_THAN_OR_EQUALS_OP,FOLLOW_LESS_THAN_OR_EQUALS_OP_in_less_than_or_equals_op4976); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LESS_THAN_OR_EQUALS_OP319_tree = (Object)adaptor.create(LESS_THAN_OR_EQUALS_OP319);
					adaptor.addChild(root_0, LESS_THAN_OR_EQUALS_OP319_tree);
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:530:10: LESS_THAN_OP EQUALS_OP
					{
					LESS_THAN_OP320=(Token)match(input,LESS_THAN_OP,FOLLOW_LESS_THAN_OP_in_less_than_or_equals_op4987); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LESS_THAN_OP.add(LESS_THAN_OP320);

					EQUALS_OP321=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_less_than_or_equals_op4989); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS_OP.add(EQUALS_OP321);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 530:33: -> LESS_THAN_OR_EQUALS_OP[$LESS_THAN_OP, \"<=\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(LESS_THAN_OR_EQUALS_OP, LESS_THAN_OP320, "<="));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "less_than_or_equals_op"


	public static class concatenation_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "concatenation_op"
	// PLSQLCommons.g:533:1: concatenation_op : ( CONCATENATION_OP |b1= VERTICAL_BAR VERTICAL_BAR -> CONCATENATION_OP[$b1, \"||\"] );
	public final PLSQLParser_PLSQLCommons.concatenation_op_return concatenation_op() throws RecognitionException {
		PLSQLParser_PLSQLCommons.concatenation_op_return retval = new PLSQLParser_PLSQLCommons.concatenation_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token b1=null;
		Token CONCATENATION_OP322=null;
		Token VERTICAL_BAR323=null;

		Object b1_tree=null;
		Object CONCATENATION_OP322_tree=null;
		Object VERTICAL_BAR323_tree=null;
		RewriteRuleTokenStream stream_VERTICAL_BAR=new RewriteRuleTokenStream(adaptor,"token VERTICAL_BAR");

		try {
			// PLSQLCommons.g:534:5: ( CONCATENATION_OP |b1= VERTICAL_BAR VERTICAL_BAR -> CONCATENATION_OP[$b1, \"||\"] )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==CONCATENATION_OP) ) {
				alt102=1;
			}
			else if ( (LA102_0==VERTICAL_BAR) ) {
				alt102=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// PLSQLCommons.g:534:10: CONCATENATION_OP
					{
					root_0 = (Object)adaptor.nil();


					CONCATENATION_OP322=(Token)match(input,CONCATENATION_OP,FOLLOW_CONCATENATION_OP_in_concatenation_op5014); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONCATENATION_OP322_tree = (Object)adaptor.create(CONCATENATION_OP322);
					adaptor.addChild(root_0, CONCATENATION_OP322_tree);
					}

					}
					break;
				case 2 :
					// PLSQLCommons.g:535:10: b1= VERTICAL_BAR VERTICAL_BAR
					{
					b1=(Token)match(input,VERTICAL_BAR,FOLLOW_VERTICAL_BAR_in_concatenation_op5027); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VERTICAL_BAR.add(b1);

					VERTICAL_BAR323=(Token)match(input,VERTICAL_BAR,FOLLOW_VERTICAL_BAR_in_concatenation_op5029); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VERTICAL_BAR.add(VERTICAL_BAR323);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 535:39: -> CONCATENATION_OP[$b1, \"||\"]
					{
						adaptor.addChild(root_0, (Object)adaptor.create(CONCATENATION_OP, b1, "||"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concatenation_op"


	public static class outer_join_sign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "outer_join_sign"
	// PLSQLCommons.g:538:1: outer_join_sign : LEFT_PAREN PLUS_SIGN RIGHT_PAREN -> OUTER_JOIN_SIGN[$LEFT_PAREN, \"(+)\"] ;
	public final PLSQLParser_PLSQLCommons.outer_join_sign_return outer_join_sign() throws RecognitionException {
		PLSQLParser_PLSQLCommons.outer_join_sign_return retval = new PLSQLParser_PLSQLCommons.outer_join_sign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_PAREN324=null;
		Token PLUS_SIGN325=null;
		Token RIGHT_PAREN326=null;

		Object LEFT_PAREN324_tree=null;
		Object PLUS_SIGN325_tree=null;
		Object RIGHT_PAREN326_tree=null;
		RewriteRuleTokenStream stream_PLUS_SIGN=new RewriteRuleTokenStream(adaptor,"token PLUS_SIGN");
		RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
		RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");

		try {
			// PLSQLCommons.g:539:5: ( LEFT_PAREN PLUS_SIGN RIGHT_PAREN -> OUTER_JOIN_SIGN[$LEFT_PAREN, \"(+)\"] )
			// PLSQLCommons.g:539:10: LEFT_PAREN PLUS_SIGN RIGHT_PAREN
			{
			LEFT_PAREN324=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_outer_join_sign5054); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN324);

			PLUS_SIGN325=(Token)match(input,PLUS_SIGN,FOLLOW_PLUS_SIGN_in_outer_join_sign5056); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS_SIGN.add(PLUS_SIGN325);

			RIGHT_PAREN326=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_outer_join_sign5058); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN326);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 539:43: -> OUTER_JOIN_SIGN[$LEFT_PAREN, \"(+)\"]
			{
				adaptor.addChild(root_0, (Object)adaptor.create(OUTER_JOIN_SIGN, LEFT_PAREN324, "(+)"));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "outer_join_sign"

	// $ANTLR start synpred1_PLSQLCommons
	public final void synpred1_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:91:10: ( ( as_key )? ( id | alias_quoted_string ) )
		// PLSQLCommons.g:91:10: ( as_key )? ( id | alias_quoted_string )
		{
		// PLSQLCommons.g:91:10: ( as_key )?
		int alt103=2;
		int LA103_0 = input.LA(1);
		if ( (LA103_0==SQL92_RESERVED_AS) ) {
			alt103=1;
		}
		switch (alt103) {
			case 1 :
				// PLSQLCommons.g:91:10: as_key
				{
				pushFollow(FOLLOW_as_key_in_synpred1_PLSQLCommons454);
				gPLSQLParser.as_key();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		// PLSQLCommons.g:91:18: ( id | alias_quoted_string )
		int alt104=2;
		int LA104_0 = input.LA(1);
		if ( (LA104_0==DELIMITED_ID||LA104_0==INTRODUCER||LA104_0==REGULAR_ID) ) {
			alt104=1;
		}
		else if ( ((LA104_0 >= CHAR_STRING && LA104_0 <= CHAR_STRING_PERL)||LA104_0==NATIONAL_CHAR_STRING_LIT) ) {
			alt104=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 104, 0, input);
			throw nvae;
		}

		switch (alt104) {
			case 1 :
				// PLSQLCommons.g:91:19: id
				{
				pushFollow(FOLLOW_id_in_synpred1_PLSQLCommons458);
				id();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// PLSQLCommons.g:91:22: alias_quoted_string
				{
				pushFollow(FOLLOW_alias_quoted_string_in_synpred1_PLSQLCommons460);
				alias_quoted_string();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred1_PLSQLCommons

	// $ANTLR start synpred3_PLSQLCommons
	public final void synpred3_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:177:14: ( PERIOD id_expression )
		// PLSQLCommons.g:177:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred3_PLSQLCommons1155); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred3_PLSQLCommons1157);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_PLSQLCommons

	// $ANTLR start synpred4_PLSQLCommons
	public final void synpred4_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:182:14: ( PERIOD id_expression )
		// PLSQLCommons.g:182:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred4_PLSQLCommons1208); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred4_PLSQLCommons1210);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_PLSQLCommons

	// $ANTLR start synpred5_PLSQLCommons
	public final void synpred5_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:215:14: ( PERIOD id_expression )
		// PLSQLCommons.g:215:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred5_PLSQLCommons1479); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred5_PLSQLCommons1481);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_PLSQLCommons

	// $ANTLR start synpred6_PLSQLCommons
	public final void synpred6_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:225:25: ( PERIOD id_expression )
		// PLSQLCommons.g:225:26: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred6_PLSQLCommons1578); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred6_PLSQLCommons1580);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_PLSQLCommons

	// $ANTLR start synpred7_PLSQLCommons
	public final void synpred7_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:230:25: ( PERIOD id_expression )
		// PLSQLCommons.g:230:26: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred7_PLSQLCommons1629); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred7_PLSQLCommons1631);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_PLSQLCommons

	// $ANTLR start synpred8_PLSQLCommons
	public final void synpred8_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:235:14: ( PERIOD id_expression )
		// PLSQLCommons.g:235:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred8_PLSQLCommons1680); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred8_PLSQLCommons1682);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_PLSQLCommons

	// $ANTLR start synpred9_PLSQLCommons
	public final void synpred9_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:240:14: ( PERIOD id_expression )
		// PLSQLCommons.g:240:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred9_PLSQLCommons1733); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred9_PLSQLCommons1735);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_PLSQLCommons

	// $ANTLR start synpred10_PLSQLCommons
	public final void synpred10_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:245:14: ( PERIOD id_expression )
		// PLSQLCommons.g:245:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred10_PLSQLCommons1786); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred10_PLSQLCommons1788);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_PLSQLCommons

	// $ANTLR start synpred11_PLSQLCommons
	public final void synpred11_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:250:14: ( PERIOD id_expression )
		// PLSQLCommons.g:250:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred11_PLSQLCommons1839); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred11_PLSQLCommons1841);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_PLSQLCommons

	// $ANTLR start synpred12_PLSQLCommons
	public final void synpred12_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:256:28: ( PERIOD id_expression )
		// PLSQLCommons.g:256:29: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred12_PLSQLCommons1910); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred12_PLSQLCommons1912);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_PLSQLCommons

	// $ANTLR start synpred13_PLSQLCommons
	public final void synpred13_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:278:14: ( PERIOD id_expression )
		// PLSQLCommons.g:278:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred13_PLSQLCommons2114); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred13_PLSQLCommons2116);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_PLSQLCommons

	// $ANTLR start synpred14_PLSQLCommons
	public final void synpred14_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:288:14: ( PERIOD id_expression )
		// PLSQLCommons.g:288:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred14_PLSQLCommons2202); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred14_PLSQLCommons2204);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_PLSQLCommons

	// $ANTLR start synpred15_PLSQLCommons
	public final void synpred15_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:293:14: ( PERIOD id_expression )
		// PLSQLCommons.g:293:15: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred15_PLSQLCommons2255); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred15_PLSQLCommons2257);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_PLSQLCommons

	// $ANTLR start synpred16_PLSQLCommons
	public final void synpred16_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:305:25: ( PERIOD id_expression )
		// PLSQLCommons.g:305:26: PERIOD id_expression
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred16_PLSQLCommons2391); if (state.failed) return;

		pushFollow(FOLLOW_id_expression_in_synpred16_PLSQLCommons2393);
		id_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_PLSQLCommons

	// $ANTLR start synpred17_PLSQLCommons
	public final void synpred17_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:343:19: ( tableview_name PERIOD ASTERISK )
		// PLSQLCommons.g:343:20: tableview_name PERIOD ASTERISK
		{
		pushFollow(FOLLOW_tableview_name_in_synpred17_PLSQLCommons2788);
		tableview_name();
		state._fsp--;
		if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred17_PLSQLCommons2790); if (state.failed) return;

		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred17_PLSQLCommons2792); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_PLSQLCommons

	// $ANTLR start synpred18_PLSQLCommons
	public final void synpred18_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:358:11: ( id EQUALS_OP GREATER_THAN_OP )
		// PLSQLCommons.g:358:12: id EQUALS_OP GREATER_THAN_OP
		{
		pushFollow(FOLLOW_id_in_synpred18_PLSQLCommons2972);
		id();
		state._fsp--;
		if (state.failed) return;

		match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_synpred18_PLSQLCommons2974); if (state.failed) return;

		match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_synpred18_PLSQLCommons2976); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_PLSQLCommons

	// $ANTLR start synpred19_PLSQLCommons
	public final void synpred19_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:446:11: ( PERIOD general_element_id )
		// PLSQLCommons.g:446:12: PERIOD general_element_id
		{
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred19_PLSQLCommons4069); if (state.failed) return;

		pushFollow(FOLLOW_general_element_id_in_synpred19_PLSQLCommons4071);
		general_element_id();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_PLSQLCommons

	// $ANTLR start synpred20_PLSQLCommons
	public final void synpred20_PLSQLCommons_fragment() throws RecognitionException {
		// PLSQLCommons.g:454:15: ( LEFT_PAREN ~ PLUS_SIGN )
		// PLSQLCommons.g:454:16: LEFT_PAREN ~ PLUS_SIGN
		{
		match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred20_PLSQLCommons4187); if (state.failed) return;

		if ( (input.LA(1) >= A && input.LA(1) <= PLSQL_RESERVED_VIEWS)||(input.LA(1) >= PROMPT && input.LA(1) <= YMINTERVAL_UNCONSTRAINED_VK) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred20_PLSQLCommons

	// Delegated rules

	public final boolean synpred17_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_PLSQLCommons() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_PLSQLCommons_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA34 dfa34 = new DFA34(this);
	protected DFA38 dfa38 = new DFA38(this);
	protected DFA57 dfa57 = new DFA57(this);
	protected DFA77 dfa77 = new DFA77(this);
	protected DFA79 dfa79 = new DFA79(this);
	protected DFA95 dfa95 = new DFA95(this);
	static final String DFA34_eotS =
		"\137\uffff";
	static final String DFA34_eofS =
		"\1\3\136\uffff";
	static final String DFA34_minS =
		"\1\6\1\uffff\1\0\134\uffff";
	static final String DFA34_maxS =
		"\1\u00ae\1\uffff\1\0\134\uffff";
	static final String DFA34_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\132\uffff\1\2";
	static final String DFA34_specialS =
		"\2\uffff\1\0\134\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\3\1\uffff\1\3\1\1\1\uffff\1\3\2\uffff\5\3\2\uffff\1\3\1\uffff\1\3"+
			"\1\uffff\1\3\1\uffff\3\3\2\uffff\2\3\3\uffff\1\3\3\uffff\4\3\1\uffff"+
			"\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\3\3\1\uffff\1\3\2\uffff\1\3\11\uffff"+
			"\2\3\5\uffff\1\3\2\uffff\1\3\13\uffff\1\2\2\3\1\uffff\1\3\2\uffff\1\3"+
			"\1\uffff\1\3\1\uffff\13\3\1\uffff\7\3\1\uffff\2\3\1\uffff\5\3\2\uffff"+
			"\14\3\1\uffff\2\3\1\uffff\2\3\2\uffff\1\3\3\uffff\7\3\1\uffff\3\3\4\uffff"+
			"\1\3\1\uffff\1\3",
			"",
			"\1\uffff",
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
			""
	};

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "294:5: ( AT_SIGN link_name |{...}? => partition_extension_clause )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA34_2 = input.LA(1);
						 
						int index34_2 = input.index();
						input.rewind();
						s = -1;
						if ( ((((input.LT(1).getText().equalsIgnoreCase("subpartition"))||(input.LT(1).getText().equalsIgnoreCase("partition")))&&(!(input.LA(2) == SQL92_RESERVED_BY)))) ) {s = 94;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index34_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 34, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA38_eotS =
		"\106\uffff";
	static final String DFA38_eofS =
		"\1\2\105\uffff";
	static final String DFA38_minS =
		"\1\7\1\0\104\uffff";
	static final String DFA38_maxS =
		"\1\u00ae\1\0\104\uffff";
	static final String DFA38_acceptS =
		"\2\uffff\1\2\102\uffff\1\1";
	static final String DFA38_specialS =
		"\1\uffff\1\0\104\uffff}>";
	static final String[] DFA38_transitionS = {
			"\2\2\5\uffff\3\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\1\2\2\uffff\2\2\3\uffff\1\2\3\uffff\4\2\1\uffff\1\2\1\uffff"+
			"\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff\1\2\2\uffff\1\2\11\uffff\2\2\5\uffff"+
			"\1\2\2\uffff\1\2\13\uffff\1\1\2\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\2"+
			"\1\uffff\2\2\1\uffff\2\2\2\uffff\1\2\5\uffff\3\2\2\uffff\2\2\3\uffff"+
			"\3\2\2\uffff\11\2\2\uffff\1\2\1\uffff\2\2\5\uffff\1\2\3\uffff\2\2\1\uffff"+
			"\1\2\1\uffff\1\2\2\uffff\3\2\6\uffff\1\2",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "319:22: ( over_clause )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA38_1 = input.LA(1);
						 
						int index38_1 = input.index();
						input.rewind();
						s = -1;
						if ( ((input.LT(1).getText().equalsIgnoreCase("over"))) ) {s = 69;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index38_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 38, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA57_eotS =
		"\33\uffff";
	static final String DFA57_eofS =
		"\33\uffff";
	static final String DFA57_minS =
		"\1\6\1\27\1\6\1\10\1\uffff\2\27\1\6\15\uffff\1\6\1\27\1\10\1\uffff\2\27";
	static final String DFA57_maxS =
		"\1\u00ac\1\134\2\u00ae\1\uffff\2\u0095\1\u00ac\15\uffff\1\u00ac\1\134"+
		"\1\u00ae\1\uffff\2\u0095";
	static final String DFA57_acceptS =
		"\4\uffff\1\2\3\uffff\15\2\3\uffff\1\1\2\uffff";
	static final String DFA57_specialS =
		"\2\uffff\1\0\4\uffff\1\1\15\uffff\1\2\5\uffff}>";
	static final String[] DFA57_transitionS = {
			"\1\4\4\uffff\1\4\3\uffff\3\4\5\uffff\1\3\4\uffff\1\4\10\uffff\1\1\4\uffff"+
			"\1\4\3\uffff\1\4\1\uffff\1\4\6\uffff\1\4\30\uffff\1\4\13\uffff\1\2\10"+
			"\uffff\1\4\2\uffff\1\4\5\uffff\1\4\4\uffff\2\4\1\uffff\2\4\1\uffff\1"+
			"\4\4\uffff\2\4\15\uffff\2\4\6\uffff\1\4\11\uffff\1\4\14\uffff\1\4",
			"\1\6\104\uffff\1\5",
			"\1\21\1\uffff\1\24\2\uffff\1\17\2\uffff\1\24\2\22\1\17\1\24\2\uffff"+
			"\1\24\1\uffff\1\16\3\uffff\1\7\1\21\1\24\2\uffff\2\24\3\uffff\1\16\3"+
			"\uffff\4\24\1\uffff\1\4\1\uffff\1\22\1\uffff\1\24\2\uffff\2\24\1\11\30"+
			"\uffff\1\4\13\uffff\1\12\1\uffff\1\24\4\uffff\1\24\1\uffff\1\13\1\uffff"+
			"\1\24\1\15\3\uffff\1\24\1\uffff\1\13\5\uffff\1\21\1\uffff\1\23\1\20\1"+
			"\uffff\1\13\4\uffff\1\14\1\23\7\uffff\1\24\3\uffff\3\24\1\23\3\uffff"+
			"\1\24\2\uffff\1\10\11\uffff\1\23\14\uffff\1\21\1\uffff\1\24",
			"\1\24\5\uffff\1\24\3\uffff\1\24\2\uffff\1\24\5\uffff\1\25\1\uffff\1"+
			"\24\2\uffff\2\24\7\uffff\4\24\1\uffff\1\24\3\uffff\1\24\2\uffff\2\24"+
			"\31\uffff\1\24\13\uffff\1\24\1\uffff\1\24\4\uffff\1\24\3\uffff\1\24\4"+
			"\uffff\1\24\32\uffff\1\24\3\uffff\3\24\4\uffff\1\24\33\uffff\1\24",
			"",
			"\1\3\36\uffff\1\26\45\uffff\1\27\32\uffff\1\24\6\uffff\1\24\26\uffff"+
			"\1\24",
			"\1\3\36\uffff\1\26\45\uffff\1\27\32\uffff\1\24\6\uffff\1\24\26\uffff"+
			"\1\24",
			"\1\24\4\uffff\1\24\3\uffff\3\24\5\uffff\1\24\4\uffff\1\24\3\uffff\1"+
			"\30\4\uffff\1\24\4\uffff\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24"+
			"\30\uffff\1\24\13\uffff\1\24\10\uffff\1\24\2\uffff\1\24\5\uffff\1\24"+
			"\5\uffff\1\24\1\uffff\2\24\1\uffff\1\24\4\uffff\2\24\16\uffff\1\24\6"+
			"\uffff\1\24\11\uffff\1\24\14\uffff\1\24",
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
			"\1\24\4\uffff\1\24\3\uffff\3\24\5\uffff\1\24\4\uffff\1\24\3\uffff\1"+
			"\30\4\uffff\1\24\4\uffff\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24"+
			"\30\uffff\1\24\13\uffff\1\24\10\uffff\1\24\2\uffff\1\24\5\uffff\1\24"+
			"\5\uffff\1\24\1\uffff\2\24\1\uffff\1\24\4\uffff\2\24\16\uffff\1\24\6"+
			"\uffff\1\24\11\uffff\1\24\14\uffff\1\24",
			"\1\32\104\uffff\1\31",
			"\1\24\5\uffff\1\24\3\uffff\1\24\2\uffff\1\24\5\uffff\1\25\1\uffff\1"+
			"\24\2\uffff\2\24\7\uffff\4\24\1\uffff\1\24\3\uffff\1\24\2\uffff\2\24"+
			"\31\uffff\1\24\13\uffff\1\24\1\uffff\1\24\4\uffff\1\24\3\uffff\1\24\4"+
			"\uffff\1\24\32\uffff\1\24\3\uffff\3\24\4\uffff\1\24\33\uffff\1\24",
			"",
			"\1\3\36\uffff\1\26\45\uffff\1\27\32\uffff\1\24\6\uffff\1\24\26\uffff"+
			"\1\24",
			"\1\3\36\uffff\1\26\45\uffff\1\27\32\uffff\1\24\6\uffff\1\24\26\uffff"+
			"\1\24"
	};

	static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
	static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
	static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
	static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
	static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
	static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
	static final short[][] DFA57_transition;

	static {
		int numStates = DFA57_transitionS.length;
		DFA57_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
		}
	}

	protected class DFA57 extends DFA {

		public DFA57(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 57;
			this.eot = DFA57_eot;
			this.eof = DFA57_eof;
			this.min = DFA57_min;
			this.max = DFA57_max;
			this.accept = DFA57_accept;
			this.special = DFA57_special;
			this.transition = DFA57_transition;
		}
		@Override
		public String getDescription() {
			return "358:10: ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA57_2 = input.LA(1);
						 
						int index57_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA57_2==EQUALS_OP) ) {s = 7;}
						else if ( (LA57_2==MINUS_SIGN||LA57_2==PLUS_SIGN) ) {s = 4;}
						else if ( (LA57_2==SQL92_RESERVED_PRIOR) && (((input.LT(1).getText().equalsIgnoreCase("interval"))||((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))))) {s = 8;}
						else if ( (LA57_2==PLSQL_NON_RESERVED_CONNECT_BY_ROOT) && (((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))))) {s = 9;}
						else if ( (LA57_2==REGULAR_ID) ) {s = 10;}
						else if ( (LA57_2==SQL92_RESERVED_ALL||LA57_2==SQL92_RESERVED_CASE||LA57_2==SQL92_RESERVED_DISTINCT) && (((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))))) {s = 11;}
						else if ( (LA57_2==SQL92_RESERVED_EXISTS) && (((input.LT(1).getText().equalsIgnoreCase("interval"))||((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))))) {s = 12;}
						else if ( (LA57_2==SQL92_RESERVED_ANY) && (((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))))) {s = 13;}
						else if ( (LA57_2==DELIMITED_ID||LA57_2==INTRODUCER) && (((input.LT(1).getText().equalsIgnoreCase("interval"))||((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))))) {s = 14;}
						else if ( (LA57_2==BINDVAR||LA57_2==COLON) ) {s = 15;}
						else if ( (LA57_2==SQL92_RESERVED_DELETE) && (((input.LT(1).getText().equalsIgnoreCase("interval"))||((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))))) {s = 16;}
						else if ( (LA57_2==APPROXIMATE_NUM_LIT||LA57_2==EXACT_NUM_LIT||LA57_2==SQL92_RESERVED_DATE||LA57_2==UNSIGNED_INTEGER) && (((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))))) {s = 17;}
						else if ( ((LA57_2 >= CHAR_STRING && LA57_2 <= CHAR_STRING_PERL)||LA57_2==NATIONAL_CHAR_STRING_LIT) ) {s = 18;}
						else if ( (LA57_2==SQL92_RESERVED_DEFAULT||LA57_2==SQL92_RESERVED_FALSE||LA57_2==SQL92_RESERVED_NULL||LA57_2==SQL92_RESERVED_TRUE) && (((input.LT(1).getText().equalsIgnoreCase("new"))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))))) {s = 19;}
						else if ( (LA57_2==ASTERISK||LA57_2==CARRET_OPERATOR_PART||LA57_2==COMMA||LA57_2==CONCATENATION_OP||LA57_2==EXCLAMATION_OPERATOR_PART||(LA57_2 >= GREATER_THAN_OP && LA57_2 <= GREATER_THAN_OR_EQUALS_OP)||(LA57_2 >= LEFT_BRACKET && LA57_2 <= LESS_THAN_OR_EQUALS_OP)||LA57_2==NOT_EQUAL_OP||(LA57_2 >= PERCENT && LA57_2 <= PERIOD)||LA57_2==RIGHT_PAREN||LA57_2==SOLIDUS||LA57_2==SQL92_RESERVED_AND||LA57_2==SQL92_RESERVED_BETWEEN||LA57_2==SQL92_RESERVED_IN||(LA57_2 >= SQL92_RESERVED_IS && LA57_2 <= SQL92_RESERVED_NOT)||LA57_2==SQL92_RESERVED_OR||LA57_2==VERTICAL_BAR) ) {s = 20;}
						 
						input.seek(index57_2);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA57_7 = input.LA(1);
						 
						int index57_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA57_7==GREATER_THAN_OP) && (synpred18_PLSQLCommons())) {s = 24;}
						else if ( (LA57_7==APPROXIMATE_NUM_LIT||LA57_7==BINDVAR||(LA57_7 >= CHAR_STRING && LA57_7 <= COLON)||LA57_7==DELIMITED_ID||LA57_7==EXACT_NUM_LIT||LA57_7==INTRODUCER||LA57_7==LEFT_PAREN||LA57_7==MINUS_SIGN||LA57_7==NATIONAL_CHAR_STRING_LIT||LA57_7==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA57_7==PLUS_SIGN||LA57_7==REGULAR_ID||LA57_7==SQL92_RESERVED_ALL||LA57_7==SQL92_RESERVED_ANY||LA57_7==SQL92_RESERVED_CASE||LA57_7==SQL92_RESERVED_DATE||(LA57_7 >= SQL92_RESERVED_DEFAULT && LA57_7 <= SQL92_RESERVED_DELETE)||LA57_7==SQL92_RESERVED_DISTINCT||(LA57_7 >= SQL92_RESERVED_EXISTS && LA57_7 <= SQL92_RESERVED_FALSE)||LA57_7==SQL92_RESERVED_NULL||LA57_7==SQL92_RESERVED_PRIOR||LA57_7==SQL92_RESERVED_TRUE||LA57_7==UNSIGNED_INTEGER) ) {s = 20;}
						 
						input.seek(index57_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA57_21 = input.LA(1);
						 
						int index57_21 = input.index();
						input.rewind();
						s = -1;
						if ( (LA57_21==GREATER_THAN_OP) && (synpred18_PLSQLCommons())) {s = 24;}
						else if ( (LA57_21==APPROXIMATE_NUM_LIT||LA57_21==BINDVAR||(LA57_21 >= CHAR_STRING && LA57_21 <= COLON)||LA57_21==DELIMITED_ID||LA57_21==EXACT_NUM_LIT||LA57_21==INTRODUCER||LA57_21==LEFT_PAREN||LA57_21==MINUS_SIGN||LA57_21==NATIONAL_CHAR_STRING_LIT||LA57_21==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA57_21==PLUS_SIGN||LA57_21==REGULAR_ID||LA57_21==SQL92_RESERVED_ALL||LA57_21==SQL92_RESERVED_ANY||LA57_21==SQL92_RESERVED_CASE||LA57_21==SQL92_RESERVED_DATE||(LA57_21 >= SQL92_RESERVED_DEFAULT && LA57_21 <= SQL92_RESERVED_DELETE)||LA57_21==SQL92_RESERVED_DISTINCT||(LA57_21 >= SQL92_RESERVED_EXISTS && LA57_21 <= SQL92_RESERVED_FALSE)||LA57_21==SQL92_RESERVED_NULL||LA57_21==SQL92_RESERVED_PRIOR||LA57_21==SQL92_RESERVED_TRUE||LA57_21==UNSIGNED_INTEGER) ) {s = 20;}
						 
						input.seek(index57_21);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 57, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA77_eotS =
		"\43\uffff";
	static final String DFA77_eofS =
		"\1\1\42\uffff";
	static final String DFA77_minS =
		"\1\7\1\uffff\2\27\5\0\2\27\1\uffff\1\27\12\0\2\27\12\0";
	static final String DFA77_maxS =
		"\1\u00ae\1\uffff\1\u0095\1\134\5\0\2\u0095\1\uffff\1\134\12\0\2\u0095"+
		"\12\0";
	static final String DFA77_acceptS =
		"\1\uffff\1\2\11\uffff\1\1\27\uffff";
	static final String DFA77_specialS =
		"\4\uffff\1\0\1\24\1\5\1\17\1\12\4\uffff\1\1\1\25\1\6\1\20\1\13\1\2\1\26"+
		"\1\7\1\21\1\14\2\uffff\1\3\1\27\1\10\1\22\1\15\1\4\1\30\1\11\1\23\1\16}>";
	static final String[] DFA77_transitionS = {
			"\2\1\5\uffff\3\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\2\1\3\uffff\1\1\3\uffff\4\1\1\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\1\1\1\2\2\uffff\1\1\2\uffff\1\1\11\uffff\2\1"+
			"\5\uffff\1\1\2\uffff\1\1\13\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\2\1\1\uffff\2\1\2\uffff\1\1\3\uffff\1\1\1\uffff\3\1\2\uffff"+
			"\2\1\3\uffff\3\1\2\uffff\11\1\2\uffff\1\1\1\uffff\2\1\5\uffff\1\1\3\uffff"+
			"\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\6\uffff\1\1",
			"",
			"\1\5\15\uffff\1\3\66\uffff\1\4\32\uffff\1\6\6\uffff\1\7\26\uffff\1\10",
			"\1\12\104\uffff\1\11",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\16\36\uffff\1\14\45\uffff\1\15\32\uffff\1\17\6\uffff\1\20\26\uffff"+
			"\1\21",
			"\1\23\36\uffff\1\14\45\uffff\1\22\32\uffff\1\24\6\uffff\1\25\26\uffff"+
			"\1\26",
			"",
			"\1\30\104\uffff\1\27",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\32\36\uffff\1\14\45\uffff\1\31\32\uffff\1\33\6\uffff\1\34\26\uffff"+
			"\1\35",
			"\1\37\36\uffff\1\14\45\uffff\1\36\32\uffff\1\40\6\uffff\1\41\26\uffff"+
			"\1\42",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
	static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
	static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
	static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
	static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
	static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
	static final short[][] DFA77_transition;

	static {
		int numStates = DFA77_transitionS.length;
		DFA77_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
		}
	}

	protected class DFA77 extends DFA {

		public DFA77(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 77;
			this.eot = DFA77_eot;
			this.eof = DFA77_eof;
			this.min = DFA77_min;
			this.max = DFA77_max;
			this.accept = DFA77_accept;
			this.special = DFA77_special;
			this.transition = DFA77_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 446:10: ( ( PERIOD general_element_id )=> PERIOD general_element_id )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA77_4 = input.LA(1);
						 
						int index77_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_4);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA77_13 = input.LA(1);
						 
						int index77_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_13);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA77_18 = input.LA(1);
						 
						int index77_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_18);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA77_25 = input.LA(1);
						 
						int index77_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_25);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA77_30 = input.LA(1);
						 
						int index77_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_30);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA77_6 = input.LA(1);
						 
						int index77_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA77_15 = input.LA(1);
						 
						int index77_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_15);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA77_20 = input.LA(1);
						 
						int index77_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_20);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA77_27 = input.LA(1);
						 
						int index77_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_27);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA77_32 = input.LA(1);
						 
						int index77_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_32);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA77_8 = input.LA(1);
						 
						int index77_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_8);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA77_17 = input.LA(1);
						 
						int index77_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_17);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA77_22 = input.LA(1);
						 
						int index77_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_22);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA77_29 = input.LA(1);
						 
						int index77_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_29);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA77_34 = input.LA(1);
						 
						int index77_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_34);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA77_7 = input.LA(1);
						 
						int index77_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_7);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA77_16 = input.LA(1);
						 
						int index77_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_16);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA77_21 = input.LA(1);
						 
						int index77_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_21);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA77_28 = input.LA(1);
						 
						int index77_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_28);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA77_33 = input.LA(1);
						 
						int index77_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_33);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA77_5 = input.LA(1);
						 
						int index77_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_5);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA77_14 = input.LA(1);
						 
						int index77_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_14);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA77_19 = input.LA(1);
						 
						int index77_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_19);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA77_26 = input.LA(1);
						 
						int index77_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_26);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA77_31 = input.LA(1);
						 
						int index77_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred19_PLSQLCommons()) ) {s = 11;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index77_31);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 77, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA79_eotS =
		"\106\uffff";
	static final String DFA79_eofS =
		"\1\1\105\uffff";
	static final String DFA79_minS =
		"\1\7\45\uffff\1\0\37\uffff";
	static final String DFA79_maxS =
		"\1\u00ae\45\uffff\1\0\37\uffff";
	static final String DFA79_acceptS =
		"\1\uffff\1\3\102\uffff\1\1\1\2";
	static final String DFA79_specialS =
		"\46\uffff\1\0\37\uffff}>";
	static final String[] DFA79_transitionS = {
			"\2\1\5\uffff\3\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\2\1\3\uffff\1\1\3\uffff\1\1\1\46\2\1\1\uffff"+
			"\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\104\2\uffff\1\1\2\uffff\1"+
			"\1\11\uffff\2\1\5\uffff\1\1\2\uffff\1\1\13\uffff\3\1\1\uffff\1\1\2\uffff"+
			"\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\2\1\2\uffff\1\1\5\uffff\3\1\2\uffff"+
			"\2\1\3\uffff\3\1\2\uffff\11\1\2\uffff\1\1\1\uffff\2\1\5\uffff\1\1\3\uffff"+
			"\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\6\uffff\1\1",
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
			"\1\uffff",
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
			""
	};

	static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
	static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
	static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
	static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
	static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
	static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
	static final short[][] DFA79_transition;

	static {
		int numStates = DFA79_transitionS.length;
		DFA79_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
		}
	}

	protected class DFA79 extends DFA {

		public DFA79(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 79;
			this.eot = DFA79_eot;
			this.eof = DFA79_eof;
			this.min = DFA79_min;
			this.max = DFA79_max;
			this.accept = DFA79_accept;
			this.special = DFA79_special;
			this.transition = DFA79_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 452:9: ( PERIOD r+= general_element_id | ( LEFT_PAREN ~ PLUS_SIGN )=>r+= function_argument )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA79_38 = input.LA(1);
						 
						int index79_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_PLSQLCommons()) ) {s = 69;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index79_38);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 79, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA95_eotS =
		"\44\uffff";
	static final String DFA95_eofS =
		"\11\uffff\2\22\11\uffff\1\22\2\uffff\2\22\1\uffff\5\22\5\uffff";
	static final String DFA95_minS =
		"\1\6\1\13\7\uffff\2\10\1\u00ac\5\uffff\1\0\1\uffff\1\0\1\10\1\u00ac\1"+
		"\27\2\10\1\27\5\10\5\27";
	static final String DFA95_maxS =
		"\1\u00ac\1\u0095\7\uffff\2\u00ae\1\u00ac\5\uffff\1\0\1\uffff\1\0\1\u00ae"+
		"\1\u00ac\1\u0095\2\u00ae\1\134\5\u00ae\2\u0095\1\134\2\u0095";
	static final String DFA95_acceptS =
		"\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\15\3\uffff\1\2\1\11\1\12\1\13\1\14"+
		"\1\uffff\1\1\21\uffff";
	static final String DFA95_specialS =
		"\1\uffff\1\0\17\uffff\1\1\1\uffff\1\2\20\uffff}>";
	static final String[] DFA95_transitionS = {
			"\1\2\10\uffff\2\4\13\uffff\1\2\21\uffff\1\2\1\uffff\1\4\53\uffff\1\1"+
			"\27\uffff\1\3\1\uffff\1\10\10\uffff\1\7\16\uffff\1\5\20\uffff\1\6\14"+
			"\uffff\1\2",
			"\1\12\3\uffff\2\11\1\13\5\uffff\1\14\15\uffff\1\14\12\uffff\1\11\53"+
			"\uffff\1\14\32\uffff\1\14\6\uffff\1\14\26\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\2\uffff"+
			"\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2\22\1\uffff"+
			"\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22\2\uffff\1\22"+
			"\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2\uffff\1\22\1"+
			"\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff\1\22\2\uffff"+
			"\3\22\6\uffff\1\22",
			"\1\22\2\uffff\1\24\2\uffff\3\22\1\25\1\22\2\uffff\1\22\1\uffff\1\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff"+
			"\4\22\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff"+
			"\1\22\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1"+
			"\23\2\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11"+
			"\22\2\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22"+
			"\1\uffff\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\27",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\30",
			"\1\33\15\uffff\1\31\66\uffff\1\32\32\uffff\1\34\6\uffff\1\35\26\uffff"+
			"\1\36",
			"\1\22\2\uffff\1\24\2\uffff\3\22\1\25\1\22\2\uffff\1\22\1\uffff\1\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff"+
			"\4\22\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff"+
			"\1\22\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1"+
			"\23\2\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff"+
			"\2\22\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11"+
			"\22\2\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22"+
			"\1\uffff\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\40\104\uffff\1\37",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\22\5\uffff\3\22\1\uffff\1\22\2\uffff\1\22\1\uffff\1\22\1\uffff\1"+
			"\22\1\uffff\1\22\1\uffff\1\22\2\uffff\2\22\3\uffff\1\22\3\uffff\4\22"+
			"\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\26\2\uffff\1\22"+
			"\2\uffff\1\22\11\uffff\2\22\5\uffff\1\22\2\uffff\1\22\13\uffff\1\21\2"+
			"\22\1\uffff\1\22\2\uffff\1\22\3\uffff\1\22\1\uffff\2\22\1\uffff\2\22"+
			"\2\uffff\1\22\5\uffff\3\22\2\uffff\2\22\3\uffff\3\22\2\uffff\11\22\2"+
			"\uffff\1\22\1\uffff\2\22\5\uffff\1\22\3\uffff\2\22\1\uffff\1\22\1\uffff"+
			"\1\22\2\uffff\3\22\6\uffff\1\22",
			"\1\33\36\uffff\1\41\45\uffff\1\32\32\uffff\1\34\6\uffff\1\35\26\uffff"+
			"\1\36",
			"\1\33\36\uffff\1\41\45\uffff\1\32\32\uffff\1\34\6\uffff\1\35\26\uffff"+
			"\1\36",
			"\1\43\104\uffff\1\42",
			"\1\33\36\uffff\1\41\45\uffff\1\32\32\uffff\1\34\6\uffff\1\35\26\uffff"+
			"\1\36",
			"\1\33\36\uffff\1\41\45\uffff\1\32\32\uffff\1\34\6\uffff\1\35\26\uffff"+
			"\1\36"
	};

	static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
	static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
	static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
	static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
	static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
	static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
	static final short[][] DFA95_transition;

	static {
		int numStates = DFA95_transitionS.length;
		DFA95_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
		}
	}

	protected class DFA95 extends DFA {

		public DFA95(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 95;
			this.eot = DFA95_eot;
			this.eof = DFA95_eof;
			this.min = DFA95_min;
			this.max = DFA95_max;
			this.accept = DFA95_accept;
			this.special = DFA95_special;
			this.transition = DFA95_transition;
		}
		@Override
		public String getDescription() {
			return "472:1: constant : ( timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )? | interval_key ( quoted_string | bind_variable | general_element_id ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )? | numeric | date_key quoted_string | quoted_string | null_key | true_key | false_key | dbtimezone_key | sessiontimezone_key | minvalue_key | maxvalue_key | default_key );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA95_1 = input.LA(1);
						 
						int index95_1 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA95_1 >= CHAR_STRING && LA95_1 <= CHAR_STRING_PERL)||LA95_1==NATIONAL_CHAR_STRING_LIT) ) {s = 9;}
						else if ( (LA95_1==BINDVAR) ) {s = 10;}
						else if ( (LA95_1==COLON) ) {s = 11;}
						else if ( (LA95_1==DELIMITED_ID||LA95_1==INTRODUCER||LA95_1==REGULAR_ID||LA95_1==SQL92_RESERVED_DELETE||LA95_1==SQL92_RESERVED_EXISTS||LA95_1==SQL92_RESERVED_PRIOR) && ((input.LT(1).getText().equalsIgnoreCase("interval")))) {s = 12;}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("dbtimezone"))) ) {s = 13;}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("sessiontimezone"))) ) {s = 14;}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("minvalue"))) ) {s = 15;}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("maxvalue"))) ) {s = 16;}
						 
						input.seek(index95_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA95_17 = input.LA(1);
						 
						int index95_17 = input.index();
						input.rewind();
						s = -1;
						if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp"))) ) {s = 18;}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("interval"))) ) {s = 12;}
						 
						input.seek(index95_17);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA95_19 = input.LA(1);
						 
						int index95_19 = input.index();
						input.rewind();
						s = -1;
						if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp"))) ) {s = 18;}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("interval"))) ) {s = 12;}
						 
						input.seek(index95_19);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 95, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_subpartition_key_in_partition_extension_clause402 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_partition_key_in_partition_extension_clause407 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_for_key_in_partition_extension_clause421 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_expression_list_in_partition_extension_clause425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_as_key_in_column_alias454 = new BitSet(new long[]{0x0001002000818000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_in_column_alias458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_quoted_string_in_column_alias460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_as_key_in_column_alias491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_table_alias513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_quoted_string_in_table_alias517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quoted_string_in_alias_quoted_string557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_where_key_in_where_clause590 = new BitSet(new long[]{0x0081442010838840L,0xC2DC412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_current_of_clause_in_where_clause594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_wrapper_in_where_clause596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_current_key_in_current_of_clause617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_of_key_in_current_of_clause620 = new BitSet(new long[]{0x0000002000820800L,0x0000000010000000L});
	public static final BitSet FOLLOW_cursor_name_in_current_of_clause623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_into_key_in_into_clause643 = new BitSet(new long[]{0x0000002000820800L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_in_into_clause646 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_into_clause649 = new BitSet(new long[]{0x0000002000820800L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_in_into_clause652 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_bulk_key_in_into_clause666 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_collect_key_in_into_clause669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_into_key_in_into_clause672 = new BitSet(new long[]{0x0000002000820800L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_in_into_clause675 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_into_clause678 = new BitSet(new long[]{0x0000002000820800L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_in_into_clause681 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_id_in_xml_column_name708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quoted_string_in_xml_column_name727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_cost_class_name756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_attribute_name792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_savepoint_name828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_rollback_segment_name864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_table_var_name901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_schema_name937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_routine_name973 = new BitSet(new long[]{0x0040000000000202L});
	public static final BitSet FOLLOW_routine_name_part_after_period_in_routine_name975 = new BitSet(new long[]{0x0040000000000202L});
	public static final BitSet FOLLOW_AT_SIGN_in_routine_name979 = new BitSet(new long[]{0x0000002000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_link_name_in_routine_name981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_routine_name_part_after_period1043 = new BitSet(new long[]{0x0000000000800000L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_routine_id_in_routine_name_part_after_period1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_expression_in_routine_id1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_DELETE_in_routine_id1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_EXISTS_in_routine_id1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_PRIOR_in_routine_id1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_package_name1151 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_package_name1161 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_package_name1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_implementation_type_name1204 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_implementation_type_name1214 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_implementation_type_name1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_parameter_name1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_reference_model_name1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_main_model_name1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_element_id_in_aggregate_function_name1366 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_aggregate_function_name1390 = new BitSet(new long[]{0x0000002000800000L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_id_in_aggregate_function_name1394 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_id_in_query_name1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_constraint_name1475 = new BitSet(new long[]{0x0040000000000202L});
	public static final BitSet FOLLOW_PERIOD_in_constraint_name1485 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_constraint_name1487 = new BitSet(new long[]{0x0040000000000202L});
	public static final BitSet FOLLOW_AT_SIGN_in_constraint_name1492 = new BitSet(new long[]{0x0000002000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_link_name_in_constraint_name1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_expression_in_label_name1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_expression_in_type_name1574 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_type_name1584 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_type_name1586 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_id_expression_in_sequence_name1625 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_sequence_name1635 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_sequence_name1637 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_id_in_exception_name1676 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_exception_name1686 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_exception_name1688 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_id_in_function_name1729 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_function_name1739 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_function_name1741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_procedure_name1782 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_procedure_name1792 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_procedure_name1794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_trigger_name1835 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_trigger_name1845 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_trigger_name1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTRODUCER_in_variable_name1888 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_char_set_name_in_variable_name1890 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_variable_name1906 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_variable_name1916 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_variable_name1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bind_variable_in_variable_name1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_index_name1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_cursor_name2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bind_variable_in_cursor_name2028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_record_name2070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bind_variable_in_record_name2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_collection_name2110 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_collection_name2120 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_collection_name2122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_link_name2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_column_name2198 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_column_name2208 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_column_name2210 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_id_in_tableview_name2251 = new BitSet(new long[]{0x0040000000000202L,0x0000000010000000L});
	public static final BitSet FOLLOW_PERIOD_in_tableview_name2261 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_tableview_name2263 = new BitSet(new long[]{0x0000000000000202L,0x0000000010000000L});
	public static final BitSet FOLLOW_AT_SIGN_in_tableview_name2277 = new BitSet(new long[]{0x0000002000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_link_name_in_tableview_name2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partition_extension_clause_in_tableview_name2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_expression_in_view_name2348 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_view_name2351 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_view_name2353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_expression_in_char_set_name2387 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_char_set_name2397 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_char_set_name2399 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_keep_key_in_keep_clause2441 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_keep_clause2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_dense_rank_key_in_keep_clause2467 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_first_key_in_keep_clause2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_last_key_in_keep_clause2472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_order_by_clause_in_keep_clause2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_keep_clause2498 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_over_clause_in_keep_clause2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_function_argument2522 = new BitSet(new long[]{0x0081442010878840L,0xC2D8412050010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_argument_in_function_argument2537 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_function_argument2541 = new BitSet(new long[]{0x0081442010838840L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_argument_in_function_argument2543 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_function_argument2557 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_keep_clause_in_function_argument2567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_function_argument_analytic2608 = new BitSet(new long[]{0x0081442010878840L,0xC2D8412050010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_argument_in_function_argument_analytic2623 = new BitSet(new long[]{0x0000000000040000L,0x0000000050000000L});
	public static final BitSet FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2625 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_function_argument_analytic2643 = new BitSet(new long[]{0x0081442010838840L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_argument_in_function_argument_analytic2645 = new BitSet(new long[]{0x0000000000040000L,0x0000000050000000L});
	public static final BitSet FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2647 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_function_argument_analytic2662 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_keep_clause_in_function_argument_analytic2673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_function_argument_modeling2715 = new BitSet(new long[]{0x0000002000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_column_name_in_function_argument_modeling2729 = new BitSet(new long[]{0x1000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_function_argument_modeling2732 = new BitSet(new long[]{0x0000400010000040L,0x0000000000000000L,0x0000100000004000L});
	public static final BitSet FOLLOW_numeric_in_function_argument_modeling2735 = new BitSet(new long[]{0x1000000000040000L});
	public static final BitSet FOLLOW_null_key_in_function_argument_modeling2737 = new BitSet(new long[]{0x1000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_function_argument_modeling2741 = new BitSet(new long[]{0x0000400010000040L,0x0000000000000000L,0x0000100000004000L});
	public static final BitSet FOLLOW_numeric_in_function_argument_modeling2744 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_null_key_in_function_argument_modeling2746 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_using_key_in_function_argument_modeling2767 = new BitSet(new long[]{0x0081442010838940L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_tableview_name_in_function_argument_modeling2796 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_PERIOD_in_function_argument_modeling2798 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ASTERISK_in_function_argument_modeling2800 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_ASTERISK_in_function_argument_modeling2820 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_expression_in_function_argument_modeling2840 = new BitSet(new long[]{0x0001002000858000L,0x0000020050000000L});
	public static final BitSet FOLLOW_column_alias_in_function_argument_modeling2842 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_function_argument_modeling2846 = new BitSet(new long[]{0x0081442010838840L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_expression_in_function_argument_modeling2848 = new BitSet(new long[]{0x0001002000858000L,0x0000020050000000L});
	public static final BitSet FOLLOW_column_alias_in_function_argument_modeling2850 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_function_argument_modeling2882 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_keep_clause_in_function_argument_modeling2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_respect_key_in_respect_or_ignore_nulls2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ignore_key_in_respect_or_ignore_nulls2939 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_nulls_key_in_respect_or_ignore_nulls2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_argument2980 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQUALS_OP_in_argument2982 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_GREATER_THAN_OP_in_argument2984 = new BitSet(new long[]{0x0081442010838840L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_expression_wrapper_in_argument2990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datatype_in_type_spec3051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ref_key_in_type_spec3062 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_type_name_in_type_spec3065 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_percent_rowtype_key_in_type_spec3068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_percent_type_key_in_type_spec3070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_datatype_element_in_datatype3109 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_precision_part_in_datatype3119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_with_key_in_datatype3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_local_key_in_datatype3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_time_key_in_datatype3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_zone_key_in_datatype3138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interval_key_in_datatype3176 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_year_key_in_datatype3181 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_day_key_in_datatype3185 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_datatype3205 = new BitSet(new long[]{0x0081442010838840L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_expression_wrapper_in_datatype3209 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_datatype3211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_to_key_in_datatype3228 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_month_key_in_datatype3233 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_second_key_in_datatype3237 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_datatype3258 = new BitSet(new long[]{0x0081442010838840L,0xC2D8412010010000L,0x0000100080206000L});
	public static final BitSet FOLLOW_expression_wrapper_in_datatype3262 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_datatype3264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_precision_part3319 = new BitSet(new long[]{0x0000400010000040L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_numeric_in_precision_part3321 = new BitSet(new long[]{0x0000000000040000L,0x0000000050000000L});
	public static final BitSet FOLLOW_COMMA_in_precision_part3324 = new BitSet(new long[]{0x0000400010000040L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_numeric_in_precision_part3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_char_key_in_precision_part3331 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_byte_key_in_precision_part3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_part3339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_integer_key_in_native_datatype_element3382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pls_integer_key_in_native_datatype_element3393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_natural_key_in_native_datatype_element3404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_float_key_in_native_datatype_element3415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_double_key_in_native_datatype_element3426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_naturaln_key_in_native_datatype_element3437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_positive_key_in_native_datatype_element3448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_positiven_key_in_native_datatype_element3459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_signtype_key_in_native_datatype_element3470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_integer_key_in_native_datatype_element3481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nvarchar2_key_in_native_datatype_element3492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec_key_in_native_datatype_element3503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_key_in_native_datatype_element3514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_key_in_native_datatype_element3525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_key_in_native_datatype_element3536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_smallint_key_in_native_datatype_element3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_key_in_native_datatype_element3558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decimal_key_in_native_datatype_element3569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_key_in_native_datatype_element3581 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_precision_key_in_native_datatype_element3583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_key_in_native_datatype_element3596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_key_in_native_datatype_element3607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nchar_key_in_native_datatype_element3618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_long_key_in_native_datatype_element3629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_long_key_in_native_datatype_element3640 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_raw_key_in_native_datatype_element3642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_char_key_in_native_datatype_element3660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_key_in_native_datatype_element3673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varchar2_key_in_native_datatype_element3685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varchar_key_in_native_datatype_element3696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_key_in_native_datatype_element3707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_raw_key_in_native_datatype_element3718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_key_in_native_datatype_element3729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_key_in_native_datatype_element3740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rowid_key_in_native_datatype_element3751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_urowid_key_in_native_datatype_element3762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_year_key_in_native_datatype_element3773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_month_key_in_native_datatype_element3784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_day_key_in_native_datatype_element3795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hour_key_in_native_datatype_element3806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_minute_key_in_native_datatype_element3817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_second_key_in_native_datatype_element3828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timezone_hour_key_in_native_datatype_element3839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timezone_minute_key_in_native_datatype_element3850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timezone_region_key_in_native_datatype_element3861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timezone_abbr_key_in_native_datatype_element3872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamp_key_in_native_datatype_element3883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamp_unconstrained_key_in_native_datatype_element3894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamp_tz_unconstrained_key_in_native_datatype_element3905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timestamp_ltz_unconstrained_key_in_native_datatype_element3916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_yminterval_unconstrained_key_in_native_datatype_element3927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dsinterval_unconstrained_key_in_native_datatype_element3938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bfile_key_in_native_datatype_element3949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blob_key_in_native_datatype_element3960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_clob_key_in_native_datatype_element3971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nclob_key_in_native_datatype_element3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mlslabel_key_in_native_datatype_element3993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINDVAR_in_bind_variable4017 = new BitSet(new long[]{0x0040000000020802L,0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_bind_variable4021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_bind_variable4025 = new BitSet(new long[]{0x0040000000020802L,0x0000000010000000L});
	public static final BitSet FOLLOW_indicator_key_in_bind_variable4039 = new BitSet(new long[]{0x0000000000020800L});
	public static final BitSet FOLLOW_BINDVAR_in_bind_variable4045 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_COLON_in_bind_variable4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_bind_variable4053 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_bind_variable4075 = new BitSet(new long[]{0x0000002000800000L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_id_in_bind_variable4077 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_general_element_id_in_general_element4137 = new BitSet(new long[]{0x0040040000000002L});
	public static final BitSet FOLLOW_bind_variable_in_general_element4141 = new BitSet(new long[]{0x0040040000000002L});
	public static final BitSet FOLLOW_PERIOD_in_general_element4166 = new BitSet(new long[]{0x0000002000800000L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_id_in_general_element4170 = new BitSet(new long[]{0x0040040000000002L});
	public static final BitSet FOLLOW_function_argument_in_general_element4197 = new BitSet(new long[]{0x0040040000000002L});
	public static final BitSet FOLLOW_INTRODUCER_in_general_element_id4247 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_char_set_name_in_general_element_id4249 = new BitSet(new long[]{0x0000000000800000L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_routine_id_in_general_element_id4253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTRODUCER_in_table_element4285 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_char_set_name_in_table_element4287 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_table_element4291 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_table_element4294 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_table_element4296 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_timestamp_key_in_constant4343 = new BitSet(new long[]{0x0001000000038800L});
	public static final BitSet FOLLOW_quoted_string_in_constant4346 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_bind_variable_in_constant4350 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_at_key_in_constant4354 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_time_key_in_constant4356 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_zone_key_in_constant4358 = new BitSet(new long[]{0x0001000000018000L});
	public static final BitSet FOLLOW_quoted_string_in_constant4360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interval_key_in_constant4373 = new BitSet(new long[]{0x0001002000838800L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_quoted_string_in_constant4376 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_bind_variable_in_constant4380 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_general_element_id_in_constant4384 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_day_key_in_constant4398 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_hour_key_in_constant4402 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_minute_key_in_constant4406 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_second_key_in_constant4410 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_constant4424 = new BitSet(new long[]{0x0000000000020800L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant4427 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_bind_variable_in_constant4431 = new BitSet(new long[]{0x0000000000040000L,0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_constant4435 = new BitSet(new long[]{0x0000000000020800L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_bind_variable_in_constant4442 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_constant4448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_to_key_in_constant4463 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_day_key_in_constant4480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hour_key_in_constant4484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_minute_key_in_constant4488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_second_key_in_constant4492 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_constant4495 = new BitSet(new long[]{0x0000000000020800L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant4498 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_bind_variable_in_constant4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_constant4505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_in_constant4532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_key_in_constant4543 = new BitSet(new long[]{0x0001000000018000L});
	public static final BitSet FOLLOW_quoted_string_in_constant4545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quoted_string_in_constant4556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_key_in_constant4567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_true_key_in_constant4578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_false_key_in_constant4589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dbtimezone_key_in_constant4600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sessiontimezone_key_in_constant4612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_minvalue_key_in_constant4623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maxvalue_key_in_constant4634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_default_key_in_constant4645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_numeric4665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_SIGN_in_numeric4676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_numeric4678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXACT_NUM_LIT_in_numeric4698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APPROXIMATE_NUM_LIT_in_numeric4709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTRODUCER_in_id4767 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_char_set_name_in_id4769 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_id4781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGULAR_ID_in_id_expression4816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELIMITED_ID_in_id_expression4835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_EQUAL_OP_in_not_equal_op4864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_OP_in_not_equal_op4875 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_GREATER_THAN_OP_in_not_equal_op4877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCLAMATION_OPERATOR_PART_in_not_equal_op4893 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQUALS_OP_in_not_equal_op4895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARRET_OPERATOR_PART_in_not_equal_op4911 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQUALS_OP_in_not_equal_op4913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_THAN_OR_EQUALS_OP_in_greater_than_or_equals_op4938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_THAN_OP_in_greater_than_or_equals_op4949 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQUALS_OP_in_greater_than_or_equals_op4951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_OR_EQUALS_OP_in_less_than_or_equals_op4976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_THAN_OP_in_less_than_or_equals_op4987 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQUALS_OP_in_less_than_or_equals_op4989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONCATENATION_OP_in_concatenation_op5014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERTICAL_BAR_in_concatenation_op5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VERTICAL_BAR_in_concatenation_op5029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_outer_join_sign5054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_PLUS_SIGN_in_outer_join_sign5056 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_RIGHT_PAREN_in_outer_join_sign5058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_as_key_in_synpred1_PLSQLCommons454 = new BitSet(new long[]{0x0001002000818000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_in_synpred1_PLSQLCommons458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alias_quoted_string_in_synpred1_PLSQLCommons460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred3_PLSQLCommons1155 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred3_PLSQLCommons1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred4_PLSQLCommons1208 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred4_PLSQLCommons1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred5_PLSQLCommons1479 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred5_PLSQLCommons1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred6_PLSQLCommons1578 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred6_PLSQLCommons1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred7_PLSQLCommons1629 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred7_PLSQLCommons1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred8_PLSQLCommons1680 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred8_PLSQLCommons1682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred9_PLSQLCommons1733 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred9_PLSQLCommons1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred10_PLSQLCommons1786 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred10_PLSQLCommons1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred11_PLSQLCommons1839 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred11_PLSQLCommons1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred12_PLSQLCommons1910 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred12_PLSQLCommons1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred13_PLSQLCommons2114 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred13_PLSQLCommons2116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred14_PLSQLCommons2202 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred14_PLSQLCommons2204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred15_PLSQLCommons2255 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred15_PLSQLCommons2257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred16_PLSQLCommons2391 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_id_expression_in_synpred16_PLSQLCommons2393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableview_name_in_synpred17_PLSQLCommons2788 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_PERIOD_in_synpred17_PLSQLCommons2790 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ASTERISK_in_synpred17_PLSQLCommons2792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_synpred18_PLSQLCommons2972 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_EQUALS_OP_in_synpred18_PLSQLCommons2974 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_GREATER_THAN_OP_in_synpred18_PLSQLCommons2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_synpred19_PLSQLCommons4069 = new BitSet(new long[]{0x0000002000800000L,0x4080000010000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_general_element_id_in_synpred19_PLSQLCommons4071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PAREN_in_synpred20_PLSQLCommons4187 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFEFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0000001FFFFFFFFFL});
	public static final BitSet FOLLOW_set_in_synpred20_PLSQLCommons4189 = new BitSet(new long[]{0x0000000000000002L});
}
