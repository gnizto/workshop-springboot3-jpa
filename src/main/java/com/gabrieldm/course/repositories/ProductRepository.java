package com.gabrieldm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldm.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
