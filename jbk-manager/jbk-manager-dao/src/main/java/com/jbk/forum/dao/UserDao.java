package com.jbk.forum.dao;

import com.jbk.pojo.forum.User;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 *
 *
 *
 */
public interface UserDao extends CrudRepository<User,Serializable> {



}
