package ModernAppliances;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	    			findAppliancesByBrand(appliances);
					break;
	    		case 3:
	    			displayApplianceByType(appliances);
					break;
	    			
	    		case 4:
	    			System.out.print("\nEnter number of appliances: \n");
	    			int userNumberForRandomAppliances = scanner.nextInt();
	    			produceRandomApplianceList(appliances, userNumberForRandomAppliances);
					break;
					
	    		case 5:
	    			System.out.println("\nYou have successfuly exit the program!");
	    			exit = true;
	    			break;
	    			
	    		default:
	    			System.out.println("\nInvalid choice. Please enter a number between 1 and 5.\n");	
    		}
    	}
    	
    	scanner.close();
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
                selectedAppliance.setQuantity(selectedAppliance.getQuantity() - 1);
                
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
        
        System.out.println("\nPress the Enter key to continue...\n");
        scanner.nextLine();
//        scanner.close();
    }


    public static void findAppliancesByBrand(List<Appliance> appliances) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a brand to search for: ");
        String brand = scanner.nextLine();
        
        List<Vacuum> vacuumList = new ArrayList<>();
        List<Microwave> microwaveList = new ArrayList<>();
        List<Dishwasher> dishwasherList = new ArrayList<>();
        List<Refrigerator> refrigeratorList = new ArrayList<>();
        
        boolean found = false;
        
        for(Appliance appliance : appliances) {
        	if(appliance.getBrand().equalsIgnoreCase(brand)) {
        			
        		if(appliance instanceof Vacuum) {
        			vacuumList.add((Vacuum) appliance);	
        		} 
        		else if (appliance instanceof Microwave) {
        			microwaveList.add((Microwave) appliance);
        		}
        		else if (appliance instanceof Dishwasher) {
        			dishwasherList.add((Dishwasher) appliance);
        		}        		
        		else if (appliance instanceof Refrigerator) {
        			refrigeratorList.add((Refrigerator) appliance);
        		}
        	}
        }

        if (!dishwasherList.isEmpty()) {
        	found = true;
        	System.out.println("\n[Matching Dishwasher]");
        	System.out.println("---------------------");
        	for (Dishwasher dishwasher : dishwasherList) {
        		System.out.println(dishwasher);
        	}
        }
        
        if (!vacuumList.isEmpty()) {
        	found = true;
        	System.out.println("\n[Matching Vacuums]");
        	System.out.println("---------------------");
        	for (Vacuum vacuum : vacuumList) {
        		System.out.println(vacuum);
        	}
        }
        
        if (!microwaveList.isEmpty()) {
        	found = true;
        	System.out.println("\n[Matching Microwave]");
        	System.out.println("---------------------");
        	for (Microwave microwave : microwaveList) {
        		System.out.println(microwave);
        	}
        }
        
        if (!refrigeratorList.isEmpty()) {
        	found = true;
        	System.out.println("\n[Matching Refrigerator]");
        	System.out.println("---------------------");
        	for (Refrigerator refrigerator : refrigeratorList) {
        		System.out.println(refrigerator);
        	}
        }
        
        if(!found) {
        	System.out.println("\nNo appliance found with that brand\n");
        }
        
        System.out.println("\nPress the Enter key to continue...\n");
        scanner.nextLine();
    }
    
    public static void displayApplianceByType(List<Appliance> appliances) {

        Scanner scanner = new Scanner(System.in);
    	
        System.out.println("\nAppliance Types");
        System.out.println("1 - Refrigerators");
        System.out.println("2 - Vacuums");
        System.out.println("3 - Microwaves");
        System.out.println("4 - Dishwashers\n");
        System.out.print("Enter type of appliance: ");
        
        int type = scanner.nextInt();
        
       List<Vacuum> vacuumList = new ArrayList<>();
       List<Microwave> microwaveList = new ArrayList<>();
       List<Dishwasher> dishwasherList = new ArrayList<>();
       List<Refrigerator> refrigeratorList = new ArrayList<>();
       
       boolean doesItemExist = false;
        
        switch (type) {
        	case 1:
        		System.out.print("\nEnter the number of doors: 2 (double door), 3 (three doors) or 4 (four doors): ");
        		int numberOfDoors = scanner.nextInt();
        		
        		for (Appliance appliance : appliances) {
        			if (appliance instanceof Refrigerator) {
        				
        				// This is casting which tells the compiler to treat this like a refrigerator object
        				Refrigerator refrigerator = (Refrigerator) appliance;
        				if (refrigerator.getNumberOfDoors() == numberOfDoors) {
        					refrigeratorList.add(refrigerator);
        					doesItemExist = true;
        				}
        			}
        		}
        		
                if (doesItemExist == false) {
                	System.out.println("\nNo matching item found with your search.\n");
                	}
                
                else {
                	System.out.println("\n[Matching Refrigerator]");
                	System.out.println("---------------------");
                	for (Refrigerator refrigerator : refrigeratorList) {
                		System.out.println(refrigerator);
                	}
                }
        		break;
        		
        	case 2:
        		System.out.print("\nEnter battery voltage value 18 (low) or 24 (high): ");
        		int batteryVoltage = scanner.nextInt();
        		
        		for (Appliance appliance : appliances) {
        			if (appliance instanceof Vacuum) {
        				Vacuum vacuum = (Vacuum) appliance;
        				if (vacuum.getBatteryVoltage() == batteryVoltage) {
        					vacuumList.add(vacuum);
        					doesItemExist = true;
        				}
        			}
        		}
        		
                if (doesItemExist == false) {
                	System.out.println("\nNo matching item found with your search.\n");
                	}
                
                else {
                	System.out.println("\n[Matching Vacuums]");
                	System.out.println("---------------------");
                	for (Vacuum vacuum : vacuumList) {
                		System.out.println(vacuum);
                	}
                }
        		break;
        		
        	case 3:
        		// Create logic for Microwaves
        		break;
        	case 4:
        		// Create method for Dishwashers
        		
        		break;
        }
        
        System.out.println("\nPress the Enter key to continue...\n");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void produceRandomApplianceList(List<Appliance> appliances, int numRandomAppliances) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("[Random Appliances]:");
    	System.out.println("---------------------");
        for (int i = 0; i < numRandomAppliances; i++) {
            // Generate random index to select an appliance from the list
            int randomIndex = random.nextInt(appliances.size());
            
            // Get the randomly selected appliance
            Appliance randomAppliance = appliances.get(randomIndex);
            
            // Output the random appliance
            System.out.println(randomAppliance);
        }
        
        System.out.println("Press the Enter key to continue...\n");
        scanner.nextLine();
    }
}
