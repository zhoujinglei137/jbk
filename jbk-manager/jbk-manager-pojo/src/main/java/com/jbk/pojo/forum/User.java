package com.jbk.pojo.forum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 * 论坛用户类
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_user_f")
public class User {

    @Id
    private Integer uid;

    /**
     * 论坛中显示的用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户论坛等级
     */
    @Column(name = "lv" ,length = 11)
    private int lv;

    /**
     * 用户积分
     */
    @Column(name = "jf" )
    private int jf;

    /**
     * 用户余额
     */
    @Column(name = "balance" ,length = 11)
    private int balance;

    /**
     * 用户可用积分
     */
    @Column(name = "jf_ky" ,length = 11)
    private int availableIntegral;

    /**
     * 用户是否禁言 0禁1不禁
     */
    @Column(name = "banned" ,length = 1)
    private int banned;

    /**
     * 禁言时间 天为单位
     */
    @Column(name = "banned_time" ,length = 11)
    private int bannedTime;

    /**
     * 是否大V验证
     */
    @Column(name = "big_v" ,length = 11)
    private int bigV;

    /**
     * 注册时间
     */
    @Column(name = "create_date")
    private Date createDate;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getJf() {
        return jf;
    }

    public void setJf(int jf) {
        this.jf = jf;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAvailableIntegral() {
        return availableIntegral;
    }

    public void setAvailableIntegral(int availableIntegral) {
        this.availableIntegral = availableIntegral;
    }

    public int getBanned() {
        return banned;
    }

    public void setBanned(int banned) {
        this.banned = banned;
    }

    public int getBannedTime() {
        return bannedTime;
    }

    public void setBannedTime(int bannedTime) {
        this.bannedTime = bannedTime;
    }

    public int getBigV() {
        return bigV;
    }

    public void setBigV(int bigV) {
        this.bigV = bigV;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
