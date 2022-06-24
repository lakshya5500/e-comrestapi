package com.ecom.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.api.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

	//Cart findByProduct(String prod);
}
