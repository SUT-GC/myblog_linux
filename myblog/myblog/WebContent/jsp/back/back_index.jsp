<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gc微博后台</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">

<!-- Bootstrap Admin Theme -->
<link href="css/bootstrap-admin-theme.css" rel="stylesheet"
	media="screen">

<!-- Vendors -->
<link href="vendors/easypiechart/jquery.easy-pie-chart.css"
	rel="stylesheet" media="screen">
<link href="vendors/easypiechart/jquery.easy-pie-chart_custom.css"
	rel="stylesheet" media="screen">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
        <script type="text/javascript" src="js/html5shiv.js"></script>
        <script type="text/javascript" src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body class="bootstrap-admin-with-small-navbar">
	<nav class="navbar navbar-default navbar-inverse navbar-fixed-top "
		role="navigation">
	<div class="container">
		<div class="row">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Gc微博后台</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">首页</a></li>
					<li><a href="back_help.jsp">使用介绍</a></li>
				</ul>
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="请输入内容">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">管理员<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/myblog/AdminSessionLogout">退出登录</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
	</div>
	</nav>

	<div class="container">
		<!-- left, vertical navbar & content -->
		<div class="row">
			<!-- left, vertical navbar -->
			<div class="col-md-2 bootstrap-admin-col-left">
				<ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
					<li class="active"><a href="back_index.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 首页</a></li>
					<li><a href="back_about.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 关于我们</a></li>
					<li class="disabled"><a href="#"><i
							class="glyphicon glyphicon-chevron-right"></i> 日历</a>
					<!-- calendar.html --></li>
					<li class="disabled"><a href="#"><i
							class="glyphicon glyphicon-chevron-right"></i> 统计图表</a>
					<!-- stats.html --></li>
					<li><a href="back_journal_release.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 日志发布</a></li>
					<li><a href="back_journal_admin.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 日志管理</a></li>
					<li><a href="back_users.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 用户管理</a></li>
					<li><a href="back_message.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 留言管理</a></li>
					<li><a href="back_image.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 图片管理</a></li>
					<li><a href="back_admin_information.jsp"><i
							class="glyphicon glyphicon-chevron-right"></i> 账户中心</a></li>
					<li><a href="#"><i
							class="glyphicon glyphicon-chevron-right"></i> 留白1</a></li>
					<li><a href="#"><i
							class="glyphicon glyphicon-chevron-right"></i> 留白2</a></li>
					<li><a href="#"><i
							class="glyphicon glyphicon-chevron-right"></i> 留白3</a></li>
					<li><a href="#"><i
							class="glyphicon glyphicon-chevron-right"></i> 留白4</a></li>
				</ul>
			</div>

			<!-- content -->
			<div class="col-md-10">
				<div class="row">
					<div class="alert alert-success bootstrap-admin-alert">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<h4>Successful visit of Backstage:&nbsp&nbsp&nbsp&nbsp
							2015年9月9日 15:21</h4>
					</div>
				</div>

				<div class="row">
					<div class="panel panel-default bootstrap-admin-no-table-panel">
						<div class="panel-heading">
							<div class="text-muted bootstrap-admin-box-title">统计</div>
							<div class="pull-right">
								<span class="badge"></span>
							</div>
						</div>
						<div
							class="bootstrap-admin-panel-content bootstrap-admin-no-table-panel-content collapse in">
							<div class="col-md-3">
								<div class="easyPieChart" data-percent="73"
									style="width: 110px; height: 110px; line-height: 110px;">
									73%
									<canvas width="110" height="110"></canvas>
								</div>
								<div class="chart-bottom-heading">
									<span class="label label-info">访问量</span>
								</div>
							</div>
							<div class="col-md-3">
								<div class="easyPieChart" data-percent="53"
									style="width: 110px; height: 110px; line-height: 110px;">
									53%
									<canvas width="110" height="110"></canvas>
								</div>
								<div class="chart-bottom-heading">
									<span class="label label-info">注册量</span>
								</div>
							</div>
							<div class="col-md-3">
								<div class="easyPieChart" data-percent="83"
									style="width: 110px; height: 110px; line-height: 110px;">
									83%
									<canvas width="110" height="110"></canvas>
								</div>
								<div class="chart-bottom-heading">
									<span class="label label-info">日志量</span>
								</div>
							</div>
							<div class="col-md-3">
								<div class="easyPieChart" data-percent="13"
									style="width: 110px; height: 110px; line-height: 110px;">
									13%
									<canvas width="110" height="110"></canvas>
								</div>
								<div class="chart-bottom-heading">
									<span class="label label-info">留言量</span>
								</div>
							</div>
						</div>
					</div>
				</div>



				<div class="row">
					<div class="panel panel-default">
						<div class="panel-heading">
							<div class="text-muted bootstrap-admin-box-title">相册</div>
							<div class="pull-right">
								<span class="badge">1,462</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<hr>
			<footer role="contentinfo">
			<p>
				&copy; 2015 <a href="#" target="_blank">Gc</a>
			</p>
			</footer>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-2.0.3.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="js/twitter-bootstrap-hover-dropdown.min.js"></script>
	<script type="text/javascript"
		src="vendors/easypiechart/jquery.easy-pie-chart.js"></script>

	<script type="text/javascript">
		$(function() {
			// Easy pie charts
			$('.easyPieChart').easyPieChart({
				animate : 1000
			});
		});
	</script>
</body>
</html>