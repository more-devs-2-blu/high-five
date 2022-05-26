package com.ecommerce.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.data.dto.SizeDTO;

@Entity
public class Size {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int size;
	private double length;
	private double waist;
	private double communityFit;
	private double calculatedFit;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public SizeDTO convertToDTO() {
		return new SizeDTO(getId(), getSize(), getLength(), getWaist(), getCommunityFit(), getCalculatedFit(), getProduct().convertToDTO(), getCustomer().convertToDTO());
	}
	
	public Size() {}

	public Size(Long id, int size, double length, double waist, double communityFit, double calculatedFit,
			Product product, Customer customer) {
		super();
		this.id = id;
		this.size = size;
		this.length = length;
		this.waist = waist;
		this.communityFit = communityFit;
		this.calculatedFit = calculatedFit;
		this.product = product;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWaist() {
		return waist;
	}

	public void setWaist(double waist) {
		this.waist = waist;
	}

	public double getCommunityFit() {
		return communityFit;
	}

	public void setCommunityFit(double communityFit) {
		this.communityFit = communityFit;
	}

	public double getCalculatedFit() {
		return calculatedFit;
	}

	public void setCalculatedFit(double calculatedFit) {
		this.calculatedFit = calculatedFit;
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
