package com.anand.Comparator;

public class Laptop implements Comparable<Laptop> {

	private String ram;
	private int price;
	
	
	public Laptop(String ram, int i) {
		super();
		this.ram = ram;
		this.price = i;
	}
	

	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", price=" + price + "]";
	}


	public int compareTo(Laptop lap) {
		if(this.ram.compareTo(lap.ram) > 1) {
			return 1;
		} else if(this.ram.compareTo(lap.ram) < 1) { 
			return -1;
		} else if(this.ram.compareTo(lap.ram) == 0 )
			return 0;
		return 0;
	}
}
