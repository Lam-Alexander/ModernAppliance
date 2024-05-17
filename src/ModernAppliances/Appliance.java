package ModernAppliances;

public class Appliance {

	protected String itemNumber;
	protected String brand;
	protected int quantity;
	protected int wattage;
	protected String color;
	protected double price;
	private boolean checkedOut;
	
	
	// Constructor
	public Appliance(String itemNumber, String brand, int quantity, int wattage, 
			String color, double price) {
		
		this.itemNumber = itemNumber;
		this.brand = brand;
		this.quantity = quantity;
		this.wattage = wattage;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String formattedPrice;
		if (price == (int) price) {
			formattedPrice = String.format("$%.0f", price);
		}
		
		else {
			formattedPrice = String.format("$%.2f", price);
		}
		
	    return "\n Item Number: " + itemNumber
	            + "\n Brand: " + brand
	            + "\n Quantity: " + quantity
	            + "\n Wattage: " + wattage
	            + "\n Color: " + color
	            + "\n Price: " + formattedPrice;
	}
	
	public boolean isCheckedOut() {
		return checkedOut;
	}
	
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	public String getItemNumber() {
		return itemNumber;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getBrand() {
		return brand;
	}

	public String toFileString() {
	    // Check if the price is a whole number
	    String formattedPrice;
	    if (price % 1 == 0) {
	        formattedPrice = String.format("%.0f", price); // Format as whole number without "$"
	    } else {
	        formattedPrice = String.format("%.2f", price); // Format with two decimal places without "$"
	    }
	    // Generate string representation in the format: itemNumber;brand;quantity;wattage;color;price
	    return itemNumber + ";" + brand + ";" + quantity + ";" + wattage + ";" + color + ";" + formattedPrice;
	}



	
}
