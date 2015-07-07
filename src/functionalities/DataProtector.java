/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalities;

import java.security.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;

/**
 *
 * @author Ushan
 */
public class DataProtector {

    private static final String ALGORITHM = "AES";
    //need 17 bytes arry
    private static final byte[] keyValue = new byte[]{'e', 'r', 's', 'h', 'a', 'd', 'i', 's', 'a', 'y', 'u', 'r', 'i', 'j', 'a', 'y'};

    //salt may be a various value
    //value of ITERATIONS must be less than 30
    public String encrypt(String value, String salt, int ITERATIONS) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.ENCRYPT_MODE, key);

        String valueToEnc;
        String eValue = value;
        for (int i = 0; i < ITERATIONS; i++) {
            valueToEnc = salt + eValue;
            byte[] encValue = c.doFinal(valueToEnc.getBytes());
            eValue = new BASE64Encoder().encode(encValue);
        }
        return eValue;
    }

    public String decrypt(String value, String salt, int ITERATIONS) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.DECRYPT_MODE, key);

        String dValue = null;
        String valueToDecrypt = value;
        for (int i = 0; i < ITERATIONS; i++) {
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(valueToDecrypt);
            byte[] decValue = c.doFinal(decordedValue);
            dValue = new String(decValue).substring(salt.length());
            valueToDecrypt = dValue;
        }
        return dValue;
    }

    private Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }
}
