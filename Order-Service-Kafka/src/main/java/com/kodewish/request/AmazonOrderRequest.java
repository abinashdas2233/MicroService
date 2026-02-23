package com.kodewish.request;

public class AmazonOrderRequest {
	private String itemName;
	private String description;
	private String status;
	public AmazonOrderRequest(String itemName, String description, String status) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.status = status;
	}
	public AmazonOrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
