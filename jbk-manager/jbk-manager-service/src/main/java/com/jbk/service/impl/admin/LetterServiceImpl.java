package com.jbk.service.impl.admin;

import com.jbk.admin.vo.service.LetterService;
import com.jbk.dao.admin.LetterDao;
import com.jbk.dao.user.UserDao;
import com.jbk.pojo.admin.Letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/11
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.admin
 * 说明 ：
 */
@Service
@Scope("prototype")

public class LetterServiceImpl implements LetterService {
    @Autowired
    private LetterDao letterDao;

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public int saveLetter(Letter letter) {


        System.err.println("--------------count:" + userDao.findByLv(1).get(1).getBirthday());


        return 1;
    }

    @Override
    public List<Letter> selectLetter(int id, int lv) {
        return null;
    }

    @Override
    public Letter lookLetter(int id) {
        return null;
    }

    @Override
    public int deleteLetter(int id) {
        return 0;
    }
}
