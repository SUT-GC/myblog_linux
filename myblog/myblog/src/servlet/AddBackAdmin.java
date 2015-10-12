package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Encryption.Base64;
import dao.AdminDao;
import empty.Admin;

/**
 * Servlet implementation class AddBackAdmin
 */
@WebServlet(name="addBackAdmin", urlPatterns={"/AddBackAdmin"})
public class AddBackAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBackAdmin() {
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
		
		int msg = 0;
		
		if(request.getParameter("new_admin_username")!=null && request.getParameter("new_admin_password")!=null){
			Admin admin = new Admin();
			admin.setAdmin_username(request.getParameter("new_admin_username"));
			admin.setAdmin_password(Base64.base64Encoder(request.getParameter("new_admin_password")));
			msg = AdminDao.insertAdmin(admin);
		}
		
		response.sendRedirect("jsp/back/back_admin_information.jsp?msg="+msg);
	}

}
