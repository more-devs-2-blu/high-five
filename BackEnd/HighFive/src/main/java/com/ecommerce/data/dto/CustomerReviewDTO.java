package com.ecommerce.data.dto;

import com.ecommerce.data.entity.CustomerReview;

public class CustomerReviewDTO {

	private Long idCustomerReview;
	private String referenceReview;
	private int modelingReview;
	private int waistReview;
	private int lengthReview;
	private int elasticityReview;
	private ProductDTO product;
	private CustomerDTO customer;
	
	public CustomerReview convertToEntity() {
		return new CustomerReview(getId(), getReferenceReview(), getModelingReview(), getWaistReview(), getLengthReview(), getElasticityReview(), getProduct().convertToEntity(), getCustomer().convertToEntity());
	}

	public CustomerReviewDTO(Long idCustomerReview, String referenceReview, int modelingReview, int waistReview, int lengthReview,
			int elasticityReview, ProductDTO product, CustomerDTO customer) {
		super();
		this.idCustomerReview = idCustomerReview;
		this.referenceReview = referenceReview;
		this.modelingReview = modelingReview;
		this.waistReview = waistReview;
		this.lengthReview = lengthReview;
		this.elasticityReview = elasticityReview;
		this.product = product;
		this.customer = customer;
	}

	public String getReferenceReview() {
		return referenceReview;
	}

	public void setReferenceReview(String referenceReview) {
		this.referenceReview = referenceReview;
	}

	public int getModelingReview() {
		return modelingReview;
	}

	public void setModelingReview(int modelingReview) {
		this.modelingReview = modelingReview;
	}

	public int getWaistReview() {
		return waistReview;
	}

	public void setWaistReview(int waistReview) {
		this.waistReview = waistReview;
	}

	public int getLengthReview() {
		return lengthReview;
	}

	public void setLengthReview(int lengthReview) {
		this.lengthReview = lengthReview;
	}

	public int getElasticityReview() {
		return elasticityReview;
	}

	public void setElasticityReview(int elasticityReview) {
		this.elasticityReview = elasticityReview;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public Long getId() {
		return idCustomerReview;
	}

	public void setId(Long idCustomerReview) {
		this.idCustomerReview = idCustomerReview;
	}
	


}
