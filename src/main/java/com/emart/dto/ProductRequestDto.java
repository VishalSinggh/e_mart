package com.emart.dto;

import com.emart.enums.ProductTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

	private ProductTypeEnum productTypeEnum; 
	
	private String name;
	
	private int price;
}
