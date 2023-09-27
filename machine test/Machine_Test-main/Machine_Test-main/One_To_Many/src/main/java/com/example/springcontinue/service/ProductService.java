package com.example.springcontinue.service;

import com.example.springcontinue.entity.Products;
import com.example.springcontinue.repositry.ProductRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepositry productRepositry;

    public Products addOrUpdate(Products products){
        return productRepositry.save(products);
    }
    public boolean deleteById(int id){
        productRepositry.deleteById(id);
        return true;
    }
    public List<Products> getAll(){
        return productRepositry.findAll();
    }
    public Products getById(int id){
        return productRepositry.findById(id).get();
    }
}
