package day2;

public class Swap {
	public static void main(String[] args) {
		String sky = "yellow";
		String sun = "blue";
		
		// TODO swap values of sky and sun without direct reassignment

		//  tmp    = "yellow"
		String tmp = sky;
	//  sky = "blue" 
		sky = sun;	
	//  sun = "yellow"	
		sun = tmp;
		
		System.out.println("Sky is " + sky);
		System.out.println("Sun is " + sun);
	}
}
