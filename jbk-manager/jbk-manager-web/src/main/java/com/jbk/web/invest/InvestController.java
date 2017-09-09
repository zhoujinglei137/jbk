package com.jbk.web.invest;

import com.jbk.dto.InsertInvest;
import com.jbk.dto.PayDto;
import com.jbk.pojo.user.User;
import com.jbk.service.invest.InvestService;
import com.jbk.util.PayMentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ResourceBundle;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 */

@Controller
@Scope("prototype")
public class InvestController {

    @Autowired
    private InvestService service;

    /**
     * 增加一条投资记录
     * @return
     */
    @RequestMapping(value = "Invest/save")
    public String saveInvest(HttpSession session,InsertInvest invest){
        User user = (User) session.getAttribute("user");
        service.save(user,invest);
        return "pay";
    }

    @RequestMapping("/Invest/pay")
    public String pay(String orderid,String money,String pd_FrpId,Model model){
        // 发给支付公司需要哪些数据
        String p0_Cmd = "Buy";
        String p1_MerId = ResourceBundle.getBundle("merchantInfo").getString(
                "p1_MerId");
        String p2_Order = orderid;
        String p3_Amt = money;
        String p4_Cur = "CNY";
        String p5_Pid = "";
        String p6_Pcat = "";
        String p7_Pdesc = "";
        // 支付成功回调地址 ---- 第三方支付公司会访问、用户访问
        // 第三方支付可以访问网址
        String p8_Url = "http://10.31.152.16:8080/bookStore/CallbackServlet";
        String p9_SAF = "";
        String pa_MP = "";
        String pr_NeedResponse = "1";
        // 加密hmac 需要密钥
        String keyValue = ResourceBundle.getBundle("merchantInfo").getString(
                "keyValue");
        String hmac = PayMentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt,
                p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP,
                pd_FrpId, pr_NeedResponse, keyValue);
        // 生成url --- url?
        model.addAttribute("pd_FrpId", pd_FrpId);
        model.addAttribute("p0_Cmd", p0_Cmd);
        model.addAttribute("p1_MerId", p1_MerId);
        model.addAttribute("p2_Order", p2_Order);
        model.addAttribute("p3_Amt", p3_Amt);
        model.addAttribute("p4_Cur", p4_Cur);
        model.addAttribute("p5_Pid", p5_Pid);
        model.addAttribute("p6_Pcat", p6_Pcat);
        model.addAttribute("p7_Pdesc", p7_Pdesc);
        model.addAttribute("p8_Url", p8_Url);
        model.addAttribute("p9_SAF", p9_SAF);
        model.addAttribute("pa_MP", pa_MP);
        model.addAttribute("pr_NeedResponse", pr_NeedResponse);
        model.addAttribute("hmac", hmac);
        return "../../confirm";
    }


    @RequestMapping("Callback")
    public String Callback(PayDto payDto,Model model){
        String keyValue = ResourceBundle.getBundle("merchantInfo").getString(
                "keyValue");

        // 自己对上面数据进行加密 --- 比较支付公司发过来hamc
        boolean isValid = PayMentUtil.verifyCallback(payDto.getHmac(), payDto.getP1_MerId(), payDto.getR0_Cmd(),
                payDto.getR1_Code(), payDto.getR2_TrxId(), payDto.getR3_Amt(), payDto.getR4_Cur(), payDto.getR5_Pid(), payDto.getR6_Order(), payDto.getR7_Uid(),
                payDto.getR8_MP(), payDto.getR9_BType(), keyValue);
        if (isValid) {
            service.updateInvest(Integer.parseInt(payDto.getR6_Order()),3);
            model.addAttribute("msg","支付已成功！");

        } else {
            // 数据无效
            model.addAttribute("msg","支付失败！");
        }

        return  "pay_success";

    }










}
