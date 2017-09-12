package com.jbk.web.product;

import com.jbk.pojo.product.Product;
import com.jbk.pojo.product.ProductClass;
import com.jbk.service.proudct.ProductService;
import com.jbk.util.PageBean;
import com.jbk.util.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/9/7.
 */
@Controller
@Scope("prototype")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("product/{url}")
    public String getUrl1(@PathVariable() String url){
        System.out.println("刘铭好坑啊！！！！！！！！");
        return "product/"+url;
    }
    @RequestMapping("products")
    @ResponseBody
    public PageBean<Product> listProducts(PageDto pageDto,Product product){
       return  productService.findAll(pageDto,product);
    }
    @RequestMapping("product/delete")
    @ResponseBody
    public int deleteProducts(@RequestParam("ids[]")long[] ids){
        return productService.removeById(ids);
    }

    @RequestMapping("/")
    public String getProducts(Model model){

        Product product = new Product();
        ProductClass productClass = new ProductClass();
        productClass.setId(1);
        product.setProductClass(productClass);
        PageDto pageDto = new PageDto();
        pageDto.setPage(1);
        pageDto.setRows(2);
        List<Product> products1 = productService.findAll(pageDto,product).getRows();
        productClass.setId(2);
        List<Product> products2 = productService.findAll(pageDto,product).getRows();
        model.addAttribute("products1",products1);
        model.addAttribute("products2",products2);
        return  "home";
    }

    @RequestMapping("/product/get")
    public String getProduct(Integer pid,Model model){
        model.addAttribute("product",productService.findById(pid));
        return "detail";
    }

}
