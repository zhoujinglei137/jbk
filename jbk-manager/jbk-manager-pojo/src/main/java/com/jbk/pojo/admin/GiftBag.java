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
    private int id;
    /**
     * gb_name:礼包名
     */
    @Column(name="gb_name")
    private String gbName;
    /**
     * time:发放日期
     */
    @Column(name="time")
    private int time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGbName() {
        return gbName;
    }

    public void setGbName(String gbName) {
        this.gbName = gbName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
