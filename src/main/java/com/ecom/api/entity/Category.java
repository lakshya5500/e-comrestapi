package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
    @Id
    
	String subcat;
	String cat;
	String imgUrl;
	
	
	
	public String getSubcat() {
		return subcat;
	}
	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
	
	@Override
	public String toString() {
		return "Category [subcat=" + subcat + ", cat=" + cat + ", imgUrl=" + imgUrl + "]";
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public Category(String subcat, String cat, String imgUrl) {
		super();
		this.subcat = subcat;
		this.cat = cat;
		this.imgUrl = imgUrl;
	}
	public Category() {
	
	}
	
	
	
}
