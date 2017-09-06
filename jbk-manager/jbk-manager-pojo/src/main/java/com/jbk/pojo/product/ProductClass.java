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
@Table(name = "tb_product_class")
public class ProductClass {
    @Id
    private int id;
    /**
     * 产品类别名称
     */
    @Column(name = "product_class_name" )
    private String productClassName;
    /**
     * 产品类别简介
     */
    @Column(name = "introduce" )
    private String introduce;
    /**
     * 产品交易结构，这里放的是图片的url
     */
    @Column(name = "structure" )
    private String structure;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductClassName() {
        return productClassName;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getStyucture() {
        return structure;
    }

    public void setStyucture(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "id=" + id +
                ", productClassName='" + productClassName + '\'' +
                ", introduce='" + introduce + '\'' +
                ", styucture='" + structure + '\'' +
                '}';
    }
}
