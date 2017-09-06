package com.jbk.dao.user;

import com.jbk.pojo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.user
 * 说明 ：用户增删改查的dao层
 */
public interface UserDao extends JpaRepository<User, Serializable> {

}
