package com.firstSpringProject.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstSpringProject.Spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
