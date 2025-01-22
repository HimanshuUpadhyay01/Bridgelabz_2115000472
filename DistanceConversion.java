import java.util.Scanner;
public class DistanceConversion{
public static void main (String [] args){
System.out.println("Enter the distance in feets");
try (Scanner input = new Scanner(System.in)) {
    float distanceInFeet = input.nextFloat();
    float distanceInYards = distanceInFeet/(float)3;
    float distanceInMiles = distanceInYards/(float)1760;
    System.out.print("The distance in feets is "+distanceInFeet+ " while in yards is "+distanceInYards+" and in miles is "+distanceInMiles);
}
}}
