package com.jbk.service.impl.admin;

import com.jbk.admin.vo.service.LetterService;
import com.jbk.dao.admin.LetterDao;
import com.jbk.pojo.admin.Letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/8
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.admin
 * 说明 ：
 */
@Service
@Scope(value="prototype")
@Transactional
public class LetterServiceImpl implements LetterService {

    @Autowired
    private LetterDao letterDao;

    @Override
    public Letter saveLetter(Letter letter) {
        letter.setState(1);
        letter.setCreateTime(new Date());
        Letter save = letterDao.save(letter);
        return save;
    }
}
