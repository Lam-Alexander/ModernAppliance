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
			case 2 -> "double door";
			case 3 -> "three doors";
			case 4 -> "four doors";
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
}
