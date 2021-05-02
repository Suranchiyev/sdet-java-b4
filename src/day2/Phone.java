package day2;

public class Phone {
	public static void main(String[] args) {
		String phone1 = "iphone";
		String phone2 = phone1;
		
		// phone1 = "iphone"
		// phone2 = "iphone";
		
		System.out.println("phone1: " + phone1); // iphone
		System.out.println("phone2: " + phone2); // iphone
		
		// phone1 = "nokia"
		phone1 = "nokia";
		
		System.out.println("phone1: " + phone1); // nokia   
 		System.out.println("phone2: " + phone2); // iphone 
	}
}
