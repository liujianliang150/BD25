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
                        <li><a href="index.html" title="首页">首页</a></li>
                        <li><a href="course.jsp" title="课程">课程</a></li>
                        <li><a href="teacher.jsp" title="名师">名师</a></li>
                        <li><a href="article.jsp" title="文章">文章</a></li>
                        <li class="current"><a href="question.jsp" title="问答">问答</a></li>
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

        <div class="bg-fa of">
			<section class="container">
				<section class="i-question">
					<div class="fl col-7">
						<section class="mr30 pt10">
							<section class="path-wrap txtOf hLh30">
								<a href="http://127.0.0.1:81" title="" class="c-999 fsize14">首页</a>
								\
								<a href="http://127.0.0.1:81/questions/list" title="" class="c-999 fsize14">全部问答</a>
								\ <span class="c-333 fsize14">Premiere视频教学视频,大神分享下好吗</span>
							</section>
							<!-- /问题详情 开始 -->
							<div>
								<section class="q-infor-box">
									<div class="pr">
										<aside class="q-head-pic">
											<img src="photo/customer/02.jpg" alt="">
												<p class="hLh30 txtOf"></p>
										</aside>
										<section class="q-txt-box">
											<aside class="q-share">
												<span class="fl" title="分享到："><em class="icon14 q-share-icon mt5">&nbsp;</em></span>
												<div class="fl ml10" style="width: 95px;">
													<div class="bdsharebuttonbox bdshare-button-style1-16" id="bdshare" data-bd-bind="1561107203843" style="right: -160px;">
														<a title="分享到新浪微博" href="#" class="bds_tsina" data-cmd="tsina"></a>
														<a title="分享到微信" href="#" class="bds_weixin" data-cmd="weixin"></a>
														<a title="分享到QQ空间" href="#" class="bds_qzone" data-cmd="qzone"></a>
														<a title="分享到腾讯微博" href="#" class="bds_tqq" data-cmd="tqq"></a>
													</div>
													<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"1","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
												</div>
												<div class="clear"></div>
											</aside>
											<h3 class="hLh30 txtOf">
												<em class="icon16 q-tw">&nbsp;</em> <span class="c-blue fsize14"> goddess</span> <span class="c-999 fsize14"> 课程提问</span>
											</h3>
										</section>
										<section class="ml50 pl10">
											<div class="mt20">
												<h3 class="hLh30 txtOf">
													<span class="fsize18 c-333 vam">Premiere视频教学视频,大神分享下好吗</span>
												</h3>
											</div>
											<div class="i-q-txt mt15">
												
													<span class="c-999 f-fA">Premiere视频教学视频资料,有哪位大神可以分享下吗,膜拜膜拜膜拜膜拜膜拜膜拜膜拜膜拜膜拜膜拜膜拜膜拜膜拜</span>
												
											</div>
											<div class="mt20 pr10">
												<section class="fr">
													<span> <a href="#i-art-comment" title="评论" class="noter-dy vam">
															<em class="icon18">&nbsp;</em>(<span id="questionsReplyCount">1</span>)
														</a> <tt class="noter-zan vam ml10 f-fM" title="赞一下" onclick="addPraise(9,1,this)">
															<em class="icon18">&nbsp;</em>(<span>2</span>)
														</tt>
													</span>
												</section>
												<span class="c-ccc fl vam">2015-09-10 10:31</span>
												<section class="fl ml20 pt10">
													<div class="taglist clearfix">
														<a title="Premiere" data-id="5" onclick="submitForm('5','questionsTagId')" class="list-tag" href="javascript:;">Premiere</a>
														</div>
												</section>
												<div class="clear"></div>
											</div>
										</section>
									</div>
									<span id="questionsCommentSpan"><!-- /最佳答案 开始-->
										<div class="good-anwer-box">
											<h4 class="g-a-title">
												<span class="bg-green vam"><em class="icon24 mr5">&nbsp;</em>最佳答案</span>
											</h4>
											<section class="good-answer mt10">
												<section class="question-list lh-bj-list pr">
													<ul class="pr10">
														<li>
																<aside class="noter-pic">
																	<img src="photo/customer/01.jpg" alt="" width="50" height="50">
																		</aside>
																<div class="of hLh20">
																	<span class="fl"> <font class="fsize12 c-blue">Helen</font> <font class="fsize12 c-999 ml5">回复：</font></span>
																</div>
																<div class="noter-txt mt5">
																	<p>premiere是一款常用的视频编辑软件，由Adobe公司推出。现在常用的有CS4 CS5 CS6等版本。是一款编辑画面质量比较好的软件，有较好的兼容性，且可以与adobe公司推出的其他软件相互协作。目前这款软件广泛应用于广告制作和电视节目制作中。 其最新版本为Adobe Premiere Pro CC。</p>
																</div>
																<div class="of mt5">
																	<span class="fr"><font class="fsize12 c-999 ml5">2015-09-19 10:15</font></span> <span class="fl"> <a href="javascript: void(0)" title="回答" class="noter-dy vam" onclick="getCommentById(this,12)">
																			<em class="icon18">&nbsp;</em>全部评论(<span>0</span>)
																		</a> <tt class="noter-zan vam ml10 f-fM" title="赞一下" onclick="addPraise(12,2,this)">
																			<em class="icon18">&nbsp;</em>点赞(<span>0</span>)
																		</tt>
																	</span>
																</div>
																<div class="n-reply">
																	<section class="n-reply-wrap mt10">
																		<fieldset>
																			<textarea name="" placeholder="输入您要评论的文字" id="commentContent"></textarea>
																		</fieldset>
																		<p class="of mt5 tar pl10 pr10">
																			<span class="fl "><tt class="c-red commentContentmeg" style="display: none;"></tt></span>
																			<a href="javascript:addComment();" title="回复" class="lh-reply-btn">回复</a>
																		</p>
																	</section>
																	<input type="hidden" id="" name="" value="12">
																	<div class="mt10 pl10 pr10">
																		<dl class="n-reply-list">
																			<!-- 最佳答案的评论在这里 -->
																		</dl>
																	</div>
																</div> <!-- /回复盒子 -->
															</li>
														</ul>
												</section>
											</section>
										</div>
										<!-- /最佳答案 结束-->
										<!-- /回答列表 开始 -->
										<div class="q-i-noter-box">
											<section class="q-i-reply">
												<h6 class="c-c-content c-infor-title">
													<span>问答列表</span>
												</h6>
											</section>
											<!-- /无数据提示 开始-->
											<section class="no-data-wrap">
												<em class="icon30 no-data-ico">&nbsp;</em> <span class="c-666 fsize14 ml10 vam">还没有人回答，提问者喊你去回答...</span>
											</section>
											<!-- /无数据提示 结束-->
										</div>
									</span>
								</section>
							</div>
							<!-- /问题列表 结束 -->
						</section>
					</div>
					<aside class="fl col-3">
						<div class="mt30 pl10">
							<section class="pt10">
								<a href="javascript:void(0)" onclick="toAddQuestions()" title="我要提问" class="comm-btn c-btn-5">我要提问</a>
							</section>
							<section class="pt20">
								<div class="taglist clearfix">
									<form action="http://127.0.0.1:81/questions/list" id="searchForm" method="post">
										<input type="hidden" id="pageCurrentPage" name="page.currentPage" value="1">
										<input type="hidden" name="questions.orderFalg" value="addTime">
										<input type="hidden" name="questions.type" value="1">
										<input type="hidden" name="questions.status" value="1">
										<input type="hidden" name="questions.questionsTagId" value="">
									</form>
									<a title="JAVA" data-id="1" class="list-tag" href="javascript:;" onclick="submitForm('1','questionsTagId')">JAVA</a>
									<a title="Maya" data-id="2" class="list-tag" href="javascript:;" onclick="submitForm('2','questionsTagId')">Maya</a>
									<a title="MongoDB" data-id="3" class="list-tag" href="javascript:;" onclick="submitForm('3','questionsTagId')">MongoDB</a>
									<a title="Premiere" data-id="5" class="list-tag" href="javascript:;" onclick="submitForm('5','questionsTagId')">Premiere</a>
									<a title="Photoshop" data-id="6" class="list-tag" href="javascript:;" onclick="submitForm('6','questionsTagId')">Photoshop</a>
									<a title="Mysql" data-id="7" class="list-tag" href="javascript:;" onclick="submitForm('7','questionsTagId')">Mysql</a>
									<a title="Android" data-id="8" class="list-tag" href="javascript:;" onclick="submitForm('8','questionsTagId')">Android</a>
									<a title="Unity3D" data-id="9" class="list-tag" href="javascript:;" onclick="submitForm('9','questionsTagId')">Unity3D</a>
									<a title="JavaScript" data-id="10" class="list-tag" href="javascript:;" onclick="submitForm('10','questionsTagId')">JavaScript</a>
									<a title="WebApp" data-id="11" class="list-tag" href="javascript:;" onclick="submitForm('11','questionsTagId')">WebApp</a>
									</div>
							</section>
							<!-- /标签云 -->
							<section class="mt30">
								<section class="c-infor-tabTitle c-tab-title">
									<a href="javascript: void(0)" title="热门问答推荐">热门问答推荐</a>
								</section>
								<div class="q-r-rank-list">
									<ul id="hotQuestions"><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">4</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/6" title="" class="fsize14 c-333 ml5">我是如何自学Android，资料分享（2015 版）</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">3</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/7" title="" class="fsize14 c-333 ml5">JavaScript刷新页面方法大全</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">2</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/8" title="" class="fsize14 c-333 ml5">Web App开发教程,有没有分享下</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">1</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/9" title="" class="fsize14 c-333 ml5">Premiere视频教学视频,大神分享下好吗</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">1</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/5" title="" class="fsize14 c-333 ml5">我的MYSQL日志学习心得,给大家分享</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">1</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/2" title="" class="fsize14 c-333 ml5">谁知道支付宝即时到账接口中的有卡就能付没有了怎么回事</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">1</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/4" title="" class="fsize14 c-333 ml5">photoshop怎么抠图 ,能详细点吗</a>	</h4></li><li>	<aside class="q-r-r-num">		<div class="replyNum">			<span class="r-b-num">1</span>			<p class="hLh20">				<span class="c-999 f-fA">回答数</span>			</p>		</div>	</aside>	<h4 class="hLh30 txtOf">		<em class="icon16 q-tw">&nbsp;</em>		<a href="/questions/info/1" title="" class="fsize14 c-333 ml5">视频在播放的时候视频会闪一下，但是视频无法正常播放。</a>	</h4></li></ul>
								</div>
							</section>
							<!-- /热门问答排行 -->
						</div>
					</aside>
					<div class="clear"></div>
				</section>
			</section>
			<!-- /提问题 结束 -->
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