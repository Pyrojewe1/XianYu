package com.example.demotest.data.DAO.DAO;

import com.example.demotest.data.Bean.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntiy,Long> {
    @Query(value = "select * from product a where a.pnum>0 and a.pcheck=true ",nativeQuery = true)
    List<ProductEntiy> findAllProduct();

    @Query(value = "select * from product a  where a.pid=?1",nativeQuery = true)
    List<ProductEntiy> findProductById(Long pid);

    @Transactional
    @Modifying
    @Query(value = "insert into product(pname,pdiscription,pnum,publisherid,pcategoryid,pprice,ppicture) values(?1,?2,?3,?4,?5,?6,?7)",nativeQuery = true)
    int addProduct(String pname,String pdiscription,Long pnum,Long publisherid ,Long pcategoryid,Long pprice,String ppicture);

    @Query(value = "select * from product a where a.pnum>0 and a.pcheck=false ",nativeQuery = true)
    List<ProductEntiy> findCheckProduct();

    @Transactional
    @Modifying
    @Query(value = "update product  set pcheck=true  where  pid=?1",nativeQuery = true)
    int changeProduct(Long pid);

    @Transactional
    @Modifying
    @Query(value = "update product  set buying=true  where  pid=?1",nativeQuery = true)
    int tryToBuyProduct(Long pid);

    @Query(value = "select * from product a where a.pcategoryid=?1 and a.pcheck=true ",nativeQuery = true)
    List<ProductEntiy> getProductsByCategory(long cid);
}
