package com.jbk.service.impl.product;

import com.jbk.dao.product.ProductClassDao;
import com.jbk.pojo.product.ProductClass;
import com.jbk.service.proudct.ProductClassService;
import com.jbk.util.PageBean;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/9/7.
 */
@Service
@Scope(value="prototype")
public class ProductClassServiceImpl implements ProductClassService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ProductClassDao productClassDao;
    @Override
    @Transactional
    public List<ProductClass> findByProductClassName(String productClassName) {
        return productClassDao.findByProductClassName(productClassName);
    }
    @Transactional
    @Override
    public ProductClass findById(int id) {
        return productClassDao.findById(id);
    }

    @Override
    public PageBean<ProductClass> findAll(PageDto pageDto, ProductClass productClass) {
        System.out.println(productClass);
        System.out.println(pageDto);
        ExampleMatcher exampleMatcher =  ExampleMatcher.matchingAll().withIgnoreNullValues().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreCase();
        Example<ProductClass> productClassExample = Example.of(productClass,exampleMatcher);
        Page<ProductClass> page = productClassDao.findAll(productClassExample,pageDto);
        System.out.println(page.getContent().size());
        PageBean<ProductClass> pageBean = new PageBean<>();
        pageBean.setRows(page.getContent());
        pageBean.setPageSize(page.getSize());
        pageBean.setPage(page.getNumber());
        pageBean.setTotal(page.getTotalElements());
        return pageBean;
    }

    @Transactional
    @Override
    public ProductClass save(ProductClass productClass) {

        return productClassDao.save(productClass);
    }

    @Override
    @Transactional
    public int removeById(long[] ids) {
        return productClassDao.removeByIds(ids);
    }



}
