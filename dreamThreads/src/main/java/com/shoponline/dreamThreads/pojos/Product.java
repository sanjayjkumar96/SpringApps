package com.shoponline.dreamThreads.pojos;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	
	
	
public Product() {
		
	}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull(message = "Product name is required")
@Basic(optional=false)
private String name;

private double price;

private String desc;

private String pictureUrl;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public String getPictureUrl() {
	return pictureUrl;
}

public void setPictureUrl(String pictureUrl) {
	this.pictureUrl = pictureUrl;
}


public Product(Long id, @NotNull(message = "Product name is required") String name, double price, String desc,
		String pictureUrl) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.desc = desc;
	this.pictureUrl = pictureUrl;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + ", pictureUrl=" + pictureUrl
			+ "]";
}





}
