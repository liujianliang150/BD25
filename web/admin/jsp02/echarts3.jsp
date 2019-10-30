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
                                �ر�������ECharts��һ���� Javascript ��ͼ���⣬���������������� PC ���ƶ��豸�ϣ����ݵ�ǰ���󲿷��������IE8/9/10/11��Chrome��Firefox��Safari�ȣ����ײ������������� Canvas ��� ZRender���ṩֱ�ۣ��������ɽ������ɸ߶ȸ��Ի����Ƶ����ݿ��ӻ�ͼ��������ʹ�û�����ϸ���స�����Է��ʹ��� <a href="http://echarts.baidu.com/" style="color:red">ECharts</a>�� x-admin���е��κΰ�Ȩ���⡣
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
        <script src="https://cdn.bootcss.com/echarts/4.2.1-rc1/extension/bmap.min.js"></script>
        <script src="http://echarts.baidu.com/asset/map/js/china.js"></script>
        <script type="text/javascript">
        // ����׼���õ�dom����ʼ��echartsʵ��
        var myChart = echarts.init(document.getElementById('main'));
        myChart.setOption({
            series: [{
                type: 'map',
                map: 'china'
            }]
        });

        // ָ��ͼ���������������
        var geoCoordMap = {
            '�Ϻ�': [121.4648,31.2891],
            '��ݸ': [113.8953,22.901],
            '��Ӫ': [118.7073,37.5513],
            '��ɽ': [113.4229,22.478],
            '�ٷ�': [111.4783,36.1615],
            '����': [118.3118,35.2936],
            '����': [124.541,40.4242],
            '��ˮ': [119.5642,28.1854],
            '��³ľ��': [87.9236,43.5883],
            '��ɽ': [112.8955,23.1097],
            '����': [115.0488,39.0948],
            '����': [103.5901,36.3043],
            '��ͷ': [110.3467,41.4899],
            '����': [116.4551,40.2539],
            '����': [109.314,21.6211],
            '�Ͼ�': [118.8062,31.9208],
            '����': [108.479,23.1152],
            '�ϲ�': [116.0046,28.6633],
            '��ͨ': [121.1023,32.1625],
            '����': [118.1689,24.6478],
            '̨��': [121.1353,28.6688],
            '�Ϸ�': [117.29,32.0581],
            '���ͺ���': [111.4124,40.4901],
            '����': [108.4131,34.8706],
            '������': [127.9688,45.368],
            '��ɽ': [118.4766,39.6826],
            '����': [120.9155,30.6354],
            '��ͬ': [113.7854,39.8035],
            '����': [122.2229,39.4409],
            '���': [117.4219,39.4189],
            '̫ԭ': [112.3352,37.9413],
            '����': [121.9482,37.1393],
            '����': [121.5967,29.6466],
            '����': [107.1826,34.3433],
            '��Ǩ': [118.5535,33.7775],
            '����': [119.4543,31.5582],
            '����': [113.5107,23.2196],
            '�ȷ�': [116.521,39.0509],
            '�Ӱ�': [109.1052,36.4252],
            '�żҿ�': [115.1477,40.8527],
            '����': [117.5208,34.3268],
            '����': [116.6858,37.2107],
            '����': [114.6204,23.1647],
            '�ɶ�': [103.9526,30.7617],
            '����': [119.4653,32.8162],
            '�е�': [117.5757,41.4075],
            '����': [91.1865,30.1465],
            '����': [120.3442,31.5527],
            '����': [119.2786,35.5023],
            '����': [102.9199,25.4663],
            '����': [119.5313,29.8773],
            '��ׯ': [117.323,34.8926],
            '����': [109.3799,24.9774],
            '����': [113.5327,27.0319],
            '�人': [114.3896,30.6628],
            '��ͷ': [117.1692,23.3405],
            '����': [112.6318,22.1484],
            '����': [123.1238,42.1216],
            '����': [116.8286,38.2104],
            '��Դ': [114.917,23.9722],
            'Ȫ��': [118.3228,25.1147],
            '̩��': [117.0264,36.0516],
            '̩��': [120.0586,32.5525],
            '����': [117.1582,36.8701],
            '����': [116.8286,35.3375],
            '����': [110.3893,19.8516],
            '�Ͳ�': [118.0371,36.6064],
            '����': [118.927,33.4039],
            '����': [114.5435,22.5439],
            '��Զ': [112.9175,24.3292],
            '����': [120.498,27.8119],
            'μ��': [109.7864,35.0299],
            '����': [119.8608,30.7782],
            '��̶': [112.5439,27.7075],
            '����': [117.8174,37.4963],
            'Ϋ��': [119.0918,36.524],
            '��̨': [120.7397,37.5128],
            '��Ϫ': [101.9312,23.8898],
            '�麣': [113.7305,22.1155],
            '�γ�': [120.2234,33.5577],
            '�̽�': [121.9482,41.0449],
            'ʯ��ׯ': [114.4995,38.1006],
            '����': [119.4543,25.9222],
            '�ػʵ�': [119.2126,40.0232],
            '����': [120.564,29.7565],
            '�ĳ�': [115.9167,36.4032],
            '����': [112.1265,23.5822],
            '��ɽ': [122.2559,30.2234],
            '����': [120.6519,31.3989],
            '����': [117.6526,36.2714],
            '����': [115.6201,35.2057],
            'Ӫ��': [122.4316,40.4297],
            '��«��': [120.1575,40.578],
            '��ˮ': [115.8838,37.7161],
            '����': [118.6853,28.8666],
            '����': [101.4038,36.8207],
            '����': [109.1162,34.2004],
            '����': [106.6992,26.7682],
            '���Ƹ�': [119.1248,34.552],
            '��̨': [114.8071,37.2821],
            '����': [114.4775,36.535],
            '֣��': [113.4668,34.6234],
            '������˹': [108.9734,39.2487],
            '����': [107.7539,30.1904],
            '��': [120.0037,29.1028],
            'ͭ��': [109.0393,35.1947],
            '����': [106.3586,38.1775],
            '��': [119.4763,31.9702],
            '����': [125.8154,44.2584],
            '��ɳ': [113.0823,28.2568],
            '����': [112.8625,36.4746],
            '��Ȫ': [113.4778,38.0951],
            '�ൺ': [120.4651,36.3373],
            '�ع�': [113.7964,24.7028]
        };

        var BJData = [
            [{name:'����'}, {name:'�Ϻ�',value:95}],
            [{name:'����'}, {name:'����',value:90}],
            [{name:'����'}, {name:'����',value:80}],
            [{name:'����'}, {name:'����',value:70}],
            [{name:'����'}, {name:'�ϲ�',value:60}],
            [{name:'����'}, {name:'����',value:50}],
            [{name:'����'}, {name:'����',value:40}],
            [{name:'����'}, {name:'��ͷ',value:30}],
            [{name:'����'}, {name:'����',value:20}],
            [{name:'����'}, {name:'����',value:10}]
        ];

        var SHData = [
            [{name:'�Ϻ�'},{name:'��ͷ',value:95}],
            [{name:'�Ϻ�'},{name:'����',value:90}],
            [{name:'�Ϻ�'},{name:'����',value:80}],
            [{name:'�Ϻ�'},{name:'֣��',value:70}],
            [{name:'�Ϻ�'},{name:'����',value:60}],
            [{name:'�Ϻ�'},{name:'����',value:50}],
            [{name:'�Ϻ�'},{name:'��ɳ',value:40}],
            [{name:'�Ϻ�'},{name:'����',value:30}],
            [{name:'�Ϻ�'},{name:'����',value:20}],
            [{name:'�Ϻ�'},{name:'����',value:10}]
        ];

        var GZData = [
            [{name:'����'},{name:'����',value:95}],
            [{name:'����'},{name:'̫ԭ',value:90}],
            [{name:'����'},{name:'����',value:80}],
            [{name:'����'},{name:'����',value:70}],
            [{name:'����'},{name:'����',value:60}],
            [{name:'����'},{name:'�ɶ�',value:50}],
            [{name:'����'},{name:'����',value:40}],
            [{name:'����'},{name:'����',value:30}],
            [{name:'����'},{name:'����',value:20}],
            [{name:'����'},{name:'����',value:10}]
        ];

        var planePath = 'path://M1705.06,1318.313v-89.254l-319.9-221.799l0.073-208.063c0.521-84.662-26.629-121.796-63.961-121.491c-37.332-0.305-64.482,36.829-63.961,121.491l0.073,208.063l-319.9,221.799v89.254l330.343-157.288l12.238,241.308l-134.449,92.931l0.531,42.034l175.125-42.917l175.125,42.917l0.531-42.034l-134.449-92.931l12.238-241.308L1705.06,1318.313z';

        var convertData = function (data) {
            var res = [];
            for (var i = 0; i < data.length; i++) {
                var dataItem = data[i];
                var fromCoord = geoCoordMap[dataItem[0].name];
                var toCoord = geoCoordMap[dataItem[1].name];
                if (fromCoord && toCoord) {
                    res.push({
                        fromName: dataItem[0].name,
                        toName: dataItem[1].name,
                        coords: [fromCoord, toCoord]
                    });
                }
            }
            return res;
        };

        var color = ['#a6c84c', '#ffa022', '#46bee9'];
        var series = [];
        [['����', BJData], ['�Ϻ�', SHData], ['����', GZData]].forEach(function (item, i) {
            series.push({
                name: item[0] + ' Top10',
                type: 'lines',
                zlevel: 1,
                effect: {
                    show: true,
                    period: 6,
                    trailLength: 0.7,
                    color: '#fff',
                    symbolSize: 3
                },
                lineStyle: {
                    normal: {
                        color: color[i],
                        width: 0,
                        curveness: 0.2
                    }
                },
                data: convertData(item[1])
            },
            {
                name: item[0] + ' Top10',
                type: 'lines',
                zlevel: 2,
                effect: {
                    show: true,
                    period: 6,
                    trailLength: 0,
                    symbol: planePath,
                    symbolSize: 15
                },
                lineStyle: {
                    normal: {
                        color: color[i],
                        width: 1,
                        opacity: 0.4,
                        curveness: 0.2
                    }
                },
                data: convertData(item[1])
            },
            {
                name: item[0] + ' Top10',
                type: 'effectScatter',
                coordinateSystem: 'geo',
                zlevel: 2,
                rippleEffect: {
                    brushType: 'stroke'
                },
                label: {
                    normal: {
                        show: true,
                        position: 'right',
                        formatter: '{b}'
                    }
                },
                symbolSize: function (val) {
                    return val[2] / 8;
                },
                itemStyle: {
                    normal: {
                        color: color[i]
                    }
                },
                data: item[1].map(function (dataItem) {
                    return {
                        name: dataItem[1].name,
                        value: geoCoordMap[dataItem[1].name].concat([dataItem[1].value])
                    };
                })
            });
        });

        option = {
            backgroundColor: '#404a59',
            title : {
                text: 'ģ��Ǩ��',
                subtext: '���ݴ����鹹',
                left: 'center',
                textStyle : {
                    color: '#fff'
                }
            },
            tooltip : {
                trigger: 'item'
            },
            legend: {
                orient: 'vertical',
                top: 'bottom',
                left: 'right',
                data:['���� Top10', '�Ϻ� Top10', '���� Top10'],
                textStyle: {
                    color: '#fff'
                },
                selectedMode: 'single'
            },
            geo: {
                map: 'china',
                label: {
                    emphasis: {
                        show: false
                    }
                },
                roam: true,
                itemStyle: {
                    normal: {
                        areaColor: '#323c48',
                        borderColor: '#404a59'
                    },
                    emphasis: {
                        areaColor: '#2a333d'
                    }
                }
            },
            series: series
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