/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-11-18 11:20:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Encryption.Base64;

public final class back_005fjournal_005frelease_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("Encryption.Base64");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>日志发布界面</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Admin Theme -->\n");
      out.write("        <link href=\"css/bootstrap-admin-theme.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- Vendors -->\n");
      out.write("        <link href=\"vendors/bootstrap-datepicker/css/datepicker.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"css/datepicker.fixes.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"vendors/uniform/themes/default/css/uniform.default.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"css/uniform.default.fixes.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"vendors/chosen.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/stylesheets/bootstrap-wysihtml5/core-b3.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <link href=\"css/back_journal_release.css\" rel=\"stylesheet\" >\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("           <script type=\"text/javascript\" src=\"js/html5shiv.js\"></script>\n");
      out.write("           <script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body class=\"bootstrap-admin-with-small-navbar\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \" role=\"navigation\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("          <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Gc微博后台</a>\n");
      out.write("          </div>\n");
      out.write("          <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li class=\"active\"><a href=\"#\">首页</a></li>\n");
      out.write("              <li ><a href=\"back_help.jsp\">使用介绍</a></li>             \n");
      out.write("            </ul>\n");
      out.write("            <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"请输入内容\">\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">搜索</button>\n");
      out.write("            </form>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("              <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">管理员<b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                  <li><a href=\"/myblog/AdminSessionLogout\">退出登录</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!-- /.navbar-collapse -->\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- left, vertical navbar & content -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- left, vertical navbar -->\n");
      out.write("               <div class=\"col-md-2 bootstrap-admin-col-left\">\n");
      out.write("                     <ul class=\"nav navbar-collapse collapse bootstrap-admin-navbar-side\">\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"back_index.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 首页</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"back_about.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 关于我们</a>\n");
      out.write("                        </li>                       \n");
      out.write("                        <li class=\"disabled\">\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日历</a><!-- calendar.html -->\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"disabled\">\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 统计图表</a><!-- stats.html -->\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"back_journal_release.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日志发布</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"back_journal_admin.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日志管理</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"back_users.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 用户管理</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"back_message.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留言管理</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"back_image.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 图片管理</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"back_admin_information.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 账户中心</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白1</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白2</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白3</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白4</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- content start -->\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">日志发布</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h3 class=\"journal_release_title\">Please input informations of the article:</h3>\n");
      out.write("                    <hr/>\n");
      out.write("                    <div class=\"image_upload\">\n");
      out.write("                    <form action=\"/myblog/FileUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    \t <span class=\"is_private uploadlabel\">Please upload a image for this article</span>\n");
      out.write("                    \t <input class=\"uploadfile\" type=\"file\" name=\"file\"/>\n");
      out.write("                    \t ");

                    	 	String image="default.jpg";
                    	 	if(request.getParameter("ilr") != null){
                    		 		if(request.getParameter("ilr").equals("1")){
                    		 			if(request.getParameter("fn")!=null && !Base64.base64Decoder(request.getParameter("fn")).equals("")){
                    		 				image = Base64.base64Decoder(request.getParameter("fn"));
                    		 				out.print("<h3 style='color:#00FF00'>上传成功:"+Base64.base64Decoder(request.getParameter("fn"))+"</h3>");
                    		 			}else{
                    		 				out.print("<h3 style='color:#00FF00'>上传成功</h3>");                    		 				
                    		 			}
                    		 		}else if(request.getParameter("ilr").equals("2")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败</h3>");
                    		 		}else if(request.getParameter("ilr").equals("2.1")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败,格式不正确</h3>");
                    		 		}else if(request.getParameter("ilr").equals("2.2")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败,大小超过10M</h3>");
                    		 		}else if(request.getParameter("ilr").equals("3")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败,已经有该文件</h3>");
                    		 		}
                    	 		}
                    	 
      out.write("\n");
      out.write("                    \t <input type=\"submit\"  name=\"fileupload\" value =\"UpLoad\"class=\" uploadbtn btn btn-primary input_buttons_submit\"/>\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("                    <hr/>\n");
      out.write("                    <form id=\"journal_release_form_id\" class=\"journal_release_form_class\" method=\"post\" action=\"/myblog/ReleaseJournal\">\n");
      out.write("                        <div class=\"input_title\">\n");
      out.write("                            <span class=\"input_title_label\">the image of your article:</span>\n");
      out.write("                            <input name=\"article_image\" type=\"text\" value=\"");
      out.print(image);
      out.write("\" readonly class=\"form-control article_image input_title_content\"  />\n");
      out.write("                        </div>\n");
      out.write("                        <hr/>\n");
      out.write("                        <div class=\"input_title\">\n");
      out.write("                            <span class=\"input_title_label\">the title of your article:</span>\n");
      out.write("                            <input name=\"article_title\" type=\"text\" class=\"form-control input_title_content\" placeholder=\"title...\">\n");
      out.write("                        </div>\n");
      out.write("                        <hr/>\n");
      out.write("                        <div class=\"input_title\">\n");
      out.write("                            <span class=\"input_title_label\">the author of your article:</span>\n");
      out.write("                            <input name=\"article_author\" type=\"text\" class=\"form-control input_title_content\" placeholder=\"author...\">\n");
      out.write("                        </div>\n");
      out.write("                        <hr/>\n");
      out.write("                        <div class=\"input_summary\">\n");
      out.write("                            <span class=\"input_title_label\">the summary of your article:</span>\n");
      out.write("                            <textarea name=\"article_summary\" class=\"input_summary_textarea\" style=\"width:69%;\" rows=\"3;\"></textarea><br/><br/><br/><br/><br/>\n");
      out.write("                        </div>\n");
      out.write("                        <hr/>\n");
      out.write("                        <div class=\"input_content\">\n");
      out.write("                            <span class=\"input_title_label\">the content of your article:</span>\n");
      out.write("                            <textarea name=\"article_content\" class=\"input_content_textarea\" \"></textarea><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("                        </div>\n");
      out.write("                        <hr/>\n");
      out.write("                        <div class=\"input_submit\">\n");
      out.write("                            <span class=\"input_title_label\">Classification:</span>\n");
      out.write("                            <select name=\"article_classify\" id=\"select_classify\">\n");
      out.write("                                <option value=\"1\">java</option>\n");
      out.write("                                <option value=\"2\">算法</option>\n");
      out.write("                                <option value=\"3\">Html/css/js</option>\n");
      out.write("                                <option value=\"4\">生活随笔</option>\n");
      out.write("                                <option value=\"5\">读书笔记</option>\n");
      out.write("                                <option value=\"6\">其他</option>\n");
      out.write("                                <option value=\"7\" >C++</option>\n");
      out.write("                                <option value=\"8\" >Linux</option>\n");
      out.write("                            </select>   \n");
      out.write("                            <span class=\"is_private\">is private ?</span>\n");
      out.write("                            <input class=\"is_private_check\"type=\"checkbox\" name=\"isprivate\" value=\"1\"/>\n");
      out.write("                            <span class=\"is_private\">if this is private, please input your password !</span>\n");
      out.write("                            <input name=\"private_pass\" class=\"input_password\" type=\"text\">\n");
      out.write("                        </div>\n");
      out.write("                        <hr/>\n");
      out.write("                        <div class=\"input_buttons\">\n");
      out.write("                            <input type=\"submit\" onclick=\"return confirm('是否发布该文章？');\" value =\"Release\"class=\"btn btn-success input_buttons_submit\"/>\n");
      out.write("                            <input type=\"reset\"  onclick=\"return confirm('是否清空您输入的所有？');\"value =\"Reset\"class=\"btn btn-primary input_buttons_reset\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <hr style=\"margin-top:80px;\"/>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- content end -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <hr>\n");
      out.write("                <footer role=\"contentinfo\">\n");
      out.write("                    <p>&copy; 2015 <a href=\"#\" target=\"_blank\">Gc</a></p>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/twitter-bootstrap-hover-dropdown.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/uniform/jquery.uniform.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/chosen.jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/bootstrap-datepicker/js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/javascripts/bootstrap-wysihtml5/wysihtml5.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/javascripts/bootstrap-wysihtml5/core-b3.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/twitter-bootstrap-wizard/jquery.bootstrap.wizard-for.bootstrap3.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/boostrap3-typeahead/bootstrap3-typeahead.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
