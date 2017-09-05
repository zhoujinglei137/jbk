package com.jbk.dao.invest;

import com.jbk.pojo.invest.Invest;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 * 投资记录增删改查dao层接口
 */


public interface InvestDao extends CrudRepository<Invest,Serializable>{


}
