package org.course.data.DAO.LoginDAO;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="login2")
public class LoginEntity {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;

        @Column
        private String username;

        @Column
        private String password;

}
