
<!DOCTYPE html>
<!--[if lt IE 9 ]>
<html lang="zh" class="lt-ie9"><![endif]-->
<!--[if IE 9 ]>
<html lang="zh" class="ie9"><![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh">
<!--<![endif]-->
<head>
    <meta charset="UTF-8">
    <title>利民网官网--普惠金融,利国利民;互联网金融理财--你身边的网络理财好帮手</title>
    <meta name="renderer" content="webkit" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="X-UA-Compatible" content="chrome=1" />
    <meta name="keywords" content="利民网，互联网金融网贷，短期理财，互联网金融平台，网络理财，个人理财" />
    <meta name="description" content="利民网是采用创新互联网金融模式推出融资担保的互联网金融网贷、短期理财等服务平台，为个人理财、小额理财等投资理财用户提供公平、透明、安全、高效的互联网金融服务！" />
    <!--__STYLE_PLACEHOLDER-->
    <!--__SCRIPT_PLACEHOLDER-->

    <link rel="stylesheet" type="text/css" href="/pkg/index.html_aio_880d546.css" />
    <link rel="stylesheet" href="/static/css/static_merge.css" />
</head>
<body>
<div class="wraper">
    <!-- 头部开始 -->
    <div id="header"></div>
    <!-- 头部结束 -->
    <!-- 广告图开始 -->
    <div class="home_banner_nav">

        <div class="slideContent slideContent1">
            <div class="slideWrap">
                <div class="slideBox-wrap">
                    <ul class="slideBox hide" id="banner">
                        <li><a href="{{bannerUrl}}" target="_blank"><img data-src="{{bannerImage}}"/></a></li>
                    </ul>
                </div>
            </div>
            <!-- controller -->
            <!--<span class="prev">&lt;</span>
            <span class="next">&gt;</span>-->
        </div>
        <div class="home_info">
            <!-- 图片右边登录信息-->
            <div class="home_infomation">
                <!-- 没有登录信息-->
                <div class="hide unlogin" id="unlogin">
                    <span class="font_btr">新手专享豪礼</span>
                    <span><strong>40000</strong> 理财金 </span>
                    <span style="height:25px; line-height: 25px; font-size: 26px;">+</span>
                    <span><strong>688</strong> 现金券</span>
                    <span style="height:25px; line-height: 25px; font-size: 26px;">+</span>
                    <span><strong>120</strong> 红包</span>
                    <div class="home_register"><h3></h3><a href="/pages/login/register.html" title="立即注册">快来注册领豪礼吧！</a></div>
                </div>
                <!-- 已经登录信息-->
                <div class="hide home_login" id="login_qd">
                    <dl>
                        <dt><img src="/pages/home/index/ic_main_nortx.png" width="80" height="80"></dt>
                        <dd class="first">尊敬的<strong id="userMobile"></strong></dd>
                        <dd id="userTips"></dd>
                    </dl>
                    <p class="first">可用余额</p>
                    <p><span><strong id="userMoney"></strong>元</span><a data-action="goCharge" href="/pages/member/recharge.html">立即充值</a></p>
                    <div class="home_login_menu"><a href="/pages/member/account.html">进入我的账户</a></div>
                </div>
            </div>
            <!-- 图片右边登录信息结束-->
        </div>

    </div>
    <!-- 广告图结束（包括右边信息） -->
    <!-- 公告和数据开始 -->
    <div class="home_about">
        <div class="home_about_1160">
            <div class="about_1160_left verticalSlide">
                <!--                         <ul class="hide" id="home_notice_list">
                                          <li><a href="{{linkUrl}}">{{postTitle}}</a></li>
                                        </ul> -->

                <div class="slideContent slideContent-notice">
                    <div class="slideWrap" style="height:100%;">
                        <ul class="slideBox" id="home_notice_list">
                            <!--<li><a href="{{linkUrl}}" target="_blank">{{postTitle}}</a></li>-->
                        </ul>
                    </div>
                </div>


            </div>
            <div class="about_1160_right" id="indexTotal">
                <span>{{type}}<span>{{count}}{{units}}</span></span>
            </div>
        </div>
    </div>
    <!-- 公告和数据结束-->
    <!-- 我们的优势开始-->
    <div class="home_advantage">
        <div class="advantage_1160">
            <dl>
                <dt><img src="/pages/home/index/ic_main_01.png"></dt>
                <dd class="first">专业风控</dd>
                <dd>严格筛选优质项目</dd>
                <dd>坚持小额分散</dd>
            </dl>
            <dl>
                <dt><img src="/pages/home/index/ic_main_02.png"></dt>
                <dd class="first">资质无忧</dd>
                <dd>前海股权交易中心</dd>
                <dd>挂牌上市</dd>
            </dl>
            <dl>
                <dt><img src="/pages/home/index/ic_main_03.png"></dt>
                <dd class="first">安全保障</dd>
                <dd>新网银行资金存管</dd>
                <dd>资金流转全透明</dd>
            </dl>
            <dl>
                <dt><img src="/pages/home/index/ic_main_04.png"></dt>
                <dd class="first">灵活稳健</dd>
                <dd>产品灵活丰富</dd>
                <dd>收益持久稳健</dd>
            </dl>
        </div>
    </div>
    <!-- 我们的优势结束-->
    <!-- 新手标开始-->
    <div class="home_new_pr">
        <div class="home_new_pr_left hide" id="home_new_pr_left">
            <div class="pr_info_left item-done-{{itemDone}}">
                <h2>
                    <em class="xinshou_tips">{{titleLabel}}</em><a href="{{linkUrl}}">{{borrowTitle}}</a><span>仅限新手首次投资</span>
                </h2>
                <dl>
                    <dd><span>{{rateShow}}</span>
                        <p class="fs-12">预期年化收益率</p>
                    </dd>
                    <dd><span><strong>{{deadLineValue}}</strong>{{deadLineType}}</span>
                        <p class="fs-12">{{desc_end_day}}</p>
                    </dd>
                    <dd><span class="kz">{{investDesc}}</span>
                        <p>限投<strong>{{maxTenderedMoney}}</strong>元</p>
                    </dd>
                </dl>
            </div>
            <div class="pr_info_right item-done-{{itemDone}}">
                <div class="new_tips">新手专享</div>
                <div class="ground_line">
                    <span class="gray_line"><a href="#" class="blue_line" style="width:{{isground}}%;" data-ground="{{isground}}"></a></span><strong>{{isground}}%</strong>
                </div>
                <div class="home_click_menu"><a href="{{linkUrl}}" class="{{btnStat}}">{{btnName}}</a></div>
            </div>
        </div>
        <div class="home_new_pr_right"><a href="/activity/xinshou/pc/index.html" title="前往新手指引"></a></div>
    </div>
    <!-- 新手标结束-->
    <!-- 理财产品开始-->
    <div class="home_product">
        <div class="home_product_left">
            <h2>理财产品</h2>
            <div class="sub-title">
                <div class="deco-line"></div>
                <p>优质项目</p>
                <p>灵活可选</p>
            </div>
            <div class="deco-bg"></div>
            <div class="btn-wrap">
                <a href="/pages/product/list.html?type=product&id=1000" class="button_white">查看更多</a>
            </div>
        </div>
        <div class="home_product_right">
            <div class="link-more home_more"><a href="/pages/product/list.html?type=product&id=1000" title="更多理财产品">更多&gt;</a></div>
            <!-- 理财单独产品开始-->
            <div class="home_product_right_main" id="home_product_right">
                <div class="product_list item-done-{{itemDone}} item-flow-{{isFlow}} item-flow-term-{{isFlowDead}}">
                    <div class="product_list_left">
                        <h2>
                            <a href="{{linkUrl}}" title="{{borrowTitle}}">
                                <em class="g-tit-label">{{titleLabel}}</em>
                                <div class="title one-line">{{borrowTitle}}</div>
                                <div class="label-wrap one-line">
                                    {{theLabelStr}}
                                </div>
                            </a>
                        </h2>
                        <dl>
                            <dd class="crv_position {{rateStyle}}">
                                <span>
                                    <em class="flow-min">{{flowMinAnnualRate}}~</em><i>{{rateShowInt}}</i>
                                    <em>
                                        .{{rateShowDec}}%
                                        <span class="rates">{{increaseRate}}</span>
                                    </em>
                                </span>
                                <p>{{repayMode}}</p>
                            </dd>
                        </dl>
                        <div class="product-status is-count-down-{{isCountDown}}" data-wrap=".product_list">
                            <div class="ground_line_list">
                                <span class="gray_line"><a class="blue_line" style="display:inline-block;width:{{isground}}%;" data-ground="{{isground}}"></a></span><strong>{{isground}}%</strong>
                            </div>
                            <div class="count-down" data-now="{{systemTime}}" data-end="{{saleTimeStart}}"></div>
                        </div>
                    </div>
                    <div class="product_list_right">
                        <div class="is_height">
                            <div class="new_tips_d {{showCornerLabel}}">{{cornerlabels}}</div>
                        </div>
                        <div class="home_date">{{desc_end_day}}<strong>{{showDeadLineValue}}</strong>{{deadLineType}}</div>
                        <div class="home_click_menu"><a href="{{linkUrl}}" class="{{btnStat}}">{{btnName}}</a></div>
                    </div>
                </div>
            </div>

            <!-- 理财单独产品结束-->

        </div>
    </div>
    <!-- 理财产品结束-->
    <!-- 债权转让开始-->
    <div class="home_creditor">
        <div class="home_product_left home_product_left-floor2">
            <h2>债权转让</h2>
            <div class="sub-title">
                <div class="deco-line"></div>
                <p>受让债权</p>
                <p>收益更高</p>
            </div>
            <div class="deco-bg"></div>
            <div class="btn-wrap">
                <a href="/pages/product/list.html?type=transfer&id=2000" class="button_white">查看更多</a>
            </div>
        </div>
        <div class="home_product_right">
            <div class="link-more home_more_creditor"><a href="/pages/product/list.html?type=transfer&id=2000" title="更多债权转让">更多&gt;</a></div>
            <!-- 理财单独产品开始-->
            <div class="home_product_right_main" id="product_list_z">
                <div class="product_list item-done-{{itemDone}}">
                    <div class="product_list_left">
                        <h2 class="one-line">
                            <a href="{{linkUrl}}" title="{{borrowTitle}}">
                                <em class="g-tit-label">{{titleLabel}}</em>
                                <div class="title one-line">{{borrowTitle}}</div>
                                <div class="label-wrap one-line">
                                    {{theLabelStr}}
                                </div>
                            </a>
                        </h2>
                        <dl>
                            <dd class="crv_position {{rateStyle}}">
                                <span>{{rateShow}}</span>
                                <p>{{repayMode}}</p>
                                <div class="rates">{{increaseRate}}</div>
                            </dd>
                        </dl>
                        <div class="ground_line_list">
                            <span class="gray_line"><a class="blue_line" style="width:{{isground}}%;" data-ground="{{isground}}"></a></span><strong>{{isground}}%</strong>
                        </div>
                    </div>
                    <div class="product_list_right">
                        <div class="is_height">
                            <div class="new_tips_d {{showCornerLabel}}">{{cornerlabels}}</div>
                        </div>
                        <div class="home_date">{{desc_end_day}}<strong>{{deadLineValue}}</strong>{{deadLineType}}</div>
                        <div class="home_click_menu"><a href="{{linkUrl}}" class="{{btnStat}}">{{btnName}}</a></div>
                    </div>
                </div>
            </div>


            <!-- 理财单独产品结束-->
        </div>
    </div>
    <!-- 债权转让结束-->
    <!-- 新闻公告开始-->
    <div class="home_new_about" id="seo"></div>
    <!-- 新闻公告结束-->
    <!-- 合作伙伴开始-->
    <div class="home_cooperate">
        <div class="home_left_menu"></div>
        <ul class="hide" id="friend_link">
            <li><a href="{{url}}" target="_blank"><img data-src="{{imgUrl}}"></a></li>
        </ul>
        <div class="home_right_menu"></div>
    </div>
    <!-- 合作伙伴结束-->
    <!-- 尾部开始 -->
    <div id="footer"></div>
    <!-- 尾部结束 -->
</div>


<script type="text/javascript" data-loader src="/public/public_merge_4763678.js"></script>
<script type="text/javascript" src="/pkg/index.html_aio_5f9cae2.js"></script>
<script type="text/javascript">
    require('pages/home/index/index.es');
</script>
</body>
</html>
