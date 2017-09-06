package com.jbk.service.impl.user;


import com.jbk.dao.user.LoginDao;
import com.jbk.dao.user.UserDao;
import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.user
 * 说明 ：用户user的service的实现层
 */
@Service
@Scope("prototype")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginDao loginDao;


    @Override
    public User userRegister(User user, Login login) {
        System.out.println("1234567");
        User save = userDao.save(user);
       // login.setId(save.getId());
       // Login save1 = loginDao.save(login);
       // System.err.println("user:"+user+";login:"+save1);
        return save;
    }

    @Override
    public Login userLogin(Login login) {
        return null;
    }
}
