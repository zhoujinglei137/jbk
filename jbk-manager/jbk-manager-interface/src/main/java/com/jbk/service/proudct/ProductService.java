package com.jbk.service.proudct;


import com.jbk.pojo.product.Product;
import com.jbk.product.vo.VProduct;

import java.text.ParseException;
import java.util.List;

/**
 * Created by 方雷 on 2017/9/6.
 */
public interface ProductService {

    /**
     * 需要参数：VProduct(不带主键的产品类)
     *  返回参数：VProduct（带主键的产品类）
     * 功能:添加一个产品（VProduct）
     * 创建时间：  2017/9/6.
     */
    Product save(VProduct vproduct) throws ParseException;
    /**
     * 需要参数：无
     *  返回参数：List<VProduct>（产品类的集合）
     * 功能:查询所有产品
     * 创建时间：  2017/9/6.
     */
    List<Product> findAll();
    /**
     * 需要参数：无
     *  返回参数：long （产品的总条数）
     * 功能:查询所有的产品条数
     * 创建时间：  2017/9/6.
     */
    long count();
    /**
     * 需要参数：产品名称
     *  返回参数：List<VProduct>（产品类的集合）
     * 功能:根据产品名称 模糊查询
     * 创建时间：  2017/9/6.
     */
    List<Product> findByName(String name);
    /**
     * 需要参数：id(主键值)
     *  返回参数：VProduct（带主键的产品类）
     * 功能:根据主键值 查询
     * 创建时间：  2017/9/6.
     */
    Product findById(int id);
    /**
     * 需要参数：id(主键值)
     *  返回参数：int（产生变化的行数）
     * 功能:根据主键值 删除一行记录
     * 创建时间：  2017/9/6.
     */
    int removeById(int id);
}
