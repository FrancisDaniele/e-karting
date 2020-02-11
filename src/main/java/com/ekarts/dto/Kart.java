package com.ekarts.dto;

import com.ekarts.dto.KartType;





public class Kart {
	private int id;
	private String name;
	private KartType type;
	private double price;
	
	
	public Kart() {
	}


	public Kart(int id) {
		this.id = id;
	}


	public Kart(int id, String name, KartType type, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}


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


	public KartType getType() {
		return type;
	}


	public void setType(KartType type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kart other = (Kart) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			return other.name == null;
		} else return name.equals(other.name);
	}


	@Override
	public String toString() {
		return "Kart [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
}