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
    public static byte[] hexStringToByteArray(String hexString){
    byte[] bytes = new byte[hexString.length() / 2];

    for(int i = 0; i < hexString.length(); i += 2){
        String sub = hexString.substring(i, i + 2);
        Integer intVal = Integer.parseInt(sub, 16);
        bytes[i / 2] = intVal.byteValue();
        String hex = "".format("0x%x", bytes[i / 2]);
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

}
