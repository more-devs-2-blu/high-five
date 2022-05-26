package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.data.dto.ProductDTO;
import com.ecommerce.service.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	// Endpoint para buscar todos os produtos
	@GetMapping
	public List<ProductDTO> getAll() {
		return service.getAll();
	}
	
	// Endpoint para buscar um produto pelo id
	@GetMapping("/{id}")
	public ProductDTO productDTO(@PathVariable Long id) {
		return service.getById(id);
	}


}
