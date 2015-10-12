<%@page import="dao.UserDao"%>
<%@page import="empty.Message"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MessDao"%>
<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>留言板</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!--引入导航栏nav.css-->
    <link href="css/nav.css" rel="stylesheet">
    <!--引入 fontawesom-4.2.0-->
    <link rel="stylesheet" type="text/css" href="fontawesome-4.2.0/css/font-awesome.min.css">
    <!--[if IE]>
    <link rel="stylesheet" type="text/css" href="fontawesome-4.2.0/css/font-awesome-ie7.min.css">
    <![endif]-->
    <!--引入massagebox.css-->
    <link rel="stylesheet" type="text/css" href="css/messagebox.css">
    <!--引入wangEditor.css-->
    <link rel="stylesheet" type="text/css" href="css/wangEditor-1.1.0-min.css">
    <!--引入bootstrap.min.css-->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <style type="text/css">
    </style>

    <!--引入 jquery.js-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>

    <!--引入 wangEditor.js-->
    <script type="text/javascript" src='js/wangEditor-1.1.0-min.js'></script>
    <script type="text/javascript">
        $(function(){
            $('#spanTime').text((new Date()).toString());

            //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o 
            var $editor = $('#txtDiv').wangEditor();

            <%for(int i = 1; i <= 10; i++){%>
            //显示 html / text
            var $replybutton<%=i%> = $('.reply-button<%=i%>');
            var $replytextarea<%=i%> = $('#replytextarea<%=i%>');
            var $teplytexthide<%=i%> = $('#btnhide<%=i%>');
            
            $replytextarea<%=i%>.hide();
            $replybutton<%=i%>.click(function(){
         	 	$replytextarea<%=i%>.show();
         	 });
         	$teplytexthide<%=i%>.click(function(){
         		$replytextarea<%=i%>.hide();
         	});
         	<%}%>
        });
    </script>
</head>
<body class="b">
<div class="all">
<!--导航开始-->
	<!-- java start -->
	<%
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
	%>
<!-- java end -->
  <div id="nav">
    <ul class="nav-menu clearfix unstyled">
      <li><a href="../nav/index.jsp" class="three-d ">
        主页
        <span class="three-d-box"><span class="front">主页</span><span class="back">主页</span></span>
      </a></li>
      <li><a href="../Journal/Journal.jsp" class="three-d">
        日志
        <span class="three-d-box"><span class="front">日志</span><span class="back">日志</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        TA
        <span class="three-d-box"><span class="front">TA</span><span class="back">TA</span></span>
      </a></li>
      <li><a href="../information/information.jsp" class="three-d">
        博主
        <span class="three-d-box"><span class="front">博主</span><span class="back">博主</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        空间
        <span class="three-d-box"><span class="front">空间</span><span class="back">空间</span></span>
      </a></li>
      <li><a href="#" class="three-d active">
        留言板
        <span class="three-d-box"><span class="front">留言板</span><span class="back">留言板</span></span>
      </a></li>
      <li><a href="../back/back_login.jsp" class="three-d">
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
          <li><a href="../login/login.jsp" class="three-d">
              登陆
              <span class="three-d-box"><span class="front">登陆</span><span class="back">登陆</span></span>
          </a></li>
          <li><a href="../registered/registered.jsp" class="three-d">
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
<%
    int pagec = 1;
   	if(request.getParameter("page")!=null){
		pagec = Integer.parseInt(request.getParameter("page"));
	}
