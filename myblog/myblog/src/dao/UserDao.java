package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Encryption.Md5;
import empty.User;

public class UserDao {

	/*
	 * 定义对象db_date, stmt 
	 * db_date:用来装数据库连接对象 
	 * stmt:用数据库连接对象制造出stmt
	 */
	private static DB_Data db_date;
	private static Statement stmt;

	/*
	 * 静态初始化框初始化db_date,stmt两个对象
	 */
	static {
		db_date = new DB_Data("wb");
		stmt = db_date.getStmt();
	}

	/*
	 * 功能:想表wb_user中插入数据 
	 * sql: insert wb_user (user_email, user_pass, user_nick,user_imagepath, user_isadmin)
	 *	values("gc@qq.com", "123", "gc", "111","1");
	 * 函数名:insertUser 参数:User user 
	 * 返回值:int result
	 *  -2：未执行插入操纵 
	 *  -1:插入时出现异常
	 * 0:插入失败 
	 * 1:插入成功 
	 * else:插入操作条数不止1
	 */
	public static int insertUser(User user) {
		int result = -2;
		String sql = "insert wb_user (user_email, user_pass, user_nick, user_imagepath, user_isadmin)" + "values ('"
				+ user.getUser_email() + "', '" + Md5.md5Encode(user.getUser_pass()) + "', '" + user.getUser_nick() + "', '"
				+ user.getUser_imagepath() + "','" + user.getUser_isadmin() + "');";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			result = -1;
		}
		return result;
	}

	/*
	 * 功能:查询表wb_user，并且将所有的数据查询并且全部返回 
	 * sql: select * from wb_user 函数名: selectUser
	 * 参数:无 
	 * 返回值: ArrayList<User> list 
	 * null:如果没有搜索到结果，则返回null
	 */
	public static ArrayList<User> selectUser() {
		ArrayList<User> list = new ArrayList<>();
		String sql = "select * from wb_user";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				User user = new User();
				user.setUser_id(rs.getInt(1));
				user.setUser_email(rs.getString(2));
				user.setUser_pass(rs.getString(3));
				user.setUser_nick(rs.getString(4));
				user.setUser_imagepath(rs.getString(5));
				user.setUser_isadmin(rs.getInt(6));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/*
	 * 功能:能完成按user_id查询表wb_user的功能,并返回一个User对象 
	 * sql: select * from wb_user where
	 * user_id = 'id';
	 * 函数名:selectUserByID 
	 * 参数:int user_id; 
	 * 返回值:User user;
	 * null:没有找到该id的user;
	 */
	public static User selectUserByID(int user_id) {
		User user = null;
		String sql = "select * from wb_user where user_id = '" + user_id + "';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setUser_id(rs.getInt(1));
				user.setUser_email(rs.getString(2));
				user.setUser_pass(rs.getString(3));
				user.setUser_nick(rs.getString(4));
				user.setUser_imagepath(rs.getString(5));
				user.setUser_isadmin(rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	/*
	 * 功能:根据user_email查询用户信息
	 * sql: select * from wb_user where user_email = 'gc@qq.com';
	 * 方法名: selectUserByEmail
	 * 参数: String email
	 * 返回值: User user
	 * null: 没有查到
	 */
	public static User selectUserByEmail(String email){
		User  user = null;
		String sql = "select * from wb_user where user_email = '"+email+"';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				user = new User();
				user.setUser_id(rs.getInt(1));
				user.setUser_email(rs.getString(2));
				user.setUser_pass(rs.getString(3));
				user.setUser_nick(rs.getString(4));
				user.setUser_imagepath(rs.getString(5));
				user.setUser_isadmin(rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	/*
	 * 功能: 根据user_id删除记录
	 * sql: delete from wb_user where user_id = '1'
	 * 函数名: deleteUser
	 * 参数: int user_id
	 * 返回值: int result
	 * -1:没有执行sql或者执行错误
	 * 0: 执行sql且受影响行数为0
	 * 1:执行sql且受影响函数为1
	 */
	public static int deleteUser(int user_id){
		int result = -1;
		String sql = "delete from wb_user where user_id = '"+user_id+"';";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 作用:根据user_id查询并且更新数据库
	 * sql: update wb_user set user_email = '123',user_pass='123', user_nick='123', user_imagepath='123',user_isadmin='1' where user_id = '1';
	 * 函数名: updateUser
	 * 参数: User user
	 * 返回值: int result
	 * -1:没有执行sql或者执行错误
	 * 0: 执行sql且受影响行数为0
	 * 1:执行sql且受影响函数为1
	 */
	public static int updateUser(User user){
		int result = 1;
		String sql = "update wb_user set "
						+ "user_email = '"+user.getUser_email()+"',"
						+ "user_pass='"+Md5.md5Encode(user.getUser_pass())+"',"
						+ "user_nick='"+user.getUser_nick()+"',"
						+ "user_imagepath='"+user.getUser_imagepath()+"',"
						+ "user_isadmin='" +user.getUser_isadmin()+"'"
						+ "where user_id = '"+user.getUser_id()+"';";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 无参数构造器
	 */
	public UserDao() {

	}

}
