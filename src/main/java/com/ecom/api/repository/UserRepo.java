package com.ecom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ecom.api.entity.NewUser;

public interface UserRepo extends JpaRepository<NewUser, Integer> {

}
