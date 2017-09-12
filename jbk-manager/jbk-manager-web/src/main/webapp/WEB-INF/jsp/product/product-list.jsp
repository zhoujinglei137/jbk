<%--
  Created by IntelliJ IDEA.
  User: 方雷
  Date: 2017/9/7
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>产品列表</title>
</head>
<body>
<div id="toolbar">
  <div style="padding: 5px; background-color: #fff;">
    <label>产品列表：</label>
    <input class="easyui-textbox" type="text" id="productName">
    <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
    <!--注意：要加上type="button",默认行为是submit-->
    <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
  </div>
  <div>
    <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
    <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
  </div>
</div>
<%--表格形式显示的页面--%>
<table id="dg"></table>

<script>
  function remove(){
    var selectRows = $('#dg').datagrid('getSelections');
    console.log(selectRows);
    if(selectRows.length == 0){
      $.messager.alert('提示','未选中记录','warning');
      return;
    }
    $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
      if (r){
        //获取用户选中的记录
        var ids = [];
        for(var i=0;i< selectRows.length;i++){
          ids.push(selectRows[i].id);
        }
        //异步提交给后台
        $.ajax({
          url:"product/delete",
          type:"post",
          data:{"ids[]":ids},
          success:function(data){
            $('#dg').datagrid('reload');
          },
          dataType:"json"
        });
      }
    });
  }

  $('#dg').datagrid({
    url:"products",
    toolbar:"#toolbar",
    pagination: true,
    rownumbers:true,//显示行数
    pageSize:10,//显示数据量
    fit:true,//显示分页
    multiSort:true,//多重排序选择
    columns: [[
      {field:'ck',checkbox:true},
      {field:'id',title:'产品id',sortable:true},
      {field:'productClass',title:'产品类别',formatter:function(value,row,index){
          return value.productClassName;
      }},
      {field:'productName',title:'产品名称'},
      {field:'itemlimit',title:'项目总额'},
      {field:'investDeadline',title:'投资期限'},
      {field:'yearYield',title:'年收益率'},
      {field:'spreadMargin',title:'加息率'},
      {field:'getlimit',title:'获得总额'},
      {field:'startDate',title:'开投日期',sortable:true},
      {field:'endDate',title:'截止日期'},
      {field:'startLimit',title:'起投金额'},
      {field:'transDate',title:'转让时间'},
    ]]
  });
  function searchForm(){
    $('#dg').datagrid('load',{
      productName:  $('#productName').val()
    });
  }

  function add(){
    ttshop.addTab('新增产品','product/product-add');
  }
</script>

</body>
</html>
