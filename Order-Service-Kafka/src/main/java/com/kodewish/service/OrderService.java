package com.kodewish.service;

import com.kodewish.request.AmazonOrderRequest;

public interface OrderService {
	public String OrderCreate(AmazonOrderRequest order);
	public String rawData(AmazonOrderRequest req);

}
