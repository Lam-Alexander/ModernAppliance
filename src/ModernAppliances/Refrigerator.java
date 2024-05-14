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
		return " [Refrigerator] ItemNumber: " + itemNumber + ", Brand: " + brand
				+ ", Quantity: " + quantity + ", Wattage: " + wattage + ", Color: "
				+ color + ", Price: " + price + ", Number of Doors:" + numberOfDoors
				+ ", Height" + height + ", Width" + width;
	}
}