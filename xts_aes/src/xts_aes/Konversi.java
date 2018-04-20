/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xts_aes;

/**
 *
 * @author Anggi
 */
public class Konversi {
    public static byte[] hexStringToByteArray(String str)
    {
       byte[] bytes = new byte[str.length() / 2];
       for (int i = 0; i < bytes.length; i++)
       {
          bytes[i] = (byte) Integer
                .parseInt(str.substring(2 * i, 2 * i + 2), 16);
       }
       return bytes;
    }

// Convert Byte Arrary to Hex String
    public static String byteArrayTohexString(byte[] b)
    {

     // String Buffer can be used instead

       String hs = "";
       String stmp = "";

       for (int n = 0; n < b.length; n++)
       {
          stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));

          if (stmp.length() == 1)
          {
             hs = hs + "0" + stmp;
          }
          else
          {
             hs = hs + stmp;
          }

          if (n < b.length - 1)
          {
             hs = hs + "";
          }
       }

       return hs;
    }

    static String hexStringToByteArray(byte[] key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
