package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import empty.Reply;

public class ReplyDao {
	private static Statement stmt;

	/*
	 * 静态初始化框
	 */
	static {
		stmt = new DB_Data("wb").getStmt();
	}
	
	/*
	 * 1
	 * 功能: 向wb_reply中插入Reply
	 * sql: insert wb_reply (reply_content, article_id, user_id, reply_date) values('sada', '4', '17', '2015-02-12 13:22:00');
	 * 方法名: insertReply
	 * 参数:Reply reply
	 * 返回值 int result
	 * 1:插入成功
	 * 0:插入失败
	 */
	public static int insertReply(Reply reply){
		int result = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql = "insert wb_reply (reply_content, article_id, user_id, reply_date) values ('"
							+reply.getReplycontent()+"','"
							+reply.getArticleid()+"','"
							+reply.getUserid()+"','"
							+sdf.format(reply.getReplydate())+"');";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 2
	 * 功能: 根据article_id 查询出reply记录
	 * sql: select * from wb_reply where article_id = '28';
	 * 方法名: selectReply
	 * 参数: int articleid
	 * 返回值: ArrayList <Reply> list
	 */
	public static ArrayList<Reply> selectReplyByArticleID(int articleid){
		ArrayList<Reply> list = null;
		String sql = "select * from wb_reply where article_id = '"+articleid+"';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Reply reply = new Reply();
				reply.setReplycontent(rs.getString(2));
				reply.setUserid(rs.getInt(4));
				reply.setArticleid(rs.getInt(3));
				reply.setReplydate(rs.getTimestamp(5));
				list.add(reply);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 3
	 * 功能: 根据article_id 计算出该article的回复数量
	 * sql: select count(*) from wb_reply where article_id = '28'; 
	 * 方法名: countReplyByArticleID
	 * 参数: int articleid
	 * 返回值: int result;
	 */
	public static int countReplyByArticleID(int articleid){
		int result = 0;
		String sql = "select count(*) from wb_reply where article_id = '"+articleid+"'; ";
		 try {
			ResultSet rs  = stmt.executeQuery(sql);
			while(rs.next()){
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 4
	 * 功能: 查询出所有的reply
	 * sql: select * from wb_reply
	 * 方法名: selectReply
	 * 参数: 无
	 * 返回值:ArrayList <Reply> list
	 */
	public static ArrayList<Reply> selectReply(){
		ArrayList<Reply> list = null;
		String sql = "select * from wb_reply;";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Reply reply = new Reply();
				reply.setReplyid(rs.getInt(1));
				reply.setReplycontent(rs.getString(2));
				reply.setUserid(rs.getInt(4));
				reply.setArticleid(rs.getInt(3));
				reply.setReplydate(rs.getTimestamp(5));
				list.add(reply);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 功能: 根据reply_id查询出Reply
	 * sql: select * from wb_reply where reply_id = '1';
	 * 方法名:selectReplyByReplyID
	 * 参数名:int reply_id
	 * 返回值:Reply reply
	 */
	public static Reply selectReplyByReplyID(int replyid){
		Reply reply = null;
			String sql = "select * from wb_reply where reply_id = '"+replyid+"';";
			try {
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					reply = new Reply();
					reply.setReplyid(rs.getInt(1));
					reply.setReplycontent(rs.getString(2));
					reply.setUserid(rs.getInt(4));
					reply.setArticleid(rs.getInt(3));
					reply.setReplydate(rs.getTimestamp(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return reply;
	}
	
	/*
	 * 功能: 根据reply_id删除reply
	 * sql: delete from wb_reply where reply_id = '2';
	 * 方法名: deleteReplyByReplyID
	 * 参数:int replyid
	 * 返回值: int result;
	 * 0:执行失败
	 * 1:执行成功
	 */
	public static int deleteReplyByReplyID(int replyid){
		int result = 0;
		String sql = "delete from wb_reply where reply_id = '"+replyid+"';";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
