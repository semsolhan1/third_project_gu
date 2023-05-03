package com.java.restaurant.domain;

public class Restaurant {

	private int restaurant_id;
	private String restaurant_name;
	private String main_menu;
	private	int price;
	private String address;
	
	
//	CREATE TABLE Restaurant
//	(
//		restaurant_id number(50) NOT NULL,
//		restaurant_name varchar2(20) NOT NULL,
//		main_menu varchar2(20) NOT NULL,
//		price number(20) NOT NULL,
//		address varchar2(20) NOT NULL,
//		PRIMARY KEY (restaurant_id)
//	);
	
	public Restaurant() {}

	
	public Restaurant(int restaurant_id, String restaurant_name, String main_menu, int price, String address) {
		super();
		this.restaurant_id = restaurant_id;
		this.restaurant_name = restaurant_name;
		this.main_menu = main_menu;
		this.price = price;
		this.address = address;
	}
	

	public int getRestaurant_id() {
		return restaurant_id;
	}


	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	public String getRestaurant_name() {
		return restaurant_name;
	}


	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}


	public String getMain_menu() {
		return main_menu;
	}


	public void setMain_menu(String main_menu) {
		this.main_menu = main_menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		
		
		
		return "### 가게 번호: " + restaurant_id + 
				", 가게 이름: " + restaurant_name + 
				", 메인 메뉴: " + main_menu + 
				", 가격: " + price + "원" +
				", 가게 위치: " + address;
	}

	
	
	
	
}
