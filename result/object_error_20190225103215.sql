 -- Errors -- 
2019-02-25 10:32:16 Error Create Table:CREATE TABLE LYY.CLOB1(ID TEXT,TXT TEXT);
错误: 关系 "clob1" 已经存在
2019-02-25 10:32:16 Error Migrate Defination for Table:LYY.CLOB1
org.postgresql.util.PSQLException: 错误: 关系 "clob1" 已经存在
2019-02-25 10:32:16 Error Create Table:CREATE TABLE LYY.CLOB2(ID TEXT,TXT TEXT,IMAGE TEXT);
错误: 关系 "clob2" 已经存在
2019-02-25 10:32:16 Error Migrate Defination for Table:LYY.CLOB2
org.postgresql.util.PSQLException: 错误: 关系 "clob2" 已经存在
2019-02-25 10:32:16 Couldn't Batch Insert Data, then insert row by row.
SQLException: 22023 未设定参数值 3 的内容。
2019-02-25 10:32:16 Error batch2PerRowInsert:
 Exception: 无效的列类型: getString not implemented for class oracle.jdbc.driver.T4CBlobAccessor
2019-02-25 10:32:17 Error Create Table:CREATE TABLE LYY.CLOB3(ID TEXT,TXT TEXT);
错误: 关系 "clob3" 已经存在
2019-02-25 10:32:17 Error Migrate Defination for Table:LYY.CLOB3
org.postgresql.util.PSQLException: 错误: 关系 "clob3" 已经存在
