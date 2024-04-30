package com.learning.Spring.CloudConsumereurekarippon.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private Integer id;

	private String name;
	

	private String brand;

	private double price;
}