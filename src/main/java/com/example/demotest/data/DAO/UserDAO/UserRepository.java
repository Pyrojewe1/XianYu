package com.example.demotest.data.DAO.LoginDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    @Query(value = "select * from user a where a.username=?1 and a.password=?2", nativeQuery = true )
    List<UserEntity> isLogin(@Param("username") String username, @Param("password") String password);

    @Transactional
    @Modifying
    @Query(value = "insert into user(username,password) values(?1,?2)",nativeQuery = true)
    int addUser(String username,String password);

}


