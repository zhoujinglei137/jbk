package com.jbk.dao.admin;

import com.jbk.pojo.admin.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:对管理员操作的数据接口
 * 创建时间：  2017/9/6.
 */
public interface UserAdminDao extends JpaRepository<UserAdmin,Serializable>{
    @Query(nativeQuery = true,value = "select count(1) from tb_admin")
    long getCount();
    @Modifying
    @Query(nativeQuery = true,value="delete from tb_admin where id in :ids")
    int deleteMany(@Param("ids")long[] ids);

}
