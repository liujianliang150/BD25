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
                        <li><a href="course.jsp" title="课程">课程</a></li>
                        <li><a href="teacher.jsp" title="名师">名师</a></li>
                        <li class="current"><a href="article.jsp" title="文章">文章</a></li>
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
			<section class="container">
				<section class="i-article">
					<div class="fl col-7">
						<section class="mr30">
							<header class="comm-title all-article-title">
								<h2 class="fl tac">
									<span class="c-333">文章</span>
								</h2>
								<section class="c-tab-title">
									<a href="javascript: void(0)">&nbsp;</a>
								</section>
							</header>
							<!-- /无数据提示 开始-->
							<!-- /无数据提示 结束-->
							<article class="i-article-list">
								<!-- /文章列表 开始-->
								<ul>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/01.jpg" alt="雅思阅读能力提高有方法 文章精读可以这样做">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="雅思阅读能力提高有方法 文章精读可以这样做" class="i-art-title">雅思阅读能力提高有方法 文章精读可以这样做</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">雅思阅读能力提高有方法 文章精读可以这样做</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2019-02-26 10:31</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/23.html">
														<em class="icon18">&nbsp;</em>(<span>1</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('23',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise23_3 praiseCount">1</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/02.jpg" alt="关注·底层教育梦：先天不足 后天亏损？">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="关注·底层教育梦：先天不足 后天亏损？" class="i-art-title">关注·底层教育梦：先天不足 后天亏损？</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">关注·底层教育梦：先天不足 后天亏损？</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-28 16:12</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/26.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('26',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise26_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/03.jpg" alt="哈佛商学院院长：21世纪人人都需要创业精神">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="哈佛商学院院长：21世纪人人都需要创业精神" class="i-art-title">哈佛商学院院长：21世纪人人都需要创业精神</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">哈佛商学院院长：21世纪人人都需要创业精神</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-28 15:08</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/22.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('22',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise22_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/04.jpg" alt="美国教授：求知是为了看世界 不是让世界看你">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="美国教授：求知是为了看世界 不是让世界看你" class="i-art-title">美国教授：求知是为了看世界 不是让世界看你</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">美国教授：求知是为了看世界 不是让世界看你</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-28 15:04</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/21.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('21',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise21_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/05.jpg" alt="MBA过来人亲述：联考英语复习经验">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="MBA过来人亲述：联考英语复习经验" class="i-art-title">MBA过来人亲述：联考英语复习经验</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">　在各门科目之中，有两门课程是拉分最多的，一门是数学，一门是英语。其中英语是在多数考生最大的拦路虎，因为工作多年的人，如果工作中不常接触，英语的底子多是很差的。而英语是很难突击上去的，靠临时“抱佛脚”很难奏效。我英语基础较差，但经过自己有计划、有重点的系统复习，年MBA[微博]联考中，英语过了70分这道槛，取得了较为满意的结果，感到甚是欣慰。</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-10 00:00</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/20.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('20',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise20_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/06.jpg" alt="中国首款学习习近平重要讲话APP上线">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="中国首款学习习近平重要讲话APP上线" class="i-art-title">中国首款学习习近平重要讲话APP上线</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">“学习中国”APP得到了国家互联网信息办公室的支持与指导。</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/7.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('7',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise7_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/07.jpg" alt="嘲讽陈年是很容易的事，但我更愿意祝他成功">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="嘲讽陈年是很容易的事，但我更愿意祝他成功" class="i-art-title">嘲讽陈年是很容易的事，但我更愿意祝他成功</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">嘲讽陈年是很容易的事，但我更愿意祝他成功</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/9.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('9',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise9_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/08.jpg" alt="陈年重回T恤大战：凡客归来">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="陈年重回T恤大战：凡客归来" class="i-art-title">陈年重回T恤大战：凡客归来</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">凡客之路，兴于衬衫，成于T恤。2018年的春夏之交，凡客再次发布了自己的T恤，种种迹象表明，陈年与他的凡客，这一次要，归来。凡客能否重温2011年的T恤辉煌？</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/11.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('11',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise11_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/09.jpg" alt="法国总理证实失事客机无人生还">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="法国总理证实失事客机无人生还" class="i-art-title">法国总理证实失事客机无人生还</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">据美国《华盛顿邮报》3月24日报道，法国总理瓦尔斯称，一架直升机已尝试降落在坠毁地点附近，并未发现失事客机上有生还者</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/13.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('13',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise13_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
									<li>
										<aside class="i-article-pic">
											<img src="photo/article/10.jpg" alt="背水一战的任天堂">
										</aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="背水一战的任天堂" class="i-art-title">背水一战的任天堂</a>
										</h3>
										<section class="i-q-txt mt5 i-q-txt2">
											<p>
												<span class="c-999 f-fA">面对所处的窘境，固执的任天堂也低下了他那傲娇的头，而如今啪啪啪打脸般的迈出了这一步，其实他也是被逼无奈的，或者说岩田聪已经没有什么更好的办法扭转颓势了</span>
											</p>
										</section>
										<section class="hLh30 txtOf mt5 pr10 a-list-extrainfo">
											<span class="fr"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
											<div class="fl">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/14.html">
														<em class="icon18">&nbsp;</em>(<span>0</span>)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('14',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise14_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
										</section>
									</li>
								</ul>
								<!-- /文章列表 结束-->
							</article>
							
							<!-- 公共分页 开始 -->
							<div>
								<div class="paging">
									<a class="undisable" title>首</a>
									<a id="backpage" class="undisable" href="#" title>&lt;</a>
									<a href="#" title class="current undisable">1</a>
									<a href="#" title>2</a>
									<a id="nextpage" href="#" title>&gt;</a>
									<a href="#" title>末</a>
									<div class="clear"></div>
								</div>
							</div>
							<!-- 公共分页 结束 -->
							
						</section>
					</div>
					
					<!-- 好文推荐 -->
					<aside class="fl col-3 articleRecommend">
						<div>
							<header class="comm-title all-article-title">
								<h2 class="fl tac">
									<span class="c-333">文章排行榜</span>
								</h2>
								<section class="c-tab-title">
									<a href="javascript: void(0)">&nbsp;</a>
								</section>
							</header>
							<section class="i-article-list r-art-wrap">
								<ul>
									<li class="lt2">
										<aside class="orderNum"><span>1</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="雅思阅读能力提高有方法 文章精读可以这样做" class="i-art-title">雅思阅读能力提高有方法 文章精读可以这样做</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/23.html">
														<em class="icon18">&nbsp;</em>(1)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('23',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise23_3 praiseCount">1</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2019-02-26 10:31</tt></span>
										</section>
									</li>
									<li class="lt2">
										<aside class="orderNum"><span>2</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="中国军舰协助英、德等10国从也门撤侨225人" class="i-art-title">中国军舰协助英、德等10国从也门撤侨225人</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/17.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('17',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise17_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li class="lt2">
										<aside class="orderNum"><span>3</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="MBA过来人亲述：联考英语复习经验" class="i-art-title">MBA过来人亲述：联考英语复习经验</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/20.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('20',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise20_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-10 00:00</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>4</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="中国首款学习习近平重要讲话APP上线" class="i-art-title">中国首款学习习近平重要讲话APP上线</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/7.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('7',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise7_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>5</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="背水一战的任天堂" class="i-art-title">背水一战的任天堂</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/14.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('14',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise14_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>6</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="嘲讽陈年是很容易的事，但我更愿意祝他成功" class="i-art-title">嘲讽陈年是很容易的事，但我更愿意祝他成功</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/9.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('9',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise9_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>7</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="渠道之殇：三星手机中国没落背后" class="i-art-title">渠道之殇：三星手机中国没落背后</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/15.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('15',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise15_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>8</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="陈年重回T恤大战：凡客归来" class="i-art-title">陈年重回T恤大战：凡客归来</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="http://127.0.0.1:81/front/articleinfo/11.html">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('11',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise11_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">2018-09-09 10:08</tt></span>
										</section>
									</li>
								</ul>
							</section>
						</div>
					</aside>
					<div class="clear"></div>
				</section>
			</section>
			<!-- /文章列表 结束 -->
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