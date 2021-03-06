<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>请上传您的头像</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/default.css">
	<!--[if IE]>
		<script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
	<![endif]-->
</head>
<body>
<!-- java start -->
<%
	User user = null;
	if(session.getAttribute("user")!=null){
		user = (User)session.getAttribute("user");
	}
	String uploadimgmsg = "";
	String uploadfilename = "";
	if(request.getParameter("ilr")!=null && request.getParameter("fn")!=null){
		uploadimgmsg = request.getParameter("ilr");
	}
%>
<!-- java end -->
	<div class="htmleaf-container">
	<%if(user != null){ %>
		<header class="htmleaf-header">
			<h1>请上传您的头像 (仅仅支持 jpg, png, gif 合适的图片) <span>Please upload your avatar (only JPG, PNG, GIF)</span></h1>			
			<a href="/myblog/jsp/nav/index.jsp"><h2>返回博客主页</h2></a>	
		</header>
		<!--<div class="htmleaf-content bgcolor-8">
		</div>-->
		<div class="container kv-main">
            <div class="page-header">
            <h3>请点击"选择文件" , 选中您想上传的图片 , 点击"确定上传"<small></h3>
            <h4 style="color:#FF0000">只能添加一张图片,且大小不能超过1M</h4>
            <h4 style="color:#FF0000">所选择的图片越接近正方形,显示的效果越好.</h4>
            </div>
            <form enctype="multipart/form-data" action="/myblog/UpdateHeadImg?userid=<%=user.getUser_id()%>" method="post">
               		<input style="width: 100%;" name="myfile" type="file"/>
                 <input type="submit" style="width: 100%;" name="fileupload" value ="确定上传"class=" uploadbtn btn btn-success input_buttons_submit"/>
            </form>
        </div>
	</div>
	<%}else{ %>
	<h1>请先进行用户登陆</h1>	
	<a href="/myblog/jsp/nav/index.jsp"><h2>返回博客主页</h2></a>	
	<%} %>
	<script src="http://libs.useso.com/js/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js" type="text/javascript"></script>
    <script>
    	var errmsg = '<%=uploadimgmsg%>';
    	var altmsg = "";
    	/*
		 * 1:上传成功
		 * 2:上传失败
		 * 2.1:上传失败,格式不正确
		 * 2.2:上传失败,大小超过1M
		 * 3:上传失败,已经有该文件
		 * 4:用户未登录
		 * 5:执行sql失败
		 */

    	if(errmsg != ""){
    		if(errmsg == "1"){
    			altmsg = "上传成功, 请您单击'返回微博主页'进行返回";
    		}else if(errmsg == "2"){
    			altmsg = "上传失败";
    		}else if(errmsg == "2.1"){
    			altmsg = "上传失败,格式不正确";
    		}else if(errmsg == "2.2"){
    			altmsg = "上传失败,大小超过1M";
    		}else if(errmsg == "3"){
    			altmsg = "上传失败,已经有该文件";
    		}else if(errmsg == "4"){
    			altmsg = "用户未登录";
    		}else if(errmsg == "5"){
    			altmsg = "执行sql失败";
    		}
    		alert(altmsg);
    	}
	    
		</script>
</body>
</html>