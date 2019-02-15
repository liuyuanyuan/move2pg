package lyy.pg.orcl.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Liu Yuanyuan
 */
public class KeywordFactory
{

    public static void main(String[] args)
    {
		//String objName = "qssAZ";
        //boolean match = objName.matches(".*[^$_0-9A-Z].*");
        //System.out.println(match);
        //String s = "_a01a$a#";
        //System.out.println(s.matches("^[a-z_][a-z0-9_$]*$"));
        String x = "222dd222";
        System.out.println(x.matches(".*(?=(.*[a-z]){1,}).*$"));

        System.out.println(KeywordFactory.getInstance().quotedName2PG("DEFERRABLE", Enum.Oracle));
        System.out.println(KeywordFactory.getInstance().quotedName4Oracle("Tab"));
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final String PgNamePattern = "^[A-Za-z_][A-Za-z0-9_$]*$";
    private final String OracleNamePattern = "^[A-Za-z_][A-Za-z0-9_$#]*$";

    public static KeywordFactory getInstance()
    {
        return InstanceHolder.instance;
    }
    private static class InstanceHolder
    {
        private static KeywordFactory instance = new KeywordFactory();
    }

    // for PG create sql by name from oracle/other db system table
    public String quotedName2PG(String name, Enum dbType)
    {
        //logger.debug("db=" + dbType + ", name=" + name);		
        if (dbType == null || dbType != Enum.Oracle)
        {
            logger.warn("DB type is null or not Oracle, we cannot support.");
            return name;
        }

        if (!name.matches(PgNamePattern))
        {
            name = "\"" + name + "\"";
            logger.debug(name + " not match HgNamePattern");
            return name;
        }

        List<String> objTabColNameKeyWords = getObjTabColNameKeyWords(Enum.PostgreSQL);
        for (String kw : objTabColNameKeyWords)
        {
            //logger.debug("kw=" + kw);
            if (name.equalsIgnoreCase(kw))//or matches()
            {
                name = "\"" + name + "\"";
                logger.info(name + " is ReservedKeyWord");
                return name;
            }
        }

        String hasUpperLowerCasePattern = ".*(?=.*?[A-Z])(?=(.*[a-z]){1,}).*$";
        if (name.matches(hasUpperLowerCasePattern))
        {
            name = "\"" + name + "\"";
            logger.debug(name + " hasUpperLowerCase");
            return name;
        }

        return name;
    }

    // for oracle select sql by name from oracle system table
    public String quotedName4Oracle(String name)
    {
        if (!name.matches(OracleNamePattern))
        {
            name = "\"" + name + "\"";
            logger.debug(name + " not match OracleNamePattern");
            return name;
        }

        List<String> objTabColNameKeyWords = getObjTabColNameKeyWords(Enum.Oracle);
        for (String kw : objTabColNameKeyWords)
        {
            if (name.equalsIgnoreCase(kw))// or matches()
            {
                name = "\"" + name + "\"";
                logger.info(name + " is ReservedKeyWord");
                return name;
            }
        }

        String hasLowerCasePattern = ".*(?=(.*[a-z]){1,}).*$";
        if (name.matches(hasLowerCasePattern))
        {
            name = "\"" + name + "\"";
            logger.debug(name + " hasLowerCase");
            return name;
        }

        return name;
    }

    //for comparator's PG select sql
    public String quotedName4PG(String name)
    {
        if (!name.matches(PgNamePattern))
        {
            name = "\"" + name + "\"";
            logger.debug(name + " not match HgNamePattern");
            return name;
        }

        List<String> objTabColNameKeyWords = getObjTabColNameKeyWords(Enum.PostgreSQL);
        for (int i = 0; i < objTabColNameKeyWords.size(); i++)
        {
            String kw = objTabColNameKeyWords.get(i).toUpperCase();
            if (name.toUpperCase().equals(kw))// or matches()
            {
                name = "\"" + name + "\"";
                logger.info(name + " is ReservedKeyWord");
                return name;
            }
        }

        String hasUpperLowerCasePattern = ".*(?=.*?[A-Z]).*$";
        if (name.matches(hasUpperLowerCasePattern))
        {
            name = "\"" + name + "\"";
            logger.debug(name + " hasUpperCase");
            return name;
        }

        return name;
    }

    // Table/Column/other Object(except Function/Type) name
    private List<String> getObjTabColNameKeyWords(Enum dbType)
    {
        switch (dbType)
        {
            case PostgreSQL:
                return getPGObjTabColNameKeyWords();
            case Oracle:
                return getOracleReservedKeyWords();
            default:
                logger.warn(dbType + " is not supported, do nothing and return empty list.");
                return new ArrayList<>();
        }
    }

    // Type and function Keyword(useless currently because plsqlconver check keyword iteself and type needn's migrate)
    @SuppressWarnings("unused")
    private List<String> getTypeFunNameKeyWords(Enum dbType)
    {
        switch (dbType)
        {
            case PostgreSQL:
                return getPgFunTypeNameKeywords();
            case Oracle:
                return getOracleReservedKeyWords();
            default:
                logger.warn(dbType + " is not supported, do nothing and return empty list.");
                return new ArrayList<>();
        }
    }

    /*
     * Following PG Keywords is based on PG10 (must based on the last version) Doc
     * ref: https://www.postgresql.org/docs/10/static/sql-keywords-appendix.html
     * 
     * HGDB:Table/Column/Object(except Function/Type) name shared same keywords,
     * including: all reserved keyword.
     */
    private List<String> getPGObjTabColNameKeyWords()
    {
        List<String> keywords = new ArrayList<String>();

        getPGOverlapKeyWords(keywords);
        keywords.add("AUTHORIZATION");
        keywords.add("BINARY");
        keywords.add("COLLATION");
        keywords.add("CONCURRENTLY");
        keywords.add("CROSS");
        keywords.add("CURRENT_SCHEMA");
        keywords.add("FREEZE");
        keywords.add("FULL");
        keywords.add("ILIKE");
        keywords.add("INNER");
        keywords.add("IS");
        keywords.add("ISNULL");
        keywords.add("JOIN");
        keywords.add("LEFT");
        keywords.add("LIKE");
        keywords.add("NATURAL");
        keywords.add("NOTNULL");
        keywords.add("OUTER");
        keywords.add("OVERLAPS");
        keywords.add("RIGHT");
        keywords.add("SIMILAR");
        keywords.add("TABLESAMPLE");
        keywords.add("VERBOSE");

        return keywords;
    }
    /*
     * PG:Function/Type name shared same keywords, including: reserved keyword
     * except which can be function or type name, non-reserved keyword which cannot
     * be function or type name.
     */

    private List<String> getPgFunTypeNameKeywords()
    {
        List<String> keywords = new ArrayList<String>();

        getPGOverlapKeyWords(keywords);
        keywords.add("BETWEEN");
        keywords.add("BIGINT");
        keywords.add("BIT");
        keywords.add("BOOLEAN");
        keywords.add("CHAR");
        keywords.add("CHARACTER");
        keywords.add("COALESCE");
        keywords.add("DEC");
        keywords.add("DECIMAL");
        keywords.add("EXISTS");
        keywords.add("EXTRACT");
        keywords.add("FLOAT");
        keywords.add("GREATEST");
        keywords.add("GROUPING");
        keywords.add("INOUT");
        keywords.add("INT");
        keywords.add("INTEGER");
        keywords.add("INTERVAL");
        keywords.add("LEAST");
        keywords.add("NATIONAL");
        keywords.add("NCHAR");
        keywords.add("NONE");
        keywords.add("NULLIF");
        keywords.add("NUMERIC");
        keywords.add("OUT");
        keywords.add("OVERLAY");
        keywords.add("POSITION");
        keywords.add("PRECISION");
        keywords.add("REAL");
        keywords.add("ROW");
        keywords.add("SETOF");
        keywords.add("SMALLINT");
        keywords.add("SUBSTRING");
        keywords.add("TIME");
        keywords.add("TIMESTAMP");
        keywords.add("TREAT");
        keywords.add("TRIM");
        keywords.add("VALUES");
        keywords.add("VARCHAR");
        keywords.add("XMLATTRIBUTES");
        keywords.add("XMLCONCAT");
        keywords.add("XMLELEMENT");
        keywords.add("XMLEXISTS");
        keywords.add("XMLFOREST");
        keywords.add("XMLNAMESPACES");
        keywords.add("XMLPARSE");
        keywords.add("XMLPI");
        keywords.add("XMLROOT");
        keywords.add("XMLSERIALIZE");
        keywords.add("XMLTABLE");

        return keywords;
    }

    private void getPGOverlapKeyWords(List<String> keywords)
    {
        if (keywords == null)
        {
            logger.error("Keyword list is null, do nothing and return.");
            return;
        }

        keywords.add("ALL");
        keywords.add("ANALYSE");
        keywords.add("ANALYZE");
        keywords.add("AND");
        keywords.add("ANY");
        keywords.add("ARRAY");
        keywords.add("AS");
        keywords.add("ASC");
        keywords.add("ASYMMETRIC");
        keywords.add("BOTH");
        keywords.add("CASE");
        keywords.add("CAST");
        keywords.add("CHECK");
        keywords.add("COLLATE");
        keywords.add("COLUMN");
        keywords.add("CONSTRAINT");
        keywords.add("CREATE");
        keywords.add("CURRENT_CATALOG");
        keywords.add("CURRENT_DATE");
        keywords.add("CURRENT_ROLE");
        keywords.add("CURRENT_TIME");
        keywords.add("CURRENT_TIMESTAMP");
        keywords.add("CURRENT_USER");
        keywords.add("DEFAULT");
        keywords.add("DEFERRABLE");
        keywords.add("DESC");
        keywords.add("DISTINCT");
        keywords.add("DO");
        keywords.add("ELSE");
        keywords.add("END");
        keywords.add("EXCEPT");
        keywords.add("FALSE");
        keywords.add("FETCH");
        keywords.add("FOR");
        keywords.add("FOREIGN");
        keywords.add("FROM");
        keywords.add("GRANT");
        keywords.add("GROUP");
        keywords.add("HAVING");
        keywords.add("IN");
        keywords.add("INITIALLY");
        keywords.add("INTERSECT");
        keywords.add("INTO");
        keywords.add("LATERAL");
        keywords.add("LEADING");
        keywords.add("LIMIT");
        keywords.add("LOCALTIME");
        keywords.add("LOCALTIMESTAMP");
        keywords.add("NOT");
        keywords.add("NULL");
        keywords.add("OFFSET");
        keywords.add("ON");
        keywords.add("ONLY");
        keywords.add("OR");
        keywords.add("ORDER");
        keywords.add("PLACING");
        keywords.add("PRIMARY");
        keywords.add("REFERENCES");
        keywords.add("RETURNING");
        keywords.add("SELECT");
        keywords.add("SESSION_USER");
        keywords.add("SOME");
        keywords.add("SYMMETRIC");
        keywords.add("TABLE");
        keywords.add("THEN");
        keywords.add("TO");
        keywords.add("TRAILING");
        keywords.add("TRUE");
        keywords.add("UNION");
        keywords.add("UNIQUE");
        keywords.add("USER");
        keywords.add("USING");
        keywords.add("VARIADIC");
        keywords.add("VERBOSE");
        keywords.add("WHEN");
        keywords.add("WHERE");
        keywords.add("WINDOW");
        keywords.add("WITH");

    }

    /*
     * Following Oracle Keywords is based on Oracle(v11.2.4) sql reserved key words
     * and pl/sql reserved key words Oracle sql
     * doc:https://docs.oracle.com/cd/E11882_01/server.112/e41084/ap_keywd001.htm#
     * SQLRF55621 pl/sql doc:
     * https://docs.oracle.com/cd/E11882_01/appdev.112/e25519/reservewords.htm#
     * LNPLS019
     */
    private List<String> getOracleReservedKeyWords()
    {
        List<String> keywords = new ArrayList<String>();

        // oracle sql reserved key words
        keywords.add("&");// to be decided
        keywords.add("ACCESS");
        keywords.add("ADD");
        keywords.add("ALL");
        keywords.add("ALTER");
        keywords.add("AND");
        keywords.add("ANY");
        keywords.add("AS");
        keywords.add("ASC");
        keywords.add("AUDIT");
        keywords.add("BETWEEN");
        keywords.add("BY");
        keywords.add("CHAR");
        keywords.add("CHECK");
        keywords.add("CLUSTER");
        keywords.add("COLUMN");
        // keywords.add("COLUMN_VALUE");//only reserved for attribute name
        keywords.add("COMMENT");
        keywords.add("COMPRESS");
        keywords.add("CONNECT");
        keywords.add("CREATE");
        keywords.add("CURRENT");
        keywords.add("DATE");
        keywords.add("DECIMAL");
        keywords.add("DEFAULT");
        keywords.add("DELETE");
        keywords.add("DESC");
        keywords.add("DISTINCT");
        keywords.add("DROP");
        keywords.add("ELSE");
        keywords.add("EXCLUSIVE");
        keywords.add("EXISTS");
        keywords.add("FILE");
        keywords.add("FLOAT");
        keywords.add("FOR");
        keywords.add("FROM");
        keywords.add("GRANT");
        keywords.add("GROUP");
        keywords.add("HAVING");
        keywords.add("IDENTIFIED");
        keywords.add("IMMEDIATE");
        keywords.add("IN");
        keywords.add("INCREMENT");
        keywords.add("INDEX");
        keywords.add("INITIAL");
        keywords.add("INSERT");
        keywords.add("INTEGER");
        keywords.add("INTERSECT");
        keywords.add("INTO");
        keywords.add("IS");
        keywords.add("LEVEL");
        keywords.add("LIKE");
        keywords.add("LOCK");
        keywords.add("LONG");
        keywords.add("MAXEXTENTS");
        keywords.add("MINUS");
        keywords.add("MLSLABEL");
        keywords.add("MODE");
        keywords.add("MODIFY");
        // keywords.add("NESTED_TABLE_ID");//only reserved for attribute name
        keywords.add("NOAUDIT");
        keywords.add("NOCOMPRESS");
        keywords.add("NOT");
        keywords.add("NOWAIT");
        keywords.add("NULL");
        keywords.add("NUMBER");
        keywords.add("OF");
        keywords.add("OFFLINE");
        keywords.add("ON");
        keywords.add("ONLINE");
        keywords.add("OPTION");
        keywords.add("OR");
        keywords.add("ORDER");
        keywords.add("PCTFREE");
        keywords.add("PRIOR");
        keywords.add("PRIVILEGES");
        keywords.add("PUBLIC");
        keywords.add("RAW");
        keywords.add("RENAME");
        keywords.add("RESOURCE");
        keywords.add("REVOKE");
        keywords.add("ROW");
        keywords.add("ROWID");// uppercase ROWID never use for column name(even quoted)
        keywords.add("ROWNUM");
        keywords.add("ROWS");
        keywords.add("SELECT");
        keywords.add("SESSION");
        keywords.add("SET");
        keywords.add("SHARE");
        keywords.add("SIZE");
        keywords.add("SMALLINT");
        keywords.add("START");
        keywords.add("SUCCESSFUL");
        keywords.add("SYNONYM");
        keywords.add("SYSDATE");
        keywords.add("TABLE");
        keywords.add("THEN");
        keywords.add("TO");
        keywords.add("TRIGGER");
        keywords.add("UID");
        keywords.add("UNION");
        keywords.add("UNIQUE");
        keywords.add("UPDATE");
        keywords.add("USER");
        keywords.add("VALIDATE");
        keywords.add("VALUES");
        keywords.add("VARCHAR");
        keywords.add("VARCHAR2");
        keywords.add("VIEW");
        keywords.add("WHENEVER");
        keywords.add("WHERE");
        keywords.add("WITH");
        /*
         * //pl/sql reserved key words(can be table or column name) except for those
         * included in sql keywords.add("AT"); keywords.add("BEGIN");
         * keywords.add("CASE"); keywords.add("CLUSTERS"); keywords.add("COLAUTH");
         * keywords.add("COLUMNS"); keywords.add("CRASH"); keywords.add("CURSOR");
         * keywords.add("DECLARE"); keywords.add("END"); keywords.add("EXCEPTION");
         * keywords.add("FETCH"); keywords.add("FUNCTION"); keywords.add("GOTO");
         * keywords.add("IF"); keywords.add("INDEXES"); keywords.add("LIKE");
         * keywords.add("OVERLAPS"); keywords.add("PROCEDURE"); keywords.add("SQL");
         * keywords.add("SUBTYPE"); keywords.add("TABAUTH"); keywords.add("TYPE");
         * keywords.add("VIEWS"); keywords.add("WHEN");
         */

        return keywords;
    }

}
