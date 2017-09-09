package com.jbk.dao.forum;

import com.jbk.pojo.forum.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 *
 *
 *
 */
@Repository("uDao")
public interface UserDao extends CrudRepository<User,Serializable> {



}
