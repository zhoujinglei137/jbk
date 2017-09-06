package com.jbk.web.admin;

import com.jbk.admin.vo.Result;
import com.jbk.admin.vo.service.UserAdminService;
import com.jbk.pojo.admin.UserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
        System.out.println("刘铭好坑啊！！！！！！！！");
        return "admin/"+url;
    }
    @RequestMapping("/yao")
    public String path(){
        return "yao";
    }

    @RequestMapping("admins")
    @ResponseBody
    public Result showAll(){
        System.out.println("进来啦！！！");
        Result<UserAdmin> result = new Result<>();
        result.setRows(userAdminService.findAll());
        result.setTotal(userAdminService.count());
        result.setUrl("admins");
        return result;
    }
}
