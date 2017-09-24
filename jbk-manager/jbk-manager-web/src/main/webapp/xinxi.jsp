<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/13
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<!-- saved from url=(0062)https://www.limin.com/pages/account/account_setting.html?page= -->
<html lang="zh"><!--<![endif]--><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <title>账户设置</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta http-equiv="X-UA-Compatible" content="chrome=1">
  <meta name="keywords" content="">
  <meta name="description" content="">

  <link rel="stylesheet" type="text/css" href="css/account_setting.html_aio_cda55d4.css">
  <link rel="stylesheet" href="css/static_merge.css">

  <link rel="stylesheet" type="text/css" href="css/register-login.css">

  <link rel="stylesheet" type="text/css" href="css/mycss.css">
  <link rel="stylesheet" type="text/css" href="css/main.css">

  <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
  <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">

  <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
  <script type="text/javascript" src="js/myjs.js"></script>

  <!-- jquery -->
  <script src="js/jquery-easyui-1.5/jquery.min.js"></script>
  <!-- jquery easyui -->
  <script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
  <script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>

  <body>
<jsp:include page="top_xinxi.jsp"/>
<div class="wraper">


  <!-- 页面头部开始-->
  <div id="header"><div class="header-top">
    <div class="inner">
      <div class="left over-hidden">
        <p class="kefu-wraper"><span class="icon kefu-icon"></span>客服热线 <strong>4008-318-999</strong></p><p class="qxgqdm"><a href="javascript:;"></a></p>
      </div>
      <div class="right" style="position:relative;">
        <ul class="header-top-nav">
          <li class="icon-wechat-wraper">
            <a class="wechat_c"><span class="icon icon-wechat"></span>微信理财</a>
            <div class="qrcode-dropdown icon-wechat_hover"></div>
          </li>
          <li class="icon-phone-wraper">
            <a class="phone_c"><span class="icon icon-phone"></span>APP下载</a>
            <div class="qrcode-dropdown icon-phone_hover"></div>
          </li>
          <li><a href="https://www.limin.com/pages/profit/platform.html" class="Jgo">关于利民</a></li>
          <li><a href="https://www.limin.com/pages/profit/operate.html" class="Jgo">平台数据</a></li>
          <!--<li><a href="/activity/cpl_process/cpl_clous/pc/index.html" class="Jgo">合规进程</a></li>-->
          <li><a class="Jgo" href="https://www.limin.com/pages/help_center/help_center.html">帮助中心</a></li>
        </ul>
      </div>
      <div style="clear:both;"></div>
    </div>
  </div>
    <div class="inner header-nav-wraper">
      <div class="left logo">
        <a href="https://www.limin.com/index.html" class="ui-logo"></a>
      </div>
      <div class="right over-hidden_a">

        <ul class="left nav over-hidden header-nav-list" id="headerNavList">
          <li class=""><a href="https://www.limin.com/index.html" class="Jgo">首页</a></li>
          <li><a href="https://www.limin.com/pages/product/list.html?type=product&amp;id=1000" class="Jgo">理财产品</a></li>
          <li><a href="https://www.limin.com/pages/product/list.html?type=transfer&amp;id=2000" class="Jgo">转让专区</a></li>
          <li><a href="https://www.limin.com/activity/vip_activity/pc/index.html" class="Jgo">会员中心</a></li>

        </ul>
        <div class="right over-hidden header-button hide" id="headerButton" style="display: none;">
          <p class="signup-wrap"><a id="headerRegister" class="button Jgo" href="https://www.limin.com/pages/login/register.html">注册</a>
          </p>
          <p class="signin-wrap" style="margin-left:20px;">
            <a id="headerLogin" class="header_button_login Jgo" href="https://www.limin.com/pages/login/login.html">登录</a></p>
        </div>
        <div class="right member-menu hide" id="memberMenu" style="display: block;">
          <div class="header">
            <div class="ground_tips hide" id="memberMask_ground" style="display: block;"></div>
            <a href="https://www.limin.com/pages/member/account.html" class="Jgo">我的利民</a>
          </div>
          <dl class="member-dropdown-menu" id="memberMask">
            <dd><a href="https://www.limin.com/pages/member/invest.html" class="Jgo">我的投资</a></dd>
            <dd><a href="https://www.limin.com/pages/credit/credit.html" class="Jgo">债权转让</a></dd>
            <dd><a href="https://www.limin.com/pages/autoInvest/auto_invest.html" class="Jgo">自动投标</a></dd>
            <dd><a href="https://www.limin.com/pages/member/recommend.html" class="Jgo">推荐奖励</a></dd>
            <dd><a href="https://www.limin.com/pages/member/redandgift.html" class="Jgo">我的礼券</a><div class="rig-pop" id="couponNum">7</div></dd>
            <!--<dd><a href="/activity/vip_activity/pc/index.html" class="Jgo">会员中心</a></dd>-->
            <dd><a href="https://www.limin.com/pages/account/account_setting.html" class="Jgo">账户设置</a></dd>
            <dd><a href="https://www.limin.com/pages/member/message.html" class="Jgo">消息中心</a><div class="rig-pop" id="messageNum">7</div></dd>
            <dd class="last"><a href="javascript:void(0);" id="logout">安全退出</a></dd>
          </dl>
        </div>
        <div class="clear"></div>
      </div>
      <div class="clear"></div>
    </div>
  </div>
  <div class="main_v">
    <!------------左边开始---------------->
    <div class="breadcrumb">
      您现在的位置：<a href="https://www.limin.com/index.html">首页</a> &gt; <a href="https://www.limin.com/pages/member/account.html">个人中心</a> &gt;
      <strong>账户设置</strong>
    </div>
    <div class="account_left J_left_menus" id="J_left_menus"><dl>
      <!-- a里面添加class命名为cur为当前页面状态的样式 -->
      <dt class="Jgo "><a href="https://www.limin.com/pages/member/account.html" class="">账户概览</a> </dt>
      <dd class="Jgo "><a href="https://www.limin.com/pages/member/invest.html" class="">我的投资</a> </dd>
      <dd class="Jgo "><a href="https://www.limin.com/pages/credit/credit.html" class="">债权转让</a> </dd>
      <dd class="Jgo "><a href="https://www.limin.com/pages/autoInvest/auto_invest.html" class="">自动投标</a> </dd>
      <dd class="Jgo "><a href="https://www.limin.com/pages/member/recommend.html" class="">推荐奖励</a> </dd>
      <dd class="Jgo "><a href="https://www.limin.com/pages/member/redandgift.html" class="">我的礼券</a> <span class="menu-tips">7</span></dd>
      <dd class="Jgo "><a href="https://www.limin.com/pages/account/account_setting.html" class=" cur">账户设置</a> </dd>
      <dd class="Jgo last"><a href="https://www.limin.com/pages/member/message.html" class="">消息中心</a> <span class="menu-tips">7</span></dd>
    </dl></div>
    <!------左侧结束-------->
    <div class="email-right">
      <div class="email-person hide" style="display: block;">
        <div class="email-person-l"> <a href="javascript:;" class="ui-user-av"><img src="images/ico/ic_my_head.png"></a>
          <div class="message"> <p>尊敬的 <em></em></p> <p class="tel">186****4630</p> <p class="time">注册时间：2017-09-01 22:06:48</p> </div> </div>
          <div class="email-person-r"> <p>安全等级：<i data-level="0">弱</i></p> <div class="process gray_line"> <span class="blue_line" style="width: 66.333%;"></span> </div> </div> </div>
      <div id="main_wrap" class="email-list-wrap">
        <div id="main" class="email-list hide" style="display: block;">

      <%-- 用户的信息完善--%>
          <div class="email-list-item">
            <div class="email-list-item-l">
              <div class="pic">
                <img src="images/ico/ic_my_acc_name.png">
                <p>完善信息</p>
              </div>
            <c:choose>
              <c:when test="${user.cardId ==null || user.birthday == null || user.tel2 == null}">
              <div class="text">
                <p id="card">身份信息：<em>未完善</em></p>
                <p>完成实名认证，账户更安全理财更放心</p>
              </div>
            </div>
            <div class="email-list-item-r" id="card-bind">
              <span>未认证</span>
                 <a href="#" id="verify_name" data-action="cg_open" onclick="show6()">立即完善</a>
            </div>
            </c:when>

            <c:otherwise>
            <div class="text">
              <p id="card1">身份信息：<em>已完善</em></p>
              <p>完成实名认证，账户更安全理财更放心</p>
            </div>
          </div>
          <div class="email-list-item-r">
            <span style="background: url(images/ico/ic_my_sec_on.png)">已绑定</span>
            <a class="pw-set" href="#" onclick="show6()">修改</a>
          </div>

            </c:otherwise>
            </c:choose>
          </div>
        <%-- 手机的绑定与修改 --%>
          <div class="email-list-item">
            <div class="email-list-item-l">
              <div class="pic">
                <img src="images/ico/ic_my_acc_phone.png">
                <p>绑定手机</p>
              </div>
              <div class="text" id=" tel-bind">
                <p>您绑定的手机号码：<em>186****4630</em></p>
              </div>
            </div>
            <div class="email-list-item-r">
              <span style="background: url(images/ico/ic_my_sec_on.png)">已绑定</span>
              <a class="pw-set" href="#" onclick="show5()">修改</a>
            </div>
          </div>


          <div class="email-list-item">
            <div class="email-list-item-l">
              <div class="pic">
                <img src="images/ico/ic_my_acc_dealpw.png">
                <p>登录密码</p>
              </div>
              <div class="text safe left" id="ps-safe">
                <p class="left">安全强度</p>
                <span class="range left status2"><!--status123--></span>
                <em>中</em>
              </div>
            </div>
            <div class="email-list-item-r reset">
              <span style="background: url(images/ico/ic_my_sec_on.png)">已设置</span>
             <a href="#" class="pw-set"  onclick="show4()">修改</a>
            </div>
          </div>

         <%-- <div class="email-list-item">
            <div class="email-list-item-l">
              <div class="pic">
                <img src="images/ico/ic_my_acc_loginpw.png">
                <p>交易密码</p>
              </div>
              <div class="text safe left pw-trade">
                <p class="left">您还没有设置交易密码</p>
              </div>
            </div>
            <div class="email-list-item-r reset pw-trade-b setting-handler">
              <span id="set" class="remove">未设置</span>
              <a href="#" id="now-set" onclick="show3()">立即设置</a>
            </div>
          </div>--%>
        <%-- 银行卡的绑定与修改 --%>
          <div class="email-list-item">
            <div class="email-list-item-l">
              <div class="pic">
                <img src="images/ico/ic_my_acc_card.png">
                <p>绑定银行卡</p>
              </div>

            <c:choose>
              <c:when test="${bank.cardId == null}">
              <div class="text left bank-bind">
                <p class="left lh-40">您还没有绑定银行卡</p>
              </div>
            </div>
            <div class="email-list-item-r reset back-status setting-handler">
              <span>未绑定</span>
              <a href="#" id="bind_bank" onclick="show()">立即绑定</a>
            </div>
            </c:when>
            <c:otherwise>
            <div class="text left bank-bind">
              <p class="left lh-40">您已绑定银行卡</p>
            </div>
          </div>
          <div class="email-list-item-r reset">
            <span style="background: url(images/ico/ic_my_sec_on.png)">已设置</span>
            <a href="#" class="pw-set"  onclick="show()">修改</a>
          </div>
            </c:otherwise>
            </c:choose>
          </div>
      <%-- 邮箱的绑定与修改 --%>
          <div class="email-list-item">
            <div class="email-list-item-l">
              <div class="pic">
                <img src="images/ico/ic_my_acc_mail.png">
                <p>绑定邮箱</p>
              </div>
              <div class="text " id="email-num">
                <p>您绑定的邮箱：<em>已绑定</em></p>
                <p>及时获取账户资金变动通知和投资讯息</p>
              </div>
            </div>
            <div class="email-list-item-r reset">
              <span style="background: url(images/ico/ic_my_sec_on.png)">已设置</span>
              <a class="pw-set" href="#" onclick="show2()">修改</a>
            </div>
          </div>


        </div>
      </div>
    </div>

  </div>

