<%@page import="com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle"%>
<%@page import="dao.JournalDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="empty.Journal"%>
<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
		<meta name="viewport" content="width=device-width, initial-scale=1"> 
		<title>博主日志</title>
		<meta name="description" content="Grid Loading and Hover Effect: Recreating Samsung's grid loading effect" />
		<meta name="keywords" content="grid loading, swipe, effect, slide, masonry, web design, tutorial" />
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<link rel="stylesheet" href="http://dreamsky.github.io/main/blog/common/init.css">
		<!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

		<style>
		/*分类按钮css开始*/
		.classification{
			margin-top: 50px;
			padding-left:15%;
			padding: 15px 10px;
			border: solid 2px  #db6d4c;
			width: 74%;
			margin-left: 13%;
			border-radius: 15px;
			float: left;
			margin-bottom: 20px;
		}
		.cif{
			margin-left: 10px;
			float: left;
		}
		/*分类按钮css结束*/

		body {
			background: #9AE7E2;
		}
		/*#9AE7E2*/
		.codrops-demos a.current-demo {
			color: #999;
		}
		.codrops-header h1 {
			margin-top: 50px;
			font-family: 'Microsoft Yahei';
			color: black;
		}
		
		/*导航的css&js开始*/
        @import url("http://www.w3cplus.com/demo/css3/base.css");
        /*任务一：引入本地字体文件*/
        @font-face {
    font-family: 'sansationregular';
    src: url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.eot');
    src: url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.eot?#iefix') format('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/embedded-opentype'),
         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.woff') format('woff'),
         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.ttf') format('truetype'),
         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.svg#sansationregular') format('svg');
    font-weight: normal;
    font-style: normal;
}
       
        
        /* basic menu styles */
        .nav-menu {
          display: block;
         /* background: #74adaa;*/
          width:1000px;
          margin: 15px auto 0px;
          padding-left: 5%;
		  padding-top:3%;
          z-index: 2;
        }
        .nav-menu > li {
          display: inline;
          float:left;     
          border-right:1px solid #94c0be;
        }
        .nav-menu > li:last-child {
          border-right: none;
        }
        .nav-menu li a {
          color: #fff;
          display: block;
          text-decoration: none;
          /*调用本地字体*/
          font-family:sansationregular;
          -webkit-font-smoothing: antialiased;
          -moz-font-smoothing: antialiased;
          font-smoothing: antialiased;
          text-transform: capitalize;
          overflow: visible;
          line-height: 20px;
          font-size: 20px;
          padding: 15px 30px 15px 31px;     
        }
        
        
        .three-d {
          /* 任务三、设置3D舞台布景 */
          -webkit-perspective: 200px;
          -moz-perspective: 200px;
          -ms-perspective: 200px;
          -o-perspective: 200px;
          perspective: 200px;
          /*任务四、设置3D舞台布景过渡效果*/
          -webkit-transition: all .07s linear;
          -moz-transition: all .07s linear;
          -ms-transition: all .07s linear;
          -o-transition: all .07s linear;
          transition:all .7s linear;
          position: relative;
        }
        
        .three-d:not(.active):hover {
          cursor: pointer;
        }
        
        /*任务五、给不是当前状态的3D舞台的悬浮与聚焦状态设置变形效果*/
        .three-d:not(.active):hover .three-d-box, 
        .three-d:not(.active):focus .three-d-box {
        -wekbit-transform: translateZ(-25px) rotateX(90deg);
        -moz-transform: translateZ(-25px) rotateX(90deg);
        -o-transform: translateZ(-25px) rotateX(90deg);
        -ms-transform: translateZ(-25px) rotateX(90deg);
        transform: translateZ(-25px) rotateX(90deg);
    /*    -webkit-transform:rotateX(90deg) translatez(-25px);*/
       /*   -webkit-transform:rotatex(90deg);*/
        }
        
        .three-d-box {
          /*任务六、给3D舞台中“.three-d-box”设置过渡与变形效果*/
          -webkit-transition: all .3s ease-out;
          -moz-transition: all .3s ease-out;
          -ms-transition: all .3s ease-out;
          -o-transition: all .3s ease-out;  
          transition: all .3s ease-out;
          -webkit-transform: translatez(-25px);
          -moz-transform: translatez(-25px);
          -ms-transform: translatez(-25px);
          -o-transform: translatez(-25px);
          transform: translatez(-25px);
          -webkit-transform-style: preserve-3d;
          -moz-transform-style: preserve-3d;
          -ms-transform-style: preserve-3d;
          -o-transform-style: preserve-3d;
          transform-style: preserve-3d;
          -webkit-pointer-events: none;
          -moz-pointer-events: none;
          -ms-pointer-events: none;
          -o-pointer-events: none;
          pointer-events: none;
          position: absolute;
          top: 0;
          left: 0;
          display: block;
          width: 100%;
          height: 100%;
        }
        
        /*任务七、给导航设置3D前，与3D后变形效果*/
        .front {
            -webkit-transform: rotatex(0deg) translatez(25px);
            -moz-transform: rotatex(0deg) translatez(25px);
            -ms-transform: rotatex(0deg) translatez(25px);
            -o-transform: rotatex(0deg) translatez(25px);
            transform: rotatex(0deg) translatez(25px);
         }
        
        .back {
          -webkit-transform: rotatex(-90deg) translatez(25px);
          -moz-transform: rotatex(-90deg) translatez(25px);
          -ms-transform: rotatex(-90deg) translatez(25px);
          -o-transform: rotatex(-90deg) translatez(25px);
          transform: rotatex(-90deg) translatez(25px);
          color: #FFE7C4; 
        }
        
        .front, .back {
/*          border:1px solid red;*/
          display: block;
          width: 100%;
          height: 100%;
          position: absolute;
          top: 0;
          left: 0;
          background: #74adaa;
          padding: 15px 30px 15px 31px; 
          color: white;
          -webkit-pointer-events: none;
          -moz-pointer-events: none;
          -ms-pointer-events: none;
          -o-pointer-events: none;
          pointer-events: none;
          -webkit-box-sizing: border-box;
          box-sizing: border-box;
        }
        /*任务八、设置导航当前状态与悬浮状态下的背景效果*/
        .nav-menu li .active .front,
        .nav-menu li .active .back,
        .nav-menu li a:hover .front,
        .nav-menu li a:hover .back {
             background-color: #51938f;
             -webkit-background-size: 5px 5px;
             background-size: 5px 5px;
             background-position: 0 0, 30px 30px;
             background-image: -webit-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);
             background-image: -moz-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);
             background-image: -ms-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);
             background-image: -o-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);
             background-image: linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);
        }
        .nav-menu ul {
          position: absolute;
          text-align: left;
          line-height: 40px;
          font-size: 14px;
          width: 200px;
          -webkit-transition: all 0.3s ease-in;
          -moz-transition: all 0.3s ease-in;
          -ms-transition: all 0.3s ease-in;
          -o-transition: all 0.3s ease-in;
          transition: all 0.3s ease-in;
          -webkit-transform-origin: 0px 0px;
          -moz-transform-origin: 0px 0px;
          -ms-transform-origin: 0px 0px;
          -o-transform-origin: 0px 0px;
          transform-origin: 0px 0px;
          -webkit-transform: rotateX(-90deg);
          -moz-transform: rotateX(-90deg);
          -ms-transform: rotateX(-90deg);
          -o-transform: rotateX(-90deg);
          transform: rotateX(-90deg);
          -webkit-backface-visibility: hidden;
          -moz-backface-visibility: hidden;
          -ms-backface-visibility: hidden;
          -o-backface-visibility: hidden;
          backface-visibility: hidden;
        }
        /*任务九、显示下拉导航菜单，并其设置一个变形效果*/
        .nav-menu > li:hover ul {
/*          display: block;*/
           -webkit-transform: rotateX(0deg);
           -moz-transform: rotateX(0deg);
           -ms-transform: rotateX(0deg);
           -o-transform: rotateX(0deg);
           transform: rotateX(0deg);
         }
 /*导航的css&js结束*/
 /*搜寻框start*/
 	.form{
 		float: right;
 	}
 	.form-submit{
 		float: right;
 	}
 	.form-control{
 		width: 70%;
 		float: left;
 	}
 	
 /*搜寻框end*/
		</style>
		<script src="js/modernizr.custom.js"></script>
	</head>
	<body>
