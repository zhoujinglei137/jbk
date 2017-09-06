package com.jbk.pojo.admin;

import javax.persistence.*;

/**
 * 创建人： 姚鹏
 * 项目名称：聚宝坑
 * 功能：礼券表
 * 创建时间 ：2017/9/5
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name="tb_gc")
public class GiftCertificate {
    /**
     * id:主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * gcName：礼券名称
     */
    @Column(name="gc_name")
    private String gcName;
    /**
     * gcMoney：礼券金额
     */
    @Column(name="gc_money")
    private double gcMoney;
    /**
     * gcScop：礼券使用范围（多少钱可用）
     */
    @Column(name="gc_scop")
    private double gcScop;
    /**
     * indate：有效期
     */
    @Column(name="indate")
    private int indate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

    public double getGcMoney() {
        return gcMoney;
    }

    public void setGcMoney(double gcMoney) {
        this.gcMoney = gcMoney;
    }

    public double getGcScop() {
        return gcScop;
    }

    public void setGcScop(double gcScop) {
        this.gcScop = gcScop;
    }

    public int getIndate() {
        return indate;
    }

    public void setIndate(int indate) {
        this.indate = indate;
    }
}
