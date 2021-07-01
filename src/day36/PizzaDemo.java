package day36;

import java.util.Arrays;
import java.util.List;

public class PizzaDemo {
	public static void main(String[] args) {
		Pizza veganPizza = new Pizza();
		veganPizza.setName("Vegan Pizza");
		veganPizza.setPrice(15.9);
		
		List<String> toppingsForVeggie = 
				Arrays.asList("mushrooms", "olives", "pepperoni");
		
		veganPizza.setToppings(toppingsForVeggie);
		
		System.out.println("Name: " + veganPizza.getName());
		System.out.println("Price: " + veganPizza.getPrice());
		System.out.println("Toppings: " + veganPizza.getToppings());
		System.out.println("--------");
		
		List<String> myToppings = veganPizza.getToppings();
		myToppings.add("pepperoni");
		
		System.out.println("Name: " + veganPizza.getName());
		System.out.println("Price: " + veganPizza.getPrice());
		System.out.println("Toppings: " + veganPizza.getToppings());
		System.out.println("--------");
	}
}
