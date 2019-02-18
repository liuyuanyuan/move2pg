/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyy.pg.orcl.util;

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
        Trigger, Package, MView, DBLink, Synonym
    }

    public enum TabObject
    {
        COLUMN, CONSTRAINT_MAIN, CONSTRAINT_COLUMN, CONSTRAINT_CHECKCONDITION, CONSTRAINT_RCOLUMN,
        TABLE_COMMENT, COLUMN_COMMENT
    }

}
