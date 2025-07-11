package com.springdatajpa.springboot.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate);
	
	List<Product> findByIdBetween(Long startId, Long endId);
	
	List<Product> findByNameLike(String name);
}
 