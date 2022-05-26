package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.data.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {

}
