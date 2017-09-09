package com.jbk.dao.invest;

import com.jbk.pojo.invest.Invest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 * 投资记录增删改查dao层接口
 */


public interface InvestDao extends JpaRepository<Invest,Serializable> {
    @Modifying(clearAutomatically = true)
    @Query("update Invest i set i.stats = ?2 where i.id = ?1")
    int updateInvest(int id,int stats);
}
