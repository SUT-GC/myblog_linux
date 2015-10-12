package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MessDao;
import empty.Message;

/**
 * Servlet implementation class MessageRelease
 */
@WebServlet(name = "messageRelease", urlPatterns = {"/MessageRelease"})
public class MessageRelease extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageRelease() {
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
		 * 对request与response进行utf-8的解码
		 */
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * 读取页面输出字节流
		 */
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * 变量errmsg返回发布留言的后台验证信息
		 * 0:用户未登录，不能进行留言
		 * 1:request中的留言内容参数未找到
		 * 2:留言内容不能为空
		 * 3:用户留言成功
		 */
		/*
		 * 变量errrep 返回发布回复的后台验证信息
		 * 0: 用户未登录
		 * 1: floorid未检查到
		 * 2: touserid未检查到
		 * 3: 回复内容不能为空
		 * 4: 恭喜您，回复成功
		 */
		int errmsg = -1;
		int errrep = -1;
		
		/*
		 * 进行检验
		 */
		int maxfloorid = -1;
		String firstMessContent = "";
		Message message = new Message();
		if(!request.getParameter("userid").equals("-1")){
			maxfloorid = MessDao.countFirstMess();
			if(request.getParameter("firstmessage")!=null){
				firstMessContent = request.getParameter("firstmessage");
				System.out.println("~"+firstMessContent+"~");
				if(firstMessContent.split(" ").length != 0 && !firstMessContent.equals("")){
					firstMessContent = firstMessContent.replaceAll("<", "&lt");
					message.setFloor_id(maxfloorid+1);
					message.setUser_id(Integer.parseInt(request.getParameter("userid")));
					message.setTouser_id(0);
					message.setMessbox_reply(firstMessContent);
					message.setMessbox_date(new Date());
					System.out.println("您发表的留言内容为"+message.getMessbox_reply());
					if(MessDao.insertMess(message) == 1){
						errmsg = 3;
					}
				}else{
					errmsg = 2;
				}
			}else{
				errmsg = 1;
			}
		}else{
			errmsg = 0;
		}
		
		if(!request.getParameter("userid").equals("-1")){
			if(request.getParameter("floorid")!=null){
				if(request.getParameter("touserid") != null){
					String replytextcontent = request.getParameter("replytextarea");
					if(replytextcontent.split(" ").length!=0 && !replytextcontent.equals("")){
						replytextcontent = replytextcontent.replaceAll("<", "&lt");
						Message secoundmessage = new Message();
						secoundmessage.setFloor_id(Integer.parseInt(request.getParameter("floorid")));
						secoundmessage.setTouser_id(Integer.parseInt(request.getParameter("touserid")));
						secoundmessage.setUser_id(Integer.parseInt(request.getParameter("userid")));
						secoundmessage.setMessbox_reply(replytextcontent);
						secoundmessage.setMessbox_date(new Date());
						if(MessDao.insertMess(secoundmessage) == 1){
							errrep = 4;
						}
					}else{
						errrep = 3;
					}
				}else{
					errrep = 2;
				}
			}else{
				errrep = 1;
			}
		}else{
			errrep = 0;
		}
		
		System.out.println(errrep);
		if(errrep != -1 && request.getParameter("touserid")!=null && request.getParameter("floorid")!=null){
			System.out.println("reply");
			response.sendRedirect("jsp/editor/messagebox.jsp?errrep="+errrep);
		}else if(errmsg != -1 && request.getParameter("firstmessage")!=null){
			System.out.println("message");
			response.sendRedirect("jsp/editor/messagebox.jsp?errmsg="+errmsg);	
		}
				
		out.println(maxfloorid);
		out.println(firstMessContent);
		out.print(message);
		out.print("</hr>");
		out.println(errrep);
	}

}
