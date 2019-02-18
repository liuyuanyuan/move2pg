// $ANTLR 3.5.2 PLSQLPrinter_DDL.g 2017-09-29 10:30:58

/**
 * Oracle(c) PL/SQL 11g Parser  
 *
 * Copyright (c) 2014 Bars Group
 */
package ru.barsopen.plsqlconverter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class PLSQLPrinter_PLSQLPrinter_DDL extends TreeParser {
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
	public static final int PGSQL_BIGINT=1011;
	public static final int PGSQL_ERRCODE=1012;
	public static final int PGSQL_EXCEPT=1013;
	public static final int PGSQL_EXCEPTION=1014;
	public static final int PGSQL_NATIVE_DATATYPE_INTERVAL=1015;
	public static final int PGSQL_NOTICE=1016;
	public static final int PGSQL_OPTION=1017;
	public static final int PGSQL_PERFORM=1018;
	public static final int PGSQL_RAISE=1019;
	public static final int PGSQL_STRICT=1020;
	public static final int PGSQL_TEXT=1021;
	public static final int PGSQL_TYPED_LITERAL=1022;
	public static final int PGSQL_USING=1023;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators
	public PLSQLPrinter gPLSQLPrinter;
	public PLSQLPrinter gParent;


	public PLSQLPrinter_PLSQLPrinter_DDL(TreeNodeStream input, PLSQLPrinter gPLSQLPrinter) {
		this(input, new RecognizerSharedState(), gPLSQLPrinter);
	}
	public PLSQLPrinter_PLSQLPrinter_DDL(TreeNodeStream input, RecognizerSharedState state, PLSQLPrinter gPLSQLPrinter) {
		super(input, state);
		this.gPLSQLPrinter = gPLSQLPrinter;
		gParent = gPLSQLPrinter;
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("PLSQLPrinter_PLSQLPrinter_DDLTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return PLSQLPrinter.tokenNames; }
	@Override public String getGrammarFileName() { return "PLSQLPrinter_DDL.g"; }


	public static class drop_function_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop_function"
	// PLSQLPrinter_DDL.g:11:1: drop_function : ^( DROP_FUNCTION function_name ) -> template( \"not implemented: drop_function\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.drop_function_return drop_function() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.drop_function_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.drop_function_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:12:5: ( ^( DROP_FUNCTION function_name ) -> template( \"not implemented: drop_function\")
			// PLSQLPrinter_DDL.g:12:10: ^( DROP_FUNCTION function_name )
			{
			match(input,DROP_FUNCTION,FOLLOW_DROP_FUNCTION_in_drop_function48); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_function_name_in_drop_function50);
			gPLSQLPrinter.function_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 13:5: -> template( \"not implemented: drop_function\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: drop_function");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop_function"


	public static class alter_function_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_function"
	// PLSQLPrinter_DDL.g:16:1: alter_function : ^( ALTER_FUNCTION function_name ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) -> template( \"not implemented: alter_function\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_function_return alter_function() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_function_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_function_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:17:5: ( ^( ALTER_FUNCTION function_name ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) -> template( \"not implemented: alter_function\")
			// PLSQLPrinter_DDL.g:17:10: ^( ALTER_FUNCTION function_name ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* )
			{
			match(input,ALTER_FUNCTION,FOLLOW_ALTER_FUNCTION_in_alter_function86); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_function_name_in_alter_function88);
			gPLSQLPrinter.function_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:17:41: ( DEBUG_VK )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DEBUG_VK) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// PLSQLPrinter_DDL.g:17:41: DEBUG_VK
					{
					match(input,DEBUG_VK,FOLLOW_DEBUG_VK_in_alter_function90); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:17:51: ( REUSE_VK )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==REUSE_VK) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// PLSQLPrinter_DDL.g:17:51: REUSE_VK
					{
					match(input,REUSE_VK,FOLLOW_REUSE_VK_in_alter_function93); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:17:61: ( compiler_parameters_clause )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMPILER_PARAMETER) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// PLSQLPrinter_DDL.g:17:61: compiler_parameters_clause
					{
					pushFollow(FOLLOW_compiler_parameters_clause_in_alter_function96);
					compiler_parameters_clause();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 18:5: -> template( \"not implemented: alter_function\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_function");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_function"


	public static class create_function_body_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_function_body"
	// PLSQLPrinter_DDL.g:21:1: create_function_body : ^( CREATE_FUNCTION ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? ^( FUNCTION_NAME (name+= commented_id )+ ) ret= type_spec ^( PARAMETERS (args+= parameter )* ) (ac+= invoker_rights_clause )* (ac+= parallel_enable_clause )* (ac+= result_cache_clause )* ( DETERMINISTIC_VK )* ( PIPELINED_VK )? ( ^( USING_MODE ( AGGREGATE_VK )? implementation_type_name ) -> template( \"not implemented: create_function_body[USING_MODE]\"| ^( CALL_MODE call_spec ) -> template( \"not implemented: create_function_body[CALL_MODE]\"| ^( BODY_MODE block ) -> create_function_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname_parts=$namearguments=$argsreturn_type=$ret.stadd_clauses=$acis_pipelined=$PIPELINED_VK != nullblock=$block.st)) ) ;
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_function_body_return create_function_body() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_function_body_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_function_body_return();
		retval.start = input.LT(1);

		CommonTree SQL92_RESERVED_CREATE1=null;
		CommonTree REPLACE_VK2=null;
		CommonTree PIPELINED_VK3=null;
		List<Object> list_name=null;
		List<Object> list_args=null;
		List<Object> list_ac=null;
		TreeRuleReturnScope ret =null;
		TreeRuleReturnScope block4 =null;
		RuleReturnScope name = null;
		RuleReturnScope args = null;
		RuleReturnScope ac = null;
		try {
			// PLSQLPrinter_DDL.g:22:5: ( ^( CREATE_FUNCTION ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? ^( FUNCTION_NAME (name+= commented_id )+ ) ret= type_spec ^( PARAMETERS (args+= parameter )* ) (ac+= invoker_rights_clause )* (ac+= parallel_enable_clause )* (ac+= result_cache_clause )* ( DETERMINISTIC_VK )* ( PIPELINED_VK )? ( ^( USING_MODE ( AGGREGATE_VK )? implementation_type_name ) -> template( \"not implemented: create_function_body[USING_MODE]\"| ^( CALL_MODE call_spec ) -> template( \"not implemented: create_function_body[CALL_MODE]\"| ^( BODY_MODE block ) -> create_function_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname_parts=$namearguments=$argsreturn_type=$ret.stadd_clauses=$acis_pipelined=$PIPELINED_VK != nullblock=$block.st)) ) )
			// PLSQLPrinter_DDL.g:22:10: ^( CREATE_FUNCTION ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? ^( FUNCTION_NAME (name+= commented_id )+ ) ret= type_spec ^( PARAMETERS (args+= parameter )* ) (ac+= invoker_rights_clause )* (ac+= parallel_enable_clause )* (ac+= result_cache_clause )* ( DETERMINISTIC_VK )* ( PIPELINED_VK )? ( ^( USING_MODE ( AGGREGATE_VK )? implementation_type_name ) -> template( \"not implemented: create_function_body[USING_MODE]\"| ^( CALL_MODE call_spec ) -> template( \"not implemented: create_function_body[CALL_MODE]\"| ^( BODY_MODE block ) -> create_function_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname_parts=$namearguments=$argsreturn_type=$ret.stadd_clauses=$acis_pipelined=$PIPELINED_VK != nullblock=$block.st)) )
			{
			match(input,CREATE_FUNCTION,FOLLOW_CREATE_FUNCTION_in_create_function_body133); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:22:28: ( SQL92_RESERVED_CREATE )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==SQL92_RESERVED_CREATE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// PLSQLPrinter_DDL.g:22:28: SQL92_RESERVED_CREATE
					{
					SQL92_RESERVED_CREATE1=(CommonTree)match(input,SQL92_RESERVED_CREATE,FOLLOW_SQL92_RESERVED_CREATE_in_create_function_body135); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:22:51: ( REPLACE_VK )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==REPLACE_VK) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// PLSQLPrinter_DDL.g:22:51: REPLACE_VK
					{
					REPLACE_VK2=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_function_body138); 
					}
					break;

			}

			match(input,FUNCTION_NAME,FOLLOW_FUNCTION_NAME_in_create_function_body142); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:22:83: (name+= commented_id )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// PLSQLPrinter_DDL.g:22:83: name+= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_create_function_body146);
					name=gPLSQLPrinter.commented_id();
					state._fsp--;

					if (list_name==null) list_name=new ArrayList<Object>();
					list_name.add(name.getTemplate());
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_type_spec_in_create_function_body152);
			ret=gPLSQLPrinter.type_spec();
			state._fsp--;

			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_create_function_body155); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:22:131: (args+= parameter )*
				loop7:
				while (true) {
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==PARAMETER) ) {
						alt7=1;
					}

					switch (alt7) {
					case 1 :
						// PLSQLPrinter_DDL.g:22:131: args+= parameter
						{
						pushFollow(FOLLOW_parameter_in_create_function_body159);
						args=parameter();
						state._fsp--;

						if (list_args==null) list_args=new ArrayList<Object>();
						list_args.add(args.getTemplate());
						}
						break;

					default :
						break loop7;
					}
				}

				match(input, Token.UP, null); 
			}

			// PLSQLPrinter_DDL.g:23:15: (ac+= invoker_rights_clause )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AUTHID_VK) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// PLSQLPrinter_DDL.g:23:15: ac+= invoker_rights_clause
					{
					pushFollow(FOLLOW_invoker_rights_clause_in_create_function_body177);
					ac=invoker_rights_clause();
					state._fsp--;

					if (list_ac==null) list_ac=new ArrayList<Object>();
					list_ac.add(ac.getTemplate());
					}
					break;

				default :
					break loop8;
				}
			}

			// PLSQLPrinter_DDL.g:23:42: (ac+= parallel_enable_clause )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==PARALLEL_ENABLE_VK) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// PLSQLPrinter_DDL.g:23:42: ac+= parallel_enable_clause
					{
					pushFollow(FOLLOW_parallel_enable_clause_in_create_function_body182);
					ac=parallel_enable_clause();
					state._fsp--;

					if (list_ac==null) list_ac=new ArrayList<Object>();
					list_ac.add(ac.getTemplate());
					}
					break;

				default :
					break loop9;
				}
			}

			// PLSQLPrinter_DDL.g:23:70: (ac+= result_cache_clause )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==RESULT_CACHE_VK) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// PLSQLPrinter_DDL.g:23:70: ac+= result_cache_clause
					{
					pushFollow(FOLLOW_result_cache_clause_in_create_function_body187);
					ac=result_cache_clause();
					state._fsp--;

					if (list_ac==null) list_ac=new ArrayList<Object>();
					list_ac.add(ac.getTemplate());
					}
					break;

				default :
					break loop10;
				}
			}

			// PLSQLPrinter_DDL.g:23:93: ( DETERMINISTIC_VK )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==DETERMINISTIC_VK) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// PLSQLPrinter_DDL.g:23:93: DETERMINISTIC_VK
					{
					match(input,DETERMINISTIC_VK,FOLLOW_DETERMINISTIC_VK_in_create_function_body190); 
					}
					break;

				default :
					break loop11;
				}
			}

			// PLSQLPrinter_DDL.g:23:111: ( PIPELINED_VK )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==PIPELINED_VK) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// PLSQLPrinter_DDL.g:23:111: PIPELINED_VK
					{
					PIPELINED_VK3=(CommonTree)match(input,PIPELINED_VK,FOLLOW_PIPELINED_VK_in_create_function_body193); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:24:13: ( ^( USING_MODE ( AGGREGATE_VK )? implementation_type_name ) -> template( \"not implemented: create_function_body[USING_MODE]\"| ^( CALL_MODE call_spec ) -> template( \"not implemented: create_function_body[CALL_MODE]\"| ^( BODY_MODE block ) -> create_function_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname_parts=$namearguments=$argsreturn_type=$ret.stadd_clauses=$acis_pipelined=$PIPELINED_VK != nullblock=$block.st))
			int alt14=3;
			switch ( input.LA(1) ) {
			case USING_MODE:
				{
				alt14=1;
				}
				break;
			case CALL_MODE:
				{
				alt14=2;
				}
				break;
			case BODY_MODE:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// PLSQLPrinter_DDL.g:24:18: ^( USING_MODE ( AGGREGATE_VK )? implementation_type_name )
					{
					match(input,USING_MODE,FOLLOW_USING_MODE_in_create_function_body214); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:24:31: ( AGGREGATE_VK )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==AGGREGATE_VK) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// PLSQLPrinter_DDL.g:24:31: AGGREGATE_VK
							{
							match(input,AGGREGATE_VK,FOLLOW_AGGREGATE_VK_in_create_function_body216); 
							}
							break;

					}

					pushFollow(FOLLOW_implementation_type_name_in_create_function_body219);
					gPLSQLPrinter.implementation_type_name();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 25:5: -> template( \"not implemented: create_function_body[USING_MODE]\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: create_function_body[USING_MODE]");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:26:18: ^( CALL_MODE call_spec )
					{
					match(input,CALL_MODE,FOLLOW_CALL_MODE_in_create_function_body254); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_call_spec_in_create_function_body256);
					call_spec();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 27:5: -> template( \"not implemented: create_function_body[CALL_MODE]\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: create_function_body[CALL_MODE]");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:28:18: ^( BODY_MODE block )
					{
					match(input,BODY_MODE,FOLLOW_BODY_MODE_in_create_function_body291); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_create_function_body293);
					block4=gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 29:18: -> create_function_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname_parts=$namearguments=$argsreturn_type=$ret.stadd_clauses=$acis_pipelined=$PIPELINED_VK != nullblock=$block.st)
					{
						retval.st = templateLib.getInstanceOf("create_function_body",new STAttrMap().put("is_create", SQL92_RESERVED_CREATE1 != null).put("is_replace", REPLACE_VK2 != null).put("name_parts", list_name).put("arguments", list_args).put("return_type", (ret!=null?((StringTemplate)ret.getTemplate()):null)).put("add_clauses", list_ac).put("is_pipelined", PIPELINED_VK3 != null).put("block", (block4!=null?((StringTemplate)block4.getTemplate()):null)));
					}



					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_function_body"


	public static class parallel_enable_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "parallel_enable_clause"
	// PLSQLPrinter_DDL.g:38:1: parallel_enable_clause : ^( PARALLEL_ENABLE_VK ( partition_by_clause )? ) -> template( \"not implemented: parallel_enable_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.parallel_enable_clause_return parallel_enable_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.parallel_enable_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.parallel_enable_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:39:5: ( ^( PARALLEL_ENABLE_VK ( partition_by_clause )? ) -> template( \"not implemented: parallel_enable_clause\")
			// PLSQLPrinter_DDL.g:39:10: ^( PARALLEL_ENABLE_VK ( partition_by_clause )? )
			{
			match(input,PARALLEL_ENABLE_VK,FOLLOW_PARALLEL_ENABLE_VK_in_parallel_enable_clause464); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:39:31: ( partition_by_clause )?
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==PARTITION_VK) ) {
					alt15=1;
				}
				switch (alt15) {
					case 1 :
						// PLSQLPrinter_DDL.g:39:31: partition_by_clause
						{
						pushFollow(FOLLOW_partition_by_clause_in_parallel_enable_clause466);
						partition_by_clause();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 40:5: -> template( \"not implemented: parallel_enable_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: parallel_enable_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parallel_enable_clause"


	public static class partition_by_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "partition_by_clause"
	// PLSQLPrinter_DDL.g:43:1: partition_by_clause : ^( PARTITION_VK expression ( SQL92_RESERVED_ANY | ^( HASH_VK ^( COLUMNS ( column_name )+ ) ) | ^( RANGE_VK ^( COLUMNS ( column_name )+ ) ) ) ( streaming_clause )? ) -> template( \"not implemented: partition_by_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.partition_by_clause_return partition_by_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.partition_by_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.partition_by_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:44:5: ( ^( PARTITION_VK expression ( SQL92_RESERVED_ANY | ^( HASH_VK ^( COLUMNS ( column_name )+ ) ) | ^( RANGE_VK ^( COLUMNS ( column_name )+ ) ) ) ( streaming_clause )? ) -> template( \"not implemented: partition_by_clause\")
			// PLSQLPrinter_DDL.g:44:10: ^( PARTITION_VK expression ( SQL92_RESERVED_ANY | ^( HASH_VK ^( COLUMNS ( column_name )+ ) ) | ^( RANGE_VK ^( COLUMNS ( column_name )+ ) ) ) ( streaming_clause )? )
			{
			match(input,PARTITION_VK,FOLLOW_PARTITION_VK_in_partition_by_clause503); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_partition_by_clause505);
			gPLSQLPrinter.expression();
			state._fsp--;

			// PLSQLPrinter_DDL.g:45:13: ( SQL92_RESERVED_ANY | ^( HASH_VK ^( COLUMNS ( column_name )+ ) ) | ^( RANGE_VK ^( COLUMNS ( column_name )+ ) ) )
			int alt18=3;
			switch ( input.LA(1) ) {
			case SQL92_RESERVED_ANY:
				{
				alt18=1;
				}
				break;
			case HASH_VK:
				{
				alt18=2;
				}
				break;
			case RANGE_VK:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// PLSQLPrinter_DDL.g:45:18: SQL92_RESERVED_ANY
					{
					match(input,SQL92_RESERVED_ANY,FOLLOW_SQL92_RESERVED_ANY_in_partition_by_clause525); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:46:18: ^( HASH_VK ^( COLUMNS ( column_name )+ ) )
					{
					match(input,HASH_VK,FOLLOW_HASH_VK_in_partition_by_clause545); 
					match(input, Token.DOWN, null); 
					match(input,COLUMNS,FOLLOW_COLUMNS_in_partition_by_clause548); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:46:38: ( column_name )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COLUMN_NAME) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// PLSQLPrinter_DDL.g:46:38: column_name
							{
							pushFollow(FOLLOW_column_name_in_partition_by_clause550);
							gPLSQLPrinter.column_name();
							state._fsp--;

							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:47:18: ^( RANGE_VK ^( COLUMNS ( column_name )+ ) )
					{
					match(input,RANGE_VK,FOLLOW_RANGE_VK_in_partition_by_clause573); 
					match(input, Token.DOWN, null); 
					match(input,COLUMNS,FOLLOW_COLUMNS_in_partition_by_clause576); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:47:39: ( column_name )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COLUMN_NAME) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// PLSQLPrinter_DDL.g:47:39: column_name
							{
							pushFollow(FOLLOW_column_name_in_partition_by_clause578);
							gPLSQLPrinter.column_name();
							state._fsp--;

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					}
					break;

			}

			// PLSQLPrinter_DDL.g:49:13: ( streaming_clause )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==STREAMING_CLAUSE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// PLSQLPrinter_DDL.g:49:13: streaming_clause
					{
					pushFollow(FOLLOW_streaming_clause_in_partition_by_clause610);
					streaming_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 51:5: -> template( \"not implemented: partition_by_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: partition_by_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partition_by_clause"


	public static class result_cache_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "result_cache_clause"
	// PLSQLPrinter_DDL.g:54:1: result_cache_clause : ^( RESULT_CACHE_VK ( relies_on_part )? ) -> template( \"not implemented: result_cache_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.result_cache_clause_return result_cache_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.result_cache_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.result_cache_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:55:5: ( ^( RESULT_CACHE_VK ( relies_on_part )? ) -> template( \"not implemented: result_cache_clause\")
			// PLSQLPrinter_DDL.g:55:10: ^( RESULT_CACHE_VK ( relies_on_part )? )
			{
			match(input,RESULT_CACHE_VK,FOLLOW_RESULT_CACHE_VK_in_result_cache_clause656); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:55:28: ( relies_on_part )?
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==RELIES_ON_VK) ) {
					alt20=1;
				}
				switch (alt20) {
					case 1 :
						// PLSQLPrinter_DDL.g:55:28: relies_on_part
						{
						pushFollow(FOLLOW_relies_on_part_in_result_cache_clause658);
						relies_on_part();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 56:5: -> template( \"not implemented: result_cache_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: result_cache_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "result_cache_clause"


	public static class relies_on_part_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relies_on_part"
	// PLSQLPrinter_DDL.g:59:1: relies_on_part : ^( RELIES_ON_VK ( tableview_name )+ ) -> template( \"not implemented: relies_on_part\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.relies_on_part_return relies_on_part() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.relies_on_part_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.relies_on_part_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:60:5: ( ^( RELIES_ON_VK ( tableview_name )+ ) -> template( \"not implemented: relies_on_part\")
			// PLSQLPrinter_DDL.g:60:10: ^( RELIES_ON_VK ( tableview_name )+ )
			{
			match(input,RELIES_ON_VK,FOLLOW_RELIES_ON_VK_in_relies_on_part695); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:60:25: ( tableview_name )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==TABLEVIEW_NAME) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// PLSQLPrinter_DDL.g:60:25: tableview_name
					{
					pushFollow(FOLLOW_tableview_name_in_relies_on_part697);
					gPLSQLPrinter.tableview_name();
					state._fsp--;

					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 61:5: -> template( \"not implemented: relies_on_part\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: relies_on_part");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relies_on_part"


	public static class streaming_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "streaming_clause"
	// PLSQLPrinter_DDL.g:64:1: streaming_clause : ^( STREAMING_CLAUSE ( SQL92_RESERVED_ORDER | CLUSTER_VK ) expression ^( COLUMNS ( column_name )+ ) ) -> template( \"not implemented: streaming_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.streaming_clause_return streaming_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.streaming_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.streaming_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:65:5: ( ^( STREAMING_CLAUSE ( SQL92_RESERVED_ORDER | CLUSTER_VK ) expression ^( COLUMNS ( column_name )+ ) ) -> template( \"not implemented: streaming_clause\")
			// PLSQLPrinter_DDL.g:65:10: ^( STREAMING_CLAUSE ( SQL92_RESERVED_ORDER | CLUSTER_VK ) expression ^( COLUMNS ( column_name )+ ) )
			{
			match(input,STREAMING_CLAUSE,FOLLOW_STREAMING_CLAUSE_in_streaming_clause734); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:65:29: ( SQL92_RESERVED_ORDER | CLUSTER_VK )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==SQL92_RESERVED_ORDER) ) {
				alt22=1;
			}
			else if ( (LA22_0==CLUSTER_VK) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// PLSQLPrinter_DDL.g:65:30: SQL92_RESERVED_ORDER
					{
					match(input,SQL92_RESERVED_ORDER,FOLLOW_SQL92_RESERVED_ORDER_in_streaming_clause737); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:65:51: CLUSTER_VK
					{
					match(input,CLUSTER_VK,FOLLOW_CLUSTER_VK_in_streaming_clause739); 
					}
					break;

			}

			pushFollow(FOLLOW_expression_in_streaming_clause742);
			gPLSQLPrinter.expression();
			state._fsp--;

			match(input,COLUMNS,FOLLOW_COLUMNS_in_streaming_clause745); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:65:84: ( column_name )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COLUMN_NAME) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// PLSQLPrinter_DDL.g:65:84: column_name
					{
					pushFollow(FOLLOW_column_name_in_streaming_clause747);
					gPLSQLPrinter.column_name();
					state._fsp--;

					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 66:5: -> template( \"not implemented: streaming_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: streaming_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "streaming_clause"


	public static class drop_package_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop_package"
	// PLSQLPrinter_DDL.g:73:1: drop_package : ^( DROP_PACKAGE package_name ( BODY_VK )? ) -> template( \"not implemented: drop_package\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.drop_package_return drop_package() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.drop_package_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.drop_package_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:74:5: ( ^( DROP_PACKAGE package_name ( BODY_VK )? ) -> template( \"not implemented: drop_package\")
			// PLSQLPrinter_DDL.g:74:10: ^( DROP_PACKAGE package_name ( BODY_VK )? )
			{
			match(input,DROP_PACKAGE,FOLLOW_DROP_PACKAGE_in_drop_package790); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_package_name_in_drop_package792);
			gPLSQLPrinter.package_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:74:38: ( BODY_VK )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BODY_VK) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// PLSQLPrinter_DDL.g:74:38: BODY_VK
					{
					match(input,BODY_VK,FOLLOW_BODY_VK_in_drop_package794); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 75:5: -> template( \"not implemented: drop_package\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: drop_package");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop_package"


	public static class alter_package_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_package"
	// PLSQLPrinter_DDL.g:78:1: alter_package : ^( ALTER_PACKAGE package_name ( DEBUG_VK )? ( REUSE_VK )? ( PACKAGE_VK | BODY_VK | SPECIFICATION_VK )? ( compiler_parameters_clause )* ) -> template( \"not implemented: alter_package\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_package_return alter_package() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_package_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_package_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:79:5: ( ^( ALTER_PACKAGE package_name ( DEBUG_VK )? ( REUSE_VK )? ( PACKAGE_VK | BODY_VK | SPECIFICATION_VK )? ( compiler_parameters_clause )* ) -> template( \"not implemented: alter_package\")
			// PLSQLPrinter_DDL.g:79:10: ^( ALTER_PACKAGE package_name ( DEBUG_VK )? ( REUSE_VK )? ( PACKAGE_VK | BODY_VK | SPECIFICATION_VK )? ( compiler_parameters_clause )* )
			{
			match(input,ALTER_PACKAGE,FOLLOW_ALTER_PACKAGE_in_alter_package831); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_package_name_in_alter_package833);
			gPLSQLPrinter.package_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:79:39: ( DEBUG_VK )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==DEBUG_VK) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// PLSQLPrinter_DDL.g:79:39: DEBUG_VK
					{
					match(input,DEBUG_VK,FOLLOW_DEBUG_VK_in_alter_package835); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:79:49: ( REUSE_VK )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==REUSE_VK) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// PLSQLPrinter_DDL.g:79:49: REUSE_VK
					{
					match(input,REUSE_VK,FOLLOW_REUSE_VK_in_alter_package838); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:80:17: ( PACKAGE_VK | BODY_VK | SPECIFICATION_VK )?
			int alt27=4;
			switch ( input.LA(1) ) {
				case PACKAGE_VK:
					{
					alt27=1;
					}
					break;
				case BODY_VK:
					{
					alt27=2;
					}
					break;
				case SPECIFICATION_VK:
					{
					alt27=3;
					}
					break;
			}
			switch (alt27) {
				case 1 :
					// PLSQLPrinter_DDL.g:80:18: PACKAGE_VK
					{
					match(input,PACKAGE_VK,FOLLOW_PACKAGE_VK_in_alter_package859); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:80:29: BODY_VK
					{
					match(input,BODY_VK,FOLLOW_BODY_VK_in_alter_package861); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:80:37: SPECIFICATION_VK
					{
					match(input,SPECIFICATION_VK,FOLLOW_SPECIFICATION_VK_in_alter_package863); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:80:56: ( compiler_parameters_clause )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==COMPILER_PARAMETER) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// PLSQLPrinter_DDL.g:80:56: compiler_parameters_clause
					{
					pushFollow(FOLLOW_compiler_parameters_clause_in_alter_package867);
					compiler_parameters_clause();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 81:5: -> template( \"not implemented: alter_package\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_package");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_package"


	public static class create_package_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_package"
	// PLSQLPrinter_DDL.g:84:1: create_package : ( ^( CREATE_PACKAGE_SPEC ( REPLACE_VK )? package_name ( invoker_rights_clause )? (items+= package_obj_spec )* ) -> create_package_spec(is_replace=$REPLACE_VK != nullname=$package_name.stinvoker_rights_clause=$invoker_rights_clause.stitems=$items)| ^( CREATE_PACKAGE_BODY ( REPLACE_VK )? package_name (items+= package_obj_body )* ( seq_of_statements )? ( exception_clause )? ) -> create_package_body(is_replace=$REPLACE_VK != nullname=$package_name.stitems=$itemsinit_section_seq_of_statements=$seq_of_statements.stinit_section_exception_clause=$exception_clause.st));
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_package_return create_package() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_package_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_package_return();
		retval.start = input.LT(1);

		CommonTree REPLACE_VK5=null;
		CommonTree REPLACE_VK8=null;
		List<Object> list_items=null;
		TreeRuleReturnScope package_name6 =null;
		TreeRuleReturnScope invoker_rights_clause7 =null;
		TreeRuleReturnScope package_name9 =null;
		TreeRuleReturnScope seq_of_statements10 =null;
		TreeRuleReturnScope exception_clause11 =null;
		RuleReturnScope items = null;
		try {
			// PLSQLPrinter_DDL.g:85:5: ( ^( CREATE_PACKAGE_SPEC ( REPLACE_VK )? package_name ( invoker_rights_clause )? (items+= package_obj_spec )* ) -> create_package_spec(is_replace=$REPLACE_VK != nullname=$package_name.stinvoker_rights_clause=$invoker_rights_clause.stitems=$items)| ^( CREATE_PACKAGE_BODY ( REPLACE_VK )? package_name (items+= package_obj_body )* ( seq_of_statements )? ( exception_clause )? ) -> create_package_body(is_replace=$REPLACE_VK != nullname=$package_name.stitems=$itemsinit_section_seq_of_statements=$seq_of_statements.stinit_section_exception_clause=$exception_clause.st))
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==CREATE_PACKAGE_SPEC) ) {
				alt36=1;
			}
			else if ( (LA36_0==CREATE_PACKAGE_BODY) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// PLSQLPrinter_DDL.g:85:10: ^( CREATE_PACKAGE_SPEC ( REPLACE_VK )? package_name ( invoker_rights_clause )? (items+= package_obj_spec )* )
					{
					match(input,CREATE_PACKAGE_SPEC,FOLLOW_CREATE_PACKAGE_SPEC_in_create_package904); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:85:32: ( REPLACE_VK )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==REPLACE_VK) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// PLSQLPrinter_DDL.g:85:32: REPLACE_VK
							{
							REPLACE_VK5=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_package906); 
							}
							break;

					}

					pushFollow(FOLLOW_package_name_in_create_package909);
					package_name6=gPLSQLPrinter.package_name();
					state._fsp--;

					// PLSQLPrinter_DDL.g:85:57: ( invoker_rights_clause )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==AUTHID_VK) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// PLSQLPrinter_DDL.g:85:57: invoker_rights_clause
							{
							pushFollow(FOLLOW_invoker_rights_clause_in_create_package911);
							invoker_rights_clause7=invoker_rights_clause();
							state._fsp--;

							}
							break;

					}

					// PLSQLPrinter_DDL.g:85:85: (items+= package_obj_spec )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==CURSOR_DECLARE||LA31_0==EXCEPTION_DECLARE||LA31_0==FUNCTION_SPEC||LA31_0==PRAGMA_DECLARE||LA31_0==PROCEDURE_SPEC||(LA31_0 >= RECORD_TYPE_DECLARE_FIELDS && LA31_0 <= RECORD_VAR_DECLARE)||LA31_0==SUBTYPE_DECLARE||(LA31_0 >= TABLE_TYPE_DECLARE && LA31_0 <= TABLE_VAR_DECLARE)||LA31_0==VARIABLE_DECLARE) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// PLSQLPrinter_DDL.g:85:85: items+= package_obj_spec
							{
							pushFollow(FOLLOW_package_obj_spec_in_create_package916);
							items=package_obj_spec();
							state._fsp--;

							if (list_items==null) list_items=new ArrayList<Object>();
							list_items.add(items.getTemplate());
							}
							break;

						default :
							break loop31;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 86:5: -> create_package_spec(is_replace=$REPLACE_VK != nullname=$package_name.stinvoker_rights_clause=$invoker_rights_clause.stitems=$items)
					{
						retval.st = templateLib.getInstanceOf("create_package_spec",new STAttrMap().put("is_replace", REPLACE_VK5 != null).put("name", (package_name6!=null?((StringTemplate)package_name6.getTemplate()):null)).put("invoker_rights_clause", (invoker_rights_clause7!=null?((StringTemplate)invoker_rights_clause7.getTemplate()):null)).put("items", list_items));
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:89:10: ^( CREATE_PACKAGE_BODY ( REPLACE_VK )? package_name (items+= package_obj_body )* ( seq_of_statements )? ( exception_clause )? )
					{
					match(input,CREATE_PACKAGE_BODY,FOLLOW_CREATE_PACKAGE_BODY_in_create_package984); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:89:32: ( REPLACE_VK )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==REPLACE_VK) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// PLSQLPrinter_DDL.g:89:32: REPLACE_VK
							{
							REPLACE_VK8=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_package986); 
							}
							break;

					}

					pushFollow(FOLLOW_package_name_in_create_package989);
					package_name9=gPLSQLPrinter.package_name();
					state._fsp--;

					// PLSQLPrinter_DDL.g:89:62: (items+= package_obj_body )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==CREATE_FUNCTION||LA33_0==CREATE_PROCEDURE||(LA33_0 >= CREATE_TYPE_BODY && LA33_0 <= CREATE_TYPE_SPEC)||LA33_0==CURSOR_DECLARE||LA33_0==EXCEPTION_DECLARE||LA33_0==FUNCTION_SPEC||LA33_0==PROCEDURE_SPEC||(LA33_0 >= RECORD_TYPE_DECLARE_FIELDS && LA33_0 <= RECORD_VAR_DECLARE)||LA33_0==SUBTYPE_DECLARE||(LA33_0 >= TABLE_TYPE_DECLARE && LA33_0 <= TABLE_VAR_DECLARE)||LA33_0==VARIABLE_DECLARE) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// PLSQLPrinter_DDL.g:89:62: items+= package_obj_body
							{
							pushFollow(FOLLOW_package_obj_body_in_create_package993);
							items=package_obj_body();
							state._fsp--;

							if (list_items==null) list_items=new ArrayList<Object>();
							list_items.add(items.getTemplate());
							}
							break;

						default :
							break loop33;
						}
					}

					// PLSQLPrinter_DDL.g:89:82: ( seq_of_statements )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==STATEMENTS) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// PLSQLPrinter_DDL.g:89:82: seq_of_statements
							{
							pushFollow(FOLLOW_seq_of_statements_in_create_package996);
							seq_of_statements10=gPLSQLPrinter.seq_of_statements();
							state._fsp--;

							}
							break;

					}

					// PLSQLPrinter_DDL.g:89:101: ( exception_clause )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==SQL92_RESERVED_EXCEPTION) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// PLSQLPrinter_DDL.g:89:101: exception_clause
							{
							pushFollow(FOLLOW_exception_clause_in_create_package999);
							exception_clause11=gPLSQLPrinter.exception_clause();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 90:5: -> create_package_body(is_replace=$REPLACE_VK != nullname=$package_name.stitems=$itemsinit_section_seq_of_statements=$seq_of_statements.stinit_section_exception_clause=$exception_clause.st)
					{
						retval.st = templateLib.getInstanceOf("create_package_body",new STAttrMap().put("is_replace", REPLACE_VK8 != null).put("name", (package_name9!=null?((StringTemplate)package_name9.getTemplate()):null)).put("items", list_items).put("init_section_seq_of_statements", (seq_of_statements10!=null?((StringTemplate)seq_of_statements10.getTemplate()):null)).put("init_section_exception_clause", (exception_clause11!=null?((StringTemplate)exception_clause11.getTemplate()):null)));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_package"


	public static class package_obj_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "package_obj_spec"
	// PLSQLPrinter_DDL.g:98:1: package_obj_spec : ( variable_declaration -> { $variable_declaration.st}| subtype_declaration -> { $subtype_declaration.st}| cursor_declaration -> { $cursor_declaration.st}| exception_declaration -> { $exception_declaration.st}| record_declaration -> { $record_declaration.st}| table_declaration -> { $table_declaration.st}| procedure_spec -> { $procedure_spec.st}| function_spec -> { $function_spec.st}| pragma_declaration -> { $pragma_declaration.st});
	public final PLSQLPrinter_PLSQLPrinter_DDL.package_obj_spec_return package_obj_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.package_obj_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.package_obj_spec_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope variable_declaration12 =null;
		TreeRuleReturnScope subtype_declaration13 =null;
		TreeRuleReturnScope cursor_declaration14 =null;
		TreeRuleReturnScope exception_declaration15 =null;
		TreeRuleReturnScope record_declaration16 =null;
		TreeRuleReturnScope table_declaration17 =null;
		TreeRuleReturnScope procedure_spec18 =null;
		TreeRuleReturnScope function_spec19 =null;
		TreeRuleReturnScope pragma_declaration20 =null;

		try {
			// PLSQLPrinter_DDL.g:99:5: ( variable_declaration -> { $variable_declaration.st}| subtype_declaration -> { $subtype_declaration.st}| cursor_declaration -> { $cursor_declaration.st}| exception_declaration -> { $exception_declaration.st}| record_declaration -> { $record_declaration.st}| table_declaration -> { $table_declaration.st}| procedure_spec -> { $procedure_spec.st}| function_spec -> { $function_spec.st}| pragma_declaration -> { $pragma_declaration.st})
			int alt37=9;
			switch ( input.LA(1) ) {
			case VARIABLE_DECLARE:
				{
				alt37=1;
				}
				break;
			case SUBTYPE_DECLARE:
				{
				alt37=2;
				}
				break;
			case CURSOR_DECLARE:
				{
				alt37=3;
				}
				break;
			case EXCEPTION_DECLARE:
				{
				alt37=4;
				}
				break;
			case RECORD_TYPE_DECLARE_FIELDS:
			case RECORD_TYPE_DECLARE_REFCURSOR:
			case RECORD_VAR_DECLARE:
				{
				alt37=5;
				}
				break;
			case TABLE_TYPE_DECLARE:
			case TABLE_VAR_DECLARE:
				{
				alt37=6;
				}
				break;
			case PROCEDURE_SPEC:
				{
				alt37=7;
				}
				break;
			case FUNCTION_SPEC:
				{
				alt37=8;
				}
				break;
			case PRAGMA_DECLARE:
				{
				alt37=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// PLSQLPrinter_DDL.g:99:10: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_package_obj_spec1092);
					variable_declaration12=gPLSQLPrinter.variable_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 99:31: -> { $variable_declaration.st}
					{
						retval.st =  (variable_declaration12!=null?((StringTemplate)variable_declaration12.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:100:11: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_package_obj_spec1108);
					subtype_declaration13=gPLSQLPrinter.subtype_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 100:31: -> { $subtype_declaration.st}
					{
						retval.st =  (subtype_declaration13!=null?((StringTemplate)subtype_declaration13.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:101:11: cursor_declaration
					{
					pushFollow(FOLLOW_cursor_declaration_in_package_obj_spec1124);
					cursor_declaration14=gPLSQLPrinter.cursor_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 101:30: -> { $cursor_declaration.st}
					{
						retval.st =  (cursor_declaration14!=null?((StringTemplate)cursor_declaration14.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:102:11: exception_declaration
					{
					pushFollow(FOLLOW_exception_declaration_in_package_obj_spec1140);
					exception_declaration15=gPLSQLPrinter.exception_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 102:33: -> { $exception_declaration.st}
					{
						retval.st =  (exception_declaration15!=null?((StringTemplate)exception_declaration15.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:103:11: record_declaration
					{
					pushFollow(FOLLOW_record_declaration_in_package_obj_spec1156);
					record_declaration16=gPLSQLPrinter.record_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 103:30: -> { $record_declaration.st}
					{
						retval.st =  (record_declaration16!=null?((StringTemplate)record_declaration16.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:104:11: table_declaration
					{
					pushFollow(FOLLOW_table_declaration_in_package_obj_spec1172);
					table_declaration17=gPLSQLPrinter.table_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 104:29: -> { $table_declaration.st}
					{
						retval.st =  (table_declaration17!=null?((StringTemplate)table_declaration17.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// PLSQLPrinter_DDL.g:105:11: procedure_spec
					{
					pushFollow(FOLLOW_procedure_spec_in_package_obj_spec1188);
					procedure_spec18=procedure_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 105:26: -> { $procedure_spec.st}
					{
						retval.st =  (procedure_spec18!=null?((StringTemplate)procedure_spec18.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// PLSQLPrinter_DDL.g:106:11: function_spec
					{
					pushFollow(FOLLOW_function_spec_in_package_obj_spec1204);
					function_spec19=function_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 106:25: -> { $function_spec.st}
					{
						retval.st =  (function_spec19!=null?((StringTemplate)function_spec19.getTemplate()):null);
					}



					}
					break;
				case 9 :
					// PLSQLPrinter_DDL.g:107:11: pragma_declaration
					{
					pushFollow(FOLLOW_pragma_declaration_in_package_obj_spec1220);
					pragma_declaration20=gPLSQLPrinter.pragma_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 107:30: -> { $pragma_declaration.st}
					{
						retval.st =  (pragma_declaration20!=null?((StringTemplate)pragma_declaration20.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "package_obj_spec"


	public static class procedure_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "procedure_spec"
	// PLSQLPrinter_DDL.g:110:1: procedure_spec : ^( PROCEDURE_SPEC procedure_name ^( PARAMETERS (arguments+= parameter )* ) ( ^( CALL_MODE call_spec ) )? ) -> procedure_spec(name=$procedure_name.starguments=$arguments);
	public final PLSQLPrinter_PLSQLPrinter_DDL.procedure_spec_return procedure_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.procedure_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.procedure_spec_return();
		retval.start = input.LT(1);

		List<Object> list_arguments=null;
		TreeRuleReturnScope procedure_name21 =null;
		RuleReturnScope arguments = null;
		try {
			// PLSQLPrinter_DDL.g:111:5: ( ^( PROCEDURE_SPEC procedure_name ^( PARAMETERS (arguments+= parameter )* ) ( ^( CALL_MODE call_spec ) )? ) -> procedure_spec(name=$procedure_name.starguments=$arguments))
			// PLSQLPrinter_DDL.g:111:11: ^( PROCEDURE_SPEC procedure_name ^( PARAMETERS (arguments+= parameter )* ) ( ^( CALL_MODE call_spec ) )? )
			{
			match(input,PROCEDURE_SPEC,FOLLOW_PROCEDURE_SPEC_in_procedure_spec1246); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_procedure_name_in_procedure_spec1248);
			procedure_name21=gPLSQLPrinter.procedure_name();
			state._fsp--;

			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_procedure_spec1251); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:111:65: (arguments+= parameter )*
				loop38:
				while (true) {
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==PARAMETER) ) {
						alt38=1;
					}

					switch (alt38) {
					case 1 :
						// PLSQLPrinter_DDL.g:111:65: arguments+= parameter
						{
						pushFollow(FOLLOW_parameter_in_procedure_spec1255);
						arguments=parameter();
						state._fsp--;

						if (list_arguments==null) list_arguments=new ArrayList<Object>();
						list_arguments.add(arguments.getTemplate());
						}
						break;

					default :
						break loop38;
					}
				}

				match(input, Token.UP, null); 
			}

			// PLSQLPrinter_DDL.g:112:13: ( ^( CALL_MODE call_spec ) )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==CALL_MODE) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// PLSQLPrinter_DDL.g:112:14: ^( CALL_MODE call_spec )
					{
					match(input,CALL_MODE,FOLLOW_CALL_MODE_in_procedure_spec1273); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_call_spec_in_procedure_spec1275);
					call_spec();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 114:5: -> procedure_spec(name=$procedure_name.starguments=$arguments)
			{
				retval.st = templateLib.getInstanceOf("procedure_spec",new STAttrMap().put("name", (procedure_name21!=null?((StringTemplate)procedure_name21.getTemplate()):null)).put("arguments", list_arguments));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedure_spec"


	public static class function_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "function_spec"
	// PLSQLPrinter_DDL.g:117:1: function_spec : ^( FUNCTION_SPEC function_name type_spec ^( PARAMETERS (arguments+= parameter )* ) ( PIPELINED_VK )? ( RESULT_CACHE_VK )? ( DETERMINISTIC_VK )? ) -> function_spec(name=$function_name.starguments=$argumentsreturn_type=$type_spec.stis_pipelined=$PIPELINED_VK != nullis_result_cache=$RESULT_CACHE_VK != nullis_deterministic=$DETERMINISTIC_VK != null);
	public final PLSQLPrinter_PLSQLPrinter_DDL.function_spec_return function_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.function_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.function_spec_return();
		retval.start = input.LT(1);

		CommonTree PIPELINED_VK24=null;
		CommonTree RESULT_CACHE_VK25=null;
		CommonTree DETERMINISTIC_VK26=null;
		List<Object> list_arguments=null;
		TreeRuleReturnScope function_name22 =null;
		TreeRuleReturnScope type_spec23 =null;
		RuleReturnScope arguments = null;
		try {
			// PLSQLPrinter_DDL.g:118:5: ( ^( FUNCTION_SPEC function_name type_spec ^( PARAMETERS (arguments+= parameter )* ) ( PIPELINED_VK )? ( RESULT_CACHE_VK )? ( DETERMINISTIC_VK )? ) -> function_spec(name=$function_name.starguments=$argumentsreturn_type=$type_spec.stis_pipelined=$PIPELINED_VK != nullis_result_cache=$RESULT_CACHE_VK != nullis_deterministic=$DETERMINISTIC_VK != null))
			// PLSQLPrinter_DDL.g:118:10: ^( FUNCTION_SPEC function_name type_spec ^( PARAMETERS (arguments+= parameter )* ) ( PIPELINED_VK )? ( RESULT_CACHE_VK )? ( DETERMINISTIC_VK )? )
			{
			match(input,FUNCTION_SPEC,FOLLOW_FUNCTION_SPEC_in_function_spec1325); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_function_name_in_function_spec1327);
			function_name22=gPLSQLPrinter.function_name();
			state._fsp--;

			pushFollow(FOLLOW_type_spec_in_function_spec1329);
			type_spec23=gPLSQLPrinter.type_spec();
			state._fsp--;

			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_function_spec1332); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:118:72: (arguments+= parameter )*
				loop40:
				while (true) {
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==PARAMETER) ) {
						alt40=1;
					}

					switch (alt40) {
					case 1 :
						// PLSQLPrinter_DDL.g:118:72: arguments+= parameter
						{
						pushFollow(FOLLOW_parameter_in_function_spec1336);
						arguments=parameter();
						state._fsp--;

						if (list_arguments==null) list_arguments=new ArrayList<Object>();
						list_arguments.add(arguments.getTemplate());
						}
						break;

					default :
						break loop40;
					}
				}

				match(input, Token.UP, null); 
			}

			// PLSQLPrinter_DDL.g:119:13: ( PIPELINED_VK )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==PIPELINED_VK) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// PLSQLPrinter_DDL.g:119:13: PIPELINED_VK
					{
					PIPELINED_VK24=(CommonTree)match(input,PIPELINED_VK,FOLLOW_PIPELINED_VK_in_function_spec1352); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:119:27: ( RESULT_CACHE_VK )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==RESULT_CACHE_VK) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// PLSQLPrinter_DDL.g:119:27: RESULT_CACHE_VK
					{
					RESULT_CACHE_VK25=(CommonTree)match(input,RESULT_CACHE_VK,FOLLOW_RESULT_CACHE_VK_in_function_spec1355); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:119:44: ( DETERMINISTIC_VK )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==DETERMINISTIC_VK) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// PLSQLPrinter_DDL.g:119:44: DETERMINISTIC_VK
					{
					DETERMINISTIC_VK26=(CommonTree)match(input,DETERMINISTIC_VK,FOLLOW_DETERMINISTIC_VK_in_function_spec1358); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 121:5: -> function_spec(name=$function_name.starguments=$argumentsreturn_type=$type_spec.stis_pipelined=$PIPELINED_VK != nullis_result_cache=$RESULT_CACHE_VK != nullis_deterministic=$DETERMINISTIC_VK != null)
			{
				retval.st = templateLib.getInstanceOf("function_spec",new STAttrMap().put("name", (function_name22!=null?((StringTemplate)function_name22.getTemplate()):null)).put("arguments", list_arguments).put("return_type", (type_spec23!=null?((StringTemplate)type_spec23.getTemplate()):null)).put("is_pipelined", PIPELINED_VK24 != null).put("is_result_cache", RESULT_CACHE_VK25 != null).put("is_deterministic", DETERMINISTIC_VK26 != null));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_spec"


	public static class package_obj_body_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "package_obj_body"
	// PLSQLPrinter_DDL.g:126:1: package_obj_body : ( procedure_spec -> { $procedure_spec.st}| function_spec -> { $function_spec.st}| variable_declaration -> {$variable_declaration.st}| subtype_declaration -> {$subtype_declaration.st}| cursor_declaration -> {$cursor_declaration.st}| exception_declaration -> {$exception_declaration.st}| record_declaration -> {$record_declaration.st}| table_declaration -> {$table_declaration.st}| create_procedure_body -> {$create_procedure_body.st}| create_function_body -> {$create_function_body.st}| create_type -> {$create_type.st});
	public final PLSQLPrinter_PLSQLPrinter_DDL.package_obj_body_return package_obj_body() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.package_obj_body_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.package_obj_body_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope procedure_spec27 =null;
		TreeRuleReturnScope function_spec28 =null;
		TreeRuleReturnScope variable_declaration29 =null;
		TreeRuleReturnScope subtype_declaration30 =null;
		TreeRuleReturnScope cursor_declaration31 =null;
		TreeRuleReturnScope exception_declaration32 =null;
		TreeRuleReturnScope record_declaration33 =null;
		TreeRuleReturnScope table_declaration34 =null;
		TreeRuleReturnScope create_procedure_body35 =null;
		TreeRuleReturnScope create_function_body36 =null;
		TreeRuleReturnScope create_type37 =null;

		try {
			// PLSQLPrinter_DDL.g:127:5: ( procedure_spec -> { $procedure_spec.st}| function_spec -> { $function_spec.st}| variable_declaration -> {$variable_declaration.st}| subtype_declaration -> {$subtype_declaration.st}| cursor_declaration -> {$cursor_declaration.st}| exception_declaration -> {$exception_declaration.st}| record_declaration -> {$record_declaration.st}| table_declaration -> {$table_declaration.st}| create_procedure_body -> {$create_procedure_body.st}| create_function_body -> {$create_function_body.st}| create_type -> {$create_type.st})
			int alt44=11;
			switch ( input.LA(1) ) {
			case PROCEDURE_SPEC:
				{
				alt44=1;
				}
				break;
			case FUNCTION_SPEC:
				{
				alt44=2;
				}
				break;
			case VARIABLE_DECLARE:
				{
				alt44=3;
				}
				break;
			case SUBTYPE_DECLARE:
				{
				alt44=4;
				}
				break;
			case CURSOR_DECLARE:
				{
				alt44=5;
				}
				break;
			case EXCEPTION_DECLARE:
				{
				alt44=6;
				}
				break;
			case RECORD_TYPE_DECLARE_FIELDS:
			case RECORD_TYPE_DECLARE_REFCURSOR:
			case RECORD_VAR_DECLARE:
				{
				alt44=7;
				}
				break;
			case TABLE_TYPE_DECLARE:
			case TABLE_VAR_DECLARE:
				{
				alt44=8;
				}
				break;
			case CREATE_PROCEDURE:
				{
				alt44=9;
				}
				break;
			case CREATE_FUNCTION:
				{
				alt44=10;
				}
				break;
			case CREATE_TYPE_BODY:
			case CREATE_TYPE_SPEC:
				{
				alt44=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// PLSQLPrinter_DDL.g:127:11: procedure_spec
					{
					pushFollow(FOLLOW_procedure_spec_in_package_obj_body1453);
					procedure_spec27=procedure_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 127:26: -> { $procedure_spec.st}
					{
						retval.st =  (procedure_spec27!=null?((StringTemplate)procedure_spec27.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:128:11: function_spec
					{
					pushFollow(FOLLOW_function_spec_in_package_obj_body1469);
					function_spec28=function_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 128:25: -> { $function_spec.st}
					{
						retval.st =  (function_spec28!=null?((StringTemplate)function_spec28.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:129:11: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_package_obj_body1485);
					variable_declaration29=gPLSQLPrinter.variable_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 129:32: -> {$variable_declaration.st}
					{
						retval.st = (variable_declaration29!=null?((StringTemplate)variable_declaration29.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:130:11: subtype_declaration
					{
					pushFollow(FOLLOW_subtype_declaration_in_package_obj_body1501);
					subtype_declaration30=gPLSQLPrinter.subtype_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 130:31: -> {$subtype_declaration.st}
					{
						retval.st = (subtype_declaration30!=null?((StringTemplate)subtype_declaration30.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:131:11: cursor_declaration
					{
					pushFollow(FOLLOW_cursor_declaration_in_package_obj_body1517);
					cursor_declaration31=gPLSQLPrinter.cursor_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 131:30: -> {$cursor_declaration.st}
					{
						retval.st = (cursor_declaration31!=null?((StringTemplate)cursor_declaration31.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:132:11: exception_declaration
					{
					pushFollow(FOLLOW_exception_declaration_in_package_obj_body1533);
					exception_declaration32=gPLSQLPrinter.exception_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 132:33: -> {$exception_declaration.st}
					{
						retval.st = (exception_declaration32!=null?((StringTemplate)exception_declaration32.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// PLSQLPrinter_DDL.g:133:11: record_declaration
					{
					pushFollow(FOLLOW_record_declaration_in_package_obj_body1549);
					record_declaration33=gPLSQLPrinter.record_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 133:30: -> {$record_declaration.st}
					{
						retval.st = (record_declaration33!=null?((StringTemplate)record_declaration33.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// PLSQLPrinter_DDL.g:134:11: table_declaration
					{
					pushFollow(FOLLOW_table_declaration_in_package_obj_body1565);
					table_declaration34=gPLSQLPrinter.table_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 134:29: -> {$table_declaration.st}
					{
						retval.st = (table_declaration34!=null?((StringTemplate)table_declaration34.getTemplate()):null);
					}



					}
					break;
				case 9 :
					// PLSQLPrinter_DDL.g:135:11: create_procedure_body
					{
					pushFollow(FOLLOW_create_procedure_body_in_package_obj_body1581);
					create_procedure_body35=create_procedure_body();
					state._fsp--;

					// TEMPLATE REWRITE
					// 135:33: -> {$create_procedure_body.st}
					{
						retval.st = (create_procedure_body35!=null?((StringTemplate)create_procedure_body35.getTemplate()):null);
					}



					}
					break;
				case 10 :
					// PLSQLPrinter_DDL.g:136:11: create_function_body
					{
					pushFollow(FOLLOW_create_function_body_in_package_obj_body1597);
					create_function_body36=create_function_body();
					state._fsp--;

					// TEMPLATE REWRITE
					// 136:32: -> {$create_function_body.st}
					{
						retval.st = (create_function_body36!=null?((StringTemplate)create_function_body36.getTemplate()):null);
					}



					}
					break;
				case 11 :
					// PLSQLPrinter_DDL.g:137:11: create_type
					{
					pushFollow(FOLLOW_create_type_in_package_obj_body1613);
					create_type37=create_type();
					state._fsp--;

					// TEMPLATE REWRITE
					// 137:23: -> {$create_type.st}
					{
						retval.st = (create_type37!=null?((StringTemplate)create_type37.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "package_obj_body"


	public static class drop_procedure_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop_procedure"
	// PLSQLPrinter_DDL.g:146:1: drop_procedure : ^( DROP_PROCEDURE procedure_name ) -> template( \"not implemented: drop_procedure\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.drop_procedure_return drop_procedure() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.drop_procedure_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.drop_procedure_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:147:5: ( ^( DROP_PROCEDURE procedure_name ) -> template( \"not implemented: drop_procedure\")
			// PLSQLPrinter_DDL.g:147:10: ^( DROP_PROCEDURE procedure_name )
			{
			match(input,DROP_PROCEDURE,FOLLOW_DROP_PROCEDURE_in_drop_procedure1644); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_procedure_name_in_drop_procedure1646);
			gPLSQLPrinter.procedure_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 148:5: -> template( \"not implemented: drop_procedure\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: drop_procedure");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop_procedure"


	public static class alter_procedure_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_procedure"
	// PLSQLPrinter_DDL.g:151:1: alter_procedure : ^( ALTER_PROCEDURE procedure_name ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) -> template( \"not implemented: alter_procedure\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_procedure_return alter_procedure() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_procedure_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_procedure_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:152:5: ( ^( ALTER_PROCEDURE procedure_name ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) -> template( \"not implemented: alter_procedure\")
			// PLSQLPrinter_DDL.g:152:10: ^( ALTER_PROCEDURE procedure_name ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* )
			{
			match(input,ALTER_PROCEDURE,FOLLOW_ALTER_PROCEDURE_in_alter_procedure1682); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_procedure_name_in_alter_procedure1684);
			gPLSQLPrinter.procedure_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:152:43: ( DEBUG_VK )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==DEBUG_VK) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// PLSQLPrinter_DDL.g:152:43: DEBUG_VK
					{
					match(input,DEBUG_VK,FOLLOW_DEBUG_VK_in_alter_procedure1686); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:152:53: ( REUSE_VK )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==REUSE_VK) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// PLSQLPrinter_DDL.g:152:53: REUSE_VK
					{
					match(input,REUSE_VK,FOLLOW_REUSE_VK_in_alter_procedure1689); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:152:63: ( compiler_parameters_clause )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==COMPILER_PARAMETER) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// PLSQLPrinter_DDL.g:152:63: compiler_parameters_clause
					{
					pushFollow(FOLLOW_compiler_parameters_clause_in_alter_procedure1692);
					compiler_parameters_clause();
					state._fsp--;

					}
					break;

				default :
					break loop47;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 153:5: -> template( \"not implemented: alter_procedure\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_procedure");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_procedure"


	public static class create_procedure_body_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_procedure_body"
	// PLSQLPrinter_DDL.g:156:1: create_procedure_body : ^( CREATE_PROCEDURE ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? procedure_name ^( PARAMETERS (arguments+= parameter )* ) ( invoker_rights_clause )? create_procedure_body_impl ) -> create_procedure_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname=$procedure_name.starguments=$argumentsinvoker_rights_clause=$invoker_rights_clause.stimpl=$create_procedure_body_impl.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_procedure_body_return create_procedure_body() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_procedure_body_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_procedure_body_return();
		retval.start = input.LT(1);

		CommonTree SQL92_RESERVED_CREATE38=null;
		CommonTree REPLACE_VK39=null;
		List<Object> list_arguments=null;
		TreeRuleReturnScope procedure_name40 =null;
		TreeRuleReturnScope invoker_rights_clause41 =null;
		TreeRuleReturnScope create_procedure_body_impl42 =null;
		RuleReturnScope arguments = null;
		try {
			// PLSQLPrinter_DDL.g:157:5: ( ^( CREATE_PROCEDURE ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? procedure_name ^( PARAMETERS (arguments+= parameter )* ) ( invoker_rights_clause )? create_procedure_body_impl ) -> create_procedure_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname=$procedure_name.starguments=$argumentsinvoker_rights_clause=$invoker_rights_clause.stimpl=$create_procedure_body_impl.st))
			// PLSQLPrinter_DDL.g:157:10: ^( CREATE_PROCEDURE ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? procedure_name ^( PARAMETERS (arguments+= parameter )* ) ( invoker_rights_clause )? create_procedure_body_impl )
			{
			match(input,CREATE_PROCEDURE,FOLLOW_CREATE_PROCEDURE_in_create_procedure_body1729); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:157:29: ( SQL92_RESERVED_CREATE )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==SQL92_RESERVED_CREATE) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// PLSQLPrinter_DDL.g:157:29: SQL92_RESERVED_CREATE
					{
					SQL92_RESERVED_CREATE38=(CommonTree)match(input,SQL92_RESERVED_CREATE,FOLLOW_SQL92_RESERVED_CREATE_in_create_procedure_body1731); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:157:52: ( REPLACE_VK )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==REPLACE_VK) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// PLSQLPrinter_DDL.g:157:52: REPLACE_VK
					{
					REPLACE_VK39=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_procedure_body1734); 
					}
					break;

			}

			pushFollow(FOLLOW_procedure_name_in_create_procedure_body1737);
			procedure_name40=gPLSQLPrinter.procedure_name();
			state._fsp--;

			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_create_procedure_body1740); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:157:101: (arguments+= parameter )*
				loop50:
				while (true) {
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==PARAMETER) ) {
						alt50=1;
					}

					switch (alt50) {
					case 1 :
						// PLSQLPrinter_DDL.g:157:101: arguments+= parameter
						{
						pushFollow(FOLLOW_parameter_in_create_procedure_body1744);
						arguments=parameter();
						state._fsp--;

						if (list_arguments==null) list_arguments=new ArrayList<Object>();
						list_arguments.add(arguments.getTemplate());
						}
						break;

					default :
						break loop50;
					}
				}

				match(input, Token.UP, null); 
			}

			// PLSQLPrinter_DDL.g:157:115: ( invoker_rights_clause )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==AUTHID_VK) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// PLSQLPrinter_DDL.g:157:115: invoker_rights_clause
					{
					pushFollow(FOLLOW_invoker_rights_clause_in_create_procedure_body1748);
					invoker_rights_clause41=invoker_rights_clause();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_create_procedure_body_impl_in_create_procedure_body1762);
			create_procedure_body_impl42=create_procedure_body_impl();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 160:5: -> create_procedure_body(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nullname=$procedure_name.starguments=$argumentsinvoker_rights_clause=$invoker_rights_clause.stimpl=$create_procedure_body_impl.st)
			{
				retval.st = templateLib.getInstanceOf("create_procedure_body",new STAttrMap().put("is_create", SQL92_RESERVED_CREATE38 != null).put("is_replace", REPLACE_VK39 != null).put("name", (procedure_name40!=null?((StringTemplate)procedure_name40.getTemplate()):null)).put("arguments", list_arguments).put("invoker_rights_clause", (invoker_rights_clause41!=null?((StringTemplate)invoker_rights_clause41.getTemplate()):null)).put("impl", (create_procedure_body_impl42!=null?((StringTemplate)create_procedure_body_impl42.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_procedure_body"


	public static class create_procedure_body_impl_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_procedure_body_impl"
	// PLSQLPrinter_DDL.g:165:1: create_procedure_body_impl : ( EXTERNAL_VK -> create_procedure_body_impl_external(| ^( CALL_MODE call_spec ) -> { $call_spec.st }| ^( BODY_MODE block ) -> { $block.st });
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_procedure_body_impl_return create_procedure_body_impl() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_procedure_body_impl_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_procedure_body_impl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope call_spec43 =null;
		TreeRuleReturnScope block44 =null;

		try {
			// PLSQLPrinter_DDL.g:166:5: ( EXTERNAL_VK -> create_procedure_body_impl_external(| ^( CALL_MODE call_spec ) -> { $call_spec.st }| ^( BODY_MODE block ) -> { $block.st })
			int alt52=3;
			switch ( input.LA(1) ) {
			case EXTERNAL_VK:
				{
				alt52=1;
				}
				break;
			case CALL_MODE:
				{
				alt52=2;
				}
				break;
			case BODY_MODE:
				{
				alt52=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// PLSQLPrinter_DDL.g:166:9: EXTERNAL_VK
					{
					match(input,EXTERNAL_VK,FOLLOW_EXTERNAL_VK_in_create_procedure_body_impl1856); 
					// TEMPLATE REWRITE
					// 166:21: -> create_procedure_body_impl_external(
					{
						retval.st = templateLib.getInstanceOf("create_procedure_body_impl_external");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:167:14: ^( CALL_MODE call_spec )
					{
					match(input,CALL_MODE,FOLLOW_CALL_MODE_in_create_procedure_body_impl1878); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_call_spec_in_create_procedure_body_impl1880);
					call_spec43=call_spec();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 167:37: -> { $call_spec.st }
					{
						retval.st =  (call_spec43!=null?((StringTemplate)call_spec43.getTemplate()):null) ;
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:168:14: ^( BODY_MODE block )
					{
					match(input,BODY_MODE,FOLLOW_BODY_MODE_in_create_procedure_body_impl1901); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_create_procedure_body_impl1903);
					block44=gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 168:33: -> { $block.st }
					{
						retval.st =  (block44!=null?((StringTemplate)block44.getTemplate()):null) ;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_procedure_body_impl"


	public static class drop_trigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop_trigger"
	// PLSQLPrinter_DDL.g:175:1: drop_trigger : ^( DROP_TRIGGER trigger_name ) -> template( \"not implemented: drop_trigger\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.drop_trigger_return drop_trigger() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.drop_trigger_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.drop_trigger_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:176:5: ( ^( DROP_TRIGGER trigger_name ) -> template( \"not implemented: drop_trigger\")
			// PLSQLPrinter_DDL.g:176:10: ^( DROP_TRIGGER trigger_name )
			{
			match(input,DROP_TRIGGER,FOLLOW_DROP_TRIGGER_in_drop_trigger1933); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_trigger_name_in_drop_trigger1935);
			gPLSQLPrinter.trigger_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 177:5: -> template( \"not implemented: drop_trigger\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: drop_trigger");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop_trigger"


	public static class alter_trigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_trigger"
	// PLSQLPrinter_DDL.g:180:1: alter_trigger : ^( ALTER_TRIGGER trigger_name ( ( ENABLE_VK | DISABLE_VK ) | ^( RENAME_VK trigger_name ) | ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) ) -> template( \"not implemented: alter_trigger\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_trigger_return alter_trigger() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_trigger_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_trigger_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:181:5: ( ^( ALTER_TRIGGER trigger_name ( ( ENABLE_VK | DISABLE_VK ) | ^( RENAME_VK trigger_name ) | ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) ) -> template( \"not implemented: alter_trigger\")
			// PLSQLPrinter_DDL.g:181:10: ^( ALTER_TRIGGER trigger_name ( ( ENABLE_VK | DISABLE_VK ) | ^( RENAME_VK trigger_name ) | ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) )
			{
			match(input,ALTER_TRIGGER,FOLLOW_ALTER_TRIGGER_in_alter_trigger1971); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_trigger_name_in_alter_trigger1973);
			gPLSQLPrinter.trigger_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:182:13: ( ( ENABLE_VK | DISABLE_VK ) | ^( RENAME_VK trigger_name ) | ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* )
			int alt57=3;
			switch ( input.LA(1) ) {
			case DISABLE_VK:
			case ENABLE_VK:
				{
				alt57=1;
				}
				break;
			case RENAME_VK:
				{
				alt57=2;
				}
				break;
			case UP:
			case COMPILER_PARAMETER:
			case DEBUG_VK:
			case REUSE_VK:
				{
				alt57=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// PLSQLPrinter_DDL.g:182:18: ( ENABLE_VK | DISABLE_VK )
					{
					// PLSQLPrinter_DDL.g:182:18: ( ENABLE_VK | DISABLE_VK )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==ENABLE_VK) ) {
						alt53=1;
					}
					else if ( (LA53_0==DISABLE_VK) ) {
						alt53=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// PLSQLPrinter_DDL.g:182:19: ENABLE_VK
							{
							match(input,ENABLE_VK,FOLLOW_ENABLE_VK_in_alter_trigger1994); 
							}
							break;
						case 2 :
							// PLSQLPrinter_DDL.g:182:29: DISABLE_VK
							{
							match(input,DISABLE_VK,FOLLOW_DISABLE_VK_in_alter_trigger1996); 
							}
							break;

					}

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:183:18: ^( RENAME_VK trigger_name )
					{
					match(input,RENAME_VK,FOLLOW_RENAME_VK_in_alter_trigger2017); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_trigger_name_in_alter_trigger2019);
					gPLSQLPrinter.trigger_name();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:184:18: ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )*
					{
					// PLSQLPrinter_DDL.g:184:18: ( DEBUG_VK )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==DEBUG_VK) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// PLSQLPrinter_DDL.g:184:18: DEBUG_VK
							{
							match(input,DEBUG_VK,FOLLOW_DEBUG_VK_in_alter_trigger2039); 
							}
							break;

					}

					// PLSQLPrinter_DDL.g:184:28: ( REUSE_VK )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==REUSE_VK) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// PLSQLPrinter_DDL.g:184:28: REUSE_VK
							{
							match(input,REUSE_VK,FOLLOW_REUSE_VK_in_alter_trigger2042); 
							}
							break;

					}

					// PLSQLPrinter_DDL.g:184:38: ( compiler_parameters_clause )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==COMPILER_PARAMETER) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// PLSQLPrinter_DDL.g:184:38: compiler_parameters_clause
							{
							pushFollow(FOLLOW_compiler_parameters_clause_in_alter_trigger2045);
							compiler_parameters_clause();
							state._fsp--;

							}
							break;

						default :
							break loop56;
						}
					}

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 187:5: -> template( \"not implemented: alter_trigger\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_trigger");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_trigger"


	public static class create_trigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_trigger"
	// PLSQLPrinter_DDL.g:190:1: create_trigger : ^( CREATE_TRIGGER ( REPLACE_VK )? trigger_name ( simple_dml_trigger )? ( compound_dml_trigger )? ( non_dml_trigger )? ( trigger_follows_clause )? ( ENABLE_VK | DISABLE_VK )? ( trigger_when_clause )? trigger_body ) -> template( \"not implemented: create_trigger\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_trigger_return create_trigger() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_trigger_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_trigger_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:191:5: ( ^( CREATE_TRIGGER ( REPLACE_VK )? trigger_name ( simple_dml_trigger )? ( compound_dml_trigger )? ( non_dml_trigger )? ( trigger_follows_clause )? ( ENABLE_VK | DISABLE_VK )? ( trigger_when_clause )? trigger_body ) -> template( \"not implemented: create_trigger\")
			// PLSQLPrinter_DDL.g:191:10: ^( CREATE_TRIGGER ( REPLACE_VK )? trigger_name ( simple_dml_trigger )? ( compound_dml_trigger )? ( non_dml_trigger )? ( trigger_follows_clause )? ( ENABLE_VK | DISABLE_VK )? ( trigger_when_clause )? trigger_body )
			{
			match(input,CREATE_TRIGGER,FOLLOW_CREATE_TRIGGER_in_create_trigger2105); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:191:27: ( REPLACE_VK )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==REPLACE_VK) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// PLSQLPrinter_DDL.g:191:27: REPLACE_VK
					{
					match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_trigger2107); 
					}
					break;

			}

			pushFollow(FOLLOW_trigger_name_in_create_trigger2110);
			gPLSQLPrinter.trigger_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:192:13: ( simple_dml_trigger )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==SIMPLE_DML) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// PLSQLPrinter_DDL.g:192:13: simple_dml_trigger
					{
					pushFollow(FOLLOW_simple_dml_trigger_in_create_trigger2126);
					simple_dml_trigger();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:192:33: ( compound_dml_trigger )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==COMPOUND_DML) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// PLSQLPrinter_DDL.g:192:33: compound_dml_trigger
					{
					pushFollow(FOLLOW_compound_dml_trigger_in_create_trigger2129);
					compound_dml_trigger();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:192:55: ( non_dml_trigger )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==NON_DML) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// PLSQLPrinter_DDL.g:192:55: non_dml_trigger
					{
					pushFollow(FOLLOW_non_dml_trigger_in_create_trigger2132);
					non_dml_trigger();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:193:13: ( trigger_follows_clause )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==FOLLOWS_VK) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// PLSQLPrinter_DDL.g:193:13: trigger_follows_clause
					{
					pushFollow(FOLLOW_trigger_follows_clause_in_create_trigger2147);
					trigger_follows_clause();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:193:37: ( ENABLE_VK | DISABLE_VK )?
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==ENABLE_VK) ) {
				alt63=1;
			}
			else if ( (LA63_0==DISABLE_VK) ) {
				alt63=2;
			}
			switch (alt63) {
				case 1 :
					// PLSQLPrinter_DDL.g:193:38: ENABLE_VK
					{
					match(input,ENABLE_VK,FOLLOW_ENABLE_VK_in_create_trigger2151); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:193:48: DISABLE_VK
					{
					match(input,DISABLE_VK,FOLLOW_DISABLE_VK_in_create_trigger2153); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:193:61: ( trigger_when_clause )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==SQL92_RESERVED_WHEN) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// PLSQLPrinter_DDL.g:193:61: trigger_when_clause
					{
					pushFollow(FOLLOW_trigger_when_clause_in_create_trigger2157);
					trigger_when_clause();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_trigger_body_in_create_trigger2160);
			trigger_body();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 194:5: -> template( \"not implemented: create_trigger\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: create_trigger");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_trigger"


	public static class trigger_follows_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "trigger_follows_clause"
	// PLSQLPrinter_DDL.g:197:1: trigger_follows_clause : ^( FOLLOWS_VK ( trigger_name )+ ) -> template( \"not implemented: trigger_follows_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.trigger_follows_clause_return trigger_follows_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.trigger_follows_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.trigger_follows_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:198:5: ( ^( FOLLOWS_VK ( trigger_name )+ ) -> template( \"not implemented: trigger_follows_clause\")
			// PLSQLPrinter_DDL.g:198:10: ^( FOLLOWS_VK ( trigger_name )+ )
			{
			match(input,FOLLOWS_VK,FOLLOW_FOLLOWS_VK_in_trigger_follows_clause2196); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:198:23: ( trigger_name )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==TRIGGER_NAME) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// PLSQLPrinter_DDL.g:198:23: trigger_name
					{
					pushFollow(FOLLOW_trigger_name_in_trigger_follows_clause2198);
					gPLSQLPrinter.trigger_name();
					state._fsp--;

					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 199:5: -> template( \"not implemented: trigger_follows_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: trigger_follows_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_follows_clause"


	public static class trigger_when_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "trigger_when_clause"
	// PLSQLPrinter_DDL.g:202:1: trigger_when_clause : ^( SQL92_RESERVED_WHEN expression ) -> template( \"not implemented: trigger_when_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.trigger_when_clause_return trigger_when_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.trigger_when_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.trigger_when_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:203:5: ( ^( SQL92_RESERVED_WHEN expression ) -> template( \"not implemented: trigger_when_clause\")
			// PLSQLPrinter_DDL.g:203:10: ^( SQL92_RESERVED_WHEN expression )
			{
			match(input,SQL92_RESERVED_WHEN,FOLLOW_SQL92_RESERVED_WHEN_in_trigger_when_clause2235); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_trigger_when_clause2237);
			gPLSQLPrinter.expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 204:5: -> template( \"not implemented: trigger_when_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: trigger_when_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_when_clause"


	public static class simple_dml_trigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "simple_dml_trigger"
	// PLSQLPrinter_DDL.g:208:1: simple_dml_trigger : ^( SIMPLE_DML ( BEFORE_VK | AFTER_VK | INSTEAD_VK ) ( FOR_EACH_ROW )? ( referencing_clause )? dml_event_clause ) -> template( \"not implemented: simple_dml_trigger\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.simple_dml_trigger_return simple_dml_trigger() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.simple_dml_trigger_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.simple_dml_trigger_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:209:5: ( ^( SIMPLE_DML ( BEFORE_VK | AFTER_VK | INSTEAD_VK ) ( FOR_EACH_ROW )? ( referencing_clause )? dml_event_clause ) -> template( \"not implemented: simple_dml_trigger\")
			// PLSQLPrinter_DDL.g:209:10: ^( SIMPLE_DML ( BEFORE_VK | AFTER_VK | INSTEAD_VK ) ( FOR_EACH_ROW )? ( referencing_clause )? dml_event_clause )
			{
			match(input,SIMPLE_DML,FOLLOW_SIMPLE_DML_in_simple_dml_trigger2274); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:209:23: ( BEFORE_VK | AFTER_VK | INSTEAD_VK )
			int alt66=3;
			switch ( input.LA(1) ) {
			case BEFORE_VK:
				{
				alt66=1;
				}
				break;
			case AFTER_VK:
				{
				alt66=2;
				}
				break;
			case INSTEAD_VK:
				{
				alt66=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// PLSQLPrinter_DDL.g:209:24: BEFORE_VK
					{
					match(input,BEFORE_VK,FOLLOW_BEFORE_VK_in_simple_dml_trigger2277); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:209:34: AFTER_VK
					{
					match(input,AFTER_VK,FOLLOW_AFTER_VK_in_simple_dml_trigger2279); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:209:43: INSTEAD_VK
					{
					match(input,INSTEAD_VK,FOLLOW_INSTEAD_VK_in_simple_dml_trigger2281); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:209:55: ( FOR_EACH_ROW )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==FOR_EACH_ROW) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// PLSQLPrinter_DDL.g:209:55: FOR_EACH_ROW
					{
					match(input,FOR_EACH_ROW,FOLLOW_FOR_EACH_ROW_in_simple_dml_trigger2284); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:209:69: ( referencing_clause )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==REFERENCING_VK) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// PLSQLPrinter_DDL.g:209:69: referencing_clause
					{
					pushFollow(FOLLOW_referencing_clause_in_simple_dml_trigger2287);
					referencing_clause();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_dml_event_clause_in_simple_dml_trigger2290);
			dml_event_clause();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 210:5: -> template( \"not implemented: simple_dml_trigger\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: simple_dml_trigger");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_dml_trigger"


	public static class compound_dml_trigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compound_dml_trigger"
	// PLSQLPrinter_DDL.g:213:1: compound_dml_trigger : ^( COMPOUND_DML ( referencing_clause )? dml_event_clause ) -> template( \"not implemented: compound_dml_trigger\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.compound_dml_trigger_return compound_dml_trigger() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.compound_dml_trigger_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.compound_dml_trigger_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:214:5: ( ^( COMPOUND_DML ( referencing_clause )? dml_event_clause ) -> template( \"not implemented: compound_dml_trigger\")
			// PLSQLPrinter_DDL.g:214:10: ^( COMPOUND_DML ( referencing_clause )? dml_event_clause )
			{
			match(input,COMPOUND_DML,FOLLOW_COMPOUND_DML_in_compound_dml_trigger2326); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:214:25: ( referencing_clause )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==REFERENCING_VK) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// PLSQLPrinter_DDL.g:214:25: referencing_clause
					{
					pushFollow(FOLLOW_referencing_clause_in_compound_dml_trigger2328);
					referencing_clause();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_dml_event_clause_in_compound_dml_trigger2331);
			dml_event_clause();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 215:5: -> template( \"not implemented: compound_dml_trigger\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: compound_dml_trigger");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_dml_trigger"


	public static class non_dml_trigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "non_dml_trigger"
	// PLSQLPrinter_DDL.g:218:1: non_dml_trigger : ^( NON_DML ( BEFORE_VK | AFTER_VK ) ( non_dml_event )+ ( DATABASE_VK | ( schema_name )? SCHEMA_VK ) ) -> template( \"not implemented: non_dml_trigger\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.non_dml_trigger_return non_dml_trigger() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.non_dml_trigger_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.non_dml_trigger_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:219:5: ( ^( NON_DML ( BEFORE_VK | AFTER_VK ) ( non_dml_event )+ ( DATABASE_VK | ( schema_name )? SCHEMA_VK ) ) -> template( \"not implemented: non_dml_trigger\")
			// PLSQLPrinter_DDL.g:219:10: ^( NON_DML ( BEFORE_VK | AFTER_VK ) ( non_dml_event )+ ( DATABASE_VK | ( schema_name )? SCHEMA_VK ) )
			{
			match(input,NON_DML,FOLLOW_NON_DML_in_non_dml_trigger2367); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:219:20: ( BEFORE_VK | AFTER_VK )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==BEFORE_VK) ) {
				alt70=1;
			}
			else if ( (LA70_0==AFTER_VK) ) {
				alt70=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// PLSQLPrinter_DDL.g:219:21: BEFORE_VK
					{
					match(input,BEFORE_VK,FOLLOW_BEFORE_VK_in_non_dml_trigger2370); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:219:31: AFTER_VK
					{
					match(input,AFTER_VK,FOLLOW_AFTER_VK_in_non_dml_trigger2372); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:219:41: ( non_dml_event )+
			int cnt71=0;
			loop71:
			while (true) {
				int alt71=2;
				switch ( input.LA(1) ) {
				case DATABASE_VK:
					{
					int LA71_1 = input.LA(2);
					if ( (LA71_1==SQL92_RESERVED_ALTER||LA71_1==SQL92_RESERVED_CREATE||LA71_1==SQL92_RESERVED_DROP||LA71_1==SQL92_RESERVED_GRANT||LA71_1==SQL92_RESERVED_REVOKE||LA71_1==ANALYZE_VK||LA71_1==ASSOCIATE_VK||LA71_1==AUDIT_VK||LA71_1==COMMENT_VK||LA71_1==DATABASE_VK||(LA71_1 >= DB_ROLE_CHANGE_VK && LA71_1 <= DDL_VK)||LA71_1==DISASSOCIATE_VK||LA71_1==FOLLOWS_VK||(LA71_1 >= LOGOFF_VK && LA71_1 <= LOGON_VK)||LA71_1==NOAUDIT_VK||LA71_1==RENAME_VK||(LA71_1 >= SCHEMA_NAME && LA71_1 <= SCHEMA_VK)||LA71_1==SERVERERROR_VK||LA71_1==SHUTDOWN_VK||LA71_1==STARTUP_VK||LA71_1==SUSPEND_VK||LA71_1==TRUNCATE_VK) ) {
						alt71=1;
					}

					}
					break;
				case SCHEMA_VK:
					{
					int LA71_3 = input.LA(2);
					if ( (LA71_3==SQL92_RESERVED_ALTER||LA71_3==SQL92_RESERVED_CREATE||LA71_3==SQL92_RESERVED_DROP||LA71_3==SQL92_RESERVED_GRANT||LA71_3==SQL92_RESERVED_REVOKE||LA71_3==ANALYZE_VK||LA71_3==ASSOCIATE_VK||LA71_3==AUDIT_VK||LA71_3==COMMENT_VK||LA71_3==DATABASE_VK||(LA71_3 >= DB_ROLE_CHANGE_VK && LA71_3 <= DDL_VK)||LA71_3==DISASSOCIATE_VK||LA71_3==FOLLOWS_VK||(LA71_3 >= LOGOFF_VK && LA71_3 <= LOGON_VK)||LA71_3==NOAUDIT_VK||LA71_3==RENAME_VK||(LA71_3 >= SCHEMA_NAME && LA71_3 <= SCHEMA_VK)||LA71_3==SERVERERROR_VK||LA71_3==SHUTDOWN_VK||LA71_3==STARTUP_VK||LA71_3==SUSPEND_VK||LA71_3==TRUNCATE_VK) ) {
						alt71=1;
					}

					}
					break;
				case SQL92_RESERVED_ALTER:
				case SQL92_RESERVED_CREATE:
				case SQL92_RESERVED_DROP:
				case SQL92_RESERVED_GRANT:
				case SQL92_RESERVED_REVOKE:
				case ANALYZE_VK:
				case ASSOCIATE_VK:
				case AUDIT_VK:
				case COMMENT_VK:
				case DB_ROLE_CHANGE_VK:
				case DDL_VK:
				case DISASSOCIATE_VK:
				case FOLLOWS_VK:
				case LOGOFF_VK:
				case LOGON_VK:
				case NOAUDIT_VK:
				case RENAME_VK:
				case SERVERERROR_VK:
				case SHUTDOWN_VK:
				case STARTUP_VK:
				case SUSPEND_VK:
				case TRUNCATE_VK:
					{
					alt71=1;
					}
					break;
				}
				switch (alt71) {
				case 1 :
					// PLSQLPrinter_DDL.g:219:41: non_dml_event
					{
					pushFollow(FOLLOW_non_dml_event_in_non_dml_trigger2375);
					non_dml_event();
					state._fsp--;

					}
					break;

				default :
					if ( cnt71 >= 1 ) break loop71;
					EarlyExitException eee = new EarlyExitException(71, input);
					throw eee;
				}
				cnt71++;
			}

			// PLSQLPrinter_DDL.g:219:56: ( DATABASE_VK | ( schema_name )? SCHEMA_VK )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==DATABASE_VK) ) {
				alt73=1;
			}
			else if ( ((LA73_0 >= SCHEMA_NAME && LA73_0 <= SCHEMA_VK)) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// PLSQLPrinter_DDL.g:219:57: DATABASE_VK
					{
					match(input,DATABASE_VK,FOLLOW_DATABASE_VK_in_non_dml_trigger2379); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:219:69: ( schema_name )? SCHEMA_VK
					{
					// PLSQLPrinter_DDL.g:219:69: ( schema_name )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==SCHEMA_NAME) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// PLSQLPrinter_DDL.g:219:69: schema_name
							{
							pushFollow(FOLLOW_schema_name_in_non_dml_trigger2381);
							gPLSQLPrinter.schema_name();
							state._fsp--;

							}
							break;

					}

					match(input,SCHEMA_VK,FOLLOW_SCHEMA_VK_in_non_dml_trigger2384); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 220:5: -> template( \"not implemented: non_dml_trigger\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: non_dml_trigger");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "non_dml_trigger"


	public static class trigger_body_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "trigger_body"
	// PLSQLPrinter_DDL.g:223:1: trigger_body : ( ^( COMPOUND_VK trigger_name ( declare_spec )* ( timing_point_section )+ ) -> template( \"not implemented: trigger_body\"| ^( CALL_VK routine_name ( function_argument )? ) -> template( \"not implemented: trigger_body\"| ^( BODY_MODE block ) -> template( \"not implemented: trigger_body\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.trigger_body_return trigger_body() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.trigger_body_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.trigger_body_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:224:5: ( ^( COMPOUND_VK trigger_name ( declare_spec )* ( timing_point_section )+ ) -> template( \"not implemented: trigger_body\"| ^( CALL_VK routine_name ( function_argument )? ) -> template( \"not implemented: trigger_body\"| ^( BODY_MODE block ) -> template( \"not implemented: trigger_body\")
			int alt77=3;
			switch ( input.LA(1) ) {
			case COMPOUND_VK:
				{
				alt77=1;
				}
				break;
			case CALL_VK:
				{
				alt77=2;
				}
				break;
			case BODY_MODE:
				{
				alt77=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// PLSQLPrinter_DDL.g:224:10: ^( COMPOUND_VK trigger_name ( declare_spec )* ( timing_point_section )+ )
					{
					match(input,COMPOUND_VK,FOLLOW_COMPOUND_VK_in_trigger_body2421); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_trigger_name_in_trigger_body2423);
					gPLSQLPrinter.trigger_name();
					state._fsp--;

					// PLSQLPrinter_DDL.g:224:37: ( declare_spec )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==CREATE_FUNCTION||LA74_0==CREATE_PROCEDURE||(LA74_0 >= CREATE_TYPE_BODY && LA74_0 <= CREATE_TYPE_SPEC)||LA74_0==CURSOR_DECLARE||LA74_0==EXCEPTION_DECLARE||LA74_0==PRAGMA_DECLARE||(LA74_0 >= RECORD_TYPE_DECLARE_FIELDS && LA74_0 <= RECORD_VAR_DECLARE)||LA74_0==SUBTYPE_DECLARE||(LA74_0 >= TABLE_TYPE_DECLARE && LA74_0 <= TABLE_VAR_DECLARE)||LA74_0==VARIABLE_DECLARE) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// PLSQLPrinter_DDL.g:224:37: declare_spec
							{
							pushFollow(FOLLOW_declare_spec_in_trigger_body2425);
							gPLSQLPrinter.declare_spec();
							state._fsp--;

							}
							break;

						default :
							break loop74;
						}
					}

					// PLSQLPrinter_DDL.g:224:51: ( timing_point_section )+
					int cnt75=0;
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( ((LA75_0 >= AFTER_EACH_ROW && LA75_0 <= AFTER_STATEMENT)||(LA75_0 >= BEFORE_EACH_ROW && LA75_0 <= BEFORE_STATEMENT)) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// PLSQLPrinter_DDL.g:224:51: timing_point_section
							{
							pushFollow(FOLLOW_timing_point_section_in_trigger_body2428);
							timing_point_section();
							state._fsp--;

							}
							break;

						default :
							if ( cnt75 >= 1 ) break loop75;
							EarlyExitException eee = new EarlyExitException(75, input);
							throw eee;
						}
						cnt75++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 225:5: -> template( \"not implemented: trigger_body\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: trigger_body");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:226:10: ^( CALL_VK routine_name ( function_argument )? )
					{
					match(input,CALL_VK,FOLLOW_CALL_VK_in_trigger_body2456); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_routine_name_in_trigger_body2458);
					gPLSQLPrinter.routine_name();
					state._fsp--;

					// PLSQLPrinter_DDL.g:226:33: ( function_argument )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==ARGUMENTS) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// PLSQLPrinter_DDL.g:226:33: function_argument
							{
							pushFollow(FOLLOW_function_argument_in_trigger_body2460);
							gPLSQLPrinter.function_argument();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 227:5: -> template( \"not implemented: trigger_body\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: trigger_body");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:228:10: ^( BODY_MODE block )
					{
					match(input,BODY_MODE,FOLLOW_BODY_MODE_in_trigger_body2489); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_trigger_body2491);
					gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 229:5: -> template( \"not implemented: trigger_body\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: trigger_body");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_body"


	public static class timing_point_section_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "timing_point_section"
	// PLSQLPrinter_DDL.g:232:1: timing_point_section : ( ^( BEFORE_STATEMENT block ) -> template( \"not implemented: timing_point_section\"| ^( BEFORE_EACH_ROW block ) -> template( \"not implemented: timing_point_section\"| ^( AFTER_STATEMENT block ) -> template( \"not implemented: timing_point_section\"| ^( AFTER_EACH_ROW block ) -> template( \"not implemented: timing_point_section\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.timing_point_section_return timing_point_section() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.timing_point_section_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.timing_point_section_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:233:5: ( ^( BEFORE_STATEMENT block ) -> template( \"not implemented: timing_point_section\"| ^( BEFORE_EACH_ROW block ) -> template( \"not implemented: timing_point_section\"| ^( AFTER_STATEMENT block ) -> template( \"not implemented: timing_point_section\"| ^( AFTER_EACH_ROW block ) -> template( \"not implemented: timing_point_section\")
			int alt78=4;
			switch ( input.LA(1) ) {
			case BEFORE_STATEMENT:
				{
				alt78=1;
				}
				break;
			case BEFORE_EACH_ROW:
				{
				alt78=2;
				}
				break;
			case AFTER_STATEMENT:
				{
				alt78=3;
				}
				break;
			case AFTER_EACH_ROW:
				{
				alt78=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// PLSQLPrinter_DDL.g:233:10: ^( BEFORE_STATEMENT block )
					{
					match(input,BEFORE_STATEMENT,FOLLOW_BEFORE_STATEMENT_in_timing_point_section2527); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_timing_point_section2529);
					gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 234:5: -> template( \"not implemented: timing_point_section\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: timing_point_section");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:235:10: ^( BEFORE_EACH_ROW block )
					{
					match(input,BEFORE_EACH_ROW,FOLLOW_BEFORE_EACH_ROW_in_timing_point_section2556); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_timing_point_section2558);
					gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 236:5: -> template( \"not implemented: timing_point_section\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: timing_point_section");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:237:10: ^( AFTER_STATEMENT block )
					{
					match(input,AFTER_STATEMENT,FOLLOW_AFTER_STATEMENT_in_timing_point_section2585); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_timing_point_section2587);
					gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 238:5: -> template( \"not implemented: timing_point_section\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: timing_point_section");
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:239:10: ^( AFTER_EACH_ROW block )
					{
					match(input,AFTER_EACH_ROW,FOLLOW_AFTER_EACH_ROW_in_timing_point_section2614); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_timing_point_section2616);
					gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 240:5: -> template( \"not implemented: timing_point_section\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: timing_point_section");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timing_point_section"


	public static class non_dml_event_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "non_dml_event"
	// PLSQLPrinter_DDL.g:243:1: non_dml_event : ( SQL92_RESERVED_ALTER -> template( \"not implemented: non_dml_event\"| ANALYZE_VK -> template( \"not implemented: non_dml_event\"| ASSOCIATE_VK STATISTICS_VK -> template( \"not implemented: non_dml_event\"| AUDIT_VK -> template( \"not implemented: non_dml_event\"| COMMENT_VK -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_CREATE -> template( \"not implemented: non_dml_event\"| DISASSOCIATE_VK STATISTICS_VK -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_DROP -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_GRANT -> template( \"not implemented: non_dml_event\"| NOAUDIT_VK -> template( \"not implemented: non_dml_event\"| RENAME_VK -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_REVOKE -> template( \"not implemented: non_dml_event\"| TRUNCATE_VK -> template( \"not implemented: non_dml_event\"| DDL_VK -> template( \"not implemented: non_dml_event\"| STARTUP_VK -> template( \"not implemented: non_dml_event\"| SHUTDOWN_VK -> template( \"not implemented: non_dml_event\"| DB_ROLE_CHANGE_VK -> template( \"not implemented: non_dml_event\"| LOGON_VK -> template( \"not implemented: non_dml_event\"| LOGOFF_VK -> template( \"not implemented: non_dml_event\"| SERVERERROR_VK -> template( \"not implemented: non_dml_event\"| SUSPEND_VK -> template( \"not implemented: non_dml_event\"| DATABASE_VK -> template( \"not implemented: non_dml_event\"| SCHEMA_VK -> template( \"not implemented: non_dml_event\"| FOLLOWS_VK -> template( \"not implemented: non_dml_event\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.non_dml_event_return non_dml_event() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.non_dml_event_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.non_dml_event_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:244:5: ( SQL92_RESERVED_ALTER -> template( \"not implemented: non_dml_event\"| ANALYZE_VK -> template( \"not implemented: non_dml_event\"| ASSOCIATE_VK STATISTICS_VK -> template( \"not implemented: non_dml_event\"| AUDIT_VK -> template( \"not implemented: non_dml_event\"| COMMENT_VK -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_CREATE -> template( \"not implemented: non_dml_event\"| DISASSOCIATE_VK STATISTICS_VK -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_DROP -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_GRANT -> template( \"not implemented: non_dml_event\"| NOAUDIT_VK -> template( \"not implemented: non_dml_event\"| RENAME_VK -> template( \"not implemented: non_dml_event\"| SQL92_RESERVED_REVOKE -> template( \"not implemented: non_dml_event\"| TRUNCATE_VK -> template( \"not implemented: non_dml_event\"| DDL_VK -> template( \"not implemented: non_dml_event\"| STARTUP_VK -> template( \"not implemented: non_dml_event\"| SHUTDOWN_VK -> template( \"not implemented: non_dml_event\"| DB_ROLE_CHANGE_VK -> template( \"not implemented: non_dml_event\"| LOGON_VK -> template( \"not implemented: non_dml_event\"| LOGOFF_VK -> template( \"not implemented: non_dml_event\"| SERVERERROR_VK -> template( \"not implemented: non_dml_event\"| SUSPEND_VK -> template( \"not implemented: non_dml_event\"| DATABASE_VK -> template( \"not implemented: non_dml_event\"| SCHEMA_VK -> template( \"not implemented: non_dml_event\"| FOLLOWS_VK -> template( \"not implemented: non_dml_event\")
			int alt79=24;
			switch ( input.LA(1) ) {
			case SQL92_RESERVED_ALTER:
				{
				alt79=1;
				}
				break;
			case ANALYZE_VK:
				{
				alt79=2;
				}
				break;
			case ASSOCIATE_VK:
				{
				alt79=3;
				}
				break;
			case AUDIT_VK:
				{
				alt79=4;
				}
				break;
			case COMMENT_VK:
				{
				alt79=5;
				}
				break;
			case SQL92_RESERVED_CREATE:
				{
				alt79=6;
				}
				break;
			case DISASSOCIATE_VK:
				{
				alt79=7;
				}
				break;
			case SQL92_RESERVED_DROP:
				{
				alt79=8;
				}
				break;
			case SQL92_RESERVED_GRANT:
				{
				alt79=9;
				}
				break;
			case NOAUDIT_VK:
				{
				alt79=10;
				}
				break;
			case RENAME_VK:
				{
				alt79=11;
				}
				break;
			case SQL92_RESERVED_REVOKE:
				{
				alt79=12;
				}
				break;
			case TRUNCATE_VK:
				{
				alt79=13;
				}
				break;
			case DDL_VK:
				{
				alt79=14;
				}
				break;
			case STARTUP_VK:
				{
				alt79=15;
				}
				break;
			case SHUTDOWN_VK:
				{
				alt79=16;
				}
				break;
			case DB_ROLE_CHANGE_VK:
				{
				alt79=17;
				}
				break;
			case LOGON_VK:
				{
				alt79=18;
				}
				break;
			case LOGOFF_VK:
				{
				alt79=19;
				}
				break;
			case SERVERERROR_VK:
				{
				alt79=20;
				}
				break;
			case SUSPEND_VK:
				{
				alt79=21;
				}
				break;
			case DATABASE_VK:
				{
				alt79=22;
				}
				break;
			case SCHEMA_VK:
				{
				alt79=23;
				}
				break;
			case FOLLOWS_VK:
				{
				alt79=24;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// PLSQLPrinter_DDL.g:244:10: SQL92_RESERVED_ALTER
					{
					match(input,SQL92_RESERVED_ALTER,FOLLOW_SQL92_RESERVED_ALTER_in_non_dml_event2651); 
					// TEMPLATE REWRITE
					// 245:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:246:10: ANALYZE_VK
					{
					match(input,ANALYZE_VK,FOLLOW_ANALYZE_VK_in_non_dml_event2676); 
					// TEMPLATE REWRITE
					// 247:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:248:10: ASSOCIATE_VK STATISTICS_VK
					{
					match(input,ASSOCIATE_VK,FOLLOW_ASSOCIATE_VK_in_non_dml_event2701); 
					match(input,STATISTICS_VK,FOLLOW_STATISTICS_VK_in_non_dml_event2703); 
					// TEMPLATE REWRITE
					// 249:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:250:10: AUDIT_VK
					{
					match(input,AUDIT_VK,FOLLOW_AUDIT_VK_in_non_dml_event2728); 
					// TEMPLATE REWRITE
					// 251:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:252:10: COMMENT_VK
					{
					match(input,COMMENT_VK,FOLLOW_COMMENT_VK_in_non_dml_event2753); 
					// TEMPLATE REWRITE
					// 253:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:254:10: SQL92_RESERVED_CREATE
					{
					match(input,SQL92_RESERVED_CREATE,FOLLOW_SQL92_RESERVED_CREATE_in_non_dml_event2778); 
					// TEMPLATE REWRITE
					// 255:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 7 :
					// PLSQLPrinter_DDL.g:256:10: DISASSOCIATE_VK STATISTICS_VK
					{
					match(input,DISASSOCIATE_VK,FOLLOW_DISASSOCIATE_VK_in_non_dml_event2803); 
					match(input,STATISTICS_VK,FOLLOW_STATISTICS_VK_in_non_dml_event2805); 
					// TEMPLATE REWRITE
					// 257:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 8 :
					// PLSQLPrinter_DDL.g:258:10: SQL92_RESERVED_DROP
					{
					match(input,SQL92_RESERVED_DROP,FOLLOW_SQL92_RESERVED_DROP_in_non_dml_event2830); 
					// TEMPLATE REWRITE
					// 259:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 9 :
					// PLSQLPrinter_DDL.g:260:10: SQL92_RESERVED_GRANT
					{
					match(input,SQL92_RESERVED_GRANT,FOLLOW_SQL92_RESERVED_GRANT_in_non_dml_event2855); 
					// TEMPLATE REWRITE
					// 261:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 10 :
					// PLSQLPrinter_DDL.g:262:10: NOAUDIT_VK
					{
					match(input,NOAUDIT_VK,FOLLOW_NOAUDIT_VK_in_non_dml_event2880); 
					// TEMPLATE REWRITE
					// 263:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 11 :
					// PLSQLPrinter_DDL.g:264:10: RENAME_VK
					{
					match(input,RENAME_VK,FOLLOW_RENAME_VK_in_non_dml_event2905); 
					// TEMPLATE REWRITE
					// 265:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 12 :
					// PLSQLPrinter_DDL.g:266:10: SQL92_RESERVED_REVOKE
					{
					match(input,SQL92_RESERVED_REVOKE,FOLLOW_SQL92_RESERVED_REVOKE_in_non_dml_event2930); 
					// TEMPLATE REWRITE
					// 267:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 13 :
					// PLSQLPrinter_DDL.g:268:10: TRUNCATE_VK
					{
					match(input,TRUNCATE_VK,FOLLOW_TRUNCATE_VK_in_non_dml_event2955); 
					// TEMPLATE REWRITE
					// 269:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 14 :
					// PLSQLPrinter_DDL.g:270:10: DDL_VK
					{
					match(input,DDL_VK,FOLLOW_DDL_VK_in_non_dml_event2980); 
					// TEMPLATE REWRITE
					// 271:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 15 :
					// PLSQLPrinter_DDL.g:272:10: STARTUP_VK
					{
					match(input,STARTUP_VK,FOLLOW_STARTUP_VK_in_non_dml_event3005); 
					// TEMPLATE REWRITE
					// 273:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 16 :
					// PLSQLPrinter_DDL.g:274:10: SHUTDOWN_VK
					{
					match(input,SHUTDOWN_VK,FOLLOW_SHUTDOWN_VK_in_non_dml_event3030); 
					// TEMPLATE REWRITE
					// 275:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 17 :
					// PLSQLPrinter_DDL.g:276:10: DB_ROLE_CHANGE_VK
					{
					match(input,DB_ROLE_CHANGE_VK,FOLLOW_DB_ROLE_CHANGE_VK_in_non_dml_event3055); 
					// TEMPLATE REWRITE
					// 277:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 18 :
					// PLSQLPrinter_DDL.g:278:10: LOGON_VK
					{
					match(input,LOGON_VK,FOLLOW_LOGON_VK_in_non_dml_event3080); 
					// TEMPLATE REWRITE
					// 279:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 19 :
					// PLSQLPrinter_DDL.g:280:10: LOGOFF_VK
					{
					match(input,LOGOFF_VK,FOLLOW_LOGOFF_VK_in_non_dml_event3105); 
					// TEMPLATE REWRITE
					// 281:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 20 :
					// PLSQLPrinter_DDL.g:282:10: SERVERERROR_VK
					{
					match(input,SERVERERROR_VK,FOLLOW_SERVERERROR_VK_in_non_dml_event3130); 
					// TEMPLATE REWRITE
					// 283:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 21 :
					// PLSQLPrinter_DDL.g:284:10: SUSPEND_VK
					{
					match(input,SUSPEND_VK,FOLLOW_SUSPEND_VK_in_non_dml_event3155); 
					// TEMPLATE REWRITE
					// 285:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 22 :
					// PLSQLPrinter_DDL.g:286:10: DATABASE_VK
					{
					match(input,DATABASE_VK,FOLLOW_DATABASE_VK_in_non_dml_event3180); 
					// TEMPLATE REWRITE
					// 287:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 23 :
					// PLSQLPrinter_DDL.g:288:10: SCHEMA_VK
					{
					match(input,SCHEMA_VK,FOLLOW_SCHEMA_VK_in_non_dml_event3205); 
					// TEMPLATE REWRITE
					// 289:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;
				case 24 :
					// PLSQLPrinter_DDL.g:290:10: FOLLOWS_VK
					{
					match(input,FOLLOWS_VK,FOLLOW_FOLLOWS_VK_in_non_dml_event3230); 
					// TEMPLATE REWRITE
					// 291:5: -> template( \"not implemented: non_dml_event\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: non_dml_event");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "non_dml_event"


	public static class dml_event_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dml_event_clause"
	// PLSQLPrinter_DDL.g:294:1: dml_event_clause : ^( DML_EVENT ( dml_event_element )+ ^( SQL92_RESERVED_ON tableview_name ( dml_event_nested_clause )? ) ) -> template( \"not implemented: dml_event_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.dml_event_clause_return dml_event_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.dml_event_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.dml_event_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:295:5: ( ^( DML_EVENT ( dml_event_element )+ ^( SQL92_RESERVED_ON tableview_name ( dml_event_nested_clause )? ) ) -> template( \"not implemented: dml_event_clause\")
			// PLSQLPrinter_DDL.g:295:10: ^( DML_EVENT ( dml_event_element )+ ^( SQL92_RESERVED_ON tableview_name ( dml_event_nested_clause )? ) )
			{
			match(input,DML_EVENT,FOLLOW_DML_EVENT_in_dml_event_clause3265); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:295:22: ( dml_event_element )+
			int cnt80=0;
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==DML_EVENT_ELEMENT) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// PLSQLPrinter_DDL.g:295:22: dml_event_element
					{
					pushFollow(FOLLOW_dml_event_element_in_dml_event_clause3267);
					dml_event_element();
					state._fsp--;

					}
					break;

				default :
					if ( cnt80 >= 1 ) break loop80;
					EarlyExitException eee = new EarlyExitException(80, input);
					throw eee;
				}
				cnt80++;
			}

			match(input,SQL92_RESERVED_ON,FOLLOW_SQL92_RESERVED_ON_in_dml_event_clause3271); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_tableview_name_in_dml_event_clause3273);
			gPLSQLPrinter.tableview_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:295:76: ( dml_event_nested_clause )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==NESTED_VK) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// PLSQLPrinter_DDL.g:295:76: dml_event_nested_clause
					{
					pushFollow(FOLLOW_dml_event_nested_clause_in_dml_event_clause3275);
					dml_event_nested_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 296:5: -> template( \"not implemented: dml_event_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: dml_event_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dml_event_clause"


	public static class dml_event_element_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dml_event_element"
	// PLSQLPrinter_DDL.g:299:1: dml_event_element : ^( DML_EVENT_ELEMENT ( SQL92_RESERVED_DELETE | SQL92_RESERVED_INSERT | SQL92_RESERVED_UPDATE ) ^( COLUMNS ( column_name )* ) ) -> template( \"not implemented: dml_event_element\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.dml_event_element_return dml_event_element() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.dml_event_element_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.dml_event_element_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:300:5: ( ^( DML_EVENT_ELEMENT ( SQL92_RESERVED_DELETE | SQL92_RESERVED_INSERT | SQL92_RESERVED_UPDATE ) ^( COLUMNS ( column_name )* ) ) -> template( \"not implemented: dml_event_element\")
			// PLSQLPrinter_DDL.g:300:10: ^( DML_EVENT_ELEMENT ( SQL92_RESERVED_DELETE | SQL92_RESERVED_INSERT | SQL92_RESERVED_UPDATE ) ^( COLUMNS ( column_name )* ) )
			{
			match(input,DML_EVENT_ELEMENT,FOLLOW_DML_EVENT_ELEMENT_in_dml_event_element3315); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:300:30: ( SQL92_RESERVED_DELETE | SQL92_RESERVED_INSERT | SQL92_RESERVED_UPDATE )
			int alt82=3;
			switch ( input.LA(1) ) {
			case SQL92_RESERVED_DELETE:
				{
				alt82=1;
				}
				break;
			case SQL92_RESERVED_INSERT:
				{
				alt82=2;
				}
				break;
			case SQL92_RESERVED_UPDATE:
				{
				alt82=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// PLSQLPrinter_DDL.g:300:31: SQL92_RESERVED_DELETE
					{
					match(input,SQL92_RESERVED_DELETE,FOLLOW_SQL92_RESERVED_DELETE_in_dml_event_element3318); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:300:53: SQL92_RESERVED_INSERT
					{
					match(input,SQL92_RESERVED_INSERT,FOLLOW_SQL92_RESERVED_INSERT_in_dml_event_element3320); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:300:75: SQL92_RESERVED_UPDATE
					{
					match(input,SQL92_RESERVED_UPDATE,FOLLOW_SQL92_RESERVED_UPDATE_in_dml_event_element3322); 
					}
					break;

			}

			match(input,COLUMNS,FOLLOW_COLUMNS_in_dml_event_element3326); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:300:108: ( column_name )*
				loop83:
				while (true) {
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==COLUMN_NAME) ) {
						alt83=1;
					}

					switch (alt83) {
					case 1 :
						// PLSQLPrinter_DDL.g:300:108: column_name
						{
						pushFollow(FOLLOW_column_name_in_dml_event_element3328);
						gPLSQLPrinter.column_name();
						state._fsp--;

						}
						break;

					default :
						break loop83;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 301:5: -> template( \"not implemented: dml_event_element\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: dml_event_element");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dml_event_element"


	public static class dml_event_nested_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dml_event_nested_clause"
	// PLSQLPrinter_DDL.g:304:1: dml_event_nested_clause : ^( NESTED_VK tableview_name ) -> template( \"not implemented: dml_event_nested_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.dml_event_nested_clause_return dml_event_nested_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.dml_event_nested_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.dml_event_nested_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:305:5: ( ^( NESTED_VK tableview_name ) -> template( \"not implemented: dml_event_nested_clause\")
			// PLSQLPrinter_DDL.g:305:10: ^( NESTED_VK tableview_name )
			{
			match(input,NESTED_VK,FOLLOW_NESTED_VK_in_dml_event_nested_clause3366); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_tableview_name_in_dml_event_nested_clause3368);
			gPLSQLPrinter.tableview_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 306:5: -> template( \"not implemented: dml_event_nested_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: dml_event_nested_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dml_event_nested_clause"


	public static class referencing_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "referencing_clause"
	// PLSQLPrinter_DDL.g:309:1: referencing_clause : ^( REFERENCING_VK ( referencing_element )+ ) -> template( \"not implemented: referencing_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.referencing_clause_return referencing_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.referencing_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.referencing_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:310:5: ( ^( REFERENCING_VK ( referencing_element )+ ) -> template( \"not implemented: referencing_clause\")
			// PLSQLPrinter_DDL.g:310:10: ^( REFERENCING_VK ( referencing_element )+ )
			{
			match(input,REFERENCING_VK,FOLLOW_REFERENCING_VK_in_referencing_clause3404); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:310:27: ( referencing_element )+
			int cnt84=0;
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==NEW_VK||LA84_0==OLD_VK||LA84_0==PARENT_VK) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// PLSQLPrinter_DDL.g:310:27: referencing_element
					{
					pushFollow(FOLLOW_referencing_element_in_referencing_clause3406);
					referencing_element();
					state._fsp--;

					}
					break;

				default :
					if ( cnt84 >= 1 ) break loop84;
					EarlyExitException eee = new EarlyExitException(84, input);
					throw eee;
				}
				cnt84++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 311:5: -> template( \"not implemented: referencing_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: referencing_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "referencing_clause"


	public static class referencing_element_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "referencing_element"
	// PLSQLPrinter_DDL.g:314:1: referencing_element : ^( ( NEW_VK | OLD_VK | PARENT_VK ) alias ) -> template( \"not implemented: referencing_element\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.referencing_element_return referencing_element() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.referencing_element_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.referencing_element_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:315:5: ( ^( ( NEW_VK | OLD_VK | PARENT_VK ) alias ) -> template( \"not implemented: referencing_element\")
			// PLSQLPrinter_DDL.g:315:10: ^( ( NEW_VK | OLD_VK | PARENT_VK ) alias )
			{
			// PLSQLPrinter_DDL.g:315:12: ( NEW_VK | OLD_VK | PARENT_VK )
			int alt85=3;
			switch ( input.LA(1) ) {
			case NEW_VK:
				{
				alt85=1;
				}
				break;
			case OLD_VK:
				{
				alt85=2;
				}
				break;
			case PARENT_VK:
				{
				alt85=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// PLSQLPrinter_DDL.g:315:13: NEW_VK
					{
					match(input,NEW_VK,FOLLOW_NEW_VK_in_referencing_element3444); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:315:20: OLD_VK
					{
					match(input,OLD_VK,FOLLOW_OLD_VK_in_referencing_element3446); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:315:27: PARENT_VK
					{
					match(input,PARENT_VK,FOLLOW_PARENT_VK_in_referencing_element3448); 
					}
					break;

			}

			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_alias_in_referencing_element3451);
			gPLSQLPrinter.alias();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 316:5: -> template( \"not implemented: referencing_element\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: referencing_element");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "referencing_element"


	public static class drop_type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop_type"
	// PLSQLPrinter_DDL.g:324:1: drop_type : ^( DROP_TYPE type_name ( BODY_VK )? ( FORCE_VK )? ( VALIDATE_VK )? ) -> template( \"not implemented: drop_type\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.drop_type_return drop_type() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.drop_type_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.drop_type_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:325:5: ( ^( DROP_TYPE type_name ( BODY_VK )? ( FORCE_VK )? ( VALIDATE_VK )? ) -> template( \"not implemented: drop_type\")
			// PLSQLPrinter_DDL.g:325:10: ^( DROP_TYPE type_name ( BODY_VK )? ( FORCE_VK )? ( VALIDATE_VK )? )
			{
			match(input,DROP_TYPE,FOLLOW_DROP_TYPE_in_drop_type3492); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_name_in_drop_type3494);
			gPLSQLPrinter.type_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:325:32: ( BODY_VK )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==BODY_VK) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// PLSQLPrinter_DDL.g:325:32: BODY_VK
					{
					match(input,BODY_VK,FOLLOW_BODY_VK_in_drop_type3496); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:325:41: ( FORCE_VK )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==FORCE_VK) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// PLSQLPrinter_DDL.g:325:41: FORCE_VK
					{
					match(input,FORCE_VK,FOLLOW_FORCE_VK_in_drop_type3499); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:325:51: ( VALIDATE_VK )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==VALIDATE_VK) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// PLSQLPrinter_DDL.g:325:51: VALIDATE_VK
					{
					match(input,VALIDATE_VK,FOLLOW_VALIDATE_VK_in_drop_type3502); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 326:5: -> template( \"not implemented: drop_type\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: drop_type");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop_type"


	public static class alter_type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_type"
	// PLSQLPrinter_DDL.g:329:1: alter_type : ^( ALTER_TYPE type_name ( ^( REPLACE_VK ^( OBJECT_MEMBERS ( element_spec )+ ) ( invoker_rights_clause )? ) | ^( ALTER_ATTRIBUTE ( ADD_VK | MODIFY_VK | SQL92_RESERVED_DROP ) ^( ATTRIBUTES ( attribute_definition )+ ) ) | ^( ALTER_METHOD ( alter_method_element )+ ) | alter_collection_clauses | modifier_clause | ^( COMPILE_VK ( SPECIFICATION_VK | BODY_VK )? ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) ) ( dependent_handling_clause )? ) -> template( \"not implemented: alter_type\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_type_return alter_type() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_type_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_type_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:330:5: ( ^( ALTER_TYPE type_name ( ^( REPLACE_VK ^( OBJECT_MEMBERS ( element_spec )+ ) ( invoker_rights_clause )? ) | ^( ALTER_ATTRIBUTE ( ADD_VK | MODIFY_VK | SQL92_RESERVED_DROP ) ^( ATTRIBUTES ( attribute_definition )+ ) ) | ^( ALTER_METHOD ( alter_method_element )+ ) | alter_collection_clauses | modifier_clause | ^( COMPILE_VK ( SPECIFICATION_VK | BODY_VK )? ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) ) ( dependent_handling_clause )? ) -> template( \"not implemented: alter_type\")
			// PLSQLPrinter_DDL.g:330:10: ^( ALTER_TYPE type_name ( ^( REPLACE_VK ^( OBJECT_MEMBERS ( element_spec )+ ) ( invoker_rights_clause )? ) | ^( ALTER_ATTRIBUTE ( ADD_VK | MODIFY_VK | SQL92_RESERVED_DROP ) ^( ATTRIBUTES ( attribute_definition )+ ) ) | ^( ALTER_METHOD ( alter_method_element )+ ) | alter_collection_clauses | modifier_clause | ^( COMPILE_VK ( SPECIFICATION_VK | BODY_VK )? ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) ) ( dependent_handling_clause )? )
			{
			match(input,ALTER_TYPE,FOLLOW_ALTER_TYPE_in_alter_type3539); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_name_in_alter_type3541);
			gPLSQLPrinter.type_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:331:13: ( ^( REPLACE_VK ^( OBJECT_MEMBERS ( element_spec )+ ) ( invoker_rights_clause )? ) | ^( ALTER_ATTRIBUTE ( ADD_VK | MODIFY_VK | SQL92_RESERVED_DROP ) ^( ATTRIBUTES ( attribute_definition )+ ) ) | ^( ALTER_METHOD ( alter_method_element )+ ) | alter_collection_clauses | modifier_clause | ^( COMPILE_VK ( SPECIFICATION_VK | BODY_VK )? ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* ) )
			int alt98=6;
			switch ( input.LA(1) ) {
			case REPLACE_VK:
				{
				alt98=1;
				}
				break;
			case ALTER_ATTRIBUTE:
				{
				alt98=2;
				}
				break;
			case ALTER_METHOD:
				{
				alt98=3;
				}
				break;
			case ALTER_COLLECTION:
				{
				alt98=4;
				}
				break;
			case MODIFIER:
				{
				alt98=5;
				}
				break;
			case COMPILE_VK:
				{
				alt98=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}
			switch (alt98) {
				case 1 :
					// PLSQLPrinter_DDL.g:331:18: ^( REPLACE_VK ^( OBJECT_MEMBERS ( element_spec )+ ) ( invoker_rights_clause )? )
					{
					match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_alter_type3562); 
					match(input, Token.DOWN, null); 
					match(input,OBJECT_MEMBERS,FOLLOW_OBJECT_MEMBERS_in_alter_type3565); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:331:48: ( element_spec )+
					int cnt89=0;
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==ELEMENT_SPEC) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// PLSQLPrinter_DDL.g:331:48: element_spec
							{
							pushFollow(FOLLOW_element_spec_in_alter_type3567);
							element_spec();
							state._fsp--;

							}
							break;

						default :
							if ( cnt89 >= 1 ) break loop89;
							EarlyExitException eee = new EarlyExitException(89, input);
							throw eee;
						}
						cnt89++;
					}

					match(input, Token.UP, null); 

					// PLSQLPrinter_DDL.g:331:63: ( invoker_rights_clause )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==AUTHID_VK) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// PLSQLPrinter_DDL.g:331:63: invoker_rights_clause
							{
							pushFollow(FOLLOW_invoker_rights_clause_in_alter_type3571);
							invoker_rights_clause();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:332:18: ^( ALTER_ATTRIBUTE ( ADD_VK | MODIFY_VK | SQL92_RESERVED_DROP ) ^( ATTRIBUTES ( attribute_definition )+ ) )
					{
					match(input,ALTER_ATTRIBUTE,FOLLOW_ALTER_ATTRIBUTE_in_alter_type3593); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:332:36: ( ADD_VK | MODIFY_VK | SQL92_RESERVED_DROP )
					int alt91=3;
					switch ( input.LA(1) ) {
					case ADD_VK:
						{
						alt91=1;
						}
						break;
					case MODIFY_VK:
						{
						alt91=2;
						}
						break;
					case SQL92_RESERVED_DROP:
						{
						alt91=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 91, 0, input);
						throw nvae;
					}
					switch (alt91) {
						case 1 :
							// PLSQLPrinter_DDL.g:332:37: ADD_VK
							{
							match(input,ADD_VK,FOLLOW_ADD_VK_in_alter_type3596); 
							}
							break;
						case 2 :
							// PLSQLPrinter_DDL.g:332:44: MODIFY_VK
							{
							match(input,MODIFY_VK,FOLLOW_MODIFY_VK_in_alter_type3598); 
							}
							break;
						case 3 :
							// PLSQLPrinter_DDL.g:332:54: SQL92_RESERVED_DROP
							{
							match(input,SQL92_RESERVED_DROP,FOLLOW_SQL92_RESERVED_DROP_in_alter_type3600); 
							}
							break;

					}

					match(input,ATTRIBUTES,FOLLOW_ATTRIBUTES_in_alter_type3604); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:332:88: ( attribute_definition )+
					int cnt92=0;
					loop92:
					while (true) {
						int alt92=2;
						int LA92_0 = input.LA(1);
						if ( (LA92_0==ATTRIBUTE) ) {
							alt92=1;
						}

						switch (alt92) {
						case 1 :
							// PLSQLPrinter_DDL.g:332:88: attribute_definition
							{
							pushFollow(FOLLOW_attribute_definition_in_alter_type3606);
							attribute_definition();
							state._fsp--;

							}
							break;

						default :
							if ( cnt92 >= 1 ) break loop92;
							EarlyExitException eee = new EarlyExitException(92, input);
							throw eee;
						}
						cnt92++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:333:18: ^( ALTER_METHOD ( alter_method_element )+ )
					{
					match(input,ALTER_METHOD,FOLLOW_ALTER_METHOD_in_alter_type3629); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:333:33: ( alter_method_element )+
					int cnt93=0;
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==ALTER_METHOD_ELEMENT) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// PLSQLPrinter_DDL.g:333:33: alter_method_element
							{
							pushFollow(FOLLOW_alter_method_element_in_alter_type3631);
							alter_method_element();
							state._fsp--;

							}
							break;

						default :
							if ( cnt93 >= 1 ) break loop93;
							EarlyExitException eee = new EarlyExitException(93, input);
							throw eee;
						}
						cnt93++;
					}

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:334:18: alter_collection_clauses
					{
					pushFollow(FOLLOW_alter_collection_clauses_in_alter_type3652);
					alter_collection_clauses();
					state._fsp--;

					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:335:18: modifier_clause
					{
					pushFollow(FOLLOW_modifier_clause_in_alter_type3671);
					modifier_clause();
					state._fsp--;

					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:336:18: ^( COMPILE_VK ( SPECIFICATION_VK | BODY_VK )? ( DEBUG_VK )? ( REUSE_VK )? ( compiler_parameters_clause )* )
					{
					match(input,COMPILE_VK,FOLLOW_COMPILE_VK_in_alter_type3691); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// PLSQLPrinter_DDL.g:336:31: ( SPECIFICATION_VK | BODY_VK )?
						int alt94=3;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==SPECIFICATION_VK) ) {
							alt94=1;
						}
						else if ( (LA94_0==BODY_VK) ) {
							alt94=2;
						}
						switch (alt94) {
							case 1 :
								// PLSQLPrinter_DDL.g:336:32: SPECIFICATION_VK
								{
								match(input,SPECIFICATION_VK,FOLLOW_SPECIFICATION_VK_in_alter_type3694); 
								}
								break;
							case 2 :
								// PLSQLPrinter_DDL.g:336:49: BODY_VK
								{
								match(input,BODY_VK,FOLLOW_BODY_VK_in_alter_type3696); 
								}
								break;

						}

						// PLSQLPrinter_DDL.g:336:59: ( DEBUG_VK )?
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==DEBUG_VK) ) {
							alt95=1;
						}
						switch (alt95) {
							case 1 :
								// PLSQLPrinter_DDL.g:336:59: DEBUG_VK
								{
								match(input,DEBUG_VK,FOLLOW_DEBUG_VK_in_alter_type3700); 
								}
								break;

						}

						// PLSQLPrinter_DDL.g:336:69: ( REUSE_VK )?
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==REUSE_VK) ) {
							alt96=1;
						}
						switch (alt96) {
							case 1 :
								// PLSQLPrinter_DDL.g:336:69: REUSE_VK
								{
								match(input,REUSE_VK,FOLLOW_REUSE_VK_in_alter_type3703); 
								}
								break;

						}

						// PLSQLPrinter_DDL.g:336:79: ( compiler_parameters_clause )*
						loop97:
						while (true) {
							int alt97=2;
							int LA97_0 = input.LA(1);
							if ( (LA97_0==COMPILER_PARAMETER) ) {
								alt97=1;
							}

							switch (alt97) {
							case 1 :
								// PLSQLPrinter_DDL.g:336:79: compiler_parameters_clause
								{
								pushFollow(FOLLOW_compiler_parameters_clause_in_alter_type3706);
								compiler_parameters_clause();
								state._fsp--;

								}
								break;

							default :
								break loop97;
							}
						}

						match(input, Token.UP, null); 
					}

					}
					break;

			}

			// PLSQLPrinter_DDL.g:338:13: ( dependent_handling_clause )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==DEPENDENT_HANDLING) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// PLSQLPrinter_DDL.g:338:13: dependent_handling_clause
					{
					pushFollow(FOLLOW_dependent_handling_clause_in_alter_type3737);
					dependent_handling_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 340:5: -> template( \"not implemented: alter_type\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_type");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_type"


	public static class alter_method_element_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_method_element"
	// PLSQLPrinter_DDL.g:345:1: alter_method_element : ^( ALTER_METHOD_ELEMENT ( ADD_VK | SQL92_RESERVED_DROP ) ( map_order_function_spec )? ( subprogram_spec )? ) -> template( \"not implemented: alter_method_element\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_method_element_return alter_method_element() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_method_element_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_method_element_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:346:5: ( ^( ALTER_METHOD_ELEMENT ( ADD_VK | SQL92_RESERVED_DROP ) ( map_order_function_spec )? ( subprogram_spec )? ) -> template( \"not implemented: alter_method_element\")
			// PLSQLPrinter_DDL.g:346:10: ^( ALTER_METHOD_ELEMENT ( ADD_VK | SQL92_RESERVED_DROP ) ( map_order_function_spec )? ( subprogram_spec )? )
			{
			match(input,ALTER_METHOD_ELEMENT,FOLLOW_ALTER_METHOD_ELEMENT_in_alter_method_element3785); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:346:33: ( ADD_VK | SQL92_RESERVED_DROP )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==ADD_VK) ) {
				alt100=1;
			}
			else if ( (LA100_0==SQL92_RESERVED_DROP) ) {
				alt100=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// PLSQLPrinter_DDL.g:346:34: ADD_VK
					{
					match(input,ADD_VK,FOLLOW_ADD_VK_in_alter_method_element3788); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:346:41: SQL92_RESERVED_DROP
					{
					match(input,SQL92_RESERVED_DROP,FOLLOW_SQL92_RESERVED_DROP_in_alter_method_element3790); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:346:62: ( map_order_function_spec )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==SQL92_RESERVED_ORDER||LA101_0==MAP_VK) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// PLSQLPrinter_DDL.g:346:62: map_order_function_spec
					{
					pushFollow(FOLLOW_map_order_function_spec_in_alter_method_element3793);
					map_order_function_spec();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:346:87: ( subprogram_spec )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==MEMBER_VK||LA102_0==STATIC_VK) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// PLSQLPrinter_DDL.g:346:87: subprogram_spec
					{
					pushFollow(FOLLOW_subprogram_spec_in_alter_method_element3796);
					subprogram_spec();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 347:5: -> template( \"not implemented: alter_method_element\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_method_element");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_method_element"


	public static class attribute_definition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "attribute_definition"
	// PLSQLPrinter_DDL.g:350:1: attribute_definition : ^( ATTRIBUTE attribute_name ( type_spec )? ) -> template( \"not implemented: attribute_definition\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.attribute_definition_return attribute_definition() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.attribute_definition_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.attribute_definition_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:351:5: ( ^( ATTRIBUTE attribute_name ( type_spec )? ) -> template( \"not implemented: attribute_definition\")
			// PLSQLPrinter_DDL.g:351:10: ^( ATTRIBUTE attribute_name ( type_spec )? )
			{
			match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attribute_definition3833); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_attribute_name_in_attribute_definition3835);
			gPLSQLPrinter.attribute_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:351:37: ( type_spec )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==CUSTOM_TYPE||LA103_0==INTERVAL_DATATYPE||LA103_0==NATIVE_DATATYPE) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// PLSQLPrinter_DDL.g:351:37: type_spec
					{
					pushFollow(FOLLOW_type_spec_in_attribute_definition3837);
					gPLSQLPrinter.type_spec();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 352:5: -> template( \"not implemented: attribute_definition\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: attribute_definition");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribute_definition"


	public static class alter_collection_clauses_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_collection_clauses"
	// PLSQLPrinter_DDL.g:355:1: alter_collection_clauses : ^( ALTER_COLLECTION ( ^( TYPE_VK type_spec ) | ^( LIMIT_VK expression ) ) ) -> template( \"not implemented: alter_collection_clauses\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_collection_clauses_return alter_collection_clauses() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_collection_clauses_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_collection_clauses_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:356:5: ( ^( ALTER_COLLECTION ( ^( TYPE_VK type_spec ) | ^( LIMIT_VK expression ) ) ) -> template( \"not implemented: alter_collection_clauses\")
			// PLSQLPrinter_DDL.g:356:10: ^( ALTER_COLLECTION ( ^( TYPE_VK type_spec ) | ^( LIMIT_VK expression ) ) )
			{
			match(input,ALTER_COLLECTION,FOLLOW_ALTER_COLLECTION_in_alter_collection_clauses3874); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:357:13: ( ^( TYPE_VK type_spec ) | ^( LIMIT_VK expression ) )
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==TYPE_VK) ) {
				alt104=1;
			}
			else if ( (LA104_0==LIMIT_VK) ) {
				alt104=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}

			switch (alt104) {
				case 1 :
					// PLSQLPrinter_DDL.g:357:18: ^( TYPE_VK type_spec )
					{
					match(input,TYPE_VK,FOLLOW_TYPE_VK_in_alter_collection_clauses3895); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_type_spec_in_alter_collection_clauses3897);
					gPLSQLPrinter.type_spec();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:358:18: ^( LIMIT_VK expression )
					{
					match(input,LIMIT_VK,FOLLOW_LIMIT_VK_in_alter_collection_clauses3918); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_alter_collection_clauses3920);
					gPLSQLPrinter.expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 361:5: -> template( \"not implemented: alter_collection_clauses\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_collection_clauses");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_collection_clauses"


	public static class dependent_handling_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dependent_handling_clause"
	// PLSQLPrinter_DDL.g:364:1: dependent_handling_clause : ^( DEPENDENT_HANDLING ( INVALIDATE_VK | ^( CASCADE_VK ( CONVERT_VK | ( SQL92_RESERVED_NOT )? INCLUDING_VK )? ) ) ) -> template( \"not implemented: dependent_handling_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.dependent_handling_clause_return dependent_handling_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.dependent_handling_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.dependent_handling_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:365:5: ( ^( DEPENDENT_HANDLING ( INVALIDATE_VK | ^( CASCADE_VK ( CONVERT_VK | ( SQL92_RESERVED_NOT )? INCLUDING_VK )? ) ) ) -> template( \"not implemented: dependent_handling_clause\")
			// PLSQLPrinter_DDL.g:365:10: ^( DEPENDENT_HANDLING ( INVALIDATE_VK | ^( CASCADE_VK ( CONVERT_VK | ( SQL92_RESERVED_NOT )? INCLUDING_VK )? ) ) )
			{
			match(input,DEPENDENT_HANDLING,FOLLOW_DEPENDENT_HANDLING_in_dependent_handling_clause3981); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:366:13: ( INVALIDATE_VK | ^( CASCADE_VK ( CONVERT_VK | ( SQL92_RESERVED_NOT )? INCLUDING_VK )? ) )
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==INVALIDATE_VK) ) {
				alt107=1;
			}
			else if ( (LA107_0==CASCADE_VK) ) {
				alt107=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}

			switch (alt107) {
				case 1 :
					// PLSQLPrinter_DDL.g:366:18: INVALIDATE_VK
					{
					match(input,INVALIDATE_VK,FOLLOW_INVALIDATE_VK_in_dependent_handling_clause4001); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:367:18: ^( CASCADE_VK ( CONVERT_VK | ( SQL92_RESERVED_NOT )? INCLUDING_VK )? )
					{
					match(input,CASCADE_VK,FOLLOW_CASCADE_VK_in_dependent_handling_clause4021); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// PLSQLPrinter_DDL.g:368:21: ( CONVERT_VK | ( SQL92_RESERVED_NOT )? INCLUDING_VK )?
						int alt106=3;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==CONVERT_VK) ) {
							alt106=1;
						}
						else if ( (LA106_0==SQL92_RESERVED_NOT||LA106_0==INCLUDING_VK) ) {
							alt106=2;
						}
						switch (alt106) {
							case 1 :
								// PLSQLPrinter_DDL.g:368:26: CONVERT_VK
								{
								match(input,CONVERT_VK,FOLLOW_CONVERT_VK_in_dependent_handling_clause4049); 
								}
								break;
							case 2 :
								// PLSQLPrinter_DDL.g:369:26: ( SQL92_RESERVED_NOT )? INCLUDING_VK
								{
								// PLSQLPrinter_DDL.g:369:26: ( SQL92_RESERVED_NOT )?
								int alt105=2;
								int LA105_0 = input.LA(1);
								if ( (LA105_0==SQL92_RESERVED_NOT) ) {
									alt105=1;
								}
								switch (alt105) {
									case 1 :
										// PLSQLPrinter_DDL.g:369:26: SQL92_RESERVED_NOT
										{
										match(input,SQL92_RESERVED_NOT,FOLLOW_SQL92_RESERVED_NOT_in_dependent_handling_clause4076); 
										}
										break;

								}

								match(input,INCLUDING_VK,FOLLOW_INCLUDING_VK_in_dependent_handling_clause4079); 
								}
								break;

						}

						match(input, Token.UP, null); 
					}

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 374:5: -> template( \"not implemented: dependent_handling_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: dependent_handling_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dependent_handling_clause"


	public static class dependent_exceptions_part_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dependent_exceptions_part"
	// PLSQLPrinter_DDL.g:377:1: dependent_exceptions_part : ^( EXCEPTIONS_VK ( FORCE_VK )? tableview_name ) -> template( \"not implemented: dependent_exceptions_part\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.dependent_exceptions_part_return dependent_exceptions_part() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.dependent_exceptions_part_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.dependent_exceptions_part_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:378:5: ( ^( EXCEPTIONS_VK ( FORCE_VK )? tableview_name ) -> template( \"not implemented: dependent_exceptions_part\")
			// PLSQLPrinter_DDL.g:378:10: ^( EXCEPTIONS_VK ( FORCE_VK )? tableview_name )
			{
			match(input,EXCEPTIONS_VK,FOLLOW_EXCEPTIONS_VK_in_dependent_exceptions_part4179); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:378:26: ( FORCE_VK )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==FORCE_VK) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// PLSQLPrinter_DDL.g:378:26: FORCE_VK
					{
					match(input,FORCE_VK,FOLLOW_FORCE_VK_in_dependent_exceptions_part4181); 
					}
					break;

			}

			pushFollow(FOLLOW_tableview_name_in_dependent_exceptions_part4184);
			gPLSQLPrinter.tableview_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 379:5: -> template( \"not implemented: dependent_exceptions_part\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: dependent_exceptions_part");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dependent_exceptions_part"


	public static class create_type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_type"
	// PLSQLPrinter_DDL.g:384:1: create_type : ( ^( CREATE_TYPE_BODY ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? type_name type_body_elements_list ) -> type_decl(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nulltype_name=$type_name.stoid=\"\"def=$type_body_elements_list.st)| ^( CREATE_TYPE_SPEC ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? type_name ( CHAR_STRING )? object_type_def ) -> type_decl(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nulltype_name=$type_name.stoid=$CHAR_STRING.textdef=$object_type_def.st));
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_type_return create_type() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_type_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_type_return();
		retval.start = input.LT(1);

		CommonTree SQL92_RESERVED_CREATE45=null;
		CommonTree REPLACE_VK46=null;
		CommonTree SQL92_RESERVED_CREATE49=null;
		CommonTree REPLACE_VK50=null;
		CommonTree CHAR_STRING52=null;
		TreeRuleReturnScope type_name47 =null;
		TreeRuleReturnScope type_body_elements_list48 =null;
		TreeRuleReturnScope type_name51 =null;
		TreeRuleReturnScope object_type_def53 =null;

		try {
			// PLSQLPrinter_DDL.g:385:5: ( ^( CREATE_TYPE_BODY ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? type_name type_body_elements_list ) -> type_decl(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nulltype_name=$type_name.stoid=\"\"def=$type_body_elements_list.st)| ^( CREATE_TYPE_SPEC ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? type_name ( CHAR_STRING )? object_type_def ) -> type_decl(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nulltype_name=$type_name.stoid=$CHAR_STRING.textdef=$object_type_def.st))
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==CREATE_TYPE_BODY) ) {
				alt114=1;
			}
			else if ( (LA114_0==CREATE_TYPE_SPEC) ) {
				alt114=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// PLSQLPrinter_DDL.g:385:10: ^( CREATE_TYPE_BODY ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? type_name type_body_elements_list )
					{
					match(input,CREATE_TYPE_BODY,FOLLOW_CREATE_TYPE_BODY_in_create_type4222); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:385:29: ( SQL92_RESERVED_CREATE )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==SQL92_RESERVED_CREATE) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// PLSQLPrinter_DDL.g:385:29: SQL92_RESERVED_CREATE
							{
							SQL92_RESERVED_CREATE45=(CommonTree)match(input,SQL92_RESERVED_CREATE,FOLLOW_SQL92_RESERVED_CREATE_in_create_type4224); 
							}
							break;

					}

					// PLSQLPrinter_DDL.g:385:52: ( REPLACE_VK )?
					int alt110=2;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==REPLACE_VK) ) {
						alt110=1;
					}
					switch (alt110) {
						case 1 :
							// PLSQLPrinter_DDL.g:385:52: REPLACE_VK
							{
							REPLACE_VK46=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_type4227); 
							}
							break;

					}

					pushFollow(FOLLOW_type_name_in_create_type4230);
					type_name47=gPLSQLPrinter.type_name();
					state._fsp--;

					pushFollow(FOLLOW_type_body_elements_list_in_create_type4232);
					type_body_elements_list48=type_body_elements_list();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 386:5: -> type_decl(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nulltype_name=$type_name.stoid=\"\"def=$type_body_elements_list.st)
					{
						retval.st = templateLib.getInstanceOf("type_decl",new STAttrMap().put("is_create", SQL92_RESERVED_CREATE45 != null).put("is_replace", REPLACE_VK46 != null).put("type_name", (type_name47!=null?((StringTemplate)type_name47.getTemplate()):null)).put("oid", "").put("def", (type_body_elements_list48!=null?((StringTemplate)type_body_elements_list48.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:387:10: ^( CREATE_TYPE_SPEC ( SQL92_RESERVED_CREATE )? ( REPLACE_VK )? type_name ( CHAR_STRING )? object_type_def )
					{
					match(input,CREATE_TYPE_SPEC,FOLLOW_CREATE_TYPE_SPEC_in_create_type4280); 
					match(input, Token.DOWN, null); 
					// PLSQLPrinter_DDL.g:387:29: ( SQL92_RESERVED_CREATE )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==SQL92_RESERVED_CREATE) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// PLSQLPrinter_DDL.g:387:29: SQL92_RESERVED_CREATE
							{
							SQL92_RESERVED_CREATE49=(CommonTree)match(input,SQL92_RESERVED_CREATE,FOLLOW_SQL92_RESERVED_CREATE_in_create_type4282); 
							}
							break;

					}

					// PLSQLPrinter_DDL.g:387:52: ( REPLACE_VK )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==REPLACE_VK) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// PLSQLPrinter_DDL.g:387:52: REPLACE_VK
							{
							REPLACE_VK50=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_type4285); 
							}
							break;

					}

					pushFollow(FOLLOW_type_name_in_create_type4288);
					type_name51=gPLSQLPrinter.type_name();
					state._fsp--;

					// PLSQLPrinter_DDL.g:387:74: ( CHAR_STRING )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==CHAR_STRING) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// PLSQLPrinter_DDL.g:387:74: CHAR_STRING
							{
							CHAR_STRING52=(CommonTree)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_create_type4290); 
							}
							break;

					}

					pushFollow(FOLLOW_object_type_def_in_create_type4293);
					object_type_def53=object_type_def();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 388:5: -> type_decl(is_create=$SQL92_RESERVED_CREATE != nullis_replace=$REPLACE_VK != nulltype_name=$type_name.stoid=$CHAR_STRING.textdef=$object_type_def.st)
					{
						retval.st = templateLib.getInstanceOf("type_decl",new STAttrMap().put("is_create", SQL92_RESERVED_CREATE49 != null).put("is_replace", REPLACE_VK50 != null).put("type_name", (type_name51!=null?((StringTemplate)type_name51.getTemplate()):null)).put("oid", (CHAR_STRING52!=null?CHAR_STRING52.getText():null)).put("def", (object_type_def53!=null?((StringTemplate)object_type_def53.getTemplate()):null)));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_type"


	public static class type_body_elements_list_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type_body_elements_list"
	// PLSQLPrinter_DDL.g:391:1: type_body_elements_list : ^( TYPE_BODY_ELEMENTS ( type_body_elements )+ ) -> template( \"not implemented: type_body_elements_list\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.type_body_elements_list_return type_body_elements_list() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.type_body_elements_list_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.type_body_elements_list_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:392:5: ( ^( TYPE_BODY_ELEMENTS ( type_body_elements )+ ) -> template( \"not implemented: type_body_elements_list\")
			// PLSQLPrinter_DDL.g:392:9: ^( TYPE_BODY_ELEMENTS ( type_body_elements )+ )
			{
			match(input,TYPE_BODY_ELEMENTS,FOLLOW_TYPE_BODY_ELEMENTS_in_type_body_elements_list4353); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:392:30: ( type_body_elements )+
			int cnt115=0;
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==SQL92_RESERVED_ORDER||LA115_0==MAP_VK||LA115_0==MEMBER_VK||LA115_0==STATIC_VK) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// PLSQLPrinter_DDL.g:392:30: type_body_elements
					{
					pushFollow(FOLLOW_type_body_elements_in_type_body_elements_list4355);
					type_body_elements();
					state._fsp--;

					}
					break;

				default :
					if ( cnt115 >= 1 ) break loop115;
					EarlyExitException eee = new EarlyExitException(115, input);
					throw eee;
				}
				cnt115++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 393:5: -> template( \"not implemented: type_body_elements_list\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: type_body_elements_list");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_body_elements_list"


	public static class object_type_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "object_type_def"
	// PLSQLPrinter_DDL.g:396:1: object_type_def : ^( OBJECT_TYPE_DEF ( object_as_part | object_under_part ) ( invoker_rights_clause )? ( sqlj_object_type )? (mod_clauses+= modifier_clause )* ^( OBJECT_MEMBERS (specs+= element_spec )* ) ) -> object_type_def(invoker_rights_clause=$invoker_rights_clause.stobject_as_or_under_part=$object_as_part.st != null ? $object_as_part.st : $object_under_part.stsqlj_object_type=$sqlj_object_type.stobject_member_specs=$specsmodifier_clauses=$mod_clauses);
	public final PLSQLPrinter_PLSQLPrinter_DDL.object_type_def_return object_type_def() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.object_type_def_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.object_type_def_return();
		retval.start = input.LT(1);

		List<Object> list_mod_clauses=null;
		List<Object> list_specs=null;
		TreeRuleReturnScope invoker_rights_clause54 =null;
		TreeRuleReturnScope object_as_part55 =null;
		TreeRuleReturnScope object_under_part56 =null;
		TreeRuleReturnScope sqlj_object_type57 =null;
		RuleReturnScope mod_clauses = null;
		RuleReturnScope specs = null;
		try {
			// PLSQLPrinter_DDL.g:397:5: ( ^( OBJECT_TYPE_DEF ( object_as_part | object_under_part ) ( invoker_rights_clause )? ( sqlj_object_type )? (mod_clauses+= modifier_clause )* ^( OBJECT_MEMBERS (specs+= element_spec )* ) ) -> object_type_def(invoker_rights_clause=$invoker_rights_clause.stobject_as_or_under_part=$object_as_part.st != null ? $object_as_part.st : $object_under_part.stsqlj_object_type=$sqlj_object_type.stobject_member_specs=$specsmodifier_clauses=$mod_clauses))
			// PLSQLPrinter_DDL.g:397:10: ^( OBJECT_TYPE_DEF ( object_as_part | object_under_part ) ( invoker_rights_clause )? ( sqlj_object_type )? (mod_clauses+= modifier_clause )* ^( OBJECT_MEMBERS (specs+= element_spec )* ) )
			{
			match(input,OBJECT_TYPE_DEF,FOLLOW_OBJECT_TYPE_DEF_in_object_type_def4393); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:397:28: ( object_as_part | object_under_part )
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==OBJECT_AS) ) {
				alt116=1;
			}
			else if ( (LA116_0==UNDER_VK) ) {
				alt116=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 116, 0, input);
				throw nvae;
			}

			switch (alt116) {
				case 1 :
					// PLSQLPrinter_DDL.g:397:29: object_as_part
					{
					pushFollow(FOLLOW_object_as_part_in_object_type_def4396);
					object_as_part55=object_as_part();
					state._fsp--;

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:397:44: object_under_part
					{
					pushFollow(FOLLOW_object_under_part_in_object_type_def4398);
					object_under_part56=object_under_part();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:397:63: ( invoker_rights_clause )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==AUTHID_VK) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// PLSQLPrinter_DDL.g:397:63: invoker_rights_clause
					{
					pushFollow(FOLLOW_invoker_rights_clause_in_object_type_def4401);
					invoker_rights_clause54=invoker_rights_clause();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:398:14: ( sqlj_object_type )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==JAVA_VK) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// PLSQLPrinter_DDL.g:398:14: sqlj_object_type
					{
					pushFollow(FOLLOW_sqlj_object_type_in_object_type_def4417);
					sqlj_object_type57=sqlj_object_type();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:398:43: (mod_clauses+= modifier_clause )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==MODIFIER) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// PLSQLPrinter_DDL.g:398:43: mod_clauses+= modifier_clause
					{
					pushFollow(FOLLOW_modifier_clause_in_object_type_def4422);
					mod_clauses=modifier_clause();
					state._fsp--;

					if (list_mod_clauses==null) list_mod_clauses=new ArrayList<Object>();
					list_mod_clauses.add(mod_clauses.getTemplate());
					}
					break;

				default :
					break loop119;
				}
			}

			match(input,OBJECT_MEMBERS,FOLLOW_OBJECT_MEMBERS_in_object_type_def4426); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:398:84: (specs+= element_spec )*
				loop120:
				while (true) {
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==ELEMENT_SPEC) ) {
						alt120=1;
					}

					switch (alt120) {
					case 1 :
						// PLSQLPrinter_DDL.g:398:84: specs+= element_spec
						{
						pushFollow(FOLLOW_element_spec_in_object_type_def4430);
						specs=element_spec();
						state._fsp--;

						if (list_specs==null) list_specs=new ArrayList<Object>();
						list_specs.add(specs.getTemplate());
						}
						break;

					default :
						break loop120;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 399:5: -> object_type_def(invoker_rights_clause=$invoker_rights_clause.stobject_as_or_under_part=$object_as_part.st != null ? $object_as_part.st : $object_under_part.stsqlj_object_type=$sqlj_object_type.stobject_member_specs=$specsmodifier_clauses=$mod_clauses)
			{
				retval.st = templateLib.getInstanceOf("object_type_def",new STAttrMap().put("invoker_rights_clause", (invoker_rights_clause54!=null?((StringTemplate)invoker_rights_clause54.getTemplate()):null)).put("object_as_or_under_part", (object_as_part55!=null?((StringTemplate)object_as_part55.getTemplate()):null) != null ? (object_as_part55!=null?((StringTemplate)object_as_part55.getTemplate()):null) : (object_under_part56!=null?((StringTemplate)object_under_part56.getTemplate()):null)).put("sqlj_object_type", (sqlj_object_type57!=null?((StringTemplate)sqlj_object_type57.getTemplate()):null)).put("object_member_specs", list_specs).put("modifier_clauses", list_mod_clauses));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object_type_def"


	public static class object_as_part_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "object_as_part"
	// PLSQLPrinter_DDL.g:406:1: object_as_part : ^( OBJECT_AS ( OBJECT_VK -> object_as_part(def= %object_as_part_def_object() )| varray_type_def -> object_as_part(def= $varray_type_def.st )| nested_table_type_def -> object_as_part(def= $nested_table_type_def.st )) ) ;
	public final PLSQLPrinter_PLSQLPrinter_DDL.object_as_part_return object_as_part() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.object_as_part_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.object_as_part_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope varray_type_def58 =null;
		TreeRuleReturnScope nested_table_type_def59 =null;

		try {
			// PLSQLPrinter_DDL.g:407:5: ( ^( OBJECT_AS ( OBJECT_VK -> object_as_part(def= %object_as_part_def_object() )| varray_type_def -> object_as_part(def= $varray_type_def.st )| nested_table_type_def -> object_as_part(def= $nested_table_type_def.st )) ) )
			// PLSQLPrinter_DDL.g:407:10: ^( OBJECT_AS ( OBJECT_VK -> object_as_part(def= %object_as_part_def_object() )| varray_type_def -> object_as_part(def= $varray_type_def.st )| nested_table_type_def -> object_as_part(def= $nested_table_type_def.st )) )
			{
			match(input,OBJECT_AS,FOLLOW_OBJECT_AS_in_object_as_part4532); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:408:13: ( OBJECT_VK -> object_as_part(def= %object_as_part_def_object() )| varray_type_def -> object_as_part(def= $varray_type_def.st )| nested_table_type_def -> object_as_part(def= $nested_table_type_def.st ))
			int alt121=3;
			switch ( input.LA(1) ) {
			case OBJECT_VK:
				{
				alt121=1;
				}
				break;
			case SQL92_RESERVED_NULL:
			case VARR_ARRAY_DEF:
				{
				alt121=2;
				}
				break;
			case NESTED_TABLE_TYPE_DEF:
				{
				alt121=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}
			switch (alt121) {
				case 1 :
					// PLSQLPrinter_DDL.g:409:15: OBJECT_VK
					{
					match(input,OBJECT_VK,FOLLOW_OBJECT_VK_in_object_as_part4562); 
					// TEMPLATE REWRITE
					// 410:15: -> object_as_part(def= %object_as_part_def_object() )
					{
						retval.st = templateLib.getInstanceOf("object_as_part",new STAttrMap().put("def",  templateLib.getInstanceOf("object_as_part_def_object") ));
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:411:17: varray_type_def
					{
					pushFollow(FOLLOW_varray_type_def_in_object_as_part4603);
					varray_type_def58=gPLSQLPrinter.varray_type_def();
					state._fsp--;

					// TEMPLATE REWRITE
					// 412:15: -> object_as_part(def= $varray_type_def.st )
					{
						retval.st = templateLib.getInstanceOf("object_as_part",new STAttrMap().put("def",  (varray_type_def58!=null?((StringTemplate)varray_type_def58.getTemplate()):null) ));
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:413:17: nested_table_type_def
					{
					pushFollow(FOLLOW_nested_table_type_def_in_object_as_part4644);
					nested_table_type_def59=nested_table_type_def();
					state._fsp--;

					// TEMPLATE REWRITE
					// 414:15: -> object_as_part(def= $nested_table_type_def.st )
					{
						retval.st = templateLib.getInstanceOf("object_as_part",new STAttrMap().put("def",  (nested_table_type_def59!=null?((StringTemplate)nested_table_type_def59.getTemplate()):null) ));
					}



					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object_as_part"


	public static class object_under_part_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "object_under_part"
	// PLSQLPrinter_DDL.g:419:1: object_under_part : ^( UNDER_VK type_spec ) -> object_under_part(type_spec=$type_spec.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.object_under_part_return object_under_part() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.object_under_part_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.object_under_part_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope type_spec60 =null;

		try {
			// PLSQLPrinter_DDL.g:420:5: ( ^( UNDER_VK type_spec ) -> object_under_part(type_spec=$type_spec.st))
			// PLSQLPrinter_DDL.g:420:10: ^( UNDER_VK type_spec )
			{
			match(input,UNDER_VK,FOLLOW_UNDER_VK_in_object_under_part4714); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_spec_in_object_under_part4716);
			type_spec60=gPLSQLPrinter.type_spec();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 421:5: -> object_under_part(type_spec=$type_spec.st)
			{
				retval.st = templateLib.getInstanceOf("object_under_part",new STAttrMap().put("type_spec", (type_spec60!=null?((StringTemplate)type_spec60.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object_under_part"


	public static class nested_table_type_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "nested_table_type_def"
	// PLSQLPrinter_DDL.g:424:1: nested_table_type_def : ^( NESTED_TABLE_TYPE_DEF type_spec ( SQL92_RESERVED_NULL )? ( table_indexed_by_part )? ) -> nested_table_type_def(type_spec=$type_spec.stis_not_null=$SQL92_RESERVED_NULL != nulltable_indexed_by_part=$table_indexed_by_part.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.nested_table_type_def_return nested_table_type_def() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.nested_table_type_def_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.nested_table_type_def_return();
		retval.start = input.LT(1);

		CommonTree SQL92_RESERVED_NULL62=null;
		TreeRuleReturnScope type_spec61 =null;
		TreeRuleReturnScope table_indexed_by_part63 =null;

		try {
			// PLSQLPrinter_DDL.g:425:5: ( ^( NESTED_TABLE_TYPE_DEF type_spec ( SQL92_RESERVED_NULL )? ( table_indexed_by_part )? ) -> nested_table_type_def(type_spec=$type_spec.stis_not_null=$SQL92_RESERVED_NULL != nulltable_indexed_by_part=$table_indexed_by_part.st))
			// PLSQLPrinter_DDL.g:425:10: ^( NESTED_TABLE_TYPE_DEF type_spec ( SQL92_RESERVED_NULL )? ( table_indexed_by_part )? )
			{
			match(input,NESTED_TABLE_TYPE_DEF,FOLLOW_NESTED_TABLE_TYPE_DEF_in_nested_table_type_def4752); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_spec_in_nested_table_type_def4754);
			type_spec61=gPLSQLPrinter.type_spec();
			state._fsp--;

			// PLSQLPrinter_DDL.g:425:44: ( SQL92_RESERVED_NULL )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==SQL92_RESERVED_NULL) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// PLSQLPrinter_DDL.g:425:44: SQL92_RESERVED_NULL
					{
					SQL92_RESERVED_NULL62=(CommonTree)match(input,SQL92_RESERVED_NULL,FOLLOW_SQL92_RESERVED_NULL_in_nested_table_type_def4756); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:425:65: ( table_indexed_by_part )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==INDEXED_BY) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// PLSQLPrinter_DDL.g:425:65: table_indexed_by_part
					{
					pushFollow(FOLLOW_table_indexed_by_part_in_nested_table_type_def4759);
					table_indexed_by_part63=gPLSQLPrinter.table_indexed_by_part();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 426:5: -> nested_table_type_def(type_spec=$type_spec.stis_not_null=$SQL92_RESERVED_NULL != nulltable_indexed_by_part=$table_indexed_by_part.st)
			{
				retval.st = templateLib.getInstanceOf("nested_table_type_def",new STAttrMap().put("type_spec", (type_spec61!=null?((StringTemplate)type_spec61.getTemplate()):null)).put("is_not_null", SQL92_RESERVED_NULL62 != null).put("table_indexed_by_part", (table_indexed_by_part63!=null?((StringTemplate)table_indexed_by_part63.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nested_table_type_def"


	public static class sqlj_object_type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sqlj_object_type"
	// PLSQLPrinter_DDL.g:432:1: sqlj_object_type : ^( JAVA_VK expression ( SQLDATA_VK | CUSTOMDATUM_VK | ORADATA_VK ) ) -> template( \"not implemented: sqlj_object_type\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.sqlj_object_type_return sqlj_object_type() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.sqlj_object_type_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.sqlj_object_type_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:433:5: ( ^( JAVA_VK expression ( SQLDATA_VK | CUSTOMDATUM_VK | ORADATA_VK ) ) -> template( \"not implemented: sqlj_object_type\")
			// PLSQLPrinter_DDL.g:433:10: ^( JAVA_VK expression ( SQLDATA_VK | CUSTOMDATUM_VK | ORADATA_VK ) )
			{
			match(input,JAVA_VK,FOLLOW_JAVA_VK_in_sqlj_object_type4837); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sqlj_object_type4839);
			gPLSQLPrinter.expression();
			state._fsp--;

			// PLSQLPrinter_DDL.g:433:31: ( SQLDATA_VK | CUSTOMDATUM_VK | ORADATA_VK )
			int alt124=3;
			switch ( input.LA(1) ) {
			case SQLDATA_VK:
				{
				alt124=1;
				}
				break;
			case CUSTOMDATUM_VK:
				{
				alt124=2;
				}
				break;
			case ORADATA_VK:
				{
				alt124=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// PLSQLPrinter_DDL.g:433:32: SQLDATA_VK
					{
					match(input,SQLDATA_VK,FOLLOW_SQLDATA_VK_in_sqlj_object_type4842); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:433:43: CUSTOMDATUM_VK
					{
					match(input,CUSTOMDATUM_VK,FOLLOW_CUSTOMDATUM_VK_in_sqlj_object_type4844); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:433:58: ORADATA_VK
					{
					match(input,ORADATA_VK,FOLLOW_ORADATA_VK_in_sqlj_object_type4846); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 434:5: -> template( \"not implemented: sqlj_object_type\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: sqlj_object_type");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sqlj_object_type"


	public static class type_body_elements_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type_body_elements"
	// PLSQLPrinter_DDL.g:437:1: type_body_elements : ( map_order_func_declaration -> template( \"not implemented: type_body_elements\"| subprog_decl_in_type -> template( \"not implemented: type_body_elements\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.type_body_elements_return type_body_elements() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.type_body_elements_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.type_body_elements_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:438:5: ( map_order_func_declaration -> template( \"not implemented: type_body_elements\"| subprog_decl_in_type -> template( \"not implemented: type_body_elements\")
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==SQL92_RESERVED_ORDER||LA125_0==MAP_VK) ) {
				alt125=1;
			}
			else if ( (LA125_0==MEMBER_VK||LA125_0==STATIC_VK) ) {
				alt125=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}

			switch (alt125) {
				case 1 :
					// PLSQLPrinter_DDL.g:438:10: map_order_func_declaration
					{
					pushFollow(FOLLOW_map_order_func_declaration_in_type_body_elements4882);
					map_order_func_declaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 439:5: -> template( \"not implemented: type_body_elements\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: type_body_elements");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:440:10: subprog_decl_in_type
					{
					pushFollow(FOLLOW_subprog_decl_in_type_in_type_body_elements4907);
					subprog_decl_in_type();
					state._fsp--;

					// TEMPLATE REWRITE
					// 441:5: -> template( \"not implemented: type_body_elements\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: type_body_elements");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_body_elements"


	public static class map_order_func_declaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "map_order_func_declaration"
	// PLSQLPrinter_DDL.g:444:1: map_order_func_declaration : ^( ( MAP_VK | SQL92_RESERVED_ORDER ) create_function_body ) -> template( \"not implemented: map_order_func_declaration\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.map_order_func_declaration_return map_order_func_declaration() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.map_order_func_declaration_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.map_order_func_declaration_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:445:5: ( ^( ( MAP_VK | SQL92_RESERVED_ORDER ) create_function_body ) -> template( \"not implemented: map_order_func_declaration\")
			// PLSQLPrinter_DDL.g:445:10: ^( ( MAP_VK | SQL92_RESERVED_ORDER ) create_function_body )
			{
			// PLSQLPrinter_DDL.g:445:12: ( MAP_VK | SQL92_RESERVED_ORDER )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==MAP_VK) ) {
				alt126=1;
			}
			else if ( (LA126_0==SQL92_RESERVED_ORDER) ) {
				alt126=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}

			switch (alt126) {
				case 1 :
					// PLSQLPrinter_DDL.g:445:13: MAP_VK
					{
					match(input,MAP_VK,FOLLOW_MAP_VK_in_map_order_func_declaration4943); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:445:20: SQL92_RESERVED_ORDER
					{
					match(input,SQL92_RESERVED_ORDER,FOLLOW_SQL92_RESERVED_ORDER_in_map_order_func_declaration4945); 
					}
					break;

			}

			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_create_function_body_in_map_order_func_declaration4948);
			create_function_body();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 446:5: -> template( \"not implemented: map_order_func_declaration\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: map_order_func_declaration");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "map_order_func_declaration"


	public static class subprog_decl_in_type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subprog_decl_in_type"
	// PLSQLPrinter_DDL.g:449:1: subprog_decl_in_type : ^( ( MEMBER_VK | STATIC_VK ) ( create_procedure_body | create_function_body | constructor_declaration ) ) -> template( \"not implemented: subprog_decl_in_type\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.subprog_decl_in_type_return subprog_decl_in_type() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.subprog_decl_in_type_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.subprog_decl_in_type_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:450:5: ( ^( ( MEMBER_VK | STATIC_VK ) ( create_procedure_body | create_function_body | constructor_declaration ) ) -> template( \"not implemented: subprog_decl_in_type\")
			// PLSQLPrinter_DDL.g:450:10: ^( ( MEMBER_VK | STATIC_VK ) ( create_procedure_body | create_function_body | constructor_declaration ) )
			{
			// PLSQLPrinter_DDL.g:450:12: ( MEMBER_VK | STATIC_VK )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==MEMBER_VK) ) {
				alt127=1;
			}
			else if ( (LA127_0==STATIC_VK) ) {
				alt127=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// PLSQLPrinter_DDL.g:450:13: MEMBER_VK
					{
					match(input,MEMBER_VK,FOLLOW_MEMBER_VK_in_subprog_decl_in_type4985); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:450:23: STATIC_VK
					{
					match(input,STATIC_VK,FOLLOW_STATIC_VK_in_subprog_decl_in_type4987); 
					}
					break;

			}

			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:451:13: ( create_procedure_body | create_function_body | constructor_declaration )
			int alt128=3;
			switch ( input.LA(1) ) {
			case CREATE_PROCEDURE:
				{
				alt128=1;
				}
				break;
			case CREATE_FUNCTION:
				{
				alt128=2;
				}
				break;
			case CONSTRUCTOR_VK:
				{
				alt128=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// PLSQLPrinter_DDL.g:451:18: create_procedure_body
					{
					pushFollow(FOLLOW_create_procedure_body_in_subprog_decl_in_type5007);
					create_procedure_body();
					state._fsp--;

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:452:18: create_function_body
					{
					pushFollow(FOLLOW_create_function_body_in_subprog_decl_in_type5026);
					create_function_body();
					state._fsp--;

					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:453:18: constructor_declaration
					{
					pushFollow(FOLLOW_constructor_declaration_in_subprog_decl_in_type5045);
					constructor_declaration();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 456:5: -> template( \"not implemented: subprog_decl_in_type\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: subprog_decl_in_type");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subprog_decl_in_type"


	public static class constructor_declaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constructor_declaration"
	// PLSQLPrinter_DDL.g:459:1: constructor_declaration : ^( CONSTRUCTOR_VK type_spec ( FINAL_VK )? ( INSTANTIABLE_VK )? ^( PARAMETERS ( type_elements_parameter )* ) ( ^( CALL_MODE call_spec ) | ^( BODY_MODE block ) ) ) -> template( \"not implemented: constructor_declaration\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.constructor_declaration_return constructor_declaration() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.constructor_declaration_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.constructor_declaration_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:460:5: ( ^( CONSTRUCTOR_VK type_spec ( FINAL_VK )? ( INSTANTIABLE_VK )? ^( PARAMETERS ( type_elements_parameter )* ) ( ^( CALL_MODE call_spec ) | ^( BODY_MODE block ) ) ) -> template( \"not implemented: constructor_declaration\")
			// PLSQLPrinter_DDL.g:460:10: ^( CONSTRUCTOR_VK type_spec ( FINAL_VK )? ( INSTANTIABLE_VK )? ^( PARAMETERS ( type_elements_parameter )* ) ( ^( CALL_MODE call_spec ) | ^( BODY_MODE block ) ) )
			{
			match(input,CONSTRUCTOR_VK,FOLLOW_CONSTRUCTOR_VK_in_constructor_declaration5104); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_spec_in_constructor_declaration5106);
			gPLSQLPrinter.type_spec();
			state._fsp--;

			// PLSQLPrinter_DDL.g:460:37: ( FINAL_VK )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==FINAL_VK) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// PLSQLPrinter_DDL.g:460:37: FINAL_VK
					{
					match(input,FINAL_VK,FOLLOW_FINAL_VK_in_constructor_declaration5108); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:460:47: ( INSTANTIABLE_VK )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==INSTANTIABLE_VK) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// PLSQLPrinter_DDL.g:460:47: INSTANTIABLE_VK
					{
					match(input,INSTANTIABLE_VK,FOLLOW_INSTANTIABLE_VK_in_constructor_declaration5111); 
					}
					break;

			}

			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_constructor_declaration5115); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:460:77: ( type_elements_parameter )*
				loop131:
				while (true) {
					int alt131=2;
					int LA131_0 = input.LA(1);
					if ( (LA131_0==PARAMETER) ) {
						alt131=1;
					}

					switch (alt131) {
					case 1 :
						// PLSQLPrinter_DDL.g:460:77: type_elements_parameter
						{
						pushFollow(FOLLOW_type_elements_parameter_in_constructor_declaration5117);
						type_elements_parameter();
						state._fsp--;

						}
						break;

					default :
						break loop131;
					}
				}

				match(input, Token.UP, null); 
			}

			// PLSQLPrinter_DDL.g:461:13: ( ^( CALL_MODE call_spec ) | ^( BODY_MODE block ) )
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==CALL_MODE) ) {
				alt132=1;
			}
			else if ( (LA132_0==BODY_MODE) ) {
				alt132=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// PLSQLPrinter_DDL.g:461:18: ^( CALL_MODE call_spec )
					{
					match(input,CALL_MODE,FOLLOW_CALL_MODE_in_constructor_declaration5140); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_call_spec_in_constructor_declaration5142);
					call_spec();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:462:18: ^( BODY_MODE block )
					{
					match(input,BODY_MODE,FOLLOW_BODY_MODE_in_constructor_declaration5163); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_constructor_declaration5165);
					gPLSQLPrinter.block();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 465:5: -> template( \"not implemented: constructor_declaration\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: constructor_declaration");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_declaration"


	public static class modifier_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "modifier_clause"
	// PLSQLPrinter_DDL.g:472:1: modifier_clause : ^( MODIFIER ( SQL92_RESERVED_NOT )? ( INSTANTIABLE_VK | FINAL_VK | OVERRIDING_VK ) ) -> template( \"not implemented: modifier_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.modifier_clause_return modifier_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.modifier_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.modifier_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:473:5: ( ^( MODIFIER ( SQL92_RESERVED_NOT )? ( INSTANTIABLE_VK | FINAL_VK | OVERRIDING_VK ) ) -> template( \"not implemented: modifier_clause\")
			// PLSQLPrinter_DDL.g:473:10: ^( MODIFIER ( SQL92_RESERVED_NOT )? ( INSTANTIABLE_VK | FINAL_VK | OVERRIDING_VK ) )
			{
			match(input,MODIFIER,FOLLOW_MODIFIER_in_modifier_clause5229); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:473:21: ( SQL92_RESERVED_NOT )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==SQL92_RESERVED_NOT) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// PLSQLPrinter_DDL.g:473:21: SQL92_RESERVED_NOT
					{
					match(input,SQL92_RESERVED_NOT,FOLLOW_SQL92_RESERVED_NOT_in_modifier_clause5231); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:473:41: ( INSTANTIABLE_VK | FINAL_VK | OVERRIDING_VK )
			int alt134=3;
			switch ( input.LA(1) ) {
			case INSTANTIABLE_VK:
				{
				alt134=1;
				}
				break;
			case FINAL_VK:
				{
				alt134=2;
				}
				break;
			case OVERRIDING_VK:
				{
				alt134=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}
			switch (alt134) {
				case 1 :
					// PLSQLPrinter_DDL.g:473:42: INSTANTIABLE_VK
					{
					match(input,INSTANTIABLE_VK,FOLLOW_INSTANTIABLE_VK_in_modifier_clause5235); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:473:58: FINAL_VK
					{
					match(input,FINAL_VK,FOLLOW_FINAL_VK_in_modifier_clause5237); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:473:67: OVERRIDING_VK
					{
					match(input,OVERRIDING_VK,FOLLOW_OVERRIDING_VK_in_modifier_clause5239); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 474:5: -> template( \"not implemented: modifier_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: modifier_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier_clause"


	public static class sqlj_object_type_attr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sqlj_object_type_attr"
	// PLSQLPrinter_DDL.g:477:1: sqlj_object_type_attr : ^( EXTERNAL_VK expression ) -> template( \"not implemented: sqlj_object_type_attr\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.sqlj_object_type_attr_return sqlj_object_type_attr() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.sqlj_object_type_attr_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.sqlj_object_type_attr_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:478:5: ( ^( EXTERNAL_VK expression ) -> template( \"not implemented: sqlj_object_type_attr\")
			// PLSQLPrinter_DDL.g:478:10: ^( EXTERNAL_VK expression )
			{
			match(input,EXTERNAL_VK,FOLLOW_EXTERNAL_VK_in_sqlj_object_type_attr5276); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sqlj_object_type_attr5278);
			gPLSQLPrinter.expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 479:5: -> template( \"not implemented: sqlj_object_type_attr\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: sqlj_object_type_attr");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sqlj_object_type_attr"


	public static class element_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "element_spec"
	// PLSQLPrinter_DDL.g:482:1: element_spec : ^( ELEMENT_SPEC ( element_spec_options )+ ( modifier_clause )? ( pragma_clause )? ) -> template( \"not implemented: element_spec\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.element_spec_return element_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.element_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.element_spec_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:483:5: ( ^( ELEMENT_SPEC ( element_spec_options )+ ( modifier_clause )? ( pragma_clause )? ) -> template( \"not implemented: element_spec\")
			// PLSQLPrinter_DDL.g:483:10: ^( ELEMENT_SPEC ( element_spec_options )+ ( modifier_clause )? ( pragma_clause )? )
			{
			match(input,ELEMENT_SPEC,FOLLOW_ELEMENT_SPEC_in_element_spec5314); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:483:25: ( element_spec_options )+
			int cnt135=0;
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==SQL92_RESERVED_ORDER||LA135_0==CONSTRUCTOR_SPEC||LA135_0==FIELD_SPEC||LA135_0==MAP_VK||LA135_0==MEMBER_VK||LA135_0==STATIC_VK) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// PLSQLPrinter_DDL.g:483:25: element_spec_options
					{
					pushFollow(FOLLOW_element_spec_options_in_element_spec5316);
					element_spec_options();
					state._fsp--;

					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					EarlyExitException eee = new EarlyExitException(135, input);
					throw eee;
				}
				cnt135++;
			}

			// PLSQLPrinter_DDL.g:483:47: ( modifier_clause )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==MODIFIER) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// PLSQLPrinter_DDL.g:483:47: modifier_clause
					{
					pushFollow(FOLLOW_modifier_clause_in_element_spec5319);
					modifier_clause();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:483:64: ( pragma_clause )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==PRAGMA_VK) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// PLSQLPrinter_DDL.g:483:64: pragma_clause
					{
					pushFollow(FOLLOW_pragma_clause_in_element_spec5322);
					pragma_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 484:5: -> template( \"not implemented: element_spec\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: element_spec");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element_spec"


	public static class element_spec_options_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "element_spec_options"
	// PLSQLPrinter_DDL.g:487:1: element_spec_options : ( subprogram_spec -> template( \"not implemented: element_spec_options\"| constructor_spec -> template( \"not implemented: element_spec_options\"| map_order_function_spec -> template( \"not implemented: element_spec_options\"| ^( FIELD_SPEC commented_id type_spec ( sqlj_object_type_attr )? ) -> template( \"not implemented: element_spec_options\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.element_spec_options_return element_spec_options() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.element_spec_options_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.element_spec_options_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:488:5: ( subprogram_spec -> template( \"not implemented: element_spec_options\"| constructor_spec -> template( \"not implemented: element_spec_options\"| map_order_function_spec -> template( \"not implemented: element_spec_options\"| ^( FIELD_SPEC commented_id type_spec ( sqlj_object_type_attr )? ) -> template( \"not implemented: element_spec_options\")
			int alt139=4;
			switch ( input.LA(1) ) {
			case MEMBER_VK:
			case STATIC_VK:
				{
				alt139=1;
				}
				break;
			case CONSTRUCTOR_SPEC:
				{
				alt139=2;
				}
				break;
			case SQL92_RESERVED_ORDER:
			case MAP_VK:
				{
				alt139=3;
				}
				break;
			case FIELD_SPEC:
				{
				alt139=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}
			switch (alt139) {
				case 1 :
					// PLSQLPrinter_DDL.g:488:10: subprogram_spec
					{
					pushFollow(FOLLOW_subprogram_spec_in_element_spec_options5358);
					subprogram_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 489:5: -> template( \"not implemented: element_spec_options\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: element_spec_options");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:490:10: constructor_spec
					{
					pushFollow(FOLLOW_constructor_spec_in_element_spec_options5383);
					constructor_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 491:5: -> template( \"not implemented: element_spec_options\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: element_spec_options");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:492:10: map_order_function_spec
					{
					pushFollow(FOLLOW_map_order_function_spec_in_element_spec_options5408);
					map_order_function_spec();
					state._fsp--;

					// TEMPLATE REWRITE
					// 493:5: -> template( \"not implemented: element_spec_options\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: element_spec_options");
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:494:10: ^( FIELD_SPEC commented_id type_spec ( sqlj_object_type_attr )? )
					{
					match(input,FIELD_SPEC,FOLLOW_FIELD_SPEC_in_element_spec_options5434); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_commented_id_in_element_spec_options5436);
					gPLSQLPrinter.commented_id();
					state._fsp--;

					pushFollow(FOLLOW_type_spec_in_element_spec_options5438);
					gPLSQLPrinter.type_spec();
					state._fsp--;

					// PLSQLPrinter_DDL.g:494:46: ( sqlj_object_type_attr )?
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==EXTERNAL_VK) ) {
						alt138=1;
					}
					switch (alt138) {
						case 1 :
							// PLSQLPrinter_DDL.g:494:46: sqlj_object_type_attr
							{
							pushFollow(FOLLOW_sqlj_object_type_attr_in_element_spec_options5440);
							sqlj_object_type_attr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 495:5: -> template( \"not implemented: element_spec_options\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: element_spec_options");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element_spec_options"


	public static class subprogram_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subprogram_spec"
	// PLSQLPrinter_DDL.g:498:1: subprogram_spec : ^( ( MEMBER_VK | STATIC_VK ) ( procedure_spec | function_spec ) ) -> template( \"not implemented: subprogram_spec\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.subprogram_spec_return subprogram_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.subprogram_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.subprogram_spec_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:499:5: ( ^( ( MEMBER_VK | STATIC_VK ) ( procedure_spec | function_spec ) ) -> template( \"not implemented: subprogram_spec\")
			// PLSQLPrinter_DDL.g:499:10: ^( ( MEMBER_VK | STATIC_VK ) ( procedure_spec | function_spec ) )
			{
			// PLSQLPrinter_DDL.g:499:12: ( MEMBER_VK | STATIC_VK )
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==MEMBER_VK) ) {
				alt140=1;
			}
			else if ( (LA140_0==STATIC_VK) ) {
				alt140=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// PLSQLPrinter_DDL.g:499:13: MEMBER_VK
					{
					match(input,MEMBER_VK,FOLLOW_MEMBER_VK_in_subprogram_spec5478); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:499:23: STATIC_VK
					{
					match(input,STATIC_VK,FOLLOW_STATIC_VK_in_subprogram_spec5480); 
					}
					break;

			}

			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:500:13: ( procedure_spec | function_spec )
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==PROCEDURE_SPEC) ) {
				alt141=1;
			}
			else if ( (LA141_0==FUNCTION_SPEC) ) {
				alt141=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}

			switch (alt141) {
				case 1 :
					// PLSQLPrinter_DDL.g:500:18: procedure_spec
					{
					pushFollow(FOLLOW_procedure_spec_in_subprogram_spec5500);
					procedure_spec();
					state._fsp--;

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:501:18: function_spec
					{
					pushFollow(FOLLOW_function_spec_in_subprogram_spec5519);
					function_spec();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 504:5: -> template( \"not implemented: subprogram_spec\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: subprogram_spec");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subprogram_spec"


	public static class constructor_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constructor_spec"
	// PLSQLPrinter_DDL.g:507:1: constructor_spec : ^( CONSTRUCTOR_SPEC type_spec ( FINAL_VK )? ( INSTANTIABLE_VK )? ^( PARAMETERS ( type_elements_parameter )* ) ( constructor_call_mode )? ) -> template( \"not implemented: constructor_spec\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.constructor_spec_return constructor_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.constructor_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.constructor_spec_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:508:5: ( ^( CONSTRUCTOR_SPEC type_spec ( FINAL_VK )? ( INSTANTIABLE_VK )? ^( PARAMETERS ( type_elements_parameter )* ) ( constructor_call_mode )? ) -> template( \"not implemented: constructor_spec\")
			// PLSQLPrinter_DDL.g:508:10: ^( CONSTRUCTOR_SPEC type_spec ( FINAL_VK )? ( INSTANTIABLE_VK )? ^( PARAMETERS ( type_elements_parameter )* ) ( constructor_call_mode )? )
			{
			match(input,CONSTRUCTOR_SPEC,FOLLOW_CONSTRUCTOR_SPEC_in_constructor_spec5578); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_spec_in_constructor_spec5580);
			gPLSQLPrinter.type_spec();
			state._fsp--;

			// PLSQLPrinter_DDL.g:508:39: ( FINAL_VK )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==FINAL_VK) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// PLSQLPrinter_DDL.g:508:39: FINAL_VK
					{
					match(input,FINAL_VK,FOLLOW_FINAL_VK_in_constructor_spec5582); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:508:49: ( INSTANTIABLE_VK )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==INSTANTIABLE_VK) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// PLSQLPrinter_DDL.g:508:49: INSTANTIABLE_VK
					{
					match(input,INSTANTIABLE_VK,FOLLOW_INSTANTIABLE_VK_in_constructor_spec5585); 
					}
					break;

			}

			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_constructor_spec5589); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// PLSQLPrinter_DDL.g:508:79: ( type_elements_parameter )*
				loop144:
				while (true) {
					int alt144=2;
					int LA144_0 = input.LA(1);
					if ( (LA144_0==PARAMETER) ) {
						alt144=1;
					}

					switch (alt144) {
					case 1 :
						// PLSQLPrinter_DDL.g:508:79: type_elements_parameter
						{
						pushFollow(FOLLOW_type_elements_parameter_in_constructor_spec5591);
						type_elements_parameter();
						state._fsp--;

						}
						break;

					default :
						break loop144;
					}
				}

				match(input, Token.UP, null); 
			}

			// PLSQLPrinter_DDL.g:508:105: ( constructor_call_mode )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==CALL_MODE) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// PLSQLPrinter_DDL.g:508:105: constructor_call_mode
					{
					pushFollow(FOLLOW_constructor_call_mode_in_constructor_spec5595);
					constructor_call_mode();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 509:5: -> template( \"not implemented: constructor_spec\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: constructor_spec");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_spec"


	public static class constructor_call_mode_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constructor_call_mode"
	// PLSQLPrinter_DDL.g:512:1: constructor_call_mode : ^( CALL_MODE call_spec ) -> template( \"not implemented: constructor_call_mode\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.constructor_call_mode_return constructor_call_mode() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.constructor_call_mode_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.constructor_call_mode_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:513:5: ( ^( CALL_MODE call_spec ) -> template( \"not implemented: constructor_call_mode\")
			// PLSQLPrinter_DDL.g:513:10: ^( CALL_MODE call_spec )
			{
			match(input,CALL_MODE,FOLLOW_CALL_MODE_in_constructor_call_mode5632); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_call_spec_in_constructor_call_mode5634);
			call_spec();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 514:5: -> template( \"not implemented: constructor_call_mode\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: constructor_call_mode");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_call_mode"


	public static class map_order_function_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "map_order_function_spec"
	// PLSQLPrinter_DDL.g:517:1: map_order_function_spec : ^( ( MAP_VK | SQL92_RESERVED_ORDER ) function_spec ) -> template( \"not implemented: map_order_function_spec\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.map_order_function_spec_return map_order_function_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.map_order_function_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.map_order_function_spec_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:518:5: ( ^( ( MAP_VK | SQL92_RESERVED_ORDER ) function_spec ) -> template( \"not implemented: map_order_function_spec\")
			// PLSQLPrinter_DDL.g:518:10: ^( ( MAP_VK | SQL92_RESERVED_ORDER ) function_spec )
			{
			// PLSQLPrinter_DDL.g:518:12: ( MAP_VK | SQL92_RESERVED_ORDER )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==MAP_VK) ) {
				alt146=1;
			}
			else if ( (LA146_0==SQL92_RESERVED_ORDER) ) {
				alt146=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}

			switch (alt146) {
				case 1 :
					// PLSQLPrinter_DDL.g:518:13: MAP_VK
					{
					match(input,MAP_VK,FOLLOW_MAP_VK_in_map_order_function_spec5671); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:518:20: SQL92_RESERVED_ORDER
					{
					match(input,SQL92_RESERVED_ORDER,FOLLOW_SQL92_RESERVED_ORDER_in_map_order_function_spec5673); 
					}
					break;

			}

			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_function_spec_in_map_order_function_spec5676);
			function_spec();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 519:5: -> template( \"not implemented: map_order_function_spec\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: map_order_function_spec");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "map_order_function_spec"


	public static class pragma_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "pragma_clause"
	// PLSQLPrinter_DDL.g:522:1: pragma_clause : ^( PRAGMA_VK ( pragma_elements )+ ) -> template( \"not implemented: pragma_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.pragma_clause_return pragma_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.pragma_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.pragma_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:523:5: ( ^( PRAGMA_VK ( pragma_elements )+ ) -> template( \"not implemented: pragma_clause\")
			// PLSQLPrinter_DDL.g:523:10: ^( PRAGMA_VK ( pragma_elements )+ )
			{
			match(input,PRAGMA_VK,FOLLOW_PRAGMA_VK_in_pragma_clause5712); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:523:22: ( pragma_elements )+
			int cnt147=0;
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==SQL92_RESERVED_DEFAULT||LA147_0==ID) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// PLSQLPrinter_DDL.g:523:22: pragma_elements
					{
					pushFollow(FOLLOW_pragma_elements_in_pragma_clause5714);
					pragma_elements();
					state._fsp--;

					}
					break;

				default :
					if ( cnt147 >= 1 ) break loop147;
					EarlyExitException eee = new EarlyExitException(147, input);
					throw eee;
				}
				cnt147++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 524:5: -> template( \"not implemented: pragma_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: pragma_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pragma_clause"


	public static class pragma_elements_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "pragma_elements"
	// PLSQLPrinter_DDL.g:527:1: pragma_elements : ( commented_id -> template( \"not implemented: pragma_elements\"| SQL92_RESERVED_DEFAULT -> template( \"not implemented: pragma_elements\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.pragma_elements_return pragma_elements() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.pragma_elements_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.pragma_elements_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:528:5: ( commented_id -> template( \"not implemented: pragma_elements\"| SQL92_RESERVED_DEFAULT -> template( \"not implemented: pragma_elements\")
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==ID) ) {
				alt148=1;
			}
			else if ( (LA148_0==SQL92_RESERVED_DEFAULT) ) {
				alt148=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}

			switch (alt148) {
				case 1 :
					// PLSQLPrinter_DDL.g:528:10: commented_id
					{
					pushFollow(FOLLOW_commented_id_in_pragma_elements5750);
					gPLSQLPrinter.commented_id();
					state._fsp--;

					// TEMPLATE REWRITE
					// 529:5: -> template( \"not implemented: pragma_elements\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: pragma_elements");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:530:10: SQL92_RESERVED_DEFAULT
					{
					match(input,SQL92_RESERVED_DEFAULT,FOLLOW_SQL92_RESERVED_DEFAULT_in_pragma_elements5775); 
					// TEMPLATE REWRITE
					// 531:5: -> template( \"not implemented: pragma_elements\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: pragma_elements");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pragma_elements"


	public static class type_elements_parameter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type_elements_parameter"
	// PLSQLPrinter_DDL.g:534:1: type_elements_parameter : ^( PARAMETER parameter_name type_spec ) -> template( \"not implemented: type_elements_parameter\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.type_elements_parameter_return type_elements_parameter() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.type_elements_parameter_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.type_elements_parameter_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:535:5: ( ^( PARAMETER parameter_name type_spec ) -> template( \"not implemented: type_elements_parameter\")
			// PLSQLPrinter_DDL.g:535:10: ^( PARAMETER parameter_name type_spec )
			{
			match(input,PARAMETER,FOLLOW_PARAMETER_in_type_elements_parameter5810); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_parameter_name_in_type_elements_parameter5812);
			gPLSQLPrinter.parameter_name();
			state._fsp--;

			pushFollow(FOLLOW_type_spec_in_type_elements_parameter5814);
			gPLSQLPrinter.type_spec();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 536:5: -> template( \"not implemented: type_elements_parameter\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: type_elements_parameter");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_elements_parameter"


	public static class drop_sequence_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop_sequence"
	// PLSQLPrinter_DDL.g:545:1: drop_sequence : ^( DROP_SEQUENCE sequence_name ) -> template( \"not implemented: drop_sequence\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.drop_sequence_return drop_sequence() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.drop_sequence_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.drop_sequence_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:546:5: ( ^( DROP_SEQUENCE sequence_name ) -> template( \"not implemented: drop_sequence\")
			// PLSQLPrinter_DDL.g:546:9: ^( DROP_SEQUENCE sequence_name )
			{
			match(input,DROP_SEQUENCE,FOLLOW_DROP_SEQUENCE_in_drop_sequence5855); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_sequence_name_in_drop_sequence5857);
			gPLSQLPrinter.sequence_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 547:5: -> template( \"not implemented: drop_sequence\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: drop_sequence");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop_sequence"


	public static class alter_sequence_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alter_sequence"
	// PLSQLPrinter_DDL.g:550:1: alter_sequence : ^( ALTER_SEQUENCE sequence_name ( sequence_spec )+ ) -> template( \"not implemented: alter_sequence\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.alter_sequence_return alter_sequence() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.alter_sequence_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.alter_sequence_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:551:5: ( ^( ALTER_SEQUENCE sequence_name ( sequence_spec )+ ) -> template( \"not implemented: alter_sequence\")
			// PLSQLPrinter_DDL.g:551:10: ^( ALTER_SEQUENCE sequence_name ( sequence_spec )+ )
			{
			match(input,ALTER_SEQUENCE,FOLLOW_ALTER_SEQUENCE_in_alter_sequence5893); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_sequence_name_in_alter_sequence5895);
			gPLSQLPrinter.sequence_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:551:41: ( sequence_spec )+
			int cnt149=0;
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==PLSQL_RESERVED_START||LA149_0==SQL92_RESERVED_ORDER||LA149_0==CACHE_VK||LA149_0==CYCLE_VK||LA149_0==INCREMENT_VK||LA149_0==MAXVALUE_VK||LA149_0==MINVALUE_VK||LA149_0==NOCACHE_VK||LA149_0==NOCYCLE_VK||(LA149_0 >= NOMAXVALUE_VK && LA149_0 <= NOMINVALUE_VK)||LA149_0==NOORDER_VK) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// PLSQLPrinter_DDL.g:551:41: sequence_spec
					{
					pushFollow(FOLLOW_sequence_spec_in_alter_sequence5897);
					sequence_spec();
					state._fsp--;

					}
					break;

				default :
					if ( cnt149 >= 1 ) break loop149;
					EarlyExitException eee = new EarlyExitException(149, input);
					throw eee;
				}
				cnt149++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 552:5: -> template( \"not implemented: alter_sequence\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: alter_sequence");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alter_sequence"


	public static class create_sequence_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_sequence"
	// PLSQLPrinter_DDL.g:555:1: create_sequence : ^( CREATE_SEQUENCE sequence_name ( sequence_spec )* ) -> template( \"not implemented: create_sequence\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_sequence_return create_sequence() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_sequence_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_sequence_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:556:5: ( ^( CREATE_SEQUENCE sequence_name ( sequence_spec )* ) -> template( \"not implemented: create_sequence\")
			// PLSQLPrinter_DDL.g:556:10: ^( CREATE_SEQUENCE sequence_name ( sequence_spec )* )
			{
			match(input,CREATE_SEQUENCE,FOLLOW_CREATE_SEQUENCE_in_create_sequence5934); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_sequence_name_in_create_sequence5936);
			gPLSQLPrinter.sequence_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:556:42: ( sequence_spec )*
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==PLSQL_RESERVED_START||LA150_0==SQL92_RESERVED_ORDER||LA150_0==CACHE_VK||LA150_0==CYCLE_VK||LA150_0==INCREMENT_VK||LA150_0==MAXVALUE_VK||LA150_0==MINVALUE_VK||LA150_0==NOCACHE_VK||LA150_0==NOCYCLE_VK||(LA150_0 >= NOMAXVALUE_VK && LA150_0 <= NOMINVALUE_VK)||LA150_0==NOORDER_VK) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// PLSQLPrinter_DDL.g:556:42: sequence_spec
					{
					pushFollow(FOLLOW_sequence_spec_in_create_sequence5938);
					sequence_spec();
					state._fsp--;

					}
					break;

				default :
					break loop150;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 557:5: -> template( \"not implemented: create_sequence\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: create_sequence");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_sequence"


	public static class sequence_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sequence_spec"
	// PLSQLPrinter_DDL.g:562:1: sequence_spec : ( ^( PLSQL_RESERVED_START UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( INCREMENT_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( MAXVALUE_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( MINVALUE_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( CACHE_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| NOMAXVALUE_VK -> template( \"not implemented: sequence_spec\"| NOMINVALUE_VK -> template( \"not implemented: sequence_spec\"| CYCLE_VK -> template( \"not implemented: sequence_spec\"| NOCYCLE_VK -> template( \"not implemented: sequence_spec\"| NOCACHE_VK -> template( \"not implemented: sequence_spec\"| SQL92_RESERVED_ORDER -> template( \"not implemented: sequence_spec\"| NOORDER_VK -> template( \"not implemented: sequence_spec\");
	public final PLSQLPrinter_PLSQLPrinter_DDL.sequence_spec_return sequence_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.sequence_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.sequence_spec_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:563:5: ( ^( PLSQL_RESERVED_START UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( INCREMENT_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( MAXVALUE_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( MINVALUE_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| ^( CACHE_VK UNSIGNED_INTEGER ) -> template( \"not implemented: sequence_spec\"| NOMAXVALUE_VK -> template( \"not implemented: sequence_spec\"| NOMINVALUE_VK -> template( \"not implemented: sequence_spec\"| CYCLE_VK -> template( \"not implemented: sequence_spec\"| NOCYCLE_VK -> template( \"not implemented: sequence_spec\"| NOCACHE_VK -> template( \"not implemented: sequence_spec\"| SQL92_RESERVED_ORDER -> template( \"not implemented: sequence_spec\"| NOORDER_VK -> template( \"not implemented: sequence_spec\")
			int alt151=12;
			switch ( input.LA(1) ) {
			case PLSQL_RESERVED_START:
				{
				alt151=1;
				}
				break;
			case INCREMENT_VK:
				{
				alt151=2;
				}
				break;
			case MAXVALUE_VK:
				{
				alt151=3;
				}
				break;
			case MINVALUE_VK:
				{
				alt151=4;
				}
				break;
			case CACHE_VK:
				{
				alt151=5;
				}
				break;
			case NOMAXVALUE_VK:
				{
				alt151=6;
				}
				break;
			case NOMINVALUE_VK:
				{
				alt151=7;
				}
				break;
			case CYCLE_VK:
				{
				alt151=8;
				}
				break;
			case NOCYCLE_VK:
				{
				alt151=9;
				}
				break;
			case NOCACHE_VK:
				{
				alt151=10;
				}
				break;
			case SQL92_RESERVED_ORDER:
				{
				alt151=11;
				}
				break;
			case NOORDER_VK:
				{
				alt151=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}
			switch (alt151) {
				case 1 :
					// PLSQLPrinter_DDL.g:563:10: ^( PLSQL_RESERVED_START UNSIGNED_INTEGER )
					{
					match(input,PLSQL_RESERVED_START,FOLLOW_PLSQL_RESERVED_START_in_sequence_spec5977); 
					match(input, Token.DOWN, null); 
					match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sequence_spec5979); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 564:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:565:10: ^( INCREMENT_VK UNSIGNED_INTEGER )
					{
					match(input,INCREMENT_VK,FOLLOW_INCREMENT_VK_in_sequence_spec6006); 
					match(input, Token.DOWN, null); 
					match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6008); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 566:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:567:10: ^( MAXVALUE_VK UNSIGNED_INTEGER )
					{
					match(input,MAXVALUE_VK,FOLLOW_MAXVALUE_VK_in_sequence_spec6035); 
					match(input, Token.DOWN, null); 
					match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6037); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 568:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:569:10: ^( MINVALUE_VK UNSIGNED_INTEGER )
					{
					match(input,MINVALUE_VK,FOLLOW_MINVALUE_VK_in_sequence_spec6064); 
					match(input, Token.DOWN, null); 
					match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6066); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 570:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:571:10: ^( CACHE_VK UNSIGNED_INTEGER )
					{
					match(input,CACHE_VK,FOLLOW_CACHE_VK_in_sequence_spec6093); 
					match(input, Token.DOWN, null); 
					match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6095); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 572:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:573:10: NOMAXVALUE_VK
					{
					match(input,NOMAXVALUE_VK,FOLLOW_NOMAXVALUE_VK_in_sequence_spec6121); 
					// TEMPLATE REWRITE
					// 574:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 7 :
					// PLSQLPrinter_DDL.g:575:10: NOMINVALUE_VK
					{
					match(input,NOMINVALUE_VK,FOLLOW_NOMINVALUE_VK_in_sequence_spec6146); 
					// TEMPLATE REWRITE
					// 576:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 8 :
					// PLSQLPrinter_DDL.g:577:10: CYCLE_VK
					{
					match(input,CYCLE_VK,FOLLOW_CYCLE_VK_in_sequence_spec6171); 
					// TEMPLATE REWRITE
					// 578:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 9 :
					// PLSQLPrinter_DDL.g:579:10: NOCYCLE_VK
					{
					match(input,NOCYCLE_VK,FOLLOW_NOCYCLE_VK_in_sequence_spec6196); 
					// TEMPLATE REWRITE
					// 580:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 10 :
					// PLSQLPrinter_DDL.g:581:10: NOCACHE_VK
					{
					match(input,NOCACHE_VK,FOLLOW_NOCACHE_VK_in_sequence_spec6221); 
					// TEMPLATE REWRITE
					// 582:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 11 :
					// PLSQLPrinter_DDL.g:583:10: SQL92_RESERVED_ORDER
					{
					match(input,SQL92_RESERVED_ORDER,FOLLOW_SQL92_RESERVED_ORDER_in_sequence_spec6246); 
					// TEMPLATE REWRITE
					// 584:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;
				case 12 :
					// PLSQLPrinter_DDL.g:585:10: NOORDER_VK
					{
					match(input,NOORDER_VK,FOLLOW_NOORDER_VK_in_sequence_spec6271); 
					// TEMPLATE REWRITE
					// 586:5: -> template( \"not implemented: sequence_spec\"
					{
						retval.st = new StringTemplate(templateLib, "not implemented: sequence_spec");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequence_spec"


	public static class create_view_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_view"
	// PLSQLPrinter_DDL.g:595:1: create_view : ^( CREATE_VIEW ( REPLACE_VK )? ( create_view_force_clause )? view_name ( view_type_clause )? subquery ( subquery_restriction_clause )? ) -> create_view(is_replace=$REPLACE_VK != nullforce_clause=$create_view_force_clause.stname=$view_name.stview_type_clause=$view_type_clause.stsubquery=$subquery.stsubquery_restriction_clause=$subquery_restriction_clause.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_view_return create_view() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_view_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_view_return();
		retval.start = input.LT(1);

		CommonTree REPLACE_VK64=null;
		TreeRuleReturnScope create_view_force_clause65 =null;
		TreeRuleReturnScope view_name66 =null;
		TreeRuleReturnScope view_type_clause67 =null;
		TreeRuleReturnScope subquery68 =null;
		TreeRuleReturnScope subquery_restriction_clause69 =null;

		try {
			// PLSQLPrinter_DDL.g:596:5: ( ^( CREATE_VIEW ( REPLACE_VK )? ( create_view_force_clause )? view_name ( view_type_clause )? subquery ( subquery_restriction_clause )? ) -> create_view(is_replace=$REPLACE_VK != nullforce_clause=$create_view_force_clause.stname=$view_name.stview_type_clause=$view_type_clause.stsubquery=$subquery.stsubquery_restriction_clause=$subquery_restriction_clause.st))
			// PLSQLPrinter_DDL.g:596:9: ^( CREATE_VIEW ( REPLACE_VK )? ( create_view_force_clause )? view_name ( view_type_clause )? subquery ( subquery_restriction_clause )? )
			{
			match(input,CREATE_VIEW,FOLLOW_CREATE_VIEW_in_create_view6311); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:597:11: ( REPLACE_VK )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==REPLACE_VK) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// PLSQLPrinter_DDL.g:597:11: REPLACE_VK
					{
					REPLACE_VK64=(CommonTree)match(input,REPLACE_VK,FOLLOW_REPLACE_VK_in_create_view6323); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:598:11: ( create_view_force_clause )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==FORCE_VK||LA153_0==NOFORCE) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// PLSQLPrinter_DDL.g:598:11: create_view_force_clause
					{
					pushFollow(FOLLOW_create_view_force_clause_in_create_view6336);
					create_view_force_clause65=create_view_force_clause();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_view_name_in_create_view6349);
			view_name66=gPLSQLPrinter.view_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:600:11: ( view_type_clause )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==VIEW_TYPE_CONSTRAINTS) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// PLSQLPrinter_DDL.g:600:11: view_type_clause
					{
					pushFollow(FOLLOW_view_type_clause_in_create_view6361);
					view_type_clause67=view_type_clause();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_subquery_in_create_view6374);
			subquery68=gPLSQLPrinter.subquery();
			state._fsp--;

			// PLSQLPrinter_DDL.g:602:11: ( subquery_restriction_clause )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==SQL92_RESERVED_WITH) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// PLSQLPrinter_DDL.g:602:11: subquery_restriction_clause
					{
					pushFollow(FOLLOW_subquery_restriction_clause_in_create_view6386);
					subquery_restriction_clause69=gPLSQLPrinter.subquery_restriction_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 604:9: -> create_view(is_replace=$REPLACE_VK != nullforce_clause=$create_view_force_clause.stname=$view_name.stview_type_clause=$view_type_clause.stsubquery=$subquery.stsubquery_restriction_clause=$subquery_restriction_clause.st)
			{
				retval.st = templateLib.getInstanceOf("create_view",new STAttrMap().put("is_replace", REPLACE_VK64 != null).put("force_clause", (create_view_force_clause65!=null?((StringTemplate)create_view_force_clause65.getTemplate()):null)).put("name", (view_name66!=null?((StringTemplate)view_name66.getTemplate()):null)).put("view_type_clause", (view_type_clause67!=null?((StringTemplate)view_type_clause67.getTemplate()):null)).put("subquery", (subquery68!=null?((StringTemplate)subquery68.getTemplate()):null)).put("subquery_restriction_clause", (subquery_restriction_clause69!=null?((StringTemplate)subquery_restriction_clause69.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_view"


	public static class create_view_force_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create_view_force_clause"
	// PLSQLPrinter_DDL.g:610:1: create_view_force_clause : ( NOFORCE -> create_view_force_clause_noforce(| FORCE_VK -> create_view_force_clause_force();
	public final PLSQLPrinter_PLSQLPrinter_DDL.create_view_force_clause_return create_view_force_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.create_view_force_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.create_view_force_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:611:5: ( NOFORCE -> create_view_force_clause_noforce(| FORCE_VK -> create_view_force_clause_force()
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==NOFORCE) ) {
				alt156=1;
			}
			else if ( (LA156_0==FORCE_VK) ) {
				alt156=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}

			switch (alt156) {
				case 1 :
					// PLSQLPrinter_DDL.g:611:9: NOFORCE
					{
					match(input,NOFORCE,FOLLOW_NOFORCE_in_create_view_force_clause6493); 
					// TEMPLATE REWRITE
					// 611:17: -> create_view_force_clause_noforce(
					{
						retval.st = templateLib.getInstanceOf("create_view_force_clause_noforce");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:612:9: FORCE_VK
					{
					match(input,FORCE_VK,FOLLOW_FORCE_VK_in_create_view_force_clause6509); 
					// TEMPLATE REWRITE
					// 612:18: -> create_view_force_clause_force(
					{
						retval.st = templateLib.getInstanceOf("create_view_force_clause_force");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create_view_force_clause"


	public static class view_type_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "view_type_clause"
	// PLSQLPrinter_DDL.g:615:1: view_type_clause : view_type_constraints_clause -> { $view_type_constraints_clause.st };
	public final PLSQLPrinter_PLSQLPrinter_DDL.view_type_clause_return view_type_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.view_type_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.view_type_clause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope view_type_constraints_clause70 =null;

		try {
			// PLSQLPrinter_DDL.g:616:5: ( view_type_constraints_clause -> { $view_type_constraints_clause.st })
			// PLSQLPrinter_DDL.g:616:9: view_type_constraints_clause
			{
			pushFollow(FOLLOW_view_type_constraints_clause_in_view_type_clause6538);
			view_type_constraints_clause70=view_type_constraints_clause();
			state._fsp--;

			// TEMPLATE REWRITE
			// 616:38: -> { $view_type_constraints_clause.st }
			{
				retval.st =  (view_type_constraints_clause70!=null?((StringTemplate)view_type_constraints_clause70.getTemplate()):null) ;
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "view_type_clause"


	public static class view_type_constraints_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "view_type_constraints_clause"
	// PLSQLPrinter_DDL.g:622:1: view_type_constraints_clause : ^( VIEW_TYPE_CONSTRAINTS (items+= view_type_constraints_clause_item )+ ) -> view_type_constraints_clause(items= $items );
	public final PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraints_clause_return view_type_constraints_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraints_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraints_clause_return();
		retval.start = input.LT(1);

		List<Object> list_items=null;
		RuleReturnScope items = null;
		try {
			// PLSQLPrinter_DDL.g:623:5: ( ^( VIEW_TYPE_CONSTRAINTS (items+= view_type_constraints_clause_item )+ ) -> view_type_constraints_clause(items= $items ))
			// PLSQLPrinter_DDL.g:623:9: ^( VIEW_TYPE_CONSTRAINTS (items+= view_type_constraints_clause_item )+ )
			{
			match(input,VIEW_TYPE_CONSTRAINTS,FOLLOW_VIEW_TYPE_CONSTRAINTS_in_view_type_constraints_clause6593); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:623:38: (items+= view_type_constraints_clause_item )+
			int cnt157=0;
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==OUT_OF_LINE_CONSTRAINT||LA157_0==VIEW_TYPE_CONSTRAINT_ITEM_INLINE) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// PLSQLPrinter_DDL.g:623:38: items+= view_type_constraints_clause_item
					{
					pushFollow(FOLLOW_view_type_constraints_clause_item_in_view_type_constraints_clause6597);
					items=view_type_constraints_clause_item();
					state._fsp--;

					if (list_items==null) list_items=new ArrayList<Object>();
					list_items.add(items.getTemplate());
					}
					break;

				default :
					if ( cnt157 >= 1 ) break loop157;
					EarlyExitException eee = new EarlyExitException(157, input);
					throw eee;
				}
				cnt157++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 624:9: -> view_type_constraints_clause(items= $items )
			{
				retval.st = templateLib.getInstanceOf("view_type_constraints_clause",new STAttrMap().put("items",  list_items ));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "view_type_constraints_clause"


	public static class view_type_constraints_clause_item_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "view_type_constraints_clause_item"
	// PLSQLPrinter_DDL.g:627:1: view_type_constraints_clause_item : ( view_type_constraint_item_inline -> { $view_type_constraint_item_inline.st }| out_of_line_constraint_clause -> { $out_of_line_constraint_clause.st });
	public final PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraints_clause_item_return view_type_constraints_clause_item() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraints_clause_item_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraints_clause_item_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope view_type_constraint_item_inline71 =null;
		TreeRuleReturnScope out_of_line_constraint_clause72 =null;

		try {
			// PLSQLPrinter_DDL.g:628:5: ( view_type_constraint_item_inline -> { $view_type_constraint_item_inline.st }| out_of_line_constraint_clause -> { $out_of_line_constraint_clause.st })
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==VIEW_TYPE_CONSTRAINT_ITEM_INLINE) ) {
				alt158=1;
			}
			else if ( (LA158_0==OUT_OF_LINE_CONSTRAINT) ) {
				alt158=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}

			switch (alt158) {
				case 1 :
					// PLSQLPrinter_DDL.g:628:9: view_type_constraint_item_inline
					{
					pushFollow(FOLLOW_view_type_constraint_item_inline_in_view_type_constraints_clause_item6635);
					view_type_constraint_item_inline71=view_type_constraint_item_inline();
					state._fsp--;

					// TEMPLATE REWRITE
					// 628:42: -> { $view_type_constraint_item_inline.st }
					{
						retval.st =  (view_type_constraint_item_inline71!=null?((StringTemplate)view_type_constraint_item_inline71.getTemplate()):null) ;
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:629:11: out_of_line_constraint_clause
					{
					pushFollow(FOLLOW_out_of_line_constraint_clause_in_view_type_constraints_clause_item6651);
					out_of_line_constraint_clause72=out_of_line_constraint_clause();
					state._fsp--;

					// TEMPLATE REWRITE
					// 629:41: -> { $out_of_line_constraint_clause.st }
					{
						retval.st =  (out_of_line_constraint_clause72!=null?((StringTemplate)out_of_line_constraint_clause72.getTemplate()):null) ;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "view_type_constraints_clause_item"


	public static class view_type_constraint_item_inline_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "view_type_constraint_item_inline"
	// PLSQLPrinter_DDL.g:632:1: view_type_constraint_item_inline : ^( VIEW_TYPE_CONSTRAINT_ITEM_INLINE id= commented_id (items+= inline_constraint_clause )* ) -> view_type_constraint_item_inline(id=$id.stitems=$items);
	public final PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraint_item_inline_return view_type_constraint_item_inline() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraint_item_inline_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.view_type_constraint_item_inline_return();
		retval.start = input.LT(1);

		List<Object> list_items=null;
		TreeRuleReturnScope id =null;
		RuleReturnScope items = null;
		try {
			// PLSQLPrinter_DDL.g:633:5: ( ^( VIEW_TYPE_CONSTRAINT_ITEM_INLINE id= commented_id (items+= inline_constraint_clause )* ) -> view_type_constraint_item_inline(id=$id.stitems=$items))
			// PLSQLPrinter_DDL.g:633:9: ^( VIEW_TYPE_CONSTRAINT_ITEM_INLINE id= commented_id (items+= inline_constraint_clause )* )
			{
			match(input,VIEW_TYPE_CONSTRAINT_ITEM_INLINE,FOLLOW_VIEW_TYPE_CONSTRAINT_ITEM_INLINE_in_view_type_constraint_item_inline6679); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_commented_id_in_view_type_constraint_item_inline6683);
			id=gPLSQLPrinter.commented_id();
			state._fsp--;

			// PLSQLPrinter_DDL.g:633:65: (items+= inline_constraint_clause )*
			loop159:
			while (true) {
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==INLINE_CONSTRAINT_CLAUSE) ) {
					alt159=1;
				}

				switch (alt159) {
				case 1 :
					// PLSQLPrinter_DDL.g:633:65: items+= inline_constraint_clause
					{
					pushFollow(FOLLOW_inline_constraint_clause_in_view_type_constraint_item_inline6687);
					items=inline_constraint_clause();
					state._fsp--;

					if (list_items==null) list_items=new ArrayList<Object>();
					list_items.add(items.getTemplate());
					}
					break;

				default :
					break loop159;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 634:9: -> view_type_constraint_item_inline(id=$id.stitems=$items)
			{
				retval.st = templateLib.getInstanceOf("view_type_constraint_item_inline",new STAttrMap().put("id", (id!=null?((StringTemplate)id.getTemplate()):null)).put("items", list_items));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "view_type_constraint_item_inline"


	public static class inline_constraint_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "inline_constraint_clause"
	// PLSQLPrinter_DDL.g:637:1: inline_constraint_clause : ^( INLINE_CONSTRAINT_CLAUSE (id= commented_id )? inline_constraint_def (items+= constraint_state_item )* ) -> inline_constraint_clause(id=$id.stinline_constraint_def=$inline_constraint_def.stitems=$items);
	public final PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_clause_return inline_constraint_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_clause_return();
		retval.start = input.LT(1);

		List<Object> list_items=null;
		TreeRuleReturnScope id =null;
		TreeRuleReturnScope inline_constraint_def73 =null;
		RuleReturnScope items = null;
		try {
			// PLSQLPrinter_DDL.g:638:5: ( ^( INLINE_CONSTRAINT_CLAUSE (id= commented_id )? inline_constraint_def (items+= constraint_state_item )* ) -> inline_constraint_clause(id=$id.stinline_constraint_def=$inline_constraint_def.stitems=$items))
			// PLSQLPrinter_DDL.g:638:9: ^( INLINE_CONSTRAINT_CLAUSE (id= commented_id )? inline_constraint_def (items+= constraint_state_item )* )
			{
			match(input,INLINE_CONSTRAINT_CLAUSE,FOLLOW_INLINE_CONSTRAINT_CLAUSE_in_inline_constraint_clause6732); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:638:38: (id= commented_id )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==ID) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// PLSQLPrinter_DDL.g:638:38: id= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_inline_constraint_clause6736);
					id=gPLSQLPrinter.commented_id();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_inline_constraint_def_in_inline_constraint_clause6739);
			inline_constraint_def73=inline_constraint_def();
			state._fsp--;

			// PLSQLPrinter_DDL.g:638:80: (items+= constraint_state_item )*
			loop161:
			while (true) {
				int alt161=2;
				int LA161_0 = input.LA(1);
				if ( ((LA161_0 >= DEFERRABLE_VK && LA161_0 <= DEFERRED_VK)||LA161_0==DISABLE_VK||LA161_0==ENABLE_VK||LA161_0==EXCEPTIONS_VK||LA161_0==IMMEDIATE_VK||LA161_0==NORELY_VK||LA161_0==NOT_DEFERRABLE||LA161_0==NOVALIDATE_VK||LA161_0==RELY_VK||LA161_0==USING_INDEX||LA161_0==VALIDATE_VK) ) {
					alt161=1;
				}

				switch (alt161) {
				case 1 :
					// PLSQLPrinter_DDL.g:638:80: items+= constraint_state_item
					{
					pushFollow(FOLLOW_constraint_state_item_in_inline_constraint_clause6743);
					items=constraint_state_item();
					state._fsp--;

					if (list_items==null) list_items=new ArrayList<Object>();
					list_items.add(items.getTemplate());
					}
					break;

				default :
					break loop161;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 639:9: -> inline_constraint_clause(id=$id.stinline_constraint_def=$inline_constraint_def.stitems=$items)
			{
				retval.st = templateLib.getInstanceOf("inline_constraint_clause",new STAttrMap().put("id", (id!=null?((StringTemplate)id.getTemplate()):null)).put("inline_constraint_def", (inline_constraint_def73!=null?((StringTemplate)inline_constraint_def73.getTemplate()):null)).put("items", list_items));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_constraint_clause"


	public static class inline_constraint_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "inline_constraint_def"
	// PLSQLPrinter_DDL.g:642:1: inline_constraint_def : ( inline_constraint_null | inline_constraint_not_null | inline_constraint_unique | inline_constraint_primary_key | references_clause | checks_clause );
	public final PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_def_return inline_constraint_def() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_def_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_def_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:643:5: ( inline_constraint_null | inline_constraint_not_null | inline_constraint_unique | inline_constraint_primary_key | references_clause | checks_clause )
			int alt162=6;
			switch ( input.LA(1) ) {
			case SQL92_RESERVED_NULL:
				{
				alt162=1;
				}
				break;
			case NOT_NULL:
				{
				alt162=2;
				}
				break;
			case SQL92_RESERVED_UNIQUE:
				{
				alt162=3;
				}
				break;
			case PRIMARY_KEY:
				{
				alt162=4;
				}
				break;
			case REFERENCES_CLAUSE:
				{
				alt162=5;
				}
				break;
			case SQL92_RESERVED_CHECK:
				{
				alt162=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 162, 0, input);
				throw nvae;
			}
			switch (alt162) {
				case 1 :
					// PLSQLPrinter_DDL.g:644:9: inline_constraint_null
					{
					pushFollow(FOLLOW_inline_constraint_null_in_inline_constraint_def6801);
					inline_constraint_null();
					state._fsp--;

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:645:11: inline_constraint_not_null
					{
					pushFollow(FOLLOW_inline_constraint_not_null_in_inline_constraint_def6813);
					inline_constraint_not_null();
					state._fsp--;

					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:646:11: inline_constraint_unique
					{
					pushFollow(FOLLOW_inline_constraint_unique_in_inline_constraint_def6825);
					inline_constraint_unique();
					state._fsp--;

					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:647:11: inline_constraint_primary_key
					{
					pushFollow(FOLLOW_inline_constraint_primary_key_in_inline_constraint_def6837);
					inline_constraint_primary_key();
					state._fsp--;

					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:648:11: references_clause
					{
					pushFollow(FOLLOW_references_clause_in_inline_constraint_def6849);
					references_clause();
					state._fsp--;

					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:649:11: checks_clause
					{
					pushFollow(FOLLOW_checks_clause_in_inline_constraint_def6861);
					checks_clause();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_constraint_def"


	public static class inline_constraint_null_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "inline_constraint_null"
	// PLSQLPrinter_DDL.g:652:1: inline_constraint_null : SQL92_RESERVED_NULL -> inline_constraint_null(;
	public final PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_null_return inline_constraint_null() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_null_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_null_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:652:23: ( SQL92_RESERVED_NULL -> inline_constraint_null()
			// PLSQLPrinter_DDL.g:652:25: SQL92_RESERVED_NULL
			{
			match(input,SQL92_RESERVED_NULL,FOLLOW_SQL92_RESERVED_NULL_in_inline_constraint_null6877); 
			// TEMPLATE REWRITE
			// 652:45: -> inline_constraint_null(
			{
				retval.st = templateLib.getInstanceOf("inline_constraint_null");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_constraint_null"


	public static class inline_constraint_not_null_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "inline_constraint_not_null"
	// PLSQLPrinter_DDL.g:653:1: inline_constraint_not_null : NOT_NULL -> inline_constraint_not_null(;
	public final PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_not_null_return inline_constraint_not_null() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_not_null_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_not_null_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:653:27: ( NOT_NULL -> inline_constraint_not_null()
			// PLSQLPrinter_DDL.g:653:29: NOT_NULL
			{
			match(input,NOT_NULL,FOLLOW_NOT_NULL_in_inline_constraint_not_null6889); 
			// TEMPLATE REWRITE
			// 653:38: -> inline_constraint_not_null(
			{
				retval.st = templateLib.getInstanceOf("inline_constraint_not_null");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_constraint_not_null"


	public static class inline_constraint_unique_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "inline_constraint_unique"
	// PLSQLPrinter_DDL.g:654:1: inline_constraint_unique : SQL92_RESERVED_UNIQUE -> inline_constraint_unique(;
	public final PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_unique_return inline_constraint_unique() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_unique_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_unique_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:654:25: ( SQL92_RESERVED_UNIQUE -> inline_constraint_unique()
			// PLSQLPrinter_DDL.g:654:27: SQL92_RESERVED_UNIQUE
			{
			match(input,SQL92_RESERVED_UNIQUE,FOLLOW_SQL92_RESERVED_UNIQUE_in_inline_constraint_unique6901); 
			// TEMPLATE REWRITE
			// 654:49: -> inline_constraint_unique(
			{
				retval.st = templateLib.getInstanceOf("inline_constraint_unique");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_constraint_unique"


	public static class inline_constraint_primary_key_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "inline_constraint_primary_key"
	// PLSQLPrinter_DDL.g:655:1: inline_constraint_primary_key : PRIMARY_KEY -> inline_constraint_primary_key(;
	public final PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_primary_key_return inline_constraint_primary_key() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_primary_key_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.inline_constraint_primary_key_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:655:30: ( PRIMARY_KEY -> inline_constraint_primary_key()
			// PLSQLPrinter_DDL.g:655:32: PRIMARY_KEY
			{
			match(input,PRIMARY_KEY,FOLLOW_PRIMARY_KEY_in_inline_constraint_primary_key6913); 
			// TEMPLATE REWRITE
			// 655:44: -> inline_constraint_primary_key(
			{
				retval.st = templateLib.getInstanceOf("inline_constraint_primary_key");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_constraint_primary_key"


	public static class references_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "references_clause"
	// PLSQLPrinter_DDL.g:657:1: references_clause : ^( REFERENCES_CLAUSE tableview_name (ids+= commented_id )+ ( references_on_delete_clause )? ) -> references_clause(name=$tableview_name.stcolumns=$idson_delete_clause=$references_on_delete_clause.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.references_clause_return references_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.references_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.references_clause_return();
		retval.start = input.LT(1);

		List<Object> list_ids=null;
		TreeRuleReturnScope tableview_name74 =null;
		TreeRuleReturnScope references_on_delete_clause75 =null;
		RuleReturnScope ids = null;
		try {
			// PLSQLPrinter_DDL.g:658:5: ( ^( REFERENCES_CLAUSE tableview_name (ids+= commented_id )+ ( references_on_delete_clause )? ) -> references_clause(name=$tableview_name.stcolumns=$idson_delete_clause=$references_on_delete_clause.st))
			// PLSQLPrinter_DDL.g:658:7: ^( REFERENCES_CLAUSE tableview_name (ids+= commented_id )+ ( references_on_delete_clause )? )
			{
			match(input,REFERENCES_CLAUSE,FOLLOW_REFERENCES_CLAUSE_in_references_clause6932); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_tableview_name_in_references_clause6934);
			tableview_name74=gPLSQLPrinter.tableview_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:658:45: (ids+= commented_id )+
			int cnt163=0;
			loop163:
			while (true) {
				int alt163=2;
				int LA163_0 = input.LA(1);
				if ( (LA163_0==ID) ) {
					alt163=1;
				}

				switch (alt163) {
				case 1 :
					// PLSQLPrinter_DDL.g:658:45: ids+= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_references_clause6938);
					ids=gPLSQLPrinter.commented_id();
					state._fsp--;

					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids.getTemplate());
					}
					break;

				default :
					if ( cnt163 >= 1 ) break loop163;
					EarlyExitException eee = new EarlyExitException(163, input);
					throw eee;
				}
				cnt163++;
			}

			// PLSQLPrinter_DDL.g:658:61: ( references_on_delete_clause )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==ON_DELETE) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// PLSQLPrinter_DDL.g:658:61: references_on_delete_clause
					{
					pushFollow(FOLLOW_references_on_delete_clause_in_references_clause6941);
					references_on_delete_clause75=references_on_delete_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 659:7: -> references_clause(name=$tableview_name.stcolumns=$idson_delete_clause=$references_on_delete_clause.st)
			{
				retval.st = templateLib.getInstanceOf("references_clause",new STAttrMap().put("name", (tableview_name74!=null?((StringTemplate)tableview_name74.getTemplate()):null)).put("columns", list_ids).put("on_delete_clause", (references_on_delete_clause75!=null?((StringTemplate)references_on_delete_clause75.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "references_clause"


	public static class references_on_delete_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "references_on_delete_clause"
	// PLSQLPrinter_DDL.g:662:1: references_on_delete_clause : ^( ON_DELETE on_delete_clause_action ) -> references_on_delete_clause(action=$on_delete_clause_action.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.references_on_delete_clause_return references_on_delete_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.references_on_delete_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.references_on_delete_clause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope on_delete_clause_action76 =null;

		try {
			// PLSQLPrinter_DDL.g:663:5: ( ^( ON_DELETE on_delete_clause_action ) -> references_on_delete_clause(action=$on_delete_clause_action.st))
			// PLSQLPrinter_DDL.g:663:7: ^( ON_DELETE on_delete_clause_action )
			{
			match(input,ON_DELETE,FOLLOW_ON_DELETE_in_references_on_delete_clause6986); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_on_delete_clause_action_in_references_on_delete_clause6988);
			on_delete_clause_action76=on_delete_clause_action();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 664:7: -> references_on_delete_clause(action=$on_delete_clause_action.st)
			{
				retval.st = templateLib.getInstanceOf("references_on_delete_clause",new STAttrMap().put("action", (on_delete_clause_action76!=null?((StringTemplate)on_delete_clause_action76.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "references_on_delete_clause"


	public static class on_delete_clause_action_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "on_delete_clause_action"
	// PLSQLPrinter_DDL.g:667:1: on_delete_clause_action : ( CASCADE_VK -> on_delete_clause_action_cascade(| SET_NULL -> on_delete_clause_action_set_null();
	public final PLSQLPrinter_PLSQLPrinter_DDL.on_delete_clause_action_return on_delete_clause_action() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.on_delete_clause_action_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.on_delete_clause_action_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:668:5: ( CASCADE_VK -> on_delete_clause_action_cascade(| SET_NULL -> on_delete_clause_action_set_null()
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==CASCADE_VK) ) {
				alt165=1;
			}
			else if ( (LA165_0==SET_NULL) ) {
				alt165=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// PLSQLPrinter_DDL.g:668:7: CASCADE_VK
					{
					match(input,CASCADE_VK,FOLLOW_CASCADE_VK_in_on_delete_clause_action7025); 
					// TEMPLATE REWRITE
					// 668:18: -> on_delete_clause_action_cascade(
					{
						retval.st = templateLib.getInstanceOf("on_delete_clause_action_cascade");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:669:7: SET_NULL
					{
					match(input,SET_NULL,FOLLOW_SET_NULL_in_on_delete_clause_action7039); 
					// TEMPLATE REWRITE
					// 669:16: -> on_delete_clause_action_set_null(
					{
						retval.st = templateLib.getInstanceOf("on_delete_clause_action_set_null");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "on_delete_clause_action"


	public static class checks_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "checks_clause"
	// PLSQLPrinter_DDL.g:672:1: checks_clause : ^( SQL92_RESERVED_CHECK expression ) -> checks_clause(expr=$expression.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.checks_clause_return checks_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.checks_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.checks_clause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression77 =null;

		try {
			// PLSQLPrinter_DDL.g:673:5: ( ^( SQL92_RESERVED_CHECK expression ) -> checks_clause(expr=$expression.st))
			// PLSQLPrinter_DDL.g:673:7: ^( SQL92_RESERVED_CHECK expression )
			{
			match(input,SQL92_RESERVED_CHECK,FOLLOW_SQL92_RESERVED_CHECK_in_checks_clause7067); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_checks_clause7069);
			expression77=gPLSQLPrinter.expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 674:7: -> checks_clause(expr=$expression.st)
			{
				retval.st = templateLib.getInstanceOf("checks_clause",new STAttrMap().put("expr", (expression77!=null?((StringTemplate)expression77.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "checks_clause"


	public static class constraint_state_item_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constraint_state_item"
	// PLSQLPrinter_DDL.g:677:1: constraint_state_item : ( NOT_DEFERRABLE -> constraint_state_item_not_deferrable(| DEFERRABLE_VK -> constraint_state_item_deferrable(| IMMEDIATE_VK -> constraint_state_item_immediate(| DEFERRED_VK -> constraint_state_item_deferred(| RELY_VK -> constraint_state_item_rely(| NORELY_VK -> constraint_state_item_norely(| using_index_clause -> { $using_index_clause.st }| ENABLE_VK -> constraint_state_item_enable(| DISABLE_VK -> constraint_state_item_disable(| VALIDATE_VK -> constraint_state_item_validate(| NOVALIDATE_VK -> constraint_state_item_novalidate(| exceptions_clause -> { $exceptions_clause.st });
	public final PLSQLPrinter_PLSQLPrinter_DDL.constraint_state_item_return constraint_state_item() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.constraint_state_item_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.constraint_state_item_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope using_index_clause78 =null;
		TreeRuleReturnScope exceptions_clause79 =null;

		try {
			// PLSQLPrinter_DDL.g:678:5: ( NOT_DEFERRABLE -> constraint_state_item_not_deferrable(| DEFERRABLE_VK -> constraint_state_item_deferrable(| IMMEDIATE_VK -> constraint_state_item_immediate(| DEFERRED_VK -> constraint_state_item_deferred(| RELY_VK -> constraint_state_item_rely(| NORELY_VK -> constraint_state_item_norely(| using_index_clause -> { $using_index_clause.st }| ENABLE_VK -> constraint_state_item_enable(| DISABLE_VK -> constraint_state_item_disable(| VALIDATE_VK -> constraint_state_item_validate(| NOVALIDATE_VK -> constraint_state_item_novalidate(| exceptions_clause -> { $exceptions_clause.st })
			int alt166=12;
			switch ( input.LA(1) ) {
			case NOT_DEFERRABLE:
				{
				alt166=1;
				}
				break;
			case DEFERRABLE_VK:
				{
				alt166=2;
				}
				break;
			case IMMEDIATE_VK:
				{
				alt166=3;
				}
				break;
			case DEFERRED_VK:
				{
				alt166=4;
				}
				break;
			case RELY_VK:
				{
				alt166=5;
				}
				break;
			case NORELY_VK:
				{
				alt166=6;
				}
				break;
			case USING_INDEX:
				{
				alt166=7;
				}
				break;
			case ENABLE_VK:
				{
				alt166=8;
				}
				break;
			case DISABLE_VK:
				{
				alt166=9;
				}
				break;
			case VALIDATE_VK:
				{
				alt166=10;
				}
				break;
			case NOVALIDATE_VK:
				{
				alt166=11;
				}
				break;
			case EXCEPTIONS_VK:
				{
				alt166=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}
			switch (alt166) {
				case 1 :
					// PLSQLPrinter_DDL.g:678:7: NOT_DEFERRABLE
					{
					match(input,NOT_DEFERRABLE,FOLLOW_NOT_DEFERRABLE_in_constraint_state_item7106); 
					// TEMPLATE REWRITE
					// 678:22: -> constraint_state_item_not_deferrable(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_not_deferrable");
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:679:7: DEFERRABLE_VK
					{
					match(input,DEFERRABLE_VK,FOLLOW_DEFERRABLE_VK_in_constraint_state_item7120); 
					// TEMPLATE REWRITE
					// 679:21: -> constraint_state_item_deferrable(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_deferrable");
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:680:7: IMMEDIATE_VK
					{
					match(input,IMMEDIATE_VK,FOLLOW_IMMEDIATE_VK_in_constraint_state_item7134); 
					// TEMPLATE REWRITE
					// 680:20: -> constraint_state_item_immediate(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_immediate");
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:681:7: DEFERRED_VK
					{
					match(input,DEFERRED_VK,FOLLOW_DEFERRED_VK_in_constraint_state_item7148); 
					// TEMPLATE REWRITE
					// 681:19: -> constraint_state_item_deferred(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_deferred");
					}



					}
					break;
				case 5 :
					// PLSQLPrinter_DDL.g:682:7: RELY_VK
					{
					match(input,RELY_VK,FOLLOW_RELY_VK_in_constraint_state_item7162); 
					// TEMPLATE REWRITE
					// 682:15: -> constraint_state_item_rely(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_rely");
					}



					}
					break;
				case 6 :
					// PLSQLPrinter_DDL.g:683:7: NORELY_VK
					{
					match(input,NORELY_VK,FOLLOW_NORELY_VK_in_constraint_state_item7176); 
					// TEMPLATE REWRITE
					// 683:17: -> constraint_state_item_norely(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_norely");
					}



					}
					break;
				case 7 :
					// PLSQLPrinter_DDL.g:684:7: using_index_clause
					{
					pushFollow(FOLLOW_using_index_clause_in_constraint_state_item7190);
					using_index_clause78=using_index_clause();
					state._fsp--;

					// TEMPLATE REWRITE
					// 684:26: -> { $using_index_clause.st }
					{
						retval.st =  (using_index_clause78!=null?((StringTemplate)using_index_clause78.getTemplate()):null) ;
					}



					}
					break;
				case 8 :
					// PLSQLPrinter_DDL.g:685:7: ENABLE_VK
					{
					match(input,ENABLE_VK,FOLLOW_ENABLE_VK_in_constraint_state_item7202); 
					// TEMPLATE REWRITE
					// 685:17: -> constraint_state_item_enable(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_enable");
					}



					}
					break;
				case 9 :
					// PLSQLPrinter_DDL.g:686:7: DISABLE_VK
					{
					match(input,DISABLE_VK,FOLLOW_DISABLE_VK_in_constraint_state_item7216); 
					// TEMPLATE REWRITE
					// 686:18: -> constraint_state_item_disable(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_disable");
					}



					}
					break;
				case 10 :
					// PLSQLPrinter_DDL.g:687:7: VALIDATE_VK
					{
					match(input,VALIDATE_VK,FOLLOW_VALIDATE_VK_in_constraint_state_item7230); 
					// TEMPLATE REWRITE
					// 687:19: -> constraint_state_item_validate(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_validate");
					}



					}
					break;
				case 11 :
					// PLSQLPrinter_DDL.g:688:7: NOVALIDATE_VK
					{
					match(input,NOVALIDATE_VK,FOLLOW_NOVALIDATE_VK_in_constraint_state_item7244); 
					// TEMPLATE REWRITE
					// 688:21: -> constraint_state_item_novalidate(
					{
						retval.st = templateLib.getInstanceOf("constraint_state_item_novalidate");
					}



					}
					break;
				case 12 :
					// PLSQLPrinter_DDL.g:689:7: exceptions_clause
					{
					pushFollow(FOLLOW_exceptions_clause_in_constraint_state_item7258);
					exceptions_clause79=exceptions_clause();
					state._fsp--;

					// TEMPLATE REWRITE
					// 689:25: -> { $exceptions_clause.st }
					{
						retval.st =  (exceptions_clause79!=null?((StringTemplate)exceptions_clause79.getTemplate()):null) ;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraint_state_item"


	public static class using_index_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "using_index_clause"
	// PLSQLPrinter_DDL.g:692:1: using_index_clause : ^( USING_INDEX using_index_def ) -> using_index_clause(index_def=$using_index_def.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.using_index_clause_return using_index_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.using_index_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.using_index_clause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope using_index_def80 =null;

		try {
			// PLSQLPrinter_DDL.g:693:5: ( ^( USING_INDEX using_index_def ) -> using_index_clause(index_def=$using_index_def.st))
			// PLSQLPrinter_DDL.g:693:7: ^( USING_INDEX using_index_def )
			{
			match(input,USING_INDEX,FOLLOW_USING_INDEX_in_using_index_clause7284); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_using_index_def_in_using_index_clause7286);
			using_index_def80=using_index_def();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 694:7: -> using_index_clause(index_def=$using_index_def.st)
			{
				retval.st = templateLib.getInstanceOf("using_index_clause",new STAttrMap().put("index_def", (using_index_def80!=null?((StringTemplate)using_index_def80.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "using_index_clause"


	public static class using_index_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "using_index_def"
	// PLSQLPrinter_DDL.g:697:1: using_index_def : tableview_name -> { $tableview_name.st };
	public final PLSQLPrinter_PLSQLPrinter_DDL.using_index_def_return using_index_def() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.using_index_def_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.using_index_def_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tableview_name81 =null;

		try {
			// PLSQLPrinter_DDL.g:698:5: ( tableview_name -> { $tableview_name.st })
			// PLSQLPrinter_DDL.g:698:7: tableview_name
			{
			pushFollow(FOLLOW_tableview_name_in_using_index_def7319);
			tableview_name81=gPLSQLPrinter.tableview_name();
			state._fsp--;

			// TEMPLATE REWRITE
			// 698:22: -> { $tableview_name.st }
			{
				retval.st =  (tableview_name81!=null?((StringTemplate)tableview_name81.getTemplate()):null) ;
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "using_index_def"


	public static class exceptions_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exceptions_clause"
	// PLSQLPrinter_DDL.g:704:1: exceptions_clause : ^( EXCEPTIONS_VK tableview_name ) -> exceptions_clause(name=$tableview_name.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.exceptions_clause_return exceptions_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.exceptions_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.exceptions_clause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tableview_name82 =null;

		try {
			// PLSQLPrinter_DDL.g:705:5: ( ^( EXCEPTIONS_VK tableview_name ) -> exceptions_clause(name=$tableview_name.st))
			// PLSQLPrinter_DDL.g:705:7: ^( EXCEPTIONS_VK tableview_name )
			{
			match(input,EXCEPTIONS_VK,FOLLOW_EXCEPTIONS_VK_in_exceptions_clause7358); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_tableview_name_in_exceptions_clause7360);
			tableview_name82=gPLSQLPrinter.tableview_name();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 706:7: -> exceptions_clause(name=$tableview_name.st)
			{
				retval.st = templateLib.getInstanceOf("exceptions_clause",new STAttrMap().put("name", (tableview_name82!=null?((StringTemplate)tableview_name82.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exceptions_clause"


	public static class out_of_line_constraint_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "out_of_line_constraint_clause"
	// PLSQLPrinter_DDL.g:709:1: out_of_line_constraint_clause : ^( OUT_OF_LINE_CONSTRAINT (id= commented_id )? out_of_line_constraint_def (items+= constraint_state_item )* ) -> out_of_line_constraint_clause(name=$id.stout_of_line_constraint_def=$out_of_line_constraint_def.stitems=$items);
	public final PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_clause_return out_of_line_constraint_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_clause_return();
		retval.start = input.LT(1);

		List<Object> list_items=null;
		TreeRuleReturnScope id =null;
		TreeRuleReturnScope out_of_line_constraint_def83 =null;
		RuleReturnScope items = null;
		try {
			// PLSQLPrinter_DDL.g:710:5: ( ^( OUT_OF_LINE_CONSTRAINT (id= commented_id )? out_of_line_constraint_def (items+= constraint_state_item )* ) -> out_of_line_constraint_clause(name=$id.stout_of_line_constraint_def=$out_of_line_constraint_def.stitems=$items))
			// PLSQLPrinter_DDL.g:710:7: ^( OUT_OF_LINE_CONSTRAINT (id= commented_id )? out_of_line_constraint_def (items+= constraint_state_item )* )
			{
			match(input,OUT_OF_LINE_CONSTRAINT,FOLLOW_OUT_OF_LINE_CONSTRAINT_in_out_of_line_constraint_clause7398); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:710:34: (id= commented_id )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==ID) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// PLSQLPrinter_DDL.g:710:34: id= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_out_of_line_constraint_clause7402);
					id=gPLSQLPrinter.commented_id();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_out_of_line_constraint_def_in_out_of_line_constraint_clause7405);
			out_of_line_constraint_def83=out_of_line_constraint_def();
			state._fsp--;

			// PLSQLPrinter_DDL.g:710:81: (items+= constraint_state_item )*
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( ((LA168_0 >= DEFERRABLE_VK && LA168_0 <= DEFERRED_VK)||LA168_0==DISABLE_VK||LA168_0==ENABLE_VK||LA168_0==EXCEPTIONS_VK||LA168_0==IMMEDIATE_VK||LA168_0==NORELY_VK||LA168_0==NOT_DEFERRABLE||LA168_0==NOVALIDATE_VK||LA168_0==RELY_VK||LA168_0==USING_INDEX||LA168_0==VALIDATE_VK) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// PLSQLPrinter_DDL.g:710:81: items+= constraint_state_item
					{
					pushFollow(FOLLOW_constraint_state_item_in_out_of_line_constraint_clause7409);
					items=constraint_state_item();
					state._fsp--;

					if (list_items==null) list_items=new ArrayList<Object>();
					list_items.add(items.getTemplate());
					}
					break;

				default :
					break loop168;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 711:7: -> out_of_line_constraint_clause(name=$id.stout_of_line_constraint_def=$out_of_line_constraint_def.stitems=$items)
			{
				retval.st = templateLib.getInstanceOf("out_of_line_constraint_clause",new STAttrMap().put("name", (id!=null?((StringTemplate)id.getTemplate()):null)).put("out_of_line_constraint_def", (out_of_line_constraint_def83!=null?((StringTemplate)out_of_line_constraint_def83.getTemplate()):null)).put("items", list_items));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "out_of_line_constraint_clause"


	public static class out_of_line_constraint_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "out_of_line_constraint_def"
	// PLSQLPrinter_DDL.g:715:1: out_of_line_constraint_def : ( out_of_line_constraint_def_unique -> { $out_of_line_constraint_def_unique.st }| out_of_line_constraint_def_primary_key -> { $out_of_line_constraint_def_primary_key.st }| out_of_line_constraint_def_foreign_key -> { $out_of_line_constraint_def_foreign_key.st }| checks_clause -> { $checks_clause.st });
	public final PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_return out_of_line_constraint_def() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope out_of_line_constraint_def_unique84 =null;
		TreeRuleReturnScope out_of_line_constraint_def_primary_key85 =null;
		TreeRuleReturnScope out_of_line_constraint_def_foreign_key86 =null;
		TreeRuleReturnScope checks_clause87 =null;

		try {
			// PLSQLPrinter_DDL.g:716:5: ( out_of_line_constraint_def_unique -> { $out_of_line_constraint_def_unique.st }| out_of_line_constraint_def_primary_key -> { $out_of_line_constraint_def_primary_key.st }| out_of_line_constraint_def_foreign_key -> { $out_of_line_constraint_def_foreign_key.st }| checks_clause -> { $checks_clause.st })
			int alt169=4;
			switch ( input.LA(1) ) {
			case SQL92_RESERVED_UNIQUE:
				{
				alt169=1;
				}
				break;
			case PRIMARY_KEY:
				{
				alt169=2;
				}
				break;
			case FOREIGN_KEY:
				{
				alt169=3;
				}
				break;
			case SQL92_RESERVED_CHECK:
				{
				alt169=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}
			switch (alt169) {
				case 1 :
					// PLSQLPrinter_DDL.g:716:7: out_of_line_constraint_def_unique
					{
					pushFollow(FOLLOW_out_of_line_constraint_def_unique_in_out_of_line_constraint_def7463);
					out_of_line_constraint_def_unique84=out_of_line_constraint_def_unique();
					state._fsp--;

					// TEMPLATE REWRITE
					// 716:41: -> { $out_of_line_constraint_def_unique.st }
					{
						retval.st =  (out_of_line_constraint_def_unique84!=null?((StringTemplate)out_of_line_constraint_def_unique84.getTemplate()):null) ;
					}



					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:717:7: out_of_line_constraint_def_primary_key
					{
					pushFollow(FOLLOW_out_of_line_constraint_def_primary_key_in_out_of_line_constraint_def7475);
					out_of_line_constraint_def_primary_key85=out_of_line_constraint_def_primary_key();
					state._fsp--;

					// TEMPLATE REWRITE
					// 717:46: -> { $out_of_line_constraint_def_primary_key.st }
					{
						retval.st =  (out_of_line_constraint_def_primary_key85!=null?((StringTemplate)out_of_line_constraint_def_primary_key85.getTemplate()):null) ;
					}



					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:718:7: out_of_line_constraint_def_foreign_key
					{
					pushFollow(FOLLOW_out_of_line_constraint_def_foreign_key_in_out_of_line_constraint_def7487);
					out_of_line_constraint_def_foreign_key86=out_of_line_constraint_def_foreign_key();
					state._fsp--;

					// TEMPLATE REWRITE
					// 718:46: -> { $out_of_line_constraint_def_foreign_key.st }
					{
						retval.st =  (out_of_line_constraint_def_foreign_key86!=null?((StringTemplate)out_of_line_constraint_def_foreign_key86.getTemplate()):null) ;
					}



					}
					break;
				case 4 :
					// PLSQLPrinter_DDL.g:719:7: checks_clause
					{
					pushFollow(FOLLOW_checks_clause_in_out_of_line_constraint_def7499);
					checks_clause87=checks_clause();
					state._fsp--;

					// TEMPLATE REWRITE
					// 719:21: -> { $checks_clause.st }
					{
						retval.st =  (checks_clause87!=null?((StringTemplate)checks_clause87.getTemplate()):null) ;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "out_of_line_constraint_def"


	public static class out_of_line_constraint_def_unique_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "out_of_line_constraint_def_unique"
	// PLSQLPrinter_DDL.g:722:1: out_of_line_constraint_def_unique : ^( SQL92_RESERVED_UNIQUE (ids+= commented_id )+ ) -> out_of_line_constraint_def_unique(columns=$ids);
	public final PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_unique_return out_of_line_constraint_def_unique() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_unique_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_unique_return();
		retval.start = input.LT(1);

		List<Object> list_ids=null;
		RuleReturnScope ids = null;
		try {
			// PLSQLPrinter_DDL.g:723:5: ( ^( SQL92_RESERVED_UNIQUE (ids+= commented_id )+ ) -> out_of_line_constraint_def_unique(columns=$ids))
			// PLSQLPrinter_DDL.g:723:7: ^( SQL92_RESERVED_UNIQUE (ids+= commented_id )+ )
			{
			match(input,SQL92_RESERVED_UNIQUE,FOLLOW_SQL92_RESERVED_UNIQUE_in_out_of_line_constraint_def_unique7525); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:723:34: (ids+= commented_id )+
			int cnt170=0;
			loop170:
			while (true) {
				int alt170=2;
				int LA170_0 = input.LA(1);
				if ( (LA170_0==ID) ) {
					alt170=1;
				}

				switch (alt170) {
				case 1 :
					// PLSQLPrinter_DDL.g:723:34: ids+= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_out_of_line_constraint_def_unique7529);
					ids=gPLSQLPrinter.commented_id();
					state._fsp--;

					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids.getTemplate());
					}
					break;

				default :
					if ( cnt170 >= 1 ) break loop170;
					EarlyExitException eee = new EarlyExitException(170, input);
					throw eee;
				}
				cnt170++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 724:7: -> out_of_line_constraint_def_unique(columns=$ids)
			{
				retval.st = templateLib.getInstanceOf("out_of_line_constraint_def_unique",new STAttrMap().put("columns", list_ids));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "out_of_line_constraint_def_unique"


	public static class out_of_line_constraint_def_primary_key_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "out_of_line_constraint_def_primary_key"
	// PLSQLPrinter_DDL.g:727:1: out_of_line_constraint_def_primary_key : ^( PRIMARY_KEY (ids+= commented_id )+ ) -> out_of_line_constraint_def_primary_key(columns=$ids);
	public final PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_primary_key_return out_of_line_constraint_def_primary_key() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_primary_key_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_primary_key_return();
		retval.start = input.LT(1);

		List<Object> list_ids=null;
		RuleReturnScope ids = null;
		try {
			// PLSQLPrinter_DDL.g:728:5: ( ^( PRIMARY_KEY (ids+= commented_id )+ ) -> out_of_line_constraint_def_primary_key(columns=$ids))
			// PLSQLPrinter_DDL.g:728:7: ^( PRIMARY_KEY (ids+= commented_id )+ )
			{
			match(input,PRIMARY_KEY,FOLLOW_PRIMARY_KEY_in_out_of_line_constraint_def_primary_key7568); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:728:24: (ids+= commented_id )+
			int cnt171=0;
			loop171:
			while (true) {
				int alt171=2;
				int LA171_0 = input.LA(1);
				if ( (LA171_0==ID) ) {
					alt171=1;
				}

				switch (alt171) {
				case 1 :
					// PLSQLPrinter_DDL.g:728:24: ids+= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_out_of_line_constraint_def_primary_key7572);
					ids=gPLSQLPrinter.commented_id();
					state._fsp--;

					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids.getTemplate());
					}
					break;

				default :
					if ( cnt171 >= 1 ) break loop171;
					EarlyExitException eee = new EarlyExitException(171, input);
					throw eee;
				}
				cnt171++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 729:7: -> out_of_line_constraint_def_primary_key(columns=$ids)
			{
				retval.st = templateLib.getInstanceOf("out_of_line_constraint_def_primary_key",new STAttrMap().put("columns", list_ids));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "out_of_line_constraint_def_primary_key"


	public static class out_of_line_constraint_def_foreign_key_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "out_of_line_constraint_def_foreign_key"
	// PLSQLPrinter_DDL.g:732:1: out_of_line_constraint_def_foreign_key : ^( FOREIGN_KEY (ids+= commented_id )+ references_clause ) -> out_of_line_constraint_def_foreign_key(columns=$idsreferences_clause=$references_clause.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_foreign_key_return out_of_line_constraint_def_foreign_key() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_foreign_key_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.out_of_line_constraint_def_foreign_key_return();
		retval.start = input.LT(1);

		List<Object> list_ids=null;
		TreeRuleReturnScope references_clause88 =null;
		RuleReturnScope ids = null;
		try {
			// PLSQLPrinter_DDL.g:733:5: ( ^( FOREIGN_KEY (ids+= commented_id )+ references_clause ) -> out_of_line_constraint_def_foreign_key(columns=$idsreferences_clause=$references_clause.st))
			// PLSQLPrinter_DDL.g:733:7: ^( FOREIGN_KEY (ids+= commented_id )+ references_clause )
			{
			match(input,FOREIGN_KEY,FOLLOW_FOREIGN_KEY_in_out_of_line_constraint_def_foreign_key7607); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:733:24: (ids+= commented_id )+
			int cnt172=0;
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==ID) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// PLSQLPrinter_DDL.g:733:24: ids+= commented_id
					{
					pushFollow(FOLLOW_commented_id_in_out_of_line_constraint_def_foreign_key7611);
					ids=gPLSQLPrinter.commented_id();
					state._fsp--;

					if (list_ids==null) list_ids=new ArrayList<Object>();
					list_ids.add(ids.getTemplate());
					}
					break;

				default :
					if ( cnt172 >= 1 ) break loop172;
					EarlyExitException eee = new EarlyExitException(172, input);
					throw eee;
				}
				cnt172++;
			}

			pushFollow(FOLLOW_references_clause_in_out_of_line_constraint_def_foreign_key7614);
			references_clause88=references_clause();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 734:7: -> out_of_line_constraint_def_foreign_key(columns=$idsreferences_clause=$references_clause.st)
			{
				retval.st = templateLib.getInstanceOf("out_of_line_constraint_def_foreign_key",new STAttrMap().put("columns", list_ids).put("references_clause", (references_clause88!=null?((StringTemplate)references_clause88.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "out_of_line_constraint_def_foreign_key"


	public static class invoker_rights_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "invoker_rights_clause"
	// PLSQLPrinter_DDL.g:742:1: invoker_rights_clause : ^( AUTHID_VK ( CURRENT_USER_VK | DEFINER_VK ) ) -> template( \"not implemented: invoker_rights_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.invoker_rights_clause_return invoker_rights_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.invoker_rights_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.invoker_rights_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:743:5: ( ^( AUTHID_VK ( CURRENT_USER_VK | DEFINER_VK ) ) -> template( \"not implemented: invoker_rights_clause\")
			// PLSQLPrinter_DDL.g:743:10: ^( AUTHID_VK ( CURRENT_USER_VK | DEFINER_VK ) )
			{
			match(input,AUTHID_VK,FOLLOW_AUTHID_VK_in_invoker_rights_clause7661); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:743:22: ( CURRENT_USER_VK | DEFINER_VK )
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==CURRENT_USER_VK) ) {
				alt173=1;
			}
			else if ( (LA173_0==DEFINER_VK) ) {
				alt173=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}

			switch (alt173) {
				case 1 :
					// PLSQLPrinter_DDL.g:743:23: CURRENT_USER_VK
					{
					match(input,CURRENT_USER_VK,FOLLOW_CURRENT_USER_VK_in_invoker_rights_clause7664); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:743:39: DEFINER_VK
					{
					match(input,DEFINER_VK,FOLLOW_DEFINER_VK_in_invoker_rights_clause7666); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 744:5: -> template( \"not implemented: invoker_rights_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: invoker_rights_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invoker_rights_clause"


	public static class compiler_parameters_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compiler_parameters_clause"
	// PLSQLPrinter_DDL.g:747:1: compiler_parameters_clause : ^( COMPILER_PARAMETER ^( ASSIGN id= commented_id expression ) ) -> template( \"not implemented: compiler_parameters_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.compiler_parameters_clause_return compiler_parameters_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.compiler_parameters_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.compiler_parameters_clause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope id =null;

		try {
			// PLSQLPrinter_DDL.g:748:5: ( ^( COMPILER_PARAMETER ^( ASSIGN id= commented_id expression ) ) -> template( \"not implemented: compiler_parameters_clause\")
			// PLSQLPrinter_DDL.g:748:10: ^( COMPILER_PARAMETER ^( ASSIGN id= commented_id expression ) )
			{
			match(input,COMPILER_PARAMETER,FOLLOW_COMPILER_PARAMETER_in_compiler_parameters_clause7703); 
			match(input, Token.DOWN, null); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_compiler_parameters_clause7706); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_commented_id_in_compiler_parameters_clause7710);
			id=gPLSQLPrinter.commented_id();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_compiler_parameters_clause7712);
			gPLSQLPrinter.expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 749:5: -> template( \"not implemented: compiler_parameters_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: compiler_parameters_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compiler_parameters_clause"


	public static class call_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "call_spec"
	// PLSQLPrinter_DDL.g:752:1: call_spec : ^( LANGUAGE_VK (declaration= java_spec |declaration= c_spec ) ) -> call_spec(declaration=$declaration.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.call_spec_return call_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.call_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.call_spec_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope declaration =null;

		try {
			// PLSQLPrinter_DDL.g:753:5: ( ^( LANGUAGE_VK (declaration= java_spec |declaration= c_spec ) ) -> call_spec(declaration=$declaration.st))
			// PLSQLPrinter_DDL.g:753:10: ^( LANGUAGE_VK (declaration= java_spec |declaration= c_spec ) )
			{
			match(input,LANGUAGE_VK,FOLLOW_LANGUAGE_VK_in_call_spec7749); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:753:24: (declaration= java_spec |declaration= c_spec )
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==JAVA_VK) ) {
				alt174=1;
			}
			else if ( (LA174_0==C_VK) ) {
				alt174=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}

			switch (alt174) {
				case 1 :
					// PLSQLPrinter_DDL.g:753:26: declaration= java_spec
					{
					pushFollow(FOLLOW_java_spec_in_call_spec7755);
					declaration=java_spec();
					state._fsp--;

					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:753:50: declaration= c_spec
					{
					pushFollow(FOLLOW_c_spec_in_call_spec7761);
					declaration=c_spec();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 754:5: -> call_spec(declaration=$declaration.st)
			{
				retval.st = templateLib.getInstanceOf("call_spec",new STAttrMap().put("declaration", (declaration!=null?((StringTemplate)declaration.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "call_spec"


	public static class java_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "java_spec"
	// PLSQLPrinter_DDL.g:759:1: java_spec : ^( JAVA_VK CHAR_STRING ) -> call_spec_java(name=$CHAR_STRING.text);
	public final PLSQLPrinter_PLSQLPrinter_DDL.java_spec_return java_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.java_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.java_spec_return();
		retval.start = input.LT(1);

		CommonTree CHAR_STRING89=null;

		try {
			// PLSQLPrinter_DDL.g:760:5: ( ^( JAVA_VK CHAR_STRING ) -> call_spec_java(name=$CHAR_STRING.text))
			// PLSQLPrinter_DDL.g:760:10: ^( JAVA_VK CHAR_STRING )
			{
			match(input,JAVA_VK,FOLLOW_JAVA_VK_in_java_spec7802); 
			match(input, Token.DOWN, null); 
			CHAR_STRING89=(CommonTree)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_java_spec7804); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 761:5: -> call_spec_java(name=$CHAR_STRING.text)
			{
				retval.st = templateLib.getInstanceOf("call_spec_java",new STAttrMap().put("name", (CHAR_STRING89!=null?CHAR_STRING89.getText():null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "java_spec"


	public static class c_spec_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "c_spec"
	// PLSQLPrinter_DDL.g:764:1: c_spec : ^( C_VK ( CHAR_STRING )? ( CONTEXT_VK )? ^( LIBRARY_VK commented_id ) ( c_agent_in_clause )? ( c_parameters_clause )? ) -> template( \"not implemented: c_spec\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.c_spec_return c_spec() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.c_spec_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.c_spec_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:765:5: ( ^( C_VK ( CHAR_STRING )? ( CONTEXT_VK )? ^( LIBRARY_VK commented_id ) ( c_agent_in_clause )? ( c_parameters_clause )? ) -> template( \"not implemented: c_spec\")
			// PLSQLPrinter_DDL.g:765:10: ^( C_VK ( CHAR_STRING )? ( CONTEXT_VK )? ^( LIBRARY_VK commented_id ) ( c_agent_in_clause )? ( c_parameters_clause )? )
			{
			match(input,C_VK,FOLLOW_C_VK_in_c_spec7841); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:765:17: ( CHAR_STRING )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==CHAR_STRING) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// PLSQLPrinter_DDL.g:765:17: CHAR_STRING
					{
					match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_c_spec7843); 
					}
					break;

			}

			// PLSQLPrinter_DDL.g:765:30: ( CONTEXT_VK )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==CONTEXT_VK) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// PLSQLPrinter_DDL.g:765:30: CONTEXT_VK
					{
					match(input,CONTEXT_VK,FOLLOW_CONTEXT_VK_in_c_spec7846); 
					}
					break;

			}

			match(input,LIBRARY_VK,FOLLOW_LIBRARY_VK_in_c_spec7850); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_commented_id_in_c_spec7852);
			gPLSQLPrinter.commented_id();
			state._fsp--;

			match(input, Token.UP, null); 

			// PLSQLPrinter_DDL.g:765:69: ( c_agent_in_clause )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==AGENT_VK) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// PLSQLPrinter_DDL.g:765:69: c_agent_in_clause
					{
					pushFollow(FOLLOW_c_agent_in_clause_in_c_spec7855);
					c_agent_in_clause();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:765:88: ( c_parameters_clause )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==PARAMETERS_VK) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// PLSQLPrinter_DDL.g:765:88: c_parameters_clause
					{
					pushFollow(FOLLOW_c_parameters_clause_in_c_spec7858);
					c_parameters_clause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 766:5: -> template( \"not implemented: c_spec\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: c_spec");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "c_spec"


	public static class c_agent_in_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "c_agent_in_clause"
	// PLSQLPrinter_DDL.g:769:1: c_agent_in_clause : ^( AGENT_VK ( expression )+ ) -> template( \"not implemented: c_agent_in_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.c_agent_in_clause_return c_agent_in_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.c_agent_in_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.c_agent_in_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:770:5: ( ^( AGENT_VK ( expression )+ ) -> template( \"not implemented: c_agent_in_clause\")
			// PLSQLPrinter_DDL.g:770:10: ^( AGENT_VK ( expression )+ )
			{
			match(input,AGENT_VK,FOLLOW_AGENT_VK_in_c_agent_in_clause7895); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:770:21: ( expression )+
			int cnt179=0;
			loop179:
			while (true) {
				int alt179=2;
				int LA179_0 = input.LA(1);
				if ( (LA179_0==EXPR||LA179_0==LOGIC_EXPR) ) {
					alt179=1;
				}

				switch (alt179) {
				case 1 :
					// PLSQLPrinter_DDL.g:770:21: expression
					{
					pushFollow(FOLLOW_expression_in_c_agent_in_clause7897);
					gPLSQLPrinter.expression();
					state._fsp--;

					}
					break;

				default :
					if ( cnt179 >= 1 ) break loop179;
					EarlyExitException eee = new EarlyExitException(179, input);
					throw eee;
				}
				cnt179++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 771:5: -> template( \"not implemented: c_agent_in_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: c_agent_in_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "c_agent_in_clause"


	public static class c_parameters_clause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "c_parameters_clause"
	// PLSQLPrinter_DDL.g:774:1: c_parameters_clause : ^( PARAMETERS_VK ( THREE_DOTS | ( expression )+ ) ) -> template( \"not implemented: c_parameters_clause\";
	public final PLSQLPrinter_PLSQLPrinter_DDL.c_parameters_clause_return c_parameters_clause() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.c_parameters_clause_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.c_parameters_clause_return();
		retval.start = input.LT(1);

		try {
			// PLSQLPrinter_DDL.g:775:5: ( ^( PARAMETERS_VK ( THREE_DOTS | ( expression )+ ) ) -> template( \"not implemented: c_parameters_clause\")
			// PLSQLPrinter_DDL.g:775:10: ^( PARAMETERS_VK ( THREE_DOTS | ( expression )+ ) )
			{
			match(input,PARAMETERS_VK,FOLLOW_PARAMETERS_VK_in_c_parameters_clause7934); 
			match(input, Token.DOWN, null); 
			// PLSQLPrinter_DDL.g:775:26: ( THREE_DOTS | ( expression )+ )
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==THREE_DOTS) ) {
				alt181=1;
			}
			else if ( (LA181_0==EXPR||LA181_0==LOGIC_EXPR) ) {
				alt181=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 181, 0, input);
				throw nvae;
			}

			switch (alt181) {
				case 1 :
					// PLSQLPrinter_DDL.g:775:27: THREE_DOTS
					{
					match(input,THREE_DOTS,FOLLOW_THREE_DOTS_in_c_parameters_clause7937); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:775:38: ( expression )+
					{
					// PLSQLPrinter_DDL.g:775:38: ( expression )+
					int cnt180=0;
					loop180:
					while (true) {
						int alt180=2;
						int LA180_0 = input.LA(1);
						if ( (LA180_0==EXPR||LA180_0==LOGIC_EXPR) ) {
							alt180=1;
						}

						switch (alt180) {
						case 1 :
							// PLSQLPrinter_DDL.g:775:38: expression
							{
							pushFollow(FOLLOW_expression_in_c_parameters_clause7939);
							gPLSQLPrinter.expression();
							state._fsp--;

							}
							break;

						default :
							if ( cnt180 >= 1 ) break loop180;
							EarlyExitException eee = new EarlyExitException(180, input);
							throw eee;
						}
						cnt180++;
					}

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 776:5: -> template( \"not implemented: c_parameters_clause\"
			{
				retval.st = new StringTemplate(templateLib, "not implemented: c_parameters_clause");
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "c_parameters_clause"


	public static class parameter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "parameter"
	// PLSQLPrinter_DDL.g:781:1: parameter : ^( PARAMETER parameter_name ( SQL92_RESERVED_IN | OUT_VK | INOUT_VK )* ( type_spec )? ( default_value_part )? ) -> parameter(name=$parameter_name.stis_in=$SQL92_RESERVED_IN != nullis_out=$OUT_VK != nullis_inout=$INOUT_VK != nullis_nocopy=falsetype=$type_spec.stdefault_value_part=$default_value_part.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.parameter_return parameter() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.parameter_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.parameter_return();
		retval.start = input.LT(1);

		CommonTree SQL92_RESERVED_IN91=null;
		CommonTree OUT_VK92=null;
		CommonTree INOUT_VK93=null;
		TreeRuleReturnScope parameter_name90 =null;
		TreeRuleReturnScope type_spec94 =null;
		TreeRuleReturnScope default_value_part95 =null;

		try {
			// PLSQLPrinter_DDL.g:782:5: ( ^( PARAMETER parameter_name ( SQL92_RESERVED_IN | OUT_VK | INOUT_VK )* ( type_spec )? ( default_value_part )? ) -> parameter(name=$parameter_name.stis_in=$SQL92_RESERVED_IN != nullis_out=$OUT_VK != nullis_inout=$INOUT_VK != nullis_nocopy=falsetype=$type_spec.stdefault_value_part=$default_value_part.st))
			// PLSQLPrinter_DDL.g:782:10: ^( PARAMETER parameter_name ( SQL92_RESERVED_IN | OUT_VK | INOUT_VK )* ( type_spec )? ( default_value_part )? )
			{
			match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter7979); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_parameter_name_in_parameter7981);
			parameter_name90=gPLSQLPrinter.parameter_name();
			state._fsp--;

			// PLSQLPrinter_DDL.g:782:37: ( SQL92_RESERVED_IN | OUT_VK | INOUT_VK )*
			loop182:
			while (true) {
				int alt182=4;
				switch ( input.LA(1) ) {
				case SQL92_RESERVED_IN:
					{
					alt182=1;
					}
					break;
				case OUT_VK:
					{
					alt182=2;
					}
					break;
				case INOUT_VK:
					{
					alt182=3;
					}
					break;
				}
				switch (alt182) {
				case 1 :
					// PLSQLPrinter_DDL.g:782:38: SQL92_RESERVED_IN
					{
					SQL92_RESERVED_IN91=(CommonTree)match(input,SQL92_RESERVED_IN,FOLLOW_SQL92_RESERVED_IN_in_parameter7984); 
					}
					break;
				case 2 :
					// PLSQLPrinter_DDL.g:782:56: OUT_VK
					{
					OUT_VK92=(CommonTree)match(input,OUT_VK,FOLLOW_OUT_VK_in_parameter7986); 
					}
					break;
				case 3 :
					// PLSQLPrinter_DDL.g:782:63: INOUT_VK
					{
					INOUT_VK93=(CommonTree)match(input,INOUT_VK,FOLLOW_INOUT_VK_in_parameter7988); 
					}
					break;

				default :
					break loop182;
				}
			}

			// PLSQLPrinter_DDL.g:782:74: ( type_spec )?
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==CUSTOM_TYPE||LA183_0==INTERVAL_DATATYPE||LA183_0==NATIVE_DATATYPE) ) {
				alt183=1;
			}
			switch (alt183) {
				case 1 :
					// PLSQLPrinter_DDL.g:782:74: type_spec
					{
					pushFollow(FOLLOW_type_spec_in_parameter7992);
					type_spec94=gPLSQLPrinter.type_spec();
					state._fsp--;

					}
					break;

			}

			// PLSQLPrinter_DDL.g:782:85: ( default_value_part )?
			int alt184=2;
			int LA184_0 = input.LA(1);
			if ( (LA184_0==DEFAULT_VALUE) ) {
				alt184=1;
			}
			switch (alt184) {
				case 1 :
					// PLSQLPrinter_DDL.g:782:85: default_value_part
					{
					pushFollow(FOLLOW_default_value_part_in_parameter7995);
					default_value_part95=default_value_part();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 783:5: -> parameter(name=$parameter_name.stis_in=$SQL92_RESERVED_IN != nullis_out=$OUT_VK != nullis_inout=$INOUT_VK != nullis_nocopy=falsetype=$type_spec.stdefault_value_part=$default_value_part.st)
			{
				retval.st = templateLib.getInstanceOf("parameter",new STAttrMap().put("name", (parameter_name90!=null?((StringTemplate)parameter_name90.getTemplate()):null)).put("is_in", SQL92_RESERVED_IN91 != null).put("is_out", OUT_VK92 != null).put("is_inout", INOUT_VK93 != null).put("is_nocopy", false).put("type", (type_spec94!=null?((StringTemplate)type_spec94.getTemplate()):null)).put("default_value_part", (default_value_part95!=null?((StringTemplate)default_value_part95.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter"


	public static class default_value_part_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "default_value_part"
	// PLSQLPrinter_DDL.g:788:1: default_value_part : ^( DEFAULT_VALUE expression ) -> default_value_part(expression=$expression.st);
	public final PLSQLPrinter_PLSQLPrinter_DDL.default_value_part_return default_value_part() throws RecognitionException {
		PLSQLPrinter_PLSQLPrinter_DDL.default_value_part_return retval = new PLSQLPrinter_PLSQLPrinter_DDL.default_value_part_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression96 =null;

		try {
			// PLSQLPrinter_DDL.g:789:5: ( ^( DEFAULT_VALUE expression ) -> default_value_part(expression=$expression.st))
			// PLSQLPrinter_DDL.g:789:10: ^( DEFAULT_VALUE expression )
			{
			match(input,DEFAULT_VALUE,FOLLOW_DEFAULT_VALUE_in_default_value_part8085); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_default_value_part8087);
			expression96=gPLSQLPrinter.expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 790:5: -> default_value_part(expression=$expression.st)
			{
				retval.st = templateLib.getInstanceOf("default_value_part",new STAttrMap().put("expression", (expression96!=null?((StringTemplate)expression96.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "default_value_part"

	// Delegated rules



	public static final BitSet FOLLOW_DROP_FUNCTION_in_drop_function48 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_function_name_in_drop_function50 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_FUNCTION_in_alter_function86 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_function_name_in_alter_function88 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_DEBUG_VK_in_alter_function90 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_REUSE_VK_in_alter_function93 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_compiler_parameters_clause_in_alter_function96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_CREATE_FUNCTION_in_create_function_body133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_CREATE_in_create_function_body135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_function_body138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_FUNCTION_NAME_in_create_function_body142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_create_function_body146 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_type_spec_in_create_function_body152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_create_function_body155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_in_create_function_body159 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_invoker_rights_clause_in_create_function_body177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000202000080000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x8000800000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_parallel_enable_clause_in_create_function_body182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000202000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x8000800000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_result_cache_clause_in_create_function_body187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000202000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_DETERMINISTIC_VK_in_create_function_body190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000202000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_PIPELINED_VK_in_create_function_body193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000202000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_USING_MODE_in_create_function_body214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AGGREGATE_VK_in_create_function_body216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_implementation_type_name_in_create_function_body219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_MODE_in_create_function_body254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_call_spec_in_create_function_body256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BODY_MODE_in_create_function_body291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_create_function_body293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARALLEL_ENABLE_VK_in_parallel_enable_clause464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partition_by_clause_in_parallel_enable_clause466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARTITION_VK_in_partition_by_clause503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_partition_by_clause505 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ANY_in_partition_by_clause525 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_HASH_VK_in_partition_by_clause545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COLUMNS_in_partition_by_clause548 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_name_in_partition_by_clause550 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RANGE_VK_in_partition_by_clause573 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COLUMNS_in_partition_by_clause576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_name_in_partition_by_clause578 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_streaming_clause_in_partition_by_clause610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RESULT_CACHE_VK_in_result_cache_clause656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relies_on_part_in_result_cache_clause658 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RELIES_ON_VK_in_relies_on_part695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tableview_name_in_relies_on_part697 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_STREAMING_CLAUSE_in_streaming_clause734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ORDER_in_streaming_clause737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_CLUSTER_VK_in_streaming_clause739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_expression_in_streaming_clause742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COLUMNS_in_streaming_clause745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_name_in_streaming_clause747 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_DROP_PACKAGE_in_drop_package790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_package_name_in_drop_package792 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_BODY_VK_in_drop_package794 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_PACKAGE_in_alter_package831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_package_name_in_alter_package833 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0800000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x8000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_DEBUG_VK_in_alter_package835 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x8000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_REUSE_VK_in_alter_package838 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_PACKAGE_VK_in_alter_package859 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_BODY_VK_in_alter_package861 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SPECIFICATION_VK_in_alter_package863 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_compiler_parameters_clause_in_alter_package867 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_CREATE_PACKAGE_SPEC_in_create_package904 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_package906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_package_name_in_create_package909 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L,0x0000800000000000L,0x0000004000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000380201000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300800L});
	public static final BitSet FOLLOW_invoker_rights_clause_in_create_package911 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L,0x0000004000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000380201000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300800L});
	public static final BitSet FOLLOW_package_obj_spec_in_create_package916 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L,0x0000004000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000380201000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300800L});
	public static final BitSet FOLLOW_CREATE_PACKAGE_BODY_in_create_package984 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_package986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_package_name_in_create_package989 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000819200000000L,0x0000004000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000380200000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300804L});
	public static final BitSet FOLLOW_package_obj_body_in_create_package993 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000819200000000L,0x0000004000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000380200000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300804L});
	public static final BitSet FOLLOW_seq_of_statements_in_create_package996 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
	public static final BitSet FOLLOW_exception_clause_in_create_package999 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_declaration_in_package_obj_spec1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_package_obj_spec1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cursor_declaration_in_package_obj_spec1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exception_declaration_in_package_obj_spec1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_record_declaration_in_package_obj_spec1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_declaration_in_package_obj_spec1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedure_spec_in_package_obj_spec1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_spec_in_package_obj_spec1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pragma_declaration_in_package_obj_spec1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROCEDURE_SPEC_in_procedure_spec1246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_procedure_name_in_procedure_spec1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_procedure_spec1251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_in_procedure_spec1255 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_CALL_MODE_in_procedure_spec1273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_call_spec_in_procedure_spec1275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_SPEC_in_function_spec1325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_function_name_in_function_spec1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000000L,0x0000080000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_type_spec_in_function_spec1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_function_spec1332 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_in_function_spec1336 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_PIPELINED_VK_in_function_spec1352 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_RESULT_CACHE_VK_in_function_spec1355 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_DETERMINISTIC_VK_in_function_spec1358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_procedure_spec_in_package_obj_body1453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_spec_in_package_obj_body1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_package_obj_body1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subtype_declaration_in_package_obj_body1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cursor_declaration_in_package_obj_body1517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exception_declaration_in_package_obj_body1533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_record_declaration_in_package_obj_body1549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_declaration_in_package_obj_body1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_procedure_body_in_package_obj_body1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_function_body_in_package_obj_body1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_create_type_in_package_obj_body1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_PROCEDURE_in_drop_procedure1644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_procedure_name_in_drop_procedure1646 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_PROCEDURE_in_alter_procedure1682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_procedure_name_in_alter_procedure1684 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_DEBUG_VK_in_alter_procedure1686 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_REUSE_VK_in_alter_procedure1689 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_compiler_parameters_clause_in_alter_procedure1692 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_CREATE_PROCEDURE_in_create_procedure_body1729 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_CREATE_in_create_procedure_body1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000100000000L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_procedure_body1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_procedure_name_in_create_procedure_body1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_create_procedure_body1740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_in_create_procedure_body1744 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_invoker_rights_clause_in_create_procedure_body1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000202000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_create_procedure_body_impl_in_create_procedure_body1762 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXTERNAL_VK_in_create_procedure_body_impl1856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_MODE_in_create_procedure_body_impl1878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_call_spec_in_create_procedure_body_impl1880 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BODY_MODE_in_create_procedure_body_impl1901 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_create_procedure_body_impl1903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_TRIGGER_in_drop_trigger1933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trigger_name_in_drop_trigger1935 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_TRIGGER_in_alter_trigger1971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trigger_name_in_alter_trigger1973 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000800L,0x0000000080001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8200000000000000L});
	public static final BitSet FOLLOW_ENABLE_VK_in_alter_trigger1994 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DISABLE_VK_in_alter_trigger1996 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RENAME_VK_in_alter_trigger2017 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trigger_name_in_alter_trigger2019 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEBUG_VK_in_alter_trigger2039 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_REUSE_VK_in_alter_trigger2042 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_compiler_parameters_clause_in_alter_trigger2045 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_CREATE_TRIGGER_in_create_trigger2105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_trigger2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_trigger_name_in_create_trigger2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000006000L,0x1000000080001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_simple_dml_trigger_in_create_trigger2126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000006000L,0x1000000080001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_compound_dml_trigger_in_create_trigger2129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000004000L,0x1000000080001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_non_dml_trigger_in_create_trigger2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000004000L,0x1000000080001000L});
	public static final BitSet FOLLOW_trigger_follows_clause_in_create_trigger2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000004000L,0x0000000080001000L});
	public static final BitSet FOLLOW_ENABLE_VK_in_create_trigger2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_DISABLE_VK_in_create_trigger2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000402000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_trigger_when_clause_in_create_trigger2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000402000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_trigger_body_in_create_trigger2160 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOLLOWS_VK_in_trigger_follows_clause2196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trigger_name_in_trigger_follows_clause2198 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_SQL92_RESERVED_WHEN_in_trigger_when_clause2235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_trigger_when_clause2237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SIMPLE_DML_in_simple_dml_trigger2274 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BEFORE_VK_in_simple_dml_trigger2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_AFTER_VK_in_simple_dml_trigger2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_INSTEAD_VK_in_simple_dml_trigger2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_FOR_EACH_ROW_in_simple_dml_trigger2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_referencing_clause_in_simple_dml_trigger2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_dml_event_clause_in_simple_dml_trigger2290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_DML_in_compound_dml_trigger2326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_referencing_clause_in_compound_dml_trigger2328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_dml_event_clause_in_compound_dml_trigger2331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NON_DML_in_non_dml_trigger2367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BEFORE_VK_in_non_dml_trigger2370 = new BitSet(new long[]{0x0000000000000000L,0x0402004000000000L,0x0000000001000010L,0x0000000000040810L,0x0620000000000040L,0x1000000000002000L,0x0000000000000000L,0x0000000001800000L,0x0000000000000001L,0x0200000000000000L,0x0000202000040000L,0x0000000000000000L,0x0000004000002002L});
	public static final BitSet FOLLOW_AFTER_VK_in_non_dml_trigger2372 = new BitSet(new long[]{0x0000000000000000L,0x0402004000000000L,0x0000000001000010L,0x0000000000040810L,0x0620000000000040L,0x1000000000002000L,0x0000000000000000L,0x0000000001800000L,0x0000000000000001L,0x0200000000000000L,0x0000202000040000L,0x0000000000000000L,0x0000004000002002L});
	public static final BitSet FOLLOW_non_dml_event_in_non_dml_trigger2375 = new BitSet(new long[]{0x0000000000000000L,0x0402004000000000L,0x0000000001000010L,0x0000000000040810L,0x0620000000000040L,0x1000000000002000L,0x0000000000000000L,0x0000000001800000L,0x0000000000000001L,0x0200000000000000L,0x0000202000060000L,0x0000000000000000L,0x0000004000002002L});
	public static final BitSet FOLLOW_DATABASE_VK_in_non_dml_trigger2379 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_schema_name_in_non_dml_trigger2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_SCHEMA_VK_in_non_dml_trigger2384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_VK_in_trigger_body2421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trigger_name_in_trigger_body2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0060000000000000L,0x0000000003000000L,0x0000819200000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000380001000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300800L});
	public static final BitSet FOLLOW_declare_spec_in_trigger_body2425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0060000000000000L,0x0000000003000000L,0x0000819200000000L,0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000380001000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000300800L});
	public static final BitSet FOLLOW_timing_point_section_in_trigger_body2428 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0060000000000000L,0x0000000003000000L});
	public static final BitSet FOLLOW_CALL_VK_in_trigger_body2456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_routine_name_in_trigger_body2458 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_function_argument_in_trigger_body2460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BODY_MODE_in_trigger_body2489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_trigger_body2491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BEFORE_STATEMENT_in_timing_point_section2527 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_timing_point_section2529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BEFORE_EACH_ROW_in_timing_point_section2556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_timing_point_section2558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AFTER_STATEMENT_in_timing_point_section2585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_timing_point_section2587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AFTER_EACH_ROW_in_timing_point_section2614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_timing_point_section2616 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ALTER_in_non_dml_event2651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANALYZE_VK_in_non_dml_event2676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSOCIATE_VK_in_non_dml_event2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_STATISTICS_VK_in_non_dml_event2703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUDIT_VK_in_non_dml_event2728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_VK_in_non_dml_event2753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_CREATE_in_non_dml_event2778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISASSOCIATE_VK_in_non_dml_event2803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_STATISTICS_VK_in_non_dml_event2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_DROP_in_non_dml_event2830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_GRANT_in_non_dml_event2855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOAUDIT_VK_in_non_dml_event2880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RENAME_VK_in_non_dml_event2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_REVOKE_in_non_dml_event2930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUNCATE_VK_in_non_dml_event2955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DDL_VK_in_non_dml_event2980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTUP_VK_in_non_dml_event3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHUTDOWN_VK_in_non_dml_event3030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DB_ROLE_CHANGE_VK_in_non_dml_event3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOGON_VK_in_non_dml_event3080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOGOFF_VK_in_non_dml_event3105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERVERERROR_VK_in_non_dml_event3130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUSPEND_VK_in_non_dml_event3155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATABASE_VK_in_non_dml_event3180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCHEMA_VK_in_non_dml_event3205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOLLOWS_VK_in_non_dml_event3230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DML_EVENT_in_dml_event_clause3265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dml_event_element_in_dml_event_clause3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ON_in_dml_event_clause3271 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tableview_name_in_dml_event_clause3273 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_dml_event_nested_clause_in_dml_event_clause3275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DML_EVENT_ELEMENT_in_dml_event_element3315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_DELETE_in_dml_event_element3318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_INSERT_in_dml_event_element3320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_UPDATE_in_dml_event_element3322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COLUMNS_in_dml_event_element3326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_name_in_dml_event_element3328 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_NESTED_VK_in_dml_event_nested_clause3366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tableview_name_in_dml_event_nested_clause3368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REFERENCING_VK_in_referencing_clause3404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_referencing_element_in_referencing_clause3406 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0010000040000000L});
	public static final BitSet FOLLOW_NEW_VK_in_referencing_element3444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OLD_VK_in_referencing_element3446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PARENT_VK_in_referencing_element3448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_alias_in_referencing_element3451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_TYPE_in_drop_type3492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_name_in_drop_type3494 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_BODY_VK_in_drop_type3496 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_FORCE_VK_in_drop_type3499 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_VALIDATE_VK_in_drop_type3502 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_TYPE_in_alter_type3539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_name_in_alter_type3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2C00000000000000L,0x0000000000000000L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_REPLACE_VK_in_alter_type3562 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OBJECT_MEMBERS_in_alter_type3565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_spec_in_alter_type3567 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_invoker_rights_clause_in_alter_type3571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_ATTRIBUTE_in_alter_type3593 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_VK_in_alter_type3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_MODIFY_VK_in_alter_type3598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SQL92_RESERVED_DROP_in_alter_type3600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_ATTRIBUTES_in_alter_type3604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_attribute_definition_in_alter_type3606 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ALTER_METHOD_in_alter_type3629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_alter_method_element_in_alter_type3631 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_alter_collection_clauses_in_alter_type3652 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_modifier_clause_in_alter_type3671 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMPILE_VK_in_alter_type3691 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SPECIFICATION_VK_in_alter_type3694 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_BODY_VK_in_alter_type3696 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_DEBUG_VK_in_alter_type3700 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_REUSE_VK_in_alter_type3703 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_compiler_parameters_clause_in_alter_type3706 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_dependent_handling_clause_in_alter_type3737 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_METHOD_ELEMENT_in_alter_method_element3785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ADD_VK_in_alter_method_element3788 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000480000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_SQL92_RESERVED_DROP_in_alter_method_element3790 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000480000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_map_order_function_spec_in_alter_method_element3793 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_subprogram_spec_in_alter_method_element3796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATTRIBUTE_in_attribute_definition3833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_attribute_name_in_attribute_definition3835 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000000L,0x0000080000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_type_spec_in_attribute_definition3837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_COLLECTION_in_alter_collection_clauses3874 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_VK_in_alter_collection_clauses3895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_spec_in_alter_collection_clauses3897 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIMIT_VK_in_alter_collection_clauses3918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_alter_collection_clauses3920 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEPENDENT_HANDLING_in_dependent_handling_clause3981 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INVALIDATE_VK_in_dependent_handling_clause4001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CASCADE_VK_in_dependent_handling_clause4021 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONVERT_VK_in_dependent_handling_clause4049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SQL92_RESERVED_NOT_in_dependent_handling_clause4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_INCLUDING_VK_in_dependent_handling_clause4079 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXCEPTIONS_VK_in_dependent_exceptions_part4179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FORCE_VK_in_dependent_exceptions_part4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_tableview_name_in_dependent_exceptions_part4184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CREATE_TYPE_BODY_in_create_type4222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_CREATE_in_create_type4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_type4227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_type_name_in_create_type4230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_type_body_elements_list_in_create_type4232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CREATE_TYPE_SPEC_in_create_type4280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_CREATE_in_create_type4282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_type4285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_type_name_in_create_type4288 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_CHAR_STRING_in_create_type4290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_object_type_def_in_create_type4293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_BODY_ELEMENTS_in_type_body_elements_list4353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_body_elements_in_type_body_elements_list4355 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000480000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_OBJECT_TYPE_DEF_in_object_type_def4393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_object_as_part_in_object_type_def4396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_object_under_part_in_object_type_def4398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_invoker_rights_clause_in_object_type_def4401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_sqlj_object_type_in_object_type_def4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_modifier_clause_in_object_type_def4422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_OBJECT_MEMBERS_in_object_type_def4426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_spec_in_object_type_def4430 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_OBJECT_AS_in_object_as_part4532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OBJECT_VK_in_object_as_part4562 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_varray_type_def_in_object_as_part4603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_nested_table_type_def_in_object_as_part4644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNDER_VK_in_object_under_part4714 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_spec_in_object_under_part4716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NESTED_TABLE_TYPE_DEF_in_nested_table_type_def4752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_spec_in_nested_table_type_def4754 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_SQL92_RESERVED_NULL_in_nested_table_type_def4756 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_table_indexed_by_part_in_nested_table_type_def4759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_JAVA_VK_in_sqlj_object_type4837 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sqlj_object_type4839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SQLDATA_VK_in_sqlj_object_type4842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CUSTOMDATUM_VK_in_sqlj_object_type4844 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ORADATA_VK_in_sqlj_object_type4846 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_map_order_func_declaration_in_type_body_elements4882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprog_decl_in_type_in_type_body_elements4907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAP_VK_in_map_order_func_declaration4943 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ORDER_in_map_order_func_declaration4945 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_create_function_body_in_map_order_func_declaration4948 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MEMBER_VK_in_subprog_decl_in_type4985 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATIC_VK_in_subprog_decl_in_type4987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_create_procedure_body_in_subprog_decl_in_type5007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_create_function_body_in_subprog_decl_in_type5026 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_constructor_declaration_in_subprog_decl_in_type5045 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTRUCTOR_VK_in_constructor_declaration5104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_spec_in_constructor_declaration5106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000010000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_FINAL_VK_in_constructor_declaration5108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_INSTANTIABLE_VK_in_constructor_declaration5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_constructor_declaration5115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_elements_parameter_in_constructor_declaration5117 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_CALL_MODE_in_constructor_declaration5140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_call_spec_in_constructor_declaration5142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BODY_MODE_in_constructor_declaration5163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_constructor_declaration5165 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODIFIER_in_modifier_clause5229 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_NOT_in_modifier_clause5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000010000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_INSTANTIABLE_VK_in_modifier_clause5235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FINAL_VK_in_modifier_clause5237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OVERRIDING_VK_in_modifier_clause5239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXTERNAL_VK_in_sqlj_object_type_attr5276 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sqlj_object_type_attr5278 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELEMENT_SPEC_in_element_spec5314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_spec_options_in_element_spec5316 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000400000L,0x0040000000000000L,0x0000000000000000L,0x0000800480000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_modifier_clause_in_element_spec5319 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_pragma_clause_in_element_spec5322 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subprogram_spec_in_element_spec_options5358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_spec_in_element_spec_options5383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_order_function_spec_in_element_spec_options5408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELD_SPEC_in_element_spec_options5434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_element_spec_options5436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000000L,0x0000080000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_type_spec_in_element_spec_options5438 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_sqlj_object_type_attr_in_element_spec_options5440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MEMBER_VK_in_subprogram_spec5478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATIC_VK_in_subprogram_spec5480 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_procedure_spec_in_subprogram_spec5500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_function_spec_in_subprogram_spec5519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTRUCTOR_SPEC_in_constructor_spec5578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_spec_in_constructor_spec5580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000010000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_FINAL_VK_in_constructor_spec5582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_INSTANTIABLE_VK_in_constructor_spec5585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_PARAMETERS_in_constructor_spec5589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_elements_parameter_in_constructor_spec5591 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_constructor_call_mode_in_constructor_spec5595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_MODE_in_constructor_call_mode5632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_call_spec_in_constructor_call_mode5634 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAP_VK_in_map_order_function_spec5671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ORDER_in_map_order_function_spec5673 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_function_spec_in_map_order_function_spec5676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRAGMA_VK_in_pragma_clause5712 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_pragma_elements_in_pragma_clause5714 = new BitSet(new long[]{0x0000000000000008L,0x0040000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_commented_id_in_pragma_elements5750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_DEFAULT_in_pragma_elements5775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_in_type_elements_parameter5810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_name_in_type_elements_parameter5812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000000000000L,0x0000080000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_type_spec_in_type_elements_parameter5814 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_SEQUENCE_in_drop_sequence5855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sequence_name_in_drop_sequence5857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ALTER_SEQUENCE_in_alter_sequence5893 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sequence_name_in_alter_sequence5895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000080000L,0x0000100000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000020000000L,0x0000010100000000L,0x00000000000004CAL});
	public static final BitSet FOLLOW_sequence_spec_in_alter_sequence5897 = new BitSet(new long[]{0x0000000000000008L,0x0000000000002000L,0x0000000000080000L,0x0000100000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000020000000L,0x0000010100000000L,0x00000000000004CAL});
	public static final BitSet FOLLOW_CREATE_SEQUENCE_in_create_sequence5934 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sequence_name_in_create_sequence5936 = new BitSet(new long[]{0x0000000000000008L,0x0000000000002000L,0x0000000000080000L,0x0000100000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000020000000L,0x0000010100000000L,0x00000000000004CAL});
	public static final BitSet FOLLOW_sequence_spec_in_create_sequence5938 = new BitSet(new long[]{0x0000000000000008L,0x0000000000002000L,0x0000000000080000L,0x0000100000000000L,0x0008000000000000L,0x0000000000000000L,0x0000000020000000L,0x0000010100000000L,0x00000000000004CAL});
	public static final BitSet FOLLOW_PLSQL_RESERVED_START_in_sequence_spec5977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sequence_spec5979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCREMENT_VK_in_sequence_spec6006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAXVALUE_VK_in_sequence_spec6035 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINVALUE_VK_in_sequence_spec6064 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6066 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CACHE_VK_in_sequence_spec6093 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_sequence_spec6095 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOMAXVALUE_VK_in_sequence_spec6121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMINVALUE_VK_in_sequence_spec6146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CYCLE_VK_in_sequence_spec6171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOCYCLE_VK_in_sequence_spec6196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOCACHE_VK_in_sequence_spec6221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_ORDER_in_sequence_spec6246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOORDER_VK_in_sequence_spec6271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_VIEW_in_create_view6311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REPLACE_VK_in_create_view6323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_create_view_force_clause_in_create_view6336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_view_name_in_create_view6349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000000020L});
	public static final BitSet FOLLOW_view_type_clause_in_create_view6361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_subquery_in_create_view6374 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_subquery_restriction_clause_in_create_view6386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOFORCE_in_create_view_force_clause6493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORCE_VK_in_create_view_force_clause6509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_view_type_constraints_clause_in_view_type_clause6538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VIEW_TYPE_CONSTRAINTS_in_view_type_constraints_clause6593 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_view_type_constraints_clause_item_in_view_type_constraints_clause6597 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_view_type_constraint_item_inline_in_view_type_constraints_clause_item6635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_out_of_line_constraint_clause_in_view_type_constraints_clause_item6651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VIEW_TYPE_CONSTRAINT_ITEM_INLINE_in_view_type_constraint_item_inline6679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_view_type_constraint_item_inline6683 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_inline_constraint_clause_in_view_type_constraint_item_inline6687 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_INLINE_CONSTRAINT_CLAUSE_in_inline_constraint_clause6732 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_inline_constraint_clause6736 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000200004000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L,0x0000800040000000L});
	public static final BitSet FOLLOW_inline_constraint_def_in_inline_constraint_clause6739 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000208000100CL,0x0000000002000000L,0x0000000000000000L,0x0000000000084800L,0x0100000000000000L,0x0000000000000000L,0x0000000000000000L,0x0140000000000000L});
	public static final BitSet FOLLOW_constraint_state_item_in_inline_constraint_clause6743 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000208000100CL,0x0000000002000000L,0x0000000000000000L,0x0000000000084800L,0x0100000000000000L,0x0000000000000000L,0x0000000000000000L,0x0140000000000000L});
	public static final BitSet FOLLOW_inline_constraint_null_in_inline_constraint_def6801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inline_constraint_not_null_in_inline_constraint_def6813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inline_constraint_unique_in_inline_constraint_def6825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inline_constraint_primary_key_in_inline_constraint_def6837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_references_clause_in_inline_constraint_def6849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checks_clause_in_inline_constraint_def6861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_NULL_in_inline_constraint_null6877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_NULL_in_inline_constraint_not_null6889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_UNIQUE_in_inline_constraint_unique6901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMARY_KEY_in_inline_constraint_primary_key6913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REFERENCES_CLAUSE_in_references_clause6932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tableview_name_in_references_clause6934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_commented_id_in_references_clause6938 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_references_on_delete_clause_in_references_clause6941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ON_DELETE_in_references_on_delete_clause6986 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_on_delete_clause_action_in_references_on_delete_clause6988 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CASCADE_VK_in_on_delete_clause_action7025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_NULL_in_on_delete_clause_action7039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_CHECK_in_checks_clause7067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_checks_clause7069 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_DEFERRABLE_in_constraint_state_item7106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFERRABLE_VK_in_constraint_state_item7120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMMEDIATE_VK_in_constraint_state_item7134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFERRED_VK_in_constraint_state_item7148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELY_VK_in_constraint_state_item7162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NORELY_VK_in_constraint_state_item7176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_using_index_clause_in_constraint_state_item7190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENABLE_VK_in_constraint_state_item7202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISABLE_VK_in_constraint_state_item7216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALIDATE_VK_in_constraint_state_item7230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOVALIDATE_VK_in_constraint_state_item7244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exceptions_clause_in_constraint_state_item7258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_INDEX_in_using_index_clause7284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_using_index_def_in_using_index_clause7286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_tableview_name_in_using_index_def7319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCEPTIONS_VK_in_exceptions_clause7358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tableview_name_in_exceptions_clause7360 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OUT_OF_LINE_CONSTRAINT_in_out_of_line_constraint_clause7398 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_out_of_line_constraint_clause7402 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_out_of_line_constraint_def_in_out_of_line_constraint_clause7405 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000208000100CL,0x0000000002000000L,0x0000000000000000L,0x0000000000084800L,0x0100000000000000L,0x0000000000000000L,0x0000000000000000L,0x0140000000000000L});
	public static final BitSet FOLLOW_constraint_state_item_in_out_of_line_constraint_clause7409 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000208000100CL,0x0000000002000000L,0x0000000000000000L,0x0000000000084800L,0x0100000000000000L,0x0000000000000000L,0x0000000000000000L,0x0140000000000000L});
	public static final BitSet FOLLOW_out_of_line_constraint_def_unique_in_out_of_line_constraint_def7463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_out_of_line_constraint_def_primary_key_in_out_of_line_constraint_def7475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_out_of_line_constraint_def_foreign_key_in_out_of_line_constraint_def7487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checks_clause_in_out_of_line_constraint_def7499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQL92_RESERVED_UNIQUE_in_out_of_line_constraint_def_unique7525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_out_of_line_constraint_def_unique7529 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_PRIMARY_KEY_in_out_of_line_constraint_def_primary_key7568 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_out_of_line_constraint_def_primary_key7572 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_FOREIGN_KEY_in_out_of_line_constraint_def_foreign_key7607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_out_of_line_constraint_def_foreign_key7611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_references_clause_in_out_of_line_constraint_def_foreign_key7614 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AUTHID_VK_in_invoker_rights_clause7661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CURRENT_USER_VK_in_invoker_rights_clause7664 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEFINER_VK_in_invoker_rights_clause7666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPILER_PARAMETER_in_compiler_parameters_clause7703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGN_in_compiler_parameters_clause7706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_compiler_parameters_clause7710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_expression_in_compiler_parameters_clause7712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LANGUAGE_VK_in_call_spec7749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_java_spec_in_call_spec7755 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_c_spec_in_call_spec7761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_JAVA_VK_in_java_spec7802 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CHAR_STRING_in_java_spec7804 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_C_VK_in_c_spec7841 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CHAR_STRING_in_c_spec7843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_CONTEXT_VK_in_c_spec7846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LIBRARY_VK_in_c_spec7850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_commented_id_in_c_spec7852 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_c_agent_in_clause_in_c_spec7855 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_c_parameters_clause_in_c_spec7858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AGENT_VK_in_c_agent_in_clause7895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_c_agent_in_clause7897 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_PARAMETERS_VK_in_c_parameters_clause7934 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_THREE_DOTS_in_c_parameters_clause7937 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_c_parameters_clause7939 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_PARAMETER_in_parameter7979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_name_in_parameter7981 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L,0x0000000000000000L,0x0004000000000000L,0x0000000000000002L,0x0000088000000000L,0x0040000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_SQL92_RESERVED_IN_in_parameter7984 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L,0x0000000000000000L,0x0004000000000000L,0x0000000000000002L,0x0000088000000000L,0x0040000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_OUT_VK_in_parameter7986 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L,0x0000000000000000L,0x0004000000000000L,0x0000000000000002L,0x0000088000000000L,0x0040000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_INOUT_VK_in_parameter7988 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L,0x0000000000000000L,0x0004000000000000L,0x0000000000000002L,0x0000088000000000L,0x0040000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_type_spec_in_parameter7992 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_default_value_part_in_parameter7995 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEFAULT_VALUE_in_default_value_part8085 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_default_value_part8087 = new BitSet(new long[]{0x0000000000000008L});
}
