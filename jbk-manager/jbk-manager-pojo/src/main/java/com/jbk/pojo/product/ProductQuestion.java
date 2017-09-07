package com.jbk.pojo.product;

import javax.persistence.*;

/**
 * 创建人：方雷
 * 项目名称：聚宝坑
 * 功能:产品常见问题类
 * 创建时间：  2017/9/5.
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_product_question")
public class ProductQuestion {
    @Id
    private int id;
    /**
     * 所属类别
     */
    @OneToOne(targetEntity = ProductClass.class,fetch = FetchType.EAGER)
    @JoinColumn(name ="pcid" )
    private ProductClass productClass;
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

    public ProductQuestion() {
    }

    public ProductQuestion(int id, ProductClass productClass, String question, String solve) {
        this.id = id;
        this.productClass = productClass;
        this.question = question;
        this.solve = solve;
    }

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

    public void setQuestion(String question) {
        this.question = question;
    }

    public ProductClass getProductClass() {
        return productClass;
    }

    public void setProductClass(ProductClass productClass) {
        this.productClass = productClass;
    }

    @Override
    public String toString() {
        return "ProductQuestion{" +
                "id=" + id +
                ", productClass=" + productClass +
                ", question='" + question + '\'' +
                ", solve='" + solve + '\'' +
                '}';
    }
}
