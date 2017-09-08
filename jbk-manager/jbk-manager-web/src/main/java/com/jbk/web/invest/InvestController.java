package com.jbk.web.invest;

import com.jbk.dto.InsertInvest;
import com.jbk.pojo.user.User;
import com.jbk.service.invest.InvestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 */

@Controller
@Scope("prototype")
@RequestMapping("/Invest")
public class InvestController {

    @Autowired
    private InvestService service;

    /**
     * 增加一条投资记录
     * @return
     */
    @RequestMapping(value = "/Invest/save",method = RequestMethod.POST)
    public String saveInvest(HttpSession session,InsertInvest invest){
        User user = (User) session.getAttribute("user");
        service.save(user,invest);
        return "pay";
    }





}
