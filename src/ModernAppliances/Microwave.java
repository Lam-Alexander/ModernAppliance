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
	
	// converts terms to full on text, also formats data so it's human readable
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
	
	// used in displayByType to search roomType
	public String getRoomType() {
		return roomType;
	}
	
	// formats data so it's written to txt in correct format
	@Override
	public String toFileString() {
	    return super.toFileString() + ";" + capacity + ";" + roomType;
	}
}