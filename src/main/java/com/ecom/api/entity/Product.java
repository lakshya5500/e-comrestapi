package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	int pid;
	String pbrand;
	String pname;
	String pmodel;
	String price;
	String img;
	
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

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	

	public Product(int pid, String pbrand, String pname, String pmodel, String price, String img, Category category) {
		super();
		this.pid = pid;
		this.pbrand = pbrand;
		this.pname = pname;
		this.pmodel = pmodel;
		this.price = price;
		this.img = img;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pbrand=" + pbrand + ", pname=" + pname + ", pmodel=" + pmodel + ", price="
				+ price + ", img=" + img + ", category=" + category + "]";
	}

	

	
	
	
	
}
