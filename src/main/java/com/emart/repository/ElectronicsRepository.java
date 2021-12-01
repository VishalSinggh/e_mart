package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.Electronics;

public interface ElectronicsRepository extends JpaRepository<Electronics, Long>{

}
