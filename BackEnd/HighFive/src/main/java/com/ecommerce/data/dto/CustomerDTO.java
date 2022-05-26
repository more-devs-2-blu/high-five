package com.ecommerce.data.dto;

import java.io.Serializable;

import com.ecommerce.data.entity.Customer;

public class CustomerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idCustomer;
	private String nameCustomer;
	private int heightCustomer;
	private double weightCustomer;
	
	public Customer convertToEntity() {
		return new Customer(idCustomer, nameCustomer, heightCustomer, weightCustomer);
	}
	
	public CustomerDTO(Long idCustomer, String nameCustomer, int heightCustomer, double weightCustomer) {
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.heightCustomer = heightCustomer;
		this.weightCustomer = weightCustomer;
	}

	public Long getId() {
		return idCustomer;
	}

	public void setId(Long id) {
		this.idCustomer = id;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getHeightCustomer() {
		return heightCustomer;
	}

	public void setHeightCustomer(int heightCustomer) {
		this.heightCustomer = heightCustomer;
	}

	public double getWeightCustomer() {
		return weightCustomer;
	}

	public void setWeightCustomer(double weightCustomer) {
		this.weightCustomer = weightCustomer;
	}

	
	
	
	

}
