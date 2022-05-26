package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.data.dto.SizeDTO;
import com.ecommerce.service.SizeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/size")
public class SizeController {
	
	@Autowired
	SizeService service;

	// Endpoint para buscar um tamanho
	@GetMapping("/{id}")
	public SizeDTO getById(@PathVariable Long id) {		
		return service.getById(id);			
	}
	
	// Endpoint para buscar o calculo do fit
	@GetMapping("/fit/{id}")
	public SizeDTO getFit(@PathVariable Long id) {		
		return service.getFit(id);			
	}

}
