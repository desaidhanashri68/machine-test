package com.example.springcontinue.controllers;

import com.example.springcontinue.entity.Catagory;
import com.example.springcontinue.entity.Products;
import com.example.springcontinue.service.CatagoryService;
import com.example.springcontinue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catagory")
public class CatagoryController {


    @Autowired
    private CatagoryService catagoryService;

    @GetMapping
    public List<Catagory> getAll(){
        return catagoryService.getAll();
    }
    @GetMapping("/{id}")
    private Catagory getById(@PathVariable int id){
        return catagoryService.getById(id);
    }
    @PostMapping
    private Catagory add(@RequestBody Catagory catagory){
        return catagoryService.addOrUpdate(catagory);
    }
    @PutMapping("/{id}")
    private Catagory update(@PathVariable int id,@RequestBody Catagory catagory){
        catagory.setCatagoryId(id);
        return catagoryService.addOrUpdate(catagory);
    }
    @DeleteMapping("/{id}")
    private  void delete(@PathVariable int id){
        catagoryService.deleteById(id);
    }
}
