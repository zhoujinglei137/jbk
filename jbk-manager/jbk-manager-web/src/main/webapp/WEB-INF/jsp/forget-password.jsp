<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/14
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zn">
<head>
  <meta charset="utf-8">
  <title>找回密码 -  Retrieve password</title>
  <meta author="姚鹏">
  <link rel="stylesheet" type="text/css" href="css/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box register-box">
  <div class="cent-box-header">
    <h1 class="main-title hide">聚宝坑</h1>
  </div>
  <form action="userAdminLogin" method="post">
    <div class="cont-main clearfix">
      <div class="index-tab">
        <div class="index-slide-nav">
          <a href="adminlogin">密码找回</a>
          <div class="slide-bar"></div>
        </div>
      </div>

      <div class="login form">
        <div class="group">
          <div class="group-ipt user">
            <input type="text" name="loginName" id="loginName" class="ipt" value="${cookie.loginName.value}" placeholder="输入用户名" required>
          </div>
          <div class="group-ipt password">
            <input type="text" name="userName" id="userName" class="ipt" placeholder="输入昵称" required>
          </div>
        </div>
      </div>
      <button type="submit" class="login-btn register-btn" id="button">登录</button>
      <button type="button" class="login-btn register-btn" id="button1" onclick="retrieve">返回</button>
      <%--<div class="button">--%>
        <%--<button type="submit" class="login-btn register-btn" id="button">登录</button>--%>
      <%--</div>--%>
    </div>
  </form>
</div>


<div class="footer">
  <p>聚宝坑 - Treasure pit</p>
  <p>Designed By YaoPeng & <a href="zrong.me">yao.net</a> 2016</p>
</div>



<script src='js/particles.js' type="text/javascript"></script>
<script src='js/background.js' type="text/javascript"></script>
<script src='js/jquery.min.js' type="text/javascript"></script>
<script src='js/layer/layer.js' type="text/javascript"></script>
<script src='js/index.js' type="text/javascript"></script>
<script>
  function retrieve(){
    window.location.href="adminlogin";
  }

  $("#remember-me").click(function(){
    var n = document.getElementById("remember-me").checked;
    if(n){
      $(".zt").show();
    }else{
      $(".zt").hide();
    }
  })
</script>
</body>
</html>



