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
	
	// used in displayByType method to search by sound rating.
	public String getSoundRating() {
		return soundRating;
	}
	
	// converts data to human readable, also converts terms to full text
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
	
	// Writes to txt file in correct format
	@Override
	public String toFileString() {
	    return super.toFileString() + ";" + feature + ";" + soundRating;
	}
}
