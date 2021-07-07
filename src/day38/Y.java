package day38;

import java.util.ArrayList;

public class Y extends X {
	
	// Animal and Lion they are covariant types
	@Override
	public Lion getAnimal() {
		return new Lion();
	}
	
	@Override
	public ArrayList getList() {
		return new ArrayList<>();
	}
}
