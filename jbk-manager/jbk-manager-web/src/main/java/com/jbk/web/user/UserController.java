package com.jbk.web.user;

import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.web.user
 * 说明 ：
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/registeruser")
    @ResponseBody
    public String  test1(User user,Login login){
        System.err.println("user:"+user+";login"+login);
        System.err.println("1234567890-1234567890");
        return "login";
    }
}
