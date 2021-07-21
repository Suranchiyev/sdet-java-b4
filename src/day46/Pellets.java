package day46;

public class Pellets extends Food {
	public Pellets(int quantity) {
		super(quantity);
	}
	
	@Override
	public void consumed() {
		System.out.println("Pellets eaten: " + getQuantity());
	}
}
