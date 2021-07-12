package day40;

public class ZooWorker {
	public static void main(String[] args) {
		Crocodile crocodile = new Crocodile();
		// method accepts parent class of crocodile
		// but we can pass the child class
		feed(crocodile);
		
		Alligator alligator = new Alligator();
		feed(alligator);
		
		Reptile reptile = new Reptile();
		feed(reptile);
	}
	
	public static void feed(Reptile reptile) {
		System.out.println("Feeding: " + reptile.getName());
	}
}
