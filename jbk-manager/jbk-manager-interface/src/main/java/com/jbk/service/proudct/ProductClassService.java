package com.jbk.service.proudct;

import com.jbk.pojo.product.ProductClass;

import java.util.List;

/**
 * Created by 方雷on 2017/9/7.
 */
public interface ProductClassService {
    List<ProductClass> findByProductClassName(String productClassName);

    ProductClass findById(int id);

    List<ProductClass> findAll();

    ProductClass save(ProductClass productClass);

    int removeById(int id);
}
