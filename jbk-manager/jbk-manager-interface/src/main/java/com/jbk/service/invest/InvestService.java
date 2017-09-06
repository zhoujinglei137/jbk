package com.jbk.service.invest;

import com.jbk.dto.InsertInvest;
import com.jbk.pojo.invest.Invest;

import com.jbk.pojo.user.User;


/**
 * Created by 刘铭 on 2017/9/5 0005.
 *
 */

public interface InvestService {



   /**
    * 为一个用户添加一条投资记录
    * @param user
    * @param invest
    * @return
    */
   Invest save(User user,InsertInvest invest);


}
