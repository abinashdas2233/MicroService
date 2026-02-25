package com.kodewish.notificationservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kodewish.response.Notification;

@Service
public class NotificationService {
	
	@KafkaListener(
		    topics = "Order-status",
		    groupId = "notification-group"
		)
	public void consume(Notification order) {
	    System.out.println(" Notification (Consumer):-ItemName-"+order.getItemName()+" Description-"+order.getDescription()+" status- "+order.getStatus());
	}
	
	
	
	@KafkaListener(
	        topics = "order-data",
	        groupId = "order-data-notification"
	)
	public void rawData(Notification order) {
	    
	}
	

}
