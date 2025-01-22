public class EarthVolume {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor from kilometers to miles
        double kmToMiles = 0.621371;

        // Radius of the Earth in miles
        double radiusMiles = radiusKm * kmToMiles;

        // Calculate the volume of the Earth in cubic kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Calculate the volume of the Earth in cubic miles
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
        System.out.println("The volume of the Earth in cubic kilometers is " + volumeKm + " and in cubic miles is " + volumeMiles);
    }
}
