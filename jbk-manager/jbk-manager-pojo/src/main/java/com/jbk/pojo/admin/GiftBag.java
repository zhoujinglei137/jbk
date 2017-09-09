package com.jbk.pojo.admin;

import javax.persistence.*;

/**
 * 创建人： 姚鹏
 * 项目名称：
 * 功能：
 * 创建时间 ：2017/9/5
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="tb_gb")
public class GiftBag {
    /**
     * id:主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * gb_name:礼包名
     */
    @Column(name="gb_name")
    private String gbName;
    /**
     * time:发放日期
     */
    @Column(name="time")
    private Integer time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGbName() {
        return gbName;
    }

    public void setGbName(String gbName) {
        this.gbName = gbName;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
