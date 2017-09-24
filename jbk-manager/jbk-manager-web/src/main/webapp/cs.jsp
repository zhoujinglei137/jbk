<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/13
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <link href="css/main.css" rel="stylesheet" />
  <link rel="stylesheet" type="text/css" href="css/register-login.css">
  <script src="js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="js/myjs.js"></script>
  <title>登录界面</title>
</head>
<body>

<div class="loginfr">
  <button type="button" id="ClickMe">
    登录
  </button>
</div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>



<div class="loginfr">
  <button type="button" id="ClickMe1">
    登录
  </button>
</div>

<div id="goodcover"></div>

<div id="code">
  <div class="code-img">
    <%--<div class="closepa"><a href="javascript:void(0)" id="closebt"><font size="5">关闭</font></a></div>--%>
      <div style="text-align: right; cursor: default; height: 40px;">
        <span style="font-size: 16px;" onclick="closes()">关闭</span>
      </div>
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
  </div>



<script>
   function closes(){
   bg.CloseDiv('code','goodcover')
   }
    $('#ClickMe').click(function () {

      $('#goodcover').show();
    $('#code').center();
      $('#code').fadeIn();
    });
   $('#ClickMe1').click(function () {
     $('#goodcover').show();
     $('#code').center();
     $('#code').fadeIn();
   });
   /* $('#closebt').click(function () {
      $('#code').hide();
      $('#goodcover').hide();
    });
    $('#goodcover').click(function () {
      $('#code').hide();
      $('#goodcover').hide();
    });*/
    bg.Zshow();
</script>

</body>
</html>
