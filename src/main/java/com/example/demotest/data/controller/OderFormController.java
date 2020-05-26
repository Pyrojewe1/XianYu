package com.example.demotest.data.controller;

import com.example.demotest.Service.OrderFormService;
import com.example.demotest.Service.ProductService;
import com.example.demotest.data.Bean.OderForm;
import com.example.demotest.data.DAO.DAO.OrderFormEntity;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@CrossOrigin
public class OderFormController {
    @Autowired
    OrderFormService orderFormService;
    @Autowired
    ProductService productService;
    @ResponseBody
    @PostMapping(value = "/createOrder")
    public boolean ceateOder(@RequestBody OderForm orderForm){
        if(orderFormService.addOrderForm(Long.valueOf(1),orderForm.getOproductid(),"2020-4-11","wangyan","beijing",orderForm.getOtotalprice())>0&& productService.tryToBuyProduct(orderForm.getOproductid())>0) {

            return true;
        }
        else return false;
    }

    @ResponseBody
    @GetMapping(value="/getCheckOrder")
    public List<OrderFormEntity> findCheckOrder(){
        return orderFormService.findCheckOrder();
    }

    @ResponseBody
    @PostMapping(value="/changeOrder")
    public int changeOrderToCk(@RequestBody OderForm oderForm ){
        return orderFormService.changeOrdertoCk(oderForm.getOid());
    }


    @ResponseBody
    @PostMapping(value = "/buyersOrder")
    public List<OrderFormEntity> findOrderByBuyerID(@RequestBody OderForm oderForm){
        return orderFormService.findOrderByBuyerID(oderForm.getBuyerid());
    }

}
