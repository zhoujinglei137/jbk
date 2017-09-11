package com.jbk.dao.product;

import com.jbk.pojo.product.ProductSafety;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * 创建人：方雷
 * 项目名称：聚宝坑
 * 功能:产品安全信息增删改查DAO层接口
 * 创建时间：  2017/9/6.
 */
public interface ProductSafetyDao extends JpaRepository<ProductSafety,Serializable> {
}
