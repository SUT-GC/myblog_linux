package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Encryption.Md5;
import dao.UserDao;
import empty.User;

/**
 * Servlet implementation class LoginDo
 */
@WebServlet(name="loginDo", urlPatterns={"/LoginDo"})
public class LoginDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDo() {
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
		/*
		 * 对request, response 进行编码
		 */
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * 定义username, password进行对requset的接收
		 */
		String username = "";
		String password = "";
		
		/*
		 * 定义Lm来保存验证之后的信息
		 * 0: 账号或密码不能为空
		 * 1: 通过验证
		 * 2: 账号不存在
		 * 3: 密码错误
		 */
		int Lm = 0;
		
		/*
		 * 创建User 
		 */
		User user = null;
		if(request.getParameter("username") != null){
			username = request.getParameter("username");
		}
		if(request.getParameter("password") != null){
			password = request.getParameter("password");
		}
		System.out.println("username = "+username+" "+"password="+password);
		if(!username.equals("") && !password.equals("")){
			if(UserDao.selectUserByEmail(username) == null){
				Lm = 2;
			}else{
				user = UserDao.selectUserByEmail(username);
				//测试
				System.out.println("out.user.pass = "+user.getUser_pass());
				System.out.println("~password = "+password +"~ get.userpass = "+Md5.md5Encode(password));
				
				if(user.getUser_pass().equals(Md5.md5Encode(password))){
					Lm = 1;
				}else{
					Lm = 3;
				}
			}
		}else{
			Lm = 0;
		}
		
		/*
		 * 对Lm的消息验证结果进行判断与转发
		 */
		if(Lm == 1){
			if(user != null){
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect("jsp/nav/index.jsp");
			}
		}else{
			response.sendRedirect("jsp/login/login.jsp?Lm="+Lm);
		}
		
	}

}
