package com.ecom.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.api.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

	



	public Admin findByEmailAndPassword(String email, String password);

}
