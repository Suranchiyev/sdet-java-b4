package day14;

public class CountryFee {
	enum Country {USA, Canada, UK, Brazil, Russia, Kazakhstan, Italy};
	
	public static void main(String[] args) {
		double price = getFeeByCountry(Country.USA);
		System.out.println(price); // 10.0;
		
		System.out.println(getFeeByCountry(Country.Canada)); // 12.0
		System.out.println(getFeeByCountry(Country.UK));	 // 9.0
		System.out.println(getFeeByCountry(Country.Russia)); // 8.0
		
	    System.out.println(getFeeByCountry(Country.Kazakhstan)); // 7.0
		System.out.println(getFeeByCountry(Country.Italy)); // 23.0
	}
	
	/*
	 * USA - 10.0
	 * Canada - 12.0
	 * UK - 9.0
	 * Brazil and Russia - 8.0
	 */
	public static double getFeeByCountry(Country country) {
		if (country.equals(Country.USA)) {
			return 10.0;
			
		} else if (country.equals(Country.Canada)) {
			return 12.0;
			
		} else if (country.equals(Country.UK)) {
			return 9.0;
			
		} else if (country.equals(Country.Brazil) || country.equals(Country.Russia)) {
			return 8.0;
			
		} else if (country.equals(Country.Kazakhstan)) {
			return 7.0;
			
		} else if (country.equals(Country.Italy)) {
			return 23.0;
			
		} else {
			return 0.0;
		}
	}
}
