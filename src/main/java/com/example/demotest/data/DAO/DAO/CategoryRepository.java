package com.example.demotest.data.DAO.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import javax.validation.constraints.Size;
import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
    @Transactional
    @Modifying
    @Query(value = "insert into category(cname,cdiscription) value (?1,?2)",nativeQuery = true)
    int addCategory(String cname,String cdiscription);

    @Transactional
    @Modifying
    @Query(value = "delete from category where cid = ?1",nativeQuery = true)
    int delCategory(Long cid);

    @Query(value = "select * from category a where a.cid = ?1",nativeQuery = true)
    List<CategoryEntity> findCategoryById(@RequestParam Long id);

    @Query(value = "select * from category",nativeQuery = true)
    List<CategoryEntity> findAllCategories();


}
