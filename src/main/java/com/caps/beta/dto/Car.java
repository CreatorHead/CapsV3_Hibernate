package com.caps.beta.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars_info")
public class Car {
	
	@Id @Column(name="car_id")
	private int id;
	
	@Column(name="car_name")
	private String name;
	
	@Column(name="car_color")
	private String color;
	
	@Column(name="car_price")
	private Double price;

	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
