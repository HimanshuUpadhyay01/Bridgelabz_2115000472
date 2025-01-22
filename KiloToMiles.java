public class KiloToMiles {
    
        public static void main(String[] args) {
            // Distance in kilometers
            double distanceInKm = 10.8;
    
            // Conversion factor from kilometers to miles
            double conversionFactor = 0.621371;
    
            // Convert the distance to miles
            double distanceInMiles = distanceInKm * conversionFactor;
    
            // Print the result
            System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
        }
}