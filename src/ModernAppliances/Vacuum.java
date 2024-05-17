package ModernAppliances;

public class Vacuum extends Appliance{

	private String grade;
	private int batteryVoltage;
	
	public Vacuum (String itemNumber, String brand, int quantity, int wattage, String color,
			double price, String grade, int batteryVoltage) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		this.grade = grade;
		this.batteryVoltage = batteryVoltage;
	}
	
	// convert numbers to text, display data so it's human readable
	@Override
	public String toString() {
	    String convertToText = switch (batteryVoltage) {
	        case 18 -> "Low";
	        case 24 -> "High";
	        default -> String.valueOf(batteryVoltage);
	    };

	    return super.toString() 
	    		+ "\n Grade: " + grade
	            + "\n Battery voltage: " + convertToText;
	}
	
	// used it displayByType to search by battery voltage
	public int getBatteryVoltage() {
		return batteryVoltage;
	}
	
	// writes to txt file in format
	@Override
	public String toFileString() {
	    return super.toFileString() + ";" + grade + ";" + batteryVoltage;
	}
}