<!--导航开始-->
	<!-- java start -->
	<%
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//获取Session user
		session = request.getSession();
		User user = null;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
		}
	%>
	<!-- java end -->
  <div id="nav">
    <ul class="nav-menu clearfix unstyled">
      <li><a href="../nav/index.jsp" class="three-d ">
        主页
        <span class="three-d-box"><span class="front">主页</span><span class="back">主页</span></span>
      </a></li>
      <li><a href="Journal.jsp" class="three-d active">
        日志
        <span class="three-d-box"><span class="front">日志</span><span class="back">日志</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        TA
        <span class="three-d-box"><span class="front">TA</span><span class="back">TA</span></span>
      </a></li>
      <li><a href="../information/information.jsp" class="three-d">
        博主
        <span class="three-d-box"><span class="front">博主</span><span class="back">博主</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        空间
        <span class="three-d-box"><span class="front">空间</span><span class="back">空间</span></span>
      </a></li>
      <li><a href="../editor/messagebox.jsp" class="three-d">
        留言板
        <span class="three-d-box"><span class="front">留言板</span><span class="back">留言板</span></span>
      </a></li>
      <li><a href="../back/back_login.jsp" class="three-d">
        后台
        <span class="three-d-box"><span class="front">后台</span><span class="back">后台</span></span>
      </a></li>
      <%
      	if(user == null){
      %>
      <li><a href="#" class="three-d">
        登陆/注册
        <span class="three-d-box"><span class="front">登陆/注册</span><span class="back">登陆/注册</span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="../login/login.jsp" class="three-d">
              登陆
              <span class="three-d-box"><span class="front">登陆</span><span class="back">登陆</span></span>
          </a></li>
          <li><a href="../registered/registered.jsp" class="three-d">
            注册
            <span class="three-d-box"><span class="front">注册</span><span class="back">注册</span></span>
          </a></li>
        </ul>
      </li>
      <%}else{ %>
      <li><a href="#" class="three-d">
        登陆成功/登出
        <span class="three-d-box"><span class="front">登陆成功/登出</span><span class="back"><%=user.getUser_nick()%></span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="/myblog/SessionDo" class="three-d">
            登出
            <span class="three-d-box"><span class="front">登出</span><span class="back">登出</span></span>
          </a></li>
        </ul>
      </li>
      <%} %>
    </ul>
  </div>
