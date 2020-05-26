package org.course.data.DAO.LoginDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoginRepository extends JpaRepository<LoginEntity,Long> {
    List<LoginEntity> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}


