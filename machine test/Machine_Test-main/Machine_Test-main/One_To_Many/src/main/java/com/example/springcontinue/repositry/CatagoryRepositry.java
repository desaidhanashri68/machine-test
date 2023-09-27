package com.example.springcontinue.repositry;

import com.example.springcontinue.entity.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepositry extends JpaRepository<Catagory,Integer> {
}
