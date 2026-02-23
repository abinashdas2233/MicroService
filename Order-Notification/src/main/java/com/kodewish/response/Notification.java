package com.kodewish.response;

public class Notification {
private int id;
	
	private String itemName;
	private String description;
	private String status;
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notification(int id, String itemName, String description, String status) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
