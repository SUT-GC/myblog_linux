package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MessDao;

/**
 * Servlet implementation class MessageDo
 */
@WebServlet(name="messageDo", urlPatterns={"/MessageDo"})
public class MessageDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageDo() {
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * int result1:
		 * -1:执行sql失败或者没执行sql
		 * 0:数据库受影响行数为0
		 * 1:数据库受影响行数为1
		 * int result2:
		 * -1:未接受到request传来的id
		 * 1:接受到request传来的id
		 */
		int result1 = -1;
		int result2 = -1;
		
		//接受request传来的需要删除的messbox_id
		if(request.getParameter("deletemessid")!=null){
			int messbox_id = Integer.parseInt(request.getParameter("deletemessid"));
			//执行deleteMessByID
			result1 = MessDao.deleteMessByID(messbox_id);
			result2 = 1;
		}
		
		if(result1 == 1 && result2 == 1){
			response.sendRedirect("jsp/back/back_message.jsp");
		}else{
			if(result2 == -1){
				out.println("<h1>未接受到request传来的deletemessid</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else if(result1 == -1){
				out.println("<h1>执行sql失败或者没执行sql</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else if(result1== 0){
				out.println("<h1>数据库受影响行数为0</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else{
				out.println("<h1>执行出错，错误不在可预估的result值当中</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}
		}
	}

}