</div>
</body>
<script>

  //银行卡修改
  function show(){
    bg.ShowDiv('MyDiv','fade');
  }
  function closes(){

    bg.CloseDiv('MyDiv','fade');
    document.getElementsByName("bankcardmessage")[0].innerHTML = "";
  }

  //邮箱修改
  function show2(){
    bg.ShowDiv('MyDiv2','fade2');
  }
  function closes2(){
    bg.CloseDiv('MyDiv2','fade2')
    document.getElementsByName("mailmessage")[0].innerHTML = "";

  }
  //创建交易密码
  function show3(){
    bg.ShowDiv('MyDiv3','fade3');
  }
  function closes3(){
    bg.CloseDiv('MyDiv3','fade3')

  }
  //更改登录密码
  function show4(){
    bg.ShowDiv('MyDiv4','fade4');
  }
  function closes4(){

    bg.CloseDiv('MyDiv4','fade4')
    document.getElementsByName("pwmessage")[0].innerHTML = "";
  }
  //更改手机号码
  function show5(){

    bg.ShowDiv('MyDiv5','fade5');

  }
  function closes5(){
    bg.CloseDiv('MyDiv5','fade5')
    document.getElementsByName("telmessage")[0].innerHTML = "";
  }

  //完善用户信息
  function show6(){
    bg.ShowDiv('MyDiv6','fade6');
  }
  function closes6(){
    bg.CloseDiv('MyDiv6','fade6')
    document.getElementsByName("cardmessage")[0].innerHTML = "";
  }

  //添加银行卡
  function add1(){
    var b1 = false;
    var bankard = document.getElementsByName("bankcard")[0].value;
    var lpassword = document.getElementsByName("lpassword")[0].value;

    if(bankard.length==0 || lpassword.length == 0){
        document.getElementsByName("bankcardmessage")[0].innerHTML = "请输入银行卡号,以及手机号";
    }else{
      document.getElementsByName("bankcardmessage")[0].innerHTML = "";
      var b1 = true;
    }
    if(b1){
    $.ajax({
      url: 'addbank',
      type: 'post',
      async: false,
      data: {
        'cardId':bankard,
        'tel1':lpassword,
      },
      success: function(data){

        if(data>0){
          window.location.reload()
        }else{
          document.getElementsByName("bankcardmessage")[0].innerHTML = "手机号预留错误";
        }
        //console.log(data);
        //window.location.href = 'login';
      }
    });
    }
  }

  //更改登录密码
  var tong = false;
  function pw3(){


    var pw2 = document.getElementById("pw2").value;
    var pw3 = document.getElementById("pw3").value;
    alert(pw2+"==="+pw3)
    if(pw2 != pw3){
      document.getElementsByName("pwmessage")[0].innerHTML = "两次密码输入不相同";
    }else{
      document.getElementsByName("pwmessage")[0].innerHTML = "";
      tong = true;
    }
  }
  function add4(){
    var b1 = false;
    var pw1 = document.getElementById("pw1").value;
    var pw2 = document.getElementById("pw2").value;
    var pw3 = document.getElementById("pw3").value;

    if(pw1.length==0 || pw2.length == 0 || pw3.length==0){
      document.getElementsByName("pwmessage")[0].innerHTML = "请输入原密码,以及密码";
    }else if(pw2 != pw3){
      document.getElementsByName("pwmessage")[0].innerHTML = "两次密码输入不相同";
    }else{
      document.getElementsByName("pwmessage")[0].innerHTML = "";
      var b1 = true;
    }
    if(b1 && tong){
      $.ajax({
        url: 'updateLogin',
        type: 'post',
        async: false,
        data: {
          'pw1':pw1,
          'pw2':pw2,
        },
        success: function(data){
          if(data>0){
            window.location.reload()
          }else{
            document.getElementsByName("pwmessage")[0].innerHTML = "原密码错误，请重新输入";
          }
          //console.log(data);
          //window.location.href = 'login';
        }
      });
    }
  }

  //更改手机号
  function add5(){
    var b1 = false;
    var tp1 = document.getElementById("tp1").value;
    var tp2 = document.getElementById("tp2").value;

    if(tp1.length==0 || tp2.length == 0 ){
      document.getElementsByName("telmessage")[0].innerHTML = "请将信息，填写完毕";
    }else{
      document.getElementsByName("telmessage")[0].innerHTML = "";
      var b1 = true;
    }
    if(b1){
      $.ajax({
        url: 'updatetal',
        type: 'post',
        async: false,
        data: {
          'tp1':tp1,
          'tp2':tp2,
        },
        success: function(data){
          if(data>0){
            window.location.reload()
          }else{
            document.getElementsByName("telmessage")[0].innerHTML = "原手机号错误错误，请重新输入";
          }
          //console.log(data);
          //window.location.href = 'login';
        }
      });
    }
  }

  //完善个人信息
  function add6(){
    var b1 = false;
    var cardid = document.getElementsByName("cardid")[0].value;
    var phone = document.getElementsByName("phone")[0].value;
    var date = document.getElementsByName("date")[0].value;


    if(tp1.length==0 || tp2.length == 0 ){
      document.getElementsByName("cardmessage")[0].innerHTML = "请将信息，填写完毕";
    }else{
      document.getElementsByName("cardmessage")[0].innerHTML = "";
      var b1 = true;
    }
    if(b1){
      $.ajax({
        url: 'updateuser',
        type: 'post',
        async: false,
        data: {
          'cardid':cardid,
          'phone':phone,
          'date':date,
        },
        success: function(data){
          if(data>0){
            window.location.reload()
          }else{
            document.getElementsByName("telmessage")[0].innerHTML = "信息保存失败";
          }
          //console.log(data);
          //window.location.href = 'login';
        }
      });
    }
  }


  var s2 = "";
