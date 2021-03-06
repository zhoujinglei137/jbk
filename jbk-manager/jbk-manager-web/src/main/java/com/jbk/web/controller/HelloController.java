package com.jbk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.web.controller
 * 说明 ：
 */

@Controller
public class HelloController {
    @RequestMapping("/login")
    public String test1(){
        return "login";
    }

    @RequestMapping("/{jn}")
      public String test2(@PathVariable("jn") String jn){
        System.out.println("经过了："+jn);
        return jn;
    }
    @RequestMapping("user/{jn}")
    public String test3(@PathVariable("jn") String jn){
        System.out.println("经过了："+jn);
        return "user/"+jn;
    }
}

