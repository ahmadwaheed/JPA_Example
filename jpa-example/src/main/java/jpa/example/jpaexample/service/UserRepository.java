package jpa.example.jpaexample.service;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.example.jpaexample.entity.User;

//JpaRepository takes in class and Primary key type
public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
