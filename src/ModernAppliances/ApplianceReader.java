package ModernAppliances;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

    public static List<Appliance> readAppliancesFromFile(String filename) {
        List<Appliance> appliances = new ArrayList<>();
        
        try (InputStream inputStream = ApplianceReader.class.getResourceAsStream(filename);
        	BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by semicolons
                String[] parts = line.split(";");
                
                // Determine the type of appliance based on the first digit of the item number
                char typeIndicator = parts[0].charAt(0);
                
                // Create objects based on the type
                Appliance appliance;
                switch (typeIndicator) {
                case '1':
                    appliance = new Refrigerator(
                    		parts[0], 
                    		parts[1], 
                    		Integer.parseInt(parts[2]), 
                    		Integer.parseInt(parts[3]), 
                    		parts[4], 
                    		Double.parseDouble(parts[5]), 
                    		Integer.parseInt(parts[6]), 
                    		Integer.parseInt(parts[7]), 
                    		Integer.parseInt(parts[8]));
                    break;
                    
                case '2':
                    appliance = new Vacuum(parts[0],
                    		parts[1], 
                    		Integer.parseInt(parts[2]),
                    		Integer.parseInt(parts[3]), 
                    		parts[4],
                    		Double.parseDouble(parts[5]),
                    		parts[6],
                    		Integer.parseInt(parts[7]));
                    break;
                    
                case '3':
                    appliance = new Microwave(parts[0],
                    		parts[1],
                    		Integer.parseInt(parts[2]),
                    		Integer.parseInt(parts[3]),
                    		parts[4],
                    		Double.parseDouble(parts[5]),
                    		Double.parseDouble(parts[6]),
                    		parts[7]);
                    break;
                case '4':
                case '5':
                    appliance = new Dishwasher(parts[0],
                    		parts[1],
                    		Integer.parseInt(parts[2]),
                    		Integer.parseInt(parts[3]),
                    		parts[4],
                    		Double.parseDouble(parts[5]),
                    		parts[6],
                    		parts[7]);
                    break;
                default:
                    // Invalid appliance type
                    System.err.println("Invalid appliance type: " + typeIndicator);
                    continue; // Skip to the next line
                }
                
                // Add the appliance to the list
                appliances.add(appliance);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return appliances;
    }
}






