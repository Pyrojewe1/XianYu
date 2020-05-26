package com.example.demotest.data.DAO.DAO;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long cid;

    @Column
    private String cname;

    @Column
    private String cdiscription;
}
