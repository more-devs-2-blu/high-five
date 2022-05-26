package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.CustomerReviewDTO;
import com.ecommerce.data.entity.CustomerReview;
import com.ecommerce.data.entity.Product;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.CustomerReviewRepository;
import com.ecommerce.repository.ProductRepository;

@Service
public class CustomerReviewService {

	@Autowired
	CustomerReviewRepository repository;
	
	@Autowired
	ProductRepository productRepository;
	
	// Select de todas as avalições de um produto
	public List<CustomerReviewDTO> getAllByProduct(Long id){
		Product product = productRepository.findById(id).orElseThrow(() -> new NotFoundException("Product " + id + " not found"));
		List<CustomerReview> reviews = repository.findByProduct(product);
		List<CustomerReviewDTO> listReview = new ArrayList<>();
		
		for (CustomerReview review : reviews) {
			listReview.add(review.convertToDTO());
		}
		return listReview;
	}
	
	
	public CustomerReviewDTO getById(Long id) {
		CustomerReview customer = repository.findById(id).orElseThrow(() -> new NotFoundException("CustomerReview " + id + " not found"));
		return customer.convertToDTO();
	}
	
	
	public CustomerReviewDTO add(CustomerReviewDTO review) {
		
		double mediaReviews = (review.getElasticity() + review.getLengthReview() + review.getModelingReview() + review.getWaistReview())/4;
		
		
		
		return repository.save(review.convertToEntity()).convertToDTO();
	}
	
	public Boolean delete(Long id) {
		repository.delete(getById(id).convertToEntity());
		return true;
	}
	
	public CustomerReviewDTO update(CustomerReviewDTO review) {
		getById(review.convertToEntity().getId());
		return add(review);
	}
	
	
	
	

}
