package ModernAppliances;

public class Microwave extends Appliance {
	
	private double capacity;
	private String roomType;
	
	public Microwave (String itemNumber, String brand, int quantity, int wattage, 
			String color, double price, double capacity, String roomType) {
		
		super(itemNumber, brand, quantity, wattage, color, price);
		this.capacity = capacity;
		this.roomType = roomType;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\n Cappacity: " + capacity 
				+ "\n RoomType: " + roomType;
	}
}