<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/3
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>



<html>
<head>
  <title></title>
  <style type="text/css">

    .main_form{
      margin:32px auto;
      width:600px;
    }
    .input_container{
      margin-bottom:50px;
    }

  </style>
</head>
<body>
<div align="center"  title="新增管理" data-options="fit:true">
  <form class="main_form"  id="adminUpdateForm" name="adminUpdateForm" method="post">
    <p class="easyui-panel" title="新增管理">
    <input type="hidden" name="id" value="${userAdmin.id}">
    <p class="input_container">
      <input id="loginName" class="easyui-textbox" name="loginName" label="登录名：" labelPosition="top" data-options="required:true " validType="remote['/jbk/checkLoginName','loginName']" invalidMessage="该用户名已存在" value="${userAdmin.loginName}" >
    </p>
    <p class="input_container">
      <input  class="easyui-textbox" name="userName" id="username"  label="用户名：" labelPosition="top"  data-options="required:true" multiline="true" value="${userAdmin.userName}">
    <p class="input_container">
      <input class="easyui-textbox" name="passWord"  label="登陆密码：" labelPosition="top" type="text" id="passWord" data-options="required:true,validType:['passWord','length[6,16]']
" value="${userAdmin.passWord}">
    </p>

    <p class="input_container">
     <input class="easyui-textbox" label="重复密码：" labelPosition="top" name="passWord1" id="passWord1" type="text"
                  data-options="required:true,validType:['passWord1','equals[\'#passWord\']']" value="${userAdmin.passWord}">
    </p>
    <p>
      <button onclick="submitForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-ok'">保存</button>
      <button onclick="clearForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-undo'">返回</button>
    </p>
  </form>
</div>
<script>

  $('#loginName').textbox({

  })



  //提交表单
  function submitForm() {
    $('#adminUpdateForm').form('submit', {
      //提交表单动作的URL地址
      url: 'adminupdate',
      //在提交之前触发，返回false可以终止提交
//      onSubmit: function () {
//        return $(this).form('validate');
//      },
      //在表单提交成功以后触发
      success: function (data) {
        if (data != null) {
          $.messager.alert('消息', '修改成功！');
          ttshop.closeTab('管理员信息');
          $('#dg').datagrid('reload');
//          页面跳转还有问题
//         ttshop.add_Tab("查询管理员","admin/admin-list");
        }
      }
    });
  }
  //表单的重置功能
  function clearForm() {
    $('#adminAddForm').form('reset');
      ttshop.closeTab('管理员信息');
      $('#dg').datagrid('reload');
  }
  $.extend($.fn.validatebox.defaults.rules, {
    equals: {
      validator: function(value,param){
        return value == $(param[0]).val();
      },
      message: '两次密码需要一致！！！'
    }
  });
</script>
</body>
</html>
