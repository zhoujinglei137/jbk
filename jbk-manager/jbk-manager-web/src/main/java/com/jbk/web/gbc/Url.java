package com.jbk.web.gbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * �����ˣ�Ҧ��
 * ��Ŀ���ƣ��۱���
 * ����:
 * ����ʱ�䣺  2017/9/11.
 */
@Controller
public class Url {
    @RequestMapping("gbc/{url}")
    public String getUrl(@PathVariable("url") String url){
        return "gbc/"+url;
    }
}
