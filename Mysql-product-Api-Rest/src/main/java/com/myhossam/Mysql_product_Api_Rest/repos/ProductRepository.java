package com.myhossam.Mysql_product_Api_Rest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhossam.Mysql_product_Api_Rest.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
