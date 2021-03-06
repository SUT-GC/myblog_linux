package servlet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Encryption.Base64;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import dao.UserDao;

/**
 * Servlet implementation class UpdateHeadImg
 */
@WebServlet(name="updateHeadImg", urlPatterns={"/UpdateHeadImg"})
public class UpdateHeadImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateHeadImg() {
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
		String filepath = getServletContext().getRealPath(File.separator)+"image"+java.io.File.separator+"user"+java.io.File.separator+"head";
		
		System.out.println(filepath);
		File file = new File(filepath);
		
		if(!file.exists()){
			file.mkdirs();
		}
		
		SmartUpload su = new SmartUpload();
		su.initialize(getServletConfig(), request, response);
		su.setMaxFileSize(1024*1024*5);
		su.setAllowedFilesList("jpg,png,gif,jpeg");
		
		/*
		 * 1:上传成功
		 * 2:上传失败
		 * 2.1:上传失败,格式不正确
		 * 2.2:上传失败,大小超过1M
		 * 3:上传失败,已经有该文件
		 * 4:用户未登录
		 * 5:执行sql失败
		 */
		String imageuplodrelease = "";
		String filename = "";
		
		
		
		if(request.getParameter("userid")!=null){
			int userid = Integer.parseInt(request.getParameter("userid"));
			String newfilename = ""+(new Date())+userid;
			try {
				su.setDeniedFilesList("rar,exe,txt,jsp,js");
				su.upload();
				com.jspsmart.upload.File tempfile = su.getFiles().getFile(0);
				String uploadfilename = tempfile.getFieldName();
				if(!UserDao.selectUserImagePathByID(userid).equals("default.jpg")){
					File oldfile = new File(filepath+java.io.File.separator+UserDao.selectUserImagePathByID(userid));
					oldfile.delete();
				}
				tempfile.saveAs(filepath+java.io.File.separator+newfilename+uploadfilename);
				if(UserDao.updateUserImagePathByID(userid, newfilename+uploadfilename) == 1){
					imageuplodrelease = "1";
				}else{
					imageuplodrelease = "5";
				}
			} catch (Exception e) {
				e.printStackTrace();
				if(e.getMessage().indexOf("1015") != -1){
					imageuplodrelease = "2.1";
				}else if(e.getMessage().indexOf("1010") != -1){
					imageuplodrelease = "2.1";
				}else if(e.getMessage().indexOf("1105") != -1){
					imageuplodrelease = "2.2";
				}
				else imageuplodrelease = "2";
			}
		}else{
			imageuplodrelease = "4";
		}
	
		
		response.sendRedirect("/myblog/jsp/upload/updateheadimg.jsp?ilr="+imageuplodrelease+"&fn="+Base64.base64Encoder(filename));
	}

}
