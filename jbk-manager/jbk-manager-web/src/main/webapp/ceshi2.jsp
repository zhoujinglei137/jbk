<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/12
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/register-login.css">
<link rel="stylesheet" type="text/css" href="css/mycss.css">
<link href="css/main.css" rel="stylesheet" />

<!DOCTYPE html>
<head>
  <title>jQuery弹出层效果</title>
  <meta content="网页特效,特效代码,jQuery,css特效,Js代码,广告幻灯,图片切换" name="keywords" />
  <meta content="jQuery弹出层效果，有关闭按钮，代码简单易懂，你可以随意修改弹出层的参数。" name="description" />
  <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
  <script type="text/javascript" src="js/myjs.js"></script>

</head>


<input id="Button1" type="button" value="点击弹出层" onclick="show()" />
<!--弹出层时背景层DIV-->
<div id="goodcover"></div>
<%--<div id="fade" class="black_overlay">--%>
</div>
<div id="MyDiv" class="white_content">
  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes()">关闭</span>
  </div>
    <%--目前来说，我还是喜欢这个自己改造的弹出层。自己在项目中也用的是这个。--%>
  <div align="center">
    <%--<font></font>
    <input type="text" name="loginName" id="loginName" placeholder="用户名" class="lg_input01 lg_input" onchange="ln()"><div ><font id="ln" color="red"></font></div>--%>
      <div class="cent-box register-box">
        <div class="cent-box-header">
          <h1 class="main-title hide">聚宝坑</h1>
          <h2 class="sub-title">生活守与信利于民 - Thousands Find</h2>
        </div>

      <div class="login form">
        <div class="group">
          <div class="group-ipt email">
            <input type="email" name="email" id="email" class="ipt" placeholder="邮箱地址" required>
          </div>
          <div class="group-ipt user">
            <input type="text" name="loginName" id="loginName" class="ipt" placeholder="选择一个用户名" required>
          </div>
          <div class="group-ipt user">
            <input type="text" name="userName" id="userName" class="ipt" placeholder="请输入姓名" required>
          </div>
          <div class="group-ipt password">
            <input type="password" name="passWord" id="passWord" class="ipt" placeholder="设置登录密码" required>
          </div>
          <div class="group-ipt password1">
            <input type="password" name="passWord1" id="passWord1" class="ipt" placeholder="重复密码" required>
          </div>
        </div>
      </div>

        <div class="button">
          <button type="submit" class="login-btn register-btn" id="button">注册</button>
        </div>
  </div>


  </div>
</div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



<div class="loginfr">
  <button type="button" id="ClickMe1">
    登录
  </button>
</div>


<input id="Button1" type="button" value="点击弹出层" onclick="show2()" />
<!--弹出层时背景层DIV-->
<div id="fade2" class="black_overlay"></div>
<div id="MyDiv2" class="white_content">
  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes2()">关闭</span>
  </div>

</div>

<script>
  function show(){
    bg.ShowDiv('MyDiv','goodcover');
  }

  function closes(){
    bg.CloseDiv('MyDiv','goodcover')
  }
  function show2(){
    bg.ShowDiv('MyDiv2','fade2');
  }
  function closes2(){
    bg.CloseDiv('MyDiv2','fade2')
  }
</script>
</body>
</html>