<!--导航结束-->
<!--分类按钮start-->
	<div class="classification">
		<a href="?cfy=1"><button id="javabtn" class="btn btn-primary cif" id="java" type="button">Java</button></a>
		<a href="?cfy=2"><button id="algobtn" class="btn btn-success cif" id="algo" type="button">算法</button></a>
		<a href="?cfy=3"><button id="hcjbtn" class="btn btn-info cif" id="hcj" type="button">Html/css/js</button></a>
		<a href="?cfy=4"><button id="lifebtn" class="btn btn-warning cif" id="life" type="button">生活随笔</button></a>
		<a href="?cfy=5"><button id="reselbtn" class="btn btn-danger cif" id="other" type="button">读书笔记</button></a>
		<a href="?cfy=6"><button class="btn btn-primary cif" id="rese1" type="button">其他</button></a>
		<a href="?cfy=7"><button class="btn btn-success cif" type="rese2" disabled>预留</button></a>
		<a href="?cfy=8"><button class="btn btn-info cif" type="rese3" disabled>预留</button></a>
		<form action="Journal.jsp" method="post" class="form">
		   	<input name="liketitle" type="text" class="form-control" placeholder="输入可能存在的标题">
			<button type="submit" class="btn btn-default form-submit" > Select! </button>
		</form>
		<!--
		<form class="navbar-form navbar-right" role="search">
	        <div class="form-group">
	          <input type="text" class="form-control" placeholder="Search">
	        </div>
        	<button type="submit" class="btn btn-default">Submit</button>
      	</form>
      	-->
	</div>
<!--分类按钮end-->
<!-- java start -->
	<%
		ArrayList <Journal> list = new ArrayList();
		System.out.print("~"+request.getParameter("cfy")+"~");
		if(request.getParameter("cfy")==null){
			if(request.getParameter("liketitle")== null){
				list = JournalDao.journalSelect();	
			}else{
				list = JournalDao.selectJournalLikeTitle(request.getParameter("liketitle"));
			}
		}else{
			if(request.getParameter("liketitle")== null){
				list = JournalDao.selectJournalByClassify(Integer.parseInt(request.getParameter("cfy")));	
			}else{
				list = JournalDao.selectJournalLikeTitle(request.getParameter("liketitle"));
			}
		}
	%>
<!-- java end -->
		<div class="container">
			<section class="grid-wrap">
				<ul class="grid swipe-down" id="grid">
				<%
					for(Journal journal : list){
				%>
					<li><a href="journal_each.jsp?id=<%=journal.getJournal_id()%>"><img style='width:300px; height:340px;' src="/myblog/image/journalheader/<%=journal.getImgpath()%>" alt="img01"><h3><%=journal.getTitle()%></h3></a></li>
				<%
					}
				%>
				</ul>
			</section>
		</div><!-- /container -->
		<div class="footer-banner" style="width:728px; margin:160px auto 100px"></div>
		<script src="js/masonry.pkgd.min.js"></script>
		<script src="js/imagesloaded.pkgd.min.js"></script>
		<script src="js/classie.js"></script>
		<script src="js/colorfinder-1.1.js"></script>
		<script src="js/gridScrollFx.js"></script>
		<script src="http://libs.baidu.com/jquery/1.7.2/jquery.min.js"></script>
		<script type="text/javascript">
			new GridScrollFx( document.getElementById( 'grid' ), {
				viewportFactor : 0.4
			} );
			$(document).ready(function(){
				$("#javabtn").click(function(){
					$(".classify1").hide();
				});
			});
		</script>
	</body>
</html>