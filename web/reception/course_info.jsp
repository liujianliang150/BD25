<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no,minimal-ui">
    <title>谷粒学院 - Java视频|HTML5视频|前端视频|Python视频|大数据视频-自学拿1万+月薪的IT在线视频课程，谷粉力挺，老学员为你推荐</title>
    <meta name="keywords" content="谷粒学院,IT在线视频教程,Java视频,HTML5视频,前端视频,Python视频,大数据视频"/>
    <meta name="description"
          content="谷粒学院是国内领先的IT在线视频学习平台、职业教育平台。截止目前,谷粒学院线上、线下学习人次数以万计！会同上百个知名开发团队联合制定的Java、HTML5前端、大数据、Python等视频课程，被广大学习者及IT工程师誉为：业界最适合自学、代码量最大、案例最多、实战性最强、技术最前沿的IT系列视频课程！"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent"/>
    <meta content="telephone=no" name="format-detection"/>
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/theme.css">
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/web.css">
    <script src="js/jquery-1.7.2.min.js">
    </script>
    <script>
        var course = "";
        var kpoint = "";
        $(function () {
            // 获取courseid,得到数据
            var id = getQueryVariable("courseId");

            if (id == false) {
                id = 0;
            }


            $.get("${path}/coursequeriesById", "courseId=" + id, function (data) {

                // // 判断是否可以得到数据
                if (data.course == null) {
                    window.location.href = "course.jsp";
                }
                // 得到json对象，填充数据
                course = data.course;
                kpoint = data.kpoint;

                $("#a2").attr("href", "course.jsp");
                $("#a2").html(course.coursetype);
                $("#sp1").html(course.coursename);
                $("#courseImg").attr("src", course.logo).attr("alt", course.coursename);
                $("#spaCname").html(course.coursename)
                $("#spaTeac").html(course.teachername)
                $("#buyCount").html(course.pagebuycount)
                $("#lessionNum").html(course.lessionnum)
                $("#viewCount").html(course.pageviewcount)
                $("#spaPrice").html("￥" + course.currentprice)

                clearCss1($(".current"));


            }, "json")


            // 自定义方法，获取url中的参数
            function getQueryVariable(variable) {
                var query = window.location.search.substring(1);
                var vars = query.split("&");
                for (var i = 0; i < vars.length; i++) {
                    var pair = vars[i].split("=");
                    if (pair[0] == variable) {
                        return pair[1];
                    }
                }
                return (false);
            };


        })

        function clearCss1(data) {
            $("#c-i-tabTitle a").removeClass();
            $(data).addClass("current")
            var content = "<div>\n" +
                "                                    <h6 class=\"c-i-content c-infor-title\">\n" +
                "                                        <span>课程介绍</span>\n" +
                "                                    </h6>\n" +
                "                                    <div class=\"course-txt-body-wrap\">\n" +
                "                                        <section class=\"course-txt-body\">"
                + course.context +
                "    </section>\n" +
                "                                    </div>\n" +
                "                                </div>"
            $("#art1").html(content);

        }

        function jumpVideo() {

        }

        function clearCss2(data) {
            $("#c-i-tabTitle a").removeClass();
            $(data).addClass("current")

            var concent =
                "<div>\n" +
                "            <h6 class=\"c-g-content c-infor-title\">\n" +
                "            <span>课程大纲</span>\n" +
                "            </h6>\n" +
                "            <section class=\"mt20\">\n" +
                "            <div class=\"lh-menu-wrap\">\n" +
                "            <menu id=\"lh-menu\" class=\"lh-menu mt10 mr10\">\n" +
                "            <ul>"

            // 课程大纲
            $.each(kpoint, function (i, v) {

                concent += "<li class=\"lh-menu-stair\">\n" +
                    "        <ol class=\"lh-menu-ol\" style=\"display: block;\">\n" +
                    "            <li class=\"lh-menu-second ml30\"><a href='javaScript:;' onclick='jumpVideo(v)' title=''>\n" +
                    "            <em class=\"lh-menu-i-2 icon16 mr5\">&nbsp;</em>" + v.name + "</a>\n" +
                    "        </li>\n"
            })

            concent += "               </ul>" +
                "               </menu>" +
                "               </div>" +
                "           </section>" +
                "        </div>"

                // 填充页面元素
                $("#art1").html(concent)


        }

        function clearCss3(data) {
            $("#c-i-tabTitle a").removeClass();
            $(data).addClass("current")
        }
    </script>
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
                    <li><a href="index.jsp" title="首页">首页</a></li>
                    <li class="current"><a href="course.jsp" title="课程">课程</a></li>
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
                            </button>
                        </label>
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
        <!-- /课程详情 开始 -->
        <section class="container">
            <section class="path-wrap txtOf hLh30">
                <a href="#" title="" class="c-999 fsize14">首页</a>
                \
                <a id="a2" href="#" title="" class="c-999 fsize14">a2</a>

                <%--                  \  <a  id="a3" href="#" title="" class="c-999 fsize14">a3</a>--%>
                \ <span id="sp1" class="c-333 fsize14"> </span>
            </section>
            <div>
                <article class="c-v-pic-wrap" style="height: 357px;">
                    <section class="p-h-video-box" id="videoPlay">
                        <img id="courseImg" src="photo/course/01.jpg" alt="30天搞定Java核心技术" class="dis c-v-pic">
                    </section>
                </article>
                <aside class="c-attr-wrap">
                    <section class="ml20 mr15">
                        <h2 class="hLh30 txtOf mt15">
                            <span id="spaCname" class="c-fff fsize24">30天搞定Java核心技术</span>
                        </h2>
                        <section class="c-attr-jg">
                            <span class="c-fff">价格：</span>
                            <b id="spaPrice" class="c-yellow" style="font-size:24px;">￥0.00</b>
                        </section>
                        <section class="c-attr-mt c-attr-undis">
                                <span id="spaTeac" class="c-fff fsize14">主讲： 唐嫣&nbsp;&nbsp;&nbsp;
                                </span>
                        </section>
                        <section class="c-attr-mt of">
                            <span class="ml10 vam">
                                <em class="icon18 scIcon"></em>
                                <a class="c-fff vam" title="收藏" href="#">收藏</a>
                            </span>
                        </section>
                        <section class="c-attr-mt">
                            <a href="#" title="立即观看" class="comm-btn c-btn-3">立即观看</a>
                        </section>
                    </section>
                </aside>
                <aside class="thr-attr-box">
                    <ol class="thr-attr-ol clearfix">
                        <li>
                            <p>&nbsp;</p>
                            <aside>
                                <span class="c-fff f-fM">购买数</span><br>
                                <h6 id="buyCount" class="c-fff f-fM mt10">150</h6>
                            </aside>
                        </li>
                        <li>
                            <p>&nbsp;</p>
                            <aside>
                                <span class="c-fff f-fM">课时数</span><br>
                                <h6 id="lessionNum" class="c-fff f-fM mt10">20</h6>
                            </aside>
                        </li>
                        <li>
                            <p>&nbsp;</p>
                            <aside>
                                <span class="c-fff f-fM">浏览数</span><br>
                                <h6 id="viewCount" class="c-fff f-fM mt10">501</h6>
                            </aside>
                        </li>
                    </ol>
                </aside>
                <div class="clear"></div>
            </div>
            <!-- /课程封面介绍 -->
            <div class="mt20 c-infor-box">
                <article class="fl col-7">
                    <section class="mr30">
                        <div class="i-box">
                            <div>
                                <section id="c-i-tabTitle" class="c-infor-tabTitle c-tab-title">
                                    <a class="current" name="c-i" title="课程详情" href="javascript:void(0);"
                                       onclick="clearCss1(this)">课程详情</a>
                                    <a name="c-g" title="课程大纲" href="javascript:void(0);"
                                       onclick="clearCss2(this)">课程大纲</a>
                                    <a name="c-c" title="课程评论" href="javascript:void(0);"
                                       onclick="clearCss3(this)">课程评论</a>
                                </section>
                            </div>
                            <article id="art1" class="ml10 mr10 pt20">
                                <div>
                                    <h6 class="c-i-content c-infor-title">
                                        <span>课程介绍</span>
                                    </h6>
                                    <div class="course-txt-body-wrap">
                                        <section class="course-txt-body">
                                            <%--                                                <p>Java的发展历史，可追溯到1990年。当时Sun&nbsp;Microsystem公司为了发展消费性电子产品而进行了一个名为Green的项目计划。该计划--%>
                                            <%--                                                    负责人是James&nbsp;Gosling。起初他以C++来写一种内嵌式软件，可以放在烤面包机或PAD等小型电子消费设备里，使得机器更聪明，具有人工智--%>
                                            <%--                                                    能。但他发现C++并不适合完成这类任务！因为C++常会有使系统失效的程序错误，尤其是内存管理，需要程序设计师记录并管理内存资源。这给设计师们造成--%>
                                            <%--                                                    极大的负担，并可能产生许多bugs。&nbsp;<br>--%>
                                            <%--                                                    为了解决所遇到的问题，Gosling决定要发展一种新的语言，来解决C++的潜在性危险问题，这个语言名叫Oak。Oak是一种可移植性语言，也就是一种平台独立语言，能够在各种芯片上运行。<br>--%>
                                            <%--                                                    1994年，Oak技术日趋成熟，这时网络正开始蓬勃发展。Oak研发小组发现Oak很适合作为一种网络程序语言。因此发展了一个能与Oak配合的浏--%>
                                            <%--                                                    览器--WebRunner，后更名为HotJava，它证明了Oak是一种能在网络上发展的程序语言。由于Oak商标已被注册，工程师们便想到以自己常--%>
                                            <%--                                                    享用的咖啡(Java)来重新命名，并于Sun&nbsp;World&nbsp;95中被发表出来。</p>--%>
                                        </section>
                                    </div>
                                </div>
                                <!-- /课程介绍 -->

                                <div class="mt50">
                                    <h6 class="c-g-content c-infor-title">
                                        <span>课程大纲</span>
                                    </h6>
                                    <section class="mt20">
                                        <div class="lh-menu-wrap">
                                            <menu id="lh-menu" class="lh-menu mt10 mr10">
                                                <ul>
                                                    <!-- 文件目录 -->
                                                    <li class="lh-menu-stair">
                                                        <a href="javascript: void(0)" title="第一章" class="current-1">
                                                            <em class="lh-menu-i-1 icon18 mr10"></em>第一章</a>
                                                        <ol class="lh-menu-ol" style="display: block;">
                                                            <li class="lh-menu-second ml30"><a href="#" title="">
                                            <span class="fr">
                                                <i class="free-icon vam mr10">免费试听</i>
                                            </span>
                                                                <em class="lh-menu-i-2 icon16 mr5">&nbsp;</em>第一节</a>
                                                            </li>
                                                            <li class="lh-menu-second ml30"><a href="#" title=""
                                                                                               class="current-2">
                                                                <em class="lh-menu-i-2 icon16 mr5">&nbsp;</em>第二节</a>
                                                            </li>
                                                        </ol>
                                                    </li>

                                                </ul>
                                            </menu>
                                        </div>
                                    </section>
                                </div>
                                <!-- /课程大纲 -->
                                <div>
                                    <%--									<div class="mt50 commentHtml"><div>--%>
                                    <%--										<h6 class="c-c-content c-infor-title" id="i-art-comment">--%>
                                    <%--											<span class="commentTitle">课程评论</span>--%>
                                    <%--										</h6>--%>
                                    <%--										<section class="lh-bj-list pr mt20 replyhtml">--%>
                                    <%--											<ul>--%>
                                    <%--												<li class="unBr">--%>
                                    <%--													<aside class="noter-pic">--%>
                                    <%--														<img width="50" height="50" class="picImg" src="http://127.0.0.1:81/static/inxweb/img/avatar-boy.gif">--%>
                                    <%--														</aside>--%>
                                    <%--													<div class="of">--%>
                                    <%--														<section class="n-reply-wrap">--%>
                                    <%--															<fieldset>--%>
                                    <%--																<textarea name="" placeholder="输入您要评论的文字" id="commentContent"></textarea>--%>
                                    <%--															</fieldset>--%>
                                    <%--															<p class="of mt5 tar pl10 pr10">--%>
                                    <%--																<span class="fl "><tt class="c-red commentContentmeg" style="display: none;"></tt></span>--%>
                                    <%--																<a href="javascript:addComment();" title="回复" class="lh-reply-btn">回复</a>--%>
                                    <%--															</p>--%>
                                    <%--														</section>--%>
                                    <%--													</div>--%>
                                    <%--												</li>--%>
                                    <%--											</ul>--%>
                                    <%--										</section>--%>
                                    <%--                                        <div>--%>
                                    <%--&lt;%&ndash;										<section class="">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;												<section class="question-list lh-bj-list pr">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;													<ul class="pr10">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;														<li>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<aside class="noter-pic">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<img width="50" height="50" class="picImg" src="http://127.0.0.1:81/images/upload/customer/20150910/1441527777887.jpg">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</aside>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="of">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<span class="fl"> &ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<font class="fsize12 c-blue"> &ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		goddess</font>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<font class="fsize12 c-999 ml5">评论：</font></span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="noter-txt mt5">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<p>是一种面向对象、解释型计算机程序设计语言，由Guido van Rossum于1989年发明，第一个公开发行版发行于1991年。</p>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="of mt5">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<span class="fr"><font class="fsize12 c-999 ml5">2015/11/04 11:59</font></span> <span class="fl"> <a class="noter-dy vam" title="回复" href="javascript: void(0)" onclick="queryCommentReply('7')">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<em class="icon18">&nbsp;</em>(<span class="replyCount7">1</span>)&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</a> <tt title="赞一下" class="noter-zan vam ml10" onclick="addPraise('7',4)">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<em class="icon18">&nbsp;</em>(<span class="addPraise7_4 praiseCount">0</span>)&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</tt>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="n-reply">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<section class="n-reply-wrap">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		<fieldset>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<textarea name="" class="commentReplyMsgContent7"></textarea>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</fieldset>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		<p class="of mt5 tar pl10 pr10">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<span class="fl"><tt class="c-red commentReplyMsg7"></tt></span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<a onclick="addCommentReply('7')" class="lh-reply-btn" title="回复" href="javascript: void(0)">回复</a>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</p>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</section>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<div class="mt10 pl10 pr10 pb10 commentReply7"></div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div> <!-- /回复盒子 -->&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;															</li>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;														<li>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<aside class="noter-pic">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<img width="50" height="50" class="picImg" src="http://127.0.0.1:81/images/upload/customer/20150910/1441527777887.jpg">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</aside>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="of">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<span class="fl"> &ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<font class="fsize12 c-blue"> &ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		goddess</font>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<font class="fsize12 c-999 ml5">评论：</font></span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="noter-txt mt5">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<p>收藏了</p>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="of mt5">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<span class="fr"><font class="fsize12 c-999 ml5">2015/11/04 10:32</font></span> <span class="fl"> <a class="noter-dy vam" title="回复" href="javascript: void(0)" onclick="queryCommentReply('2')">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<em class="icon18">&nbsp;</em>(<span class="replyCount2">0</span>)&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</a> <tt title="赞一下" class="noter-zan vam ml10" onclick="addPraise('2',4)">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<em class="icon18">&nbsp;</em>(<span class="addPraise2_4 praiseCount">0</span>)&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</tt>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="n-reply">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<section class="n-reply-wrap">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		<fieldset>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<textarea name="" class="commentReplyMsgContent2"></textarea>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</fieldset>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		<p class="of mt5 tar pl10 pr10">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<span class="fl"><tt class="c-red commentReplyMsg2"></tt></span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<a onclick="addCommentReply('2')" class="lh-reply-btn" title="回复" href="javascript: void(0)">回复</a>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</p>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</section>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<div class="mt10 pl10 pr10 pb10 commentReply2"></div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div> <!-- /回复盒子 -->&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;															</li>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;														<li>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<aside class="noter-pic">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<img width="50" height="50" class="picImg" src="http://127.0.0.1:81/images/upload/customer/20150910/1441527777887.jpg">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</aside>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="of">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<span class="fl"> &ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<font class="fsize12 c-blue"> &ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		goddess</font>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<font class="fsize12 c-999 ml5">评论：</font></span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="noter-txt mt5">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<p>讲得很详细</p>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="of mt5">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<span class="fr"><font class="fsize12 c-999 ml5">2015/11/04 10:32</font></span> <span class="fl"> <a class="noter-dy vam" title="回复" href="javascript: void(0)" onclick="queryCommentReply('1')">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<em class="icon18">&nbsp;</em>(<span class="replyCount1">0</span>)&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</a> <tt title="赞一下" class="noter-zan vam ml10" onclick="addPraise('1',4)">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<em class="icon18">&nbsp;</em>(<span class="addPraise1_4 praiseCount">0</span>)&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</tt>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																<div class="n-reply">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<section class="n-reply-wrap">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		<fieldset>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<textarea name="" class="commentReplyMsgContent1"></textarea>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</fieldset>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		<p class="of mt5 tar pl10 pr10">&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<span class="fl"><tt class="c-red commentReplyMsg1"></tt></span>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																			<a onclick="addCommentReply('1')" class="lh-reply-btn" title="回复" href="javascript: void(0)">回复</a>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																		</p>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	</section>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																	<div class="mt10 pl10 pr10 pb10 commentReply1"></div>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;																</div> <!-- /回复盒子 -->&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;															</li>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;														</ul>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;												</section>&ndash;%&gt;--%>
                                    <%--&lt;%&ndash;											</section>&ndash;%&gt;--%>
                                    <%--                                        </div>--%>
                                    <%--											<!-- 公共分页 开始 -->--%>
                                    <%--											<div class="paging">--%>
                                    <%--												<a href="javascript:goPageAjax(1);" title="">首</a>--%>
                                    <%--												<a id="backpage" class="undisable" href="javascript:void(0)" title="">&lt;</a>--%>
                                    <%--													<a href="javascript:void(0)" title="" class="current undisable">1</a><a id="nextpage" href="javascript:void(0)" title="" class="undisable">&gt;</a>--%>
                                    <%--													<a href="javascript:goPageAjax(1);" title="">末</a>--%>
                                    <%--												<div class="clear"></div>--%>
                                    <%--											</div>--%>
                                    <%--											<!-- 公共分页 结束 -->--%>
                                    <%--										</div>--%>
                                </div>

                            </article>
                        </div>
                    </section>
                </article>
                <aside class="fl col-3">
                    <div class="i-box">
                        <div>
                            <section class="c-infor-tabTitle c-tab-title">
                                <a title="" href="javascript:void(0)">主讲讲师</a>
                            </section>
                            <section class="stud-act-list">
                                <ul style="height: auto;">
                                    <li>
                                        <div class="u-face">
                                            <a href="#">
                                                <img src="photo/teacher/01.jpg" width="50" height="50">
                                            </a>
                                        </div>
                                        <section class="hLh30 txtOf">
                                            <a class="c-333 fsize16 fl" href="#">佟老师</a>
                                        </section>
                                        <section class="hLh20 txtOf">
                                            <span class="c-999">毕业于北京大学数学系</span>
                                        </section>
                                    </li>
                                </ul>
                            </section>
                        </div>
                    </div>

                    <div class="i-box mt20">
                        <section class="c-infor-tabTitle c-tab-title">
                            <a href="" title="">学过此课的人（4）</a>
                        </section>
                        <section class="buy-cin-list">
								<span title="Helen">
									<img alt="" src="photo/customer/01.jpg">
									<tt class="c-999">Helen</tt>
								</span>
                            <span title="goddess">
									<img alt="" src="photo/customer/02.jpg">
									<tt class="c-999">goddess</tt>
								</span>
                            <span title="qwe@qwe.com">
									<img alt="" src="photo/customer/avatar-boy.gif">
									<tt class="c-999">qwe@qwe.com</tt>
								</span>
                            <span title="exmail@qq.com">
									<img alt="" src="photo/customer/avatar-boy.gif">
									<tt class="c-999">exmail@qq.com</tt>
								</span>
                        </section>
                    </div>
                </aside>
                <div class="clear"></div>
            </div>
        </section>
        <!-- /课程详情 结束 -->
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