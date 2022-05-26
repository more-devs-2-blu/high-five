package com.ecommerce.data.dto;

import com.ecommerce.data.entity.Product;

public class ProductDTO {

	private Long idProduct;
	private String descriptionProduct;
	private String colorProduct;
	private double priceProduct;
	
	public Product convertToEntity() {
		return new Product(getIdProduct(), getDescriptionProduct(), getColorProduct(), getPriceProduct());
	}
	
	public ProductDTO(Long idProduct, String descriptionProduct, String colorProduct, double priceProduct) {
		super();
		this.idProduct = idProduct;
		this.descriptionProduct = descriptionProduct;
		this.colorProduct = colorProduct;
		this.priceProduct = priceProduct;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}

	public String getColorProduct() {
		return colorProduct;
	}

	public void setColorProduct(String colorProduct) {
		this.colorProduct = colorProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}



}
