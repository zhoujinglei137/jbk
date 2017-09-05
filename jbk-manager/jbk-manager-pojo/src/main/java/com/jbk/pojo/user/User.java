package com.jbk.pojo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 作者 ： 周京磊
 * 创建日期 : 2017/9/5
 * 项目名称 : jbk
 * 包的名称 : com.jbk.dao.user
 * 说明 ：用户类
 */

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    private int id;
    /**
     * 用户名
     */
    @Column(name = "user_name" )
    private String userName;
    /**
     * 余额
     */
    @Column(name = "balance")
    private int balance;
    /**
     * 会员等级
     */
    @Column(name = "lv")
    private int lv;
    /**
     * 积分数
     */
    @Column(name = "jf")
    private int jf;
    /**
     * 身份证号
     */
    @Column(name = "cardId")
    private int cardId;
    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;
    /**
     * 手机号
     */
    @Column(name = "tel")
    private int tel1;
    /**
     * 紧急联系人
     */
    @Column(name = "tel2")
    private int tel2;
    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;
    /**
     * 电话绑定状态
     */
    @Column(name = "tel_state")
    private int telState;

    /**
     * 邮箱绑定状态
     */
    @Column(name = "email_state")
    private int emailState;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getTel1() {
        return tel1;
    }

    public void setTel1(int tel1) {
        this.tel1 = tel1;
    }

    public int getTel2() {
        return tel2;
    }

    public void setTel2(int tel2) {
        this.tel2 = tel2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelState() {
        return telState;
    }

    public void setTelState(int telState) {
        this.telState = telState;
    }

    public int getEmailState() {
        return emailState;
    }

    public void setEmailState(int emailState) {
        this.emailState = emailState;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                ", lv=" + lv +
                ", jf=" + jf +
                ", cardId=" + cardId +
                ", birthday=" + birthday +
                ", tel1=" + tel1 +
                ", tel2=" + tel2 +
                ", email='" + email + '\'' +
                ", telState=" + telState +
                ", emailState=" + emailState +
                '}';
    }
}
