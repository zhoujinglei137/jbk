package com.jbk.service.impl.product;

import com.jbk.dao.product.ProductClassDao;
import com.jbk.pojo.product.ProductClass;
import com.jbk.service.proudct.ProductClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
    @Transactional
    @Override
    public List<ProductClass> findAll() {
        return productClassDao.findAll();
    }
    @Transactional
    @Override
    public ProductClass save(ProductClass productClass) {

        return productClassDao.save(productClass);
    }
    @Transactional
    @Override
    public int removeById(int id) {
        return productClassDao.removeById(id);
    }
}
