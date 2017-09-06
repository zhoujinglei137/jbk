package com.jbk.pojo.product;



import javax.persistence.*;
import java.util.Date;

/**
 * Created by 方雷 on 2017/9/5.
 */

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * 所属产品类别
     */
    @OneToOne(targetEntity = ProductClass.class,fetch = FetchType.EAGER)
    @JoinColumn(name ="pcid" )
    private ProductClass productClass;
    /**
     * 产品名称
     */
    @Column(name = "name" )
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

    public Product() {
    }

    public Product(ProductClass productClass, String productName, double itemlimit, String investDeadline, double yearYield, double spreadMargin, double getlimit, Date startDate, Date endDate, double startLimit, Date transDate) {
        this.productClass = productClass;
        this.productName = productName;
        this.itemlimit = itemlimit;
        this.investDeadline = investDeadline;
        this.yearYield = yearYield;
        this.spreadMargin = spreadMargin;
        this.getlimit = getlimit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startLimit = startLimit;
        this.transDate = transDate;
    }

    public ProductClass getProductClass() {
        return productClass;
    }

    public void setProductClass(ProductClass productClass) {
        this.productClass = productClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", productClass=" + productClass +
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
