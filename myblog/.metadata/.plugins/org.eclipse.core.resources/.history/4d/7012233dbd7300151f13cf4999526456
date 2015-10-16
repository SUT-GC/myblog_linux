<%@page import="dao.UserDao"%>
<%@page import = "empty.User" %>
<%@page import = "dao.UserDao" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>日志管理界面</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" type="text/css" href="css/back_user_edit.css">
        <!-- Bootstrap Admin Theme -->
        <link href="css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" type="text/css" href="css/back_journal_admin.css">
        <!-- Custom styles -->
        <style type="text/css">
            .buttons-title{
                margin-top: 20px
            }
            .buttons-group{
                margin-top: 10px;
            }
            .the-icons{
                margin-left: 0;
                list-style: none;
            }
            .the-icons li {
                float: left;
                width: 25%;
                line-height: 25px;
            }
        </style>

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
              <li class="active"><a href="#">首页</a></li>
              <li ><a href="back_help.jsp">使用介绍</a></li>             
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
                         <li >
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
                        <li >
                            <a href="back_journal_admin.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 日志管理</a>
                        </li>
                        <li class="active">
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
			
                <!-- content start -->
            	<!-- java start -->
            		<%
            			User user = null;
            			user = UserDao.selectUserByID(Integer.parseInt(request.getParameter("id")));
            		%>
            	<!-- java end -->
                <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title"><a href="back_users.jsp">用户管理</a> >> <a href="#">edit</a></div>
                            </div>
                  			<% if(user != null) {%>
                            <!--form start-->
                            <form method="post" action="/myblog/UserEditOrDelete">
                            <div class="user_edit">
                                <div class="user_edit_id">
                                    <span class="user_edit_id_label">user_id (can't edit)</span>
                                    <input name="new_user_id" type="text" class="form-control input_title_content " readonly value="<%=user.getUser_id()%>">
                                </div>
                                <hr/>
                                <div class="user_edit_email">
                                    <span class="user_edit_email_label">user_email</span>
                                    <input name="new_user_email" type="text" class="form-control input_title_content" value="<%=user.getUser_email()%>">
                                </div>
                                <hr/>
                                <div class="user_edit_pass">
                                    <span class="user_edit_pass_label">user_pass</span>
                                    <input name="new_user_pass" type="text" class="form-control input_title_content" value="">
                                </div>
                                <hr/>
                                <div class="user_edit_nick">
                                    <span class="user_edit_nick_label">user_nick</span>
                                    <input name="new_user_nick" type="text" class="form-control input_title_content" value="<%=user.getUser_nick()%>">
                                </div>
                                <hr/>
                                <div class="user_edit_imagepath">
                                    <span class="user_edit_imagepath_label">user_imagepath</span>
                                    <input name="new_user_imagepath" type="text" class="form-control input_title_content" value="<%=user.getUser_imagepath()%>">
                                </div>
                                <hr/>
                                 <div class="user_edit_isadmin">
                                    <span class="user_edit_isadmin_label">user_isadmin</span>
                                    <%if(user.getUser_isadmin() == 1) {%>
                                    <input name="new_user_isadmin" class="is_admin"type="checkbox" checked name="isadmin" value="1"/>
                                    <%}else{ %>
                                    <input name="new_user_isadmin" class="is_admin"type="checkbox" name="isadmin" value="1"/>
                                    <%}%>
                                </div>
                                <hr/>
                                <div class="edit_buttons">
                                    <input type="submit" value ="OK_Edit" onclick="return confirm('是否提交修改内容？')"class="btn btn-success input_buttons_submit"/>
                                    <input type="reset" value ="Reset" onclick="return confirm('是否重置修改内容？')" class="btn btn-primary input_buttons_reset"/>
                                </div>
                            </div>
                            </form>
                            <!--form end-->
                            <%}else{ %>
                            <h1>抱歉，没有搜索到该id的用户</h1>
                            <%} %>
                        </div>
                    </div>
                    <!--这里填写内容-->
                </div>
                <!-- content end-->
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