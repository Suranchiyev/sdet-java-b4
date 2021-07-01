package day36;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	public static final String[] TOPPINGS = { "mushrooms", "onions", "cheese", "olives", "peppers" };

	private String name;
	private List<String> toppings;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// for mutable objects we have to return copy of them
	public List<String> getToppings() {
		return new ArrayList<>(toppings);
	}

	public void setToppings(List<String> toppings) {
		this.toppings = new ArrayList<>();

		for (String topping : toppings) {
			if (contains(topping.toLowerCase())) {
				this.toppings.add(topping);
			} else {
				System.out.println("We don't support this topping: " + topping);
			}

		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private boolean contains(String str) {
		for (String av : TOPPINGS) {
			if (av.equals(str)) {
				return true;
			}
		}
		return false;
	}
}
