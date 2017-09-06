package com.jbk.dao.product;


import com.jbk.pojo.product.ProductClass;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;



/**
 * Created by 方雷 on 2017/9/6.
 */
public interface ProductClassDao extends CrudRepository<ProductClass,Serializable> {
}