function send2(){
  $.ajax({
    url: 'send_email',
    type: 'post',
    async: false,
    data: {
      asd:"asd",
    },
    success: function(data){
      if(data>0){
        alert(data);
        s2 = data;
      }else{
       /* document.getElementsByName("telmessage")[0].innerHTML = "信息保存失败";*/
      }
      //console.log(data);
      //window.location.href = 'login';
    }
  })
}


  function add2(){
    var b1 = false;
    var email = document.getElementsByName("email")[0].value;
    var send_ = document.getElementsByName("send_")[0].value;

    if(email.length==0 || send_.length == 0 ){
      document.getElementsByName("mailmessage")[0].innerHTML = "请将信息，填写完毕";
    }else{
      document.getElementsByName("mailmessage")[0].innerHTML = "";
      var b1 = true;
    }
    alert(send_+"==="+s2);
    if(b1){
      if(send_ == s2){
        $.ajax({
          url: 'update_email',
          type: 'post',
          async: false,
          data: {
            'email':email,

          },
          success: function(data){
            if(data>0){
              window.location.reload()
            }else{
              document.getElementsByName("mailmessage")[0].innerHTML = "";
            }
            //console.log(data);
            //window.location.href = 'login';
          }
        });
      }else{
        document.getElementsByName("mailmessage")[0].innerHTML = "验证码错误";
      }


    }
  }
</script>
</html>



