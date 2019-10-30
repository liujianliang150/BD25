<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
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
    <link rel="stylesheet" href="css/sign.css">
    <link rel="stylesheet" href="css/iconfont.css">
</head>
<body>
<div class="sign">
    <!--标题-->
    <div class="logo">
        <img src="img/logo.png" alt="logo">
    </div>
    <!--表单-->
    <div class="main">
        <div class="title">
            <a href="sing_in.html">登录</a>
            <span>·</span>
            <a class="active" href="sing_up.html">注册</a>
        </div>
        <div class="sign-up-container">
            <form action="register">
                <div class="input-prepend restyle">
                    <input type="text" placeholder="你的昵称">
					<i class="iconfont icon-user"></i>
                </div>
                <div class="input-prepend restyle no-radius">
                    <input type="text" placeholder="手机号">
					<i class="iconfont icon-phone"></i>
                </div>
                <div class="input-prepend">
                    <input type="password" placeholder="设置密码">
					<i class="iconfont icon-password"></i>
                </div>
                <div class="btn">
                    <input type="submit" class="sign-up-button" value="注册">
                </div>
                <p class="sign-up-msg">
                    点击 “注册” 即表示您同意并愿意遵守简书
                    <br>
                    <a target="_blank" href="http://www.jianshu.com/p/c44d171298ce">用户协议</a>
                    和
                    <a target="_blank" href="http://www.jianshu.com/p/2ov8x3">隐私政策</a> 。
                </p>
            </form>
			<!-- 更多注册方式 -->
			<div class="more-sign">
				<h6>社交帐号直接注册</h6>
				<ul>
				  <li><a id="weixin" class="weixin" target="_blank" href="#"><i class="iconfont icon-weixin"></i></a></li>
				  <li><a id="qq" class="qq" target="_blank" href="#"><i class="iconfont icon-qq"></i></a></li>
				</ul>
			</div>
        </div>
    </div>
</div>
</body>
</html>