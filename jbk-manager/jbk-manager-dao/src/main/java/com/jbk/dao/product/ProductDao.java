package com.jbk.dao.product;

import com.jbk.admin.vo.Result;
import com.jbk.pojo.product.Product;

import com.jbk.productutil.PageOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

/**
 * 创建人：方雷
 * 项目名称：聚宝坑
 * 功能:产品增删改查DAO层接口
 * 创建时间：  2017/9/6.
 */
public interface ProductDao extends JpaRepository<Product,Serializable> {
    @Query(nativeQuery = true,value = "select count(1) from tb_product")
    long getCount();

    Product save(Product product);

    List<Product> findByProductName(String name);

    Product findById(int id);

    @Modifying
    @Query(nativeQuery = true,value = "delete from tb_product where id in :ids")
    int removeByIds(@Param("ids")long[] ids);
}
