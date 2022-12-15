package com.firstSpringProject.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstSpringProject.Spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
