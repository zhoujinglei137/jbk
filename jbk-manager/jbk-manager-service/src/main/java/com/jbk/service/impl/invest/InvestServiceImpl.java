package com.jbk.service.impl.invest;

import com.jbk.dao.invest.InvestDao;
import com.jbk.pojo.invest.Invest;
import com.jbk.service.invest.InvestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 * 投资相关业务逻辑层实现类
 */
@Service
@Scope("prototype")
public class InvestServiceImpl implements InvestService {

    @Autowired
    private InvestDao investDao;



    /**
     * 保存投资记录
     * @param invest
     * @return 带id的invest
     */
    @Override
    public Invest save(Invest invest) {
        invest = investDao.save(invest);
        return invest;
    }
}
