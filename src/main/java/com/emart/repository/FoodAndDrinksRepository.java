package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.FoodAndDrinks;
import com.emart.entity.User;

public interface FoodAndDrinksRepository extends JpaRepository<FoodAndDrinks, Long>{

	FoodAndDrinks findById(long foodAndDrinksId);
}
