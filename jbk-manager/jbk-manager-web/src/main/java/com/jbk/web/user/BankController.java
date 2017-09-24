package com.jbk.web.user;

import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.pojo.user.UserBank;
import com.jbk.service.user.BankService;
import com.jbk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/15
 * 项目名称 : jbk
 * 包的名称 : com.jbk.web.user
 * 说明 ：
 */
@Controller
public class BankController {
    @Autowired
    private UserService userService;
    @Autowired
    private BankService bankService;

    @RequestMapping("/addbank")
    @ResponseBody
    public int  test6(UserBank userBank,User user,HttpServletRequest request){
        Login attribute = (Login)request.getSession().getAttribute("user_login");
        if(attribute == null){
            user.setId(1);
        }else {
            user.setId(attribute.getId());
        }

        userBank.setUser(user);

        User byTel1 = userService.findByTel1(user.getTel1(),user.getId());
        if (byTel1 == null){
            return  0;
        }
        bankService.saveBank(userBank);
        return 1;
    }

}
