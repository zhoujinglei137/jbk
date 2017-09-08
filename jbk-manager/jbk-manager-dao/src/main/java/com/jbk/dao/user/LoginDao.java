package com.jbk.dao.user;

import com.jbk.pojo.user.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.user
 * 说明 ：用户登录的dao层
 */
public interface LoginDao extends JpaRepository<Login, Serializable> {


    /*@Query(value="select * from tb_login where login_name=?1 and pass_word =?2 " ,nativeQuery=true)
    Login loginUser(String loginuser,String password);*/


    Login findByLoginNameAndPassWord(String loginName,String password);
}
