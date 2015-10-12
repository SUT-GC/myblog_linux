<%@page import="Encryption.Base64"%>
<%@page import="dao.AdminDao"%>
<%@page import="empty.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--java 绝对地址 start  -->
<%
	String urlp = application.getContextPath()+"/jsp/back/";
	System.out.println(urlp);
%>
<!-- java 绝对地址 end -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>admin账户编辑界面</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link href="<%=urlp%>css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="<%=urlp%>css/bootstrap-theme.min.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" type="text/css" href="<%=urlp%>css/back_user_edit.css">
        <!-- Bootstrap Admin Theme -->
        <link href="<%=urlp%>css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" type="text/css" href="<%=urlp%>css/back_journal_admin.css">
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
              <li ><a href="<%=urlp%>back_help.jsp">使用介绍</a></li>             
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
                            <a href="<%=urlp%>back_index.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 首页</a>
                        </li>
                        <li >
                            <a href="<%=urlp%>back_about.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 关于我们</a>
                        </li>                       
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 日历</a><!-- calendar.jsp -->
                        </li>
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 统计图表</a><!-- stats.jsp -->
                        </li>
                        <li>
                            <a href="<%=urlp%>back_journal_release.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 日志发布</a>
                        </li>
                        <li >
                            <a href="<%=urlp%>back_journal_admin.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 日志管理</a>
                        </li>
                        <li>
                            <a href="<%=urlp%>back_users.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 用户管理</a>
                        </li>
                        <li>
                            <a href="<%=urlp%>back_message.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 留言管理</a>
                        </li>
                        <li>
                            <a href="<%=urlp%>back_image.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 图片管理</a>
                        </li>
                        <li class="active">
                            <a href="<%=urlp%>back_admin_information.jsp"><i class="glyphicon glyphicon-chevron-right"></i> 账户中心</a>
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
                        Admin admin = null;
                        if(request.getParameter("editadminid") != null){
                        	 int editadminid = Integer.parseInt(request.getParameter("editadminid")) ;
                        	 admin = AdminDao.selectAdminByID(editadminid);
                        }
                    %>
                <!-- java end -->
                <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title"><a href="<%=urlp%>back_admin_information.jsp">admin账户管理中心</a> >> <a href="#">edit</a></div>
                            </div>
                            <!--form start-->
                            <form method="post" action = "/myblog/AdminDo">
                            <div class="user_edit">
                              <%if(admin != null){ %>
                                <div class="user_edit_id">
                                    <span class="user_edit_id_label">user_id (can't edit)</span>
                                    <input name="new_admin_id" type="text" class="form-control input_title_content " readonly value='<%=admin.getAdmin_id()%>'>
                                </div>
                                <hr/>
                                <div class="user_edit_nick">
                                    <span class="user_edit_nick_label">user_nick</span>
                                    <input  name="new_admin_username" type="text" class="form-control input_title_content" value="<%=admin.getAdmin_username()%>">
                                </div>
                                <hr/>
                                <div class="user_edit_pass">
                                    <span class="user_edit_pass_label">user_pass</span>
                                    <input  name="new_admin_password" type="text" class="form-control input_title_content" value="<%=Base64.base64Decoder(admin.getAdmin_password())%>">
                                </div>
                                <hr/>
                                <div class="edit_buttons">
                                    <input type="submit" value ="OK_Edit" onclick="return confirm('您确定要提交修改么？')" class="btn btn-success input_buttons_submit"/>
                                    <input type="reset" value ="Reset" onclick="return confirm('您确定要重置输入的内容么？')" class="btn btn-primary input_buttons_reset"/>
                                </div>
                              <%}else{ %>
                              <h1>对不起，没有搜索到该id的admin</h1>
                              <%}%>
                            </div>
                            </form>
                            <!--form end-->
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
        <script type="text/javascript" src="<%=urlp%>js/bootstrap.min.js"></script>
        <script type="text/javascript" src="<%=urlp%>js/twitter-bootstrap-hover-dropdown.min.js"></script>
        <script type="text/javascript" src="<%=urlp%>vendors/datatables/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="<%=urlp%>js/DT_bootstrap.js"></script>
    </body>
</html>