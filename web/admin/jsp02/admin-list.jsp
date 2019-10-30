<%@ page language="java" contentType="text/html; charset=GB18030"
pageEncoding="GB18030"%>
<%
    String contextPath = request.getContextPath();
    request.setAttribute("contextPath",contextPath);
%>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>��ӭҳ��-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<%--        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />--%>
        <link rel="stylesheet" href="../css/font.css">
        <link rel="stylesheet" href="../css/xadmin.css">
        <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <script src="../lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="../js/xadmin.js"></script>
        <!--[if lt IE 9]>
          <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
          <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    <script>
        $(function () {
            var url = "${contextPath}/EduCourseServlet";
            function initNews() {
                $.getJSON(url,{"pageNo":$("#pageNo").val()},ifsuccess);
            };
            initNews();
        });
        function ifsuccess(data) {
            console.log(data);
            $courseList = $("#courseList");
            for (var i = 0; i < data.length;i++) {
                $courseList.append("<tr>\n" +
                "<td>" + data[i].courseid + "</td>\n" +
                "<td>" + data[i].coursename + "</td>\n" +
                "<td>" + data[i].sourceprice + "</td>\n" +
                "<td><input value='"+data[i].currentprice+"' lay-skin = \"switch\"/></td>\n" +
                "<td><button onclick='save()' value='"+data[i].courseid+"'>����</button></td>\n" +
                "</tr>");
            }
        };
    </script>>
        <div class="layui-fluid">
            <input id="pageNo" value="1" type="hidden">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <form class="layui-form layui-col-space5 layui-form-pane">
                                <div class="layui-form-item x-city" id="start">
                                <label class="layui-form-label">��ѡ��</label>
                                    <div class="layui-input-inline">
                                        <select name="province" lay-filter="province">
                                            <option value="">��ѡ�����</option>
                                            
                                        </select>
                                    </div>
                                    <div class="layui-input-inline">
                                        <select name="city" lay-filter="city">
                                            <option value="">��ѡ��γ�</option>
                                        </select>
                                    </div>
                                    <div class="layui-inline layui-show-xs-block" style="display: inline">
                                        <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                                    </div>
                                </div>
                                
                            </form>
                        </div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form" id="courseList">
                              <thead>
                                <tr>
                                  <th>�γ̱��</th>
                                  <th>�γ�����</th>
                                  <th>�γ�ԭ�۸�ֻ��ʾ��</th>
                                  <th>�γ����ۼ۸�</th>
                                  <th>����</th>
                                </tr>
                              </thead>
                              <tbody>
                              </tbody>
                            </table>
                        </div>
                        <div class="layui-card-body ">
                            <div class="page">
                                <div>
                                    <div></div>
                                  <a class="prev" href="">&lt;&lt;</a>
                                  <a class="num" href="">1</a>
                                  <a class="current">2</a>
                                  <a class="num" href="">3</a>
                                  <a class="num" href="">489</a>
                                  <a class="next" href="">&gt;&gt;</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
    </body>
    <script type="text/javascript" src="../js/xcity.js"></script>
    <script>
        layui.use(['form','code'], function(){
            form = layui.form;
            layui.code();
            $('#start').xcity('�㶫','������');
        });
    </script>
    <script>
        var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();
    </script>
</html>