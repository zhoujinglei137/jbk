<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/1
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html;text/html;charset=UTF-8">
  <title>首页</title>
  <!-- 导入easyui的样式表 -->
  <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
  <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
  <%--自定义css--%>
  <link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;">
  <h2>聚宝坑管理系统</h2>
</div>
<div data-options="region:'south'" style="padding:5px;background:#eee;">
  系统版本:V2.0
</div>
<div data-options="region:'west'" style="width:200px;">
  <div id="menu" class="easyui-accordion">
    <div title="账号管理" data-options="selected:false" style="padding:10px 0;">
      <ul class="easyui-tree">
        <li data-options="attributes:{'href':'admin/admin-add'}">新增管理</li>
        <li data-options="attributes:{'href':'admin/admin-list'}">查询管理员</li>
      </ul>
    </div>
    <div title="网站内信息管理" style="padding:10px 0;">
      <ul class="easyui-tree">
        <li data-options="attributes:{'href':'admin_addletter.jsp'}">信息推送</li>
        <li data-options="attributes:{'href':'content'}">举报信息</li>
      </ul>
    </div>
    <div title="索引管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
      <ul class="easyui-tree">
        <li data-options="attributes:{index-item'}">solr索引库管理</li>
      </ul>
    </div>
  </div>
</div>

<div data-options="region:'center'" style="background:#eee;">
  <div id="tab" class="easyui-tabs" data-options="fit:true">
    <div title="欢迎页面" style="padding:20px;"><h1>管理员界面</h1></div>
  </div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script src="js/moment-with-locales.js"></script>


<!-- 配置文件 -->
<script src="js/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script src="js/ueditor/ueditor.all.js"></script>
<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<script src="js/yao/yao.js"></script>
<!-- 自定义js -->
<script>
  ttshop.registerMenuEvent();
</script>
</body>
</html>
