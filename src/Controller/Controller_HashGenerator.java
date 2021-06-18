package Controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller_HashGenerator {

    public String generateMD5(String text) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md5.digest(text.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            String hasText = no.toString(16);
            while (hasText.length() < 32) {
                hasText = "0" + hasText;
            }
            return hasText;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controller_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
