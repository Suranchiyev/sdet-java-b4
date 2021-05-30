package day19;

public class StrBuffer {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("apple");
		System.out.println(sbf);
		
		sbf.append(", ornage");
		System.out.println(sbf);
		
		// What's the difference between StringBuilder and StringBuffer?
		// StringBuffer is thread safe and StringBuilder is not thread safe.
		// StringBuffer is little slower than StringBuilder
	}
}
