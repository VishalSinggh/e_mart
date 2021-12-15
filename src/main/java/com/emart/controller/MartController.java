package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.ProductRequestDto;
import com.emart.dto.UserDto;
import com.emart.dto.UserPurchaseDto;
import com.emart.service.ProductService;
import com.emart.service.UserService;

@RestController
public class MartController {


	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody ProductRequestDto requestDto) {
		return productService.saveProduct(requestDto);	
	}
	
	@GetMapping("/getProducts")
	public ResponseEntity<?> getProducts(@RequestParam(required = false) String productType){
		return productService.getProducts(productType);
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody UserDto userDto) {
		return userService.registerUser(userDto);
	}
	
	@PostMapping("/buyProducts")
	public ResponseEntity<?> buyProducts(@RequestParam("userId") long userId, @RequestBody UserPurchaseDto userPurchaseDto){
		return productService.buyProducts(userId, userPurchaseDto);
	}
}
