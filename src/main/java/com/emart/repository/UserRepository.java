package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByNameOrMobileNo(String name, long mobileNo);
	
	User findById(long userId);
}
