package ModernAppliances;

public class Dishwasher extends Appliance{

	private String soundRating;
	private String feature;
	
	public Dishwasher (String itemNumber, String brand, int quantity, int wattage,
			String color, double price, String soundRating, String feature) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		this.soundRating = soundRating;
		this.feature = feature;
	}
	
	@Override
	public String toString() {
		return    " ItemNumber: " + itemNumber
				+ "\n Brand: " + brand
				+ "\n Quantity: " + quantity 
				+ "\n Wattage: " + wattage 
				+ "\n Color: " + color 
				+ "\n Price: " + price 
				+ "\n Sound Rating: " + soundRating
				+ "\n Feature: " + feature + "\n";
	}
}
