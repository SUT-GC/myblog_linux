package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Data {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static Connection conn;

	static {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/wb?useUnicode=true&characterEncoding=utf-8";
		user = "root";
		password = "gc";
		try {
			if(conn == null){
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConn(){
		return conn;
	}

}
