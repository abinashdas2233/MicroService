package com.amazonorder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="orders")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int orderId;

	    private String status;
	    private String itemName;
	    private int price;
	    private int qty;
	    private String description;
		public OrderEntity(int orderId, String status, String itemName, int price, int qty, String description) {
			super();
			this.orderId = orderId;
			this.status = status;
			this.itemName = itemName;
			this.price = price;
			this.qty = qty;
			this.description = description;
		}
		public OrderEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	    

}