%>
<!--留言板start-->
    <div class="messagebox">
        <h2 class="messgebox-zh">留言板:</h2>
        <div class="messagebox-sendword">
            <h3 class="messagebox-sendword-title" style='margin-left:10px;color:#0000CC'>主人寄语</h3>
            <p class="messagebox-sendword-content" style='margin-left:10px; color:#0000CC;font-size:17px'>这是主人寄语的内容（阿迪几啊考虑到加拉看的叫卡拉胶打卡机打卡机都卡死了加大了肯定就爱看劳动局阿卡拉）</p>
        </div>
        <!--文本编写框start-->
        <div class="writeword">
            <div class="send-words-prompt" style='font-size:19px; color:#FF9900'>请填写并发表您的留言</div>
            <form action="/myblog/MessageRelease?userid=<%=userid%>" method="post">
	            <div style='margin-top:5px;'>
	                <textarea name = "firstmessage"id='textarea' style='width:98%; height:130px; margin:10px; font-size:17px; padding:10px;' placeholder='请填写您要留言的内容~(^_^)~'></textarea>
	                <button type="submit" id='btnHtml' style='margin-top:5px;'  >发表留言</button>
	                <button type="reset" id='btnText' style='margin-top:5px;' >清除内容</button>
	            </div>
            </form>
        </div>
        <!--文本编写框end-->
        <div class="messagebox-message">
            <div class="messagebox-message-num">
                留言(<a href="#"><%=MessDao.countFirstMess()%></a>)
            </div>
            <!--留言列表start-->
            <div class="messagebox-message-content">
            	<div style='text-align: center'><h2>第 <a href="#"><%=pagec%> </a>页</h2></div>
                <!--每个人的留言楼层start-->
                <!-- java start -->
                <%
                	ArrayList <Message> firstlist = null;
                	int pages = 1;
                	if(request.getParameter("page")== null || request.getParameter("page").equals("1")){
                		pages = 1;
                	}else{
                		pages = Integer.parseInt(request.getParameter("page"));
                	}
                	firstlist = MessDao.selectMessByLimit((pages-1)*10, 10);
                %>
                <!-- java end -->
                <div class="messagebox-message-content-floor">
                <%
                	int i = 0;
                	for(Message message: firstlist){
                		i++;
                %>
                    <div class="floor-left">
                        <img style="width: 52px; height: 52px;" src="../../image/user/head/<%=UserDao.selectUserByID(message.getUser_id()).getUser_imagepath()%>">
                    </div>
                    <div class="floor-right">
                        <div class="floor-username_floor-num">
                            <a class="username"><%=UserDao.selectUserByID(message.getUser_id()).getUser_nick()%></a>
                            <span class="floornum">第<a><%=message.getFloor_id()%></a>楼</span>
                        </div>
                        <div class="floor-content">
                            <pre class="content"><%=message.getMessbox_reply()%></pre>
                        </div>
                        <div class="floor-right-bottom">
                            <span class="msgtime"><%=message.getMessbox_date()%></span>
                            <button class="reply-button<%=i%>">回复</button>
                        </div>
                        <form action="/myblog/MessageRelease?floorid=<%=message.getFloor_id()%>&userid=<%=userid%>&touserid=<%=message.getUser_id()%>" method="post">
				            <div id="replytextarea<%=i%>" style='margin-top:5px;'>
				                <textarea name='replytextarea' id='textarea' style='width:98%; height:100px; margin:10px; font-size:15px; padding:10px;' placeholder='请填写您要回复的内容~(^_^)~'></textarea>
				                <button type="submit" id='btnHtml' style='margin-top:5px;' >回复</button>
				                <button type="reset" id='btnText' style='margin-top:5px;' >重置</button>
				                <button type="button" id='btnhide<%=i%>' style='margin-top:5px;'>隐藏</button>
				            </div>
            			</form>
                        <hr/>
                        <!--回复列表start-->
                        <div class="reply">
                        <%
                        	ArrayList <Message> secoundlist = null;
                        	secoundlist = MessDao.selectSecoundMessByFloor(message.getFloor_id());
                        	
                        	for(Message secoundmessage:secoundlist){
                        %>
                            <div class="reply-left">
                                <img style="width: 40px; height: 40px;" src="/myblog/image/user/head/<%=UserDao.selectUserByID(secoundmessage.getUser_id()).getUser_imagepath()%>">
                            </div>
                            <div class="reply-right">
                                <div class="reply-right-top">
                                    <a class="reply-username"><%=UserDao.selectUserByID(secoundmessage.getUser_id()).getUser_nick()%></a>
                                </div>
                                <div class="reply-content">
                                    <pre class="reply-content-text"><%=secoundmessage.getMessbox_reply()%></pre>
                                </div>
                                <div class="reply-time"><%=secoundmessage.getMessbox_date()%></div>
                            </div>
                            <%} %>
                        </div>
                        <!--回复列表end-->
                    </div>
                    <%} %>
                </div>
                <hr/>
                <!--每个人的留言楼层end-->
                <!--分页start-->
                <div class="messagebox-nav">
                    <nav>
                      <ul class="pagination">
                        <%
                        	//计算需要多少页面按钮
                        	int sum = MessDao.countFirstMess();
                        	int pagecount = (sum / 10)+1;
                        	if(pagecount <= 10){
                        		for(i = 1; i <= pagecount; i++){
                        %>
                        <li <%if(pagec == i){ %>class="active"<%} %>><a href="?page=<%=i%>" ><%=i%></a></li>
                        <%
                        		}
                        	}else{
						%>  
						<li>
                          <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>                      
                        <%		for(i = 1; i <= 10; i++){
                        %>
                        <li><a href="#"><%=i%></a></li>
                        <%		}
                        %>
                        <li>
                          <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                          </a>
                        </li>
                        <%	
                        	}
                        %>
                      </ul>
                    </nav>
                </div>
            <!--分页end-->
            </div>
            <!--留言列表end-->
        </div>
    </div>
<!--留言板end-->
</div>
</body>
<script type="text/javascript">

//  变量err返回发布留言的后台验证信息
//  0:用户未登录，不能进行留言
//  1:request中的留言内容参数未找到
//  2:留言内容不能为空
//  3:用户留言成功
 
	var err1 = '<%=errmsg%>';
	/*
	 * 变量errrep 返回发布回复的后台验证信息
	 * 0: 用户未登录
	 * 1: floorid未检查到
	 * 2: touserid未检查到
	 * 3: 回复内容不能为空
	 * 4: 恭喜您，回复成功
	 */
	var err2 = '<%=errrep%>';
	var errmsg = "";
	if(err1 != ""){
		if(err1 == "0"){
			errmsg += "只有登陆之后才能发表留言，请您先进行登陆~(^_^)~";
		}
		if(err1 == "1"){
			errmsg += "request中的留言内容参数未找到";
		}		
		if(err1 == "2"){
			errmsg += "对不起，留言内容不能为空 !";
		}
		if(err1 == "3"){
			errmsg +="恭喜您， 留言成功 ！ ";
		}
		alert(errmsg);
	}
	if(err2 !=""){
		if(err2 == "0"){
			errmsg += "只有登陆之后才能回复留言，请您先进行登陆~(^_^)~";
		}
		if(err2 == "1"){
			errmsg += "系统错误1";
		}
		if(err2 == "2"){
			errmsg += "系统错误2";
		}
		if(err2 == "3"){
			errmsg += "回复的内容不能为空"
		}
		if(err2 == "4"){
			errmsg += "恭喜您，回复成功";
		}
		alert(errmsg);
	}
</script>
</html>