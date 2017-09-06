package com.jbk.dto;

/**
 * Created by 刘铭 on 2017/9/6 0006.
 * 投资数据
 */
public class InsertInvest {

    private int pid;
    private double InvestLimit;
    private int TimeLimit;


    /**
     * 所投资产品id
     * @return
     */
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * 所投资金额
     * @return
     */
    public double getInvestLimit() {
        return InvestLimit;
    }

    public void setInvestLimit(double investLimit) {
        InvestLimit = investLimit;
    }

    /**
     * 投资期限
     * @return
     */
    public int getTimeLimit() {
        return TimeLimit;
    }

    public void setTimeLimit(int timeLimit) {
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
