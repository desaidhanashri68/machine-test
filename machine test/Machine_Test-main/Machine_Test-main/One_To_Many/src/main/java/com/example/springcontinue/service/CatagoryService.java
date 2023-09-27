package com.example.springcontinue.service;

import com.example.springcontinue.entity.Catagory;
import com.example.springcontinue.entity.Products;
import com.example.springcontinue.repositry.CatagoryRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatagoryService {

    @Autowired
    private CatagoryRepositry catagoryRepositry;
     public Catagory addOrUpdate(Catagory catagory){
       return catagoryRepositry.save(catagory);
   }
    public boolean deleteById(int id){
        catagoryRepositry.deleteById(id);
        return true;
    }
    public List<Catagory> getAll(){
        return catagoryRepositry.findAll();
    }
    public Catagory getById(int id){
       return catagoryRepositry.findById(id).get();
    }
}
