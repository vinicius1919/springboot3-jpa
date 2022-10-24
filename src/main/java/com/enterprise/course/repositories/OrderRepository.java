package com.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
