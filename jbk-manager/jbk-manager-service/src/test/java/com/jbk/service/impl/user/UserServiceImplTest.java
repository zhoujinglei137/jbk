package com.jbk.service.impl.user;

import com.jbk.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 刘铭 on 2017/9/6 0006.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void testUserLogin() throws Exception {
        userService.userLogin(null);
    }
}