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
		return " [Dishwasher] ItemNumber: " + itemNumber + ", Brand: " + brand
				+ ", Quantity: " + quantity + ", Wattage: " + wattage + ", Color: "
				+ color + ", Price: " + price + ", Sound Rating:" + soundRating
				+ ", Feature:" + feature;
	}
}
