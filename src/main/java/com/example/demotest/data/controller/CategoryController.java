package com.example.demotest.data.controller;

import com.example.demotest.Service.CategoryService;
import com.example.demotest.data.DAO.DAO.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping(value = "/getAllCategories")
    @ResponseBody
    public List<CategoryEntity> findAllCategories(){
        return categoryService.findAllCategories();
    }
}
