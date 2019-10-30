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
</head>

<body class="W-body">
    <div class="in-wrap">

        <!-- 公共头引入 -->
        <header>
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
                        <li class="current"><a href="teacher.jsp" title="名师">名师</a></li>
                        <li><a href="article.jsp" title="文章">文章</a></li>
                        <li><a href="question.jsp" title="问答">问答</a></li>
                    </ul>
                    <!-- / nav -->
                    <ul class="h-r-login">
                        <li id="no-login">
                            <a href="login.jsp" title="登录">
                                <em class="icon18 login-icon">&nbsp;</em><span class="vam ml5">登录</span>
                            </a>
                            |
                            <a href="regist.jsp" title="注册">
                                <span class="vam ml5">注册</span>
                            </a>
                        </li>
                        <li class="mr10 undis" id="is-login-one">
                            <a href="#" title="消息" id="headerMsgCountId">
                                <em class="icon18 news-icon">&nbsp;</em>
                            </a><q class="red-point" style="display: none">&nbsp;</q></li>
                        <li class="h-r-user undis" id="is-login-two">
                            <a href="#" title="">
                                <img src="img/avatar-boy.gif" width="30" height="30" class="vam picImg" alt="">
                                <span class="vam disIb" id="userName"></span>
                            </a>
                            <a href="javascript:void(0)" title="退出" onclick="exit();" class="ml5">退出</a></li>
                        <!-- /未登录显示第1 li；登录后显示第2，3 li -->
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

        <div id="aCoursesList" class="bg-fa of">
            <!-- 讲师介绍 开始 -->
            <section class="container">
                <header class="comm-title">
                    <h2 class="fl tac">
                        <span class="c-333">讲师介绍</span>
                    </h2>
                </header>
                <div class="t-infor-wrap">
                    <!-- 讲师基本信息 -->
                    <section class="fl t-infor-box c-desc-content">
                        <div class="mt20 ml20">
                            <section class="t-infor-pic">
                                <img src="photo/teacher/01.jpg" alt="">
                            </section>
                            <h3 class="hLh30">
                                <span class="fsize24 c-333">佟老师</span>
                            </h3>
                            <section class="mt10">
                                <span class="t-tag-bg">尚硅谷教学总监</span>
                            </section>
                            <section class="t-infor-txt">
                                <p class="mt20">资深项目经理、技术讲师、SUN SCJP、SCWCD、原工信部移动云计算教育培训中心教学总监。 十年软件开发经验：参与完成辽宁某高校远程教学管理系统、慧文信息门户系统、日本麦卡尔超市管理系统、崎玉市外来人口登记系统、深海视频会议管理系统、仙台市宫城县日常事务系统等项目的设计和开发。 十年软件培训经验：曾在中国AOP全球外包排名第一的公司任Java、Oracle培训讲师、负责对公司员工新技术培训；曾任花旗银行特约JavaEE培训讲师；某部队研究所JavaEE培训；曾受聘为北航、厦门大学移动云计算专业教学主任， 并主讲Java、Android、iOS课程。</p>
                            </section>
                            <div class="clear"></div>
                        </div>
                    </section>
                    <div class="clear"></div>
                </div>
                <section class="mt30">
                    <div>
                        <header class="comm-title all-teacher-title c-course-content">
                            <h2 class="fl tac">
                                <span class="c-333">主讲课程</span>
                            </h2>
                            <section class="c-tab-title">
                                <a href="javascript: void(0)">&nbsp;</a>
                            </section>
                        </header>
                        <!-- /无数据提示 开始-->
                        <section class="no-data-wrap">
                            <em class="icon30 no-data-ico">&nbsp;</em> <span class="c-666 fsize14 ml10 vam">没有相关数据，小编正在努力整理中...</span>
                        </section>
                        <!-- /无数据提示 结束-->
                        <article class="comm-course-list">
                            <ul class="of">
                                <li>
                                    <div class="cc-l-wrap">
                                        <section class="course-img">
                                            <img src="photo/course/01.jpg" class="img-responsive">
                                            <div class="cc-mask">
                                                <a href="#" title="开始学习" target="_blank" class="comm-btn c-btn-1">开始学习</a>
                                            </div>
                                        </section>
                                        <h3 class="hLh30 txtOf mt10">
                                            <a href="#" title="30天搞定Java核心技术"
                                            target="_blank" class="course-title fsize18 c-333">30天搞定Java核心技术</a>
                                        </h3>
                                    </div>
                                </li>
                                <li>
                                    <div class="cc-l-wrap">
                                        <section class="course-img">
                                            <img src="photo/course/02.jpg" class="img-responsive">
                                            <div class="cc-mask">
                                                <a href="#" title="开始学习" target="_blank" class="comm-btn c-btn-1">开始学习</a>
                                            </div>
                                        </section>
                                        <h3 class="hLh30 txtOf mt10">
                                            <a href="#" title="Linux集群教程" target="_blank" class="course-title fsize18 c-333">Linux集群教程</a>
                                        </h3>
                                    </div>
                                </li>
                                <li>
                                    <div class="cc-l-wrap">
                                        <section class="course-img">
                                            <img src="photo/course/03.jpg" class="img-responsive">
                                            <div class="cc-mask">
                                                <a href="#" title="开始学习" target="_blank" class="comm-btn c-btn-1">开始学习</a>
                                            </div>
                                        </section>
                                        <h3 class="hLh30 txtOf mt10">
                                            <a href="#" title="互联网大厂高频重点面试题（第2季）" target="_blank" class="course-title fsize18 c-333">互联网大厂高频重点面试题（第2季）</a>
                                        </h3>
                                    </div>
                                </li>
                                <li>
                                    <div class="cc-l-wrap">
                                        <section class="course-img">
                                            <img src="photo/course/04.jpg" target="_blank" class="img-responsive">
                                            <div class="cc-mask">
                                                <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                            </div>
                                        </section>
                                        <h3 class="hLh30 txtOf mt10">
                                            <a href="#" title="RBAC权限模型" target="_blank" class="course-title fsize18 c-333">RBAC权限模型</a>
                                        </h3>
                                    </div>
                                </li>
                            </ul>
                            <div class="clear"></div>
                        </article>
                    </div>
                   
                </section>
            </section>
            <!-- /讲师介绍 结束 -->
        </div>

<%-- 引入公共底部--%>
        <jsp:include page="common/bottom.jsp"></jsp:include>

    </div>

</body>

</html>