package com.jbk.service.impl.invest;

import com.jbk.dao.invest.InvestDao;
import com.jbk.dto.InsertInvest;
import com.jbk.pojo.invest.Invest;
import com.jbk.pojo.product.Product;
import com.jbk.pojo.user.User;
import com.jbk.service.invest.InvestService;
import com.jbk.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 * 投资相关业务逻辑层实现类
 */
@Service
@Scope("prototype")
public class InvestServiceImpl implements InvestService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private InvestDao investDao;


    /**
     * 保存投资记录
     * @param user 投资人
     * @param insertInvest
     * @return
     */
    @Override
    public Invest save(User user,InsertInvest insertInvest) {
        Invest invest = new Invest();
        Date date = new Date();
        invest.setUser(user);
        invest.setInvestDate(date);
        invest.setInvestLimit(insertInvest.getInvestLimit());
        invest.setEarningsDate(DateUtil.getNowAfterDay(date,insertInvest.getTimeLimit()));
        Product product = new Product();
        product.setId(insertInvest.getPid());
        invest.setProduct(product);
        invest=investDao.save(invest);
        if (invest != null) {
            user.setJf((int) insertInvest.getInvestLimit());
        }

        return invest;
    }
}
