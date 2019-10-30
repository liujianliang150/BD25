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
        option = {
            tooltip : {
                formatter: "{a} <br/>{c} {b}"
            },
            toolbox: {
                show: true,
                feature: {
                    restore: {show: true},
                    saveAsImage: {show: true}
                }
            },
            series : [
                {
                    name: '�ٶ�',
                    type: 'gauge',
                    z: 3,
                    min: 0,
                    max: 220,
                    splitNumber: 11,
                    radius: '50%',
                    axisLine: {            // ��������
                        lineStyle: {       // ����lineStyle����������ʽ
                            width: 10
                        }
                    },
                    axisTick: {            // ������С���
                        length: 15,        // ����length�����߳�
                        lineStyle: {       // ����lineStyle����������ʽ
                            color: 'auto'
                        }
                    },
                    splitLine: {           // �ָ���
                        length: 20,         // ����length�����߳�
                        lineStyle: {       // ����lineStyle�����lineStyle������������ʽ
                            color: 'auto'
                        }
                    },
                    title : {
                        textStyle: {       // ��������Ĭ��ʹ��ȫ���ı���ʽ�����TEXTSTYLE
                            fontWeight: 'bolder',
                            fontSize: 20,
                            fontStyle: 'italic'
                        }
                    },
                    detail : {
                        textStyle: {       // ��������Ĭ��ʹ��ȫ���ı���ʽ�����TEXTSTYLE
                            fontWeight: 'bolder'
                        }
                    },
                    data:[{value: 40, name: 'km/h'}]
                },
                {
                    name: 'ת��',
                    type: 'gauge',
                    center: ['20%', '55%'],    // Ĭ��ȫ�־���
                    radius: '35%',
                    min:0,
                    max:7,
                    endAngle:45,
                    splitNumber:7,
                    axisLine: {            // ��������
                        lineStyle: {       // ����lineStyle����������ʽ
                            width: 8
                        }
                    },
                    axisTick: {            // ������С���
                        length:12,        // ����length�����߳�
                        lineStyle: {       // ����lineStyle����������ʽ
                            color: 'auto'
                        }
                    },
                    splitLine: {           // �ָ���
                        length:20,         // ����length�����߳�
                        lineStyle: {       // ����lineStyle�����lineStyle������������ʽ
                            color: 'auto'
                        }
                    },
                    pointer: {
                        width:5
                    },
                    title: {
                        offsetCenter: [0, '-30%'],       // x, y����λpx
                    },
                    detail: {
                        textStyle: {       // ��������Ĭ��ʹ��ȫ���ı���ʽ�����TEXTSTYLE
                            fontWeight: 'bolder'
                        }
                    },
                    data:[{value: 1.5, name: 'x1000 r/min'}]
                },
                {
                    name: '�ͱ�',
                    type: 'gauge',
                    center: ['77%', '50%'],    // Ĭ��ȫ�־���
                    radius: '25%',
                    min: 0,
                    max: 2,
                    startAngle: 135,
                    endAngle: 45,
                    splitNumber: 2,
                    axisLine: {            // ��������
                        lineStyle: {       // ����lineStyle����������ʽ
                            width: 8
                        }
                    },
                    axisTick: {            // ������С���
                        splitNumber: 5,
                        length: 10,        // ����length�����߳�
                        lineStyle: {       // ����lineStyle����������ʽ
                            color: 'auto'
                        }
                    },
                    axisLabel: {
                        formatter:function(v){
                            switch (v + '') {
                                case '0' : return 'E';
                                case '1' : return 'Gas';
                                case '2' : return 'F';
                            }
                        }
                    },
                    splitLine: {           // �ָ���
                        length: 15,         // ����length�����߳�
                        lineStyle: {       // ����lineStyle�����lineStyle������������ʽ
                            color: 'auto'
                        }
                    },
                    pointer: {
                        width:2
                    },
                    title : {
                        show: false
                    },
                    detail : {
                        show: false
                    },
                    data:[{value: 0.5, name: 'gas'}]
                },
                {
                    name: 'ˮ��',
                    type: 'gauge',
                    center : ['77%', '50%'],    // Ĭ��ȫ�־���
                    radius : '25%',
                    min: 0,
                    max: 2,
                    startAngle: 315,
                    endAngle: 225,
                    splitNumber: 2,
                    axisLine: {            // ��������
                        lineStyle: {       // ����lineStyle����������ʽ
                            width: 8
                        }
                    },
                    axisTick: {            // ������С���
                        show: false
                    },
                    axisLabel: {
                        formatter:function(v){
                            switch (v + '') {
                                case '0' : return 'H';
                                case '1' : return 'Water';
                                case '2' : return 'C';
                            }
                        }
                    },
                    splitLine: {           // �ָ���
                        length: 15,         // ����length�����߳�
                        lineStyle: {       // ����lineStyle�����lineStyle������������ʽ
                            color: 'auto'
                        }
                    },
                    pointer: {
                        width:2
                    },
                    title: {
                        show: false
                    },
                    detail: {
                        show: false
                    },
                    data:[{value: 0.5, name: 'gas'}]
                }
            ]
        };

        setInterval(function (){
            option.series[0].data[0].value = (Math.random()*100).toFixed(2) - 0;
            option.series[1].data[0].value = (Math.random()*7).toFixed(2) - 0;
            option.series[2].data[0].value = (Math.random()*2).toFixed(2) - 0;
            option.series[3].data[0].value = (Math.random()*2).toFixed(2) - 0;
            myChart.setOption(option,true);
        },2000);


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