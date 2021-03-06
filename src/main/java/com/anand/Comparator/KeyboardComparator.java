package com.anand.Comparator;

public class KeyboardComparator {

	private String brand;
	private int price;
	
	
	public KeyboardComparator(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "KeyboardComparator [brand=" + brand + ", price=" + price + "]";
	}
	
}
