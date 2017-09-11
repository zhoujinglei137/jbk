package com.jbk.service.impl.user;

import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
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
 * 包的名称 : com.jbk.service.impl.user
 * 说明 ：
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserServiceImplTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserService userService;
    @Test
    public void testFindByLv() throws Exception {
        List<User> byLv = userService.findByLv(1);
        System.err.println("================================================users:"+byLv);
    }
}