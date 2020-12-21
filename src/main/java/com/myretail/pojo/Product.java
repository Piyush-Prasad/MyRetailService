package com.myretail.pojo;

/*
 * Product pojo class with id , name and price details 
 * having getter and setters
 * 
 */

public class Product {

	private int id;
	private String name;
	private CurrentPrice current_price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CurrentPrice getCurrent_price() {
		return current_price;
	}
	
	public void setCurrent_price(CurrentPrice current_price) {
		this.current_price = current_price;
	}
	
}
