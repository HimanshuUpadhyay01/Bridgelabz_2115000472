import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total candies: ");
        int totalCandies = scanner.nextInt();

        System.out.print("Enter number of kids: ");
        int numberOfKids = scanner.nextInt();

        int[] result = candiesPerKidAndRemainingCandies(totalCandies, numberOfKids);

        System.out.println("Number of candies each kid will get: " + result[0]);
        System.out.println("Number of remaining candies: " + result[1]);

        scanner.close();
    }

    public static int[] candiesPerKidAndRemainingCandies(int totalCandies, int numberOfKids) {
        int candiesPerKid = totalCandies / numberOfKids;
        int remainingCandies = totalCandies % numberOfKids;

        return new int[] { candiesPerKid, remainingCandies };
    }
}