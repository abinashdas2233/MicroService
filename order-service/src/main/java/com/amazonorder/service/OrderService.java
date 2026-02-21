package com.amazonorder.service;

import org.springframework.http.ResponseEntity;

import com.amazonorder.request.OrderRequest;

public interface OrderService {
	public ResponseEntity createOrder(OrderRequest order);
}
