/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-10-16 03:35:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Journal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import dao.JournalDao;
import java.util.ArrayList;
import empty.Journal;
import empty.User;

public final class Journal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("\t\t<title>博主日志</title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Grid Loading and Hover Effect: Recreating Samsung's grid loading effect\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"grid loading, swipe, effect, slide, masonry, web design, tutorial\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://dreamsky.github.io/main/blog/common/init.css\">\n");
      out.write("\t\t<!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"//cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("\t\t<style>\n");
      out.write("\t\t/*分类按钮css开始*/\n");
      out.write("\t\t.classification{\n");
      out.write("\t\t\tmargin-top: 50px;\n");
      out.write("\t\t\tpadding-left:15%;\n");
      out.write("\t\t\tpadding: 15px 10px;\n");
      out.write("\t\t\tborder: solid 2px  #db6d4c;\n");
      out.write("\t\t\twidth: 74%;\n");
      out.write("\t\t\tmargin-left: 13%;\n");
      out.write("\t\t\tborder-radius: 15px;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tmargin-bottom: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.cif{\n");
      out.write("\t\t\tmargin-left: 10px;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t}\n");
      out.write("\t\t/*分类按钮css结束*/\n");
      out.write("\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tbackground: #9AE7E2;\n");
      out.write("\t\t}\n");
      out.write("\t\t/*#9AE7E2*/\n");
      out.write("\t\t.codrops-demos a.current-demo {\n");
      out.write("\t\t\tcolor: #999;\n");
      out.write("\t\t}\n");
      out.write("\t\t.codrops-header h1 {\n");
      out.write("\t\t\tmargin-top: 50px;\n");
      out.write("\t\t\tfont-family: 'Microsoft Yahei';\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t/*导航的css&js开始*/\n");
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
      out.write("       \n");
      out.write("        \n");
      out.write("        /* basic menu styles */\n");
      out.write("        .nav-menu {\n");
      out.write("          display: block;\n");
      out.write("         /* background: #74adaa;*/\n");
      out.write("          width:1000px;\n");
      out.write("          margin: 15px auto 0px;\n");
      out.write("          padding-left: 5%;\n");
      out.write("\t\t  padding-top:3%;\n");
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
      out.write(" /*搜寻框start*/\n");
      out.write(" \t.form{\n");
      out.write(" \t\tfloat: right;\n");
      out.write(" \t}\n");
      out.write(" \t.form-submit{\n");
      out.write(" \t\tfloat: right;\n");
      out.write(" \t}\n");
      out.write(" \t.form-control{\n");
      out.write(" \t\twidth: 70%;\n");
      out.write(" \t\tfloat: left;\n");
      out.write(" \t}\n");
      out.write(" \t\n");
      out.write(" /*搜寻框end*/\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
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
      out.write("      <li><a href=\"Journal.jsp\" class=\"three-d active\">\n");
      out.write("        日志\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">日志</span><span class=\"back\">日志</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\n");
      out.write("        TA\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">TA</span><span class=\"back\">TA</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"../information/information.jsp\" class=\"three-d\">\n");
      out.write("        博主\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">博主</span><span class=\"back\">博主</span></span>\n");
      out.write("      </a></li>\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\n");
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
      out.write("<!--分类按钮start-->\n");
      out.write("\t<div class=\"classification\">\n");
      out.write("\t\t<a href=\"?cfy=1\"><button id=\"javabtn\" class=\"btn btn-primary cif\" id=\"java\" type=\"button\">Java</button></a>\n");
      out.write("\t\t<a href=\"?cfy=2\"><button id=\"algobtn\" class=\"btn btn-success cif\" id=\"algo\" type=\"button\">算法</button></a>\n");
      out.write("\t\t<a href=\"?cfy=3\"><button id=\"hcjbtn\" class=\"btn btn-info cif\" id=\"hcj\" type=\"button\">Html/css/js</button></a>\n");
      out.write("\t\t<a href=\"?cfy=4\"><button id=\"lifebtn\" class=\"btn btn-warning cif\" id=\"life\" type=\"button\">生活随笔</button></a>\n");
      out.write("\t\t<a href=\"?cfy=5\"><button id=\"reselbtn\" class=\"btn btn-danger cif\" id=\"other\" type=\"button\">读书笔记</button></a>\n");
      out.write("\t\t<a href=\"?cfy=6\"><button class=\"btn btn-primary cif\" id=\"rese1\" type=\"button\">其他</button></a>\n");
      out.write("\t\t<a href=\"?cfy=7\"><button class=\"btn btn-success cif\" type=\"rese2\" disabled>预留</button></a>\n");
      out.write("\t\t<a href=\"?cfy=8\"><button class=\"btn btn-info cif\" type=\"rese3\" disabled>预留</button></a>\n");
      out.write("\t\t<form action=\"Journal.jsp\" method=\"post\" class=\"form\">\n");
      out.write("\t\t   \t<input name=\"liketitle\" type=\"text\" class=\"form-control\" placeholder=\"输入可能存在的标题\">\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-default form-submit\" > Select! </button>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!--\n");
      out.write("\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("\t        <div class=\"form-group\">\n");
      out.write("\t          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("\t        </div>\n");
      out.write("        \t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("      \t</form>\n");
      out.write("      \t-->\n");
      out.write("\t</div>\n");
      out.write("<!--分类按钮end-->\n");
      out.write("<!-- java start -->\n");
      out.write("\t");

		ArrayList <Journal> list = new ArrayList();
		System.out.print("~"+request.getParameter("cfy")+"~");
		if(request.getParameter("cfy")==null){
			if(request.getParameter("liketitle")== null){
				list = JournalDao.journalSelect();	
			}else{
				list = JournalDao.selectJournalLikeTitle(request.getParameter("liketitle"));
			}
		}else{
			if(request.getParameter("liketitle")== null){
				list = JournalDao.selectJournalByClassify(Integer.parseInt(request.getParameter("cfy")));	
			}else{
				list = JournalDao.selectJournalLikeTitle(request.getParameter("liketitle"));
			}
		}
	
      out.write("\n");
      out.write("<!-- java end -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<section class=\"grid-wrap\">\n");
      out.write("\t\t\t\t<ul class=\"grid swipe-down\" id=\"grid\">\n");
      out.write("\t\t\t\t");

					for(Journal journal : list){
				
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"journal_each.jsp?id=");
      out.print(journal.getJournal_id());
      out.write("\"><img style='width:300px; height:340px;' src=\"/myblog/image/journalheader/");
      out.print(journal.getImgpath());
      out.write("\" alt=\"img01\"><h3>");
      out.print(journal.getTitle());
      out.write("</h3></a></li>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t\t<div class=\"footer-banner\" style=\"width:728px; margin:160px auto 100px\"></div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<!--留白start-->\n");
      out.write("\t\t<div style=\"text-align: center;\">\n");
      out.write("\t\t  <div class=\"blank\">Designed and built with all the love in the world by <a href=\"#\">@GC</a></div>\n");
      out.write("\t\t  <div class=\"blank-bottom\">用爱创造世界</div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t<!--留白end-->\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<script src=\"js/masonry.pkgd.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t<script src=\"js/colorfinder-1.1.js\"></script>\n");
      out.write("\t\t<script src=\"js/gridScrollFx.js\"></script>\n");
      out.write("\t\t<script src=\"http://libs.baidu.com/jquery/1.7.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tnew GridScrollFx( document.getElementById( 'grid' ), {\n");
      out.write("\t\t\t\tviewportFactor : 0.4\n");
      out.write("\t\t\t} );\n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t$(\"#javabtn\").click(function(){\n");
      out.write("\t\t\t\t\t$(\".classify1\").hide();\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
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
