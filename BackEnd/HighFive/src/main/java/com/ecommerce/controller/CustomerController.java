package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.data.dto.CustomerDTO;
import com.ecommerce.service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	//Método para incluir um cliente
	@PostMapping
	public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customer) {
		return new ResponseEntity<>(service.add(customer), HttpStatus.CREATED);
	}

	
}
