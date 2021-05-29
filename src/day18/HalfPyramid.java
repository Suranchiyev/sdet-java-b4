package day18;

public class HalfPyramid {
	public static void main(String[] args) {
		int height = 5;
		
		for (int i = 0; i < height; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			
			System.out.println();
			
		}
		
		//            01234
		String str = "#####";
		for (int i = str.length() -1; i >= 0; i--) {                               
			System.out.println(str.substring(0, i + 1));
		}
		
		
		/*
		 * #####
		 * ####
		 * ###
		 * ##
		 * #
		 */
		
		/*
		 *     #  #
		 *    ##  ##
		 *   ###  ###
		 *  ####  ####
		 * #####  #####
		 */
	}
}
