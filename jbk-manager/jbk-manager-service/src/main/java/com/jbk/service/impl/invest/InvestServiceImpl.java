package com.jbk.service.impl.invest;

import com.jbk.dao.invest.InvestDao;
import com.jbk.dto.InsertInvest;
import com.jbk.pojo.invest.Invest;
import com.jbk.pojo.product.Product;
import com.jbk.pojo.user.User;
import com.jbk.service.invest.InvestService;
import com.jbk.util.DateUtil;
import com.jbk.util.PageBean;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Date;

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
        invest.setStats(0);
        invest=investDao.save(invest);
        if (invest != null) {
            user.setJf((int) insertInvest.getInvestLimit());
        }





        return invest;
    }

    /**
     * 查找用户
     * @param pageDto
     * @param user
     * @return
     */
    @Override
    public PageBean<Invest> listInvest(PageDto pageDto,User user){
        Invest invest = new Invest();
        invest.setUser(user);
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreNullValues();
        Example<Invest> investExample = Example.of(invest,exampleMatcher);
        Page<Invest> page = investDao.findAll(investExample, pageDto);

        PageBean<Invest> pageBean = new PageBean<>();
        pageBean.setRows(page.getContent());
        pageBean.setPageSize(page.getSize());
        pageBean.setPage(page.getNumber());
        pageBean.setTotal(page.getTotalElements());

        return pageBean;
    }

    @Override
    public Invest findOne(Invest invest) {
        invest = investDao.findOne(invest.getId());
        return invest;
    }




}
