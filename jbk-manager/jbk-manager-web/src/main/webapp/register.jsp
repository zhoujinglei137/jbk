<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>注册</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <!-- <link rel="stylesheet/less" type="text/css" href="css/style.less" /> -->
  <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="js/all.js"></script>
  <!--[if IE 6]>
  <script src="./js/iepng.js" type="text/javascript"></script>
  <script type="text/javascript">
    EvPNG.fix('div, ul, img, li, input,span, p');
  </script>
  <![endif]-->
</head>
<body>
<!-- header start -->
<div class="zxcf_top_wper">
  <div class="zxcf_top px1000 clearfix">
    <div class="zxcf_top_l fl">
      <img src="images/zxcf_phone.png" alt="">
      400-027-0101(工作时间9:00-17:30)
      <a href=""><img src="images/zxcf_weixin.png" alt=""></a>
      <a href=""><img src="images/zxcf_sina.png" alt=""></a>
      <a href=""><img src="images/zxcf_qq.png" alt=""></a>
    </div>
    <div class="zxcf_top_r fr">
      <a href="loginjbk.jsp" class="curspan">立即登录</a>
      <span>|</span>
      <a href="register.jsp">免费注册</a>
      <span>|</span>
      <a href="">常见问题</a>
    </div>
  </div>
</div>
<!-- end top -->
<div class="zxcf_nav_wper">
  <div class="zxcf_nav clearfix px1000">
    <div class="zxcf_nav_l fl"><img src="images/zxcf_logo.png" alt=""></div>
    <div class="zxcf_nav_r fr">
      <img src="images/lg_pic01.png" alt="">
		 	<span>
		    <a href="index1.jsp">返回首页</a></span>

    </div>
  </div>
</div>
<!-- end  -->
<div class="reg_con_wper">
  <div class="reg_con px1000">
    <div class="reg_box clearfix">
      <div class="reg_box_l fl">
        <img src="
		   	   	  images/reg_pic01.png" alt="">
      </div>
      <div class="reg_box_r fl">
        <h2 class="lg_sec_tit clearfix">
          <span class="fl">注册</span>
          <em class="fr">已有帐号，<a href="loginjbk.jsp">立即登录</a></em>
        </h2>
        <form method="post" action="registeruser1" onsubmit="return check()">
          <fieldset>
            <p class="mt20">
              <input type="text" name="loginName" id="loginName" placeholder="用户名" class="lg_input01 lg_input" onchange="ln()"><div ><font id="ln" color="red"></font></div>
            </p>
            <p class="mt20">
              <input type="text" name="passWord" id="passWord" placeholder="密码" class="lg_input02 lg_input" onchange="pw1()"><div ><font id="pw1" color="red"></font></div>
            </p>
            <p class="mt20">
              <input type="text" name="passWord1" id="passWord1" placeholder="密码确认" class="lg_input02 lg_input" onchange="pw2()"><div ><font id="pw2" color="red"></font></div>
            </p>
            <p class="mt20">
              <input type="text" name="userName" id="userName" placeholder="姓名" class="lg_input01 lg_input" onchange="un()"><div ><font id="un" color="red"></font></div>
            </p>
            <p class="mt20">
              <input type="text" name="tel1" id="tel1" placeholder="手机号" class="lg_input04 lg_input" onchange="te()"><div ><font id="te" color="red"></font></div>
            </p>
            <p class="mt20">
              <input type="text" name="email" id="email" placeholder="邮箱" class="lg_input03 lg_input" onchange="em()"><div ><font id="em" color="red"></font></div>
            </p>

            <p class="pt10"><a href="">使用条款</a>&nbsp;&nbsp;<a href="">隐私条款</a></p>

            <p class="mt20"> <input type="submit"  value="立即注册" class="lg_btn"></p>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
