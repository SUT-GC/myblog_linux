package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import empty.Journal;

public class JournalDao {
	private static Statement stmt;

	/*
	 * 静态初始化框
	 */
	static {
		stmt = new DB_Data("wb").getStmt();
	}

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
		String sql = "insert into " + "wb_article(article_title, article_author, "
				+ "article_content, article_summary, article_classify,"
				+ "article_image, article_date, article_private_is, article_private_pass)" + "values('"
				+ journal.getTitle() + "','" + journal.getAuthor() + "','" + journal.getContent() + "','"
				+ journal.getSummary() + "','" + journal.getClassify() + "','" + journal.getImgpath() + "','"
				+ sdf.format(journal.getDatetime()) + "','" + journal.getPrivate_is() + "','"
				+ journal.getPrivate_pass() + "')";

		try {
			a = stmt.executeUpdate(sql);
			System.out.println(a);
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
	public static ArrayList journalSelect() {
		ArrayList<Journal> list = new ArrayList<>();
		try {
			ResultSet rs = stmt.executeQuery("select * from wb_article order by article_id desc");
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				list.add(journal);
			}
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
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				list.add(journal);
			}
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
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				list.add(journal);
			}
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
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				journal = new Journal();
				journal.setJournal_id(id);
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getDate(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
			}

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
			result = stmt.executeUpdate(sql);
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
							+ "article_date = '"+sdf.format(journal.getDatetime())+"',"
							+ "article_private_is = '"+journal.getPrivate_is()+"',"
							+ "article_private_pass = '"+journal.getPrivate_pass()+"'"
							+ "where article_id = '"+journal.getJournal_id()+"';";
		try {
			result = stmt.executeUpdate(sql);
			System.out.println(result);
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
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String imagepath = rs.getString("article_image");
				imageset.add(imagepath);
			}
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
	public static ArrayList SelectTopJournal5() {
		ArrayList<Journal> list = new ArrayList<>();
		String sql = "select * from wb_article order by article_id desc limit 0,5;";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				list.add(journal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
