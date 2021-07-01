package day36;

public class SuperheroDemo {
	public static void main(String[] args) {
		// when we create an object we always call
		// a constructor
		
		Superhero s1 = new Superhero();
		Superhero s2 = new Superhero();
		s2 = new Superhero();
		s2.name = "Ant-Man";
		s2.powerLevel = 2;
		
		Superhero s3 = new Superhero("Batman", 5);
		System.out.println(s3.name);
		System.out.println(s3.powerLevel);
		
		System.out.println("---------");
		
		Superhero s4 = new Superhero(); // empty constructor
		Superhero s5 = new Superhero(4); // 1 arg powerLevel cons
		Superhero s6 = new Superhero("Doctor Strange"); // 1 arg name constructor
		Superhero s7 = new Superhero("Iron Man", 5); // 2 arg constructor
		Superhero s8 = new Superhero(); // empty constructor 
	}
}

