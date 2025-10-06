package com.spring.practice.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.practice.testing.model.Product;

@RestController
public class ProductController {
	//request body annotation : automatically binds parameters into the parameters
	@PostMapping("/product")
	public String createProduct(@RequestBody final Product product) {
		System.out.println(product);
		return "12345";
	}
}
