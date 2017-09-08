<%--
  Created by IntelliJ IDEA.
  User: administrator
  Date: 2017/9/6 0006
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>聚宝坑</title>
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
      600-820-8820(工作时间9:00-17:30)
      <a href=""><img src="images/zxcf_weixin.png" alt=""></a>
      <a href=""><img src="images/zxcf_sina.png" alt=""></a>
      <a href=""><img src="images/zxcf_qq.png" alt=""></a>
    </div>
    <div class="zxcf_top_r fr">
      <a href="" class="curspan">立即登录</a>
      <span>|</span>
      <a href="">免费注册</a>
      <span>|</span>
      <a href="">常见问题</a>
    </div>
  </div>
</div>
<!-- end top -->
<div class="zxcf_nav_wper">
  <div class="zxcf_nav clearfix px1000">
    <div class="zxcf_nav_l fl"><img src="images/jbk2.png" alt="">&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/zxcf_logo.png"></div>
    <div class="zxcf_nav_r fr">
      <img src="images/zxcf_perinfo.png" alt="">
		 	<span>我的账户
		 	<img src="images/zxcf_icon01.png" alt=""></span>
      <ul class="zxcf_perinfo" style="display:none;">
        <li><a href="">111</a></li>
        <li><a href="">111</a></li>
        <li><a href="">111</a></li>
      </ul>
    </div>
  </div>
</div>
<div class="zxcf_menu_wper">
  <div class="zxcf_menu px1000">
    <a href="" class="zm_cura">首页</a>
    <a href="">理财产品</a>
    <a href="">转让专区</a>
    <a href="">实时财务</a>
    <a href="" style="margin-right:0;">关于我们</a>
  </div>
</div>
<!-- end  -->
<div class="zscf_banner_wper">
  <div class="zscf_banner px1000">
    <div class="zscf_box">
      <p>累计成交：<strong>12亿2332万元</strong></p>
      <p>运营时间：<strong>123天</strong></p>
      <p><strong>24</strong>小时成功转让率<strong>12.12%</strong></p>
      <a href="" class="btn btn1">立即登录</a><br>
      <a href="" class="btn btn2">立即注册</a>
    </div>
  </div>
