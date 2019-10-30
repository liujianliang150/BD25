<%--
  Created by IntelliJ IDEA.
  User: zengt
  Date: 2019-10-28
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>谷粒学院 - Java视频|HTML5视频|前端视频|Python视频|大数据视频-自学拿1万+月薪的IT在线视频课程，谷粉力挺，老学员为你推荐</title>
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/theme.css">
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/web.css">

</head>
<body>
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
                    <li class="current"><a href="index.jsp" title="首页">首页</a></li>
                    <li><a href="course.jsp" title="课程">课程</a></li>
                    <li><a href="teacher.jsp" title="名师">名师</a></li>
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


    <div class="i-slide">
        <section>
            <!-- 如果需要导航按钮 -->
            <a class="arrow-left s-arrow" href="javascript:void(0)"></a>
            <a class="arrow-right s-arrow" href="javascript:void(0)"></a>
            <!-- 图片位置 -->
            <div class="swiper-container">
                <div class="swiper-wrapper">
                    <div class="swiper-slide" style="background: #040B1B;">
                        <a target="_blank" href="/">
                            <img class="imgload" src="photo/banner/1525939573202.jpg" alt="首页banner">
                        </a>
                    </div>
                    <div class="swiper-slide" style="background: #040B1B;">
                        <a target="_blank" href="/">
                            <img class="imgload" src="photo/banner/1525939573202.jpg" alt="首页banner">
                        </a>
                    </div>
                </div>
            </div>
            <!-- 如果需要分页器 -->
            <div class="pagination"></div>
        </section>
    </div>
    <!-- /index slide -->

    <div id="aCoursesList">

        <!-- 网校课程 开始 -->
        <div>
            <section class="container">
                <header class="comm-title">
                    <h2 class="tac">
                        <span class="c-333">热门课程</span>
                    </h2>
                </header>
                <div>
                    <article class="comm-course-list">
                        <ul class="of" id="bna">
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/01.jpg" class="img-responsive" alt="30天搞定Java核心技术">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="30天搞定Java核心技术" class="course-title fsize18 c-333">30天搞定Java核心技术</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    9634人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    9634评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/02.jpg" class="img-responsive" alt="Linux集群教程">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="Linux集群教程" class="course-title fsize18 c-333">Linux集群教程</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    501人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    501评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/03.jpg" class="img-responsive" alt="互联网大厂高频重点面试题（第2季）">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="互联网大厂高频重点面试题（第2季）" class="course-title fsize18 c-333">互联网大厂高频重点面试题（第2季）</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    300人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    300评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/04.jpg" class="img-responsive" alt="RBAC权限模型">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="RBAC权限模型" class="course-title fsize18 c-333">RBAC权限模型</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    256人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    256评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/05.jpg" class="img-responsive" alt="SpringMVC">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="SpringMVC" class="course-title fsize18 c-333">SpringMVC</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    137人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    137评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/06.jpg" class="img-responsive" alt="图解Java数据结构和算法">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="图解Java数据结构和算法" class="course-title fsize18 c-333">图解Java数据结构和算法</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    125人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    125评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/07.jpg" class="img-responsive" alt="IT人面试求职技巧">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="IT人面试求职技巧" class="course-title fsize18 c-333">IT人面试求职技巧</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    123人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    123评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                            <li>
                                <div class="cc-l-wrap">
                                    <section class="course-img">
                                        <img src="photo/course/08.jpg" class="img-responsive" alt="Java11新特性教程">
                                        <div class="cc-mask">
                                            <a href="#" title="开始学习" class="comm-btn c-btn-1">开始学习</a>
                                        </div>
                                    </section>
                                    <h3 class="hLh30 txtOf mt10">
                                        <a href="#" title="Java11新特性教程" class="course-title fsize18 c-333">Java11新特性教程</a>
                                    </h3>
                                    <section class="mt10 hLh20 of">
                                            <span class="fr jgTag bg-green">
                                                <i class="c-fff fsize12 f-fA">免费</i>
                                            </span>
                                        <span class="fl jgAttr c-ccc f-fA">
                                                <i class="c-999 f-fA">
                                                    34人学习
                                                </i>
                                                |
                                                <i class="c-999 f-fA">
                                                    34评论
                                                </i>
                                            </span>
                                    </section>
                                </div>
                            </li>
                        </ul>
                        <div class="clear"></div>
                    </article>
                    <section class="tac pt20">
                        <a href="#" title="全部课程" class="comm-btn c-btn-2">全部课程</a>
                    </section>
                </div>
            </section>
        </div>
        <!-- /网校课程 结束 -->

        <!-- 网校名师 开始 -->
        <div>
            <section class="container">
                <header class="comm-title">
                    <h2 class="tac">
                        <span class="c-333">名师大咖</span>
                    </h2>
                </header>
                <div>
                    <article class="i-teacher-list">
                        <ul class="of">
                            <li>
                                <section class="i-teach-wrap">
                                    <div class="i-teach-pic">
                                        <a href="#" title="佟老师">
                                            <img alt="佟老师" src="photo/teacher/01.jpg">
                                        </a>
                                    </div>
                                    <div class="mt10 hLh30 txtOf tac">
                                        <a href="#" title="佟老师" class="fsize18 c-666">佟老师</a>
                                    </div>
                                    <div class="hLh30 txtOf tac">
                                        <span class="fsize14 c-999">尚硅谷教学总监</span>
                                    </div>
                                    <div class="mt15 i-q-txt">
                                        <p class="c-999 f-fA">资深项目经理、技术讲师、SUN SCJP、SCWCD、原工信部移动云计算教育培训中心教学总监。 十年软件开发经验：参与完成辽宁某高校远程教学管理系统、慧文信息门户系统、日本麦卡尔超市管理系统、崎玉市外来人口登记系统、深海视频会议管理系统、仙台市宫城县日常事务系统等项目的设计和开发。 十年软件培训经验：曾在中国AOP全球外包排名第一的公司任Java、Oracle培训讲师、负责对公司员工新技术培训；曾任花旗银行特约JavaEE培训讲师；某部队研究所JavaEE培训；曾受聘为北航、厦门大学移动云计算专业教学主任， 并主讲Java、Android、iOS课程。</p>
                                    </div>
                                </section>
                            </li>
                            <li>
                                <section class="i-teach-wrap">
                                    <div class="i-teach-pic">
                                        <a href="#" title="韩老师">
                                            <img alt="韩老师" src="photo/teacher/02.jpg">
                                        </a>
                                    </div>
                                    <div class="mt10 hLh30 txtOf tac">
                                        <a href="#" title="韩老师" class="fsize18 c-666">韩老师</a>
                                    </div>
                                    <div class="hLh30 txtOf tac">
                                        <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                    </div>
                                    <div class="mt15 i-q-txt">
                                        <p class="c-999 f-fA">行业老兵，IT教育风云人物。清华毕业，拥有九年大型项目开发和管理经验，曾任新浪网软件项目经理，使用PHP与JavaEE技术开发新浪网系统，北京点击科技公司高级软件工程师，用友软件股份有限公司U8事业部软件工程师。主持或参与《新浪邮件系统》、《橙红sns网站》、《点击科技协同软件群组服务器端(Linux/solaris平台)》、《总参语音监控系统》、《英语学习机系统》、《用友erp(u8产品)系统》等项目。实战经验丰富，授课通俗易懂，多年来培训的学员已成功在用友、搜狐、淘宝、中软等知名企业就职。 代表作品《循序渐进学Java》《尚硅谷韩顺平Linux》《尚硅谷韩顺平Go语言》。</p>
                                    </div>
                                </section>
                            </li>
                            <li>
                                <section class="i-teach-wrap">
                                    <div class="i-teach-pic">
                                        <a href="#" title="李老师">
                                            <img alt="李老师" src="photo/teacher/03.jpg">
                                        </a>
                                    </div>
                                    <div class="mt10 hLh30 txtOf tac">
                                        <a href="#" title="李老师" class="fsize18 c-666">李老师</a>
                                    </div>
                                    <div class="hLh30 txtOf tac">
                                        <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                    </div>
                                    <div class="mt15 i-q-txt">
                                        <p class="c-999 f-fA">从业十七年，曾任即时Linux研究院副院长、PHPChina技术总监等职，国内早期的UNIX/Linux从业者，中国UNIX用户协会成员，首批红旗Linux认证讲师。先后出版过《UNIX系统管理实用教程》、《UNIX网络管理实用教程》、《Sun Solaris 8系统管理员指南》、《PHP5项目开发实战详解》、《完美应用Ubuntu》等多本计算机技术图书，国内多所大学外聘讲师，《开放系统世界》及《网络与运维》等杂志专栏作家。近年来致力于Linux/LAMP开源技术推广及职业教育，录制的Linux视频教程是无数从业者的入门宝典；出版的就业指导图书《明哥聊求职》广受好评；2017年明哥聊求职获教育行业优秀自媒体奖。</p>
                                    </div>
                                </section>
                            </li>
                            <li>
                                <section class="i-teach-wrap">
                                    <div class="i-teach-pic">
                                        <a href="#" title="宋老师">
                                            <img alt="宋老师" src="photo/teacher/04.jpg">
                                        </a>
                                    </div>
                                    <div class="mt10 hLh30 txtOf tac">
                                        <a href="#" title="宋老师" class="fsize18 c-666">宋老师</a>
                                    </div>
                                    <div class="hLh30 txtOf tac">
                                        <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                    </div>
                                    <div class="mt15 i-q-txt">
                                        <p class="c-999 f-fA">东北师大理学学士，北京航空航天大学硕士，曾于北航软件开发环境国家重点实验室研究多项课题，对智能交通—浮动车海量数据挖掘及在线社交网络信息传播和控制问题有深入研究，曾发表论文数篇。先后担任过高级软件开发工程师，系统架构师，高级讲师。具备丰富的软件开发经验和教学经验。精通C/C++、Java、Objective-C 等开发语言， 对JavaEE、Android开发有深入理解，对以Java语言为基础的各种框架有深入研究。亲自主持开发过多个大型项目，具备很强的项目管理能力和丰富的项目实施经验。</p>
                                    </div>
                                </section>
                            </li>
                        </ul>
                        <div class="clear"></div>
                    </article>
                    <section class="tac pt20">
                        <a href="#" title="全部讲师" class="comm-btn c-btn-2">全部讲师</a>
                    </section>
                </div>
            </section>
        </div>
        <!-- /网校名师 结束 -->
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
    <!-- /公共底引入 -->
</div>

<script src="js/jquery-1.7.2.min.js"></script>
<script src="js/swiper-2.1.0.js"></script>
<script src="js/index.js"></script>
<script>
    $(function () {
        sSwiperFun(); //幻灯片调取
    });
</script>
</body>
</html>
