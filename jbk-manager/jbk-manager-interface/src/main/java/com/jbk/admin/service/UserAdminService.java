package com.jbk.admin.service;

import com.jbk.admin.vo.Result;
import com.jbk.pojo.admin.UserAdmin;
import com.jbk.util.PageDto;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:UserAdmin（管理员）:业务逻辑层
 * 创建时间：  2017/9/6.
 */
public interface UserAdminService {
    /**
     * 需要参数：UserAdmin（不带主键的管理员类）
     *  返回参数：UserAdmin（带主键的管理员类）
     * 功能:添加一个UserAdmin（管理员）
     * 创建时间：  2017/9/6.
     */
    UserAdmin save(UserAdmin admin);
    /**
     * 需要参数：pageDto(分页，排序的类)，userAdmin（传进来的参数，进行模糊查询的条件），user_admin（登录的用户）
     *  返回参数：UserAdmin类型的集合
     * 功能:查询符合条件的记录
     * 创建时间：  2017/9/6.
     */
    Result<UserAdmin> findAll(PageDto pageDto,UserAdmin userAdmin,UserAdmin user_admin);
    /**
     * 需要参数：无
     *  返回参数：long
     * 功能:查询有多少条符合条件的记录
     * 创建时间：  2017/9/6.
     */
    long count();
    /**
     * 需要参数：long ids[]数组
     *  返回参数：int
     * 功能:删除一个ids数组的管理员
     * 创建时间：  2017/9/6.
     */
    int deleteMany(long[] ids);
    /**
     * 需要参数：id主键
     *  返回参数：UserAdmin
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */
    UserAdmin findOne(Integer id);
    /**
     * 需要参数：loginName登录名
     *  返回参数：UserAdmin
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */
    UserAdmin findByLoginName(String loginName);
    /**
     * 需要参数：loginName登录名,passWord密码
     *  返回参数：boolean
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */
    UserAdmin findForLogin(String loginName,String passWord);
}
