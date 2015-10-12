package classtest;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class TestZhengZe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String src;
		while(sc.hasNextLine()){
			src = sc.nextLine();
			System.out.println(src.matches("^[a-z0-9A-Z]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.)(com|cn|org|net|gov)"));
//			System.out.println("~"+(src.split(" ").length == 0 || src.equals(""))+"~");
//			int[] a = new int[0];
//			System.out.println(a);
		}
	}

}
