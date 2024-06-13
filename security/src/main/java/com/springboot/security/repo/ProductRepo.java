package com.springboot.security.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.security.entity.*;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

}
