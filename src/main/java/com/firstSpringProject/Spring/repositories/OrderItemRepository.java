package com.firstSpringProject.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstSpringProject.Spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
