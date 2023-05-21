package com.fresco.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController {
	
	@GetMapping("/product/search")
	public ResponseEntity<Object> getProducts(){
		return null;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(){
		return null;
	}
}
