package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JournalDao;
import empty.Journal;

/**
 * Servlet implementation class JournalEditOrDelete
 */
@WebServlet(name = "journalEditOrDelete", urlPatterns = { "/JournalEditOrDelete" })
public class JournalEditOrDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JournalEditOrDelete() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String journalDo = request.getParameter("do");
		String journalID = request.getParameter("id");
		int r = 0;
		/*
		 * 如果journalDo为edit，则跳转到back_journal_edit.jsp页面。
		 * 如果是delete，则跳转回 back_journal_admin.jsp页面
		 * 如果不是上面的操作，则跳转错误界面
		 */
		if(journalDo.equals("edit")){
			response.sendRedirect("jsp/back/back_journal_edit.jsp?id="+journalID);
		}else if(journalDo.equals("delete")){
			Journal journal = JournalDao.selectByID(Integer.parseInt(journalID));
			if(!journal.getImgpath().equals("default.jpg")){
				String imagepath = getServletContext().getRealPath("/")+"image"
						+java.io.File.separator+"journalheader"
						+java.io.File.separator+journal.getImgpath();
				File imagefile = new File(imagepath);
				imagefile.delete();
			}
			r = JournalDao.deleteJournal(Integer.parseInt(journalID));
			if(r == 1){
				response.sendRedirect("jsp/back/back_journal_admin.jsp");
			}else {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<html><head><title>");
				out.println("</title></head><body>");
				out.println("<h1>删除失败</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回日志查询頁面</a>");
				out.println("</body></html>");
			}
		}else{
			/*
			 * 如果id属性非edit非delete 则跳转此“错误操作”页面
			 */
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>");
			out.println("</title></head><body>");
			out.println("<h1>操作错误</h1>");
		
			out.println("<a href=\"javascript:history.go(-1)\">返回日志查询頁面</a>");
			out.println("</body></html>");
		}
	}

}
