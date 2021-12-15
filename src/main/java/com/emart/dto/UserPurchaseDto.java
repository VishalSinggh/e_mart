package com.emart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPurchaseDto {

	private long ApparelId;
	private long CosmeticsId;
	private long ElectronicsId;
	private long FoodAndDrinksId;
	
}
