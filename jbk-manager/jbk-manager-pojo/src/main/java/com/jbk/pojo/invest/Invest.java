package com.jbk.pojo.invest;

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
    @OneToOne(targetEntity = User.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    private User user;

    //private Product product;

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
    @Column(name = "earnings_limit")
    private Double earningsLimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getInvestLimit() {
        return investLimit;
    }

    public void setInvestLimit(Double investLimit) {
        this.investLimit = investLimit;
    }

    public Date getInvestDate() {
        return investDate;
    }

    public void setInvestDate(Date investDate) {
        this.investDate = investDate;
    }

    public Date getEarningsDate() {
        return earningsDate;
    }

    public void setEarningsDate(Date earningsDate) {
        this.earningsDate = earningsDate;
    }

    public Double getEarningsLimit() {
        return earningsLimit;
    }

    public void setEarningsLimit(Double earningsLimit) {
        this.earningsLimit = earningsLimit;
    }
}
