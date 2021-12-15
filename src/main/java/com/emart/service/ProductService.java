package com.emart.service;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.UserPurchaseDto;

public interface ProductService {

	public String saveProduct(ProductRequestDto requestDto); 
	
	public ResponseEntity<?> getProducts(@Nullable String productType);

	public ResponseEntity<?> buyProducts(long userId, UserPurchaseDto userPurchaseDto); 
	
}
