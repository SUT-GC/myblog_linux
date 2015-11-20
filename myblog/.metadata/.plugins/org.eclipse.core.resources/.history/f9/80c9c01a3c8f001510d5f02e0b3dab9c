package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JournalDao;
import empty.Journal;

/**
 * Servlet implementation class EditJournalRelease
 */
@WebServlet(name = "editJournalRelease", urlPatterns = {"/EditJournalRelease" })
public class EditJournalRelease extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditJournalRelease() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 将requelt和response转码为utf-8
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * result1的0表示正常，1表示插入是格式不匹配 即代表article_private_pass输入了非数字串
		 * result2代表执行JournalDao.updateJournal(Journal journal)方法，-1代表执行sql异常或没有执行sql，0代表执行更新操作没有改动数据库，1代表更新成功
		 */
		int result1 = 0;
		int result2 = -1;
		
		
		/*
		 * 創建Journal對象，且將request帶來的值付給此對象
		 */
		Journal journal = new Journal();
		journal.setTitle(request.getParameter("new_title"));
		journal.setAuthor(request.getParameter("new_author"));

		/*
		 * 将接收进来的的summary中所有的'<'转为'&lt';
		 */
		String article_summary = "";
		article_summary = request.getParameter("new_summary").replace("<", "&lt");
		journal.setSummary(article_summary);

		/*
		 * 将接收进来的文章内容中所有的'<'转换成'&lt';
		 */
		String article_content = "";
		article_content = request.getParameter("new_content");
		article_content = article_content.replace("<", "&lt");
		System.out.println(article_content);
		journal.setContent(article_content);
		journal.setClassify(Integer.parseInt(request.getParameter("new_classify")));
		journal.setImgpath(request.getParameter("article_image"));
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
		System.out.println(journal);

		/*
		 * 因为request.getParameter("old_id") 得到的是id+" ";
		 * 用String的split方法将id截开并且取出" "之前的数转为int
		 * 调用JournalDao的updateJournal(Journal journal)方法更新数据库
		 */
		String[] old_idS;
		old_idS = request.getParameter("old_id").split(" ");
		int old_idI = Integer.parseInt(old_idS[0]);
		journal.setJournal_id(old_idI);
		result2 = JournalDao.updateJournal(journal);
		

		// 判斷返回值，如果無誤，轉回日志發布頁面，否則跳到錯誤頁面
		if (result2 == 1 && result1 != 1) {
			response.sendRedirect("jsp/back/back_journal_admin.jsp");
		} else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>");
			out.println("</title></head><body>");
			out.println("<h1>修改失敗</h1>");
			if(result2 == 0)
				out.println("<h1>没有对数据库进行改动</h1>");
			if (result2 == -1)
				out.println("<h1>没有执行sql或执行异常</h1>");
			if (result1 == 1)
				out.println("<h1>密码不能为非数字字符</h1>");
			out.println("<a href=\"javascript:history.go(-1)\">返回日志修改頁面</a>");
			out.println("</body></html>");
		}

	}

}
