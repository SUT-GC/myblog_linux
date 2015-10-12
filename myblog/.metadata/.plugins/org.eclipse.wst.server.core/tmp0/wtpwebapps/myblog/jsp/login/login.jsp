<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <head>

        <meta charset="utf-8">
        <title>用户登陆</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/supersized.css">
        <link rel="stylesheet" href="css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body oncontextmenu="return false">
		<!-- java start -->
		<%
			String rs = "";
			if(request.getParameter("Rm")!=null){
				rs = request.getParameter("Rm");
			}
			String ls = "";
			if(request.getParameter("Lm")!=null){
				ls = request.getParameter("Lm");
			}
			System.out.println("rs = "+rs+"/ls = "+ls);
		%>
		<!-- java end -->
        	<div class="page-container">
            <h1>Login</h1>
            <form action="/myblog/LoginDo" method="post">
				<div>
					<input type="text" name="username" class="username" placeholder="账号"  autocomplete="off"/>
				</div>
                <div>
					<input type="password" name="password" class="password" placeholder="密码"     oncontextmenu="return false" onpaste="return false" />
                </div>
                <!--  
                <button id="submit" type="button">登陆</button>
                -->
                <input type = "submit" id="submit" type="button" value="登陆" />
           	</form>
	        <form >
	          	<button id="register" type="button" onclick="toRegister()">注册</button>
	        </form>
            <div class="connect">
                <p>You cannot improve your past, but you can improve your future. </p>
				<p style="margin-top:20px;">你不能改变你的过去，但你可以让你的未来变得更美好。</p>
            </div>
        </div>
		<div class="alert" style="display:none">
			<h2>消息</h2>
			<div class="alert_con">
				<p id="ts"></p>
				<p style="line-height:70px"><a class="btn">确定</a></p>
			</div>
		</div>

        <!-- Javascript -->
		<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
        <script src="js/supersized.3.2.7.min.js"></script>
        <script src="js/supersized-init.js"></script>
		<script>
		$(document).ready(function(){
			var rs = '<%=rs%>';
			var ls = '<%=ls%>';
			if(rs != "" && rs == '1'){
				$("#ts").html('恭喜您，注册成功，请登录 ! ');
				is_show();
			}
			var lmsg = "";
			if(ls != ""){
				if(ls == 0){
					lmsg += "对不起, 账号或密码不能为空 ! ";
				}
				if(ls == 1){
					lmsg += "恭喜您，登陆成功 ! ";
				}
				if(ls == 2){
					lmsg += "对不起, 账号不存在 ! ";
				}
				if(ls == 3){
					lmsg += "对不起, 密码错误 ! ";
				}
				if(lmsg != ""){
					$("#ts").html(lmsg);
					is_show();
				}
			}
		});
		
		$(".btn").click(function(){
			is_hide();
		})
		var u = $("input[name=username]");
		var p = $("input[name=password]");
		$("#submit").live('click',function(){
			if(u.val() == '' || p.val() =='')
			{
				$("#ts").html("用户名或密码不能为空~");
				is_show();
				return false;
			}
			else{
				var reg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
				if(!reg.exec(u.val()))
				{
					$("#ts").html("用户名错误格式");
					is_show();
					return false;
				}
			}
		});
		function toRegister(){
			 window.location.href='../registered/registered.jsp';
		}
		window.onload = function()
		{
			$(".connect p").eq(0).animate({"left":"0%"}, 600);
			$(".connect p").eq(1).animate({"left":"0%"}, 400);
		}
		function is_hide(){ $(".alert").animate({"top":"-40%"}, 300) }
		function is_show(){ $(".alert").show().animate({"top":"45%"}, 300) }
		</script>
    </body>

</html>

