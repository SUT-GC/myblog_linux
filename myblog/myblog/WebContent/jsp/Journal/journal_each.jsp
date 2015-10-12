<%@page import="dao.UserDao"%>
<%@page import="dao.ReplyDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="empty.Reply"%>
<%@page import="empty.User"%>
<%@page import="dao.JournalDao"%>
<%@page import="empty.Journal"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <title>日志浏览</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Gc">
    <!-- CSS -->
    <link rel="stylesheet" href="css/journal_each.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!--引入 fontawesom-4.2.0-->
    <link rel="stylesheet" type="text/css" href="fontawesome-4.2.0/css/font-awesome.min.css">
    <!--引入wangEditor.css-->
    <link rel="stylesheet" type="text/css" href="css/wangEditor-1.1.0-min.css">

    <style type="text/css">
        body{
            padding: 0px 10px 0px 10px;
            background-color: #F5F5F5;
        }
    </style>

</head>
<body >
<!-- java start -->
<%
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
%>
<!-- java end -->
    <div class="all">
    <div class="journal_each_all">
    	<%
    		if(id != -1 && journal != null && !classifyS.equals("")){
    	%>
        <div class="journal_nav">
            <a href="Journal.jsp">日志页</a>
            <span class="journal_nav_1">>></span>
            <a href="Journal.jsp?cfy=<%=journal.getClassify()%>"><%=classifyS%></a>
            <span class="journal_nav_2">>></span>
            <a href="#"><%=journal.getTitle()%></a>
        </div>
        <div class="journal_each_article">
            <div class="title"><%=journal.getTitle()%>
            </div>
            <div class="author_data">
                <span  class="author">
                    <span class="author_label">作者:</span>
                    <span class="author_content"><%=journal.getAuthor()%></span>
                </span>
                <span class="date_label">创建时间:</span>
                <span class="date_data"><%=journal.getDatetime()%></span>
            </div>
            <div class="content" readonly>
                <pre class="content_text" ><%=journal.getContent()%></pre>
                <div class="reply">
                    <!--文本编写框start-->
                    <div class="reply-editor">
                        <h3 >填写评论</h3>
						<form action="/myblog/ReplyRelease?uid=<%=userid%>&aid=<%=journal.getJournal_id()%>" method="post">
						 <textarea name="replycontent" rows="5" cols="93" style="font-size:18px; padding-right:20px; padding-left:20px; padding-bottom:10px; padding-top: 10px;" placeholder='请填写您要回复的内容~(^_^)~'></textarea>
						 <div class="btn-group" style="margin-top:10px;">
                        	<button  type="submit" class="btn btn-primary">对文章进行评论</button>
                    	</div>
						</form>
                    </div>
                     <!--文本编写框end-->
                     <%
                     	ArrayList<Reply> list = null;
                     	list = ReplyDao.selectReplyByArticleID(journal.getJournal_id());
                     	for(Reply reply: list){
                     %>
                    <!--回复start-->
                    <hr/>
                    <div class="reply_top">
                        <img style="width:52px; height:52px;" src="../../image/user/head/<%=UserDao.selectUserByID(reply.getUserid()).getUser_imagepath()%>">
                    </div>
                    <div class="reply_bottom">
                        <div>
	                        <a href="#" class="reply_user_name"><%=UserDao.selectUserByID(reply.getUserid()).getUser_nick()%></a>
	                        <span class="reply_date"><%=reply.getReplydate()%></span>
                     	</div>
                     	<div>
                     		<pre class="reply_content"><%=reply.getReplycontent()%></pre>
                     	</div>
                    </div>
                    <!--回复end-->
                    <%} %>
                </div>
            </div>
        </div>
    </div>
    <%
    		}else{
    %>
    <h1 style='color:red'>对不起 ,  没有搜到日志 ......</h1>
    <%
    		}
    %>
    </div>
    <!--引入 jquery.js-->
            <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>

            <!--引入 wangEditor.js-->
            <script type="text/javascript" src='js/wangEditor-1.1.0-min.js'></script>
            <script type="text/javascript">
            /*
    		 * -1: 未执行检查代码
    		 * 0: 用户未登录
    		 * 1: 未检查到article_id
    		 * 2: 未检查到article_content
    		 * 3：数据库插入失败
    		 * 4：发表成功
    		 */
    		 var replyerrI = '<%=replyerr%>';
    		 var replyerrmsg = "";
    		 if(replyerrI!=""){
    			 if(replyerrI == "-1"){
    				 replyerrmsg = "未执行检查代码";
    			 }else if(replyerrI == "0"){
    				 replyerrmsg = "用户未登录";
    			 }else if(replyerrI == "1"){
    				 replyerrmsg = "未检查到article_id";
    			 }else if(replyerrI == "2"){
    				 replyerrmsg = "未检查到article_content";
    			 }else if(replyerrI == "3"){
    				 replyerrmsg = "数据库插入失败";
    			 }else if(replyerrI == "4"){
    				 replyerrmsg = "发表成功";
    			 }
    			 alert(replyerrmsg);
    		 }
                $(function(){
                    $('#spanTime').text((new Date()).toString());

                    //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o 
                    var $editor = $('#txtDiv').wangEditor();

                    //显示 html / text
                    var $textarea = $('#textarea'),
                        $btnHtml = $('#btnHtml'),
                        $btnText = $('#btnText'),
                        $btnHide = $('#btnHide');
                    $textarea.hide();
                    $btnHtml.click(function(){
                        $textarea.show();
                        $textarea.val( $editor.jsp() );
                    });
                    $btnText.click(function(){
                        $textarea.show();
                        $textarea.val( $editor.text() );
                    });
                    $btnHide.click(function(){
                        $textarea.hide();
                    });
                });
            </script>
</body>
</html>