package com.jbk.web.user;


import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
import com.jbk.util.EmailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    /**
     *
     * @param user
     * @param login
     * @return
     */
    @RequestMapping("/registeruser1")
    public String  test2(User user,Login login){
        System.err.println("user:"+user+";login"+login);
        System.err.println("1234567890-1234567890");
        userService.userRegister(user,login);
        return "index";
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
        return "index";
    }

    @RequestMapping("/logout")
    public String  test4(HttpServletRequest request){
       request.getSession().removeAttribute("user_login");
        return "index";
    }

    /**
     * 验证用户名是否存在
     * @param name
     * @return
     */

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

    /**
     * 修改密码
     * @param
     * @return
     */
    @RequestMapping("/updateLogin")
    @ResponseBody
    public int  test6(String pw1,String pw2,HttpServletRequest request){
        System.err.println("===="+pw1+"====="+pw2);
        Login login1 = (Login)request.getSession().getAttribute("user_login");
        Login login = new Login();
        login.setId(1);
        login.setLoginName("123123");
       login.setMiPassWord("321321");
        login.setPassWord(pw2);
        int i = userService.findPassWord(login, pw1);

        return i;
    }

    @RequestMapping("/updatetal")
    @ResponseBody
    public int  test7(String tp1,String tp2,HttpServletRequest request){
        System.err.println("===="+tp1+"====="+tp2);
        Login login = (Login)request.getSession().getAttribute("user_login");
       /* int id = login.getId();*/
        int i = userService.updataTel(1, tp1, tp2);
        return i;
    }


    @RequestMapping("/updateuser")
    @ResponseBody
    public int  test8(String cardid,String phone,String date,HttpServletRequest request){
        Login login = (Login)request.getSession().getAttribute("user_login");
        System.err.println("===="+cardid+"====="+phone+"===="+date);
        Date datetime = null;
        try {
             datetime = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        User user  = new User();
        user.setId(3);
        user.setCardId(cardid);
        user.setTel2(phone);
        user.setBirthday(datetime);
        int i = userService.upadteUser(user);
        System.err.println("+++6+++"+i);
        return i;
    }

    @RequestMapping("/send_email")
    @ResponseBody
    public int  test9(HttpServletRequest request){
        Login login = (Login)request.getSession().getAttribute("user_login");
        //int id = login.getId();
        System.err.println("===="+login);
        User user = userService.selectUser(2);
        int rd = EmailUtils.sendEmail("941068441@qq.com");
        return rd;
    }


    @RequestMapping("/update_email")
    @ResponseBody
    public int  test10( String email ,HttpServletRequest request){
        Login login = (Login)request.getSession().getAttribute("user_login");
        //int id = login.getId();
        System.err.println("===="+login);
        int i = userService.updateEmail(email, 3);


        return i;
    }
}


