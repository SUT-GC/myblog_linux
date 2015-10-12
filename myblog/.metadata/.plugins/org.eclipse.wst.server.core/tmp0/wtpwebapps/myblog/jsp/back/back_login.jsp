<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆后台管理</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">

        <!-- Bootstrap Admin Theme -->
        <link href="css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">

        <!-- Custom styles -->
        <style type="text/css">
            .alert{
                margin: 0 auto 20px;
            }
            .sorrymsgy{
            	color:#FF9900;
            }
            .sorrymsgr{
            	color: red;
            }
        </style>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
</head>
<body class="bootstrap-admin-without-padding">
<!-- java start -->
<%
	User user = null;
	int is_admin = 0;
	if(session.getAttribute("user")!= null){
		user = (User)session.getAttribute("user");
		if(user.getUser_isadmin() == 1){
			is_admin = 1;
		}
	}
	
	//验证登陆回来的信息
	String msg = "";
	if(request.getParameter("msg")!=null){
		msg = request.getParameter("msg");
	}
%>
<!-- java end -->
        <div class="container">
            <div class="row">
                <div class="alert alert-info">
                    <a class="close" data-dismiss="alert" href="#">&times;</a>
                    请输入正确的管理员用户名和密码！
                </div>
                <form method="post" action="/myblog/AdminSessionDo" class="bootstrap-admin-login-form">
                    <h1>登录</h1>
                    <%if(user != null && user.getUser_isadmin() == 1) {%>
                    <div class="form-group">
                        <input class="form-control" type="text" name="username" placeholder="账号">
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="password" name="password" placeholder="密码">
                    </div>
                    <div class="form-group">
                        <label>
                            <input type="checkbox" name="remember_me">
                           记住密码
                        </label>
                    </div>
                    <input class="btn btn-lg btn-primary" type="submit" value="提交"/>
                    <%}else{ %>
                    <h2 class="sorrymsgy">对不起，您不是我们的管理员</h2><h1  class="sorrymsgr">您无权登陆</h1><hr/>
                    <a href="javascript:history.go(-1)">请返回上一个页面~(^_^)~</a>
                    <%} %>
                </form>
            </div>
        </div>

        <script type="text/javascript" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
        	//判断是否是admin	
        	var isadmin = '<%=is_admin%>';
        	if(isadmin == 0){
        		alert('对不起，您不是我们的管理员');
        	}
        	
        	var message = '<%=msg%>';
        	if(message != ""){
	        	if(message == 0){
	        		alert('对不起，用户名错误');
	        	}else{
	        		alert('对不起，密码错误');
	        	}
        	}
        	
            $(function() {
                // Setting focus
                $('input[name="email"]').focus();
                // Setting width of the alert box
                var formWidth = $('.bootstrap-admin-login-form').innerWidth();
                var alertPadding = parseInt($('.alert').css('padding'));
                $('.alert').width(formWidth - 2 * alertPadding);
            });
        </script>
    </body>
</html>