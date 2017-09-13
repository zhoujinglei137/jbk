package com.jbk.product.vo;


/**
 * Created by 方雷 on 2017/9/6.
 * 产品的vo类
 */
public class VProduct {
    private int id;
    private String productClassName;
    private String produtName;
    private double itemlimit;
    private int  investDeadline;
    private double yearYield;
    private double spreadMargin;
    private double getlimit;
    private String startDate;
    private String endDate;
    private double startLimit;
    private int transDate;


    public VProduct( String productClassName, String produtName, int investDeadline, double itemlimit, double yearYield, double spreadMargin, double getlimit, String startDate, String endDate, double startLimit, int transDate) {
        this.productClassName = productClassName;
        this.produtName = produtName;
        this.investDeadline = investDeadline;
        this.itemlimit = itemlimit;
        this.yearYield = yearYield;
        this.spreadMargin = spreadMargin;
        this.getlimit = getlimit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startLimit = startLimit;
        this.transDate = transDate;

    }

    public VProduct() {
    }

    public VProduct(int id, String produtName, String  productClassName, double itemlimit, int investDeadline, double yearYield, double spreadMargin, double getlimit, String startDate, String endDate, double startLimit, int transDate) {
        this.id = id;
        this.produtName = produtName;
        this.productClassName = productClassName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutName() {
        return produtName;
    }

    public String getProductClassName() {
        return productClassName;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName;
    }

    public void setProdutName(String produtName) {
        this.produtName = produtName;
    }

    public double getItemlimit() {
        return itemlimit;
    }

    public void setItemlimit(double itemlimit) {
        this.itemlimit = itemlimit;
    }

    public int getInvestDeadline() {
        return investDeadline;
    }

    public void setInvestDeadline(int investDeadline) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getStartLimit() {
        return startLimit;
    }

    public void setStartLimit(double startLimit) {
        this.startLimit = startLimit;
    }

    public int getTransDate() {
        return transDate;
    }

    public void setTransDate(int transDate) {
        this.transDate = transDate;
    }
}
