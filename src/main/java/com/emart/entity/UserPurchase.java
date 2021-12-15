package com.emart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPurchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Apparel apparel;
	
	@ManyToOne
	private Cosmetics cosmetics;
	
	@ManyToOne
	private Electronics electronics;
	
	@ManyToOne
	private FoodAndDrinks foodAndDrinks;
}
