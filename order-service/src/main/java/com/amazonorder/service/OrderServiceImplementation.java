package com.amazonorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amazonorder.entity.OrderEntity;
import com.amazonorder.repo.OrderRepo;
import com.amazonorder.request.OrderRequest;
@Service
public class OrderServiceImplementation implements OrderService{
	
	@Autowired
	OrderRepo repo;

	@Override
	public ResponseEntity createOrder(OrderRequest order) {
		
			OrderEntity entity=new OrderEntity();
			entity.setDescription(order.getDescription());
			entity.setItemName(order.getItemName());
			entity.setPrice(order.getPrice());
			entity.setQty(order.getQty());
			entity.setStatus(order.getStatus());
			repo.save(entity);
			
			return ResponseEntity.ok("done");
	}

}
