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
        <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="../js/xadmin.js"></script>
        <!-- ��IE8/9֧��ý���ѯ���Ӷ�����դ�� -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]--></head>
    
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form">
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>�û���</label>
                        <div class="layui-input-inline">
                            <input type="text" id="username" name="username" required="" lay-verify="required" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>�ջ���</label>
                        <div class="layui-input-inline">
                            <input type="text" id="username" name="username" required="" lay-verify="required" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="phone" class="layui-form-label">
                            <span class="x-red">*</span>�ֻ�</label>
                        <div class="layui-input-inline">
                            <input type="text" id="phone" name="phone" required="" lay-verify="phone" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>�ջ���ַ</label>
                        <div class="layui-input-inline">
                            <input type="text" id="username" name="username" required="" lay-verify="required" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>��������</label>
                        <div class="layui-input-inline">
                            <select id="shipping" name="shipping" class="valid">
                                <option value="shentong">��ͨ����</option>
                                <option value="shunfeng">˳������</option></select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label for="username" class="layui-form-label">
                            <span class="x-red">*</span>֧����ʽ</label>
                        <div class="layui-input-inline">
                            <select name="contrller">
                                <option>֧����ʽ</option>
                                <option>֧����</option>
                                <option>΢��</option>
                                <option>��������</option></select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>��Ʊ̧ͷ</label>
                        <div class="layui-input-inline">
                            <input type="text" id="L_email" name="email" required="" lay-verify="email" autocomplete="off" class="layui-input"></div>
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span></div>
                    </div>
                    <div class="layui-form-item layui-form-text">
                        <label for="desc" class="layui-form-label">��Ʒ����</label>
                        <div class="layui-input-block">
                            <table class="layui-table">
                                <tbody>
                                    <tr>
                                        <td>haier���� BC-93TMPF 93�����ű���</div></td>
                        <td>0.01</div></td>
                    <td>984</div></td>
            <td>1</td>
            <td>ɾ��</td></tr>
            <tr>
                <td>haier���� BC-93TMPF 93�����ű���</div></td>
        <td>0.01</div></td>
        <td>984</div></td>
        <td>1</td>
        <td>ɾ��</td></tr>
        </tbody>
        </table>
        </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label for="desc" class="layui-form-label">����</label>
            <div class="layui-input-block">
                <textarea placeholder="����������" id="desc" name="desc" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label"></label>
            <button class="layui-btn" lay-filter="add" lay-submit="">����</button></div>
        </form>
        </div>
        </div>
        <script>layui.use(['form', 'layer'],
            function() {
                $ = layui.jquery;
                var form = layui.form,
                layer = layui.layer;

                //�Զ�����֤����
                form.verify({
                    nikename: function(value) {
                        if (value.length < 5) {
                            return '�ǳ����ٵ�5���ַ���';
                        }
                    },
                    pass: [/(.+){6,12}$/, '�������6��12λ'],
                    repass: function(value) {
                        if ($('#L_pass').val() != $('#L_repass').val()) {
                            return '�������벻һ��';
                        }
                    }
                });

                //�����ύ
                form.on('submit(add)',
                function(data) {
                    console.log(data);
                    //���첽���������ύ��php
                    layer.alert("���ӳɹ�", {
                        icon: 6
                    },
                    function() {
                        // ���frame����
                        var index = parent.layer.getFrameIndex(window.name);
                        //�رյ�ǰframe
                        parent.layer.close(index);
                    });
                    return false;
                });

            });</script>
        <script>var _hmt = _hmt || []; (function() {
                var hm = document.createElement("script");
                hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(hm, s);
            })();</script>
    </body>

</html>