<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/7
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<body>
<div align="center"  title="新增管理" data-options="fit:true">
  <form class="main_form"  id="adminAddForm" name="adminAddForm" method="post">
    <p class="easyui-panel" title="新增管理">
      <%--<p class="input_container">--%>
      <%--<input class="easyui-textbox" name="id" label="管理员编号：" labelPosition="top" >--%>
      <%--</p>--%>
    <p class="input_container">
      <input class="easyui-textbox" name="loginName" label="登录名：" labelPosition="top">
    </p>
    <p class="input_container">
      <input  class="easyui-textbox" name="userName" label="用户名：" labelPosition="top" multiline="true" >
    </p>
    <p class="input_container">
      <input class="easyui-textbox" name="passWord" label="登陆密码：" labelPosition="top" >
    </p>
    <p>
      <button onclick="submitForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-ok'">保存</button>
      <button onclick="clearForm()" class="easyui-linkbutton" type="button" data-options="iconCls:'icon-undo'">重置</button>
    </p>
  </form>
</div>
</body>
</html>
