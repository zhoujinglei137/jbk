<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/jbk/css/main.css">
<link rel="stylesheet" type="text/css" href="/jbk/js/jquery-easyui-1.5/themes/bootstrap/easyui.css">

<!-- 添加银行卡号 start-->
<!--弹出层时背景层DIV-->

<div id="fade" class="goodcover"></div>
<div id="MyDiv" class="white_content">

  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes()">关闭</span>
  </div>

  <%--目前来说，我还是喜欢这个自己改造的弹出层。自己在项目中也用的是这个。--%>
  <div align="center"><font size="5" >添加银行卡</font><br></div>
  <br><br>
  <font size="3"  style="position: relative ;left:60px;">银行卡号</font> &nbsp;&nbsp;<input name="bankcard" style="position: relative ;left:80px;" class="inp"  placeholder=请输入银行卡号">
  <br><br>

  <font size="3" style="position: relative ;left:50px;">预留手机号</font> &nbsp;&nbsp;<input  name="lpassword" type="password" style=" border:1px solid #00ffaa;position: relative ;left:65px;" class="inp"  placeholder="请输入手机号">
  <br>
  <div align="center"><font name="bankcardmessage" color="red"></font></div>

  <div align="center">
    <br>
    <button type="submit" class="bu" onclick="add1()">确认添加</button>
  </div>
  <font color="#FF6600" style="position: relative ;left:60px;" >温馨提示</font>
  <div style="position: relative ;left:80px;">1. 请确保银行卡的准确性;</div>
  <div style="position: relative ;left:80px;">2. 请确保添加时，是本人操作</div>
</div>
<!-- 添加银行卡号 end-->

<!-- 更换绑定邮箱start-->
<div id="fade2" class="goodcover"></div>
<div id="MyDiv2" class="white_content">
  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes2()">关闭</span>
  </div>

  <div >

        <div align="center"><font size="5" >邮箱绑定</font><br></div>
         <br><br>
       <font size="3" style="position: relative ;left:50px;">邮箱地址</font> &nbsp;&nbsp;</font><input style="position: relative ;left:65px;" class="inp" name="email"  placeholder="邮箱地址">
        <br><br>

      <font size="3" style="position: relative ;left:60px;">验证码</font> &nbsp;&nbsp;</font><input style="position: relative ;left:80px;" class="inp" name="send_"  placeholder="六位验证码">
       <div align="center"><font name="mailmessage" color="red"></font></div>

    <div align="center">
    <br>
    <input type="button"  class="bu" onclick="send2()"  value="获取验证码">
    <br>
    <button type="submit" class="bu" onclick="add2()" >确认修改</button>

    </div>
    <br>
    <font color="#FF6600" style="position: relative ;left:50px;" >温馨提示</font>
    <div style="position: relative ;left:60px;">1. 请确保邮箱地址的真实性，否则无法接收验证邮件;</div>
    <div style="position: relative ;left:60px;">2. 如果长时间没收到邮件，请查看垃圾箱。</div>

</div>
</div>
<!-- 更换绑定邮箱 end-->


<!-- 添加银行卡号 start-->
<!--弹出层时背景层DIV-->

<div id="fade3" class="goodcover"></div>
<div id="MyDiv3" class="white_content">

  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes3()">关闭</span>
  </div>

  <%--目前来说，我还是喜欢这个自己改造的弹出层。自己在项目中也用的是这个。--%>
  <div align="center"><font size="5" >添加交易密码</font><br></div>
  <br><br>
  <font size="3" style="position: relative ;left:60px;">交易密码</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp"  placeholder="请输入交易密码">
  <br><br>
  <font size="3" style="position: relative ;left:60px;">请在输入</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp"  placeholder="请输入再次输入密码">
  <br><br>
  <font size="3" style="position: relative ;left:60px;">登录密码</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp"  placeholder="请输入登录密码">

  <div align="center">
    <br>
    <button type="submit" class="bu" >确认添加</button>
  </div>
  <font color="#FF6600" style="position: relative ;left:60px;" >温馨提示</font>
  <div style="position: relative ;left:80px;">1. 请确保添加时，是本人操作</div>
