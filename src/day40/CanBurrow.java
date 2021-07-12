package day40;

public interface CanBurrow {
	// Interface is a special type to achive abstraction
	// It can have only abstract methods (except default and static)
	// It can have only public static final variables
	// It have a lot of assumed code
	
	// We cannot create object out of Interfaces directly
	
	public static final int MIN_DEPTH = 2;
	int MAX_DEPTH = 9; // it's 'public static final'
	
	public abstract int getMaxDepth();
	
	int getMinDepth(); // Java will add this 'public abstract' in front of the method.

}
