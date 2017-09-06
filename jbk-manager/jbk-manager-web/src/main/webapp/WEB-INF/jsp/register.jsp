<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>注册 - 聚宝坑 - Thousands Find</title>
  <meta author="zrong.me 曾荣">
  <link rel="stylesheet" type="text/css" href="css/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box register-box">
  <div class="cent-box-header">
    <h1 class="main-title hide">聚宝坑</h1>
    <h2 class="sub-title">生活守与信利于民 - Thousands Find</h2>
  </div>

  <div class="cont-main clearfix">
    <div class="index-tab">
      <div class="index-slide-nav">
        <a href="login">登录</a>
        <a href="register" class="active">注册</a>
        <div class="slide-bar slide-bar1"></div>
      </div>
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
        <div class="group-ipt verify">
          <input type="text" name="verify" id="verify" class="ipt" placeholder="输入验证码" required>
          <img src="images/a.jpg" class="imgcode">
        </div>
      </div>
    </div>

    <div class="button">
      <button type="submit" class="login-btn register-btn" id="button">注册</button>
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
  })

  $(".login-btn").click(function(){

    var userName = $('#userName').val();
    var loginName = $('#loginName').val();
    var email = $("#email").val();
    var password = $("#passWord").val();
    var verify = $("#verify").val();
     $.ajax({
     url: 'registeruser',
       type: 'post',
     async: false,
     data: {
        'userName':userName,
        'loginName':loginName,
     	'email':email,
     	'passWord':password,
     	'verify':verify
     },
     success: function(data){
       console.log(data);
//     	info = data.status;
//       alert(info);
//     	layer.msg(info);
       window.location.href = 'login';
     }
     })

  })
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