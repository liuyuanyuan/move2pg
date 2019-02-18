package lyy.pg.orcl.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liu Yuanyuan
 */
public class DatatypeMapping
{
    //private DB sourceDB;
    private String sourceDatatype;
    private String pgDatatype;
    private List<String> optionalPgDatatypes;

    public DatatypeMapping(String sourceDataType)
    {
        this.sourceDatatype = sourceDataType;
        optionalPgDatatypes = new ArrayList<>();
    }

    public String getSourceDatatype()
    {
        return sourceDatatype;
    }

    public String getPgDatatype()
    {
        return pgDatatype;
    }

    public void setPgDatatype(String hgDataType)
    {
        this.pgDatatype = hgDataType;
    }

    public void addOptionalPgDatatype(String datatype)
    {
        optionalPgDatatypes.add(datatype);
    }

    public List<String> getOptionalPgDatatypes()
    {
        return optionalPgDatatypes;
    }
}
