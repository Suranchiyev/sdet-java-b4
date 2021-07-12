package day40;

public class Nokia implements Phone {
	@Override
	public void call() {
		System.out.println("Calling");
	}
	
	@Override
	public void text(String text) {
		System.out.println("Sending " + text);
	}
	
	public static void main(String[] args) {
		// Polymorphism is an ability of object to
		// take many forms
		
		Phone phone = new Nokia();
		phone.call();
		phone.text("Hi there");
		
		phone = new Motorola();
		phone.call();
		phone.text("Good morning");
	}
}
