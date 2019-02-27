package lyy.pg.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Liu Yuanyuan
 */
public class StreamUtil
{

    public static void close(Writer writer)
    {
        try
        {
            if (writer != null)
            {
                writer.close();
            }
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void close(OutputStream os)
    {
        try
        {
            if (os != null)
            {
                os.close();
            }
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void close(Reader reader)
    {
        try
        {
            if (reader != null)
            {
                reader.close();
            }
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static void close(InputStream is)
    {
        try
        {
            if (is != null)
            {
                is.close();
            }
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }
}
