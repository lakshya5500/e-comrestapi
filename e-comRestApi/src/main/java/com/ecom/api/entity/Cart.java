package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cart {
	@Id
	int id;
	@ManyToOne
	public
	Product product;
	public double quantity;
	double total;
	public Cart() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cart(int id, Product product, double quantity, double total) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.total = total;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", product=" + product + ", quantity=" + quantity + ", total=" + total + "]";
	}
	
	
}
