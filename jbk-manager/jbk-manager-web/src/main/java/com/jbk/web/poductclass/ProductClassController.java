package com.jbk.web.poductclass;

import com.jbk.pojo.product.ProductClass;
import com.jbk.service.proudct.ProductClassService;
import com.jbk.util.PageBean;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Scope("prototype")
public class ProductClassController {
    @Autowired
    private ProductClassService productClassService;
    @RequestMapping("productclass/{url}")
    public String getUrl1(@PathVariable() String url){
        System.out.println("刘铭好坑啊！！！！！！！！");
        return "productclass/"+url;
    }
    @RequestMapping("productclasses")
    @ResponseBody
    public PageBean<ProductClass> listProducts(PageDto pageDto,ProductClass productClass){
       return  productClassService.findAll(pageDto,productClass);
    }
    @RequestMapping("productclass/delete")
    @ResponseBody
    public int deleteProductClasses(@RequestParam("ids[]")long[] ids){
        return productClassService.removeById(ids);
    }

    @RequestMapping(value = "padd",method = RequestMethod.POST)
    @ResponseBody
    public  ProductClass saveProductClass(ProductClass productClass){
        return productClassService.save(productClass);
    }

}