</div>
<!-- end banner -->
<div class="zscf_con_wper pb30">
  <div class="zscf_con px1000">
    <div class="zscf_block1 mt30 ">
      <h2 class="zscf_block1_tit clearfix"><span class="fl"><strong>发标预告</strong>十一来啦~\(≧▽≦)/~啦啦啦，小宝送福利，现在投资，坐等拿钱</span><a href="" class="fr">查看更多>></a></h2>
      <div class="clearfix clear">
        <ul class="zscf_block1_text clearfix fl">
          <li>
            <span class="block1_libg01">已加入聚宝坑</span>
            <br>
            <em><strong>123123</strong>人</em>
          </li>
          <li>
            <span class="block1_libg02">已加入聚宝坑</span>
            <br>
            <em><strong>123123</strong>人</em>
          </li>
          <li>
            <span class="block1_libg03">已加入聚宝坑</span>
            <br>
            <em><strong>123123</strong>人</em>
          </li>
        </ul>
        <!-- end l -->
        <div class="block1_r fl">
          <h2 class="block1_r_tit clearfix"><span>网站公告</span><a href="#">+</a></h2>
          <ul>
            <li><span>关于新手体验</span><em>06-19</em></li>
            <li><span>关于新手体验</span><em>06-19</em></li>
            <li><span>关于新手体验</span><em>06-19</em></li>
            <li><span>关于新手体验</span><em>06-19</em></li>

          </ul>
        </div>
      </div>
    </div>

    <!-- end block1 -->
    <c:forEach items="${noobs}" var="noob" varStatus="i">
    <div class="zscf_block2 mt30 clearfix ">
      <div class="zscf_block2_l fl">
        <div class="block2_biao clearfix">
          <div class="clearfix">
            <span class="fl">${noob.productClass.productClassName}【${noob.productName}】</span>
            <div class="block2_biao_r fr">
              <div class="tjxm_jindu ">

                <div class="press_wper fl">
                  <div class="press">

                  </div>
                </div>
                <span class="fl">11%</span>
              </div>
            </div>
          </div>
          <ul class="clearfix clear block2_biao_ul">
            <li>起投资金：<em>${noob.startLimit}元</em></li>
            <li><img src="images/bao.png" alt="">年化收益：<strong>${noob.yearYield}<i>%</i></strong>
            </li>
            <li>
              产品期限：<span>${noob.investDeadline}天</span>
            </li>
            <li>
              剩余额度：<span>${noob.getlimit}元</span>
            </li>
            <li>
              <a href="" class="invest_btn">立即投资</a>
            </li>
          </ul>
        </div>
    </c:forEach>
      <!-- end left -->
      <div class="zscf_block2_r fl">
        <div class="block2_r_video">
          <!-- <img src="images/video.png" alt=""> -->
          <embed src="" type="" width="250px;" height="180px;">
        </div>
        <div class="block2_r_tip">1分钟让你了解聚宝坑</div>
      </div>
      <!-- end right -->
    </div>
    <!--  end block2 -->
    <c:forEach items="${products}" var="product">
      <div class="zscf_block3 mt30 ">
        <h2 class="block3_tit clearfix"><span class="block3_curspan">理财产品</span><em><img src="images/shu.png" alt=""></em><span>债权转让</span><a href="">更多></a></h2>
        <div class="block3_pro_box clear">
          <div class="block3_prolist">

            <div class="block3_proone clearfix clear">
              <span class="fl proone_left"><img src="images/xin.png" alt=""></span>
              <!--  -->
              <div class="fl proone_center">
                <div class="clearfix">
                  <span class="fl proone_center_span1">${product.productClass.productClassName}【${product.productName}】</span>
                  <div class="block2_biao_r fr">
                    <div class="tjxm_jindu ">

                      <div class="press_wper fl">
                        <div class="press">

                        </div>
                      </div>
                      <span class="fl">11%</span>
                    </div>
                  </div>
                </div>
                <ul class="clearfix proone_center_ul clear pt10">
                  <li>预计年化收益:<span>${product.yearYield}%</span></li>
                  <li>投资期限:<span>${product.investDeadline}个月</span></li>
                  <li>项目金额：<span>${product.itemlimit}</span></li>
                </ul>
              </div>
              <!--  -->
              <a href="" class="block3_btn fl">立即投资</a>
            </div>
          <!-- end 项目列表 -->
          <div class="block3_prolist" style="display:none;">
            2
          </div>
        </div>
      </div>

    </c:forEach>

    <!-- end block3 -->
    <div class="zscf_block4 mt30">
      <img src="images/block4_adver.png">
    </div>
    <!-- end block4 -->
    <div class="zscf_block5 mt30 clearfix">
      <div class="zscf_block5_l fl mr20">
        <h2 class="block3_tit clearfix block5_l_tit"><span class="block3_curspan news_span">行业动态</span><em><img src="images/shu.png" alt=""></em><span class="news_span">媒体报道</span><a href="">更多></a></h2>
        <div class="block5_box">

          <ul class="news_ul">
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
          </ul>
          <ul class="news_ul" style="display:none;">
            <li><a href="">6月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
            <li><a href="">5月组团推荐排行榜</a></li>
          </ul>
        </div>
      </div>
      <div class="zscf_block5_r fl">
        <h2 class="block5_r_tit clearfix"><span class="fl ">投资排行榜</span><em class="fr block5_r_tit_em"><a href="javascript:;" class="brt_acur">月排行</a><a href="javascript:;">周排行</a><a href="javascript:;">总排行</a></em></h2>
        <div class="rank_box">
          <div class="rank_list">
            <ul class="rank_list_ul">
              <li>
                <em class="rank_bg01">1</em>
                <a href="">llsdfasd</a>
                <span>￥132423</span>
                <span>99</span>
                <span>1233%</span>
              </li>
              <li>
                <em class="rank_bg02">1</em>
                <a href="">llsdfasd</a>
                <span>￥132423</span>
                <span>99</span>
                <span>1233%</span>
              </li>
              <li>
                <em class="rank_bg03">1</em>
                <a href="">llsdfasd</a>
                <span>￥132423</span>
                <span>99</span>
                <span>1233%</span>
              </li>

              <li>
                <em class="rank_bg04">1</em>
                <a href="">llsdfasd</a>
                <span>￥132423</span>
                <span>99</span>
                <span>1233%</span>
              </li>

              <li>
                <em class="rank_bg04">1</em>
                <a href="">llsdfasd</a>
                <span>￥132423</span>
                <span>99</span>
                <span>1233%</span>
              </li>


            </ul>
          </div>
          <!-- end -->
          <div class="rank_list" style="display:none;">
            2
          </div>
          <!-- end -->
          <div class="rank_list" style="display:none;">
            3
          </div>
          <!-- end -->
        </div>
      </div>
    </div>
    <!-- end block5 -->
    <div class="zscf_partner mt30">
      <h2 class="block3_tit clearfix "><span class="block3_curspan">合作伙伴</span></h2>
      <div class="partner_con">
        <div id="demo">
          <div id="indemo">
            <div id="demo1">
              <a href="#"><img src="images/ifri01.png" border="0" /></a>
              <a href="#"><img src="images/ifri01.png" border="0" /></a>
              <a href="#"><img src="images/ifri01.png" border="0" /></a>
              <a href="#"><img src="images/ifri01.png" border="0" /></a>
              <a href="#"><img src="images/ifri01.png" border="0" /></a>
              <a href="#"><img src="images/ifri01.png" border="0" /></a>
            </div>
            <div id="demo2"></div>
          </div>
        </div>
        <script>
          <!--
          var speed=10;
          var tab=document.getElementById("demo");
          var tab1=document.getElementById("demo1");
          var tab2=document.getElementById("demo2");
          tab2.innerHTML=tab1.innerHTML;
          function Marquee(){
            if(tab2.offsetWidth-tab.scrollLeft<=0)
              tab.scrollLeft-=tab1.offsetWidth
            else{
              tab.scrollLeft++;
            }
          }
          var MyMar=setInterval(Marquee,speed);
          tab.onmouseover=function() {clearInterval(MyMar)};
          tab.onmouseout=function()  {MyMar=setInterval(Marquee,speed)};
          -->
        </script>

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
          <strong>400-027-0101</strong>
        </li>
        <li>
          <p class="pb10 linkpic">
            <a href=""><img src="images/ft_sina.png" alt=""></a>
            <a href=""><img src="images/ft_weixin.png" alt=""></a>
            <a href=""><img src="images/ft_erji.png" alt=""></a>
          </p>
          <p><a href="">kefu@zhongxincaifu.com</a></p>
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
      </ul>
    </div>
    <!-- end right -->

  </div>
</div>

<div class="zscf_bottom_wper">
  <div class="zscf_bottom px1000 clearfix">
    <p class="fl">© 2014 zhongxincaifu &nbsp;  &nbsp;&nbsp;   聚宝坑金融信息服务股份有限公司 &nbsp;&nbsp;&nbsp;    鄂ICP备14017254号-1</p>
    <p class="fr">
      <a href=""><img src="images/360.png" alt=""></a>
      <a href=""><img src="images/kexin.png" alt=""></a>
      <a href=""><img src="images/norton.png" alt=""></a>
    </p>
  </div>
</div>
<!-- footer end -->
</body>
</html>