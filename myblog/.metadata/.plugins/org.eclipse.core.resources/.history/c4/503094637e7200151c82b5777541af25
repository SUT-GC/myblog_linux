package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Encryption.Md5;
import dao.UserDao;
import empty.User;

/**
 * Servlet implementation class LoginDo
 */
@WebServlet(name="registeredDo", urlPatterns={"/RegisteredDo"})
public class RegisteredDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteredDo() {
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
		//将request,response转码为utf-8
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * 对于检查各个输入而进行检查
		 */
		//-2: 内容为空, -1:email 格式不符合,  0: email冲突
		int emailresult = -1;
		//-2: nick 为空, -1:没检测到
		int nickresult = -1;
		//-2: pw 为空, 0: 密码没有达到6-16字符的要求 , -1:没检测到
		int pwresult = -1;
		//-2: rpw 为空, -1:没检测到
		int rpwresult = -1;
		
		/*
		 * 对错误消息进行储存别且进行传送
		 */
		//存总的错误信息
		String errall = "";
		//存email错误信息
		String erremail = "";
		//存nick错误信息
		String errnick = "";
		//存密码错误信息
		String errpw = "";
		//存验证的错误信息
		String errrpw = "";
		
		/*
		 * 存储注册成功的信息
		 */
		String succreg = "";
		
		//读取request带来的信息
		String email = request.getParameter("email");
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		String repeat = request.getParameter("repeatpassword");
		
		//测试是否接受到
		System.out.println(email+" "+nick+" "+password+" "+repeat);
		
		//用来存新的User 信息
		User user = null;
		//对每个信息进行判断
		if(email.split(" ").length == 0 || email.equals("")){
			emailresult = -2;
			erremail += "邮箱不能为空&";
		}else if(email.matches("^[a-z0-9A-Z]+([._\\-]*[a-z0-9A-Z])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.)(com|cn|org|net|gov)")){
			if(UserDao.selectUserByEmail(email) == null){
				emailresult = 1;
				user = new User();
				user.setUser_email(email);
			}else{
				emailresult = 0;
				erremail +="该邮箱已经被注册&";
			}
		}else{
			erremail += "email格式不符合&";
			emailresult = -1;
		}
		
		if(nick.split(" ").length != 0 && !nick.equals("") && user != null){
			user.setUser_nick(nick);
			nickresult = 1;
		}else if(nick.split(" ").length == 0 || nick.equals("")){
			errnick += "昵称不能为空&";
			nickresult = -2;
		}
		
		if(password.length() <6 && password.length() > 16){
			pwresult = -2;
			errpw +=  "密码需要6-16个字符&";
		}else if(password.split(" ").length != 0 && !password.equals("") && user != null){
			user.setUser_pass(password);
			pwresult = 1;
		}else if(password.split(" ").length == 0 || password.equals("")){
			errpw += "密码不能为空&";
			pwresult = 0;
		}
		
		if(repeat.split(" ").length != 0 && !password.equals("") && repeat.equals(password) && user != null){
			rpwresult = 1;
		}else{
			errrpw += "两次密码输入不一致";
			rpwresult = -2;
		}
		
		//测试何种报错的数据
		System.out.println(emailresult+" "+nickresult+" "+pwresult+" "+rpwresult);
		errall +=erremail+" "+errnick+" "+errpw+" "+errrpw;
		System.out.println(errall);
		
		
		if((emailresult + nickresult + pwresult + pwresult) == 4){
			if(UserDao.insertUser(user) == 1){
				succreg += "rs" ;
				response.sendRedirect("jsp/login/login.jsp?Rm="+succreg);
			}
		}else{
			response.sendRedirect("jsp/registered/registered.jsp?Rm="+emailresult+" "+nickresult+" "+pwresult+" "+rpwresult);
		}
		
		
	}

}
