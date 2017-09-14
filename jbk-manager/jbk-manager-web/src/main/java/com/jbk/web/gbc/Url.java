package com.jbk.web.gbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:
 * 创建时间：  2017/9/11.
 */
@Controller
public class Url {
    @RequestMapping("gbc/{url}")
    public String getUrl(@PathVariable("url") String url){
        return "gbc/"+url;
    }
}
