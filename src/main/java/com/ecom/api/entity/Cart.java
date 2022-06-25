package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int pid;
	String pbrand;
	String pname;
	String description;
	String price;
	String img;
	String rating;
	double quantity;
	double total;

	public Cart() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Cart(int id, int pid, String pbrand, String pname, String description, String price, String img,
			String rating, double quantity, double total) {
		super();
		this.id = id;
		this.pid = pid;
		this.pbrand = pbrand;
		this.pname = pname;
		this.description = description;
		this.price = price;
		this.img = img;
		this.rating = rating;
		this.quantity = quantity;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", pid=" + pid + ", pbrand=" + pbrand + ", pname=" + pname + ", description="
				+ description + ", price=" + price + ", img=" + img + ", rating=" + rating + ", quantity=" + quantity
				+ ", total=" + total + "]";
	}

}
