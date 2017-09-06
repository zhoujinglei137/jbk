package com.jbk.pojo.product;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 方雷 on 2017/9/5.
 */

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    private int id;
    /**
     * 产品类别id
     */
    @Column(name = "pcid" )
    private int pcid;
    /**
     * 产品名称
     */
    @Column(name = "product_name" )
    private String productName;
    /**
     * 项目总额
     */
    @Column(name = "itemlimit" )
    private double itemlimit;
    /**
     * 投资期限
     */
    @Column(name = "invest_deadline" )
    private String investDeadline;
    /**
     * 年收益率
     */
    @Column(name = "year_yield" )
    private double yearYield;
    /**
     * 加息率
     */
    @Column(name = "spread_margin" )
    private double spreadMargin;
    /**
     * 获得总额
     */
    @Column(name = "getlimit" )
    private double getlimit;
    /**
     * 开投日期
     */
    @Column(name = "start_date" )
    private Date startDate;
    /**
     * 截止日期
     */
    @Column(name = "end_date" )
    private Date endDate;
    /**
     * 起投金额
     */
    @Column(name = "start_limit" )
    private double startLimit;
    /**
     * 转让日期
     */
    @Column(name = "trans_date" )
    private Date transDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPcid() {
        return pcid;
    }

    public void setPcid(int pcid) {
        this.pcid = pcid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getItemlimit() {
        return itemlimit;
    }

    public void setItemlimit(double itemlimit) {
        this.itemlimit = itemlimit;
    }

    public String getInvestDeadline() {
        return investDeadline;
    }

    public void setInvestDeadline(String investDeadline) {
        this.investDeadline = investDeadline;
    }

    public double getYearYield() {
        return yearYield;
    }

    public void setYearYield(double yearYield) {
        this.yearYield = yearYield;
    }

    public double getSpreadMargin() {
        return spreadMargin;
    }

    public void setSpreadMargin(double spreadMargin) {
        this.spreadMargin = spreadMargin;
    }

    public double getGetlimit() {
        return getlimit;
    }

    public void setGetlimit(double getlimit) {
        this.getlimit = getlimit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getStartLimit() {
        return startLimit;
    }

    public void setStartLimit(double startLimit) {
        this.startLimit = startLimit;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pcid=" + pcid +
                ", productName='" + productName + '\'' +
                ", itemlimit=" + itemlimit +
                ", investDeadline='" + investDeadline + '\'' +
                ", yearYield=" + yearYield +
                ", spreadMargin=" + spreadMargin +
                ", getlimit=" + getlimit +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", startLimit=" + startLimit +
                ", transDate=" + transDate +
                '}';
    }
}
