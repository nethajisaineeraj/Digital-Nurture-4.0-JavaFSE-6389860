package com.springdatajpa.springboot.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// this is a pojo class means - plain old java object
// @Entity is used to specify it as a entity
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(
	name = "products",
	schema = "ecommerce",
	uniqueConstraints = {
		@UniqueConstraint(
				name = "sku_unique",
				columnNames = "stock_keeping_unit"
		)	
	}
)
public class Product {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "product_generator"
		)
	@SequenceGenerator(
			name = "product_generator",
			sequenceName = "product_sequence_generator",
			allocationSize = 1
		)
	private Long id;
	
	@Column(name="stock_keeping_unit", nullable=false)
	private String sku; //means stock keeping unit - short form
	
	@Column(nullable=false)
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	
		
}
