<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no,minimal-ui">
    <title>谷粒学院 - Java视频|HTML5视频|前端视频|Python视频|大数据视频-自学拿1万+月薪的IT在线视频课程，谷粉力挺，老学员为你推荐</title>
    <meta name="keywords" content="谷粒学院,IT在线视频教程,Java视频,HTML5视频,前端视频,Python视频,大数据视频" />
    <meta name="description" content="谷粒学院是国内领先的IT在线视频学习平台、职业教育平台。截止目前,谷粒学院线上、线下学习人次数以万计！会同上百个知名开发团队联合制定的Java、HTML5前端、大数据、Python等视频课程，被广大学习者及IT工程师誉为：业界最适合自学、代码量最大、案例最多、实战性最强、技术最前沿的IT系列视频课程！" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
    <meta content="telephone=no" name="format-detection" />
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/theme.css">
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/web.css">
    <link rel="stylesheet" type="text/css" href="css/default.css">
	
	<style type="text/css">
		.ke-upload-area {min-width: 54px;width: auto;}
		.ke-upload-area .ke-button-common,.ke-upload-area .ke-button-common input {border: 1px solid #FF5F16;background: #FFF7F3;}
		.ke-upload-area .ke-button-common input {border: none;width: 100px;color: #FF5F16;font-weight: bold;}
		.ke-upload-area .ke-button-common input:hover {background: #FFF2EC;}
	</style>
</head>

<body class="W-body">
    <div class="in-wrap">

        <!-- 公共头引入 -->
        <header id="header">
            <section class="container">
                <h1 id="logo">
                    <a href="#" title="谷粒学院">
                        <img src="img/logo.png" width="100%" alt="谷粒学院">
                    </a>
                </h1>
                <div class="h-r-nsl">
                    <ul class="nav">
                        <li><a href="index.html" title="首页">首页</a></li>
                        <li><a href="course.jsp" title="课程">课程</a></li>
                        <li><a href="teacher.jsp" title="名师">名师</a></li>
                        <li><a href="article.jsp" title="文章">文章</a></li>
                        <li class="current"><a href="question.jsp" title="问答">问答</a></li>
                    </ul>
                    <!-- / nav -->
                    <ul class="h-r-login">
                        <li class="mr10" id="is-login-one">
                            <a href="#" title="消息" id="headerMsgCountId">
                                <em class="icon18 news-icon">&nbsp;</em>
                            </a><q class="red-point" style="display: none">&nbsp;</q></li>
                        <li class="h-r-user" id="is-login-two">
                            <a href="#" title="">
                                <img src="img/avatar-boy.gif" width="30" height="30" class="vam picImg" alt="">
                                <span class="vam disIb" id="userName">Helen</span>
                            </a>
                            <a href="javascript:void(0)" title="退出" onclick="exit();" class="ml5">退出</a>
                        </li>
                    </ul>
                    <aside class="h-r-search">
                        <form action="#" method="post">
                            <label class="h-r-s-box"><input type="text" placeholder="搜索课程" name="queryCourse.courseName"
                                    value="">
                                <button type="submit" class="s-btn">
                                    <em class="icon18">&nbsp;</em>
                                </button></label>
                        </form>
                    </aside>
                </div>
                <aside class="mw-nav-btn">
                    <div class="mw-nav-icon"></div>
                </aside>
                <div class="clear"></div>
            </section>
        </header>
        <!-- /公共头引入 -->

        <div class="bg-fa of">
            <section class="container">
                <div class="u-body mt40">
                    <menu class="col-3 fl uMenu">
                        <dl>
                            <dt>
                                <section class="of">
                                    <div class="u-face-pic">
                                        <img src="photo/customer/avatar-boy.gif" alt="helen@162.com"
                                            class="userImgPhoto">
                                        <a href="uc_avatar.jsp" title="" class="c-fff">
                                            修改头像
                                        </a>
                                    </div>
                                    <h4 class="mt10">
                                        <span class="fsize16 c-666 userNameClass">helen@162.com</span>
                                    </h4>
                                    <div class="hLh30 mt10">
                                        <a href="uc_base.jsp" title="" class="c-blue">
                                            个人资料设置
                                        </a>
                                    </div>
                                    <div class="clear"></div>
                                </section>
                            </dt>
                            <dd class="u-m-dd">
                                <ul>
                                    <li>
                                        <span>Wo的学习</span>
                                        <ol>
                                            <li>
                                                <a href="uc_course.html" title="">
                                                    我的课程
                                                </a>
                                            </li>
                                            <li>
                                                <a href="uc_favorites.html" title="">
                                                    Wo的收藏
                                                </a>
                                            </li>
                                        </ol>
                                    </li>
                                </ul>
                                <ul>
                                    <li>
                                        <span>Wo的问答</span>
                                        <ol>
                                            <li>
                                                <a href="uc_question.html" title="">
                                                    Wo的提问
                                                </a>
                                            </li>
                                            <li>
                                                <a href="uc_anwser.html" title="">
                                                    Wo的回答
                                                </a>
                                            </li>
                                        </ol>
                                    </li>
                                </ul>
                                <ul>
                                    <li>
                                        <span>Wo的资料</span>
                                        <ol>
                                            <li>
                                                <a href="uc_base.jsp" title="">
                                                    基本资料
                                                </a>
                                            </li>
                                            <li class="current">
                                                <a href="uc_avatar.jsp" title="">
                                                    个人头像
                                                </a>
                                            </li>
                                            <li>
                                                <a href="uc_password.html" title="">
                                                    密码设置
                                                </a>
                                            </li>
                                        </ol>
                                    </li>
                                </ul>
                                <ul>
                                    <li>
                                        <span>Wo的消息</span>
                                        <ol>
                                            <li>
                                                <a href="uc_letter.jsp" title="">系统消息</a>
                                            </li>
                                        </ol>
                                    </li>
                                </ul>
                            </dd>
                        </dl>
                    </menu>


                    <article class="col-7 fl">
                        <div class="u-r-cont">
                            <section>
                                <div>
                                    <section class="c-infor-tabTitle c-tab-title">
                                        <a href="javascript: void(0)" title="Wo的资料" style="cursor: default;">
                                            Wo的资料
                                        </a>
                                        <a href="javascript: void(0)" title="基本资料" class="clickAvailable ">
                                            基本资料
                                        </a>
                                        <a href="javascript: void(0)" title="个人头像" class="clickAvailable current">
                                            个人头像
                                        </a>
                                        <a href="javascript: void(0)" title="密码设置" class="clickAvailable">
                                            密码设置
                                        </a>
                                    </section>
                                </div>
                                <div class="mt40" id="p_tCont">
                                    
                                    <div class="u-account-box" style="display: block;">
                                        <div id="tabCont">
                                            <section>
                                                <section class="ukindeditor of">
                                                    <section class="clearfix">
                                                        <section>
                                                            <div class="ke-inline-block pa">
                                                                <form class="ke-upload-area ke-form" style="min-width:54px;width: auto;"
                                                                    method="post" enctype="multipart/form-data" target="kindeditor_upload_iframe_1561112284579"
                                                                    action="">
                                                                    <span class="ke-button-common">
                                                                        <input type="button" class="ke-button-common ke-button" value="选择头像">
                                                                    </span>
                                                                </form>
                                                            </div>
                                                            <input id="fileupload" type="button" width="133"
                                                                value="选择头像" height="45" class="pa" style="display: none;">
                                                        </section>
                                                        <div class="fl jc-demo-box pr mt40"> 
                                                                <img src="photo/customer/avatar-boy.gif" width="100%" height="100%" alt="头像加载中..." class="dis pictureWrap" id="picture">
                                                            <div id="preview-pane" class="preview-pane1">
                                                                <div class="preview-container"> 
                                                                    <img src="photo/customer/avatar-boy.gif"
                                                                        class="jcrop-preview" alt="头像加载中..." width="100%">
                                                                </div>
                                                                <p class="c-999">大尺寸个人头像，大小<br>180x180像素</p>
                                                            </div>
                                                            <div id="preview-pane" class="preview-pane2">
                                                                <div class="preview-container" style="width: 80px; height: 80px; margin: 0 auto;">
                                                                    <img src="photo/customer/avatar-boy.gif"
                                                                        class="jcrop-preview" alt="头像加载中..." width="100%">
                                                                </div>
                                                                <p class="c-999">中尺寸个人头像，80x80像素</p>
                                                            </div>
                                                            <div id="preview-pane" class="preview-pane3">
                                                                <div class="preview-container" style="width: 50px; height: 50px;">
                                                                    <img src="photo/customer/avatar-boy.gif"
                                                                        class="jcrop-preview" alt="头像加载中..." width="100%">
                                                                </div>
                                                                <p class="c-999">小尺寸个人头像，50x50像素</p>
                                                            </div>
                                                        </div>
                                                        <div class="fl ml30 uploadWrap mt40">
                                                            <p class="c-green">您上传的图片将会自动生成三种尺寸的清晰头像，请注意小尺寸的头像是否清晰。</p>
                                                        </div>
                                                        <section class="clear"></section>
                                                        <div class="uploadBc of">
                                                            <div class="tac"> 
                                                                <span id="save_message"></span> 
                                                            </div>
                                                            <div class="ml50 mt20 pl50"> 
                                                                <a href="javascript:void(0)" title="" class="comm-btn c-btn-7" onclick="updateImg(2)">保存</a> 
                                                            </div>
                                                        </div>
                                                    </section>
                                                </section>
                                            </section>
                                        </div> 
                                        <input type="button" class="commBtn bgGreen w80 ml50" id="deleImage"
                                            style="display: none">
                                        <form method="post" name="photoForm"> 
                                            <input id="photoPath" type="hidden" value="">
                                            <input type="hidden" value="1" id="picture_width"> 
                                            <input type="hidden" value="1" id="picture_height"> 
                                            <input type="hidden" value="82" id="txt_top">
                                            <input type="hidden" value="73" id="txt_left"> 
                                            <input type="hidden" value="120" id="txt_DropWidth"> 
                                            <input type="hidden" value="120" id="txt_DropHeight">
                                            <input type="hidden" id="txt_Zoom"> 
                                        </form>
                                    </div>
                                    
                                </div>
                            </section>
                        </div>
                    </article>
                    <div class="clear"></div>
                </div>
            </section>
        </div>

        <!-- 公共底引入 -->
        <footer id="footer">
            <section class="container">
                <div class="">
                    <h4 class="hLh30">
                        <span class="fsize18 f-fM c-999">友情链接</span>
                    </h4>
                    <ul class="of flink-list">
                        <li><a href="http://www.atguigu.com/" title="尚硅谷" target="_blank">尚硅谷</a></li>
                    </ul>
                    <div class="clear"></div>
                </div>
                <div class="b-foot">
                    <section class="fl col-7">
                        <section class="mr20">
                            <section class="b-f-link">
                                <a href="#" title="关于我们" target="_blank">关于我们</a>|
                                <a href="#" title="联系我们" target="_blank">联系我们</a>|
                                <a href="#" title="帮助中心" target="_blank">帮助中心</a>|
                                <a href="#" title="资源下载" target="_blank">资源下载</a>|
                                <span>服务热线：010-56253825</span> <span>Email：info@atguigu.com</span>
                            </section>
                            <section class="b-f-link mt10">
                                <span>©2018课程版权均归谷粒学院所有 京ICP备17055252号</span>
                            </section>
                        </section>
                    </section>
                    <aside class="fl col-3 tac mt15">
                        <section class="gf-tx">
                            <span><img src="img/wx-icon.png" alt=""></span>
                        </section>
                        <section class="gf-tx">
                            <span><img src="img/wb-icon.png" alt=""></span>
                        </section>
                    </aside>
                    <div class="clear"></div>
                </div>
            </section>
        </footer>
        <!-- 公共底引入 -->
    </div>

</body>

</html>