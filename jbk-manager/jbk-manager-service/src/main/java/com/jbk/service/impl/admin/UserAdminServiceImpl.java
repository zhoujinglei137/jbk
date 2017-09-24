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
    /**
     * 需要参数：UserAdmin（不带主键的管理员类）
     *  返回参数：UserAdmin（带主键的管理员类）
     * 功能:添加一个UserAdmin（管理员）
     * 创建时间：  2017/9/6.
     */
    @Transactional
    @Override
    public UserAdmin save(UserAdmin admin) {
        admin.setSorts(1);
        return userAdminDao.save(admin);
    }
    /**
     * 需要参数：pageDto(分页，排序的类)，userAdmin（传进来的参数，进行模糊查询的条件），user_admin（登录的用户）
     *  返回参数：UserAdmin类型的集合
     * 功能:查询符合条件的记录
     * 创建时间：  2017/9/6.
     */
    @Transactional
    @Override
    public Result<UserAdmin> findAll(PageDto pageDto,UserAdmin userAdmin,UserAdmin user_admin) {
        Result<UserAdmin> result = new Result<>();
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreNullValues().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreCase();
        Example<UserAdmin> example = Example.of(userAdmin,exampleMatcher);
        Specification<UserAdmin> specification = Specifications.<UserAdmin>and().ge("sorts",user_admin.getSorts()).build();
        Page<UserAdmin> page =userAdminDao.findAll(specification,pageDto);
        result.setRows(page.getContent());
        result.setTotal(page.getTotalElements());
        return result;
    }
    /**
     * 需要参数：无
     *  返回参数：long
     * 功能:查询有多少条符合条件的记录
     * 创建时间：  2017/9/6.
     */
    @Override
    public long count() {
        return userAdminDao.getCount();
    }
    /**
     * 需要参数：long ids[]数组
     *  返回参数：int
     * 功能:删除一个ids数组的管理员
     * 创建时间：  2017/9/6.
     */
    @Transactional
    @Override
    public int deleteMany(long[] ids) {
        return userAdminDao.deleteMany(ids);
    }
    /**
     * 需要参数：id主键
     *  返回参数：UserAdmin
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */
    @Override
    public UserAdmin findOne(Integer id) {
        return userAdminDao.findOne(id);
    }

    /**
     * 需要参数：loginName登录名
     *  返回参数：UserAdmin
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */@Override
    public UserAdmin findByLoginName(String loginName) {
        return userAdminDao.findOnLoginName(loginName);
    }
    /**
     * 需要参数：loginName登录名,passWord密码
     *  返回参数：boolean
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */
    @Override
    public UserAdmin findForLogin(String loginName, String passWord) {
        return userAdminDao.findByLoginNameAndPassWord(loginName, passWord);
    }

}
