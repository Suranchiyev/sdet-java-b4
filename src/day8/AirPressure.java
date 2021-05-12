package day8;

public class AirPressure {
	public static void main(String[] args) {
		//if pressure is from 13.5 to 15.5 inclusive then it's "normal pressure"
		//if pressure is less than 13.5 then it's "low pressure"
		//if pressure is greater than 15.5 then it's "high pressure"
		
		double pressure = 16.5;
		//               F               
		if (pressure >= 13.5 && pressure <= 15.5) {
			System.out.println("normal pressure");
			//          F   
		} else if (pressure < 13.5) {
			System.out.println("low pressure");
			//           T
		} else if (pressure > 15.5) {
			System.out.println("high pressure");
			
		} else {
			System.out.println("undefined pressure");
		}
		
		System.out.println("End of program");
	}
}
