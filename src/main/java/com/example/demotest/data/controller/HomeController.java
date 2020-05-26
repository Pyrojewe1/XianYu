package com.example.demotest.data.controller;

import com.example.demotest.Service.ProductService;
import com.example.demotest.data.DAO.UserDAO.ProductEntiy;
import com.example.demotest.data.domain.WebSite;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class HomeController {
    @Autowired
    ProductService productService;
    @RequestMapping(value="/getAllProduct", method= RequestMethod.GET)
    @ResponseBody
    public List<ProductEntiy> getProductData() {

        return productService.findAllProduct();
    }



}
