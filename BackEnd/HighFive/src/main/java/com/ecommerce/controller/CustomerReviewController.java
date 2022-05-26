package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.data.dto.CustomerReviewDTO;
import com.ecommerce.service.CustomerReviewService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customer-review")
public class CustomerReviewController {

	@Autowired
	CustomerReviewService service;

	
	// Endpoint para buscar todos as avaliações do produto
	@GetMapping("/{id}")
	public List<CustomerReviewDTO> getAllReviewByProduct(@PathVariable Long id) {		
		return service.getAllByProduct(id);			
	}
	

	
}