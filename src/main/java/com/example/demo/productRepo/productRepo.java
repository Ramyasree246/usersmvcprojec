package com.example.demo.productRepo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


//import com.example.demo.model.admin;
import com.example.demo.model.product;



public interface productRepo extends JpaRepository<product, Long>{

}
