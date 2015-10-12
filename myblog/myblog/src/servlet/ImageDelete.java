package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import file.ImageDo;

/**
 * Servlet implementation class ImageDelete
 */
@WebServlet(name="imageDelete", urlPatterns={"/ImageDelete"})
public class ImageDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageDelete() {
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
		out.println("hello");
		
		/*
		 * 定义删除之后返回的变量 int delimgp
		 * 0: Servlet中imgp参数未找到
		 * 1: 删除成功
		 * 2: 文件未找到
		 * 3: 执行文件创建报错或者为执行ImageDo.deleteImage;
		 */
		int delimgp = 0;
		
		/*
		 * 执行删除操作
		 */
		if(request.getParameter("imgp")!=null){
			String imagepath = request.getParameter("imgp");
			String imageurl = getServletContext().getRealPath("/")+"image"+File.separator+"journalheader"+File.separator+imagepath;
			int delresult = -1;
			delresult = ImageDo.deleteImage(imageurl);
			if(delresult ==1){
				delimgp = 1;
			}else if(delresult == 0){
				delimgp = 2;
			}else{
				delimgp = 3;
			}
		}
		
		response.sendRedirect("jsp/back/back_image.jsp?delimgp="+delimgp);
	}

}
