// $ANTLR 3.5.2 SQLPLUSParser.g 2018-10-06 11:19:31

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
 * Oracle(c) SQL*Plus 11g Parser
 *
 * Copyright (c) 2009-2011 Alexandre Porcelli <alexandre.porcelli@gmail.com>
 *                         Tomi Pakarinen <tomi.pakarinen@iki.fi>
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
public class PLSQLParser_SQLPLUSParser extends Parser {
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


	public PLSQLParser_SQLPLUSParser(TokenStream input, PLSQLParser gPLSQLParser) {
		this(input, new RecognizerSharedState(), gPLSQLParser);
	}
	public PLSQLParser_SQLPLUSParser(TokenStream input, RecognizerSharedState state, PLSQLParser gPLSQLParser) {
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
	@Override public String getGrammarFileName() { return "SQLPLUSParser.g"; }


	public static class sql_plus_command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sql_plus_command"
	// SQLPLUSParser.g:25:1: sql_plus_command : ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command ) ( SEMICOLON !)? ;
	public final PLSQLParser_SQLPLUSParser.sql_plus_command_return sql_plus_command() throws RecognitionException {
		PLSQLParser_SQLPLUSParser.sql_plus_command_return retval = new PLSQLParser_SQLPLUSParser.sql_plus_command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SOLIDUS1=null;
		Token SEMICOLON6=null;
		ParserRuleReturnScope whenever_command2 =null;
		ParserRuleReturnScope exit_command3 =null;
		ParserRuleReturnScope prompt_command4 =null;
		ParserRuleReturnScope set_command5 =null;

		Object SOLIDUS1_tree=null;
		Object SEMICOLON6_tree=null;

		try {
			// SQLPLUSParser.g:26:5: ( ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command ) ( SEMICOLON !)? )
			// SQLPLUSParser.g:26:10: ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command ) ( SEMICOLON !)?
			{
			root_0 = (Object)adaptor.nil();


			// SQLPLUSParser.g:26:10: ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command )
			int alt1=5;
			switch ( input.LA(1) ) {
			case SOLIDUS:
				{
				alt1=1;
				}
				break;
			case REGULAR_ID:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==EOF||LA1_2==PROMPT||LA1_2==SEMICOLON||LA1_2==SOLIDUS||LA1_2==SQL92_RESERVED_ALTER||LA1_2==SQL92_RESERVED_CREATE||LA1_2==SQL92_RESERVED_DROP||LA1_2==SQL92_RESERVED_PROCEDURE) ) {
					alt1=3;
				}
				else if ( (LA1_2==REGULAR_ID) ) {
					int LA1_5 = input.LA(3);
					if ( (LA1_5==EOF||LA1_5==DELIMITED_ID||LA1_5==INTRODUCER||LA1_5==PROMPT||LA1_5==SEMICOLON||LA1_5==SOLIDUS||LA1_5==SQL92_RESERVED_ALTER||LA1_5==SQL92_RESERVED_CREATE||LA1_5==SQL92_RESERVED_DROP||LA1_5==SQL92_RESERVED_PROCEDURE) ) {
						alt1=3;
					}
					else if ( (LA1_5==REGULAR_ID) ) {
						int LA1_6 = input.LA(4);
						if ( (LA1_6==REGULAR_ID) ) {
							alt1=2;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("exit"))) ) {
							alt1=3;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("set"))) ) {
							alt1=5;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA1_5==CHAR_STRING||LA1_5==EXACT_NUM_LIT||LA1_5==SQL92_RESERVED_ON) && ((input.LT(1).getText().equalsIgnoreCase("set")))) {
						alt1=5;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PROMPT:
				{
				alt1=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// SQLPLUSParser.g:26:11: SOLIDUS !
					{
					SOLIDUS1=(Token)match(input,SOLIDUS,FOLLOW_SOLIDUS_in_sql_plus_command37); if (state.failed) return retval;
					}
					break;
				case 2 :
					// SQLPLUSParser.g:26:20: whenever_command
					{
					pushFollow(FOLLOW_whenever_command_in_sql_plus_command40);
					whenever_command2=whenever_command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenever_command2.getTree());

					}
					break;
				case 3 :
					// SQLPLUSParser.g:26:37: exit_command
					{
					pushFollow(FOLLOW_exit_command_in_sql_plus_command42);
					exit_command3=exit_command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exit_command3.getTree());

					}
					break;
				case 4 :
					// SQLPLUSParser.g:26:50: prompt_command
					{
					pushFollow(FOLLOW_prompt_command_in_sql_plus_command44);
					prompt_command4=prompt_command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prompt_command4.getTree());

					}
					break;
				case 5 :
					// SQLPLUSParser.g:26:65: set_command
					{
					pushFollow(FOLLOW_set_command_in_sql_plus_command46);
					set_command5=set_command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set_command5.getTree());

					}
					break;

			}

			// SQLPLUSParser.g:26:87: ( SEMICOLON !)?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SEMICOLON) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// SQLPLUSParser.g:26:87: SEMICOLON !
					{
					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sql_plus_command49); if (state.failed) return retval;
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
	// $ANTLR end "sql_plus_command"


	public static class whenever_command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whenever_command"
	// SQLPLUSParser.g:29:1: whenever_command : whenever_key ^ ( sqlerror_key | oserror_key ) ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) ) ;
	public final PLSQLParser_SQLPLUSParser.whenever_command_return whenever_command() throws RecognitionException {
		PLSQLParser_SQLPLUSParser.whenever_command_return retval = new PLSQLParser_SQLPLUSParser.whenever_command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope whenever_key7 =null;
		ParserRuleReturnScope sqlerror_key8 =null;
		ParserRuleReturnScope oserror_key9 =null;
		ParserRuleReturnScope exit_key10 =null;
		ParserRuleReturnScope success_key11 =null;
		ParserRuleReturnScope failure_key12 =null;
		ParserRuleReturnScope warning_key13 =null;
		ParserRuleReturnScope commit_key14 =null;
		ParserRuleReturnScope rollback_key15 =null;
		ParserRuleReturnScope continue_key16 =null;
		ParserRuleReturnScope commit_key17 =null;
		ParserRuleReturnScope rollback_key18 =null;
		ParserRuleReturnScope none_key19 =null;


		try {
			// SQLPLUSParser.g:30:5: ( whenever_key ^ ( sqlerror_key | oserror_key ) ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) ) )
			// SQLPLUSParser.g:30:10: whenever_key ^ ( sqlerror_key | oserror_key ) ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_whenever_key_in_whenever_command71);
			whenever_key7=gPLSQLParser.whenever_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(whenever_key7.getTree(), root_0);
			// SQLPLUSParser.g:30:24: ( sqlerror_key | oserror_key )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==REGULAR_ID) ) {
				int LA3_1 = input.LA(2);
				if ( ((input.LT(1).getText().equalsIgnoreCase("sqlerror"))) ) {
					alt3=1;
				}
				else if ( ((input.LT(1).getText().equalsIgnoreCase("oserror"))) ) {
					alt3=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// SQLPLUSParser.g:30:25: sqlerror_key
					{
					pushFollow(FOLLOW_sqlerror_key_in_whenever_command75);
					sqlerror_key8=gPLSQLParser.sqlerror_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlerror_key8.getTree());

					}
					break;
				case 2 :
					// SQLPLUSParser.g:30:38: oserror_key
					{
					pushFollow(FOLLOW_oserror_key_in_whenever_command77);
					oserror_key9=gPLSQLParser.oserror_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, oserror_key9.getTree());

					}
					break;

			}

			// SQLPLUSParser.g:30:51: ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==REGULAR_ID) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==REGULAR_ID) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==EOF||LA7_2==PROMPT||LA7_2==SEMICOLON||LA7_2==SOLIDUS||LA7_2==SQL92_RESERVED_ALTER||LA7_2==SQL92_RESERVED_CREATE||LA7_2==SQL92_RESERVED_DROP||LA7_2==SQL92_RESERVED_PROCEDURE) && ((input.LT(1).getText().equalsIgnoreCase("continue")))) {
						alt7=2;
					}
					else if ( (LA7_2==REGULAR_ID) ) {
						int LA7_4 = input.LA(4);
						if ( ((input.LT(1).getText().equalsIgnoreCase("exit"))) ) {
							alt7=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("continue"))) ) {
							alt7=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// SQLPLUSParser.g:30:52: exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key )
					{
					pushFollow(FOLLOW_exit_key_in_whenever_command81);
					exit_key10=gPLSQLParser.exit_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exit_key10.getTree());

					// SQLPLUSParser.g:30:61: ( success_key | failure_key | warning_key )
					int alt4=3;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==REGULAR_ID) ) {
						int LA4_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("success"))) ) {
							alt4=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("failure"))) ) {
							alt4=2;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("warning"))) ) {
							alt4=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 4, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// SQLPLUSParser.g:30:62: success_key
							{
							pushFollow(FOLLOW_success_key_in_whenever_command84);
							success_key11=gPLSQLParser.success_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, success_key11.getTree());

							}
							break;
						case 2 :
							// SQLPLUSParser.g:30:74: failure_key
							{
							pushFollow(FOLLOW_failure_key_in_whenever_command86);
							failure_key12=gPLSQLParser.failure_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, failure_key12.getTree());

							}
							break;
						case 3 :
							// SQLPLUSParser.g:30:86: warning_key
							{
							pushFollow(FOLLOW_warning_key_in_whenever_command88);
							warning_key13=gPLSQLParser.warning_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, warning_key13.getTree());

							}
							break;

					}

					// SQLPLUSParser.g:30:99: ( commit_key | rollback_key )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("commit"))||(input.LT(1).getText().equalsIgnoreCase("rollback"))))) {
						int LA5_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("commit"))) ) {
							alt5=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("rollback"))) ) {
							alt5=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					switch (alt5) {
						case 1 :
							// SQLPLUSParser.g:30:100: commit_key
							{
							pushFollow(FOLLOW_commit_key_in_whenever_command92);
							commit_key14=gPLSQLParser.commit_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, commit_key14.getTree());

							}
							break;
						case 2 :
							// SQLPLUSParser.g:30:111: rollback_key
							{
							pushFollow(FOLLOW_rollback_key_in_whenever_command94);
							rollback_key15=gPLSQLParser.rollback_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, rollback_key15.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// SQLPLUSParser.g:30:127: continue_key ( commit_key | rollback_key | none_key )
					{
					pushFollow(FOLLOW_continue_key_in_whenever_command99);
					continue_key16=gPLSQLParser.continue_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, continue_key16.getTree());

					// SQLPLUSParser.g:30:140: ( commit_key | rollback_key | none_key )
					int alt6=3;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("commit"))||(input.LT(1).getText().equalsIgnoreCase("rollback"))||(input.LT(1).getText().equalsIgnoreCase("none"))))) {
						int LA6_1 = input.LA(2);
						if ( ((input.LT(1).getText().equalsIgnoreCase("commit"))) ) {
							alt6=1;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("rollback"))) ) {
							alt6=2;
						}
						else if ( ((input.LT(1).getText().equalsIgnoreCase("none"))) ) {
							alt6=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					switch (alt6) {
						case 1 :
							// SQLPLUSParser.g:30:141: commit_key
							{
							pushFollow(FOLLOW_commit_key_in_whenever_command102);
							commit_key17=gPLSQLParser.commit_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, commit_key17.getTree());

							}
							break;
						case 2 :
							// SQLPLUSParser.g:30:152: rollback_key
							{
							pushFollow(FOLLOW_rollback_key_in_whenever_command104);
							rollback_key18=gPLSQLParser.rollback_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, rollback_key18.getTree());

							}
							break;
						case 3 :
							// SQLPLUSParser.g:30:165: none_key
							{
							pushFollow(FOLLOW_none_key_in_whenever_command106);
							none_key19=gPLSQLParser.none_key();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, none_key19.getTree());

							}
							break;

					}

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
	// $ANTLR end "whenever_command"


	public static class set_command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "set_command"
	// SQLPLUSParser.g:33:1: set_command : set_key ^ REGULAR_ID ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID ) ;
	public final PLSQLParser_SQLPLUSParser.set_command_return set_command() throws RecognitionException {
		PLSQLParser_SQLPLUSParser.set_command_return retval = new PLSQLParser_SQLPLUSParser.set_command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token REGULAR_ID21=null;
		Token CHAR_STRING22=null;
		Token EXACT_NUM_LIT25=null;
		Token REGULAR_ID26=null;
		ParserRuleReturnScope set_key20 =null;
		ParserRuleReturnScope on_key23 =null;
		ParserRuleReturnScope off_key24 =null;

		Object REGULAR_ID21_tree=null;
		Object CHAR_STRING22_tree=null;
		Object EXACT_NUM_LIT25_tree=null;
		Object REGULAR_ID26_tree=null;

		try {
			// SQLPLUSParser.g:34:5: ( set_key ^ REGULAR_ID ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID ) )
			// SQLPLUSParser.g:34:10: set_key ^ REGULAR_ID ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_set_key_in_set_command128);
			set_key20=gPLSQLParser.set_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(set_key20.getTree(), root_0);
			REGULAR_ID21=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_set_command131); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			REGULAR_ID21_tree = (Object)adaptor.create(REGULAR_ID21);
			adaptor.addChild(root_0, REGULAR_ID21_tree);
			}

			// SQLPLUSParser.g:34:30: ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID )
			int alt8=5;
			switch ( input.LA(1) ) {
			case CHAR_STRING:
				{
				alt8=1;
				}
				break;
			case SQL92_RESERVED_ON:
				{
				alt8=2;
				}
				break;
			case REGULAR_ID:
				{
				int LA8_3 = input.LA(2);
				if ( ((input.LT(1).getText().equalsIgnoreCase("off"))) ) {
					alt8=3;
				}
				else if ( (true) ) {
					alt8=5;
				}

				}
				break;
			case EXACT_NUM_LIT:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// SQLPLUSParser.g:34:31: CHAR_STRING
					{
					CHAR_STRING22=(Token)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_set_command134); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_STRING22_tree = (Object)adaptor.create(CHAR_STRING22);
					adaptor.addChild(root_0, CHAR_STRING22_tree);
					}

					}
					break;
				case 2 :
					// SQLPLUSParser.g:34:43: on_key
					{
					pushFollow(FOLLOW_on_key_in_set_command136);
					on_key23=gPLSQLParser.on_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, on_key23.getTree());

					}
					break;
				case 3 :
					// SQLPLUSParser.g:34:50: off_key
					{
					pushFollow(FOLLOW_off_key_in_set_command138);
					off_key24=gPLSQLParser.off_key();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, off_key24.getTree());

					}
					break;
				case 4 :
					// SQLPLUSParser.g:34:58: EXACT_NUM_LIT
					{
					EXACT_NUM_LIT25=(Token)match(input,EXACT_NUM_LIT,FOLLOW_EXACT_NUM_LIT_in_set_command140); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXACT_NUM_LIT25_tree = (Object)adaptor.create(EXACT_NUM_LIT25);
					adaptor.addChild(root_0, EXACT_NUM_LIT25_tree);
					}

					}
					break;
				case 5 :
					// SQLPLUSParser.g:34:72: REGULAR_ID
					{
					REGULAR_ID26=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_set_command142); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REGULAR_ID26_tree = (Object)adaptor.create(REGULAR_ID26);
					adaptor.addChild(root_0, REGULAR_ID26_tree);
					}

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
	// $ANTLR end "set_command"


	public static class exit_command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exit_command"
	// SQLPLUSParser.g:37:1: exit_command : exit_key ;
	public final PLSQLParser_SQLPLUSParser.exit_command_return exit_command() throws RecognitionException {
		PLSQLParser_SQLPLUSParser.exit_command_return retval = new PLSQLParser_SQLPLUSParser.exit_command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exit_key27 =null;


		try {
			// SQLPLUSParser.g:38:5: ( exit_key )
			// SQLPLUSParser.g:38:10: exit_key
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exit_key_in_exit_command163);
			exit_key27=gPLSQLParser.exit_key();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exit_key27.getTree());

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
	// $ANTLR end "exit_command"


	public static class prompt_command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prompt_command"
	// SQLPLUSParser.g:41:1: prompt_command : PROMPT ;
	public final PLSQLParser_SQLPLUSParser.prompt_command_return prompt_command() throws RecognitionException {
		PLSQLParser_SQLPLUSParser.prompt_command_return retval = new PLSQLParser_SQLPLUSParser.prompt_command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PROMPT28=null;

		Object PROMPT28_tree=null;

		try {
			// SQLPLUSParser.g:42:5: ( PROMPT )
			// SQLPLUSParser.g:42:10: PROMPT
			{
			root_0 = (Object)adaptor.nil();


			PROMPT28=(Token)match(input,PROMPT,FOLLOW_PROMPT_in_prompt_command184); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PROMPT28_tree = (Object)adaptor.create(PROMPT28);
			adaptor.addChild(root_0, PROMPT28_tree);
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
	// $ANTLR end "prompt_command"

	// Delegated rules



	public static final BitSet FOLLOW_SOLIDUS_in_sql_plus_command37 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_whenever_command_in_sql_plus_command40 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_exit_command_in_sql_plus_command42 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_prompt_command_in_sql_plus_command44 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_set_command_in_sql_plus_command46 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sql_plus_command49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whenever_key_in_whenever_command71 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_sqlerror_key_in_whenever_command75 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_oserror_key_in_whenever_command77 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_exit_key_in_whenever_command81 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_success_key_in_whenever_command84 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_failure_key_in_whenever_command86 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_warning_key_in_whenever_command88 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_commit_key_in_whenever_command92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollback_key_in_whenever_command94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continue_key_in_whenever_command99 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_commit_key_in_whenever_command102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rollback_key_in_whenever_command104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_none_key_in_whenever_command106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_key_in_set_command128 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_REGULAR_ID_in_set_command131 = new BitSet(new long[]{0x0000000010008000L,0x0000000010000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_CHAR_STRING_in_set_command134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_on_key_in_set_command136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_off_key_in_set_command138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXACT_NUM_LIT_in_set_command140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGULAR_ID_in_set_command142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exit_key_in_exit_command163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROMPT_in_prompt_command184 = new BitSet(new long[]{0x0000000000000002L});
}
