package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.data.entity.CustomerReview;
import com.ecommerce.data.entity.Product;

@Repository
public interface CustomerReviewRepository extends JpaRepository<CustomerReview, Long>{
	
	List<CustomerReview> findByProduct(Product product);

}
