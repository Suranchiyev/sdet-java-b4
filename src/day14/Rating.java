package day14;

public class Rating {
	enum MovieRating {EXCELLENT, AVERAGE, BAD}
	
	public static void main(String[] args) {
		String ratingMsg = getRatingMsg(MovieRating.EXCELLENT);
		System.out.println(ratingMsg);
		
		System.out.println(getRatingMsg(MovieRating.EXCELLENT));
		
		System.out.println(MovieRating.BAD);
	}
	
	/*
	 * EXCELLENT - "You must see this movie"
	 * AVERAGE   - "This movie is OK, but not great"
	 * BAD       - "Skip it"
	 */
	public static String getRatingMsg(MovieRating rating) {
		String msg = "";
		
		switch(rating) {
		case EXCELLENT:
			msg = "You must see this movie";
			break;
		case AVERAGE:
			msg = "This movie is OK, but not great";
			break;
		case BAD:
			msg = "Skip it";
			break;
		}
		
		return msg;
	}
}
