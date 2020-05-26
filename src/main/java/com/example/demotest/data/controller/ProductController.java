package com.example.demotest.data.controller;

import com.example.demotest.Service.ProductService;
import com.example.demotest.data.DAO.UserDAO.ProductEntiy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping(value = "/getProduct")
    public String getProduct(@RequestParam("pid") Long id, HttpSession httpSession){

        List<ProductEntiy> product = productService.findProductById(id);
        httpSession.setAttribute("product",product.get(0));
        return "/webjarpage/product.html";
    }
}
