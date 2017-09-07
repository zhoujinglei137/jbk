package com.jbk.service.impl.admin;

import com.jbk.admin.vo.service.UserAdminService;
import com.jbk.pojo.admin.UserAdmin;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 创建人：姚鹏
 * 项目名称：聚宝坑
 * 功能:
 * 创建时间：  2017/9/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserAdminServiceImplTest extends TestCase {
    @Autowired
    private UserAdminService userAdminService;
    @Test
    public void testSave() throws Exception {
        UserAdmin admin = new UserAdmin();
        admin.setLoginName("test");
        admin.setUserName("dengluming");
        admin.setPassWord("123444");
        admin.setSort(10);
        userAdminService.save(admin);
        System.out.println(admin.getId());
    }

    @Test
    public void testFindAll() throws Exception {
        List<UserAdmin> list= userAdminService.findAll();
        for(int i=0; i <list.size();i++){
            System.out.println(list.get(i).getLoginName());
        }
    }
    @Test
    public void testGetCount(){
        long l =userAdminService.count();
        System.out.println("测试一波自己写的SQL语句   ：  " + l);
    }
}