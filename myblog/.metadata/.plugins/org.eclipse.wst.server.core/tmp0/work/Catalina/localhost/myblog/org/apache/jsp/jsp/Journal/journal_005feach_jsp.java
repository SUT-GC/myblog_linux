/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-10-13 13:42:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Journal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UserDao;
import dao.ReplyDao;
import java.util.ArrayList;
import empty.Reply;
import empty.User;
import dao.JournalDao;
import empty.Journal;

public final class journal_005feach_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("dao.UserDao");
    _jspx_imports_classes.add("empty.Reply");
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>日志浏览</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Gc\">\n");
      out.write("    <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/journal_each.css\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <!--引入 fontawesom-4.2.0-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-4.2.0/css/font-awesome.min.css\">\n");
      out.write("    <!--引入wangEditor.css-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/wangEditor-1.1.0-min.css\">\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("            padding: 0px 10px 0px 10px;\n");
      out.write("            background-color: #F5F5F5;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<!-- java start -->\n");

	int id = -1;
	String classifyS = "";
	Journal journal = null;
	if(request.getParameter("id")!= null){
		id = Integer.parseInt(request.getParameter("id"));
		journal = JournalDao.selectByID(id);
		switch (journal.getClassify()){
		case 1: classifyS = "java"; break;
		case 2: classifyS = "算法"; break;
		case 3: classifyS = "Html/css/js"; break;
		case 4: classifyS = "生活随笔"; break;
		case 5: classifyS = "读书笔记"; break;
		case 6: classifyS = "其他"; break;
		}
	}
	
	int userid = -1;
	User user = null;
	if(session.getAttribute("user")!=null){
		user = (User)session.getAttribute("user");
		userid = user.getUser_id();
	}
	
	String replyerr = "";
	if(request.getParameter("errmsg")!=null){
		replyerr = request.getParameter("errmsg");
	}

      out.write("\n");
      out.write("<!-- java end -->\n");
      out.write("    <div class=\"all\">\n");
      out.write("    <div class=\"journal_each_all\">\n");
      out.write("    \t");

    		if(id != -1 && journal != null && !classifyS.equals("")){
    	
      out.write("\n");
      out.write("        <div class=\"journal_nav\">\n");
      out.write("            <a href=\"Journal.jsp\">日志页</a>\n");
      out.write("            <span class=\"journal_nav_1\">>></span>\n");
      out.write("            <a href=\"Journal.jsp?cfy=");
      out.print(journal.getClassify());
      out.write('"');
      out.write('>');
      out.print(classifyS);
      out.write("</a>\n");
      out.write("            <span class=\"journal_nav_2\">>></span>\n");
      out.write("            <a href=\"#\">");
      out.print(journal.getTitle());
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"journal_each_article\">\n");
      out.write("            <div class=\"title\">");
      out.print(journal.getTitle());
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"author_data\">\n");
      out.write("                <span  class=\"author\">\n");
      out.write("                    <span class=\"author_label\">作者:</span>\n");
      out.write("                    <span class=\"author_content\">");
      out.print(journal.getAuthor());
      out.write("</span>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"date_label\">创建时间:</span>\n");
      out.write("                <span class=\"date_data\">");
      out.print(journal.getDatetime());
      out.write("</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\" readonly>\n");
      out.write("                <pre class=\"content_text\" >");
      out.print(journal.getContent());
      out.write("</pre>\n");
      out.write("                <div class=\"reply\">\n");
      out.write("                    <!--文本编写框start-->\n");
      out.write("                    <div class=\"reply-editor\">\n");
      out.write("                        <h3 >填写评论</h3>\n");
      out.write("\t\t\t\t\t\t<form action=\"/myblog/ReplyRelease?uid=");
      out.print(userid);
      out.write("&aid=");
      out.print(journal.getJournal_id());
      out.write("\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t <textarea name=\"replycontent\" rows=\"5\" cols=\"93\" style=\"font-size:18px; padding-right:20px; padding-left:20px; padding-bottom:10px; padding-top: 10px;\" placeholder='请填写您要回复的内容~(^_^)~'></textarea>\n");
      out.write("\t\t\t\t\t\t <div class=\"btn-group\" style=\"margin-top:10px;\">\n");
      out.write("                        \t<button  type=\"submit\" class=\"btn btn-primary\">对文章进行评论</button>\n");
      out.write("                    \t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("                    </div>\n");
      out.write("                     <!--文本编写框end-->\n");
      out.write("                     ");

                     	ArrayList<Reply> list = null;
                     	list = ReplyDao.selectReplyByArticleID(journal.getJournal_id());
                     	for(Reply reply: list){
                     
      out.write("\n");
      out.write("                    <!--回复start-->\n");
      out.write("                    <hr/>\n");
      out.write("                    <div class=\"reply_top\">\n");
      out.write("                        <img style=\"width:52px; height:52px;\" src=\"../../image/user/head/");
      out.print(UserDao.selectUserByID(reply.getUserid()).getUser_imagepath());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"reply_bottom\">\n");
      out.write("                        <div>\n");
      out.write("\t                        <a href=\"#\" class=\"reply_user_name\">");
      out.print(UserDao.selectUserByID(reply.getUserid()).getUser_nick());
      out.write("</a>\n");
      out.write("\t                        <span class=\"reply_date\">");
      out.print(reply.getReplydate());
      out.write("</span>\n");
      out.write("                     \t</div>\n");
      out.write("                     \t<div>\n");
      out.write("                     \t\t<pre class=\"reply_content\">");
      out.print(reply.getReplycontent());
      out.write("</pre>\n");
      out.write("                     \t</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--回复end-->\n");
      out.write("                    ");
} 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

    		}else{
    
      out.write("\n");
      out.write("    <h1 style='color:red'>对不起 ,  没有搜到日志 ......</h1>\n");
      out.write("    ");

    		}
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--引入 jquery.js-->\n");
      out.write("            <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("            <!--引入 wangEditor.js-->\n");
      out.write("            <script type=\"text/javascript\" src='js/wangEditor-1.1.0-min.js'></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("            /*\n");
      out.write("    \t\t * -1: 未执行检查代码\n");
      out.write("    \t\t * 0: 用户未登录\n");
      out.write("    \t\t * 1: 未检查到article_id\n");
      out.write("    \t\t * 2: 未检查到article_content\n");
      out.write("    \t\t * 3：数据库插入失败\n");
      out.write("    \t\t * 4：发表成功\n");
      out.write("    \t\t */\n");
      out.write("    \t\t var replyerrI = '");
      out.print(replyerr);
      out.write("';\n");
      out.write("    \t\t var replyerrmsg = \"\";\n");
      out.write("    \t\t if(replyerrI!=\"\"){\n");
      out.write("    \t\t\t if(replyerrI == \"-1\"){\n");
      out.write("    \t\t\t\t replyerrmsg = \"未执行检查代码\";\n");
      out.write("    \t\t\t }else if(replyerrI == \"0\"){\n");
      out.write("    \t\t\t\t replyerrmsg = \"用户未登录\";\n");
      out.write("    \t\t\t }else if(replyerrI == \"1\"){\n");
      out.write("    \t\t\t\t replyerrmsg = \"未检查到article_id\";\n");
      out.write("    \t\t\t }else if(replyerrI == \"2\"){\n");
      out.write("    \t\t\t\t replyerrmsg = \"未检查到article_content\";\n");
      out.write("    \t\t\t }else if(replyerrI == \"3\"){\n");
      out.write("    \t\t\t\t replyerrmsg = \"数据库插入失败\";\n");
      out.write("    \t\t\t }else if(replyerrI == \"4\"){\n");
      out.write("    \t\t\t\t replyerrmsg = \"发表成功\";\n");
      out.write("    \t\t\t }\n");
      out.write("    \t\t\t alert(replyerrmsg);\n");
      out.write("    \t\t }\n");
      out.write("                $(function(){\n");
      out.write("                    $('#spanTime').text((new Date()).toString());\n");
      out.write("\n");
      out.write("                    //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o \n");
      out.write("                    var $editor = $('#txtDiv').wangEditor();\n");
      out.write("\n");
      out.write("                    //显示 html / text\n");
      out.write("                    var $textarea = $('#textarea'),\n");
      out.write("                        $btnHtml = $('#btnHtml'),\n");
      out.write("                        $btnText = $('#btnText'),\n");
      out.write("                        $btnHide = $('#btnHide');\n");
      out.write("                    $textarea.hide();\n");
      out.write("                    $btnHtml.click(function(){\n");
      out.write("                        $textarea.show();\n");
      out.write("                        $textarea.val( $editor.jsp() );\n");
      out.write("                    });\n");
      out.write("                    $btnText.click(function(){\n");
      out.write("                        $textarea.show();\n");
      out.write("                        $textarea.val( $editor.text() );\n");
      out.write("                    });\n");
      out.write("                    $btnHide.click(function(){\n");
      out.write("                        $textarea.hide();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("</body>\n");
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