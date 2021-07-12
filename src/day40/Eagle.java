package day40;

public class Eagle implements CanFly, AnimalInter {
	@Override
	public void fly() {
		System.out.println("Eagle is flying");
	}
	
	@Override
	public void takeoff() {
		System.out.println("Eagle is taking off");
	}
	
	@Override
	public void dive() {
		System.out.println("Eagle is diving");
	}
	

	@Override
	public void eat() {
		System.out.println("Eagle is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Eagle is sleeping");
	}
	
	public static void main(String[] args) {
		Eagle obj = new Eagle();
		obj.fly();
		obj.takeoff();
		obj.dive();
		obj.getHello();
		
		CanFly.printHello();
		
	// How many abstract classes concrete class can implement at once?
	// It's only 1.
	// We can inherit one class at a time - Java is single inherited
	//
	// We can implement as many interfaces as we want to.	

	}

}
