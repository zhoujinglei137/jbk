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
  <div id="gl" style="padding: 5px; background-color: #fff;">
    <label>管理员列表：</label><br>
    <label>管理员登录名：</label>
    <input class="easyui-textbox" type="text" id="loginName">
    <label>管理员昵称：</label>
    <input class="easyui-textbox" type="text" id="userName">
    <%--<select id="status" class="easyui-combobox" >--%>
      <%--<option value="0">全部</option>--%>
      <%--<option value="1">在线</option>--%>
      <%--<option value="2">离线</option>--%>
    <%--</select>--%>
    <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
    <!--注意：要加上type="button",默认行为是submit-->
    <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
  </div>
  <div id="tb">
    <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
    <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
    <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>

  </div>
</div>
<%--表格形式显示的页面--%>
<table id="dg"></table>

<script>
  function searchForm(){
    $('#dg').datagrid('load',{
      loginName: $('#loginName').val(),
      userName: $('#userName').val(),
    });
  }
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
          url:"admins/batch",
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
  function add(){
    ttshop.addTab("新增管理","admin/admin-add");
  }
  function edit(){
    var selectRows = $('#dg').datagrid('getSelections')
    if(selectRows.length == 0){
      $.messager.alert('提示','未选中记录','warning');
      return;
    }
    if(selectRows.length >1){
      $.messager.alert('提示','只能选中一条记录','warning');
      return;
    }
    $.messager.confirm('确认','您确认想要修改选中的记录吗？',function(r){

      if (r){
        //获取用户选中的记录
        var id;
        id=selectRows[0].id;
        //ttshop.closeTab('查询管理员');
   //     ttshop.closeTab('查询管理员');
        yao.add_Tab("管理员信息","admin-update",id);
        //异步提交给后台
//        $.ajax({
//          url:"adminupdate",
//          type:"post",
//          data:{"id":id},
//          success:function(data){
//            ttshop.addTab("管理员信息","admin/admin-update");
//          //  $('#dg').datagrid('reload');
//          },
//          dataType:"json"
//        });

      }
    });
  }


  $('#dg').datagrid({
    url:"admins",
    toolbar:"#toolbar",
 //   toolbar:"#tb",
    //默认是post类型的请求
    //method:"get",
    pagination: true,
    rownumbers:true,//显示行数
    pageSize:10,//显示数据量
    fit:true,//显示分页在最低行
    multiSort:true,//多重排序选择
    columns: [[
      {field:'ck',checkbox:true},
      {field:'id',title:'管理员编号',sortable:true},
      {field:'loginName',title:'登录名',sortable:true},
      {field:'userName',title:'昵称',sortable:true},
      {field:'sorts',title:'类别'},
    ]]
  });

</script>

</body>
</html>
