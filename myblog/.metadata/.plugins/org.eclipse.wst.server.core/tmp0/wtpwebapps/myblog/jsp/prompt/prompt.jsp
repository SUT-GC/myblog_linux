<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>提示页面</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
<style type="text/css">
body {
	background-color: #000;
}
</style>
</head>
<body>
<div id="header">
	<h1 style="margin-left: 30px;"><a >Gc blog </a></h1>
</div>
<div id="pages">
	<h2>Pages</h2>
	<ul>
		<li><a id="page1" href="../nav/index.jsp">博客主页</a></li>
		<li><a id="page2" href="../Journal/Journal.jsp">博客日志</a></li>
		<li><a id="page3" href="../update/update.jsp">TA</a></li>
		<li><a id="page4" href="../information/information.jsp">博主信息</a></li>
		<li><a id="page5" href="../editor/messagebox.jsp">留言板</a></li>
		<li><a id="page6" href="../login/login.jsp">登陆/注册</a></li>
	</ul>
</div>
<div id="content">
	<div id="posts">
		<div class="post">
			<h2 class="title">该页面功能正在开发ing......</h2>
			<h3 class="posted">The page function is being developed....</h3>
			<div class="story">
				<p><h1><em><strong>该页面正在开发,敬请关注.</strong></em></h1> </p>
				<p><h4><em>为了补偿给您带来的不便,我们在下面将会给您提供方便的连接.</em></h4> </p>
			</div>
			<div class="meta">
				<p><a>2015-10-17 15:00</a></p>
			</div>
		</div>
		<div class="post">
			<h2 class="title">友情连接</h2>
			<h3 class="posted">Provided Links......</h3>
			<div class="story">
				<p>link list:</p>
				<ol>
					<li>百度: <a href="https://www.baidu.com" target="_blank">www.baidu.com</a></li>
					<li>cd 沈阳工业大学官网: <a href="http://www.sut.edu.cn/" target="_blank">www.sut.edu.cn</a></li>
					<li>SUTACM: <a href="https://acm.sut.edu.cn" target="_blank">acm.sut.edu.cn</a></li>
					<li>SUTOJ: <a href="http://sutoj.cwengo.com/" target="_blank">sutoj.cwengo.com</a></li>
					<li>HDUOJ: <a href="http://acm.hdu.edu.cn/" target="_blank">acm.hdu.edu.cn </a></li>
					<li>POJ: <a href="http://poj.org/" target="_blank">poj.org</a></li>
					<li>cwen博客: <a href="http://www.cwengo.com/" target="_blank">cwengo.com</a></li>
				</ol>
			</div>
			<div class="meta">
				<p><a>2015-10-17 15:00</a></p>
			</div>
		</div>
	</div>
	</div>
<script type="text/javascript" class="autoinsert" src="js/jquery-1.2.6.min.js"></script> 
<script src="js/snowfall.jquery.js"></script> 
<script>
        $(document).snowfall('clear');
        $(document).snowfall({
            image: "images/huaban.png",
            flakeCount:30,
            minSize: 5,
            maxSize: 22
        });
    </script>
<!-- 站长统计 -->
<script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1256817075'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/z_stat.php%3Fid%3D1256817075%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));</script>
<!-- 站长统计结束 -->
</body>
</html>