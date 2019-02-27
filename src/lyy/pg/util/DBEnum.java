/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.util;

/**
 *
 * @author Liu Yuanyuan
 */
public enum DBEnum
{
    PostgreSQL, Oracle;

    public enum ArgType
    {
        DB,
        Service, SID
    }

    public enum DBObject
    {
        Schema, Table,
        Sequence, View, Index,
        Procedure, Function,
        Trigger, Package,PackageBody, MView, DBLink, Synonym
    }

    public enum TabObject
    {
        COLUMN, CONSTRAINT_MAIN, CONSTRAINT_COLUMN, CONSTRAINT_CHECKCONDITION, CONSTRAINT_RCOLUMN,
        TABLE_COMMENT, COLUMN_COMMENT
    }

    /* for table and data migrate mode */
    public enum TableMode
    {
        Generally, OnlyStruc, OnlyData,
    }
    public enum DataMode
    {
        Copy, Insert
    }

    /* migrate progress */
    public enum MigrateStatus
    {

        Start, Suspend, Continue, Stop // from front UI
        , Finish //from back controller
    }

    public static final String NotCompare = "";
    public static final String NotApplicable = "N/A";//comparator content compare
    public static final String Infinity = "infinity";
    public static final String Failed = "Failed";

}
