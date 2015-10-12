package Encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;

public class Md5 {
	public static String md5Encode(String src) {
		String resultS = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] resultB = md.digest(src.getBytes());
			resultS = new String(Hex.encode(resultB));
			System.out.println("ResultS = " + resultS);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return resultS;
	}
}
