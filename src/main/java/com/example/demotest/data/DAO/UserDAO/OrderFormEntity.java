package com.example.demotest.data.DAO.UserDAO;

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
    @Column
    private  Long oid;
    @Column
    private  Long ototalprice;
    @Column
    private Long buyerid;

    @Enumerated(EnumType.STRING)
    @Column
    private Ostatus ostatus;
}
