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
     * 需要参数：无
     *  返回参数：UserAdmin类型的集合
     * 功能:查询符合条件的记录
     * 创建时间：  2017/9/6.
     */
    Result<UserAdmin> findAll(PageDto pageDto,UserAdmin userAdmin);
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
     * 需要参数：无
     *  返回参数：UserAdmin
     * 功能:查询出一个对象
     * 创建时间：  2017/9/6.
     */
    UserAdmin findOne(Integer id);
}
