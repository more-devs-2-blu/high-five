package com.ecommerce.data.dto;

import com.ecommerce.data.entity.Size;

public class SizeDTO {
	
	private Long idSize;
	private int sizeDTO;
	private double lengthSize;
	private double waistSize;
	private double communityFitSize;
	private double calculatedFitSize;
	private ProductDTO product;
	private CustomerDTO customer;
	
	public Size convertToEntity() {
		return new Size(getIdSize(), getSizeDTO(), getLengthSize(), getWaistSize(), getCommunityFitSize(), getCalculatedFitSize(), getProduct().convertToEntity(), getCustomer().convertToEntity());
	}

	public SizeDTO(Long idSize, int sizeDTO, double lengthSize, double waistSize, double communityFitSize,
			double calculatedFitSize, ProductDTO product, CustomerDTO customer) {
		super();
		this.idSize = idSize;
		this.sizeDTO = sizeDTO;
		this.lengthSize = lengthSize;
		this.waistSize = waistSize;
		this.communityFitSize = communityFitSize;
		this.calculatedFitSize = calculatedFitSize;
		this.product = product;
		this.customer = customer;
	}

	public Long getIdSize() {
		return idSize;
	}

	public void setIdSize(Long idSize) {
		this.idSize = idSize;
	}

	public int getSizeDTO() {
		return sizeDTO;
	}

	public void setSizeDTO(int sizeDTO) {
		this.sizeDTO = sizeDTO;
	}

	public double getLengthSize() {
		return lengthSize;
	}

	public void setLengthSize(double lengthSize) {
		this.lengthSize = lengthSize;
	}

	public double getWaistSize() {
		return waistSize;
	}

	public void setWaistSize(double waistSize) {
		this.waistSize = waistSize;
	}

	public double getCommunityFitSize() {
		return communityFitSize;
	}

	public void setCommunityFitSize(double communityFitSize) {
		this.communityFitSize = communityFitSize;
	}

	public double getCalculatedFitSize() {
		return calculatedFitSize;
	}

	public void setCalculatedFitSize(double calculatedFitSize) {
		this.calculatedFitSize = calculatedFitSize;
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
	};


}
