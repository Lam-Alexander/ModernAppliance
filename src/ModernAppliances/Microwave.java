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
		String convertToText = switch (roomType) {
		case "K" -> "Kitchen";
		case "W" -> "Work Site";
		default -> String.valueOf(roomType);
		};
		
		return super.toString()
				+ "\n Cappacity: " + capacity 
				+ "\n RoomType: " + convertToText;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	@Override
	public String toFileString() {
	    // Generate string representation including attributes specific to Vacuum,
	    // as well as common attributes inherited from the superclass
	    return super.toFileString() + ";" + capacity + ";" + roomType;
	}
}