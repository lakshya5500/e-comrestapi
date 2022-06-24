package com.ecom.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Cart;
import com.ecom.api.entity.Category;
import com.ecom.api.entity.Product;
import com.ecom.api.service.MainService;

@RestController
@CrossOrigin(origins = "*")
public class MyRestController {

	@Autowired
	MainService mainService;

	@GetMapping("category")
	public List<Category> getCategories() {
		return mainService.findCategory();
	}

	@PostMapping("/category")
	public Category saveCategories(@RequestBody Category category) {
		return mainService.saveCategory(category);
	}

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
	Product deleteProductById(@PathVariable("pid") Integer pid) {
		return mainService.deleteProduct(pid);
	}

	@GetMapping("/cart")
	public List<Cart> bill() {
		return mainService.details();
	}
	
	@PostMapping("/cart")
	public Cart saveCart(@PathVariable Cart cart) {
		return mainService.saveAllProduct(cart);
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
