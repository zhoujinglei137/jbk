package com.jbk.web.admin;

import com.jbk.admin.vo.service.LetterService;
import com.jbk.pojo.admin.Letter;
import com.jbk.pojo.admin.UserAdmin;
import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/10
 * 项目名称 : jbk
 * 包的名称 : com.jbk.web.admin
 * 说明 ：
 */
@Controller
public class LetterConterller {

    @Autowired
    private LetterService letterService;
    @Autowired
    private UserService userService;

    @RequestMapping("/addletter")
    @ResponseBody
    public int  test1(String loginName,Letter letter,int adid){

       if(loginName !=null && !"".equals(loginName)){
           Login login = userService.userOne(loginName);
           if(login == null){
                return 0;
           }else{
               System.err.println("asdfghjhgfdsdfg");
               User user = new User();
               user.setId(login.getId());
               letter.setUser(user);
           }

        }
        UserAdmin userAdmin = new UserAdmin();
        userAdmin.setId(adid);
        letter.setUserAdmin(userAdmin);
        System.err.println("======="+letter);

        int i = letterService.saveLetter(letter);
        System.err.println("++++++++++++++++"+i);
        return i;
    }
}
