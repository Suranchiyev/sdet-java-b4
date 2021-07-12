package officehours3;

public class Mario {
	public static void main(String[] args) {
		int height = 5;

		String row = "";

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i - 1; j++) {
				row += " ";
			}

			for (int k = 0; k <= i; k++) {
				row += "#";
			}

			row += "  ";

			for (int j = 0; j <= i; j++) {
				row += "#";
			}
			
			if (i != (height - 1)) {
				row += "\n";
			}
			
		}
		System.out.println(row);
	}

}
