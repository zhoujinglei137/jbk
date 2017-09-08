<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/6
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>管理员列表</title>
</head>
<body>
<div id="toolbar">
  <div style="padding: 5px; background-color: #fff;">
    <label>管理员列表：</label>
    <input class="easyui-textbox" type="text" id="title">
    <label>管理员状态：</label>
    <select id="status" class="easyui-combobox" >
      <option value="0">全部</option>
      <option value="1">在线</option>
      <option value="2">离线</option>
    </select>
    <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
    <!--注意：要加上type="button",默认行为是submit-->
    <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
  </div>
  <div>
    <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
    <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
    <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
<%--    <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
    <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>--%>
  </div>
</div>
<%--表格形式显示的页面--%>
<table id="dg"></table>

<script>
  $('#dg').datagrid({
    url:"admins",
    toolbar:"#toolbar",
    pagination: true,
    rownumbers:true,//显示行数
    pageSize:10,//显示数据量
    fit:true,//显示分页
    multiSort:true,//多重排序选择
    columns: [[
      {field:'ck',checkbox:true},
      {field:'id',title:'管理员id',sortable:true},
      {field:'loginName',title:'登录名',sortable:true},
      {field:'userName',title:'昵称'},
      {field:'sort',title:'类别'},
    ]]
  });
</script>
</body>
</html>
