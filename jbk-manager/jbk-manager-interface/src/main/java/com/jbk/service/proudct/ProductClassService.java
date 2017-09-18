package com.jbk.service.proudct;

import com.jbk.pojo.product.ProductClass;
import com.jbk.util.PageBean;
import com.jbk.util.PageDto;

import java.util.List;

/**
 * Created by 方雷on 2017/9/7.
 */
public interface ProductClassService {
    List<ProductClass> findByProductClassName(String productClassName);

    ProductClass findById(int id);

    PageBean<ProductClass> findAll(PageDto pageDto,ProductClass productClass);

    ProductClass save(ProductClass productClass);

    int removeById(long[] ids);
}
