package com.jbk.dao.user;

import com.jbk.pojo.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/11
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.user
 * 说明 ：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void testFindByLv() throws Exception {
        List<User> byLv = userDao.findByLv(1);
        System.err.println("byLv:"+byLv);
    }

    @Test
    public void testFindByIdAndLv() throws Exception {

    }
}