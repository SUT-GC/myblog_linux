package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Encryption.Base64;
import dao.AdminDao;
import empty.Admin;

/**
 * Servlet implementation class AdminSessionDo
 */
@WebServlet(name="adminSessionDo",urlPatterns={"/AdminSessionDo"})
public class AdminSessionDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSessionDo() {
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
		HttpSession session = request.getSession();
		
		/*
		 * 获取输出流
		 */
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * 接收reqeust带来的值
		 */
		String username = "";
		String password = "";
		
		/*
		 * 接收返回来的错误信息
		 * 0:用户名错误
		 * 1:密码错误
		 * 2:验证成功
		 */
		int msg = 0;
		
		
		if(request.getParameter("username")!=null && request.getParameter("password")!=null){
			username = request.getParameter("username");
			password = request.getParameter("password");
		}
		
		if(AdminDao.selectAdminByUsername(username) != null){
			Admin admin = AdminDao.selectAdminByUsername(username);
			System.out.println("base641="+Base64.base64Encoder(password));
			System.out.println("base642="+admin.getAdmin_password());
			msg = 1;
			if(admin.getAdmin_password().equals(Base64.base64Encoder(password))){
				session.setAttribute("adminuser", admin);
				msg = 2;
			}
		}
		
		if(msg == 2){
			response.sendRedirect("jsp/back/back_index.jsp");
		}else{
			response.sendRedirect("jsp/back/back_login.jsp?msg="+msg);
		}
	}
}
