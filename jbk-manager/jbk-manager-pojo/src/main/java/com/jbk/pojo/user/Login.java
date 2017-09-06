package com.jbk.pojo.user;

import javax.persistence.*;
import java.util.Date;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/6
 * 项目名称 : jbk
 * 包的名称 : com.jbk.pojo.user
 * 说明 ：登录表
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_login")
public class Login {
    /**
     * id与用户表id相同
     */
    @Id
    @Column(name ="uid" )
    private int id;
    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;
    /**
     * 登录密码未加密
     */
    @Column(name = "pass_word")
    private String passWord;
    /**
     * 登录密码加密
     */
    @Column(name = "mi_pass_word")
    private String miPassWord;
    /**
     * 登录的IP地址
     */
    @Column(name = "login_ip")
    private String loginIp;
    /**
     * 登录的时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getMiPassWord() {
        return miPassWord;
    }

    public void setMiPassWord(String miPassWord) {
        this.miPassWord = miPassWord;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", miPassWord='" + miPassWord + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }
}
