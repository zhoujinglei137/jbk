package com.jbk.dao.admin;

import com.jbk.pojo.admin.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/8
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.admin
 * 说明 ：
 */
public interface LetterDao  extends JpaRepository<Letter,Serializable> {


    /**
     * 查询有几份未读信息
     *
     */
        @Query(value = "select * from tb_letter where uid = ?1 and lv = ?2" ,nativeQuery = true)
        List<Letter> selectLetter(int uid,int lv);

    /**
     *修改信息状态改为已读（1）
     */
        @Modifying
        @Query(value = "update  tb_letter set state=1 where id=?1",nativeQuery = true)
        int upadteLetter(int id);

}
