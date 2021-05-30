package day19;

public class StrBuilder {
	public static void main(String[] args) {
		// create StringBuilder with empty value
		StringBuilder sb = new StringBuilder();
		
		// add value to our StringBuilder
		sb.append("hello");
		System.out.println(sb); // hello
		
		sb.append(", world!");
		System.out.println(sb); // hello, world!
		
		StringBuilder tokyo = new StringBuilder();
		tokyo.append("Tokyo");
		System.out.println(tokyo); // Tokyo
		
		tokyo.append(" - population is 37,400,068");
		System.out.println(tokyo); // Tokyo - population is 37,400,068
		
		
		StringBuilder shanghai = new StringBuilder("Shanghai");
		System.out.println(shanghai); // Shanghai
		
		shanghai.append(" - 25,582,000");
		System.out.println(shanghai); // Shanghai - 25,582,000
		
		shanghai = new StringBuilder(); // recreate
		
		// Why do we need to use StringBuilder when we have a String?
		// Efficiency - for StringBuilder we can reuse same object if we need to
		// change its value. But for string each change will require new object.
		// String - immutable
		// StringBuilder - mutable
		
		String mexicoCity = "Mexico City";
		mexicoCity = mexicoCity + " - population is 21,581,00";
		System.out.println(mexicoCity);
		// three objects of String got created above
		System.out.println("==========");
		
		String strNumbers = "";
		for (int i = 0; i <= 100; i++) {
			strNumbers = strNumbers + " " + i;
		}
		System.out.println(strNumbers); // 1 2 3 4 5 6 7 ..
		
		StringBuilder sbNumbers = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			sbNumbers.append(i).append(" ");
		}
		System.out.println(sbNumbers);
		// Should we use StringBuilder all the time instead of String? 
		// No! We use String most of the time but if there is a lot of changes
		// string value(in the loop) it's better to use StringBuilder		
	}
}
