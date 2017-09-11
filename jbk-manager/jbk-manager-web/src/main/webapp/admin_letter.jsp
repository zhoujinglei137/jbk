<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>首页</title>
  <!-- 导入easyui的样式表 -->
  <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
  <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
  <link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;">
  <h2>聚宝坑后台管理系统</h2>
</div>
<div data-options="region:'south'" style="padding:5px;background:#eee;">
  系统版本：V2.0
</div>
<div data-options="region:'west'" style="width:200px;">
  <div id="menu" class="easyui-accordion">
    <div title="管理员信息" data-options="selected:true" style="padding:10px 0;">
      <ul class="easyui-tree">
        <li data-options="attributes:{'href':'item-add2'}">新增管理员</li>
        <li data-options="attributes:{'href':'item-list2'}">查询管理员</li>
        <li data-options="attributes:{'href':'item-param-list'}">查询用户</li>
      </ul>
    </div>
    <div title="网站内信息管理" style="padding:10px 0;">
      <ul class="easyui-tree">
        <li data-options="attributes:{'href':'admin_addletter.jsp'}">信息推送</li>
        <li data-options="attributes:{'href':'content'}">举报信息</li>
      </ul>
    </div>
  </div>
</div>
<div data-options="region:'center'" style="background:#eee;">
  <div id="tab" class="easyui-tabs" data-options="fit:true">
    <div title="欢迎页面" style="padding:20px;">聚宝坑欢迎你</div>
  </div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<%--<script src="js/moment/moment-with-locales.js"></script>--%>
<!-- 自定义脚本 -->
<!-- 选择国际化标准-->
<%--
<script>
  moment.locale('zh-cn');
</script>
--%>

<!-- 配置文件 -->
<script src="js/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script src="js/ueditor/ueditor.all.js"></script>


<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<!-- 自定义js -->
<script>
  ttshop.registerMenuEvent();
  /*$(function(){
   // alert("hello,world");
   $('#menu  .easyui-tree').tree({
   onClick:function(node){
   //alert(node.text);
   $('#tab').tabs('add',{
   title : node.text,
   href: node.attributes.href,
   closable:true
   });
   }

   });

   });*/
</script>
</body>
</html>