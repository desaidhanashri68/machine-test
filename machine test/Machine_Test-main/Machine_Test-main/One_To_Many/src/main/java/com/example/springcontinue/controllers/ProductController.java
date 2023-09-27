package com.example.springcontinue.controllers;

import com.example.springcontinue.entity.Products;
import com.example.springcontinue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Products> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{id}")
    private Products getById(@PathVariable int id){
        return productService.getById(id);
    }
    @PostMapping
    private Products add(@RequestBody Products products){
        return productService.addOrUpdate(products);
    }
    @PutMapping("/{id}")
    private Products update(@PathVariable int id,@RequestBody Products products){
        products.setProductId(id);
        return productService.addOrUpdate(products);
    }
    @DeleteMapping("/{id}")
    private  void delete(@PathVariable int id){
        productService.deleteById(id);
    }


}
