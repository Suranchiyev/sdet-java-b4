package day37;

public class Parrot extends Bird {
	public void talk() {
		System.out.println(name + " parrot is talking");
	}
	
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.name = "Kesha";
		parrot.age = 2;
		
		parrot.fly();
		parrot.talk();
		
	}
	
}
