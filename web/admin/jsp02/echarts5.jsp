<%@ page language="java" contentType="text/html; charset=GB18030"
pageEncoding="GB18030"%>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>��̨��¼-X-admin2.2</title>
        <meta name="renderer" content="webkit|ie-comp|ie-stand">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <meta http-equiv="Cache-Control" content="no-siteapp" />

        <link rel="stylesheet" href="../css/font.css">
        <link rel="stylesheet" href="../css/xadmin.css">
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <blockquote class="layui-elem-quote">
                                �ر�������ECharts��һ���� Javascript ��ͼ���⣬���������������� PC ���ƶ��豸�ϣ����ݵ�ǰ���󲿷��������IE8/9/10/11��Chrome��Firefox��Safari�ȣ����ײ������������� Canvas ��� ZRender���ṩֱ�ۣ��������ɽ������ɸ߶ȸ��Ի����Ƶ����ݿ��ӻ�ͼ��������ʹ�ã���ϸ�˽���Է��ʹ��� <a href="http://echarts.baidu.com/" style="color:red">ECharts</a>�� x-admin���е��κΰ�Ȩ���⡣
                            </blockquote>
                            <!-- Ϊ ECharts ׼��һ���߱���С�����ߣ��� DOM -->
                            <div id="main" style="width: 100%;height:400px;"></div>
                            <blockquote class="layui-elem-quote">
                                ע�⣺��������Echartsͼ������cdn���룬��Ҫ���߲�������ʹ�ã��������ߣ�����Echarts�������ء�
                            </blockquote>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.bootcss.com/echarts/4.2.1-rc1/echarts.min.js"></script>
        <script type="text/javascript">
        // ����׼���õ�dom����ʼ��echartsʵ��
        var myChart = echarts.init(document.getElementById('main'));

        // ָ��ͼ���������������
        var option = {
            title: {
                text: '�����״�ͼ'
            },
            tooltip: {},
            legend: {
                data: ['Ԥ����䣨Allocated Budget��', 'ʵ�ʿ�����Actual Spending��']
            },
            radar: {
                // shape: 'circle',
                indicator: [
                   { name: '���ۣ�sales��', max: 6500},
                   { name: '������Administration��', max: 16000},
                   { name: '��Ϣ������Information Techology��', max: 30000},
                   { name: '�ͷ���Customer Support��', max: 38000},
                   { name: '�з���Development��', max: 52000},
                   { name: '�г���Marketing��', max: 25000}
                ]
            },
            series: [{
                name: 'Ԥ�� vs ������Budget vs spending��',
                type: 'radar',
                // areaStyle: {normal: {}},
                data : [
                    {
                        value : [4300, 10000, 28000, 35000, 50000, 19000],
                        name : 'Ԥ����䣨Allocated Budget��'
                    },
                     {
                        value : [5000, 14000, 28000, 31000, 42000, 21000],
                        name : 'ʵ�ʿ�����Actual Spending��'
                    }
                ]
            }]
        };

        // ʹ�ø�ָ�����������������ʾͼ����
        myChart.setOption(option);
    </script>
    <script>
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
        })();
        </script>
    </body>
</html>