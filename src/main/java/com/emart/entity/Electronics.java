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
public class Electronics {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long electronicsId;
	
	private String name;
	
	private int price;
	
	private int warranty;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<UserPurchase> userPurchases;
}
