package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.ProductDTO;
import com.ecommerce.data.entity.Product;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;

	public List<ProductDTO> getAll(){
		List<Product> products = repository.findAll();
		List<ProductDTO> listProduct = new ArrayList<>();
		
		for (Product product : products) {
			listProduct.add(product.convertToDTO());
		}
		return listProduct;
	}
	
	public ProductDTO getById(Long id) {
		Product product = repository.findById(id).orElseThrow(() -> new NotFoundException("Product " + id + " not found"));
		return product.convertToDTO();
	}
	
	
	public ProductDTO add(ProductDTO product) {
		return repository.save(product.convertToEntity()).convertToDTO();
	}
	
	public Boolean delete(Long id) {
		repository.delete(getById(id).convertToEntity());
		return true;
	}
	
	public ProductDTO update(ProductDTO product) {
		getById(product.convertToEntity().getId());
		return add(product);
	}
	
	
}
