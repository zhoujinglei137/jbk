package com.jbk.pojo.user;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 用户名
     */
    @Column(name = "user_name" )
    private String userName;
    /**
     * 余额
     */
    @Column(name = "balance")
    private Double balance;
    /**
     * 会员等级
     */
    @Column(name = "lv")
    private Integer lv;
    /**
     * 积分数
     */
    @Column(name = "jf")
    private Integer jf;
    /**
     * 身份证号
     */
    @Column(name = "cardId")
    private Integer cardId;
    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;
    /**
     * 手机号
     */
    @Column(name = "tel")
    private Integer tel1;
    /**
     * 紧急联系人
     */
    @Column(name = "tel2")
    private Integer tel2;
    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;
    /**
     * 电话绑定状态
     */
    @Column(name = "tel_state")
    private Integer telState;

    /**
     * 邮箱绑定状态
     */
    @Column(name = "email_state")
    private Integer emailState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getJf() {
        return jf;
    }

    public void setJf(Integer jf) {
        this.jf = jf;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getTel1() {
        return tel1;
    }

    public void setTel1(Integer tel1) {
        this.tel1 = tel1;
    }

    public Integer getTel2() {
        return tel2;
    }

    public void setTel2(Integer tel2) {
        this.tel2 = tel2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelState() {
        return telState;
    }

    public void setTelState(Integer telState) {
        this.telState = telState;
    }

    public Integer getEmailState() {
        return emailState;
    }

    public void setEmailState(Integer emailState) {
        this.emailState = emailState;
    }
}
