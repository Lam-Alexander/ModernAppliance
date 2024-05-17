package ModernAppliances;

public class Dishwasher extends Appliance{

	private String feature;
	private String soundRating;
	
	public Dishwasher (String itemNumber, String brand, int quantity, int wattage,
			String color, double price, String feature, String soundRating) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		this.feature = feature;
		this.soundRating = soundRating;
	}
	
	public String getSoundRating() {
		return soundRating;
	}
	
	@Override
	public String toString() {
		String convertToText = switch (soundRating) {
		case "Qt" -> "Quietest";
		case "Qr" -> "Quieter";
		case "Qu" -> "Quiet;";
		case "M" -> "Moderate";
		default -> String.valueOf(soundRating);
		};
		
		return super.toString() 
				+ "\n Feature: " + feature
				+ "\n Sound Rating: " + convertToText;
	}
	
	@Override
	public String toFileString() {
	    // Generate string representation including attributes specific to Vacuum,
	    // as well as common attributes inherited from the superclass
	    return super.toFileString() + ";" + feature + ";" + soundRating;
	}
}
