package com.example.demotest.data.controller;

import com.example.demotest.Service.ProductService;
import com.example.demotest.data.Bean.Category;
import com.example.demotest.data.Bean.Product;
import com.example.demotest.data.Bean.Product2;
import com.example.demotest.data.DAO.DAO.ProductEntiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class ProductController {
    @Autowired
    ProductService productService;

    @ResponseBody
    @PostMapping(value = "/getProduct")
    public ProductEntiy getProduct(@RequestBody Product product){
        List<ProductEntiy> products = productService.findProductById(product.getPid());
        return products.get(0);
    }

    @RequestMapping(value="/getAllProducts", method= RequestMethod.GET)
    @ResponseBody
    public List<ProductEntiy> getProduct() {
        return productService.findAllProduct();
    }

    @ResponseBody
    @PostMapping(value = "/addProduct")
    public int addProduct(@RequestBody Product2 product){
        return productService.addProduct(product.getPname(),product.getPdiscription(),Long.valueOf(1),Long.valueOf(1),product.getPcategoryid(),product.getPprice(),product.getPpicture());
    }

    @RequestMapping(value="/getCheckProduct", method= RequestMethod.GET)
    @ResponseBody
    public List<ProductEntiy> getCheckProduct() {
        return productService.findCheckProduct();

    }

    @ResponseBody
    @PostMapping(value = "/changeProduct")
    public int changeProduct(@RequestBody Product product){
        return productService.changeProduct(product.getPid());
    }

    @ResponseBody
    @PostMapping(value = "/getProductsByCategory")
    public List<ProductEntiy> getProductsByCategory(@RequestBody Category category){
        return productService.getProductsByCategory(category.getCid());
    }


}
