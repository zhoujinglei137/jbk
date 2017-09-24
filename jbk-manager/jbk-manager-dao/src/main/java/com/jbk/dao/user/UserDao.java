package com.jbk.dao.user;

import com.jbk.pojo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.user
 * 说明 ：用户增删改查的dao层
 */
@Repository("userDao")
public interface UserDao extends JpaRepository<User, Serializable> {

    /**
     * 查询相关等级的所有用户
     * @param lv
     * @return
     */
    List<User> findByLv(int lv);

    /**
     * 查询用户id与lv是否相同
     */
    User findByIdAndLv(int id,int lv);

    /**
     * 验证手机号是否是预留的
     */
    User findByTel1AndId(String tel,int id);
    /**
     * 修改预留手机号
     */
    @Modifying
    @Query(value = "update tb_user set tel=?2 where id = ?1" ,nativeQuery = true)
    int updataTel(int id,String tel);
    /**
     * 完善个人信息
     */
    @Modifying
    @Query(value = "update tb_user set  cardId=?2, tel2=?3,birthday=?4 where id = ?1" ,nativeQuery = true)
    int updateUser(int id,String catdid,String phone,Date birthday);

    /**
     * 修改邮箱
     */
    @Modifying
    @Query(value = "update tb_user set email = ?1 where id = ?2" ,nativeQuery = true)
    int updateEmail(String mail,int id);
}
