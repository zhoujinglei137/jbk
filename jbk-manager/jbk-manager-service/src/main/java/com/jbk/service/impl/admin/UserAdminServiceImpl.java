package com.jbk.service.impl.admin;

import com.jbk.admin.service.UserAdminService;
import com.jbk.dao.admin.UserAdminDao;
import com.jbk.pojo.admin.UserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:实现UserAdmin操作的实现类
 * 创建时间：  2017/9/6.
 */
@Service
@Scope(value="prototype")
public class UserAdminServiceImpl implements UserAdminService{
    @Autowired
    private UserAdminDao userAdminDao;
    @Override
    public UserAdmin save(UserAdmin admin) {
        return userAdminDao.save(admin);
    }

    @Transactional
    @Override
    public List<UserAdmin> findAll() {
        return userAdminDao.findAll();
    }

    @Override
    public long count() {
        return userAdminDao.getCount();
    }
    @Transactional
    @Override
    public int deleteMany(long[] ids) {
        return userAdminDao.deleteMany(ids);
    }


}
