package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;

import Encryption.Base64;
import empty.Journal;

public class JournalDao {
	private static Statement stmt;

	/*
	 * 1
	 * 插入wb_article表函数 接受journal参数，把journal相关数据插入到数据库里
	 * 插入之间判断journal里title属性，summary属性，content属性是否为空 如果为空，分别返回2,3,4
	 * 如果插入成功，会返回有效插入的条数 如果插入故障，返回5
	 */
	public static int journalInsert(Journal journal) {
		if (journal.getTitle().equals("")) {
			return 2;
		} else if (journal.getSummary().equals("")) {
			return 3;
		} else if (journal.getContent().equals("")) {
			return 4;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int a = 0;
		journal.setTitle(Base64.base64Encoder(journal.getTitle()));
		journal.setSummary(Base64.base64Encoder(journal.getSummary()));
		journal.setContent(Base64.base64Encoder(journal.getContent()));
		String sql = "insert into " + "wb_article(article_title, article_author, "
				+ "article_content, article_summary, article_classify,"
				+ "article_image, article_date, article_private_is, article_private_pass, article_visit)" + "values('"
				+ journal.getTitle() + "','" + journal.getAuthor() + "','" + journal.getContent() + "','"
				+ journal.getSummary() + "','" + journal.getClassify() + "','" + journal.getImgpath() + "','"
				+ sdf.format(journal.getDatetime()) + "','" + journal.getPrivate_is() + "','"
				+ journal.getPrivate_pass() + "','0')";
		System.out.println("sql = "+ sql);
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			a = stmt.executeUpdate(sql);
			System.out.println(a);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return 5;
		}
		return a;
	}

