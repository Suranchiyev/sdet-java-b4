package day46;

public class Car {
	private String make;
	private String model;
	private String color;
	private int year;
	private double price;
	private int numberOfDoors;
	private String madeCountry;
	private String trim;
	private boolean isRebuild;
	private double cylinder;
	private boolean isAutoTransmission;
	private boolean isTurbo;
		
	public Car(String make, String model, String color, int year, double price, int numberOfDoors, String madeCountry,
			String trim, boolean isRebuild, double cylinder, boolean isAutoTransmission, boolean isTurbo) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
		this.numberOfDoors = numberOfDoors;
		this.madeCountry = madeCountry;
		this.trim = trim;
		this.isRebuild = isRebuild;
		this.cylinder = cylinder;
		this.isAutoTransmission = isAutoTransmission;
		this.isTurbo = isTurbo;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public String getMadeCountry() {
		return madeCountry;
	}

	public String getTrim() {
		return trim;
	}

	public boolean isRebuild() {
		return isRebuild;
	}

	public double getCylinder() {
		return cylinder;
	}

	public boolean isAutoTransmission() {
		return isAutoTransmission;
	}

	public boolean isTurbo() {
		return isTurbo;
	}
	
	
}
