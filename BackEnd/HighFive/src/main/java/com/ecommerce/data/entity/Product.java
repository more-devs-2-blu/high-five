package com.ecommerce.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecommerce.data.dto.ProductDTO;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String color;
	private double price;
	
	
	public ProductDTO convertToDTO() {
		return new ProductDTO(getId(), getDescription(), getColor(), getPrice());
	}
	
	public Product() {}

	public Product(Long id, String description, String color, double price) {
		super();
		this.id = id;
		this.description = description;
		this.color = color;
		this.price = price;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
