package com.example.demotest.data.DAO.DAO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class ProductEntiy {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long pid;

    @Column
    private String pname;

    @Column
    private String pdiscription;

    @Column
    private boolean pcheck;

    @Column
    private Long publisherid;

    @Column
    private Long pcategoryid;

    @Column
    private Long pprice;

    @Column
    private Long pnum;

    @Column
    private String ppicture;

    @Column
    private boolean buying;





}
