package com.example.demotest.data.DAO.DAO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long commentid;

    @Column
    private String  commentcontent;

    @Column
    private Long commentoid;

    @Column
    private Long commentuid;
}
