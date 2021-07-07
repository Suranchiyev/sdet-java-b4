package day37;

import java.util.Arrays;

// TODO
// Encapsulate this class
// 1. make all instance variables private
// 2. provide public getters and setters
//    - for mutable object/array we have to return the copy

public class House {
	private String address;
	private String type;
	private double price;
	private String[] rooms;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String[] getRooms() {
		return Arrays.copyOf(rooms, rooms.length);
	}
	
	public void setRooms(String[] rooms) {
		this.rooms = rooms;
	}
}
