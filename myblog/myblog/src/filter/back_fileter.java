package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import empty.Admin;
import empty.User;

/**
 * Servlet Filter implementation class back_fileter
 */
@WebFilter(filterName="backFilter", urlPatterns={
		"/jsp/back/back_about.jsp",
		"/jsp/back/back_admin_edit.jsp",
		"/jsp/back/back_admin_information.jsp",
		"/jsp/back/back_help.jsp",
		"/jsp/back/back_image.jsp",
		"/jsp/back/back_index.jsp",
		"/jsp/back/back_journal_admin.jsp",
		"/jsp/back/back_journal_edit.jsp",
		"/jsp/back/back_journal_release.jsp",
		"/jsp/back/back_message_show.jsp",
		"/jsp/back/back_admin_add.jsp",
		"/jsp/back/back_reply.jsp",
		"/jsp/back/back_reply_show",
		"/jsp/back/back_message.jsp",
		"/jsp/back/back_user_eidt.jsp",
		"/jsp/back/back_users.jsp",
		"/EditJournalRelease",
		"/ReleaseJournal",
		"/UserEditOrDelete",
		"/MessageDo",
		"/ImageDelete",
		"/FileUpload",
		"/AddBackAdmin",
		"/ReplyDo"
})
public class back_fileter implements Filter {

    /**
     * Default constructor. 
     */
    public back_fileter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("正在执行过滤器......");
		HttpServletRequest hrequest = (HttpServletRequest) request;
		HttpServletResponse hresponse = (HttpServletResponse) response;
		hrequest.setCharacterEncoding("utf-8");
		hresponse.setCharacterEncoding("utf-8");
		
		HttpSession session = hrequest.getSession();
		
		int pass = 0;
		if(session.getAttribute("user")!=null){
			User user = (User)session.getAttribute("user");
			if(user.getUser_isadmin() == 1){
				if(session.getAttribute("adminuser")!= null){
					pass = 1;
				}
			}
		}
		
		if(pass == 1){
			chain.doFilter(request, response);
		}else {
			hresponse.sendRedirect("/myblog/jsp/nopower.jsp");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
