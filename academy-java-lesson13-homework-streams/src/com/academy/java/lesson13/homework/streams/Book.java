package com.academy.java.lesson13.homework.streams;

class Book {
	
	public Book(String name, Integer price) {
		this.name = name;
		this.price = price;
		}
	
	private String name;
	
	private Integer price;
	
	public String getName() {
		return this.name;
		}
	
	public Integer getPrice() {
		return this.price;
		}

}
