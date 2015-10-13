package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import empty.Message;

public class MessDao {
	private static DB_Data db_data;
	private static Statement stmt;
	static{
		db_data = new DB_Data("wb");
		stmt = db_data.getStmt();
	}
	
	/*
	 * 1
	 * 功能: 查出所有的留言记录
	 * sql: select * from wb_messbox;
	 * 函数名:selectMess
	 * 参数: 无
	 * 返回值: ArrayList <Message>
	 */
	public static ArrayList<Message> selectMess(){
		ArrayList<Message> list = null;
		String sql = "select * from wb_messbox;";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 2
	 * 功能: 按照messbox_id搜索留言记录
	 * sql: select * from wb_messbox where messbox_id = '0';
	 * 方法名: selectMessByID
	 * 参数:int messbox_id
	 * 返回值: Message message
	 * null:为搜索到任何留言记录
	 */
	public static Message selectMessByID(int messbox_id){
		Message message  = null;
		String sql = "select * from wb_messbox where messbox_id = '"+messbox_id+"';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return message;
	}
	
	/*
	 * 3
	 * 功能:根据messbox_id删除留言记录
	 * sql: delete from wb_messbox where messbox_id = '3';
	 * 方法名: deleteMessByID
	 * 参数:int messbox_id
	 * 返回值: int result
	 * -1:执行sql失败或者没执行sql
	 * 0:数据库受影响行数为0
	 * 1:数据库受影响行数为1
	 */
	public static int deleteMessByID(int messbox_id){
		int result = -1;
		String sql ="delete from wb_messbox where messbox_id = '"+messbox_id+"';";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 4
	 * 功能: 查询出所有留言为一级留言的记录(按照floor_id倒叙)
	 * sql: select * from wb_messbox where touser_id = '0' order by floor_id desc;
	 * 方法名: selectMessTouseridIsFloor
	 * 参数: 空
	 * 返回值: ArrayList <Message> list;
	 * null: 没有记录
	 */
	public static ArrayList <Message> selectMessTouseridIsFloor(){
		ArrayList<Message> list = null;
		String sql = "select * from wb_messbox where touser_id = '0' order by floor_id desc;";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 5
	 * 功能: 计算出所有以及留言的总数
	 * sql: select count(*) from wb_messbox where touser_id = '0';
	 * 方法名: countFirstMess
	 * 参数: 无
	 * 返回值: int sum;
	 */
	public static int countFirstMess(){
		int sum = 0;
		String sql = "select count(*) from wb_messbox where touser_id = '0';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				sum = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sum;
	}
	
	/*
	 * 6
	 * 功能: 根据传入的范围，查询出该范围的记录
	 * sql : select * from wb_messbox where touser_id = '0' order by floor_id desc limit 0,5;
	 * 方法名: selectMessByLimit
	 * 参数 : int start, int end
	 * 返回值: ArrayList<Message> list
	 * null: 未查到
	 */
	public static ArrayList<Message> selectMessByLimit(int start, int end){
		ArrayList<Message> list = null;
		String sql ="select * from wb_messbox where touser_id = '0' order by floor_id desc limit "+start+" , "+end;
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 7
	 * 功能: 查出某一楼层的一级message
	 * sql: select *from wb_messbox where floor_id = '3' and touser_id = '0';
	 * 函数名: selectFirstMessByFloor
	 * 参数: int floor_id
	 * 返回值: ArrayList<Message> list
	 * null: 未查到
	 */
	public static ArrayList<Message> selectFirstMessByFloor(int floor_id){
		ArrayList<Message> list = null;
		String sql = "select *from wb_messbox where floor_id = '"+floor_id+"' and touser_id = '0';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 8
	 * 功能: 查出对某一级留言的回复
	 * sql : select * from wb_messbox where floor_id = '3' and touser_id <> '0' order by messbox_date;
	 * 方法名: selectSecoundMessByFloor
	 * 参数: int floor_id
	 * 返回值: ArrayList<Message> list
	 * null: 未查到
	 */
	public static ArrayList<Message> selectSecoundMessByFloor(int floor_id){
		ArrayList<Message> list = null;
		String sql = "select * from wb_messbox where floor_id = '"+floor_id+"' and touser_id <> '0' order by messbox_date;";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 功能: 插入新的一级留言记录
	 * sql: insert into wb_messbox (floor_id,user_id,touser_id,messbox_reply,messbox_date) values ('15','17','0','你好啊','2015-10-5 16:33:20'); 
	 * 方法名: insertMess
	 * 参数: Message message
	 * 返回值: int result;
	 * -1:没执行sql或者执行sql错误
	 * 0:数据库受影响0行
	 * 1:数据库受影响1行
	 */
	public static int insertMess(Message message){
		int result =-1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql = "insert into wb_messbox (floor_id,user_id,touser_id,messbox_reply,messbox_date) values ('"
						+message.getFloor_id()+"', '"
						+message.getUser_id()+"', '"
						+message.getTouser_id()+"', '"
						+message.getMessbox_reply()+"','"
						+sdf.format(message.getMessbox_date())+"');";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