</div>
<!-- footer start -->
<div class="zscf_aboutus_wper">
  <div class="zscf_aboutus px1000 clearfix">
    <div class="zscf_aboutus_l fl">
      <ul class="zscf_aboutus_lul clearfix">
        <li class="pt10"><a href=""><img src="images/app.png" alt=""></a>
        </li>
        <li>
          <p class="pb20">服务热线</p>
          <strong>XXX-XXX-XXXX</strong>
        </li>
        <li>
          <p class="pb10 linkpic">
            <a href=""><img src="images/ft_sina.png" alt=""></a>
            <a href=""><img src="images/ft_weixin.png" alt=""></a>
            <a href=""><img src="images/ft_erji.png" alt=""></a>
          </p>
          <p><a href="">kefu@jubaokengtouzi.com</a></p>
        </li>
      </ul>
    </div>
    <!-- end left -->
    <div class="zscf_aboutus_r fl clearfix">
      <a href="#" class="fl ft_ewm"><img src="images/ft_erweima.png" alt=""></a>
      <ul class="fl clearfix">
        <li><a href="">联系我们</a></li>
        <li><a href="">我要融资</a></li>
        <li><a href="">帮助中心</a></li>
        <li><a href="">友情链接</a></li>
        <li><a href="">招贤纳士</a></li>
        <li><a href="">收益计算器</a></li>
      </ul>
    </div>
    <!-- end right -->

  </div>
</div>

<div class="zscf_bottom_wper">
  <div class="zscf_bottom px1000 clearfix">
    <p class="fl">© 2014 jubaokengtouzi &nbsp;  &nbsp;&nbsp;   聚宝坑金融信息服务股份有限公司 &nbsp;&nbsp;&nbsp;    鄂ICP备14017254号-1</p>
    <p class="fr">
      <a href=""><img src="images/360.png" alt=""></a>
      <a href=""><img src="images/kexin.png" alt=""></a>
      <a href=""><img src="images/norton.png" alt=""></a>
    </p>
  </div>
</div>
<!-- footer end -->
<script  type="text/javascript">
  var z1 =false;
  var z2 =false;
  var z3 =false;
  var z4 =false;
  var z5 =false;
  var z6 =false;

  function ln(){
    var n = document.getElementById("loginName").value;

    $.post("verify",{name:n},function(result){
       if(result==1){
         document.getElementById("ln").innerHTML="用户名已存在";
         z1=false;
       }else{
         document.getElementById("ln").innerHTML="";
         z1 = true;
       }
    });
  }
  function pw1(){
    var p = document.getElementById("passWord").value;
        if(!/^\w{6,20}$/.test(p)){
          document.getElementById("pw1").innerHTML="密码数量必须在6~20位之间";
          z2=false;
        }else{
          document.getElementById("pw1").innerHTML="";
          z2=true;
        }
  }
  function pw2(){

    var p = document.getElementById("passWord").value;
    var p1 = document.getElementById("passWord1").value;

    if(!(p==p1)){
      document.getElementById("pw2").innerHTML="两次密码输入不同，请重新输入";
      z3=false;
    }else{
      document.getElementById("pw2").innerHTML="";
      z3=true;
    }
  }
  function te(){
    var te = document.getElementById("tel1").value;
    if(!/^1[34578]\d{9}$/.test(te)){
      document.getElementById("te").innerHTML="输入手机格式不正确，请重新输入";
      z4=false;
    }else{
      document.getElementById("te").innerHTML="";
      z4=true;
    }
  }

  function un(){
    var un = document.getElementById("userName").value;
    if(un.length==0){
      document.getElementById("un").innerHTML="未输入姓名，请输入";
      z5=false;
    }else{
      document.getElementById("un").innerHTML="";
      z5=true;
    }
  }

  function em(){
    var em = document.getElementById("email").value;
    var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if(!filter.test(em)){
      document.getElementById("em").innerHTML="邮箱格式不正确，请重新输入";
      z6=false;
    }else{
      document.getElementById("em").innerHTML="";
      z6=true;
    }
  }
function check(){
  if(!z1){
    document.getElementById("ln").innerHTML="未输入用户名，请输入";
  }
  if(!z2){
    document.getElementById("pw1").innerHTML="未输入密码，请输入";
  }
  if(!z3){
    document.getElementById("pw2").innerHTML="未输入密码确认，请输入";
  }
  if(!z4){
    document.getElementById("te").innerHTML="未输入手机号，请输入";
  }
  if(!z5){
    document.getElementById("un").innerHTML="未输入姓名，请输入";
  }
  if(!z6){
    document.getElementById("em").innerHTML="未输入邮箱，请输入";
  }
  if(z1&&z2&&z3&&z4&&z5&&z6){
    return true;
  }
  return false;
}

</script>
</body>
</html>