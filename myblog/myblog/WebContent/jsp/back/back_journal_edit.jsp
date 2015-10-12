<%@page import="dao.JournalDao"%>
<%@page import="empty.Journal" %>
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

        <!-- Bootstrap Admin Theme -->
        <link href="css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" type="text/css" href="css/back_journal_admin.css">
        <link href="css/back_journal_release.css" rel="stylesheet" >
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
                        <li class="active">
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

                <!-- content start -->
                <%
                	int id = Integer.parseInt(request.getParameter("id"));
        		  	Journal journal = JournalDao.selectByID(id);
                %>
                <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title"><a href="back_journal_admin.jsp">日志管理</a> >> <a href="#">edit</a></div>
                            </div>
                        </div>
                        <h3 class="journal_release_title">Please edit informations of the article:</h3>
                    <hr/>
                    <form id="journal_release_form_id" class="journal_release_form_class" method="post" action="/myblog/EditJournalRelease">
                    	<div class="input_title">
                            <span class="input_title_label">the image of your article:</span>
                            <input name="article_image" type="text" value="<%=journal.getImgpath()%>" readonly class="form-control article_image input_title_content"  />
                        </div>
                        <hr/>
                    	<div class="input_id">
                    		<span class="input_title_label">the id of your article:</span>
                            <input name="old_id" type="text" readonly class="form-control input_title_content" value="<%=id%>"/>
                          </div>
                          <hr/>
                        <div class="input_title">
                            <span class="input_title_label">the title of your article:</span>
                            <input name="new_title" type="text" class="form-control input_title_content" value="<%=journal.getTitle() %> " />
                        </div>
                        <hr/>
                        <div class="input_title">
                            <span class="input_title_label">the author of your article:</span>
                            <input name="new_author" type="text" class="form-control input_title_content" value="<%=journal.getAuthor() %>" />
                        </div>
                        <hr/>
                        <div class="input_summary">
                            <span class="input_title_label">the summary of your article:</span>
                            <textarea name = "new_summary" class="input_summary_textarea" cols="65" rows="3;"><%=journal.getSummary() %></textarea><br/><br/><br/><br/><br/>
                        </div>
                        <hr/>
                        <div class="input_content">
                            <span class="input_title_label">the content of your article:</span>
                            <textarea name="new_content" class="input_content_textarea" cols="77" rows="10;"><%=journal.getContent() %> </textarea><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                        </div>
                        <hr/>
                        <div class="input_submit">
                            <span class="input_title_label">Classification:</span>
                            <select name="new_classify" id="select_classify">
                               <option value="1">java</option>
                                <option value="2">算法</option>
                                <option value="3">Html/css/js</option>
                                <option value="4">生活随笔</option>
                                <option value="5">读书笔记</option>
                                <option value="6">其他</option>
                                <option value="7" disabled>预留</option>
                                <option value="8" disabled>预留</option>
                            </select>   
                            <span class="is_private">is private ?</span>
                            <%
                            	int isprivate = journal.getPrivate_is();
                            	int private_pass = journal.getPrivate_pass();
                            	String private_passS = "";
                            	if(private_pass!=-1){
                            		private_passS = ""+private_pass;
                            	}
                            	
                            	if(isprivate==0){
                            %>
                            <input class="is_private_check"type="checkbox" name="isprivate" value="1"/>
                            <%}else{ %>
                            <input class="is_private_check"type="checkbox" checked name="isprivate" value="1"/>
                            <%} %>
                            <span class="is_private">if this is private, please input your password !</span>
                            <input name="private_pass" class="input_password" type="text" value="<%=private_passS%>">
                        </div>
                        <hr/>
                        <div>
                            <span class="input_title_label">The location of the file upload.....</span>
                        </div>
                        <hr/>
                        <div class="input_buttons">
                            <input type="submit" value ="确认修改" onclick="return confirm('是否提交修改内容')"class="btn btn-success input_buttons_submit"/>
                            <a href="back_journal_admin.html"><input type="button" onclick="return confirm('是否重置修改内容？')" value ="放弃修改" class="btn btn-primary input_buttons_reset"/></a>
                        </div>
                        </form>
                    </div>
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