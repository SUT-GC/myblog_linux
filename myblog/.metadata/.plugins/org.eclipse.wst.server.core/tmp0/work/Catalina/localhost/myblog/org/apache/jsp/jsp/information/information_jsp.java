/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-11-10 12:21:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.information;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import empty.User;
import Encryption.Base64;
import dao.AdminDao;
import empty.Admin;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("empty.User");
    _jspx_imports_classes.add("empty.Admin");
    _jspx_imports_classes.add("Encryption.Base64");
    _jspx_imports_classes.add("dao.AdminDao");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>博主信息</title>\n");
      out.write("\n");
      out.write("<link type=\"text/css\" href=\"css/css.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.0.js\"></script>\n");
      out.write("  <style>\n");
      out.write("  /*导航的css&js开始*/\n");
      out.write("        @import url(\"http://www.w3cplus.com/demo/css3/base.css\");\n");
      out.write("        /*任务一：引入本地字体文件*/\n");
      out.write("        @font-face {\n");
      out.write("    font-family: 'sansationregular';\n");
      out.write("    src: url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.eot');\n");
      out.write("    src: url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.eot?#iefix') format('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/embedded-opentype'),\n");
      out.write("         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.woff') format('woff'),\n");
      out.write("         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.ttf') format('truetype'),\n");
      out.write("         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.svg#sansationregular') format('svg');\n");
      out.write("    font-weight: normal;\n");
      out.write("    font-style: normal;\n");
      out.write("}\n");
      out.write("        body {\n");
      out.write("          background-color:#edecec;\n");
      out.write("          background-image: url('img/1.jpg');\n");
      out.write("          background-position: center;\n");
      out.write("          background-repeat:repeat;\n");
      out.write("          background-attachment: fixed;\n");
      out.write("          background-size: 100%,auto;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* basic menu styles */\n");
      out.write("        .nav-menu {\n");
      out.write("          display: block;\n");
      out.write("         /* background: #74adaa;*/\n");
      out.write("          width:950px;\n");
      out.write("          margin: 50px auto 150px;\n");
      out.write("          position: fixed;\n");
      out.write("          padding-left: 18%;\n");
      out.write("          z-index: 2;\n");
      out.write("        }\n");
      out.write("        .nav-menu > li {\n");
      out.write("          display: inline;\n");
      out.write("          float:left;     \n");
      out.write("          border-right:1px solid #94c0be;\n");
      out.write("        }\n");
      out.write("        .nav-menu > li:last-child {\n");
      out.write("          border-right: none;\n");
      out.write("        }\n");
      out.write("        .nav-menu li a {\n");
      out.write("          color: #fff;\n");
      out.write("          display: block;\n");
      out.write("          text-decoration: none;\n");
      out.write("          /*调用本地字体*/\n");
      out.write("          font-family:sansationregular;\n");
      out.write("          -webkit-font-smoothing: antialiased;\n");
      out.write("          -moz-font-smoothing: antialiased;\n");
      out.write("          font-smoothing: antialiased;\n");
      out.write("          text-transform: capitalize;\n");
      out.write("          overflow: visible;\n");
      out.write("          line-height: 20px;\n");
      out.write("          font-size: 20px;\n");
      out.write("          padding: 15px 30px 15px 31px;     \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        .three-d {\n");
      out.write("          /* 任务三、设置3D舞台布景 */\n");
      out.write("          -webkit-perspective: 200px;\n");
      out.write("          -moz-perspective: 200px;\n");
      out.write("          -ms-perspective: 200px;\n");
      out.write("          -o-perspective: 200px;\n");
      out.write("          perspective: 200px;\n");
      out.write("          /*任务四、设置3D舞台布景过渡效果*/\n");
      out.write("          -webkit-transition: all .07s linear;\n");
      out.write("          -moz-transition: all .07s linear;\n");
      out.write("          -ms-transition: all .07s linear;\n");
      out.write("          -o-transition: all .07s linear;\n");
      out.write("          transition:all .7s linear;\n");
      out.write("          position: relative;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .three-d:not(.active):hover {\n");
      out.write("          cursor: pointer;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /*任务五、给不是当前状态的3D舞台的悬浮与聚焦状态设置变形效果*/\n");
      out.write("        .three-d:not(.active):hover .three-d-box, \n");
      out.write("        .three-d:not(.active):focus .three-d-box {\n");
      out.write("        -wekbit-transform: translateZ(-25px) rotateX(90deg);\n");
      out.write("        -moz-transform: translateZ(-25px) rotateX(90deg);\n");
      out.write("        -o-transform: translateZ(-25px) rotateX(90deg);\n");
      out.write("        -ms-transform: translateZ(-25px) rotateX(90deg);\n");
      out.write("        transform: translateZ(-25px) rotateX(90deg);\n");
      out.write("    /*    -webkit-transform:rotateX(90deg) translatez(-25px);*/\n");
      out.write("       /*   -webkit-transform:rotatex(90deg);*/\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .three-d-box {\n");
      out.write("          /*任务六、给3D舞台中“.three-d-box”设置过渡与变形效果*/\n");
      out.write("          -webkit-transition: all .3s ease-out;\n");
      out.write("          -moz-transition: all .3s ease-out;\n");
      out.write("          -ms-transition: all .3s ease-out;\n");
      out.write("          -o-transition: all .3s ease-out;  \n");
      out.write("          transition: all .3s ease-out;\n");
      out.write("          -webkit-transform: translatez(-25px);\n");
      out.write("          -moz-transform: translatez(-25px);\n");
      out.write("          -ms-transform: translatez(-25px);\n");
      out.write("          -o-transform: translatez(-25px);\n");
      out.write("          transform: translatez(-25px);\n");
      out.write("          -webkit-transform-style: preserve-3d;\n");
      out.write("          -moz-transform-style: preserve-3d;\n");
      out.write("          -ms-transform-style: preserve-3d;\n");
      out.write("          -o-transform-style: preserve-3d;\n");
      out.write("          transform-style: preserve-3d;\n");
      out.write("          -webkit-pointer-events: none;\n");
      out.write("          -moz-pointer-events: none;\n");
      out.write("          -ms-pointer-events: none;\n");
      out.write("          -o-pointer-events: none;\n");
      out.write("          pointer-events: none;\n");
      out.write("          position: absolute;\n");
      out.write("          top: 0;\n");
      out.write("          left: 0;\n");
      out.write("          display: block;\n");
      out.write("          width: 100%;\n");
      out.write("          height: 100%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /*任务七、给导航设置3D前，与3D后变形效果*/\n");
      out.write("        .front {\n");
      out.write("            -webkit-transform: rotatex(0deg) translatez(25px);\n");
      out.write("            -moz-transform: rotatex(0deg) translatez(25px);\n");
      out.write("            -ms-transform: rotatex(0deg) translatez(25px);\n");
      out.write("            -o-transform: rotatex(0deg) translatez(25px);\n");
      out.write("            transform: rotatex(0deg) translatez(25px);\n");
      out.write("         }\n");
      out.write("        \n");
      out.write("        .back {\n");
      out.write("          -webkit-transform: rotatex(-90deg) translatez(25px);\n");
      out.write("          -moz-transform: rotatex(-90deg) translatez(25px);\n");
      out.write("          -ms-transform: rotatex(-90deg) translatez(25px);\n");
      out.write("          -o-transform: rotatex(-90deg) translatez(25px);\n");
      out.write("          transform: rotatex(-90deg) translatez(25px);\n");
      out.write("          color: #FFE7C4; \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .front, .back {\n");
      out.write("/*          border:1px solid red;*/\n");
      out.write("          display: block;\n");
      out.write("          width: 100%;\n");
      out.write("          height: 100%;\n");
      out.write("          position: absolute;\n");
      out.write("          top: 0;\n");
      out.write("          left: 0;\n");
      out.write("          background: #74adaa;\n");
      out.write("          padding: 15px 30px 15px 31px; \n");
      out.write("          color: white;\n");
      out.write("          -webkit-pointer-events: none;\n");
      out.write("          -moz-pointer-events: none;\n");
      out.write("          -ms-pointer-events: none;\n");
      out.write("          -o-pointer-events: none;\n");
      out.write("          pointer-events: none;\n");
      out.write("          -webkit-box-sizing: border-box;\n");
      out.write("          box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        /*任务八、设置导航当前状态与悬浮状态下的背景效果*/\n");
      out.write("        .nav-menu li .active .front,\n");
      out.write("        .nav-menu li .active .back,\n");
      out.write("        .nav-menu li a:hover .front,\n");
      out.write("        .nav-menu li a:hover .back {\n");
      out.write("             background-color: #51938f;\n");
      out.write("             -webkit-background-size: 5px 5px;\n");
      out.write("             background-size: 5px 5px;\n");
      out.write("             background-position: 0 0, 30px 30px;\n");
      out.write("             background-image: -webit-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\n");
      out.write("             background-image: -moz-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\n");
      out.write("             background-image: -ms-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\n");
      out.write("             background-image: -o-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\n");
      out.write("             background-image: linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\n");
      out.write("        }\n");
      out.write("        .nav-menu ul {\n");
      out.write("          position: absolute;\n");
      out.write("          text-align: left;\n");
      out.write("          line-height: 40px;\n");
      out.write("          font-size: 14px;\n");
      out.write("          width: 200px;\n");
      out.write("          -webkit-transition: all 0.3s ease-in;\n");
      out.write("          -moz-transition: all 0.3s ease-in;\n");
      out.write("          -ms-transition: all 0.3s ease-in;\n");
      out.write("          -o-transition: all 0.3s ease-in;\n");
      out.write("          transition: all 0.3s ease-in;\n");
      out.write("          -webkit-transform-origin: 0px 0px;\n");
      out.write("          -moz-transform-origin: 0px 0px;\n");
      out.write("          -ms-transform-origin: 0px 0px;\n");
      out.write("          -o-transform-origin: 0px 0px;\n");
      out.write("          transform-origin: 0px 0px;\n");
      out.write("          -webkit-transform: rotateX(-90deg);\n");
      out.write("          -moz-transform: rotateX(-90deg);\n");
      out.write("          -ms-transform: rotateX(-90deg);\n");
      out.write("          -o-transform: rotateX(-90deg);\n");
      out.write("          transform: rotateX(-90deg);\n");
      out.write("          -webkit-backface-visibility: hidden;\n");
      out.write("          -moz-backface-visibility: hidden;\n");
      out.write("          -ms-backface-visibility: hidden;\n");
      out.write("          -o-backface-visibility: hidden;\n");
      out.write("          backface-visibility: hidden;\n");
      out.write("        }\n");
      out.write("        /*任务九、显示下拉导航菜单，并其设置一个变形效果*/\n");
      out.write("        .nav-menu > li:hover ul {\n");
      out.write("/*          display: block;*/\n");
      out.write("           -webkit-transform: rotateX(0deg);\n");
      out.write("           -moz-transform: rotateX(0deg);\n");
      out.write("           -ms-transform: rotateX(0deg);\n");
      out.write("           -o-transform: rotateX(0deg);\n");
      out.write("           transform: rotateX(0deg);\n");
      out.write("         }\n");
      out.write(" /*导航的css&js结束*/\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--导航开始-->\n");
      out.write("\t<!-- java start -->\n");
      out.write("\t");

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//获取Session user
		session = request.getSession();
		User user = null;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
		}
	
      out.write("\n");
      out.write("\t<!-- java end -->\n");
      out.write("  <div id=\"nav\">\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\n");
      out.write("      <li><a href=\"../nav/index.jsp\" class=\"three-d \">\n");
      out.write("        主页\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">主页</span><span class=\"back\">主页</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../Journal/Journal.jsp\" class=\"three-d \">\n");
      out.write("        日志\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">日志</span><span class=\"back\">日志</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../update/update.jsp\" class=\"three-d\">\n");
      out.write("        TA\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">TA</span><span class=\"back\">TA</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../information/information.jsp\" class=\"three-d active\">\n");
      out.write("        博主\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">博主</span><span class=\"back\">博主</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../prompt/prompt.jsp\" class=\"three-d\">\n");
      out.write("        空间\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">空间</span><span class=\"back\">空间</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../editor/messagebox.jsp\" class=\"three-d\">\n");
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
      out.write("<!--个人信息start-->\n");
      out.write("    <div class=\"history\">\n");
      out.write("        <div class=\"start-history\">\n");
      out.write("            <p class=\"cc_history\">个人信息</p>\n");
      out.write("            <p class=\"next_history\">INFORMATIONS</p>\n");
      out.write("            <div class=\"history_left\">\n");
      out.write("                <p class=\"history_L year2006\">\n");
      out.write("                    <span class=\"history_2006_span\">姓名</span>\n");
      out.write("                    <b class=\"history_2006_b\">\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\n");
      out.write("                        <span class=\"history_l_text\">勾&nbsp&nbsp&nbsp&nbsp超</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_L year2009\">\n");
      out.write("                    <span class=\"history_2006_span\">出生年</span>\n");
      out.write("                    <b class=\"history_2006_b\">\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\n");
      out.write("                        <span class=\"history_l_text\">1995&nbsp&nbsp年</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_L yearalmost\">\n");
      out.write("                    <span class=\"history_2006_span\">血型</span>\n");
      out.write("                    <b class=\"history_2006_b\">\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\n");
      out.write("                        <span class=\"history_l_text\">待鉴定</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_L yearalmost\">\n");
      out.write("                    <span class=\"history_2006_span blue\">职业</span>\n");
      out.write("                    <b class=\"history_2006_b blue\">\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\n");
      out.write("                        <span class=\"history_l_text\">学&nbsp&nbsp生</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_L yearalmost\">\n");
      out.write("                    <span class=\"history_2006_span blue\">婚姻</span>\n");
      out.write("                    <b class=\"history_2006_b blue\">\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\n");
      out.write("                        <span class=\"history_l_text\">未&nbsp&nbsp婚</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_L year2011\">\n");
      out.write("                    <span class=\"history_2006_span blue\">留白</span>\n");
      out.write("                    <b class=\"history_2006_b blue\">\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\n");
      out.write("                        <span class=\"history_l_text\">。。。</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"history-img\">\n");
      out.write("                <img class=\"history_img\" src=\"images/history.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"history_right\">\n");
      out.write("                <p class=\"history_R history_r_2005\">\n");
      out.write("                    <span class=\"history_2005_span\">英文名</span>\n");
      out.write("                    <b class=\"history_2005_b\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\">G&nbsp&nbsp&nbsp&nbspC</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_R yearalmostr\">\n");
      out.write("                    <span class=\"history_2005_span\">星座</span>\n");
      out.write("                    <b class=\"history_2005_b\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\">待&nbsp&nbsp查</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_R yearalmostr\">\n");
      out.write("                    <span class=\"history_2005_span\">爱好</span>\n");
      out.write("                    <b class=\"history_2005_b\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\">计算机,Run</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_R yearalmostr\">\n");
      out.write("                    <span class=\"history_2005_span\">出生地</span>\n");
      out.write("                    <b class=\"history_2005_b\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\">辽宁-朝阳</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_R yearalmostr\">\n");
      out.write("                    <span class=\"history_2005_span blue\">学校</span>\n");
      out.write("                    <b class=\"history_2005_b blue_R\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\">沈阳工业大学</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_R yearalmostr\">\n");
      out.write("                    <span class=\"history_2005_span blue\">邮箱</span>\n");
      out.write("                    <b class=\"history_2005_b blue_R\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\" style=\"font-size: 17px;\">sut_gouc@foxmail.com</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"history_R year211\">\n");
      out.write("                    <span class=\"history_2005_span blue\">留白</span>\n");
      out.write("                    <b class=\"history_2005_b blue_R\">\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\n");
      out.write("                        <span class=\"history_r_text\">。。。</span>\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\t\t\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/new_file.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(window).scroll(function(){\n");
      out.write("\tvar msg = $(\".history-img\");\n");
      out.write("\tvar item = $(\".history_L\");\n");
      out.write("\tvar items = $(\".history_R\");\n");
      out.write("\tvar windowHeight = $(window).height();\n");
      out.write("\tvar Scroll = $(document).scrollTop();\n");
      out.write("\tif((msg.offset().top - Scroll -windowHeight)<=0){\n");
      out.write("\t\tmsg.fadeIn(1500);\n");
      out.write("\t}\n");
      out.write("\tfor(var i=0;i<item.length;i++){\n");
      out.write("\t\tif(($(item[i]).offset().top - Scroll - windowHeight)<= -100){\n");
      out.write("\t\t\t$(item[i]).animate({marginRight:'0px'},'50','swing');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfor(var i=0;i<items.length;i++){\n");
      out.write("\t\tif(($(items[i]).offset().top - Scroll - windowHeight)<= -100){\n");
      out.write("\t\t\t$(items[i]).animate({marginLeft:'0px'},'50','swing');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!--个人信息end-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
