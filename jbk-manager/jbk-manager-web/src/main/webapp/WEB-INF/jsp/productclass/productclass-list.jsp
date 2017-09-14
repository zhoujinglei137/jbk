
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>产品类别列表</title>
</head>
<body>
<div id="toolbar">
  <div style="padding: 5px; background-color: #fff;">
    <label>产品类别列表：</label>
    <input class="easyui-textbox" type="text" id="productClassName">
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
<table id="pc"></table>

<script>
  function remove(){
    var selectRows = $('#pc').datagrid('getSelections');
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
          url:"productclass/delete",
          type:"post",
          data:{"ids[]":ids},
          success:function(data){
            $('#pc').datagrid('reload');
          },
          dataType:"json"
        });
      }
    });
  }

  $('#pc').datagrid({
    url:"productclasses",
    toolbar:"#toolbar",
    pagination: true,
    rownumbers:true,//显示行数
    pageSize:10,//显示数据量
    fit:true,//显示分页
    multiSort:true,//多重排序选择
    columns: [[
      {field:'ck',checkbox:true},
      {field:'id',title:'产品类别id',sortable:true},
      {field:'productClassName',title:'产品类别名称'},
      {field:'introduce',title:'产品简介'},
      {field:'structure',title:'产品交易结构'},
    ]]
  });
  function searchForm(){
    $('#pc').datagrid('load',{
      productClassName:  $('#productClassName').val()
    });
  }

  function add(){
    ttshop.addTab('新增产品类别','productclass/productclass-add');
  }
</script>

</body>
</html>
