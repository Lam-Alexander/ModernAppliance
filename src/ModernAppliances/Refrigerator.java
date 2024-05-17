package ModernAppliances;

public class Refrigerator extends Appliance{

	// Properties
	private int numberOfDoors;
	private int height;
	private int width;
	
	public Refrigerator (String itemNumber, String brand, int quantity, int wattage, 
			String color, double price, int numberOfDoors, int height, int width) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		this.numberOfDoors = numberOfDoors;
		this.height = height;
		this.width = width;		
	}
	
	@Override
	public String toString() {
		String convertToText = switch (numberOfDoors) {
			case 2 -> "Double Door";
			case 3 -> "Three Doors";
			case 4 -> "Four Doors";
			default -> String.valueOf(numberOfDoors);
		};
		
		return super.toString() 
				+ "\n Number of Doors: " + convertToText
				+ "\n Height: " + height 
				+ "\n Width: " + width;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	@Override
	public String toFileString() {
	    // Generate string representation including attributes specific to Vacuum,
	    // as well as common attributes inherited from the superclass
	    return super.toFileString() + ";" + numberOfDoors + ";" + height + ";" + width;
	}
}
