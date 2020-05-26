package com.example.demotest.data.DAO.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
    @Transactional
    @Modifying
    @Query(value = "insert into comment(commnetcontent,commentuid,commentoid) values(?1,?2,?3)",nativeQuery = true)
    int addComment(String content,Long uid,Long oid);

    @Transactional
    @Modifying
    @Query(value = "delete from comment where commentuid = ?1 and commentoid=?2",nativeQuery = true)
    int delComment(Long uid,Long oid);


    @Query(value = "select from comment where commentuid = ?1 and commentoid=?2",nativeQuery = true)
    List<CommentEntity> findComment(Long uid, Long oid);



}
