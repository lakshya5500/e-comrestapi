package com.ecom.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.Admin;
import com.ecom.api.entity.Cart;
import com.ecom.api.entity.Category;
import com.ecom.api.entity.NewUser;
import com.ecom.api.entity.Product;
import com.ecom.api.repository.AdminRepo;
import com.ecom.api.repository.CartRepo;
import com.ecom.api.repository.CategoryRepo;
import com.ecom.api.repository.ProductRepo;
import com.ecom.api.repository.UserRepo;

@Service
public class MainService {

	@Autowired
	public CartRepo cartRepo;
	@Autowired
	public ProductRepo productRepo;
	@Autowired
	CategoryRepo categoryRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	AdminRepo adminRepo;

	// ========For Category Get and Post Methods=============

	public List<Category> findCategory() {
		return categoryRepo.findAll();
	}

	public Category saveCategory(Category category) {
		return categoryRepo.save(category);
	}

	// ========For PRODUCT Get and Post Methods=============
	public List<Product> findProducts() {
		return productRepo.findAll();
	}

	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	public Optional<Product> getProductbyid(Integer pid) {
		Optional<Product> prod = productRepo.findById(pid);
		return prod;
	}

	public Product deleteProduct(Integer pid) {
		productRepo.deleteById(pid);
		return null;
	}

	/**/
//for query fetch 
	public List<Product> getmobile() {
		return productRepo.findBymobile();
	}

	public List<Product> getlaptop() {
		return productRepo.findBylaptop();
	}

	public List<Product> getac() {
		return productRepo.findByac();
	}

	// =====for cart ====methods==========
	public List<Cart> details() {
		return cartRepo.findAll();
	}

	public Cart saveAllProduct(Cart cart) {
		Product c = cart.getProduct();
		cartRepo.save(cart);
		return cart;
	}

	// ========FOR USERS METHODS ===============
	public NewUser saveusers(NewUser user) {

		return userRepo.save(user);
	}

	public List<NewUser> findAllUsers() {

		return userRepo.findAll();
	}

//========FOR ADMIN METHODS ===============
	public List<Admin> findAllAdmin() {

		return adminRepo.findAll();
	}

	public List<NewUser> signin(String username, String password) {
		
		return userRepo.FindByUsernameOrPassword(username,password);
		
	}

//	public Product updateProducts(Product prod) {
//		
//		return productRepo.save(prod);
//	}

}
