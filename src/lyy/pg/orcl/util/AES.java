package lyy.pg.orcl.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Liu Yuanyuan
 */
public class AES
{

    public static void main(String[] args) throws Exception
    {
        String cSrc = "highgo123";
        System.out.println(cSrc);

        String enString = AES.Encrypt(cSrc);
        System.out.println("Encrypt: " + enString);

        String DeString = AES.Decrypt(enString);
        System.out.println("Decrypt: " + DeString);
    }

    private final static String sKey = "1234567890123456";// use AES-128-ECB Encrypt, key must have 16 digit.

    public static String Encrypt(String src) throws Exception
    {
        if (src == null || src.isEmpty())
        {
            return src;
        }
        if (sKey == null || sKey.length() != 16)
        {
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");// "�㷨/ģʽ/���뷽ʽ"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(src.getBytes("utf-8"));
        return (new Base64()).encodeToString(encrypted); // use BASE64 to encode
    }

    public static String Decrypt(String src) throws Exception
    {
        if (src == null || src.isEmpty())
        {
            return src;
        }
        if (sKey == null || sKey.length() != 16)
        {
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");// "�㷨/ģʽ/���뷽ʽ"
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] encrypted1 = new Base64().decode(src); // use base64 to decode
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original, "utf-8");
        return originalString;
    }

}