	/*
	 * 2
	 * select *from wb_article 查询函数
	 * 返回ArrayList<Journal> list 返回查询的结果
	 */
	public static ArrayList<Journal> journalSelect() {
		ArrayList<Journal> list = new ArrayList<>();
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from wb_article order by article_id desc");
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(Base64.base64Decoder(rs.getString(2)));
				journal.setAuthor(rs.getString(3));
				journal.setContent(Base64.base64Decoder(rs.getString(4)));
				journal.setSummary(Base64.base64Decoder(rs.getString(5)));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				journal.setArticle_visit(rs.getInt(11));
				list.add(journal);
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/*
	 * 3
	 * 功能: 根据classify查询不同类型的Journal
	 * sql: select * from wb_article where article_classify = '1';
	 * 方法名: selectJournalByClassify
	 * 参数名: int classify
	 * 返回值: ArrayList <Journal> list
	 */
	public static ArrayList<Journal> selectJournalByClassify(int classify){
		ArrayList<Journal> list =new ArrayList<Journal>();
		String sql = "select * from wb_article where article_classify = '"+classify+"' order by article_id desc;";
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(Base64.base64Decoder(rs.getString(2)));
				journal.setAuthor(rs.getString(3));
				journal.setContent(Base64.base64Decoder(rs.getString(4)));
				journal.setSummary(Base64.base64Decoder(rs.getString(5)));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				journal.setArticle_visit(rs.getInt(11));
				list.add(journal);
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 4
	 * 功能: 模糊查询文章标题
	 * sql: select * from wb_article where article_title like '%s%';
	 * 方法名: selectJournalLikeTitle
	 * 参数:String title;
	 * 返回值: ArrayList <Journal>
	 */
	public static ArrayList<Journal> selectJournalLikeTitle(String title){
		ArrayList<Journal> list = new ArrayList<>();
		String sql = "select * from wb_article where article_title like '%"+title+"%' order by article_id desc;";
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(Base64.base64Decoder(rs.getString(2)));
				journal.setAuthor(rs.getString(3));
				journal.setContent(Base64.base64Decoder(rs.getString(4)));
				journal.setSummary(Base64.base64Decoder(rs.getString(5)));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				journal.setArticle_visit(rs.getInt(11));
				list.add(journal);
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 5
	 * sql: select * from wb_article where article_id = id; 
	 * 函数名 selectByID 参数int
	 * id 返回值 Journal的一个对象
	 */
	public static Journal selectByID(int id) {
		Journal journal = null;
		String sql = "select * from wb_article where article_id = " + id;
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				journal = new Journal();
				journal.setJournal_id(id);
				journal.setTitle(Base64.base64Decoder(rs.getString(2)));
				journal.setAuthor(rs.getString(3));
				journal.setContent(Base64.base64Decoder(rs.getString(4)));
				journal.setSummary(Base64.base64Decoder(rs.getString(5)));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getDate(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				journal.setArticle_visit(rs.getInt(11));
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return journal;
	}

	/*
	 * 6
	 * sql: delete from wb_article where article_id = id; 
	 * 函数名字 deleteJournal 参数
	 * int id 返回值，删除之后的结果 1
	 */
	public static int deleteJournal(int id) {
		int result = 0;
		String sql = "delete  from wb_article where article_id = " + id;
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			return result;
		}
		return result;
	}
	
	/*
	 * 7
	 * 作用:根据article_id 来更新wb_article中的数据
	 * sql:update wb_article set article_title = '123', article_author = '123', article_content = '123', article_summary = '123', article_classify = '123', article_image='123', article_date='2015-01-01 23:20', article_private_is ='1', article_private_pass='123' where article_id = '0';
	 * 函数名: updateJournal
	 * 参数:Journal journal
	 * 返回值:int result
	 * 0:更新失败,受影响0行
	 * 1:更新成功，受影响1行
	 * -1:执行sql语句失败
	 */
	public static int updateJournal(Journal journal){
		journal.setTitle(Base64.base64Encoder(journal.getTitle()));
		journal.setSummary(Base64.base64Encoder(journal.getSummary()));
		journal.setContent(Base64.base64Encoder(journal.getContent()));
		
		//把Date对象进行格式转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int result = -1;
		String sql = "update wb_article set "
							+ "article_title = '"+journal.getTitle()+"',"
							+ "article_author = '"+journal.getAuthor()+"',"
							+ "article_content = '"+journal.getContent()+"',"
							+ "article_summary = '"+journal.getSummary()+"',"
							+ "article_classify = '"+journal.getClassify()+"',"
							+ " article_image = '"+journal.getImgpath()+"',"
							+ "article_private_is = '"+journal.getPrivate_is()+"',"
							+ "article_private_pass = '"+journal.getPrivate_pass()+"'"
							+ "where article_id = '"+journal.getJournal_id()+"';";
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			System.out.println(result);
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 8
	 * 功能: 把所有journal的imagepath放入HashSet 中
	 * 方法名: getImageSet
	 * 参数: 空
	 * 返回值: HashSet <String> 
	 */
	public static HashSet<String > getImageSet(){
		HashSet <String> imageset = new HashSet<>();
		String sql = "select * from wb_article;";
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String imagepath = rs.getString("article_image");
				imageset.add(imagepath);
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return imageset;
	}
	/*
	 * 9
	 * select *from wb_article 查询函数
	 * 返回ArrayList<Journal> list 返回查询的结果
	 */
	public static ArrayList<Journal> SelectTopJournal5() {
		ArrayList<Journal> list = new ArrayList<>();
		String sql = "select * from wb_article order by article_visit desc limit 0,5;";
		try {
			Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(Base64.base64Decoder(rs.getString(2)));
				journal.setAuthor(rs.getString(3));
				journal.setContent(Base64.base64Decoder(rs.getString(4)));
				journal.setSummary(Base64.base64Decoder(rs.getString(5)));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				journal.setArticle_visit(rs.getInt(11));
				list.add(journal);
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 10
	 * 功能: 统计发表的日志总量
	 * sql : SELECT count( * ) FROM wb_article;
     * 方法名: countJournalSum
     * 参数: 空
     * 返回值: int result;
     */
    public static int countJournalSum(){
    	int result = 0;
    	String sql = "SELECT count( * ) FROM wb_article;";
    	try {
    		Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				result = rs.getInt(1);
			}
			stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
	
    /*
     * 11
     * 功能: 根据article_id来更新article_visit
     * sql:update wb_article set article_visit = '1' where article_id = '0';
     * 方法名: updateArticleVisit
     * 参数: int id ,int num
     * 返回值:int result
     */
    public static int updateArticleVisit(int id,int num){
    	int result = -1;
    	String sql = "update wb_article set article_visit = '"+num+"' where article_id = '"+id+"';";
    	try {
    		Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();
    		
    		result = stmt.executeUpdate(sql);
			
    		stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
    
    /*
     * 12
     * 功能: 计算出总的日志浏览量
     * sql:select sum(article_visit) from wb_article; 
     * 方法名: sumAllArticleVisit
     * 参数: 无
     * 返回值：int result
     */
    public static int sumAllArticleVisit(){
    	int result = -1;
    	String sql = "select sum(article_visit) from wb_article; ";
    	try {
    		Connection conn = DB_Data.createConnection();
    		stmt = conn.createStatement();

    		ResultSet rs = stmt.executeQuery(sql);
    		while(rs.next()){
    			result = rs.getInt(1);
    		}
			
    		stmt.close();
			DB_Data.colseConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return result;
    }
}
