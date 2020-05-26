package com.example.demotest.data.DAO.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OrderFormRepository extends JpaRepository<OrderFormEntity,Long> {
    @Query(value = "select * from orderform a where a.buyerid=?1 ", nativeQuery = true )
    List<OrderFormEntity> findOrderFormByOid( Long buyerid);

    @Transactional
    @Modifying
    @Query(value = "insert into orderform(buyerid,oproductid,ostarttime,oaddressee,oaddress,ototalprice) values(?1,?2,?3,?4,?5,?6)",nativeQuery = true)
    int addOrderForm(Long buyerid,Long oproductid,String ostarttime,String oaddressee,String oaddress,Long ototalprice );

    @Query(value = "select * from orderform a where a.ostatus=?1 ", nativeQuery = true )
    List<OrderFormEntity> findOrderFormByOstatus(String ostatus);

    @Transactional
    @Modifying
    @Query(value = "update orderform set ostatus='交易中' where oid=?1",nativeQuery = true)
    int changeOrderToCk(Long oid );





}
