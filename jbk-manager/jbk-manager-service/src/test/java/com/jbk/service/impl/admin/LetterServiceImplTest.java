package com.jbk.service.impl.admin;

import com.jbk.admin.vo.service.LetterService;
import com.jbk.pojo.admin.Letter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/11
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.admin
 * 说明 ：
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class LetterServiceImplTest {


    @Autowired
    private LetterService letterService;
    @Test
    public void testSaveLetter() throws Exception {
        Letter letter = new Letter();
        letterService.saveLetter(letter);
    }
}