package day36;

// TODO change this class to make it encapsulated
// 1. Make all public properties private
// 2. Provide getters/setters methods
// POJO - Plain Old Java Object
// Beans

public class Car {
	private String model;
	private double price;
	private int year;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			//throw new RuntimeException("Invalid price");
			System.out.println("Invalid price");
			return;
		}
		
		this.price = price;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
