package com.jpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.entity.Product;
import com.jpa.demo.entity.dao.ProductDao;

@RestController
public class RestCont {
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/greeting")
	public ResponseEntity<Product> getProduct() {
		return new ResponseEntity<>(productDao.getProduct(), HttpStatus.OK);
	}

}
