package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Encryption.Base64;
import dao.AdminDao;
import empty.Admin;

/**
 * Servlet implementation class AdminDo
 */
@WebServlet(name="adminDo", urlPatterns={"/AdminDo"})
public class AdminDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDo() {
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
		// 将requelt和response转码为utf-8
	    request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//创建页面输出对象
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		/*
		 * result1 :执行deleteAdminByID 所得的返回值
		 * -1:没有执行sql或者执行失败 0:执行sql且记录更新0条 1:更新成功
		 * result2 :执行updateAdminByID 所得的返回值
		 * -1:没有执行sql或者执行失败 0:执行sql且记录更新0条 1:更新成功
		 */
		int result1 = -1;
		int result2 = -1;
		
		if(request.getParameter("do") != null && request.getParameter("do").equals("delete") && request.getParameter("deleteid") != null ){
			int deleteid = Integer.parseInt(request.getParameter("deleteid"));
			result1 = AdminDao.deleteAdminByID(deleteid);
		}
		
		if(request.getParameter("new_admin_id")!=null && request.getParameter("new_admin_username")!=null && request.getParameter("new_admin_password")!=null){
			Admin admin = new Admin();
			admin.setAdmin_id(Integer.parseInt(request.getParameter("new_admin_id")));
			admin.setAdmin_username(request.getParameter("new_admin_username"));
			admin.setAdmin_password(request.getParameter("new_admin_password"));
			result2 = AdminDao.updateAdminByID(admin);
		}
		
		if(result1 == 1){
			response.sendRedirect("jsp/back/back_admin_information.jsp");
		}else{
			if(result1 == -1)
			    out.println("<h1>delete时没有执行sql或者执行失败</h1>");
			if(result1 == 0)
			    out.println("<h1>delete时执行sql且记录更新0条</h1>");
			out.println("<a href=\"javascript:history.go(-1)\">返回admin管理界面</a>");
		}
		
		if(result2 == 1){
			response.sendRedirect("jsp/back/back_admin_information.jsp");
		}else{
			if(result2 == -1)
			    out.println("<h1>update时没有执行sql或者执行失败</h1>");
			if(result2 == 0)
			    out.println("<h1>update时执行sql且记录更新0条</h1>");
			out.println("<a href=\"javascript:history.go(-1)\">返回编辑界面</a>");
		}
	}

}
