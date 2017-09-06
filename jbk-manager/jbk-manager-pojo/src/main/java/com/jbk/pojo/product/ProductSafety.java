package com.jbk.pojo.product;

import javax.persistence.*;

/**
 * Created by 方雷 on 2017/9/5.
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
@Table(name = "tb_product_question")
public class ProductSafety {
    @Id
    private int id;
    /**
     * 所属类别
     */
    @OneToOne(targetEntity = ProductClass.class,fetch = FetchType.EAGER)
    @JoinColumn(name ="pcid" )
    private ProductClass productClass;
    /**
     * 安全故障信息
     */
    @Column(name = "safety_introduce" )
    private String safetyIntroduce;
    /**
     * 安全信息问题解决方案
     */
    @Column(name = "safety_solve" )
    private String safetySolve;

    public ProductSafety() {
    }

    public ProductSafety(int id, ProductClass productClass, String safetyIntroduce, String safetySolve) {
        this.id = id;
        this.productClass = productClass;
        this.safetyIntroduce = safetyIntroduce;
        this.safetySolve = safetySolve;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductClass getProductClass() {
        return productClass;
    }

    public void setProductClass(ProductClass productClass) {
        this.productClass = productClass;
    }

    public String getSafetyIntroduce() {
        return safetyIntroduce;
    }

    public void setSafetyIntroduce(String safetyIntroduce) {
        this.safetyIntroduce = safetyIntroduce;
    }

    public String getSafetySolve() {
        return safetySolve;
    }

    public void setSafetySolve(String safetySolve) {
        this.safetySolve = safetySolve;
    }

    @Override
    public String toString() {
        return "ProductSafety{" +
                "id=" + id +
                ", productClass=" + productClass +
                ", safetyIntroduce='" + safetyIntroduce + '\'' +
                ", safetySolve='" + safetySolve + '\'' +
                '}';
    }
}
