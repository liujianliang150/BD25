<%@ page language="java" contentType="text/html; charset=GB18030"
pageEncoding="GB18030"%>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>��ӭҳ��-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="../css/font.css">
        <link rel="stylesheet" href="../css/xadmin.css">
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
                            <a onclick="parent.xadmin.add_tab('��tab��','https://www.baidu.com',true)" style="color: red" href="javascript:;">iframeҳ���д�tab����</a>
                            <br>
                            <a onclick="parent.xadmin.add_tab('��tab��','https://www.baidu.com')" style="color: red" href="javascript:;">iframeҳ���д�tab����(�ظ������ˢ��)</a>
                            <br>
                            <a onclick="xadmin.open('iframeҳ���д�open����','https://www.163.com')" style="color: red" href="javascript:;">iframeҳ���д�open����</a>
                            <br>
                            <a onclick="parent.xadmin.open('����һ�����ڴ�open�¼�','http://www.baidu.com')" style="color: red" href="javascript:;">����һ�����ڴ�open�¼�</a>
                            <br>
                            <a onclick="xadmin.del_tab()" style="color: red" href="javascript:;">����ҳ��ر��Լ�����tab</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </body>
</html>