
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
<div align="center"  title="新增产品类别" data-options="fit:true">
  <form class="main_form"  id="productClassAddForm" name="productClassAddForm" method="post">
    <p class="easyui-panel" title="新增产品类别">
    <p class="input_container">
      <input  class="easyui-textbox" name="productClassName" label="产品类别名称：" labelPosition="top" multiline="true" >
    </p>
    <p class="input_container">
      <input class="easyui-textbox" name="introduce" label="产品类别简介：" labelPosition="top" >
    </p>
    <p class="input_container">
      <input class="easyui-textbox" name="structure" label="产品交易结构：" labelPosition="top" >
    </p>

    <p>
      <button onclick="submitForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-ok'">保存</button>
      <button onclick="clearForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-undo'">重置</button>
    </p>
  </form>
</div>
<script>
  //提交表单
  function submitForm() {
    $('#productClassAddForm').form('submit', {
      //提交表单动作的URL地址
      url:'padd',
      success: function (data) {
        ttshop.closeTab('新增产品类别');
        $.messager.alert('消息', '添加成功！');
        if (data != null) {
          ttshop.closeTab("新增产品类别");
          $('#pc').datagrid('reload');
        }
      }
    });
  }
  //表单的重置功能
  function clearForm() {
    $('#productClassAddForm').form('reset');
    ttshop.closeTab("新增产品类别");
    $('#pc').datagrid('reload');
  }
</script>
</body>
</html>
