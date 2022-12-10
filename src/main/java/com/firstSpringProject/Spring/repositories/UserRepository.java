package com.firstSpringProject.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstSpringProject.Spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
