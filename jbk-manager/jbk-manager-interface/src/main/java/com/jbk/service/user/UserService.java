package com.jbk.service.user;

import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.user
 * 说明 ：用户user的接口层
 */
public interface UserService {
     User userRegister(User user,Login login);
     Login userLogin(Login login);
}
