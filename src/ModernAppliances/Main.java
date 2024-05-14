package ModernAppliances;

import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliances = ApplianceReader.readAppliancesFromFile("appliances.txt");
//        
//        for (Appliance appliance : appliances) {
//        	System.out.println(appliance);
//        }
    	Scanner scanner = new Scanner(System.in);
    	boolean exit = false;
    	while (!exit) {
    		System.out.println("Welcome to Modern Appliances!");
    		System.out.println("How may we assit you?\n");
    		System.out.println("1 - Check out appliance");
    		System.out.println("2 - Find appliances by brand");
    		System.out.println("3 - Display appliances by type");
    		System.out.println("4 - Produce random appliance list");
    		System.out.println("5 - Save & exit\n");
    		
    		System.out.print("Enter option: ");
    		
    		int choice = scanner.nextInt();
    		switch (choice) {
	    		case 1:
					checkOutAppliance(appliances);
					break;
					
	    		case 2:
	    			System.out.println("You Selected Option 2");
					break;
	    		case 3:
	    			System.out.println("You Selected Option 3");
					break;
	    			
	    		case 4:
	    			System.out.println("You Selected Option 4");
					break;
					
	    		case 5:
	    			exit = true;
	    			break;
	    			
	    		default:
	    			System.out.println("Invalid choice. Please enter a number between 1 and 5.");	
    		}
    	}
    }
    
 // Other methods for user interactions and persistence
    public static void checkOutAppliance(List<Appliance> appliances) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the item number of an appliance: ");
        String itemNumber = scanner.nextLine();

        Appliance selectedAppliance = null;

        // Find the appliance with the entered item number
        for (Appliance appliance : appliances) {
            if (appliance.getItemNumber().equals(itemNumber)) {
                selectedAppliance = appliance;
                break;
            }
        }

        if (selectedAppliance != null) {
            // Appliance with the entered item number found
            if (selectedAppliance.getQuantity() > 0 && !selectedAppliance.isCheckedOut()) {
                // Mark the appliance as checked out
                selectedAppliance.setCheckedOut(true);
                // Decrease the quantity of the appliance
//                selectedAppliance.setQuantity(selectedAppliance.getQuantity() - 1);
                System.out.println("\nAppliance \"" + itemNumber + "\" has been checked out.\n");
            } else if (selectedAppliance.getQuantity() == 0) {
                System.out.println("\nThe appliance " + itemNumber + " is out of stock.\n");
            } else {
                System.out.println("The appliance is not available to be checked out.");
            }
        } else {
            // Appliance with the entered item number not found
            System.out.println("\nNo appliances found with that item number.\n");
        }
        System.out.println("Press the Enter key to continue...\n");
        scanner.nextLine();
    }


    public static void FindAppliancesByBrand(List<Appliance> appliances) {
        // Method implementation
    }

    public static void displayApplianceByType(List<Appliance> appliances) {
        // Method implementation
    }

    public static void produceRandomApplianceList(List<Appliance> appliances, String filename) {
        // Method implementation
    }
}
