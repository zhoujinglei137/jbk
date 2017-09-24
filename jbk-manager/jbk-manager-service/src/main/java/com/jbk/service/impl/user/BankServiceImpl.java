package com.jbk.service.impl.user;

import com.jbk.dao.user.BankDao;
import com.jbk.pojo.user.UserBank;
import com.jbk.service.user.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/15
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.user
 * 说明 ：
 */

@Service
@Scope("prototype")
@Transactional
public class BankServiceImpl implements BankService {


    @Autowired
    private BankDao bankDao;
    @Override
    public int saveBank(UserBank userBank) {
        int i = 0;
        UserBank save = bankDao.save(userBank);
        if(save != null){
            i=1;
        }
        return i;
    }
}
