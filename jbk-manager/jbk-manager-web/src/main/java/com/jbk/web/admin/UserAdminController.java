package com.jbk.web.admin;

import com.jbk.admin.service.UserAdminService;
import com.jbk.admin.vo.Result;
import com.jbk.pojo.admin.UserAdmin;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:
 * 创建时间：  2017/9/6.
 */
@Controller
@Scope("prototype")
public class UserAdminController {
    @Autowired
    private UserAdminService userAdminService;

    @RequestMapping("userAdminLogin")
    public String userAdminLogin(String loginName,String passWord,String remember,HttpServletRequest request,HttpServletResponse response){
        UserAdmin userAdmin = userAdminService.findForLogin(loginName, passWord);
        if(userAdmin==null) {
            request.setAttribute("message", "用户名或密码错误！");
            return "adminlogin";
        }
        if (remember != null){
            Cookie cookie = new Cookie("loginName",userAdmin.getLoginName());
            cookie.setPath("/");
            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);
        }else{
            Cookie cookie = new Cookie("loginName",null);
            cookie.setPath("/");
            cookie.setMaxAge(1);
            response.addCookie(cookie);
        }
        request.getSession().removeAttribute("user_admin");
        request.getSession().setAttribute("user_admin",userAdmin);
        return "yao";
    }

    @RequestMapping("admin/{url}")
    public String getUrl(@PathVariable() String url) {
        return "admin/" + url;
    }

    @RequestMapping("/yao")
    public String path() {
        return "yao";
    }

    @RequestMapping("admins")
    @ResponseBody
    public Result showByPage(PageDto pageDto, UserAdmin userAdmin,HttpServletRequest request) {
        UserAdmin user_admin = (UserAdmin)request.getSession().getAttribute("user_admin");
        return userAdminService.findAll(pageDto, userAdmin,user_admin);
    }

    @RequestMapping("adminadd")
    @ResponseBody
    public UserAdmin adminAdd(UserAdmin userAdmin) {
        return userAdminService.save(userAdmin);
    }

    @RequestMapping("admins/batch")
    @ResponseBody
    public int deleteMany(@RequestParam("ids[]") long[] ids) {
        return userAdminService.deleteMany(ids);
    }

    @RequestMapping("adminupdate")
    @ResponseBody
    public UserAdmin updateUserAdmin(UserAdmin userAdmin) {
        return userAdminService.save(userAdmin);
    }

    @RequestMapping("admin-update")
    public String toUpdateUserAdmin(@RequestParam("id") Integer id, Model model) {
        if (id == 0) {
            model.addAttribute("update-message","需要先选中一个用户！！！");
            return "admin-update";
        }
        UserAdmin userAdmin = userAdminService.findOne(id);
        model.addAttribute("userAdmin", userAdmin);
        return "admin/admin-update";
    }

    @RequestMapping("/checkLoginName")
    @ResponseBody
    public boolean check(String loginName){
        UserAdmin userAdmin = userAdminService.findByLoginName(loginName);
        if (userAdmin == null)
            return true;
        return false;

    }
}
