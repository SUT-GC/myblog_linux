package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Encryption.Base64;
import empty.Admin;

public class AdminDao {
    private static DB_Data db_data;
    private static Statement stmt;
    
    static{
    	db_data = new DB_Data("wb");
    	stmt = db_data.getStmt();
    }
    
    /*
     * 功能:查询出wb_admin数据库中所有记录
     * sql:select * from wb_admin;
     * 方法名:selectAdmins
     * 参数:无
     * 返回值:ArrayList<Admin> list
     * null:未查到记录
     */
    public static ArrayList<Admin> selectAdmins(){
    	ArrayList <Admin> list = null;
    	String sql = "select * from wb_admin;";
    	try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Admin admin = new Admin();
				admin.setAdmin_id(rs.getInt(1));
				admin.setAdmin_username(rs.getString(2));
				admin.setAdmin_password(rs.getString(3));
				list.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return list;
    }
    
    /*
     * 功能:根据admin_id查询出一条Admin记录
     * sql:select * from wb_admin where admin_id = '0';
     * 方法名:selectAdminByID
     * 参数:admin_id
     * 返回值:Admin admin
     * null:没查出来任何结果
     */
    public static Admin selectAdminByID(int admin_id){
    	Admin admin = null;
    	String sql = "select * from wb_admin where admin_id = '"+admin_id+"';";
    	ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
	    	while(rs.next()){
	    		admin = new Admin();
	    		admin.setAdmin_id(rs.getInt(1));
	    		admin.setAdmin_username(rs.getString(2));
	    		admin.setAdmin_password(rs.getString(3));
	    	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return admin;
    }
    
    /*
     * 功能:根据admin_username查询出一条Admin记录
     * sql:select * from wb_admin where admin_username = 'gc';
     * 方法名:selectAdminByID
     * 参数:admin_id
     * 返回值:Admin admin
     * null:没查出来任何结果
     */
    public static Admin selectAdminByUsername(String username){
    	Admin admin = null;
    	String sql = "select * from wb_admin where admin_username = '"+username+"';";
    	ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
	    	while(rs.next()){
	    		admin = new Admin();
	    		admin.setAdmin_id(rs.getInt(1));
	    		admin.setAdmin_username(rs.getString(2));
	    		admin.setAdmin_password(rs.getString(3));
	    	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return admin;
    }
    
    /*
     * 功能: 插入一个Admin用户
     * sql: insert wb_admin (admin_username, admin_password) values('tian', 'tian');
     * 方法名: insertAdmin
     * 参数: Admin admin
     * 返回值 int result
     * 0:插入失败
     * 1:插入成功
     */
    public static int insertAdmin(Admin admin){
    	int result = 0;
    	String sql = "insert wb_admin (admin_username, admin_password) values('"+admin.getAdmin_username()+"', '"+admin.getAdmin_password()+"');";
    	try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    /*
     * 功能:根据admin_id更改表中的一条记录
     * sql:update wb_admin set admin_username='Tian', admin_password = '123' where admin_id = '0';
     * 方法名:updateAdminByID
     * 参数: Admin admin
     * 返回值: int result /-1:没有执行sql或者执行失败 0:执行sql且记录更新0条 1:更新成功
     */
    public static int updateAdminByID(Admin admin){
    	int result = -1;
    	String sql = "update wb_admin set "
    			        + "admin_username = '"+admin.getAdmin_username()+"',"
    			        + "admin_password = '"+Base64.base64Encoder(admin.getAdmin_password())+"'"
    			        + "where admin_id = '"+admin.getAdmin_id()+"';";
    	try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    /*
     * 功能:按照传入的admin_id删除相关的记录
     * sql: delete from wb_admin where admin_id = '0';
     * 方法名: deleteAdminByID
     * 参数: int admin_id
     * 返回值: result /-1:没有执行sql或者执行失败 0:执行sql且记录更新0条 1:更新成功
     */
    public static int deleteAdminByID(int admin_id){
    	int result = -1;
    	String sql = "delete from wb_admin where admin_id = '"+admin_id+"';";
    	try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
}
