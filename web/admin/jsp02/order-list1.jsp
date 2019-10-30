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
                <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
            </a>
        </div>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">

                <div class="layui-col-md12">

                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <div class="layui-collapse" lay-filter="test">
                                <div class="layui-colla-item">
                                <h2 class="layui-colla-title">����ɸѡ<i class="layui-icon layui-colla-icon">�t</i></h2>
                                <div class="layui-colla-content">
                                  <form class="layui-form" action="">
                                      <div class="layui-form-item">
                                        <div class="layui-inline">
                                          <label class="layui-form-label">��Χ</label>
                                          <div class="layui-input-inline" style="width: 100px;">
                                            <input type="text" name="price_min" placeholder="��" autocomplete="off" class="layui-input">
                                          </div>
                                          <div class="layui-form-mid">-</div>
                                          <div class="layui-input-inline" style="width: 100px;">
                                            <input type="text" name="price_max" placeholder="��" autocomplete="off" class="layui-input">
                                          </div>
                                        </div>
                                      </div>
                                      
                                      <div class="layui-form-item">
                                        <div class="layui-inline">
                                          <label class="layui-form-label">����ѡ���</label>
                                          <div class="layui-input-inline">
                                            <select name="quiz">
                                              <option value="">��ѡ������</option>
                                              <optgroup label="���м���">
                                                <option value="�㹤���ĵ�һ������">�㹤���ĵ�һ������</option>
                                              </optgroup>
                                              <optgroup label="ѧ��ʱ��">
                                                <option value="��Ĺ���">��Ĺ���</option>
                                                <option value="����ϲ������ʦ">����ϲ������ʦ</option>
                                              </optgroup>
                                            </select>
                                          </div>
                                        </div>
                                        <div class="layui-inline">
                                          <label class="layui-form-label">����ѡ���</label>
                                          <div class="layui-input-inline">
                                            <select name="modules" lay-verify="required" lay-search="">
                                              <option value="">ֱ��ѡ�������ѡ��</option>
                                              <option value="1">layer</option>
                                              <option value="2">form</option>
                                              <option value="3">layim</option>
                                              <option value="4">element</option>
                                              <option value="5">laytpl</option>
                                              <option value="6">upload</option>
                                              <option value="7">laydate</option>
                                              <option value="8">laypage</option>
                                              <option value="9">flow</option>
                                              <option value="10">util</option>
                                              <option value="11">code</option>
                                              <option value="12">tree</option>
                                              <option value="13">layedit</option>
                                              <option value="14">nav</option>
                                              <option value="15">tab</option>
                                              <option value="16">table</option>
                                              <option value="17">select</option>
                                              <option value="18">checkbox</option>
                                              <option value="19">switch</option>
                                              <option value="20">radio</option>
                                            </select>
                                          </div>
                                        </div>
                                      </div>
                                      
                                      <div class="layui-form-item">
                                        <label class="layui-form-label">����ѡ���</label>
                                        <div class="layui-input-inline">
                                          <select name="quiz1">
                                            <option value="">��ѡ��ʡ</option>
                                            <option value="�㽭" selected="">�㽭ʡ</option>
                                            <option value="��Ĺ���">����ʡ</option>
                                            <option value="����ϲ������ʦ">����ʡ</option>
                                          </select>
                                        </div>
                                        <div class="layui-input-inline">
                                          <select name="quiz2">
                                            <option value="">��ѡ����</option>
                                            <option value="����">����</option>
                                            <option value="����" disabled="">����</option>
                                            <option value="����">����</option>
                                            <option value="����">̨��</option>
                                            <option value="����">����</option>
                                          </select>
                                        </div>
                                        <div class="layui-input-inline">
                                          <select name="quiz3">
                                            <option value="">��ѡ����/��</option>
                                            <option value="������">������</option>
                                            <option value="�ຼ��">�ຼ��</option>
                                            <option value="������">�ٰ���</option>
                                          </select>
                                        </div>
                                        <div class="layui-form-mid layui-word-aux">�˴�ֻ����ʾ�����Ű棬��δ����������</div>
                                      </div>
                                      
                                      <div class="layui-form-item">
                                        <label class="layui-form-label">��ѡ��</label>
                                        <div class="layui-input-block">
                                          <input type="checkbox" name="like[write]" title="д��">
                                          <input type="checkbox" name="like[read]" title="�Ķ�" checked="">
                                          <input type="checkbox" name="like[game]" title="��Ϸ">
                                        </div>
                                      </div>
                                      
                                      <div class="layui-form-item" pane="">
                                        <label class="layui-form-label">ԭʼ��ѡ��</label>
                                        <div class="layui-input-block">
                                          <input type="checkbox" name="like1[write]" lay-skin="primary" title="д��" checked="">
                                          <input type="checkbox" name="like1[read]" lay-skin="primary" title="�Ķ�">
                                          <input type="checkbox" name="like1[game]" lay-skin="primary" title="��Ϸ" disabled="">
                                        </div>
                                      </div>
                                      
                                      <div class="layui-form-item">
                                        <label class="layui-form-label">����-Ĭ�Ϲ�</label>
                                        <div class="layui-input-block">
                                          <input type="checkbox" name="close" lay-skin="switch" lay-text="ON|OFF">
                                        </div>
                                      </div>
                                      <div class="layui-form-item">
                                        <label class="layui-form-label">����-Ĭ�Ͽ�</label>
                                        <div class="layui-input-block">
                                          <input type="checkbox" checked="" name="open" lay-skin="switch" lay-filter="switchTest" lay-text="ON|OFF">
                                        </div>
                                      </div>
                                      <div class="layui-form-item">
                                        <label class="layui-form-label">��ѡ��</label>
                                        <div class="layui-input-block">
                                          <input type="radio" name="sex" value="��" title="��" checked="">
                                          <input type="radio" name="sex" value="Ů" title="Ů">
                                          <input type="radio" name="sex" value="��" title="����" disabled="">
                                        </div>
                                      </div>
                                      <div class="layui-form-item">
                                        <div class="layui-input-block">
                                          <button class="layui-btn" lay-submit="" lay-filter="demo1">�����ύ</button>
                                          <button type="reset" class="layui-btn layui-btn-primary">����</button>
                                        </div>
                                      </div>
                                    </form>
                                </div>
                              </div>
                            </div>
                        </div>
                        <div class="layui-card-header">

                            <button class="layui-btn layui-btn-danger" onclick="delAll()">
                                <i class="layui-icon">��</i>����ɾ��</button>
                            <button class="layui-btn" onclick="xadmin.open('����û�','./order-add.html',800,600)">
                                <i class="layui-icon">�b</i>���</button></div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form">
                                <thead>
                                    <tr>
                                        <th>
                                            <input type="checkbox" name="" lay-skin="primary"></th>
                                        <th>�������</th>
                                        <th>�ջ���</th>
                                        <th>�ܽ��</th>
                                        <th>Ӧ�����</th>
                                        <th>����״̬</th>
                                        <th>֧��״̬</th>
                                        <th>����״̬</th>
                                        <th>֧����ʽ</th>
                                        <th>���ͷ�ʽ</th>
                                        <th>�µ�ʱ��</th>
                                        <th>����</th></tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>
                                            <input type="checkbox" name="" lay-skin="primary"></td>
                                        <td>2017009171822298053</td>
                                        <td>����:18925139194</td>
                                        <td>7829.10</td>
                                        <td>7854.10</td>
                                        <td>��ȷ��</td>
                                        <td>δ֧��</td>
                                        <td>δ����</td>
                                        <td>������ʽ</td>
                                        <td>��ͨ����</td>
                                        <td>2017-08-17 18:22</td>
                                        <td class="td-manage">
                                            <a title="�鿴" onclick="xadmin.open('�༭','order-view.html')" href="javascript:;">
                                                <i class="layui-icon">&#xe63c;</i></a>
                                            <a title="ɾ��" onclick="member_del(this,'Ҫɾ����id')" href="javascript:;">
                                                <i class="layui-icon">&#xe640;</i></a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" name="" lay-skin="primary"></td>
                                        <td>2017009171822298053</td>
                                        <td>����:18925139194</td>
                                        <td>7829.10</td>
                                        <td>7854.10</td>
                                        <td>��ȷ��</td>
                                        <td>δ֧��</td>
                                        <td>δ����</td>
                                        <td>������ʽ</td>
                                        <td>��ͨ����</td>
                                        <td>2017-08-17 18:22</td>
                                        <td class="td-manage">
                                            <a title="�鿴" onclick="xadmin.open('�༭','order-view.html')" href="javascript:;">
                                                <i class="layui-icon">&#xe63c;</i></a>
                                            <a title="ɾ��" onclick="member_del(this,'Ҫɾ����id')" href="javascript:;">
                                                <i class="layui-icon">&#xe640;</i></a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="checkbox" name="" lay-skin="primary"></td>
                                        <td>2017009171822298053</td>
                                        <td>����:18925139194</td>
                                        <td>7829.10</td>
                                        <td>7854.10</td>
                                        <td>��ȷ��</td>
                                        <td>δ֧��</td>
                                        <td>δ����</td>
                                        <td>������ʽ</td>
                                        <td>��ͨ����</td>
                                        <td>2017-08-17 18:22</td>
                                        <td class="td-manage">
                                            <a title="�鿴" onclick="xadmin.open('�༭','order-view.html')" href="javascript:;">
                                                <i class="layui-icon">&#xe63c;</i></a>
                                            <a title="ɾ��" onclick="member_del(this,'Ҫɾ����id')" href="javascript:;">
                                                <i class="layui-icon">&#xe640;</i></a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="layui-card-body ">
                            <div class="page">
                                <div>
                                    <a class="prev" href="">&lt;&lt;</a>
                                    <a class="num" href="">1</a>
                                    <span class="current">2</span>
                                    <a class="num" href="">3</a>
                                    <a class="num" href="">489</a>
                                    <a class="next" href="">&gt;&gt;</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script>layui.use(['laydate', 'form'],
        function() {
            var laydate = layui.laydate;

            //ִ��һ��laydateʵ��
            laydate.render({
                elem: '#start' //ָ��Ԫ��
            });

            //ִ��һ��laydateʵ��
            laydate.render({
                elem: '#end' //ָ��Ԫ��
            });
        });

        /*�û�-ͣ��*/
        function member_stop(obj, id) {
            layer.confirm('ȷ��Ҫͣ����',
            function(index) {

                if ($(obj).attr('title') == '����') {

                    //���첽���û�״̬���и���
                    $(obj).attr('title', 'ͣ��');
                    $(obj).find('i').html('&#xe62f;');

                    $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('��ͣ��');
                    layer.msg('��ͣ��!', {
                        icon: 5,
                        time: 1000
                    });

                } else {
                    $(obj).attr('title', '����');
                    $(obj).find('i').html('&#xe601;');

                    $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('������');
                    layer.msg('������!', {
                        icon: 5,
                        time: 1000
                    });
                }

            });
        }

        /*�û�-ɾ��*/
        function member_del(obj, id) {
            layer.confirm('ȷ��Ҫɾ����',
            function(index) {
                //���첽ɾ������
                $(obj).parents("tr").remove();
                layer.msg('��ɾ��!', {
                    icon: 1,
                    time: 1000
                });
            });
        }

        function delAll(argument) {

            var data = tableCheck.getData();

            layer.confirm('ȷ��Ҫɾ����' + data,
            function(index) {
                //׽�����б�ѡ�еģ����첽����ɾ��
                layer.msg('ɾ���ɹ�', {
                    icon: 1
                });
                $(".layui-form-checked").not('.header').parents('tr').remove();
            });
        }</script>

</html>