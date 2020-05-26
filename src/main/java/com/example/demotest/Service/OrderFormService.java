package com.example.demotest.Service;

import com.example.demotest.data.DAO.DAO.OrderFormEntity;
import com.example.demotest.data.DAO.DAO.OrderFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFormService {
   @Autowired
   OrderFormRepository orderFormRepository;

   public int addOrderForm(Long buyerid,Long oproductid,String ostarttime,String oaddressee,String oaddress,Long ototalprice ){
       return orderFormRepository.addOrderForm(buyerid,oproductid,ostarttime,oaddressee,oaddress,ototalprice);
   }

   public List<OrderFormEntity> findCheckOrder(){
       return orderFormRepository.findOrderFormByOstatus("审核");
   }

   public int changeOrdertoCk(Long id){
       return orderFormRepository.changeOrderToCk(id);
   }

   public List<OrderFormEntity> findOrderByBuyerID(Long id){
       return orderFormRepository.findOrderFormByOid(id);
   }
}
