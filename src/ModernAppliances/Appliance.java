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

	
}
