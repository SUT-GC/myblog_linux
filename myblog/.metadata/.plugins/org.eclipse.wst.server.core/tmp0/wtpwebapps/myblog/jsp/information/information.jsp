<%@page import="Encryption.Base64"%>
<%@page import="dao.AdminDao"%>
<%@page import="empty.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>博主信息</title>

<link type="text/css" href="css/css.css" rel="stylesheet" />

<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
  <style>
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
        body {
          background-color:#edecec;
          background-image: url('img/1.jpg');
          background-position: center;
          background-repeat:repeat;
          background-attachment: fixed;
          background-size: 100%,auto;
        }
        
        /* basic menu styles */
        .nav-menu {
          display: block;
         /* background: #74adaa;*/
          width:950px;
          margin: 50px auto 150px;
          position: fixed;
          padding-left: 18%;
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
  </style>
</head>
<body>
    <!--导航开始-->
  <div id="nav">
    <ul class="nav-menu clearfix unstyled">
      <li><a href="../nav/index.jsp" class="three-d">
        主页
        <span class="three-d-box"><span class="front">主页</span><span class="back">主页</span></span>
      </a></li>
      <li><a href="../Journal/Journal.jsp" class="three-d">
        日志
        <span class="three-d-box"><span class="front">日志</span><span class="back">日志</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        TA
        <span class="three-d-box"><span class="front">TA</span><span class="back">TA</span></span>
      </a></li>
      <li><a href="../information/information.jsp" class="three-d active">
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
    </ul>
  </div>
<!--导航结束-->
<!--个人信息start-->
    <div class="history">
        <div class="start-history">
            <p class="cc_history">个人信息</p>
            <p class="next_history">INFORMATIONS</p>
            <div class="history_left">
                <p class="history_L year2006">
                    <span class="history_2006_span">姓名</span>
                    <b class="history_2006_b">
                        <span class="history_l_month"><br/></span>
                        <span class="history_l_text">勾&nbsp&nbsp&nbsp&nbsp超</span>
                    </b>
                </p>
                <p class="history_L year2009">
                    <span class="history_2006_span">出生年</span>
                    <b class="history_2006_b">
                        <span class="history_l_month"><br/></span>
                        <span class="history_l_text">1995&nbsp&nbsp年</span>
                    </b>
                </p>
                <p class="history_L yearalmost">
                    <span class="history_2006_span">血型</span>
                    <b class="history_2006_b">
                        <span class="history_l_month"><br/></span>
                        <span class="history_l_text">待鉴定</span>
                    </b>
                </p>
                <p class="history_L yearalmost">
                    <span class="history_2006_span blue">职业</span>
                    <b class="history_2006_b blue">
                        <span class="history_l_month"><br/></span>
                        <span class="history_l_text">学&nbsp&nbsp生</span>
                    </b>
                </p>
                <p class="history_L yearalmost">
                    <span class="history_2006_span blue">婚姻</span>
                    <b class="history_2006_b blue">
                        <span class="history_l_month"><br/></span>
                        <span class="history_l_text">未&nbsp&nbsp婚</span>
                    </b>
                </p>
                <p class="history_L year2011">
                    <span class="history_2006_span blue">留白</span>
                    <b class="history_2006_b blue">
                        <span class="history_l_month"><br/></span>
                        <span class="history_l_text">。。。</span>
                    </b>
                </p>
               
            </div>
            <div class="history-img">
                <img class="history_img" src="images/history.png" alt="">
            </div>
            <div class="history_right">
                <p class="history_R history_r_2005">
                    <span class="history_2005_span">英文名</span>
                    <b class="history_2005_b">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">G&nbsp&nbsp&nbsp&nbspC</span>
                    </b>
                </p>
                <p class="history_R yearalmostr">
                    <span class="history_2005_span">星座</span>
                    <b class="history_2005_b">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">待&nbsp&nbsp查</span>
                    </b>
                </p>
                <p class="history_R yearalmostr">
                    <span class="history_2005_span">爱好</span>
                    <b class="history_2005_b">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">计算机,Run</span>
                    </b>
                </p>
                <p class="history_R yearalmostr">
                    <span class="history_2005_span">出生地</span>
                    <b class="history_2005_b">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">辽宁-朝阳</span>
                    </b>
                </p>
                <p class="history_R yearalmostr">
                    <span class="history_2005_span blue">学校</span>
                    <b class="history_2005_b blue_R">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">沈阳工业大学</span>
                    </b>
                </p>
                <p class="history_R yearalmostr">
                    <span class="history_2005_span blue">留白</span>
                    <b class="history_2005_b blue_R">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">。。。</span>
                    </b>
                </p>
                <p class="history_R year211">
                    <span class="history_2005_span blue">留白</span>
                    <b class="history_2005_b blue_R">
                        <span class="history_r_month"><br/></span>
                        <span class="history_r_text">。。。</span>
                    </b>
                </p>
            </div>

        </div>
		
    </div>

<script type="text/javascript" src="js/new_file.js"></script>
<script type="text/javascript">
$(window).scroll(function(){
	var msg = $(".history-img");
	var item = $(".history_L");
	var items = $(".history_R");
	var windowHeight = $(window).height();
	var Scroll = $(document).scrollTop();
	if((msg.offset().top - Scroll -windowHeight)<=0){
		msg.fadeIn(1500);
	}
	for(var i=0;i<item.length;i++){
		if(($(item[i]).offset().top - Scroll - windowHeight)<= -100){
			$(item[i]).animate({marginRight:'0px'},'50','swing');
		}
	}
	for(var i=0;i<items.length;i++){
		if(($(items[i]).offset().top - Scroll - windowHeight)<= -100){
			$(items[i]).animate({marginLeft:'0px'},'50','swing');
		}
	}
});
</script>
<!--个人信息end-->
</body>
</html>
