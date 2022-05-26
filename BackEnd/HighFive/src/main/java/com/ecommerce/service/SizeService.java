package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.data.dto.CustomerReviewDTO;
import com.ecommerce.data.dto.SizeDTO;
import com.ecommerce.data.entity.Size;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.repository.SizeRepository;

@Service
public class SizeService {

	@Autowired
	SizeRepository repository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerReviewService reviewService;
	
	public List<SizeDTO> getAll(){
		List<Size> sizes = repository.findAll();
		List<SizeDTO> listSize = new ArrayList<>();
		
		for (Size size : sizes) {
			listSize.add(size.convertToDTO());
		}
		return listSize;
	}
	
	// método para retornar o calculo do fit da comunidade
	public SizeDTO getById(Long id) {
		Size size = repository.findById(id).orElseThrow(() -> new NotFoundException("Size " + id + " not found"));
		List<CustomerReviewDTO> review = reviewService.getAllByProduct(size.getProduct().getId());
		
		// Só será feito o calculo caso tenha mais de 5 avaliações nesse produto
	
		if (review.size() > 5) {
			double totalFit = 0;
			for (CustomerReviewDTO customer : review) {
				// Compara as pessoas que fizeram a avaliação com a pessoa que está fazendo o calculo
				
				double diferencaAltura = customer.getCustomer().getHeightCustomer() - size.getCustomer().getHeight();
				double diferencaPeso = customer.getCustomer().getWeightCustomer() - size.getCustomer().getWeight();
				
				
				if (diferencaAltura < 5 && diferencaAltura > -5 && diferencaPeso < 5 && diferencaPeso > -5 ) {
					totalFit =+ (customer.getLengthReview() + customer.getModelingReview() + customer.getWaistReview()) / 3;	
				}
			}	
			size.setCommunityFit(totalFit);			
		}
		return size.convertToDTO();
	}
	
	
	public SizeDTO add(SizeDTO size) {
		return repository.save(size.convertToEntity()).convertToDTO();
	}
	
	public Boolean delete(Long id) {
		repository.delete(getById(id).convertToEntity());
		return true;
	}
	
	public SizeDTO update(SizeDTO size) {
		getById(size.convertToEntity().getId());
		return add(size);
	}
	
}
