package com.jbk.admin.vo.service;

import com.jbk.pojo.admin.Letter;
import com.jbk.pojo.admin.UserAdmin;

import java.util.List;

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
     * 功能:查询所有记录
     * 创建时间：  2017/9/6.
     */
    List<UserAdmin> findAll();
    /**
     * 需要参数：无
     *  返回参数：UserAdmin类型的集合
     * 功能:查询所有记录
     * 创建时间：  2017/9/6.
     */
    long count();

}
