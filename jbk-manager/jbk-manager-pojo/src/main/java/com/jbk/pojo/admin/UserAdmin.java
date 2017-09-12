package com.jbk.pojo.admin;

import javax.persistence.*;

/**
 * 创建人： 姚鹏
 * 项目名称：聚宝坑
 * 功能：管理员类（可以得到管理员表的数据）
 * 创建时间 ：2017/9/5
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table( name = "tb_admin")
public class UserAdmin {
    /**
     * id:主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//主键
    /**
     * login_name:登录名
     */
    @Column(name="login_name")
    private String loginName;//登录名
    /**
     * pass_word:密码
     */
    @Column(name="pass_word")
    private String passWord;//密码
    /**
     * user_name:昵称
     */
    @Column(name="user_name")
    private String userName;//昵称
    /**
     * sort:类别
     */
    @Column(name = "sort")
    private Integer sorts;//类别

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    @Override
    public String toString() {
        return "UserAdmin{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userName='" + userName + '\'' +
                ", sorts=" + sorts +
                '}';
    }
}
