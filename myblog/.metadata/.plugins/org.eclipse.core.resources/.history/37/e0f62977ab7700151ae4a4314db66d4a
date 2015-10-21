package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Data {
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection conn;
	private Statement stmt;

	public DB_Data(String datebase) {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/"+datebase+"?useUnicode=true&characterEncoding=utf-8";
		user = "root";
		password = "gc";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Statement getStmt() {
		return stmt;
	}
	

}
