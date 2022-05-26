package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.RequestDTO;
import com.ecommerce.data.entity.Request;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.RequestRepository;

@Service
public class RequestService {
	
	@Autowired
	RequestRepository repository;

	public List<RequestDTO> getAll(){
		List<Request> requests = repository.findAll();
		List<RequestDTO> listRequest = new ArrayList<>();
		
		for (Request request : requests) {
			listRequest.add(request.convertToDTO());
		}
		return listRequest;
	}
	
	public RequestDTO getById(Long id) {
		Request request = repository.findById(id).orElseThrow(() -> new NotFoundException("Request " + id + " not found"));
		return request.convertToDTO();
	}
	
	
	public RequestDTO add(RequestDTO request) {
		return repository.save(request.convertToEntity()).convertToDTO();
	}
	
	public Boolean delete(Long id) {
		repository.delete(getById(id).convertToEntity());
		return true;
	}
	
	public RequestDTO update(RequestDTO request) {
		getById(request.convertToEntity().getId());
		return add(request);
	}
}
