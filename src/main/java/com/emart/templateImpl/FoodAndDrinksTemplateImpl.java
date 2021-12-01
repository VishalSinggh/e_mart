package com.emart.templateImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.ProductResponseDto;
import com.emart.enums.ProductTypeEnum;
import com.emart.exception.BusinessException;
import com.emart.service.template.ProductTemplate;

@Service
public class FoodAndDrinksTemplateImpl implements ProductTemplate{

	@Autowired
	private FoodAndDrinksTemplateImpl foodAndDrinksTemplateImpl;
	
	@Override
	public ProductTypeEnum templateFor() {
		// TODO Auto-generated method stub
		return ProductTypeEnum.FOODANDDRINKS;
	}	

	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductResponseDto saveProduct(ProductRequestDto requestDto) throws BusinessException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
