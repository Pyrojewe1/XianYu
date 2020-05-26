package org.course.data.DAO.LoginDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoginRepository extends JpaRepository<LoginEntity,Long> {
    @Modifying
    @Query(value = "select * from login where username=?1 and password=?2 ", nativeQuery = true)
    List<LoginEntity> findByUserNameAndPassowrd(@Param("username") String username, @Param("password") String password);
}
