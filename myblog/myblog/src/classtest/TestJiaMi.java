package classtest;

import Encryption.Base64;
import Encryption.Md5;
import dao.UserDao;
import empty.User;

public class TestJiaMi {
	public static void main(String[] args){
		String src = "g!o@u#c$h%a^o&";
		System.out.println(Md5.md5Encode(src));
	}
}
