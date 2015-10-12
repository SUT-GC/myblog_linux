package Encryption;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {
	public static String base64Encoder(String src) {
		BASE64Encoder encoder = new BASE64Encoder();
		String result = null;
		result = encoder.encode(src.getBytes());
		return result;
	}

	public static String base64Decoder(String src) {
		String result = null;
		byte[] resultbytes;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			resultbytes = decoder.decodeBuffer(src);
			result = new String(resultbytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
