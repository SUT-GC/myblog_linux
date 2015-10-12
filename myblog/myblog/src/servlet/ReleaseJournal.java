package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JournalDao;
import empty.Journal;

/**
 * Servlet implementation class ReleaseJournal
 */
@WebServlet(name = "releaseJournal", urlPatterns = { "/ReleaseJournal" })
public class ReleaseJournal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReleaseJournal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 将requelt和response转码为utf-8
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		/*
		 * result1的0表示正常，1表示插入是格式不匹配 即代表article_private_pass输入了非数字串
		 * result2代表插入异常 0:有效记录0条 1:插入成功，有效记录1条 2:title为空 3:summary為空
		 * 4:content為空
		 */
		int result1 = 0;
		int result2 = 0;

		/*
		 * 創建Journal對象，別且將request帶來的值付給此對象
		 */
		Journal journal = new Journal();
		journal.setTitle(request.getParameter("article_title"));
		journal.setAuthor(request.getParameter("article_author"));

		/*
		 * 将接收进来的的summary中所有的'<'转为'&lt';
		 */
		String article_summary = "";
		article_summary = request.getParameter("article_summary").replace("<", "&lt");
		journal.setSummary(request.getParameter("article_summary"));

		/*
		 * 将接收进来的文章内容中所有的'<'转换成'&lt';
		 */
		String article_content = "";
		article_content = request.getParameter("article_content");
		article_content = article_content.replace("<", "&lt");
		System.out.println(article_content);
		journal.setContent(article_content);
		// journal.setContent(request.getParameter("article_content"));

		journal.setClassify(Integer.parseInt(request.getParameter("article_classify")));
		journal.setImgpath("111");
		// 判斷isprivate的值，如果值為1，則private_pass有效，否則無效
		if (request.getParameter("isprivate") != null && request.getParameter("isprivate").equals("1")) {
			journal.setPrivate_is(1);
			if (request.getParameter("private_pass").equals("") || request.getParameter("private_pass") == null) {
				journal.setPrivate_pass(0);
			} else {
				try {
					journal.setPrivate_pass(Integer.parseInt(request.getParameter("private_pass")));
				} catch (Exception e) {
					e.printStackTrace();
					result1 = 1;
				}
			}
		} else {
			journal.setPrivate_is(0);
			journal.setPrivate_pass(-1);
		}
		// 封裝時間，并且輸入journal對象
		journal.setDatetime(new Date());
		
		
		//读取照片的信息
		if(request.getParameter("article_image")!= null){
			if(!request.getParameter("article_image").equals("")){
				journal.setImgpath(request.getParameter("article_image"));
			}else{
				journal.setImgpath("default.jpg");
			}
		}else{
			journal.setImgpath("default.jpg");
		}

		System.out.println(journal);
		// 將journal插入數據庫并且接受返回值
		result2 = JournalDao.journalInsert(journal);

		// 判斷返回值，如果無誤，轉回日志發布頁面，否則跳到錯誤頁面
		if (result2 == 1 && result1 != 1) {
			response.sendRedirect("jsp/back/back_journal_admin.jsp");
		} else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>");
			out.println("</title></head><body>");
			out.println("<h1>發表失敗</h1>");
			if (result1 == 1)
				out.println("<h1>密码不能为非数字字符，但是发表成功。你可以选择修改已发表的文章，也可以重新发表文章</h1>");
			if (result2 == 2)
				out.println("<h1>title不能為空</h1>");
			if (result2 == 3)
				out.println("<h1>summary不能為空</h1>");
			if (result2 == 4)
				out.println("<h1>content不能為空</h1>");
			if (result2 == 0)
				out.println("<h1>添加数据给有效记录为0</h1>");

			out.println("<a href=\"javascript:history.go(-1)\">返回日志發布頁面</a>");
			out.println("</body></html>");
		}
	}

}
