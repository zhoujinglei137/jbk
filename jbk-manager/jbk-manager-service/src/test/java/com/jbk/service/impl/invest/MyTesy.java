package com.jbk.service.impl.invest;

import com.jbk.dao.invest.InvestDao;
import com.jbk.pojo.invest.Invest;
import com.jbk.pojo.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 刘铭 on 2017/9/7 0007.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class MyTesy {



    @Autowired
    private InvestDao investDao;

    @Test
    public void test1(){

        Invest invest = new Invest();
        User user = new User();
        user.setId(1);
        invest.setUser(user);
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreNullValues().;
        Example<Invest> investExample = Example.of(invest,exampleMatcher);

        investDao.findAll();
        List<Invest> invests = investDao.findAll(investExample);
        investDao.
        System.err.println(invests);


    }




}
