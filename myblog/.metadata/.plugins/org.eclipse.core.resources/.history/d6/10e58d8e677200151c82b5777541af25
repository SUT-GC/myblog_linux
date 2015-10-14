<%@page import="dao.ReplyDao"%>
<%@page import="other.Tool"%>
<%@page import="dao.JournalDao"%>
<%@page import="empty.Journal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--java 绝对地址 start  -->
<%
	String urlp = application.getContextPath()+"/jsp/";
	System.out.println(urlp);
%>
<!-- java 绝对地址 end -->
  <meta charset="UTF-8">
  <link href="<%=urlp%>nav/css/news.css" rel="stylesheet">
  <link href="<%=urlp%>nav/css/nav.css" rel="stylesheet">
  <title>GC的博客</title>
  <style type="text/css">
        body {
          background-color:#edecec;
          background-image: url('<%=urlp%>nav/img/1.jpg');
          background-position: center;
          background-repeat:repeat;
          background-attachment: fixed;
          background-size: 100%,auto;
        }
        
  </style>
</head>
<body>
<!--导航开始-->
	<!-- java start -->
	<%
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
	%>
	<!-- java end -->
  <div id="nav">
    <ul class="nav-menu clearfix unstyled">
      <li><a href="#" class="three-d active">
        主页
        <span class="three-d-box"><span class="front">主页</span><span class="back">主页</span></span>
      </a></li>
      <li><a href="<%=urlp%>Journal/Journal.jsp" class="three-d">
        日志
        <span class="three-d-box"><span class="front">日志</span><span class="back">日志</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        TA
        <span class="three-d-box"><span class="front">TA</span><span class="back">TA</span></span>
      </a></li>
      <li><a href="<%=urlp%>information/information.jsp" class="three-d">
        博主
        <span class="three-d-box"><span class="front">博主</span><span class="back">博主</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        空间
        <span class="three-d-box"><span class="front">空间</span><span class="back">空间</span></span>
      </a></li>
      <li><a href="<%=urlp%>editor/messagebox.jsp" class="three-d">
        留言板
        <span class="three-d-box"><span class="front">留言板</span><span class="back">留言板</span></span>
      </a></li>
      <li><a href="<%=urlp%>back/back_login.jsp" class="three-d">
        后台
        <span class="three-d-box"><span class="front">后台</span><span class="back">后台</span></span>
      </a></li>
      <%
      	if(user == null){
      %>
      <li><a href="#" class="three-d">
        登陆/注册
        <span class="three-d-box"><span class="front">登陆/注册</span><span class="back">登陆/注册</span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="<%=urlp%>/login/login.jsp" class="three-d">
              登陆
              <span class="three-d-box"><span class="front">登陆</span><span class="back">登陆</span></span>
          </a></li>
          <li><a href="<%=urlp%>registered/registered.jsp" class="three-d">
            注册
            <span class="three-d-box"><span class="front">注册</span><span class="back">注册</span></span>
          </a></li>
        </ul>
      </li>
      <%}else{ %>
      <li><a href="#" class="three-d">
        登陆成功/登出
        <span class="three-d-box"><span class="front">登陆成功/登出</span><span class="back"><%=user.getUser_nick()%></span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="/myblog/SessionDo" class="three-d">
            登出
            <span class="three-d-box"><span class="front">登出</span><span class="back">登出</span></span>
          </a></li>
        </ul>
      </li>
      <%} %>
    </ul>
  </div>
<!--导航结束-->
<!--最新更新start--> 
	<!-- java start -->
	<%
		ArrayList<Journal> list = null;
		list = JournalDao.SelectTopJournal5();
	%>
	<!-- java end -->
  <div class="center_show">
    <div class="topnews">
        <h1>^_^&nbsp&nbsp<b>文章</b>推荐&nbsp&nbsp^_^</h1>
        <%
        	for(Journal journal:list){
        %>
        <div class="blogs">
          <figure><img style='width:180px; height:180px;' src="<%=urlp%>../image/journalheader/<%=journal.getImgpath()%>"></figure>
          <ul>
            <h3><a href="<%=urlp%>/Journal/journal_each.jsp?id=<%=journal.getJournal_id()%>"><%=journal.getTitle()%></a></h3>
            <div class="journal_summary">
            	<p><%=journal.getSummary()%></p>
            </div>
            <p class="autor"><span class="lm f_l"><a href="<%=urlp%>/Journal/Journal.jsp?cfy=<%=journal.getClassify()%>"><%=Tool.ClassifyNumToClassify(journal.getClassify())%></a></span><span class="dtime f_l"><%=Tool.changDateTile(journal.getDatetime())%></span><span class="viewnum f_r">浏览（<a href="#">很多</a>）</span><span class="pingl f_r">评论（<a href="#"><%=ReplyDao.countReplyByArticleID(journal.getJournal_id())%></a>）</span></p>
          </ul>
        </div>
         <%
        	}
        %>
      </div>
    </div>
  </div>
<!--最新更新end-->
<!--留白start-->
  <div class="blank">Designed and built with all the love in the world by <a href="#">@GC</a></div>
  <div class="blank-bottom">用爱创造世界</div>
<!--留白end-->
</body>
</html>
  <script type="text/javascript">
	var ds = "";
	ds = <%=ds%>;
	if(ds == 1){
		alert("登出成功，跳转到微博主页");
	}
  </script>