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
	
	@Override
	public String toString() {
		return    " ItemNumber: " + itemNumber
				+ "\n Brand: " + brand
				+ "\n Quantity: " + quantity 
				+ "\n Wattage: " + wattage 
				+ "\n Color: " + color 
				+ "\n Price: " + price 
				+ "\n Grade: " + grade
				+ "\n BatteryVoltage: " + batteryVoltage + "\n";
				
	}
}
