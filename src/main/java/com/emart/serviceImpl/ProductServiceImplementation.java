package com.emart.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.emart.dto.GetAllProductDto;
import com.emart.dto.ProductRequestDto;
import com.emart.entity.Apparel;
import com.emart.entity.Cosmetics;
import com.emart.entity.Electronics;
import com.emart.entity.FoodAndDrinks;
import com.emart.repository.ApparelRepository;
import com.emart.repository.CosmeticsRepository;
import com.emart.repository.ElectronicsRepository;
import com.emart.repository.FoodAndDrinksRepository;
import com.emart.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	private ElectronicsRepository electronicsRepository;
	
	@Autowired
	private ApparelRepository apparelRepository;
	
	@Autowired
	private FoodAndDrinksRepository foodAndDrinksRepository;
	
	@Autowired
	private CosmeticsRepository cosmeticsRepository;
	
	@Override
	public String saveProduct(ProductRequestDto requestDto) {
		// TODO Auto-generated method stub
		if(requestDto.getProductType().equalsIgnoreCase("Electronics")) {
			Electronics electronics=new Electronics();
			if(requestDto.getWarranty()<=180) {
				return "warranty should be provided and it must be of atleast 180 days";
			}
			BeanUtils.copyProperties(requestDto, electronics);
			electronicsRepository.save(electronics);
			return "saved";
		}
		else if(requestDto.getProductType().equalsIgnoreCase("Cosmetics")) {
			Cosmetics cosmetics = new Cosmetics();
			BeanUtils.copyProperties(requestDto, cosmetics);
			cosmeticsRepository.save(cosmetics);
			return "saved";
		}
		else if(requestDto.getProductType().equalsIgnoreCase("FoodAndDrinks")) {
			FoodAndDrinks foodAndDrinks = new FoodAndDrinks();
			BeanUtils.copyProperties(requestDto, foodAndDrinks);
			foodAndDrinksRepository.save(foodAndDrinks);
			return "saved";
		}
		else if(requestDto.getProductType().equalsIgnoreCase("FoodAndDrinks")) {
			Apparel apparel = new Apparel();
			BeanUtils.copyProperties(requestDto, apparel);
			apparelRepository.save(apparel);
			return "saved";
		}
			
		return "enter a valid productType";
	}

	@Override
	public ResponseEntity<?> getProducts(String productType) {
		// TODO Auto-generated method stub
		if(productType == null) {
		GetAllProductDto allProductDto = new GetAllProductDto();
		allProductDto.setAllElectronics(electronicsRepository.findAll());
		allProductDto.setAllApparel(apparelRepository.findAll());
		allProductDto.setAllCosmetics(cosmeticsRepository.findAll());
		allProductDto.setAllFoodAndDrinks(foodAndDrinksRepository.findAll());
		return ResponseEntity.ok(allProductDto);
	}
		else if(productType.equalsIgnoreCase("Electronics")) {
			return ResponseEntity.ok(electronicsRepository.findAll());
		}
		else if(productType.equalsIgnoreCase("Apparel")) {
			return ResponseEntity.ok(apparelRepository.findAll());
		}
		else if(productType.equalsIgnoreCase("Cosmetics")) {
			return ResponseEntity.ok(cosmeticsRepository.findAll());
		}
		else if(productType.equalsIgnoreCase("FoodAndDrinks")) {
			return ResponseEntity.ok(foodAndDrinksRepository.findAll());
		}
	return ResponseEntity.ok("enter a valid productType");
}
}
