package officehours1;

public class Project2 {
    public static void main(String args[]) {
        String name = args[0];
        int pounds = Integer.parseInt(args[1]);
        int feet = Integer.parseInt(args[2]);
        int inches = Integer.parseInt(args[3]);

        double mass = getMassInKilograms(pounds);
        double heightMeters = getHeightInMeters(feet, inches);
        double bmi = calculateBMI(mass, heightMeters);
        String healthRisk = getHealthRiskBasedOnBMI(bmi);

        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);
        System.out.println("Health risk: " + healthRisk);
    }

    private static double getMassInKilograms(int pounds) {
        // TODO write your code here to convert pounds to kilograms and return it
    	return 0.0;
    }
    
    /**
     * Convert feet and inches to meters. 
     * If we convert the height to all inches, 
     * then we can multiply by 0.0254 to convert inches into meters. 
     * One feet is 12 inches.
     */
    private static double getHeightInMeters(int feet, int inches) {
        // TODO write your code here to convert feet and inches to meters and return it
    	double inFeet = feet * 12;
      	double inInches = inFeet + inches;
        return (inInches*0.0254);
    	
    }

    private static double calculateBMI(double massInKilo, double heightInMeters) {
        // TODO write your code here to calculate and return BMI
    	return 0.0;
    }

    private static String getHealthRiskBasedOnBMI(double bmi) {
        // TODO write your code here to get valid health risk message based on requirement
    	return null;
    }
}
