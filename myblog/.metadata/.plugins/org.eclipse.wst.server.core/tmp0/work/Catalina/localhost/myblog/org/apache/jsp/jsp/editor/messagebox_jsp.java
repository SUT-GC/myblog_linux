/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-11-22 13:28:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.editor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UserDao;
import empty.Message;
import java.util.ArrayList;
import dao.MessDao;
import empty.User;

public final class messagebox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.MessDao");
    _jspx_imports_classes.add("empty.User");
    _jspx_imports_classes.add("dao.UserDao");
    _jspx_imports_classes.add("empty.Message");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>留言板</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <!--引入导航栏nav.css-->\n");
      out.write("    <link href=\"css/nav.css\" rel=\"stylesheet\">\n");
      out.write("    <!--引入 fontawesom-4.2.0-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-4.2.0/css/font-awesome.min.css\">\n");
      out.write("    <!--[if IE]>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-4.2.0/css/font-awesome-ie7.min.css\">\n");
      out.write("    <![endif]-->\n");
      out.write("    <!--引入massagebox.css-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/messagebox.css\">\n");
      out.write("    <!--引入wangEditor.css-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/wangEditor-1.1.0-min.css\">\n");
      out.write("    <!--引入bootstrap.min.css-->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"//cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <!--引入 jquery.js-->\n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <!--引入 wangEditor.js-->\n");
      out.write("    <script type=\"text/javascript\" src='js/wangEditor-1.1.0-min.js'></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function(){\n");
      out.write("            $('#spanTime').text((new Date()).toString());\n");
      out.write("\n");
      out.write("            //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o \n");
      out.write("            var $editor = $('#txtDiv').wangEditor();\n");
      out.write("\n");
      out.write("            ");
for(int i = 1; i <= 10; i++){
      out.write("\n");
      out.write("            //显示 html / text\n");
      out.write("            var $replybutton");
      out.print(i);
      out.write(" = $('.reply-button");
      out.print(i);
      out.write("');\n");
      out.write("            var $replytextarea");
      out.print(i);
      out.write(" = $('#replytextarea");
      out.print(i);
      out.write("');\n");
      out.write("            var $teplytexthide");
      out.print(i);
      out.write(" = $('#btnhide");
      out.print(i);
      out.write("');\n");
      out.write("            \n");
      out.write("            $replytextarea");
      out.print(i);
      out.write(".hide();\n");
      out.write("            $replybutton");
      out.print(i);
      out.write(".click(function(){\n");
      out.write("         \t \t$replytextarea");
      out.print(i);
      out.write(".show();\n");
      out.write("         \t });\n");
      out.write("         \t$teplytexthide");
      out.print(i);
      out.write(".click(function(){\n");
      out.write("         \t\t$replytextarea");
      out.print(i);
      out.write(".hide();\n");
      out.write("         \t});\n");
      out.write("         \t");
}
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body class=\"b\">\n");
      out.write("<div class=\"all\">\n");
      out.write("<!--导航开始-->\n");
      out.write("\t<!-- java start -->\n");
      out.write("\t");

		//获取Session user
		session = request.getSession();
		User user = null;
		int userid = -1;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
			userid = user.getUser_id();
		}
		
		String errmsg = "";
		if(request.getParameter("errmsg")!=null){
			errmsg = request.getParameter("errmsg");
		}
		String errrep = "";
		if(request.getParameter("errrep")!=null){
			errrep = request.getParameter("errrep");
		}
	
      out.write("\n");
      out.write("<!-- java end -->\n");
      out.write("  <div id=\"nav\">\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\n");
      out.write("      <li><a href=\"../nav/index.jsp\" class=\"three-d \">\n");
      out.write("        主页\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">主页</span><span class=\"back\">主页</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../Journal/Journal.jsp\" class=\"three-d\">\n");
      out.write("        日志\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">日志</span><span class=\"back\">日志</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../update/update.jsp\" class=\"three-d\">\n");
      out.write("        TA\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">TA</span><span class=\"back\">TA</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../information/information.jsp\" class=\"three-d\">\n");
      out.write("        博主\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">博主</span><span class=\"back\">博主</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../prompt/prompt.jsp\" class=\"three-d\">\n");
      out.write("        空间\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">空间</span><span class=\"back\">空间</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"#\" class=\"three-d active\">\n");
      out.write("        留言板\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">留言板</span><span class=\"back\">留言板</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../back/back_login.jsp\" class=\"three-d\">\n");
      out.write("        后台\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">后台</span><span class=\"back\">后台</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      ");

      	if(user == null){
      
      out.write("\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\n");
      out.write("        登陆/注册\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">登陆/注册</span><span class=\"back\">登陆/注册</span></span></a>\n");
      out.write("        <ul class=\"clearfix unstyled drop-menu\">\n");
      out.write("          <li><a href=\"../login/login.jsp\" class=\"three-d\">\n");
      out.write("              登陆\n");
      out.write("              <span class=\"three-d-box\"><span class=\"front\">登陆</span><span class=\"back\">登陆</span></span>\n");
      out.write("          </a></li>\n");
      out.write("          <li><a href=\"../registered/registered.jsp\" class=\"three-d\">\n");
      out.write("            注册\n");
      out.write("            <span class=\"three-d-box\"><span class=\"front\">注册</span><span class=\"back\">注册</span></span>\n");
      out.write("          </a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      ");
}else{ 
      out.write("\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\n");
      out.write("        登陆成功/登出\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">登陆成功/登出</span><span class=\"back\">");
      out.print(user.getUser_nick());
      out.write("</span></span></a>\n");
      out.write("        <ul class=\"clearfix unstyled drop-menu\">\n");
      out.write("         <li><a href=\"/myblog/jsp/upload/updateheadimg.jsp\" class=\"three-d\">\n");
      out.write("            修改头像\n");
      out.write("            <span class=\"three-d-box\"><span class=\"front\">修改头像</span><span class=\"back\">修改头像</span></span>\n");
      out.write("          </a></li>\n");
      out.write("          <li><a href=\"/myblog/SessionDo\" class=\"three-d\">\n");
      out.write("            登出\n");
      out.write("            <span class=\"three-d-box\"><span class=\"front\">登出</span><span class=\"back\">登出</span></span>\n");
      out.write("          </a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      ");
} 
      out.write("\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("<!--导航结束-->\n");

    int pagec = 1;
   	if(request.getParameter("page")!=null){
		pagec = Integer.parseInt(request.getParameter("page"));
	}

      out.write("\n");
      out.write("<!--留言板start-->\n");
      out.write("    <div class=\"messagebox\">\n");
      out.write("        <h2 class=\"messgebox-zh\">留言板:</h2>\n");
      out.write("        <div class=\"messagebox-sendword\">\n");
      out.write("            <h3 class=\"messagebox-sendword-title\" style='margin-left:10px;color:#0000CC'>主人寄语</h3>\n");
      out.write("            <p class=\"messagebox-sendword-content\" style='margin-left:10px; color:#0000CC;font-size:17px'>因技术问题，现阶段必须用户登录才能留言，日后会加以改进 。<br/>如果有什么建议，或者遇到bug，或者技术上的要求，请进行留言反馈，博主不甚感激。<br/> 如果有文件上的需求或者有具体问题要提问，建议注册时填写真的Email或者留言里写下Email，以便于博主发邮件解答。<br/><span style=\"color:#FF0000;\">请大家使用文明用语进行留言，否则管理员会对该留言进行删除</span></p>\n");
      out.write("        </div>\n");
      out.write("        <!--文本编写框start-->\n");
      out.write("        <div class=\"writeword\">\n");
      out.write("            <div class=\"send-words-prompt\" style='font-size:19px; color:#FF9900'>请填写并发表您的留言</div>\n");
      out.write("            <form action=\"/myblog/MessageRelease?userid=");
      out.print(userid);
      out.write("\" method=\"post\">\n");
      out.write("\t            <div style='margin-top:5px;'>\n");
      out.write("\t                <textarea name = \"firstmessage\"id='textarea' style='width:98%; height:130px; margin:10px; font-size:17px; padding:10px;' placeholder='请填写您要留言的内容~(^_^)~'></textarea>\n");
      out.write("\t                <button type=\"submit\" id='btnHtml' style='margin-top:5px;'  >发表留言</button>\n");
      out.write("\t                <button type=\"reset\" id='btnText' style='margin-top:5px;' >清除内容</button>\n");
      out.write("\t            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!--文本编写框end-->\n");
      out.write("        <div class=\"messagebox-message\">\n");
      out.write("            <div class=\"messagebox-message-num\">\n");
      out.write("                留言(<a href=\"#\">");
      out.print(MessDao.countFirstMess());
      out.write("</a>)\n");
      out.write("            </div>\n");
      out.write("            <!--留言列表start-->\n");
      out.write("            <div class=\"messagebox-message-content\">\n");
      out.write("            \t<div style='text-align: center'><h2>第 <a href=\"#\">");
      out.print(pagec);
      out.write(" </a>页</h2></div>\n");
      out.write("                <!--每个人的留言楼层start-->\n");
      out.write("                <!-- java start -->\n");
      out.write("                ");

                	ArrayList <Message> firstlist = null;
                	int pages = 1;
                	if(request.getParameter("page")== null || request.getParameter("page").equals("1")){
                		pages = 1;
                	}else{
                		pages = Integer.parseInt(request.getParameter("page"));
                	}
                	firstlist = MessDao.selectMessByLimit((pages-1)*10, 10);
                
      out.write("\n");
      out.write("                <!-- java end -->\n");
      out.write("                <div class=\"messagebox-message-content-floor\">\n");
      out.write("                ");

                	int i = 0;
                	for(Message message: firstlist){
                		i++;
                
      out.write("\n");
      out.write("                    <div class=\"floor-left\">\n");
      out.write("                        <img style=\"width: 52px; height: 52px;\" src=\"../../image/user/head/");
      out.print(UserDao.selectUserByID(message.getUser_id()).getUser_imagepath());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"floor-right\">\n");
      out.write("                        <div class=\"floor-username_floor-num\">\n");
      out.write("                            <a class=\"username\">");
      out.print(UserDao.selectUserByID(message.getUser_id()).getUser_nick());
      out.write("</a>\n");
      out.write("                            <span class=\"floornum\">第<a>");
      out.print(message.getFloor_id());
      out.write("</a>楼</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"floor-content\">\n");
      out.write("                            <pre class=\"content\">");
      out.print(message.getMessbox_reply());
      out.write("</pre>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"floor-right-bottom\">\n");
      out.write("                            <span class=\"msgtime\">");
      out.print(message.getMessbox_date());
      out.write("</span>\n");
      out.write("                            <button class=\"reply-button");
      out.print(i);
      out.write("\">回复</button>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"/myblog/MessageRelease?floorid=");
      out.print(message.getFloor_id());
      out.write("&userid=");
      out.print(userid);
      out.write("&touserid=");
      out.print(message.getUser_id());
      out.write("\" method=\"post\">\n");
      out.write("\t\t\t\t            <div id=\"replytextarea");
      out.print(i);
      out.write("\" style='margin-top:5px;'>\n");
      out.write("\t\t\t\t                <textarea name='replytextarea' id='textarea' style='width:98%; height:100px; margin:10px; font-size:15px; padding:10px;' placeholder='请填写您要回复的内容~(^_^)~'></textarea>\n");
      out.write("\t\t\t\t                <button type=\"submit\" id='btnHtml' style='margin-top:5px;' >回复</button>\n");
      out.write("\t\t\t\t                <button type=\"reset\" id='btnText' style='margin-top:5px;' >重置</button>\n");
      out.write("\t\t\t\t                <button type=\"button\" id='btnhide");
      out.print(i);
      out.write("' style='margin-top:5px;'>隐藏</button>\n");
      out.write("\t\t\t\t            </div>\n");
      out.write("            \t\t\t</form>\n");
      out.write("                        <hr/>\n");
      out.write("                        <!--回复列表start-->\n");
      out.write("                        <div class=\"reply\">\n");
      out.write("                        ");

                        	ArrayList <Message> secoundlist = null;
                        	secoundlist = MessDao.selectSecoundMessByFloor(message.getFloor_id());
                        	
                        	for(Message secoundmessage:secoundlist){
                        
      out.write("\n");
      out.write("                            <div class=\"reply-left\">\n");
      out.write("                                <img style=\"width: 40px; height: 40px;\" src=\"/myblog/image/user/head/");
      out.print(UserDao.selectUserByID(secoundmessage.getUser_id()).getUser_imagepath());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"reply-right\">\n");
      out.write("                                <div class=\"reply-right-top\">\n");
      out.write("                                    <a class=\"reply-username\">");
      out.print(UserDao.selectUserByID(secoundmessage.getUser_id()).getUser_nick());
      out.write("</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"reply-content\">\n");
      out.write("                                    <pre class=\"reply-content-text\">");
      out.print(secoundmessage.getMessbox_reply());
      out.write("</pre>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"reply-time\">");
      out.print(secoundmessage.getMessbox_date());
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
} 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!--回复列表end-->\n");
      out.write("                    </div>\n");
      out.write("                    ");
} 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <hr/>\n");
      out.write("                <!--每个人的留言楼层end-->\n");
      out.write("                <!--分页start-->\n");
      out.write("                <div class=\"messagebox-nav\">\n");
      out.write("                    <nav>\n");
      out.write("                      <ul class=\"pagination\">\n");
      out.write("                        ");

                        	//计算需要多少页面按钮
                        	int sum = MessDao.countFirstMess();
                        	int pagecount = 1;
                        	if(sum % 10 == 0){
                        		pagecount = sum / 10;
                        	}else{
                        		pagecount = sum / 10 +1;
                        	}
                        	if(pagecount <= 20){
                        		for(i = 1; i <= pagecount; i++){
                        
      out.write("\n");
      out.write("                        <li ");
if(pagec == i){ 
      out.write("class=\"active\"");
} 
      out.write("><a href=\"?page=");
      out.print(i);
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                        ");

                        		}
                        	}else{
						
      out.write("  \n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("                          <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("                            <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                          </a>\n");
      out.write("                        </li>                      \n");
      out.write("                        ");
		for(i = 1; i <= 10; i++){
                        
      out.write("\n");
      out.write("                        <li><a href=\"#\">");
      out.print(i);
      out.write("</a></li>\n");
      out.write("                        ");
		}
                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                          <a href=\"#\" aria-label=\"Next\">\n");
      out.write("                            <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                          </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
	
                        	}
                        
      out.write("\n");
      out.write("                      </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            <!--分页end-->\n");
      out.write("            </div>\n");
      out.write("            <!--留言列表end-->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!--留言板end-->\n");
      out.write("\t<!--留白start-->\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div style=\"text-align: center;\">\n");
      out.write("\t\t  <div class=\"blank\">Designed and built with all the love in the world by <a href=\"#\">@GC</a></div>\n");
      out.write("\t\t  <div class=\"blank-bottom\">用爱创造世界</div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <hr/>\n");
      out.write("\t\t<!--留白end-->\n");
      out.write("</div>\n");
      out.write("<!-- 站长统计 -->\n");
      out.write("<script type=\"text/javascript\">var cnzz_protocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");document.write(unescape(\"%3Cspan id='cnzz_stat_icon_1256817075'%3E%3C/span%3E%3Cscript src='\" + cnzz_protocol + \"s95.cnzz.com/z_stat.php%3Fid%3D1256817075%26show%3Dpic' type='text/javascript'%3E%3C/script%3E\"));</script>\n");
      out.write("<!-- 站长统计结束 -->\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("//  变量err返回发布留言的后台验证信息\n");
      out.write("//  0:用户未登录，不能进行留言\n");
      out.write("//  1:request中的留言内容参数未找到\n");
      out.write("//  2:留言内容不能为空\n");
      out.write("//  3:用户留言成功\n");
      out.write(" \n");
      out.write("\tvar err1 = '");
      out.print(errmsg);
      out.write("';\n");
      out.write("\t/*\n");
      out.write("\t * 变量errrep 返回发布回复的后台验证信息\n");
      out.write("\t * 0: 用户未登录\n");
      out.write("\t * 1: floorid未检查到\n");
      out.write("\t * 2: touserid未检查到\n");
      out.write("\t * 3: 回复内容不能为空\n");
      out.write("\t * 4: 恭喜您，回复成功\n");
      out.write("\t */\n");
      out.write("\tvar err2 = '");
      out.print(errrep);
      out.write("';\n");
      out.write("\tvar errmsg = \"\";\n");
      out.write("\tif(err1 != \"\"){\n");
      out.write("\t\tif(err1 == \"0\"){\n");
      out.write("\t\t\terrmsg += \"只有登陆之后才能发表留言，请您先进行登陆~(^_^)~\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif(err1 == \"1\"){\n");
      out.write("\t\t\terrmsg += \"request中的留言内容参数未找到\";\n");
      out.write("\t\t}\t\t\n");
      out.write("\t\tif(err1 == \"2\"){\n");
      out.write("\t\t\terrmsg += \"对不起，留言内容不能为空 !\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif(err1 == \"3\"){\n");
      out.write("\t\t\terrmsg +=\"恭喜您， 留言成功 ！ \";\n");
      out.write("\t\t}\n");
      out.write("\t\talert(errmsg);\n");
      out.write("\t}\n");
      out.write("\tif(err2 !=\"\"){\n");
      out.write("\t\tif(err2 == \"0\"){\n");
      out.write("\t\t\terrmsg += \"只有登陆之后才能回复留言，请您先进行登陆~(^_^)~\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif(err2 == \"1\"){\n");
      out.write("\t\t\terrmsg += \"系统错误1\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif(err2 == \"2\"){\n");
      out.write("\t\t\terrmsg += \"系统错误2\";\n");
      out.write("\t\t}\n");
      out.write("\t\tif(err2 == \"3\"){\n");
      out.write("\t\t\terrmsg += \"回复的内容不能为空\"\n");
      out.write("\t\t}\n");
      out.write("\t\tif(err2 == \"4\"){\n");
      out.write("\t\t\terrmsg += \"恭喜您，回复成功\";\n");
      out.write("\t\t}\n");
      out.write("\t\talert(errmsg);\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
