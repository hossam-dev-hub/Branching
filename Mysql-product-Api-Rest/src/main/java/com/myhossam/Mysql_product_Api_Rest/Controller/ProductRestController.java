package com.myhossam.Mysql_product_Api_Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myhossam.Mysql_product_Api_Rest.entities.Product;
import com.myhossam.Mysql_product_Api_Rest.repos.ProductRepository;

  @RestController
    public class ProductRestController {   
      @Autowired
      ProductRepository repository;
       
      @GetMapping("/Products/")
    public List<Product> getProducts(){
    	return repository.findAll(); //تجلب جميع البيانات الموجود في الجدول
    }
    
    @GetMapping("/Products/{id}") 
    public Product getProduct(@PathVariable("id") int id){  // دي  int id كده هو هياخد الفيمه اللي هبعت وقت الطلب وهيبعتها لي ال  @PathVariable("id")
    	return repository.findById(id).get(); //لو عايز اجيب قيمه واحد بس 
    }
     
    @PostMapping("/Products/") // ضفت بيانات في قاعده البيانتا ت
    public Product CreateProduct(@RequestBody Product product) {
    	return repository.save(product); 
    }  
     
    @PutMapping("/Products/") //عدل علي البيانات اللي عندي
    public Product UbdateProduct(@RequestBody Product product) {
    	return repository.save(product);
    }
    @DeleteMapping("/Products/{id}") //لو عايز امسح داتا موجود uk]d
    public void deleteProduct(@PathVariable("id") int id){  // دي  int id كده هو هياخد الفيمه اللي هبعت وقت الطلب وهيبعتها لي ال  @PathVariable("id")
    	repository.deleteById(id);    // اللي ممرارو هنا  id بيمسج ال داتا بتعت ال 
    	}
    
   }
