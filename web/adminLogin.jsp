<%--
  Created by IntelliJ IDEA.
  Description:   与AdminLoginFilter/AdminLoginDetectionServlet/AdminLoginServlet配合
                 用于管理员登录
  Author: 周小龙
  Date: 2019/10/28
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    session.setAttribute("path", path);
%>

<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>后台登录</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
<%--    下面link里面的href不能以“/”开头，这样会导致样式无法引入--%>
    <link rel="stylesheet" href="admin/css/font.css">
    <link rel="stylesheet" href="admin/css/login.css">
    <link rel="stylesheet" href="admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="admin/lib/layui/layui.js" charset="utf-8"></script>
    <%--    <script src="js/jquery-1.12.4.js"></script>--%>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">


    <div class="message">后台管理登录</div>
    <div id="darkbannerwrap"></div>

    <div method="post" class="layui-form">

        <form action="${sessionScope.path}/AdminLoginServlet" method="post">
            <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input" id="username"
                   onblur="uname()">
<%--  以下p标签用于显示ajax探测到的错误信息，如果检测到数据库里面没有这个用户名，就会显示在这里--%>
            <p id="namewarn" style="color: red"></p>
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input" id="pwd"
                   onblur="pwd()">
            <p id="password" style="color: red"></p>
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <%--  以下p标签用于显示ajax探测到的错误信息，如果检测到数据库里面的用户名和密码不匹配就会显示在这里--%>
            <p id="submi" style="color: red">${sessionScope.fool}</p>
        </form>
        <hr class="hr20">
    </div>
</div>

<script>
    //判断用户是否存在
    function uname() {
        //获取用户输入的值
        var uname = document.getElementById("username").value;
        if (uname.length != 0) {
            //如果用户输入不为空，则采用ajax到后台验证，看数据库里面有没有这个用户，没有就提示出来，有就不提示
            $.post("${sessionScope.path}/AdminLoginDetectionServlet", "username=" + uname, function (data) {
                if (data == "true") {
                } else {
                    document.getElementById("namewarn").innerHTML = '查无此用户，请重新输入';
                }
            });
        } else {
            //如果用户输入为空，则提醒用户
            document.getElementById("namewarn").innerHTML = '用户名不得为空';
        }
    }

    // //判断密码是否符合最基本要求
    // function pwd() {
    //     var pwd = document.getElementById("pwd").value;
    //     if (pwd.length != 0) {
    //         if (pwd.length < 6) {
    //             document.getElementById("password").innerText = "密码长度不正确，请重新输入";
    //         } else {
    //
    //         }
    //     } else {
    //         document.getElementById("password").innerText = "密码不得为空";
    //     }
    // }
</script>
<!-- 底部结束 -->

</body>
</html>