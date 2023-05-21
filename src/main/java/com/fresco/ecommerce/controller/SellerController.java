package com.fresco.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/seller")
public class SellerController {

	@PostMapping("/product")
	public ResponseEntity<Object> postProduct(){
		return null;
	}
	
	@GetMapping("/product")
	public ResponseEntity<Object> getAllProduct(){
		return null;
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<Object> getProduct(){
		return null;
	}
	
	@PutMapping("/product")
	public ResponseEntity<Object> putProduct(){
		return null;
	}
	
	@DeleteMapping("/product")
	public ResponseEntity<Object> deleteProduct(){
		return null;
	}
}
