/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-10-12 15:33:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.nav;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ReplyDao;
import other.Tool;
import dao.JournalDao;
import empty.Journal;
import java.util.ArrayList;
import empty.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("empty.Journal");
    _jspx_imports_classes.add("empty.User");
    _jspx_imports_classes.add("other.Tool");
    _jspx_imports_classes.add("dao.ReplyDao");
    _jspx_imports_classes.add("dao.JournalDao");
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
      			"../error.jsp", true, 8192, true);
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!--java 绝对地址 start  -->\n");

	String urlp = application.getContextPath()+"/jsp/";
	System.out.println(urlp);

      out.write("\n");
      out.write("<!-- java 绝对地址 end -->\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <link href=\"");
      out.print(urlp);
      out.write("nav/css/news.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"");
      out.print(urlp);
      out.write("nav/css/nav.css\" rel=\"stylesheet\">\n");
      out.write("  <title>GC的博客</title>\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("        body {\n");
      out.write("          background-color:#edecec;\n");
      out.write("          background-image: url('");
      out.print(urlp);
      out.write("nav/img/1.jpg');\n");
      out.write("          background-position: center;\n");
      out.write("          background-repeat:repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100%,auto;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--导航开始-->\n");
      out.write("\t<!-- java start -->\n");
      out.write("\t");

		//获取Session user
		session = request.getSession();
		User user = null;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
		}
		/*
		 *获取服务器返回的是否登出成功的信息ds
		 */
		 String ds = "";
		if(request.getParameter("ds")!=null){
			ds = request.getParameter("ds");
		}
	
      out.write("\n");
      out.write("\t<!-- java end -->\n");
      out.write("  <div id=\"nav\">\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\n");
      out.write("      <li><a href=\"#\" class=\"three-d active\">\n");
      out.write("        主页\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">主页</span><span class=\"back\">主页</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"");
      out.print(urlp);
      out.write("Journal/Journal.jsp\" class=\"three-d\">\n");
      out.write("        日志\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">日志</span><span class=\"back\">日志</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\n");
      out.write("        TA\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">TA</span><span class=\"back\">TA</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"");
      out.print(urlp);
      out.write("information/information.jsp\" class=\"three-d\">\n");
      out.write("        博主\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">博主</span><span class=\"back\">博主</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\n");
      out.write("        空间\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">空间</span><span class=\"back\">空间</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"");
      out.print(urlp);
      out.write("editor/messagebox.jsp\" class=\"three-d\">\n");
      out.write("        留言板\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">留言板</span><span class=\"back\">留言板</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"");
      out.print(urlp);
      out.write("back/back_login.jsp\" class=\"three-d\">\n");
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
      out.write("          <li><a href=\"");
      out.print(urlp);
      out.write("/login/login.jsp\" class=\"three-d\">\n");
      out.write("              登陆\n");
      out.write("              <span class=\"three-d-box\"><span class=\"front\">登陆</span><span class=\"back\">登陆</span></span>\n");
      out.write("          </a></li>\n");
      out.write("          <li><a href=\"");
      out.print(urlp);
      out.write("registered/registered.jsp\" class=\"three-d\">\n");
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
      out.write("<!--最新更新start--> \n");
      out.write("\t<!-- java start -->\n");
      out.write("\t");

		ArrayList<Journal> list = null;
		list = JournalDao.SelectTopJournal5();
	
      out.write("\n");
      out.write("\t<!-- java end -->\n");
      out.write("  <div class=\"center_show\">\n");
      out.write("    <div class=\"topnews\">\n");
      out.write("        <h1>^_^&nbsp&nbsp<b>文章</b>推荐&nbsp&nbsp^_^</h1>\n");
      out.write("        ");

        	for(Journal journal:list){
        
      out.write("\n");
      out.write("        <div class=\"blogs\">\n");
      out.write("          <figure><img style='width:180px; height:180px;' src=\"");
      out.print(urlp);
      out.write("../image/journalheader/");
      out.print(journal.getImgpath());
      out.write("\"></figure>\n");
      out.write("          <ul>\n");
      out.write("            <h3><a href=\"");
      out.print(urlp);
      out.write("/Journal/journal_each.jsp?id=");
      out.print(journal.getJournal_id());
      out.write('"');
      out.write('>');
      out.print(journal.getTitle());
      out.write("</a></h3>\n");
      out.write("            <div class=\"journal_summary\">\n");
      out.write("            \t<p>");
      out.print(journal.getSummary());
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"");
      out.print(urlp);
      out.write("/Journal/Journal.jsp?cfy=");
      out.print(journal.getClassify());
      out.write('"');
      out.write('>');
      out.print(Tool.ClassifyNumToClassify(journal.getClassify()));
      out.write("</a></span><span class=\"dtime f_l\">");
      out.print(Tool.changDateTile(journal.getDatetime()));
      out.write("</span><span class=\"viewnum f_r\">浏览（<a href=\"#\">很多</a>）</span><span class=\"pingl f_r\">评论（<a href=\"#\">");
      out.print(ReplyDao.countReplyByArticleID(journal.getJournal_id()));
      out.write("</a>）</span></p>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("         ");

        	}
        
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<!--最新更新end-->\n");
      out.write("<!--留白start-->\n");
      out.write("  <div class=\"blank\">Designed and built with all the love in the world by <a href=\"#\">@GC</a></div>\n");
      out.write("  <div class=\"blank-bottom\">用爱创造世界</div>\n");
      out.write("<!--留白end-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("\tvar ds = \"\";\n");
      out.write("\tds = ");
      out.print(ds);
      out.write(";\n");
      out.write("\tif(ds == 1){\n");
      out.write("\t\talert(\"登出成功，跳转到微博主页\");\n");
      out.write("\t}\n");
      out.write("  </script>");
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
