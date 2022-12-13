package com.firstSpringProject.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstSpringProject.Spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
