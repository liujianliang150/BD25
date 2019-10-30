<%--
  Created by IntelliJ IDEA.
  Description:   公共头部
  Author: 周小龙
  Date:  2019/10/30
  Time:  10:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 公共头 -->
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
<!-- /公共头 -->