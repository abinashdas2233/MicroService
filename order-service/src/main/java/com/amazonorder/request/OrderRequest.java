package com.amazonorder.request;

public class OrderRequest {
	
	private String status;
    private String itemName;
    private int price;
    private int qty;
    private String description;
	public OrderRequest(String status, String itemName, int price, int qty, String description) {
		super();
		this.status = status;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
		this.description = description;
	}
	
	
	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
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
