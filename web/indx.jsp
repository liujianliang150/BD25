<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/29
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>跳转</title>
    <script src="js/jquery.min.js"></script>
    <%
      String path = request.getContextPath();
      session.setAttribute("path",path);
    %>
    <script>

      function myBrowser(){
        var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
        var isOpera = userAgent.indexOf("Opera") > -1;
        if (isOpera) {
          return "Opera"
        }; //判断是否Opera浏览器
        if (userAgent.indexOf("Firefox") > -1) {
          return "FF";
        } //判断是否Firefox浏览器
        if (userAgent.indexOf("Chrome") > -1){
          return "Chrome";
        }
        if (userAgent.indexOf("Safari") > -1) {
          return "Safari";
        } //判断是否Safari浏览器
        if (userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera) {
          return "IE";
        }; //判断是否IE浏览器
        alert()
      }
      var mb=myBrowser();
      alert(mb);

    </script>
  </head>
  <body>
  <form action="${sessionScope.path}/LoginServlet" method="get">
    <input type="text" name = "u" />
    <input type="submit">
  </form>
  </body>
</html>
