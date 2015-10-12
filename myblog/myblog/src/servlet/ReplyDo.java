package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReplyDao;

/**
 * Servlet implementation class ReplyDo
 */
@WebServlet(name="replyDo", urlPatterns={"/ReplyDo"})
public class ReplyDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyDo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out = response.getWriter();
		
		int msg = 0;
		if(request.getParameter("deletereplyid") != null){
			msg = ReplyDao.deleteReplyByReplyID(Integer.parseInt(request.getParameter("deletereplyid")));
		}
		if(msg == 1){
			response.sendRedirect("jsp/back/back_reply.jsp");
		}else{
			out.println("<h1>删除失败，请返回上一个页面</h1>");
			out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
		}
	}

}
