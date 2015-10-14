package servlet;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import Encryption.Base64;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet(name="fileUpload",urlPatterns={"/FileUpload"})
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUpload() {
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
		String filepath = getServletContext().getRealPath(File.separator)+"image"+java.io.File.separator+"journalheader";
		System.out.println(filepath);
		File file = new File(filepath);
		
		if(!file.exists()){
			file.mkdirs();
		}
		
		SmartUpload su = new SmartUpload();
		su.initialize(getServletConfig(), request, response);
		su.setMaxFileSize(1024*1024*10);
		su.setAllowedFilesList("jpg,png,gif,jpeg");
		
		String imageuplodrelease = "";
		String filename = "";
		try {
			su.setDeniedFilesList("rar,exe,txt,jsp,js");
			su.upload();
			com.jspsmart.upload.File tempfile = su.getFiles().getFile(0);
			filename = tempfile.getFileName();
			File selectoldfile = new File(filepath+java.io.File.separator+filename);
			if(selectoldfile.exists()){
				imageuplodrelease = "3";
			}else{
				su.save(filepath);
				imageuplodrelease = "1";
			}
		} catch (Exception e) {
			if(e.getMessage().indexOf("1015") != -1){
				imageuplodrelease = "2.1";
			}else if(e.getMessage().indexOf("1010") != -1){
				imageuplodrelease = "2.1";
			}else if(e.getMessage().indexOf("1105") != -1){
				imageuplodrelease = "2.2";
			}
			else imageuplodrelease = "2";
		}
		
		response.sendRedirect("jsp/back/back_journal_release.jsp?ilr="+imageuplodrelease+"&fn="+Base64.base64Encoder(filename));
	}
}
