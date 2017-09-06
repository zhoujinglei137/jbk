package com.jbk.dao.product;

import com.jbk.pojo.product.ProductSafety;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by 方雷 on 2017/9/6.
 */
public interface ProductSafetyDao extends JpaRepository<ProductSafety,Serializable> {
}
