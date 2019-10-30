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
        <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <script src="../lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="../js/xadmin.js"></script>
        <!-- ��IE8/9֧��ý���ѯ���Ӷ�����դ�� -->
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
                            <form class="layui-form layui-col-space5">
                                <div class="layui-input-inline layui-show-xs-block">
                                    <input class="layui-input" placeholder="������" name="cate_name"></div>
                                <div class="layui-input-inline layui-show-xs-block">
                                    <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">�b</i>����</button>
                                </div>
                            </form>
                            <hr>
                            <blockquote class="layui-elem-quote">ÿ��tr ������������ cate-id='1' ��ǰ����id fid='0' ����id ,��������Ϊ 0�����ӷ����ǰ�������ͼ��<i class="layui-icon x-show" status='true'>&#xe623;</i></blockquote>
                        </div>
                        <div class="layui-card-header">
                            <button class="layui-btn layui-btn-danger" onclick="delAll()">
                                <i class="layui-icon">��</i>����ɾ��</button>
                        </div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form">
                              <thead>
                                <tr>
                                  <th width="20">
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </th>
                                  <th width="70">ID</th>
                                  <th>��Ŀ��</th>
                                  <th width="50">����</th>
                                  <th width="80">״̬</th>
                                  <th width="250">����</th>
                              </thead>
                              <tbody class="x-cate">
                                <tr cate-id='1' fid='0' >
                                  <td>
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>1</td>
                                  <td>
                                    <i class="layui-icon x-show" status='true'>&#xe623;</i>
                                    ��Ʒ����
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
                                  </td>
                                </tr>
                                <tr cate-id='2' fid='1' >
                                  <td>
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>2</td>
                                  <td>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <i class="layui-icon x-show" status='true'>&#xe623;</i>
                                    ��Ʒ�б�
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
                                  </td>
                                </tr>
                                <tr cate-id='3' fid='2' >
                                  <td>
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>3</td>
                                  <td>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    ����Ʒ�б�
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
                                  </td>
                                </tr>
                                <tr cate-id='4' fid='2' >
                                  <td>
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>4</td>
                                  <td>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    ����Ʒ�б�
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
                                  </td>
                                </tr>
                                <tr cate-id='5' fid='0' >
                                  <td>
                                   <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>5</td>
                                  <td>
                                    
                                    <i class="layui-icon x-show" status='true'>&#xe623;</i>����
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
                                  </td>
                                </tr>
                                <tr cate-id='6' fid='5' >
                                  <td>
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>6</td>
                                  <td>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    ����������
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
                                  </td>
                                </tr>
                                <tr cate-id='7' fid='5' >
                                  <td>
                                    <input type="checkbox" name="" lay-skin="primary">
                                  </td>
                                  <td>7</td>
                                  <td>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    ����������
                                  </td>
                                  <td><input type="text" class="layui-input x-sort" name="order" value="1"></td>
                                  <td>
                                    <input type="checkbox" name="switch"  lay-text="����|ͣ��"  checked="" lay-skin="switch">
                                  </td>
                                  <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�༭</button>
                                    <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="xadmin.open('�༭','admin-edit.html')" ><i class="layui-icon">&#xe642;</i>�������Ŀ</button>
                                    <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'Ҫɾ����id')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>ɾ��</button>
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
        <script>
          layui.use(['form'], function(){
            form = layui.form;
            
          });

           /*�û�-ɾ��*/
          function member_del(obj,id){
              layer.confirm('ȷ��Ҫɾ����',function(index){
                  //���첽ɾ������
                  $(obj).parents("tr").remove();
                  layer.msg('��ɾ��!',{icon:1,time:1000});
              });
          }

          // ����չ������ķ�����߼�
          // 
          $(function(){
            $("tbody.x-cate tr[fid!='0']").hide();
            // ��Ŀ�༶��ʾЧ��
            $('.x-show').click(function () {
                if($(this).attr('status')=='true'){
                    $(this).html('&#xe625;'); 
                    $(this).attr('status','false');
                    cateId = $(this).parents('tr').attr('cate-id');
                    $("tbody tr[fid="+cateId+"]").show();
               }else{
                    cateIds = [];
                    $(this).html('&#xe623;');
                    $(this).attr('status','true');
                    cateId = $(this).parents('tr').attr('cate-id');
                    getCateId(cateId);
                    for (var i in cateIds) {
                        $("tbody tr[cate-id="+cateIds[i]+"]").hide().find('.x-show').html('&#xe623;').attr('status','true');
                    }
               }
            })
          })

          var cateIds = [];
          function getCateId(cateId) {
              $("tbody tr[fid="+cateId+"]").each(function(index, el) {
                  id = $(el).attr('cate-id');
                  cateIds.push(id);
                  getCateId(id);
              });
          }
   
        </script>
    </body>
</html>
