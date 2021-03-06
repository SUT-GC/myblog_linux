<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>操纵帮助界面</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">

        <!-- Bootstrap Admin Theme -->
        <link href="css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">

        <!-- Datatables -->
        <link href="css/DT_bootstrap.css" rel="stylesheet" media="screen">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="js/html5shiv.js"></script>
           <script type="text/javascript" src="js/respond.min.js"></script>
        <![endif]-->
</head>
<body class="bootstrap-admin-with-small-navbar">
        <nav class="navbar navbar-default navbar-inverse navbar-fixed-top " role="navigation">
     <div class="container">
       <div class="row">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Gc微博后台</a>
          </div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li ><a href="back_index.jsp">首页</a></li>
              <li class="active"><a href="back_help.jsp">使用介绍</a></li>             
            </ul>
            <form class="navbar-form navbar-left" role="search">
              <div class="form-group">
                <input type="text" class="form-control" placeholder="请输入内容">
              </div>
              <button type="submit" class="btn btn-default">搜索</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">管理员<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="/myblog/AdminSessionLogout">退出登录</a></li>
                </ul>
              </li>
            </ul>
          </div><!-- /.navbar-collapse -->
          </div>
          </div>
        </nav>

        <div class="container">
            <!-- left, vertical navbar & content -->
            <div class="row">
                <!-- left, vertical navbar -->
                <div class="col-md-2 bootstrap-admin-col-left">
                     <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                         <li class="active">
                            <a href="back_index.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 首页</a>
                        </li>
                        <li >
                            <a href="back_about.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 关于我们</a>
                        </li>                       
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 日历</a><!-- calendar.html -->
                        </li>
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 统计图表</a><!-- stats.html -->
                        </li>
                        <li>
                            <a href="back_journal_release.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 日志发布</a>
                        </li>
                        <li>
                            <a href="back_journal_admin.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 日志管理</a>
                        </li>
                        <li>
                            <a href="back_users.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 用户管理</a>
                        </li>
                        <li>
                            <a href="back_message.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 留言管理</a>
                        </li>
                        <li>
                            <a href="back_image.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 图片管理</a>
                        </li>
                        <li>
                            <a href="back_admin_information.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 账户中心</a>
                        </li>
                        <li>
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 留白1</a>
                        </li>
                        <li>
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 留白2</a>
                        </li>
                        <li>
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 留白3</a>
                        </li>
                        <li>
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 留白4</a>
                        </li>
                    </ul>
                </div>

                <!-- content -->
                <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">Help</div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                               <h3>首页</h3>
                               <p>首页对系统数据库的内容进行统计，包括所注册的用户量(最大值:500); 管理员账户数量(最大值:10); 所发表日志的数量(最大值:500); 对日志进行回复的数量(最大值: 5000); 一级留言总数(最大值:200); 二级留言总数(最大值:2000); 网页点击量(最大值:1000); IP访问数(最大值: 100)</p>
                               <h3>日志发布</h3>
                               <p>1: 发布日志需要上传该日志的封皮（若不上传，则使用默认封皮）</p>
                               <p>2: 填写所发表日志的标题、作者、文章概述（100字左右最佳）、 文章内容、选择文章类型、是否私有（如果私有，则需要填写密码） </p>
                               <p>3: <a>Release</a>按钮进行发表， <a>Reset</a>按钮重置所有输入的内容</p>
                               <h3>日志管理</h3>
                               <p>1: <a>Edit</a>按钮进入对该文章进行修改； <a>Delete</a>按钮对该文章进行删除</p>
                               <p>2: 进入 Edit 页面之后对文章进行修改，确认所有信息无误之后单击 <a>确认修改<a> 发布修改，若想重置回修改之前，则需要点击<a>放弃修改</a></p>
                               <h3>用户管理</h3>
                               <p>1: <a>Edit</a>按钮对该用户进行修改； <a>Delete</a>按钮对该用户进行删除</p>
                               <p>2: 进入 Edit 页面之后对用户信息进行修改，确认所有信息无误之后单击 <a>确认修改<a> 发布修改，若想重置回修改之前，则需要点击<a>放弃修改</a> <span style="color:#FF0000">如果要对用户信息进行修改，必须重新填写用户密码，否则密码为空</span></p>
                               <h3>留言管理</h3>
                               <p>1: 留言管理页面分为: <a>留言板留言管理</a>与<a>日志页留言管理</a></p> 
                               <p>2: <a>Show</a>按钮显示留言信息； <a>Delete</a>按钮对该留言信息进行删除</p>
                               <h3>图片管理</h3>
                               <p>1: 该页面显示所有image/journalhead文件夹里的图片</p>
                               <p>2: 如果图片下面的按钮不可用，则说明该图片已经绑定到发表的文章上，不可进行操作；如果可以操作，则说明该图片是垃圾图片，应该删除</p>
                               <p>注意:<span style="color:#FF0000"> 名为defualt.jpg的图片为默认图片，请谨慎进行操作</span></p>
                               <h3>账户中心</h3>
                               <p>该页面对管理员账户进行操纵</p>
                               <p>1: <a>Edit</a>按钮对该Admin进行修改； <a>Delete</a>按钮对该Admin进行删除</p>
                               <p>2: 进入 Edit 页面之后对用户信息进行修改，确认所有信息无误之后单击 <a>确认修改<a> 发布修改，若想重置回修改之前，则需要点击<a>放弃修改</a> </p>
                               <p>注意:<span style="color:#FF0000"> 管理员账户的user_nick == user_name == 登陆账号, 所用(user_nick与user_pass)请禁止填写中文,否则无法登陆</span></p>
                            </div>  
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <hr>
                <footer role="contentinfo">
                    <p>&copy; 2015 <a href="#" target="_blank">Gc</a></p>
                </footer>
            </div>
        </div>

        <script type="text/javascript" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/twitter-bootstrap-hover-dropdown.min.js"></script>
        <script type="text/javascript" src="vendors/datatables/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="js/DT_bootstrap.js"></script>
    </body>
</html>