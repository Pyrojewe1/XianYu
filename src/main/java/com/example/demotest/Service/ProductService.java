package com.example.demotest.Service;

import com.example.demotest.data.DAO.DAO.ProductEntiy;
import com.example.demotest.data.DAO.DAO.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<ProductEntiy> findAllProduct(){
        return productRepository.findAllProduct();
    }

    public List<ProductEntiy> findProductById(Long pid ){return productRepository.findProductById(pid);}

    public int addProduct(String pname,String pdiscription,Long pnum,Long publisherid ,Long pcategoryid,Long pprcie,String ppicture){
        return productRepository.addProduct(pname,pdiscription,pnum,publisherid,pcategoryid,pprcie,ppicture);
    }
    public List<ProductEntiy> findCheckProduct(){return productRepository.findCheckProduct();}

    public int tryToBuyProduct(Long pid){
        return productRepository.tryToBuyProduct(pid);
    }

    public int changeProduct(Long pid){return productRepository.changeProduct(pid);}
    public List<ProductEntiy>  getProductsByCategory(Long cid){
        return productRepository.getProductsByCategory(cid);
    }



}


