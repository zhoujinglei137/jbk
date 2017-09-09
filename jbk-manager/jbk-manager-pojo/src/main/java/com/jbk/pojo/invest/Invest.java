package com.jbk.pojo.invest;


import com.jbk.pojo.product.Product;
import com.jbk.pojo.user.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 刘铭 on 2017/9/5 0005.
 * 投资记录
 */

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_invest_record")
public class Invest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 投资人
     */
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    private User user;

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    public void setEarningsLimit(Double earningsLimit) {
        this.earningsLimit = earningsLimit;
    }

    /**
     * 状态码 状态（0/1/2/3/4）代付，已付，删除，正获利，可转让
     */
    @Column(name = "stats")
    private int stats;
    /**
     * 投资产品
     */
    @OneToOne(targetEntity = Product.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    private Product product;


    /**
     * 投资金额
     */
    @Column(name = "invest_limit")
    private Double investLimit;

    /**
     * 投资日期
     */
    @Column(name = "invest_date")
    private Date investDate;

    /**
     * 到期日
     */
    @Column(name = "earnings_date")
    private Date earningsDate;

    /**
     * 预期收益
     */
    @Transient
    private Double earningsLimit;

    public Long getId() {
        return id;
    }

    /***
     * 主键
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }

    /***
     * 投资人
     *
     * @return
     */
    public void setUser(User user) {
        this.user = user;
    }

    public Double getInvestLimit() {
        return investLimit;
    }

    /**
     * 投资金额
     *
     * @param investLimit
     */
    public void setInvestLimit(Double investLimit) {
        this.investLimit = investLimit;
    }

    public Date getInvestDate() {
        return investDate;
    }

    /**
     * 投资日期
     *
     * @param investDate
     */
    public void setInvestDate(Date investDate) {
        this.investDate = investDate;
    }

    public Date getEarningsDate() {
        return earningsDate;
    }

    /**
     * 到期日
     *
     * @param earningsDate
     */
    public void setEarningsDate(Date earningsDate) {
        this.earningsDate = earningsDate;
    }

    /**
     * 预期收益
     */
    public Double getEarningsLimit() {


        return earningsLimit;
    }


    public Product getProduct() {
        return product;
    }

    /**
     * 投资产品
     *
     * @param product
     */
    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "Invest{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", investLimit=" + investLimit +
                ", investDate=" + investDate +
                ", earningsDate=" + earningsDate +
                ", earningsLimit=" + earningsLimit +
                '}';
    }
}
