<%@ page language="java" contentType="text/html; charset=GB18030"
pageEncoding="GB18030"%>
<html class="x-admin-sm">
<%
    String contextPath = request.getContextPath();
    request.setAttribute("contextPath",contextPath);
%>

    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
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
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <form class="layui-form layui-col-md12  layui-form-pane">
                             <div class="layui-form-item x-city" id="start">
                              <label class="layui-form-label">城市联动</label>
                              <div class="layui-input-inline">
                                <select name="province" lay-filter="province">
                                  <option value="" >请选择省</option>
                                </select>
                              </div>
                              <div class="layui-input-inline">
                                <select name="city" lay-filter="city">
                                  <option value="">请选择市</option>
                                </select>
                              </div>
<%--                              <div class="layui-input-inline">--%>
<%--                                <select name="area" lay-filter="area">--%>
<%--                                  <option value="">请选择县/区</option>--%>
<%--                                </select>--%>
<%--                              </div>--%>
                            </div>
<%--                            <div class="layui-form-item x-city" id="end">--%>
<%--                              <label class="layui-form-label">城市联动</label>--%>
<%--                              <div class="layui-input-inline">--%>
<%--                                <select name="province" lay-filter="province">--%>
<%--                                  <option value="">请选择省</option>--%>
<%--                                </select>--%>
<%--                              </div>--%>
<%--                              <div class="layui-input-inline">--%>
<%--                                <select name="city" lay-filter="city">--%>
<%--                                  <option value="">请选择市</option>--%>
<%--                                </select>--%>
<%--                              </div>--%>
<%--                              <div class="layui-input-inline">--%>
<%--                                <select name="area" lay-filter="area">--%>
<%--                                  <option value="">请选择县/区</option>--%>
<%--                                </select>--%>
<%--                              </div>--%>
                            </div>
                          </form>
                        </div>
                        <hr>
                        <div class="layui-card-body ">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="../js/xcity.js"></script>
        <script>
          layui.use(['form','code'], function(){
            form = layui.form;

            layui.code();
              
            $('#start').xcity('广东','广州市','东山区');

          });
        </script>
        <script>var _hmt = _hmt || []; (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
          })();</script>
    </body>
</html>