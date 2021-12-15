package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.Electronics;
import com.emart.entity.User;

public interface ElectronicsRepository extends JpaRepository<Electronics, Long>{
	
	Electronics findById(long electronicsId);
}
