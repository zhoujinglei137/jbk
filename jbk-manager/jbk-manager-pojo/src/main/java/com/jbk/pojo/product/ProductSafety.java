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
public class ProductSafety {
    @Id
    private int id;
    /**
     * 产品类别id
     */
    @Column(name = "pcid" )
    private int pcid;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPcid() {
        return pcid;
    }

    public void setPcid(int pcid) {
        this.pcid = pcid;
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
                ", pcid=" + pcid +
                ", safetyIntroduce='" + safetyIntroduce + '\'' +
                ", safetySolve='" + safetySolve + '\'' +
                '}';
    }
}
