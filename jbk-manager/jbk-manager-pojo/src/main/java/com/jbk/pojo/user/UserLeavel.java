package com.jbk.pojo.user;

import javax.persistence.*;

/**
 * Created by 刘铭 on 2017/9/9 0009.
 */

@Entity
@Table(name = "tb_userlv")
public class UserLeavel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 积分数
     */
    @Column(name = "jf")
    private Integer jf;

    /**
     * 等级名
     */
    @Column(name = "lv_name")
    private String name;

    /**
     * 代收本金
     */
    @Column(name = "duein_money")
    private Double duein_money;

    /**
     * 免费提现次数
     */
    @Column(name = "free_time")
    private Integer free_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJf() {
        return jf;
    }

    public void setJf(Integer jf) {
        this.jf = jf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuein_money() {
        return duein_money;
    }

    public void setDuein_money(Double duein_money) {
        this.duein_money = duein_money;
    }

    public Integer getFree_time() {
        return free_time;
    }

    public void setFree_time(Integer free_time) {
        this.free_time = free_time;
    }
}
