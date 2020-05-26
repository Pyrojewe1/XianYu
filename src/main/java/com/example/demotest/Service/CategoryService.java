package com.example.demotest.Service;

import com.example.demotest.data.DAO.DAO.CategoryEntity;
import com.example.demotest.data.DAO.DAO.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

   public List<CategoryEntity> findAllCategories(){
        return categoryRepository.findAllCategories();
    }
}
