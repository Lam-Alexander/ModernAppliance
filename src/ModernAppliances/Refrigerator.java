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
	
	// convert numbers to text, formats data so it's human readable
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
	
	// used in displayByType to search for number of doors.
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	
	// writes to txt file in correct format
	@Override
	public String toFileString() {
	    return super.toFileString() + ";" + numberOfDoors + ";" + height + ";" + width;
	}
}
