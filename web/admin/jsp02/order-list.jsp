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
        <script type="text/javascript" src="../s/xadmin.js"></script>
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
                            <form class="layui-form layui-col-space5">
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input class="layui-input" placeholder="��ʼ��" name="start" id="start"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input class="layui-input" placeholder="��ֹ��" name="end" id="end"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <select name="contrller">
                                        <option>֧����ʽ</option>
                                        <option>֧����</option>
                                        <option>΢��</option>
                                        <option>��������</option></select>
                                </div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <select name="contrller">
                                        <option value="">����״̬</option>
                                        <option value="0">��ȷ��</option>
                                        <option value="1">��ȷ��</option>
                                        <option value="2">���ջ�</option>
                                        <option value="3">��ȡ��</option>
                                        <option value="4">�����</option>
                                        <option value="5">������</option></select>
                                </div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input type="text" name="username" placeholder="�����붩����" autocomplete="off" class="layui-input"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <button class="layui-btn" lay-submit="" lay-filter="sreach">
                                        <i class="layui-icon">&#xe615;</i></button>
                                </div>
                            </form>
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
                                            <input type="checkbox" name="" lay-skin="primary">
                                        </th>
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