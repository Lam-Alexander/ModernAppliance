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
		String ConvertToText = switch (feature) {
		case "Qt" -> "Quietest";
		case "Qr" -> "Quieter";
		case "Qu" -> "Quiet;";
		case "M" -> "Moderate";
		default -> String.valueOf(feature);
		};
		
		return super.toString() 
				+ "\n Sound Rating: " + soundRating
				+ "\n Feature: " + ConvertToText;
	}
}
