package com.emart.service;

import java.io.IOException;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.ProductResponseDto;
import com.emart.exception.BusinessException;

public interface productService {

	ProductResponseDto saveProduct(ProductRequestDto productRequestDto) throws BusinessException, IOException ;
}
