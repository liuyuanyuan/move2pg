package lyy.pg.model;

import lyy.pg.util.DBEnum.DataMode;
import lyy.pg.util.DBEnum.TableMode;

/*
 * @author Liu Yuanyuan
 * for table and data
 */
public class MigrateMode
{
    
    private TableMode tableMode;
    private DataMode dataMode;

    //private int threadBatch;
    private int insertBatch;

    private int copyBatch;
    private String copyQuoter;
    private String copySeperator;

    public MigrateMode(TableMode tableMode, DataMode dataMode,
            //int threadBatch,
            int insertBatch,
            int copyBatch, String copyQuoter, String copySeperator)
    {
        this.tableMode = tableMode;
        this.dataMode = dataMode;

        //this.threadBatch = threadBatch;
        this.insertBatch = insertBatch;

        this.copyBatch = copyBatch;
        this.copyQuoter = copyQuoter;
        this.copySeperator = copySeperator;
    }

    public TableMode getTableMode()
    {
        return tableMode;
    }

    public DataMode getDataMode()
    {
        return dataMode;
    }

    public int getInsertBatch()
    {
        return insertBatch;
    }

    public int getCopyBatch()
    {
        return copyBatch;
    }

    public String getCopyQuoter()
    {
        return copyQuoter;
    }

    public String getCopySeperator()
    {
        return copySeperator;
    }
}
