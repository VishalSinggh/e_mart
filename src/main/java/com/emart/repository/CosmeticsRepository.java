package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.Cosmetics;
import com.emart.entity.User;

public interface CosmeticsRepository extends JpaRepository<Cosmetics, Long>{
	
	Cosmetics findById(long cosmeticsId);
}
