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
                                            <li class="current" >
                                                <a href="uc_base.jsp" title="">
                                                    基本资料
                                                </a>
                                            </li>
                                            <li>
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
                                        <a href="javascript: void(0)" title="基本资料" class="clickAvailable current">
                                            基本资料
                                        </a>
                                        <a href="javascript: void(0)" title="个人头像" class="clickAvailable">
                                            个人头像
                                        </a>
                                        <a href="javascript: void(0)" title="密码设置" class="clickAvailable">
                                            密码设置
                                        </a>
                                    </section>
                                </div>
                                <div class="mt40" id="p_tCont">
                                    <div class="u-account-box" style="display: block;">
                                        <form method="post" id="updateForm">
                                            <input type="hidden" name="user.userId" value="2">
                                            <ol class="u-account-li">
                                                <li>
                                                    <label class="u-a-title">
                                                        <span class="fsize16 c-999">邮 箱</span>
                                                    </label>
                                                    <input type="text" class="u-a-inpt" name="user.name" value="helen@162.com"
                                                        placeholder="" readonly="readonly" disabled="disabled">
                                                </li>
                                                <li>
                                                    <label class="u-a-title">
                                                        <span class="fsize16 c-999">手机号</span>
                                                    </label>
                                                    <input type="text" class="u-a-inpt" name="user.mobile" value="12345678901"
                                                        placeholder="" readonly="readonly" disabled="disabled">
                                                </li>
                                                <li>
                                                    <label class="u-a-title">
                                                        <span class="fsize16 c-999">姓 名</span>
                                                    </label>
                                                    <input type="text" class="u-a-inpt" name="user.userName" value=""
                                                        placeholder="">
                                                </li>
                                                <li>
                                                    <label class="u-a-title">
                                                        <span class="fsize16 c-999">昵 称</span>
                                                    </label>
                                                    <input type="text" class="u-a-inpt" name="user.showName" value=""
                                                        placeholder="">
                                                </li>
                                                <li>
                                                    <label class="u-a-title">
                                                        <span class="fsize16 c-999">性 别</span>
                                                    </label>
                                                    <input type="radio" name="user.sex" value="1">
                                                    <span class="vam fsize14 c-666">男</span>
                                                    <input type="radio" name="user.sex" value="2">
                                                    <span class="vam fsize14 c-666">女</span>
                                                </li>
                                                <li>
                                                    <label class="u-a-title">
                                                        <span class="fsize16 c-999">年 龄</span>
                                                    </label>
                                                    <select name="user.age">
                                                        <option value="0">0岁</option>
                                                        <option value="1">1岁</option>
                                                        <option value="2">2岁</option>
                                                        <option value="3">3岁</option>
                                                        <option value="4">4岁</option>
                                                        <option value="5">5岁</option>
                                                        <option value="6">6岁</option>
                                                        <option value="7">7岁</option>
                                                        <option value="8">8岁</option>
                                                        <option value="9">9岁</option>
                                                        <option value="10">10岁</option>
                                                        <option value="11">11岁</option>
                                                        <option value="12">12岁</option>
                                                        <option value="13">13岁</option>
                                                        <option value="14">14岁</option>
                                                        <option value="15">15岁</option>
                                                        <option value="16">16岁</option>
                                                        <option value="17">17岁</option>
                                                        <option value="18">18岁</option>
                                                        <option value="19">19岁</option>
                                                        <option value="20">20岁</option>
                                                        <option value="21">21岁</option>
                                                        <option value="22">22岁</option>
                                                        <option value="23">23岁</option>
                                                        <option value="24">24岁</option>
                                                        <option value="25">25岁</option>
                                                        <option value="26">26岁</option>
                                                        <option value="27">27岁</option>
                                                        <option value="28">28岁</option>
                                                        <option value="29">29岁</option>
                                                        <option value="30">30岁</option>
                                                        <option value="31">31岁</option>
                                                        <option value="32">32岁</option>
                                                        <option value="33">33岁</option>
                                                        <option value="34">34岁</option>
                                                        <option value="35">35岁</option>
                                                        <option value="36">36岁</option>
                                                        <option value="37">37岁</option>
                                                        <option value="38">38岁</option>
                                                        <option value="39">39岁</option>
                                                        <option value="40">40岁</option>
                                                        <option value="41">41岁</option>
                                                        <option value="42">42岁</option>
                                                        <option value="43">43岁</option>
                                                        <option value="44">44岁</option>
                                                        <option value="45">45岁</option>
                                                        <option value="46">46岁</option>
                                                        <option value="47">47岁</option>
                                                        <option value="48">48岁</option>
                                                        <option value="49">49岁</option>
                                                        <option value="50">50岁</option>
                                                        <option value="51">51岁</option>
                                                        <option value="52">52岁</option>
                                                        <option value="53">53岁</option>
                                                        <option value="54">54岁</option>
                                                        <option value="55">55岁</option>
                                                        <option value="56">56岁</option>
                                                        <option value="57">57岁</option>
                                                        <option value="58">58岁</option>
                                                        <option value="59">59岁</option>
                                                        <option value="60">60岁</option>
                                                        <option value="61">61岁</option>
                                                        <option value="62">62岁</option>
                                                        <option value="63">63岁</option>
                                                        <option value="64">64岁</option>
                                                        <option value="65">65岁</option>
                                                        <option value="66">66岁</option>
                                                        <option value="67">67岁</option>
                                                        <option value="68">68岁</option>
                                                        <option value="69">69岁</option>
                                                        <option value="70">70岁</option>
                                                        <option value="71">71岁</option>
                                                        <option value="72">72岁</option>
                                                        <option value="73">73岁</option>
                                                        <option value="74">74岁</option>
                                                        <option value="75">75岁</option>
                                                        <option value="76">76岁</option>
                                                        <option value="77">77岁</option>
                                                        <option value="78">78岁</option>
                                                        <option value="79">79岁</option>
                                                        <option value="80">80岁</option>
                                                        <option value="81">81岁</option>
                                                        <option value="82">82岁</option>
                                                        <option value="83">83岁</option>
                                                        <option value="84">84岁</option>
                                                        <option value="85">85岁</option>
                                                        <option value="86">86岁</option>
                                                        <option value="87">87岁</option>
                                                        <option value="88">88岁</option>
                                                        <option value="89">89岁</option>
                                                        <option value="90">90岁</option>
                                                        <option value="91">91岁</option>
                                                        <option value="92">92岁</option>
                                                        <option value="93">93岁</option>
                                                        <option value="94">94岁</option>
                                                        <option value="95">95岁</option>
                                                        <option value="96">96岁</option>
                                                        <option value="97">97岁</option>
                                                        <option value="98">98岁</option>
                                                        <option value="99">99岁</option>
                                                        <option value="100">100岁</option>
                                                        <option value="101">101岁</option>
                                                        <option value="102">102岁</option>
                                                        <option value="103">103岁</option>
                                                        <option value="104">104岁</option>
                                                        <option value="105">105岁</option>
                                                        <option value="106">106岁</option>
                                                        <option value="107">107岁</option>
                                                        <option value="108">108岁</option>
                                                        <option value="109">109岁</option>
                                                        <option value="110">110岁</option>
                                                    </select> </li>
                                            </ol>
                                        </form>
                                        <div class="ml50 mt50 pl50">
                                            <a href="javascript:void(0)" title="" class="comm-btn c-btn-7" onclick="updateUserInfo()">
                                                提交
                                            </a> 
                                        </div>
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