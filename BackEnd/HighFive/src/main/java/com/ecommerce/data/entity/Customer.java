package com.ecommerce.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecommerce.data.dto.CustomerDTO;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int height;
	private double weight;

	
	
	public CustomerDTO convertToDTO() {
		return new CustomerDTO(id, name, height, weight);
	}
	
	public Customer() {}
	
	public Customer(Long id, String name, int height, double weight) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	



	
	
	
	
	

}
