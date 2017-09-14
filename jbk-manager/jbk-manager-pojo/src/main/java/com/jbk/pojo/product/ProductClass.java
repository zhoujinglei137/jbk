package com.jbk.pojo.product;

import javax.persistence.*;

/**
 * 创建人：方雷
 * 项目名称：聚宝坑
 * 功能:产品类别类
 * 创建时间：  2017/9/5.
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_product_class")
public class ProductClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 产品类别名称
     */
    @Column(name = "name" ,unique =true)
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

    public ProductClass(String productClassName, String introduce, String structure) {
        this.productClassName = productClassName;
        this.introduce = introduce;
        this.structure = structure;
    }

    public ProductClass() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "id=" + id +
                ", productClassName='" + productClassName + '\'' +
                ", introduce='" + introduce + '\'' +
                ", structure='" + structure + '\'' +
                '}';
    }
}
