package com.example.springcontinue.repositry;

import com.example.springcontinue.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositry extends JpaRepository<Products,Integer> {
}
