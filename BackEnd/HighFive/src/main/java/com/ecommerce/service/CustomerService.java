package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.CustomerDTO;
import com.ecommerce.data.entity.Customer;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;
	
	public List<CustomerDTO> getAll(){
		List<Customer> customers = repository.findAll();
		List<CustomerDTO> listCustomer = new ArrayList<>();
		
		for (Customer customer : customers) {
			listCustomer.add(customer.convertToDTO());
		}
		return listCustomer;
	}
	
	public CustomerDTO getById(Long id){
		Customer customer = repository.findById(id).orElseThrow(() -> new NotFoundException("Customer " + id + " not found")); 
		return customer.convertToDTO();
	}
	
	public CustomerDTO add(CustomerDTO customerDTO) {
		Customer customer = repository.save(customerDTO.convertToEntity());
		return customer.convertToDTO();
	}
	
	public Boolean delete(Long id) {
		repository.delete(getById(id).convertToEntity());
		return true;
	}
	
	public CustomerDTO update(CustomerDTO customer) {
		getById(customer.convertToEntity().getId());
		return add(customer);
	}

}
