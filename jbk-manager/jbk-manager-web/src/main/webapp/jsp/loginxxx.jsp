<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta author="zrong.me 曾荣">
  <title>登录 - 聚宝坑 - Thousands Find</title>
  <link rel="stylesheet" type="text/css" href="css/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box">
  <div class="cent-box-header">
    <h1 class="main-title hide">聚宝坑</h1>
    <h2 class="sub-title">生活守与信利于民 - Thousands Find</h2>
  </div>

  <div class="cont-main clearfix">
    <div class="index-tab">
      <div class="index-slide-nav">
        <a href="login" class="active">登录</a>
        <a href="register">注册</a>
        <div class="slide-bar"></div>
      </div>
    </div>

    <div class="login form">
      <div class="group">
        <div class="group-ipt email">
          <input type="text" name="email" id="email" class="ipt" placeholder="邮箱地址" required>
        </div>
        <div class="group-ipt password">
          <input type="password" name="password" id="password" class="ipt" placeholder="输入您的登录密码" required>
        </div>
        <div class="group-ipt verify">
          <input type="text" name="verify" id="verify" class="ipt" placeholder="输入验证码" required>
          <img src="images/a.jpg" class="imgcode">
        </div>
      </div>
    </div>

    <div class="button">
      <button type="submit" class="login-btn register-btn" id="button">登录</button>
    </div>

    <div class="remember clearfix">
      <label class="remember-me"><span class="icon"><span class="zt"></span></span><input type="checkbox" name="remember-me" id="remember-me" class="remember-mecheck" checked>记住我</label>
      <label class="forgot-password">
        <a href="#">忘记密码？</a>
      </label>
    </div>
  </div>
</div>

<div class="footer">
  <p>聚宝坑 - Thousands Find</p>
  <p>Designed By ZengRong & <a href="zrong.me">mycodes.net</a> 2016</p>
</div>

<script src='js/particles.js' type="text/javascript"></script>
<script src='js/background.js' type="text/javascript"></script>
<script src='js/jquery.min.js' type="text/javascript"></script>
<script src='js/layer/layer.js' type="text/javascript"></script>
<script src='js/index.js' type="text/javascript"></script>
<script>
  $('.imgcode').hover(function(){
    layer.tips("看不清？点击更换", '.verify', {
      time: 6000,
      tips: [2, "#3c3c3c"]
    })
  },function(){
    layer.closeAll('tips');
  }).click(function(){
    $(this).attr('src','http://zrong.me/home/index/imgcode?id=' + Math.random());
  });
  $("#remember-me").click(function(){
    var n = document.getElementById("remember-me").checked;
    if(n){
      $(".zt").show();
    }else{
      $(".zt").hide();
    }
  });
</script>
</body>
</html>