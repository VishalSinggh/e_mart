package com.emart.templateImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.ProductResponseDto;
import com.emart.enums.ProductTypeEnum;
import com.emart.exception.BusinessException;
import com.emart.repository.ElectronicsRepository;
import com.emart.service.factory.ProductFactoryBuilder;
import com.emart.service.template.ProductTemplate;

public class ElectronicsTemplateImpl implements ProductTemplate{

	@Autowired
	private ElectronicsRepository electronicsRepository;
	
	@Override
	public ProductTypeEnum templateFor() {
		// TODO Auto-generated method stub
		return ProductTypeEnum.ELECTRONICS;
	}

	@Override
	public ProductResponseDto saveProduct(ProductRequestDto requestDto) throws BusinessException, IOException {
		// TODO Auto-generated method stub
		ProductTemplate productTemplateFactory = ProductFactoryBuilder.getFactory(requestDto.getProductTypeEnum());
	}

	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		
	}


}
