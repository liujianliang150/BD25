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
        <div class="x-nav">
          <span class="layui-breadcrumb">
            <a href="">��ҳ</a>
            <a href="">��ʾ</a>
            <a>
              <cite>����Ԫ��</cite></a>
          </span>
          <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="ˢ��">
            <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i></a>
        </div>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-header">
                          ������־
                        </div>
                        <div class="layui-card-body ">
                          <ul class="layui-timeline">
                            <li class="layui-timeline-item">
                              <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                              <div class="layui-timeline-content layui-text">
                                <h3 class="layui-timeline-title">2019-03-30</h3>
                                <p>
                                  �޸� x_admin_show ��������ʵ����󻯣�Ĭ�ϴ��ڷ���󻯣������Ҫ����������󻯣������һ�������� true <br>  

                                  �޸�x_admin_add_to_tab ����bug���ڶ��ҳ���л����̵ı�����<br>

                                  x_admin_show(title,url,w,h,full=false)
                                </p>
                              </div>
                            </li>
                            <li class="layui-timeline-item">
                              <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                              <div class="layui-timeline-content layui-text">
                                <h3 class="layui-timeline-title">2019-03-19</h3>
                                <p>���ӷǲ˵���tab���� x_admin_add_to_tab(title,url,is_refresh) titelΪtab����,urlΪ��ҳ���ַ,is_refresh ��ѡ�������ظ�����Ƿ�ˢ�£�Ĭ��Ϊfalse��ˢ��,trueΪ�ظ����ˢ��ҳ��<br>
�÷�:<br>
index.html ��ֱ�� x_admin_add_to_tab('��tab��','http://www.baidu.com',true)<br>
iframeҳ����  �� parent.x_admin_add_to_tab('��tab��','http://www.163.com',true)</p>
                              </div>
                            </li>
                            <li class="layui-timeline-item">
                              <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                              <div class="layui-timeline-content layui-text">
                                <h3 class="layui-timeline-title">2019-03-07</h3>
                                <p>
                                  �Ƿ���ˢ�¼���tab����, ͨ��index ҳ������ var is_remember = false;������Ĭ�Ͽ���
                                </p>
                              </div>
                            </li>
                            <li class="layui-timeline-item">
                              <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                              <div class="layui-timeline-content layui-text">
                                <h3 class="layui-timeline-title">2019-03-07</h3>
                                <p>
                                  ����tab˫���رյ�ǰtab<br>
����tab�Ҽ��˵�����ʵ�� �رյ�ǰ/�ر�����/�ر�ȫ��
                                </p>
                              </div>
                            </li>
                            <li class="layui-timeline-item">
                              <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                              <div class="layui-timeline-content layui-text">
                                <h3 class="layui-timeline-title">2019-03-07</h3>
                                <p>
                                  ��������Ϊ2.1, ����layui 2.4.5<br>
���� html ����ǩ���� class="x-admin-sm" ����ʵ�����巽�������ϸ�� ԭ����14px ���12px<br>16px��Ϊ14px��������Щ��Ҫ��ʾ������Ϣ��ҳ��Ƚ��Ѻ� ȥ��x-admin-sm �ָ�ԭ����ʽ<br>
���Ӷ�̬��������<br>
���������ˢ��tab �ɸ���ʵ����Ҫѡ�� �� sub-menu li ��ǩ�м������� date-refresh="1" ,�����ӵ�������ˢ��<br>
���ӵ����㺯�� x_admin_father_reload() �ú�������ʵ�ֶԸ����ڵ�ˢ��<br>
ˢ�±������չ�� ������cookie ���������� ������ˢ�¶�ȡcookie��Ӧ������ ����չ����ࣩ<br>
����404����ҳ��<br>
tab���书�ܣ�ˢ�±���֮ǰ�򿪵�tab ������cookie ���������� ������ˢ�¶�ȡcookie��Ӧ������ ���д�)
                                </p>
                              </div>
                            </li>
                          </ul>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </body>
          </html>