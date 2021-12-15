package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.Apparel;
import com.emart.entity.User;

public interface ApparelRepository extends JpaRepository<Apparel, Long>{

	Apparel findById(long apparelId);
}
