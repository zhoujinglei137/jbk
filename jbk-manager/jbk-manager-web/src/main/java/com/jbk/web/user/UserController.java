package com.jbk.web.user;


import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping("/registeruser1")
    public String  test2(User user,Login login){
        System.err.println("user:"+user+";login"+login);
        System.err.println("1234567890-1234567890");
        userService.userRegister(user,login);
        return "../../index";
    }

    @RequestMapping("/loginuser")
    public String  test3(Login login,String remember,HttpServletRequest request,HttpServletResponse response){


        Login loginu = userService.userLogin(login);
        if(loginu==null){
            request.setAttribute("message","登录名或密码错误");
            return "../../loginjbk";
        }

        if (remember != null){
            Cookie cookie = new Cookie("loginname",login.getLoginName());
            cookie.setPath("/");
            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);
        }else{
            Cookie cookie = new Cookie("loginname",null);
            cookie.setPath("/");
            cookie.setMaxAge(1);
            response.addCookie(cookie);
        }


        request.getSession().setAttribute("user_login",loginu);
        return "../../index";
    }

    @RequestMapping("/logout")
    public String  test4(HttpServletRequest request){
       request.getSession().removeAttribute("user_login");
        return "../../index";
    }


    @RequestMapping("/verify")
    @ResponseBody
    public int  test5(String name){
        int i = 0;
        Login login = userService.userOne(name);
        if(login != null){
            i=1;
        }
        System.err.println("++++++++=====:"+i);
        return i;
    }

    }


