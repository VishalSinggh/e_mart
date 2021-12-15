package com.emart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apparel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long apparelId;
	
	private String name;
	
	private int price;
	
	private int returnTimePeriod;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<UserPurchase> userPurchases;
}
