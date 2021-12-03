package com.emart.dto;

import java.util.List;

import com.emart.entity.Apparel;
import com.emart.entity.Cosmetics;
import com.emart.entity.Electronics;
import com.emart.entity.FoodAndDrinks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductDto {
 
	private List<Electronics> allElectronics;
	
	private List<Cosmetics> allCosmetics;
	
	private List<FoodAndDrinks> allFoodAndDrinks;
	
	private List<Apparel> allApparel;
}
