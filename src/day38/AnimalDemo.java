package day38;

public class AnimalDemo {
	public static void main(String[] args) {
		Lion obj = new Lion();
		obj.name = "Leo";
		
		obj.eat();
		obj.run();
		
		// Rules for overriding:
		// 1. Method name and method arguments should be exactly same
		// 2. Return type should be same or covariant
		// 3. Access modifier of child class should be same or
		//    more visible.
		// 4. If method in parent class throws exception, 
		//    child class method should 'throws' the same exception or smaller exceptions
	}
}
