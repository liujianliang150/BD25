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
    <script src="js/jquery-1.7.2.min.js"></script>
    <script>
        $(function () {

            // 初始化>>   显示全部数据
            submit("",1);

            // 当前页码
            var pageno = parseInt($("#pageno").val());

            // 点击触发  当前页码-1
            $("#backpage").click(function () {
                var pageno = parseInt($("#pageno").val());
                $("#pageno").val(pageno - 1)

                // ajax提交
                submit("", $("#pageno").val())

            })

            // 点击触发  当前页码+1
            $("#nextpage").click(function () {
                var pageno = parseInt($("#pageno").val());
                $("#pageno").val(pageno + 1)

                // ajax提交
                submit("", $("#pageno").val())
            })

            // 点击触发  当前页码 =  value
            $(".current").click(function () {

                var v = parseInt($(this).html());

                $("#pageno").val(v)

                // ajax提交
                submit("", $("#pageno").val())

            })

            //  点击课程类型获取该类型下的所有课程信息
            $(".c-s-dl-li li a").click(function () {
                //  获取当前a标签的文本信息（即课程类型）
                var type = $(this).text();
                alert(type)
                submit(type, pageno);
            })


            function submit(param, pageNo) {
                // 用ajax将课程类型传入后台，并返回新的页面内容
                $.post("${path}/coursequeries", "type=" + param + "&pageNo=" + pageNo, x, "json");


                function x(data) {

                    if (!$.isEmptyObject(data.list)) {
                        var info = "<article class=\"comm-course-list\">\n" +
                            "                        <ul class=\"of\" id=\"bna\">";
                        $.each(data.list, function (index, val) {
                            // $("#bna").html(
                            info += " <li>\n" +
                                "                                    <div class=\"cc-l-wrap\">\n" +
                                "                                        <section class=\"course-img\">\n" +
                                "                                            <img src='" + val.logo + "' class=\"img-responsive\" alt='" + val.coursename + "'>\n" +
                                "                                            <div class=\"cc-mask\">\n" +
                                "                                                <a href='" + "course_info.jsp?courseId="+val.courseid + "' title=\"开始学习\" class=\"comm-btn c-btn-1\">开始学习</a>\n" +
                                "                                            </div>\n" +
                                "                                        </section>\n" +
                                "                                        <h3 class=\"hLh30 txtOf mt10\">\n" +
                                "                                            <a href='"  + "course_info.jsp?courseId="+val.courseid +" 'title=" + val.coursename + " class=\"course-title fsize18 c-333\">" + val.coursename + "</a>\n" +
                                "                                        </h3>\n" +
                                "                                        <section class=\"mt10 hLh20 of\">\n" +
                                "                                            <span class=\"fr jgTag bg-green\">\n" +
                                "                                                <i class=\"c-fff fsize12 f-fA\">免费</i>\n" +
                                "                                            </span>\n" +
                                "                                            <span class=\"fl jgAttr c-ccc f-fA\">\n" +
                                "                                                <i class=\"c-999 f-fA\">\n" +
                                "                                                    " + val.pagebuycount + "人学习\n" +
                                "                                                </i>\n" +
                                "                                            </span>\n" +
                                "                                        </section>\n" +
                                "                                    </div>\n" +
                                "                                </li>"
                            // )
                        })
                        info += "</ul>\n" +
                            "                        <div class=\"clear\"></div>\n" +
                            "                    </article>";
                        $("#div40").html(info);
                        // 更新当前页码
                        $("#pageno").val(data.pageNum);

                    } else if ($.isEmptyObject(data.list)) {

                        var info = " <section class=\"no-data-wrap\">\n" +
                            "                            <em class=\"icon30 no-data-ico\">&nbsp;</em> <span class=\"c-666 fsize14 ml10 vam\">没有相关数据，小编正在努力整理中...</span>\n" +
                            "                        </section>";
                        $("#div40").html(info);
                    }
                }


            }

        })

        function clearCss(data) {
            $("#oli li a").removeClass();
            $(data).addClass("current bg-orange")
        }
    </script>
</head>

