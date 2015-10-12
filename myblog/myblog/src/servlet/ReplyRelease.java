package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReplyDao;
import empty.Reply;

/**
 * Servlet implementation class ReplyRelease
 */
@WebServlet(name="replyRelease", urlPatterns={"/ReplyRelease"})
public class ReplyRelease extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReplyRelease() {
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
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * 定义 int errmsg 作为返回去的错误消息
		 * -1: 未执行检查代码
		 * 0: 用户未登录
		 * 1: 未检查到article_id
		 * 2: 未检查到article_content
		 * 3：数据库插入失败
		 * 4：发表成功
		 */
		int errmsgI = -1;
		
		if(!request.getParameter("uid").equals("-1")){
			if(request.getParameter("aid")!=null){
				if(request.getParameter("replycontent")!=null){
					Reply reply = new Reply();
					reply.setReplycontent(request.getParameter("replycontent").replaceAll("<", "&lt"));
					reply.setUserid(Integer.parseInt(request.getParameter("uid")));
					reply.setArticleid(Integer.parseInt(request.getParameter("aid")));
					reply.setReplydate(new Date());
					int insertresult = 0;
					insertresult = ReplyDao.insertReply(reply);
					if(insertresult == 1){
						errmsgI = 4;
					}else{
						errmsgI = 3;
					}
				}else{
					errmsgI = 2;
				}
			}else{
				errmsgI = 1;
			}
		}else{
			errmsgI = 0;
		}
		
		response.sendRedirect("jsp/Journal/journal_each.jsp?id="+request.getParameter("aid")+"&errmsg="+errmsgI);
	}

}
