package com.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
