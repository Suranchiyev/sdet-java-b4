package day40;

public class Motorola implements Phone {

	@Override
	public void call() {
		System.out.println("Calling from motorola");
	}

	@Override
	public void text(String text) {
		System.out.println("Sending from motorala: " + text);
	}

}
