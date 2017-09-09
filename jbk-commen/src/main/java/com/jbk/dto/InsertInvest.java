package com.jbk.dto;

/**
 * Created by 刘铭 on 2017/9/6 0006.
 * 投资数据
 */
public class InsertInvest {

    private Integer pid;
    private Double InvestLimit;
    private Integer TimeLimit;


    /**
     * 所投资产品id
     * @return
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 所投资金额
     * @return
     */
    public Double getInvestLimit() {
        return InvestLimit;
    }

    public void setInvestLimit(Double investLimit) {
        InvestLimit = investLimit;
    }

    /**
     * 投资期限
     * @return
     */
    public Integer getTimeLimit() {
        return TimeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        TimeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return "InsertInvest{" +
                "pid=" + pid +
                ", InvestLimit=" + InvestLimit +
                ", TimeLimit=" + TimeLimit +
                '}';
    }
}
