package com.emart.service.template;

import java.io.IOException;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.ProductResponseDto;
import com.emart.enums.ProductTypeEnum;
import com.emart.exception.BusinessException;

public interface ProductTemplate extends AbstractTemplate<ProductTypeEnum>{

	ProductResponseDto saveProduct(ProductRequestDto requestDto) throws BusinessException, IOException;
	
	void getProduct();
}
