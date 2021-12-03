package com.emart.dto;

import java.util.Date;

import com.emart.enums.ProductTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

	private String productType; 
	
	private String name;
	
	private int price;
	
	private int returnTimePeriod;

	private Date expiry;

	private int warranty;

	private double rating;

}
