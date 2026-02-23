package com.kodewish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodewish.entity.OrderEntity;
import com.kodewish.kafkaservice.KafkaProducer;

import com.kodewish.repo.OrderRepo;
import com.kodewish.request.AmazonOrderRequest;
@Service
public class OrderServiceImplementation implements OrderService{
	@Autowired
	OrderRepo repo;
	
	@Autowired
	KafkaProducer kafkaproducer;

	@Override
	public String OrderCreate(AmazonOrderRequest order) {
		OrderEntity entity=new OrderEntity();
		entity.setItemName(order.getItemName());
		entity.setDescription(order.getDescription());
		entity.setStatus(order.getStatus());
		
		repo.save(entity);
		//In Json format sending message to kafka 
		kafkaproducer.producerMessage("Order-status",convertObjToJson(order));
		return "Order successfully Created";
	}
	
	
	//converting java object request to json formart
	private String convertObjToJson(AmazonOrderRequest order) {
		ObjectMapper mapper = new ObjectMapper();

		String json = null;
		try {
			json = mapper.writeValueAsString(order);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return json;
	}

}
