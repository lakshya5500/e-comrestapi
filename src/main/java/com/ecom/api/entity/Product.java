package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String pbrand;
	String pname;
	String description;
	String price;
	String img;
	String rating;
	String total;
	String quantity;

	@OneToOne
	Category category;

	public Product() {

	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	

	public Product(int pid, String pbrand, String pname, String description, String price, String img, String rating,
			String total, String quantity, Category category) {
		super();
		this.pid = pid;
		this.pbrand = pbrand;
		this.pname = pname;
		this.description = description;
		this.price = price;
		this.img = img;
		this.rating = rating;
		this.total = total;
		this.quantity = quantity;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pbrand=" + pbrand + ", pname=" + pname + ", description=" + description
				+ ", price=" + price + ", img=" + img + ", rating=" + rating + ", total=" + total + ", quantity="
				+ quantity + ", category=" + category + "]";
	}

	

}
