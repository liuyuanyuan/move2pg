package lyy.pg.orcl.util;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Liu Yuanyuan
 *
 */
public class ReportUtil
{

    private static final Logger logger = LogManager.getLogger(ObjectUtil.class);
    private final static SimpleDateFormat Time4FileName = new SimpleDateFormat("yyyyMMddHHmmss");
    private final static String ReportRoot = new File("").getAbsoluteFile() + File.separator + "Reports" + File.separator;

    static
    {
        File reportRootFolder = new File(ReportRoot);
        if (!reportRootFolder.exists())
        {
            logger.warn("Report Root Folder doesn't exist then create: " + ReportRoot);
            logger.debug("mkdirs=" + reportRootFolder.mkdirs());
        }
    }

    public static String createMigrateReport(String schema, String rows) throws Exception
    {
        String fileName;
        BufferedWriter bwResport = null;
        try
        {
            fileName = ReportRoot + "MigrateReport_" + Time4FileName.format(new Date()) + ".html";
            bwResport = new BufferedWriter(new FileWriter(fileName));
            writeLog(bwResport, ContentBefore.replace("SchemaName", schema) + rows + ContentAfter);
            openFile(fileName);
        } catch (Exception ex)
        {
            throw ex;
        } finally
        {
            StreamUtil.close(bwResport);
        }
        return fileName;
    }

    private static synchronized void writeLog(BufferedWriter bw, String content) throws Exception
    {
        try
        {
            bw.write(content);
            bw.newLine();//pw.println();
            bw.flush();
        } catch (Exception ex)
        {
            throw ex;
        }
    }

    private static void openFile(String pathResult) throws IOException
    {
        try
        {
            Desktop.getDesktop().open(new File(pathResult));
        } catch (IOException ex)
        {
            throw ex;
        }
    }

    public final static String RowFormat
            = "<tr>\n"
            + " <td>no</td>\n"
            + " <td>name</td>\n"
            + " <td>migrateResult</td>\n"
            + " <td>compareResult</td>\n"
            + " <td>syncResult</td>\n"
            + "</tr>\n";

    private static final String ContentBefore
            = "<!DOCTYPE html>\n"
            + "<html>\n"
            + "    <head>\n"
            + "        <title>report</title>\n"
            + "        <meta charset=\"utf-8\"> "
            + "        <style type=\"text/css\">\n"
            + "        table { \n"
            + "            border-collapse: collapse; \n"
            + "            /*font-family: Futura, Arial, sans-serif;**/\n"
            + "            font-size:medium;\n"
            + "        } \n"
            + "        caption {\n"
            + "            font-size: large; \n"
            + "            margin: 1em auto; \n"
            + "        } \n"
            + "        th,td { \n"
            + "            padding: .65em; \n"
            + "        }\n"
            + "        th {\n"
            + "            /*background: #555 nonerepeat scroll 0 0;*/\n"
            + "            border: 1px solid #777; \n"
            + "            background-color: #555;\n"
            + "            color: #fff; \n"
            + "        } \n"
            + "        td {\n"
            + "            border: 1px solid #777;\n"
            + "        }\n"
            + "        </style>\n"
            + "    </head>    \n"
            + "    <body>\n"
            + "        <!--<H2>迁移结果报告</H2>-->\n"
            + "        <table>\n"
            + "            <caption>迁移结果报告(schema: SchemaName) </caption>\n"
            + "            \n"
            + "            <thead>\n"
            + "            <tr align='center'>\n"
            + "                <th>序号</th>\n"
            + "                <th>表名</th>\n"
            + "                <th>迁移结果</th>\n"
            + "                <th>比对结果</th>\n"
            + "                <th>同步结果</th>\n"
            + "            </tr>\n"
            + "            </thead>\n"
            + "\n"
            + "            <tbody>\n";

    private static final String ContentAfter
            = "            </tbody>            \n"
            + "        </table>\n"
            + "    </body>\n"
            + "</html>";

}
