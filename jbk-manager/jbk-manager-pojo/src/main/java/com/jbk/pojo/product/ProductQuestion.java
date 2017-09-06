package com.jbk.pojo.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 方雷 on 2017/9/5.
 */

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_product_question")
public class ProductQuestion {
    @Id
    private int id;
    /**
     * 产品类别id
     */
    @Column(name = "pcid" )
    private int pcid;
    /**
     * 常见问题
     */
    @Column(name = "question" )
    private String question;
    /**
     * 问题解决方案
     */
    @Column(name = "solve" )
    private String solve;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "ProductQuestion{" +
                "id=" + id +
                ", pcid=" + pcid +
                ", question='" + question + '\'' +
                ", solve='" + solve + '\'' +
                '}';
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPcid() {
        return pcid;
    }

    public void setPcid(int pcid) {
        this.pcid = pcid;
    }
}
