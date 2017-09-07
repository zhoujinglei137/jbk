package com.jbk.dao.product;


import com.jbk.pojo.product.ProductClass;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;


/**
 * 创建人：方雷
 * 项目名称：聚宝坑
 * 功能:产品类别增删改查DAO层接口
 * 创建时间：  2017/9/6.
 */
public interface ProductClassDao extends CrudRepository<ProductClass,Serializable> {
    List<ProductClass> findByProductClassName(String productClassName);

    ProductClass findById(int id);

    List<ProductClass> findAll();

    ProductClass save(ProductClass productClass);

    @Modifying
    @Query(nativeQuery = true,value = "delete from tb_product_class where id=?1")
    int removeById(int id);

}
