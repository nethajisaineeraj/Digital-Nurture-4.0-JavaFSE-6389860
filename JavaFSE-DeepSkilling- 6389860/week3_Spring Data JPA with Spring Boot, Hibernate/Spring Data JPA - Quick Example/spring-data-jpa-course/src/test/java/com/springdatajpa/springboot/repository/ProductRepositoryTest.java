package com.springdatajpa.springboot.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.springboot.entity.Product;

@SpringBootTest
class ProductRepositoryTest {
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void saveMethod() {
		// create product
		Product product = new Product();
		product.setName("product2");
		product.setDescription("prodcut2 description");
		product.setSku("100ABCD");
		product.setPrice(new BigDecimal(200));
		product.setActive(true);
		product.setImageUrl("prodcut1.png");
		
		//save product
		Product savedObject = productRepository.save(product);
		
		//display product info
		System.out.println(savedObject);
		
	}
	
	@Test
	void updateUsingSaveMethod() {
		//find or retrive an entity by id from the database
		Long id = 1L;
		Product product = productRepository.findById(id).get();
		
		//update entity information
		product.setName("Updated product 1");
		product.setDescription("Updated description 1");
		
		//save the updated entity
		productRepository.save(product);
		
	}
	
	@Test
	void findByIdMethod(){
		Long id = 1L;
		Product product = productRepository.findById(id).get();
		System.out.println(product);
	}
	
	@Test
	void saveAllMethod() {
		// create product
		Product product2 = new Product();
		product2.setName("product2");
		product2.setDescription("prodcut2 description");
		product2.setSku("100ABCD");
		product2.setPrice(new BigDecimal(200));
		product2.setActive(true);
		product2.setImageUrl("prodcut2.png");
		// create product
		Product product3 = new Product();
		product3.setName("product3");
		product3.setDescription("prodcut3 description");
		product3.setSku("100ABCDE");
		product3.setPrice(new BigDecimal(300));
		product3.setActive(true);
		product3.setImageUrl("prodcut3.png");
		// create product
//		Product product4 = new Product();
//		product4.setName("product4");
//		product4.setDescription("prodcut4 description");
//		product4.setSku("100ABCDEF");
//		product4.setPrice(new BigDecimal(400));
//		product4.setActive(true);
//		product4.setImageUrl("prodcut4.png");
//		productRepository.saveAll(List.of(product2, product3, product4));
	}
	
	@Test
	void findAllMethod() {
		List<Product> products = productRepository.findAll();
		
		products.forEach((p) -> {
			System.out.println(p.getName());
		});
	}
	
	@Test
	void deleteByIdMethod() {
		Long id = 1L;
		productRepository.deleteById(id);
	}
	
	@Test
	void deleteMethod() {
		Long id = 3L;
		
		//find the entity by id
		Product product = productRepository.findById(id).get();
		
		//delete(entity)
		productRepository.delete(product);
		
		
	}
	
	@Test
	void deleteAllMethod() {
		//productRepository.deleteAll();
		
		// deleteAll method which takes list of arguments
		// get all the products by their ids and make a list of them
		Long id1 = 13L, id2 = 14L;
		
		Product product1 = productRepository.findById(id1).get();
		Product product2 = productRepository.findById(id2).get();
		
		productRepository.deleteAll(List.of(product1, product2));
		
	}
	
	@Test
	void countMethod() {
		long count = productRepository.count();
		System.out.println(count);
	}
	
	@Test
	void existsByIdMethod() {
		Long id = 19L;
		
		boolean result = productRepository.existsById(id);
		System.out.println(result);
	}
	
	@Test
	void findByDateCreatedBetweenmethod() {
		//start date
		LocalDateTime startDate = LocalDateTime.of(2025, 07, 10, 10, 21, 8);
		
		//end date
		LocalDateTime endDate = LocalDateTime.of(2025, 07, 10, 11, 10, 19);
		
		List<Product> products = productRepository.findByDateCreatedBetween(startDate, endDate);
		
		products.forEach((p) -> {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println("------------------------------------------");
		});
		
	}
	
	@Test
	void findByIdBetweenMethod() {
		Long startId = 15L;
		Long endId = 20L;
		
		List<Product> products = productRepository.findByIdBetween(startId, endId);
		
		products.forEach((p) -> {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println("------------------------------------------");
		});
		
	}
	
	@Test
	void findByNameLikeMethod() {
		String name = "product1";
		
		List<Product> products = productRepository.findByNameLike(name);
		
		products.forEach((p) -> {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println("------------------------------------------");
		});
		
	}
	
	
}
