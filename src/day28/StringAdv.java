package day28;

public class StringAdv {
	private String str;
	
	public StringAdv(String str) {
		this.str = str;
	}
	
	public int length() {
		return this.str.length();
	}
	
	public String substring(int strart) {
		return this.str.substring(strart);
	}
	
	public String substring(int strart, int end) {
		return this.str.substring(strart, end);
	}
	
	public char charAt(int index) {
		return this.str.charAt(index);
	}
	
	public String reverse() {
		return new StringBuilder(this.str).reverse().toString();
	}
	
	public String toString() {
		return str;
	}
}
