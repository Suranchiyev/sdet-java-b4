package day42;

public class ChocloteDemo {
	public static void main(String[] args) {
		// initializer block will get invoked
		// right before the constructor
		
		Chocolate obj = new Chocolate();
		System.out.println("---");
		
		Chocolate obj2 = new Chocolate();
		System.out.println("---");
		
		Chocolate obj3 = new Chocolate("Mars", "Twix");
			
		// static block will get invoked one time 
		// when we use our class in anyways. 
		// It will get called only once
	}
	
}
