package com.emart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cosmetics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cosmeticsId;
	
	private String name;
	
	private int price;
}