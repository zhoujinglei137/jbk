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
    private Integer id;
    /**
     * 所属产品类别
     */
    @ManyToOne(targetEntity = ProductClass.class,fetch = FetchType.EAGER)
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
    private Double itemlimit;
    /**
     * 投资期限
     */
    @Column(name = "invest_deadline" )
    private String investDeadline;
    /**
     * 年收益率
     */
    @Column(name = "year_yield" )
    private Double yearYield;
    /**
     * 加息率
     */
    @Column(name = "spread_margin" )
    private Double spreadMargin;
    /**
     * 获得总额
     */
    @Column(name = "getlimit" )
    private Double getlimit;
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
    private Double startLimit;
    /**
     * 转让日期
     */
    @Column(name = "trans_date" )
    private Date transDate;

    public Product() {
    }

    public Product(ProductClass productClass, String productName, Double itemlimit, String investDeadline, Double yearYield, Double spreadMargin, double getlimit, Date startDate, Date endDate, double startLimit, Date transDate) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductClass getProductClass() {
        return productClass;
    }

    public void setProductClass(ProductClass productClass) {
        this.productClass = productClass;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getItemlimit() {
        return itemlimit;
    }

    public void setItemlimit(Double itemlimit) {
        this.itemlimit = itemlimit;
    }

    public String getInvestDeadline() {
        return investDeadline;
    }

    public void setInvestDeadline(String investDeadline) {
        this.investDeadline = investDeadline;
    }

    public Double getYearYield() {
        return yearYield;
    }

    public void setYearYield(Double yearYield) {
        this.yearYield = yearYield;
    }

    public Double getSpreadMargin() {
        return spreadMargin;
    }

    public void setSpreadMargin(Double spreadMargin) {
        this.spreadMargin = spreadMargin;
    }

    public Double getGetlimit() {
        return getlimit;
    }

    public void setGetlimit(Double getlimit) {
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

    public Double getStartLimit() {
        return startLimit;
    }

    public void setStartLimit(Double startLimit) {
        this.startLimit = startLimit;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }
}
