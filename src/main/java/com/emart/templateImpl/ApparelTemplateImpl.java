package com.emart.templateImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.ProductResponseDto;
import com.emart.enums.ProductTypeEnum;
import com.emart.exception.BusinessException;
import com.emart.repository.ApparelRepository;
import com.emart.service.template.ProductTemplate;

@Service
public class ApparelTemplateImpl implements ProductTemplate{

	@Autowired
	private ApparelRepository apparelRepository;
	
	@Override
	public ProductTypeEnum templateFor() {
		// TODO Auto-generated method stub
		return ProductTypeEnum.APPAREL;
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
