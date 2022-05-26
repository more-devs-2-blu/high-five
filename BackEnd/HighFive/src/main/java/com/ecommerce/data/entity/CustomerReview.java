package com.ecommerce.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.data.dto.CustomerReviewDTO;

@Entity
public class CustomerReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	private int modeling;
	private int waist;
	private int length;
	private int elasticity;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public CustomerReviewDTO convertToDTO() {
		return new CustomerReviewDTO(getId(), getReference(), getModeling(), getWaist(), getLength(), getElasticity(), getProduct().convertToDTO(), getCustomer().convertToDTO());
	}
	
	public CustomerReview() {}

	public CustomerReview(Long id, String reference, int modeling, int waist, int length, int elasticity,
			Product product, Customer customer) {
		super();
		this.id = id;
		this.reference = reference;
		this.modeling = modeling;
		this.waist = waist;
		this.length = length;
		this.elasticity = elasticity;
		this.product = product;
		this.customer = customer;
	}

	public Long getId() {
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

	public int getModeling() {
		return modeling;
	}

	public void setModeling(int modeling) {
		this.modeling = modeling;
	}

	public int getWaist() {
		return waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getElasticity() {
		return elasticity;
	}

	public void setElasticity(int elasticity) {
		this.elasticity = elasticity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	


}
