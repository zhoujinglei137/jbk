package com.jbk.service.impl.user;


import com.jbk.dao.user.LoginDao;
import com.jbk.dao.user.UserDao;
import com.jbk.pojo.user.Login;
import com.jbk.pojo.user.User;
import com.jbk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.service.impl.user
 * 说明 ：用户user的service的实现层
 */
@Service
@Scope("prototype")
@Transactional
public class UserServiceImpl implements UserService {

   // @Resource
    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginDao loginDao;


    @Override
    public User userRegister(User user, Login login) {

        user.setLv(1);
        user.setJf(10);
        User save = userDao.save(user);
        login.setId(save.getId());
        login.setMiPassWord(login.getPassWord());
        Login save1 = loginDao.save(login);
        System.err.println("1234567"+"user:"+user+";login:"+save1);
        return save;
    }

    @Override
    public Login userLogin(Login login) {
        Login loginu = loginDao.findByLoginNameAndPassWord(login.getLoginName(), login.getPassWord());
        return loginu;
    }

    /**
     * 判断用户名存不存在
     * @param name
     * @return
     */
    @Override
    public Login userOne(String name) {

        Login byLoginName = loginDao.findByLoginName(name);

        return byLoginName;
    }

    @Override
    public List<User> findByLv(int i){
        return userDao.findByLv(i);
    }

    /**
     * 查询预留电话存不存在
     * @param tel1
     * @param id
     * @return
     */
    @Override
    public User findByTel1(String tel1,int id) {

        User byTel1 = userDao.findByTel1AndId(tel1,id);

        return byTel1;
    }

    /**
     * 判断密码是否真确
     * @param pw
     * @return
     */
    @Override
    public int findPassWord(Login login,String pw) {

        Login byPassWord = loginDao.findByIdAndPassWord(login.getId(), pw);
        if(byPassWord == null){
            return 0;
        }
        loginDao.save(login);
        return 1;
    }

    @Override
    public int updataTel(int id, String tp1, String tp2) {
        User byTel1AndId = userDao.findByTel1AndId(tp1, id);
        if (byTel1AndId == null){
            return  0 ;
        }
        System.err.println("+++++====+++++"+userDao.updataTel(id,tp2));
        return 1;
    }

    /**
     * 完善个人信息
     * @param user
     * @return
     */
    @Override
    public int upadteUser(User user) {
        int i = userDao.updateUser(user.getId(), user.getCardId(), user.getTel2(), user.getBirthday());
        return i;
    }

    /**
     * 根据Id查询信息
     * @param
     * @return
     */
    @Override
    public User selectUser(int id) {
        User one = userDao.findOne(id);
        return one;
    }

    @Override
    public int updateEmail(String mail, int id) {
        int i = userDao.updateEmail(mail, id);
        return i;
    }


}
