package com.jbk.service.impl.product;

import com.jbk.dao.product.ProductClassDao;
import com.jbk.dao.product.ProductDao;
import com.jbk.pojo.product.Product;
import com.jbk.pojo.product.ProductClass;
import com.jbk.product.vo.VProduct;
import com.jbk.service.proudct.ProductService;
import com.jbk.util.PageBean;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by 方雷 on 2017/9/6.
 */
@Service
@Scope(value="prototype")
public class ProductServiceImpl implements ProductService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ProductDao productDao;
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ProductClassDao productClassDao;
    /**
     * 需要参数：VProduct(不带主键的VO产品类)
     *  返回参数：Product（带主键的产品类）
     * 功能:添加一个产品（Product）
     * 创建时间：  2017/9/6.
     */
    @Override
    @Transactional
    public Product save(VProduct vProduct) throws ParseException {
        Date startDate = null;
        Date endDate = null;
        Date transDate = null;
        if(vProduct.getStartDate() != null && vProduct.getStartDate() != ""){
            startDate = new SimpleDateFormat().parse(vProduct.getStartDate());
        }else{
            startDate = null;
        }
        if(vProduct.getEndDate() != null && vProduct.getEndDate() != ""){
            endDate = new SimpleDateFormat().parse(vProduct.getEndDate());
        }else{
            endDate = null;
        }
        if (vProduct.getTransDate()!=null && vProduct.getTransDate()!=""){
            transDate=new SimpleDateFormat().parse(vProduct.getTransDate());
        }else{
            transDate = null;
        }
        List<ProductClass> productClasses = productClassDao.findByProductClassName(vProduct.getProductClassName());
        ProductClass productClass=null;
        if(productClasses.size()>0&&productClasses.size()==1){
           productClass =productClasses.get(0);
        }
        Product product = productDao.save(new Product(productClass,vProduct.getProdutName(),vProduct.getItemlimit(),vProduct.getInvestDeadline(),vProduct.getYearYield(),
                vProduct.getSpreadMargin(),vProduct.getGetlimit(),startDate,endDate,vProduct.getStartLimit(),transDate));
        return product;
    }
    /**
     * 需要参数：无
     *  返回参数：List<VProduct>（产品类的集合）
     * 功能:查询所有产品
     * 创建时间：  2017/9/6.
     */
    @Override
    @Transactional
    public PageBean<Product> findAll(PageDto pageDto,Product product) {
        System.out.println(product);
        System.out.println(pageDto);
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreNullValues();
        Example<Product> productExample = Example.of(product,exampleMatcher);
        Page<Product> page = productDao.findAll(productExample, pageDto);
        System.out.println(page.getContent().size());
        PageBean<Product> pageBean = new PageBean<>();
        pageBean.setRows(page.getContent());
        pageBean.setPageSize(page.getSize());
        pageBean.setPage(page.getNumber());
        pageBean.setTotal(page.getTotalElements());
        return pageBean;
    }

    @Override
    @Transactional
    public long count() {
        return productDao.getCount();
    }
    /**
     * 需要参数：产品名称
     *  返回参数：List<VProduct>（产品类的集合）
     * 功能:根据产品名称 模糊查询
     * 创建时间：  2017/9/6.
     */
    @Override
    @Transactional
    public List<Product> findByName(String name) {
        return productDao.findByProductName(name);
    }
    /**
     * 需要参数：id(主键值)
     *  返回参数：VProduct（带主键的产品类）
     * 功能:根据主键值 查询
     * 创建时间：  2017/9/6.
     */
    @Override
    @Transactional
    public Product findById(int id) {
        return productDao.findById(id);
    }
    /**
     * 需要参数：id(主键值)
     *  返回参数：int（产生变化的行数）
     * 功能:根据主键值 删除一行记录
     * 创建时间：  2017/9/6.
     */

    @Transactional
    @Override
    public int removeById(long[] ids) {
        return productDao.removeByIds(ids);
    }
}
