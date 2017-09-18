package com.jbk.service.impl.admin;

import com.github.wenhao.jpa.Specifications;
import com.jbk.admin.service.UserAdminService;
import com.jbk.admin.vo.Result;
import com.jbk.dao.admin.UserAdminDao;
import com.jbk.pojo.admin.UserAdmin;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
    @Transactional
    @Override
    public UserAdmin save(UserAdmin admin) {
        admin.setSorts(1);
        return userAdminDao.save(admin);
    }

    @Transactional
    @Override
    public Result<UserAdmin> findAll(PageDto pageDto,UserAdmin userAdmin,UserAdmin user_admin) {
        Result<UserAdmin> result = new Result<>();
        System.err.println("瞅瞅这个userAdmin是不是session中的userAdmin  :   "+user_admin.getSorts());
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreNullValues().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreCase();
        Example<UserAdmin> example = Example.of(userAdmin,exampleMatcher);
        //如果是总管理员
            Specification<UserAdmin> specification = Specifications.<UserAdmin>and().ge("sorts", user_admin.getSorts()).build();
            Page<UserAdmin> page =userAdminDao.findAll(specification,pageDto);
            result.setRows(page.getContent());
            result.setTotal(page.getTotalElements());

        return result;
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

    @Override
    public UserAdmin findOne(Integer id) {
        return userAdminDao.findOne(id);
    }

    @Override
    public UserAdmin findByLoginName(String loginName) {

        return userAdminDao.findOnLoginName(loginName);
    }

    @Override
    public UserAdmin findForLogin(String loginName, String passWord) {
        return userAdminDao.findByLoginNameAndPassWord(loginName, passWord);
    }

}
