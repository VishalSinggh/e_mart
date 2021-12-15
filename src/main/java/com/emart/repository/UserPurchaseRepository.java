package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entity.UserPurchase;

public interface UserPurchaseRepository  extends JpaRepository<UserPurchase, Long>{

}
