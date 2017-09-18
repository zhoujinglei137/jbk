package com.jbk.dao.admin;

import com.jbk.admin.vo.Order;
import com.jbk.admin.vo.Page;
import com.jbk.pojo.admin.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:对管理员操作的数据接口
 * 创建时间：  2017/9/6.
 */
public interface UserAdminDao extends JpaRepository<UserAdmin,Serializable>,JpaSpecificationExecutor<UserAdmin>{
    @Query(nativeQuery = true,value = "select count(1) from tb_admin")
    long getCount();
    @Modifying
    @Query(nativeQuery = true,value="delete from tb_admin where id in :ids")
    int deleteMany(@Param("ids")long[] ids);
    @Query(nativeQuery = true,value = "select *  from tb_admin where login_name=:loginName limit 1")
    UserAdmin findOnLoginName(@Param("loginName")String loginName);

    UserAdmin findByLoginNameAndPassWord(String loginName,String passWord);

    @Query(nativeQuery = true,value = "select *  from tb_admin where login_name like #{userAdmin.loginName} and user_name like #{userAdmin.userName} limit #{page1.page},#{page1.rows}")
    List<UserAdmin> findOnSorts(@Param("page1")Page page1,@Param("userAdmin")UserAdmin userAdmin,@Param("sorts")int sorts);

}