<body class="W-body">
<%--隐藏域  当前页码--%>
<input id="pageno" type="hidden" value="1">
<%--隐藏域  当前查看课程类型--%>
<input id="type" type="hidden" value="">
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
        <!-- /课程列表 开始 -->
        <section class="container">
            <header class="comm-title">
                <h2 class="fl tac">
                    <span class="c-333">课程列表</span>
                </h2>
            </header>
            <section class="c-sort-box">
                <section class="c-s-dl">
                    <dl>
                        <dt>
                            <span class="c-999 fsize14">课程类别</span>
                        </dt>
                        <dd class="c-s-dl-li">
                            <ul class="clearfix">
                                <li><a title="全部" href="#">全部</a></li>
                                <li><a title="python" href="#">python</a></li>
                                <li><a title="大数据" href="#">大数据</a></li>
                                <li><a title="Linux" href="#">Linux</a></li>
                                <li><a title="区块链" href="#">区块链</a></li>
                                <li class="current"><a title="Java" href="#">Java</a></li>
                                <li><a title="H5前端" href="#">H5前端</a></li>
                                <li><a title="H5前端" href="#">数据库</a></li>
                                <li><a title="H5前端" href="#">Android</a></li>
                                <li><a title="H5前端" href="#">直播课</a></li>
                            </ul>
                        </dd>
                    </dl>
                    <dl>
                        <dt>
                            <span class="c-999 fsize14"></span>
                        </dt>
                        <dd class="c-s-dl-li">
                            <ul class="clearfix">
                                <li class="current"><a title="全部" href="#">全部</a></li>
                                <li><a title="Java基础" href="#">Java基础</a></li>
                                <li><a title="Java8" href="#">Java8</a></li>
                                <li><a title="JavaWeb" href="#">JavaWeb</a></li>
                                <li><a title="Struts2" href="#">Struts2</a></li>
                                <li><a title="Hibernate4" href="#">Hibernate4</a></li>
                                <li><a title="Spring4" href="#">Spring4</a></li>
                                <li><a title="SSH整合" href="#">SSH整合</a></li>
                                <li><a title="SpringMVC" href="#">SpringMVC</a></li>
                                <li><a title="JPA" href="#">JPA</a></li>
                                <li><a title="Maven" href="#">Maven</a></li>
                                <li><a title="mybatis" href="#">mybatis</a></li>
                                <li><a title="Redis" href="#">Redis</a></li>
                                <li><a title="Shiro" href="#">Shiro</a></li>
                                <li><a title="SpringData" href="#">SpringData</a></li>
                                <li><a title="SSM高级整合" href="#">SSM高级整合</a></li>
                                <li><a title="SSSP整合" href="#">SSSP整合</a></li>
                                <li><a title="SVN视频" href="#">SVN视频</a></li>
                            </ul>
                        </dd>
                    </dl>
                    <div class="clear"></div>
                </section>
                <div class="js-wrap">
                    <section class="fr">
                            <span class="c-ccc"> <i class="c-master f-fM">1</i>/<i class="c-666 f-fM">1</i>
                            </span>
                    </section>
                    <section class="fl">
                        <ol id="oli" class="js-tap clearfix">
                            <li><a title="最新" href="javaScript:;" onclick="clearCss(this)">最新</a></li>
                            <li><a title="最热" href="javaScript:;" onclick="clearCss(this)">最热</a></li>
                            <li ><a title="推荐" href="javaScript:;" onclick="clearCss(this)">推荐</a></li>
                        </ol>
                    </section>
                </div>
                <div class="mt40" id="div40">
                    <!-- /无数据提示 开始-->
                    <!-- /无数据提示 结束-->
                    <article class="comm-course-list">
                        <ul class="of" id="bna">
                        </ul>
                        <div class="clear"></div>
                    </article>
                </div>
                <!-- 公共分页 开始 -->
                <div>
                    <div class="paging">
                        <a class="undisable" title>首</a>
                        <a id="backpage" class="undisable" href="#" title>&lt;</a>
                        <a href="#" title class="current">1</a>
                        <a href="#" title class="current">2</a>
                        <a id="nextpage" href="#" title>&gt;</a>
                        <a href="#" title>末</a>
                        <div class="clear"></div>
                    </div>
                </div>
                <!-- 公共分页 结束 -->
            </section>
        </section>
        <!-- /课程列表 结束 -->
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