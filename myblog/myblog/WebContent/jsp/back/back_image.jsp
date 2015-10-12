<%@page import="dao.JournalDao"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="file.ImageDo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图片管理界面</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">

         <link href="css/img.css" rel="stylesheet" type="text/css"/>

        <!-- Bootstrap Admin Theme -->
        <link href="css/bootstrap-admin-theme.css" rel="stylesheet" media="screen">

        <!-- Vendors -->
        <link href="vendors/jGrowl/jquery.jgrowl.css" rel="stylesheet" media="screen">

        <!-- Custom styles -->
        <style type="text/css">
            .pagination-container{
                margin-top: 20px;
            }
            .pagination-container-first{
                margin-top: 10px;
            }
            .pagination-container .pagination{
                margin: 0;
            }
            .notification{
                margin: 5px 0;
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
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 日历</a><!-- calendar.jsp -->
                        </li>
                        <li class="disabled">
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i> 统计图表</a><!-- stats.jsp -->
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
                        <li class="active">
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
                <%
                	String delimg = "";
        		  	if(request.getParameter("delimgp")!=null){
        		  		delimg = request.getParameter("delimgp");
        		  	}
                %>
                <!-- content -->
                <div class="col-md-10">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title"><a href="#">图片管理</a></div>
                            </div>
                            <div class="bootstrap-admin-panel-content">
                                <div>
                                	<!-- java start -->
                                	<%
                                		File[] files = null;
                                		String imagepath = application.getRealPath(File.separator)+"image"+File.separator+"journalheader";
                                		files = ImageDo.selectImages(imagepath);
                                		
                                		HashSet <String> imageset = null;
                                		imageset = JournalDao.getImageSet();
                                	%>
                                	<!-- java end -->
                                    <!--一个img元素start-->
                                    <% 
                                    	if(files != null){
                                    		for(File file : files){
                                    %>
                                     <div class="img">
                                        <img class="img_border" src="../../image/journalheader/<%=file.getName()%>">
                                    <%
                                    			if(!file.getName().equals("default.jpg") && imageset.contains(file.getName())){
                                    %>
	                                    <div class="img_id_journal_id"><span><%=file.getName()%></span><span style='color:#FF0000'>   (Can't do)</span></div>
	                                        <div class="img_button">
                                            <button class="btn btn-primary button_edit" disabled><i class="glyphicon glyphicon-pencil glyphicon-white"></i>Reset</button>
                                           <button class="btn btn-danger button_delete" disabled><i class="glyphicon glyphicon-remove glyphicon-white"></i> Delete</button>

                                    <%
                                    				}else if(file.getName().equals("default.jpg")){
                                     %>
	                                     <div class="img_id_journal_id"><span style='color:#FF0000'><%=file.getName()%></span><span style='color:#00FF00'>   (do)</span></div>
	                                        <div class="img_button">
                                              <button class="btn btn-primary button_edit" ><i class="glyphicon glyphicon-pencil glyphicon-white"></i>Reset</button>
                                            <a onclick="return confirm('这是缺省图片\n您确定要删除default.jpg吗 \n!!!!!!!!!!!!!!!!!!!!!!')" href="/myblog/ImageDelete?imgp=<%=file.getName()%>"> <button class="btn btn-danger button_delete" ><i class="glyphicon glyphicon-remove glyphicon-white"></i> Delete</button></a>
                                    <%					
                                    				}else{
                                 	 %>
                	                   <div class="img_id_journal_id"><span><%=file.getName()%></span><span style='color:#00FF00'>   (do)</span></div>
                	                    	<div class="img_button">
                                          		<button class="btn btn-primary button_edit" ><i class="glyphicon glyphicon-pencil glyphicon-white"></i>Reset</button>
                                             <a href="/myblog/ImageDelete?imgp=<%=file.getName()%>"> <button class="btn btn-danger button_delete" ><i class="glyphicon glyphicon-remove glyphicon-white"></i> Delete</button></a>
                                   	 <% 
                                    				}
                                   	 %>
                                           </div>
                                   	 </div>
                                    <%
                                    			}
                                    		}
                                    %>
                                    <!--一个img元素end-->
                                    <!--撑开背面标签用start-->
                                    <div class="img_end"></div> 
                                    <!--撑开背面标签用end-->                                   
                                </div>

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
        <script type="text/javascript" src="vendors/jGrowl/jquery.jgrowl.js"></script>

        <script type="text/javascript">
        /*
		 * 定义删除之后返回的变量 del
		 * 0: Servlet中imgp参数未找到
		 * 1: 删除成功
		 * 2: 文件未找到
		 * 3: 执行文件创建报错或者为执行ImageDo.deleteImage;
		 */
        	var del= '<%=delimg%>';

        	if(del != ""){
        		var altmsg = "";
        		if(del == "0"){
        			altmsg += " Servlet中imgp参数未找到";
        		}else if(del == "1"){
        			altmsg += " 删除成功";
        		}else if(del == "2"){
        			altmsg += " 文件未找到";
        		}else if(del == "3"){
        			altmsg += " 执行文件创建报错或者为执行ImageDo.deleteImage";
        		}
        		alert(altmsg);
        	}
            $(function() {
                $('.tooltip').tooltip();
                $('.tooltip-left').tooltip({placement: 'left'});
                $('.tooltip-right').tooltip({placement: 'right'});
                $('.tooltip-top').tooltip({placement: 'top'});
                $('.tooltip-bottom').tooltip({placement: 'bottom'});

                $('.popover-left').popover({placement: 'left', trigger: 'hover'});
                $('.popover-right').popover({placement: 'right', trigger: 'hover'});
                $('.popover-top').popover({placement: 'top', trigger: 'hover'});
                $('.popover-bottom').popover({placement: 'bottom', trigger: 'hover'});

                $('.notification').click(function() {
                    var $id = $(this).attr('id');
                    switch ($id) {
                        case 'notification-sticky':
                            $.jGrowl("Stick this!", {sticky: true});
                            break;

                        case 'notification-header':
                            $.jGrowl("A message with a header", {header: 'Important'});
                            break;

                        default:
                            $.jGrowl("Hello world!");
                            break;
                    }
                });
            });
        </script>
    </body>
</html>