package com.jbk.service.impl.admin;

import com.jbk.admin.vo.service.LetterService;
import com.jbk.pojo.admin.Letter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/9
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.admin
 * 说明 ：
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class LetterServiceImplTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private LetterService letterService;

    @Test
    public void testSaveLetter() throws Exception {
        Letter letter = new Letter();
        letter.setLv(1);
        letter.setTitle("hello2");
        letter.setContext("world2");
        int i = letterService.saveLetter(letter);
        System.err.println("=========="+i);
    }

    @Test
    public void testSelectLetter() throws Exception {
        List<Letter> letters = letterService.selectLetter(7, 1);
        System.err.println(letters);
    }

    @Test
    public void testLookLetter() throws Exception {
        Letter letter = letterService.lookLetter(5);
        System.err.println(letter);
    }

    @Test
    public void testDeleteLetter() throws Exception {
        letterService.deleteLetter(8);
    }
}