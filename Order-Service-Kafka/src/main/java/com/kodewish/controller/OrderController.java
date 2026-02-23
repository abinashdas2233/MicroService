package com.kodewish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.request.AmazonOrderRequest;
import com.kodewish.service.OrderService;

@RestController
@RequestMapping("/amazon")
public class OrderController {
	@Autowired
	OrderService service;
	@PostMapping("/acceptorder")
	public String orderCreate(@RequestBody AmazonOrderRequest order) {
		return service.OrderCreate(order);
		
		
	}

}
