package dev.mior.esconsultorio.util;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Set;

/**
 *
 * @author Mior
 */
public final class Criptografar {
    
    private static final Charset CHARSET = Charset.forName("UTF-8");
    
    public static String MD5(String string) {
        return diggest(string, "MD5");
    }
    
    public static String MD2(String string) {
        return diggest(string, "MD2");
    }
    
    public static String SHA1(String string) {
        return diggest(string, "SHA-1");
    }
         
    public static String SHA224(String string) {
        return diggest(string, "SHA-224");
    }
    
    public static String SHA256(String string) {
        return diggest(string, "SHA-256");
    }
        
    public static String SHA384(String string) {
        return diggest(string, "SHA-384");
    }
        
    public static String SHA512(String string) {
        return diggest(string, "SHA-512");
    }
    
    public static String encrypt(String string, String algorithm) {
        return diggest(string, algorithm);
    }
    
    public static Set<String> listOfAlgorithms() {
        return Security.getAlgorithms("MessageDigest");
    }
    
    private static String diggest(String string, String algorithm) {
        try {
            MessageDigest m = MessageDigest.getInstance(algorithm);
            byte[] input = string.getBytes(CHARSET);
            byte[] result = m.digest(input);
            return new BigInteger(1, result).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}