</div>
<!-- 添加银行卡号 end-->



<!-- 修改密码 start-->
<!--弹出层时背景层DIV-->

<div id="fade4" class="goodcover"></div>
<div id="MyDiv4" class="white_content">

  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes4()">关闭</span>
  </div>

  <%--目前来说，我还是喜欢这个自己改造的弹出层。自己在项目中也用的是这个。--%>
  <div align="center"><font size="5" >更改登录密码</font><br></div>
  <br><br>
  <font size="3" style="position: relative ;left:60px;">原密码</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp" id="pw1"  placeholder="请输入原密码">
  <br><br>
  <font size="3" style="position: relative ;left:60px;">新密码</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp" id="pw2" placeholder="请输入新密码">
  <br><br>
  <font size="3" style="position: relative ;left:50px;">再次输入</font> &nbsp;&nbsp;<input style="position: relative ;left:65px;" class="inp" id="pw3" onchange="pw3();" placeholder="请再次输入新密码">
  <div align="center"><font name="pwmessage" color="red"></font></div>
  <div align="center">
    <br>
    <button type="submit" class="bu" onclick="add4()">确认修改</button>
  </div>
  <font color="#FF6600" style="position: relative ;left:60px;" >温馨提示</font>
  <div style="position: relative ;left:80px;">1. 请确保修改密码时，是本人操作</div>
</div>
<!-- 更改登录密码 end-->

<!-- 修改手机号码 start-->
<!--弹出层时背景层DIV-->

<div id="fade5" class="goodcover"></div>
<div id="MyDiv5" class="white_content">

  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes5()">关闭</span>
  </div>

  <%--目前来说，我还是喜欢这个自己改造的弹出层。自己在项目中也用的是这个。--%>
  <div align="center"><font size="5" >更改手机号码</font><br></div>
  <br><br>
  <font size="3" style="position: relative ;left:60px;">原手机号</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" id="tp1" class="inp"  placeholder="请输入原手机号">
  <br><br>
  <font size="3" style="position: relative ;left:60px;">新手机号</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" id="tp2" class="inp"  placeholder="请输入新手机号">
  <div align="center"><font name="telmessage" color="red"></font></div>
  <div align="center">
    <br>
    <button type="submit" class="bu" onclick="add5()">确认修改</button>
  </div>
  <font color="#FF6600" style="position: relative ;left:60px;" >温馨提示</font>
  <div style="position: relative ;left:80px;">1. 请确保修改手机号时，是本人操作</div>
</div>
<!-- 更改手机号码 end-->


<!-- 完善身份信息 start-->
<!--弹出层时背景层DIV-->

<div id="fade6" class="goodcover"></div>
<div id="MyDiv6" class="white_content">


  <div style="text-align: right; cursor: default; height: 40px;">
    <span style="font-size: 16px;" onclick="closes6()">关闭</span>
  </div>

  <%--目前来说，我还是喜欢这个自己改造的弹出层。自己在项目中也用的是这个。--%>
  <div align="center"><font size="5" >完善信息</font><br></div>
  <br><br>
  <font size="3" style="position: relative ;left:60px;">身份证号</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp" name="cardid"  placeholder="请输入身份证号">
  <br><br>
  <font size="3" style="position: relative ;left:60px;">座机电话</font> &nbsp;&nbsp;<input style="position: relative ;left:80px;" class="inp" name="phone"  placeholder="请输入座机号码">
  <br><br>
  <p style="position: relative ;left:60px;"><font size="3" >身份证号</font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input  style="position: relative ;left:80px;" name="date" labelPosition="top" class="easyui-datebox" ></p>
  </p>
  <div align="center"><font name="cardmessage" color="red"></font></div>
  <div align="center">
    <br>
    <button type="submit" class="bu" onclick="add6();">确认修改</button>
  </div>
  <font color="#FF6600" style="position: relative ;left:60px;" >温馨提示</font>
  <div style="position: relative ;left:80px;">1. 请确完善信息时，是安全的</div>
</div>
<!-- 完善身份信息 end-->