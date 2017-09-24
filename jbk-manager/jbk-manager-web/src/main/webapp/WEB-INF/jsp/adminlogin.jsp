<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zn">
<head>
  <meta charset="utf-8">
  <title>登录 - 管理员 - Thousands Find</title>
  <meta author="姚鹏">
  <link rel="stylesheet" type="text/css" href="css/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box register-box">
  <div class="cent-box-header">
    <h1 class="main-title hide">聚宝坑</h1>
    <h2 class="sub-title">生活守与信利于民 - Treasure pit</h2>
  </div>
  <form action="userAdminLogin" method="post">
  <div class="cont-main clearfix">
    <div class="index-tab">
      <div class="index-slide-nav">
        <a href="adminlogin">管理登录</a>
        <div class="slide-bar"></div>
      </div>
    </div>

    <div class="login form">
      <div class="group">
        <div class="group-ipt user">
          <input type="text" name="loginName" id="loginName" class="ipt" value="${cookie.loginName.value}" placeholder="输入用户名" required>
        </div>
        <div class="group-ipt password">
          <input type="password" name="passWord" id="passWord" class="ipt" placeholder="输入密码" required>
          <font color="red">${message}</font>
        </div>
          <c:choose>
            <c:when test="${cookie.loginName.value == null}">
              <p class="clearfix lg_check"><span class="fl"><input name="remember" type="checkbox" value="123">记住用户名</span><a href="forget-password" class="fr">忘记密码？找回</a></p>
            </c:when>
            <c:otherwise>
              <p class="clearfix lg_check"><span class="fl"><input name="remember" type="checkbox" checked="checked" value="123">记住用户名</span><a href="forget-password" class="fr">忘记密码？找回</a></p>
            </c:otherwise>
          </c:choose>
      </div>
    </div>

  <div class="button">
    <button type="submit" class="login-btn register-btn" id="button">登录</button>
  </div>
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