package day40;

public class Field implements CanBurrow {
	
	@Override
	public int getMaxDepth() {
		return 55;
	}
	
	@Override
	public int getMinDepth() {
		return 2;
	}
	
	public static void main(String[] args) {
		// We cannot initialize interface directly
		// CanBurrow obj = new CanBurrow();
		
		Field obj = new Field();
		
	}
}
