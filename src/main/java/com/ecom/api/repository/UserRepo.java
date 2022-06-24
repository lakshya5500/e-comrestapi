package com.ecom.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecom.api.entity.NewUser;

public interface UserRepo extends CrudRepository<NewUser, Integer> {

}
