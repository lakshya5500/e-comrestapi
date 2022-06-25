package com.ecom.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Admin;
import com.ecom.api.entity.Cart;
import com.ecom.api.entity.Category;
import com.ecom.api.entity.NewUser;
import com.ecom.api.entity.Product;
import com.ecom.api.repository.UserRepo;
import com.ecom.api.service.MainService;

@RestController
@CrossOrigin(origins = "*")
public class MyRestController {

	@Autowired
	MainService mainService;
	@Autowired
	UserRepo userRepo;

	// ========For Category Get and Post Methods=============
	@GetMapping("category")
	public List<Category> getCategories() {
		return mainService.findCategory();
	}

	@PostMapping("/category")
	public Category saveCategories(@RequestBody Category category) {
		return mainService.saveCategory(category);
	}

	// ========For PRODUCT Get and Post Methods=============
	@GetMapping("product")
	public List<Product> getProducts() {
		return mainService.findProducts();
	}

	@PostMapping("/product")
	public Product saveProducts(@RequestBody Product product) {
		return mainService.saveProduct(product);
	}

	@GetMapping("product/{pid}")
	Optional<Product> getProductByid(@PathVariable("pid") Integer pid) {
		return mainService.getProductbyid(pid);
	}

	@DeleteMapping("product/{pid}")
	public Product deleteProductById(@PathVariable("pid") Integer pid) {
		return mainService.deleteProduct(pid);
	}

	// =====for cart ====methods==========
	@GetMapping("/cart")
	public List<Cart> bill() {
		return mainService.details();
	}

	@PostMapping("/cart")
	public Cart saveCart(@RequestBody Cart cart) {
		return mainService.saveAllProduct(cart);
	}
	@DeleteMapping("/cart/{id}")
	public Cart deleteCartById(@PathVariable("id") Integer id, Cart cart) {
		return mainService.deleteCart(id);
	}
	
	
	// ==========FOR USERS =====================

	@GetMapping("/users")
	public List<NewUser> getAllUsers() {
		return mainService.findAllUsers();
	}

	@PostMapping("/signup")
	public NewUser saveUsers(@RequestBody NewUser user) {
		return mainService.saveusers(user);
	}

	// ===============For Admin Methods =============

	

	@GetMapping("/admin")
	public List<Admin> getdetails() {
		return mainService.findAllAdmin();
	}

	// for Query Value fetch

	@GetMapping("/product/mobile")
	public List<Product> findmobile() {
		return mainService.getmobile();
	}

	@GetMapping("product/ac")
	public List<Product> findac() {
		return mainService.getac();
	}

	@GetMapping("product/laptop")
	public List<Product> findlaptop() {
		return mainService.getlaptop();
	}
}
