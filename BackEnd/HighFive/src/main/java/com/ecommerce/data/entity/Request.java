package com.ecommerce.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.data.dto.RequestDTO;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	public RequestDTO convertToDTO() {
		return new RequestDTO(reference, customer.convertToDTO(), product.convertToDTO());
	}
	
	public Request() {}
	
	public Request(String reference, Customer customer, Product product) {
		this.reference = reference;
		this.customer = customer;
		this.product = product;
	}


	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	
}
