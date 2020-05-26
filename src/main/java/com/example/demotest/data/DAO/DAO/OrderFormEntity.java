package com.example.demotest.data.DAO.DAO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orderform")
public class OrderFormEntity {

    public enum Ostatus {
        完成,
        审核,
        交易中;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long oid;
    @Column
    private  Long ototalprice;
    @Column
    private Long buyerid;

    @Enumerated(EnumType.STRING)
    @Column
    private Ostatus ostatus;

    @Column
    private String  ostarttime;

    @Column
    private String  oendtime;


    @Column
    private String  oaddressee;


    @Column
    private String  oaddress;

    @Column
    private Long oproductid;






}
