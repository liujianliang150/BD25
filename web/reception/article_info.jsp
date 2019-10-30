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

        <div class="bg-fa of">
			<section class="container">
				<section class="i-article">
					<div class="fl col-7">
						<section class="mr30">
							<section class="path-wrap txtOf hLh30">
								<a href="index.jsp" title="首页" class="c-999 fsize14">首页</a>
								\
								<a href="article.jsp" title="" class="c-999 fsize14">文章列表</a>
								\ <span class="c-333 fsize14">雅思阅读能力提高有方法 文章精读可以这样做</span>
							</section>
							<article class="article-infor-box pr20">
								<h3 class="hLh30 txtOf">
									<span class="i-art-title">雅思阅读能力提高有方法 文章精读可以这样做</span>
								</h3>
								<section class="hLh30 txtOf mt5 pb20 mreadnum">
									<div class="fr">
										<span> <a class="noter-dy vam" title="评论" href="#i-art-comment">
												<em class="icon18">&nbsp;</em>(<span class="totalResultComment">1</span>)
											</a> <tt title="赞一下" onclick="addPraise('23',3)" class="noter-zan vam ml5 f-fM">
												<em class="icon18">&nbsp;</em>(<span class="addPraise23_3 praiseCount">1</span>)
											</tt>
										</span>
									</div>
									<div class="fl pt3"><tt class="c-999 f-fM">
											<!-- 1小时前发布 -->
											2019-02-26 10:31</tt>
									</div>
								</section>
								<div id="art-infor-body">
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										关于<a class="a-tips-Article-QQ" href="http://edu.qq.com/kszx/ielts.shtml" style="outline:none;color:#000000;text-decoration:none;border-bottom-width:1px;border-bottom-style:dotted;border-bottom-color:#536DA6;">雅思</a>(<a target="_blank" href="http://class.qq.com/category/94.html" class="a-tips-Article-QQ" style="outline:none;color:#000000;text-decoration:none;border-bottom-width:1px;border-bottom-style:dotted;border-bottom-color:#536DA6;">课程</a>)精读，首先，认真选择精读文章，只需10篇剑桥文章，你的成绩就可以在7.5以上。但这一前提是你不是流于形式，而是认真走心的读。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										我一直认为雅思精读最大的目的在于四点：
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										1、生词+学科核心生词
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										2、每道题涉及解题的同义替换
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										3、长难句的不回读训练
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										4、段落中心句位置+文章构架的积累训练与开悟体验
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										1、生词+学科核心生词
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										雅思考生公认精读来扫清阅读单词死角是再合适不过的了，尤其精读了几篇生物类文章，再答生物类全都认识了。比如C7蚂蚁智能里面的forage/scout/bearing/odour等词，精读过少量生物类文章，再去做OG上的swarm之类的文章就非常easy了，通篇可以快速读懂，准确定位，正确率超高。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										再如精读过C9的金星凌日，天文类词汇基底你就get到了，什么日食月食轨道运行太阳黑子与光斑，只要考试出了天文类，百分之75以上的基底词汇你都是认识的，答题就自如多了。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										2、每道题涉及解题的同义替换
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										粗定位一个定位词，全文可能会出现30多处，俗话说：两点定一线，你的关键词/定位词，至少要画两个以上还要全都找到。我一般建议学生“抓三点”“抓四点”“抓五点”，题配句，词换词，细定位就是要找至少两三个换的词。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										说到底，同义替换词这个事情，还是要多多积累的，比积累词汇量在雅思阅读中，还要重要。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										所以单词量达到瓶颈以后，要做的是背”同义替换词表“
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										3、长难句的不回读训练
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										忘了是哪个老师说三行以上必出题。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										N个学生的反馈都是：长难句读到后半句，前面就忘了度过了什么。或者单词都认识，就是读文章速度太慢。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										当年考GMAT看过一本《GMAT长难句练习》，里面提到了”打死我也不回读”这个方法，一直分享给学生，效果反馈很棒。里面说：
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										只要每天练习五个长难句不回读训练，看到大长句子，习惯性切割主谓宾，一周就会看到效果。本来想着不就是主谓宾嘛，结果练了十多天，读题速度有了飞跃性的提升。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										长难句再也不是问题，看到就自动读主谓宾，这就可以轻松记住意思，读下面句子的时候，逻辑就形成了非常舒服的衔接。如果有题在句子中，再去精读也不迟。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										4、段落中心句位置+文章构架的积累训练与开悟体验
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										LOH和 段落信息配对，怎么做，主要靠精读的这个步骤。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										LOH做多了，自然有了feel，首句中心句?末句中心句?转折中心句?这就不细说了，做多了就知道。
									</p>
									<p style="margin-top:0px;margin-bottom:29px;padding:0px;line-height:28px;font-family:宋体, Arial, sans-serif;font-size:15.9996px;white-space:normal;text-indent:2em;background-color:#FFFFFF;">
										段落信息配对题，因为无序且恶心，同义替换幅度较大，有时候需要通读全文。我却始终坚信“预测乃解决断子绝孙题的直通车”。只要精读了，你就会发现，原来文章各个部位都有暗示你过，那么下次如果你没读原文直接做MATCHING你要怎么“蒙题”，精读多了你就懂了
									</p>
									
									<div>
										<tt class="c-999 f-fM">
											评论：<span class="totalResultComment">1</span>
										</tt> <tt class="c-999 f-fM ml20">
											点赞：<span class="addPraise23_3 praiseCount">1</span>
										</tt> <tt class="c-999 f-fM ml20">
											阅读：<span class="clickNum">207</span>
										</tt>
									</div>
								</div>
								<section class="mt20 tac" id="sharebutton">
									<div class="bdsharebuttonbox clearfix disIb bdshare-button-style0-32" data-bd-bind="1561104766159">
										<div class="pr disIb fl of">
											<a href="javascript:void(0)" onclick="addActiclePraise('23',3)" title="" class="zan-icon dz-btn pr"></a>
											<div class="dz-num">
												<span class="c-red fsize16">+1</span>
											</div>
										</div>
										<a title="分享到微信" href="#" class="bds_weixin fl" data-cmd="weixin">
											<em class="share-fir-icon icon30"></em>
										</a>
										<a title="分享到新浪微博" href="#" class="bds_tsina fl" data-cmd="tsina"></a>
									</div>
									<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"32"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
								</section>
							</article>
							<!-- 文章评论 开始 -->
							<div class="mt30 pr20 mb50 commentHtml">
								<div>
									<h6 class="c-c-content c-infor-title" id="i-art-comment">
										<span class="commentTitle">文章评论（1条）</span>
									</h6>
									<section class="lh-bj-list pr mt20 replyhtml">
										<ul>
											<li class="unBr">
												<aside class="noter-pic">
													<img width="50" height="50" class="picImg" src="photo/customer/avatar-boy.gif">
												</aside>
												<div class="of">
													<section class="n-reply-wrap">
														<fieldset>
															<textarea name="" placeholder="输入您要评论的文字" id="commentContent"></textarea>
														</fieldset>
														<p class="of mt5 tar pl10 pr10">
															<span class="fl "><tt class="c-red commentContentmeg" style="display: none;"></tt></span>
															<a href="javascript:addComment();" title="回复" class="lh-reply-btn">回复</a>
														</p>
													</section>
												</div>
											</li>
										</ul>
									</section>
									<section class="">
										<section class="question-list lh-bj-list pr">
											<ul class="pr10">
												<li>
													<aside class="noter-pic">
														<img width="50" height="50" class="picImg" src="photo/customer/01.jpg">
													</aside>
													<div class="of">
														<span class="fl"> 
														<font class="fsize12 c-blue"> 
															goddess</font>
														<font class="fsize12 c-999 ml5">评论：</font></span>
													</div>
													<div class="noter-txt mt5">
														<p>雅思阅读</p>
													</div>
													<div class="of mt5">
														<span class="fr"><font class="fsize12 c-999 ml5">2018/11/04 10:33</font></span> <span class="fl"> <a class="noter-dy vam" title="回复" href="javascript: void(0)" onclick="queryCommentReply('3')">
																<em class="icon18">&nbsp;</em>(<span class="replyCount3">0</span>)
															</a> <tt title="赞一下" class="noter-zan vam ml10" onclick="addPraise('3',4)">
																<em class="icon18">&nbsp;</em>(<span class="addPraise3_4 praiseCount">1</span>)
															</tt>
														</span>
													</div>
													<div class="n-reply">
														<section class="n-reply-wrap">
															<fieldset>
																<textarea name="" class="commentReplyMsgContent3"></textarea>
															</fieldset>
															<p class="of mt5 tar pl10 pr10">
																<span class="fl"><tt class="c-red commentReplyMsg3"></tt></span>
																<a onclick="addCommentReply('3')" class="lh-reply-btn" title="回复" href="javascript: void(0)">回复</a>
															</p>
														</section>
														<div class="mt10 pl10 pr10 pb10 commentReply3"></div>
													</div> <!-- /回复盒子 -->
												</li>
											</ul>
										</section>
									</section>
						
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
					
								</div>
							</div>
						</section>
					</div>
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
												<span> 
													<a class="noter-dy vam" title="回答" href="article_info.jsp">
														<em class="icon18">&nbsp;</em>(1)
													</a> 
													<tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('23',3)">
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
												<span> <a class="noter-dy vam" title="回答" href="article_info.jsp">
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
												<span> <a class="noter-dy vam" title="回答" href="article_info.jsp">
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
												<span> <a class="noter-dy vam" title="回答" href="article_info.jsp">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('7',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise7_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">
													<!-- 1小时前发布 -->
													2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>5</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="背水一战的任天堂" class="i-art-title">背水一战的任天堂</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="article_info.jsp">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('14',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise14_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">
													<!-- 1小时前发布 -->
													2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>6</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="嘲讽陈年是很容易的事，但我更愿意祝他成功" class="i-art-title">嘲讽陈年是很容易的事，但我更愿意祝他成功</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="article_info.jsp">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('9',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise9_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">
													<!-- 1小时前发布 -->
													2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>7</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="渠道之殇：三星手机中国没落背后" class="i-art-title">渠道之殇：三星手机中国没落背后</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> <a class="noter-dy vam" title="回答" href="article_info.jsp">
														<em class="icon18">&nbsp;</em>(0)
													</a> <tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('15',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise15_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">
													<!-- 1小时前发布 -->
													2018-09-09 10:08</tt></span>
										</section>
									</li>
									<li>
										<aside class="orderNum"><span>8</span></aside>
										<h3 class="hLh30 txtOf">
											<a href="article_info.jsp" title="陈年重回T恤大战：凡客归来" class="i-art-title">陈年重回T恤大战：凡客归来</a>
										</h3>
										<section class="hLh30 txtOf mt5">
											<div class="fr">
												<span> 
													<a class="noter-dy vam" title="回答" href="article_info.jsp">
														<em class="icon18">&nbsp;</em>(0)
													</a> 
													<tt title="赞一下" class="noter-zan vam ml10 f-fM" onclick="addPraise('11',3)">
														<em class="icon18">&nbsp;</em>(<span class="addPraise11_3 praiseCount">0</span>)
													</tt>
												</span>
											</div>
											<span class="fl"><tt class="c-999 f-fM">
													<!-- 1小时前发布 -->
													2018-09-09 10:08</tt></span>
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