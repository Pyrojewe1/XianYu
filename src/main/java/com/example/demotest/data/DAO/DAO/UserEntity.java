package com.example.demotest.data.DAO.DAO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class UserEntity {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;

        @Column
        private String username;

        @Column
        private String password;

        @Column
        private String headurl;

}
