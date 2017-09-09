package com.jbk.web.admin;

import com.jbk.admin.service.UserAdminService;
import com.jbk.admin.vo.Result;
import com.jbk.pojo.admin.UserAdmin;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("admin/{url}")
    public String getUrl(@PathVariable() String url){
        return "admin/"+url;
    }
    @RequestMapping("/yao")
    public String path(){
        return "yao";
    }

    @RequestMapping("admins")
    @ResponseBody
    public Result showByPage(PageDto pageDto,UserAdmin userAdmin){
        return userAdminService.findAll(pageDto,userAdmin);
    }
    @RequestMapping("adminadd")
    @ResponseBody
    public UserAdmin adminAdd(UserAdmin userAdmin){
        return userAdminService.save(userAdmin);
    }
    @RequestMapping("admins/batch")
    @ResponseBody
    public int deleteMany(@RequestParam("ids[]")long[] ids){
        return  userAdminService.deleteMany(ids);
    }
    @RequestMapping("adminupdate")
    @ResponseBody
    public UserAdmin updateUserAdmin(@RequestParam("id")long id){
       return  userAdminService.findOne(id);
    }
}
