package com.jbk.service.impl.invest;

import com.jbk.pojo.invest.Invest;
import com.jbk.pojo.user.User;
import com.jbk.service.invest.InvestService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class InvestServiceImplTest extends TestCase {


    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private InvestService investService;

    @Test
    public void testSave() throws Exception {
        Invest invest = new Invest();
        User user = new User();
        user.setId(1);
        invest.setUser(user);
        investService.save(invest);

    }
}