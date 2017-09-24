package com.jbk.service.user;

import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;

import java.util.List;

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

     Login userOne(String name);

     List<User> findByLv(int i);

     /**
      * 验证手机号是否是预留的
      */
     User findByTel1(String tel1,int id);
     /**
      *验证登录密码是否正确
      */
     int findPassWord(Login login,String pw);
     /**
      * 修改手机号
      */
     int updataTel(int id,String tp1,String tp2);
     /**
      * 完善个人信息
      */
     int upadteUser(User user);
     /**
      * 根据id查询信息
      */
     User selectUser(int id);
     /**
      * 修改邮箱
      */
     int updateEmail(String mail,int id);

}
