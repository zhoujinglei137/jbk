package com.jbk.service.impl.admin;

import com.jbk.admin.vo.service.LetterService;
import com.jbk.dao.admin.LetterDao;
import com.jbk.dao.user.UserDao;
import com.jbk.pojo.admin.Letter;
import com.jbk.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class LetterServiceImpl implements LetterService{

    @Autowired
    private LetterDao letterDao;

    @Autowired
    private UserDao userDao;

    /**
     * 添加信息
     *
     */
    @Override
    public int saveLetter(Letter letter) {
        System.err.println("=====+++++:");
        int x = 0;
        if(letter.getUser() != null){
            /**
             * 判断是否用相应id与lv的用户存在
             */
            User byIdAndLv = userDao.findByIdAndLv(letter.getUser().getId(), letter.getLv());
            if(byIdAndLv == null){
                return 0;
            }

            letter.setState(0);
            letter.setCreateTime(new Date());
            letterDao.save(letter);
            x=1;
        }else{

            List<Letter> list = new ArrayList<>();
            List<User> users = userDao.findByLv(letter.getLv());
            letter.setState(0);
            letter.setCreateTime(new Date());
            for (int i = 0;i<users.size();i++){
                letter.setUser(users.get(i));
                list.add(new Letter(letter.getTitle(),letter.getContext(),letter.getCreateTime(),letter.getState(),letter.getLv(),letter.getUser(),letter.getUserAdmin()));
            }
            System.err.println("=====+++++:"+list.size());
            letterDao.save(list);
            x=users.size();
        }
        return x;
    }

    /**
     * 查询有几份未读信息
     *
     */
    @Override
    public List<Letter> selectLetter(int uid, int lv) {
        List<Letter> letters = letterDao.selectLetter(uid, lv);
        return letters;
    }

    /**
     *点击查看信息,并修改阅读状态
     */
    @Override
    public Letter lookLetter(int id) {
        Letter one = letterDao.findOne(id);
        letterDao.upadteLetter(id);
        return one;
    }
    /**
     * 删除信息
     */
    @Override
    public int deleteLetter(int id) {
        letterDao.delete(id);
        return id;
    }



}
