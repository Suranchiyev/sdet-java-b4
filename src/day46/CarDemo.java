package day46;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car("BMW", 
						"i325", 
						"black",
						2019,
						25000,
						4,
						"USA",
						"M Package",
						false,
						6,
						true,
						true);
		
		
		Car car1 = new CarBuilder()
				.setMake("BMW")
				.setModel("i325")
				.setColor("black")
				.build();
		
		Car car2 = new CarBuilder()
				.setYear(2020)
				.setNumberOfDoors(4)
				.build();
		
		// Builder Pattern
		// we use builder pattern to simplify
		// object creation
		
		// Break till 9:26 PM EST
		
	}
}
