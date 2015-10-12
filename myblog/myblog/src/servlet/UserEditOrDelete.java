package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Encryption.Md5;
import dao.UserDao;
import empty.User;

/**
 * Servlet implementation class UserEdit
 */
@WebServlet(name="userEditOrDelete", urlPatterns={"/UserEditOrDelete"})
public class UserEditOrDelete extends HttpServlet { 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEditOrDelete() {
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
		/*
		 * 向页面输出信息的写法
		 */
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out = response.getWriter();
		 
		 /*
		  * result1:执行 UserDao.deleteUser()函数
		  * -1:执行失败或者没有执行sql
		  * 0:执行sql影响行数为0
		  * 1:执行sql影响函数为1
		  * 
		  * result2:接收updateUser()函数的返回值
		  * -1:没有执行sql或者执行错误
		  * 0: 执行sql且受影响行数为0
		  * 1:执行sql且受影响函数为1
		  */
		 int result1 = -1;
		 int result2 = -1;
		 
		 /*
		  * 判断request.getParameter的返回值
		  * if:com的返回值为delete,根据传过来的userid,则执行UserDao.deleteUser(int user_id)
		  * if:new_user_id&new_user_email&new_user_pass&new_user_nick&new_user_imagepath&new_user_isadmin都不为空，则执行插入操作
		  * else:没有操作或者输入不合法
		  */
		if(request.getParameter("com")!=null && request.getParameter("com").equals("delete")){
			result1 = UserDao.deleteUser(Integer.parseInt(request.getParameter("userid")));
			
			//判断返回值,如果result1 == 1, 跳转到back_users.jsp页面
			if(result1 == 1){
				response.sendRedirect("jsp/back/back_users.jsp");
			}else if(result1 == 0){
				out.println("<h1>执行sql影响数据库0行或者没有查到该id的user</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else{
				out.println("<h1>执行sql异常或者没有执行sql</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}
			
		}else if(request.getParameter("new_user_id") != null){
			//验证所有的input是否为空
			if(request.getParameter("new_user_email") == null){
				out.println("<h1>user_email 不能为空</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else if(request.getParameter("new_user_pass") == null){
				out.println("<h1>user_pass 不能为空</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else if(request.getParameter("new_user_nick") == null){
				out.println("<h1>user_nick 不能为空</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else if(request.getParameter("new_user_imagepath") == null){
				out.println("<h1>user_imagepath 不能为空</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else{
				User user = new User();
				user.setUser_id(Integer.parseInt(request.getParameter("new_user_id")));
				user.setUser_email(request.getParameter("new_user_email"));
				user.setUser_nick(request.getParameter("new_user_nick"));
				user.setUser_imagepath(request.getParameter("new_user_imagepath"));
				//判断request.getParameter("new_user_isadmin")!=null
				if(request.getParameter("new_user_isadmin")!= null){
					user.setUser_isadmin(1);
				}else{
					user.setUser_isadmin(0);
				}
				user.setUser_pass(request.getParameter("new_user_pass"));
				//执行UserDao.updateUser(User user),返回值用result2接收
				result2 = UserDao.updateUser(user);
			}
			//判断返回值,如果result1 == 1, 跳转到back_users.jsp页面
			if(result2 == 1){
				response.sendRedirect("jsp/back/back_users.jsp");
			}else if(result1 == 0){
				out.println("<h1>执行sql影响数据库0行或者没有找到到该id的user</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}else{
				out.println("<h1>执行sql异常或者没有执行sql</h1>");
				out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
			}
			
		}else{
			out.println("<h1>没有操作</h1>");
			out.println("<a href=\"javascript:history.go(-1)\">返回上一个页面</a>");
		}
	}

}
