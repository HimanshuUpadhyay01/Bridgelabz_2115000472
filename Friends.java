import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Amar
        System.out.println("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.println("Enter Amar's height (in cm): ");
        int amarHeight = scanner.nextInt();

        // Input for Akbar
        System.out.println("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.println("Enter Akbar's height (in cm): ");
        int akbarHeight = scanner.nextInt();

        // Input for Anthony
        System.out.println("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.println("Enter Anthony's height (in cm): ");
        int anthonyHeight = scanner.nextInt();

        scanner.close();

        // Find the youngest friend
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend
        int tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is " + youngestFriend + " with an age of " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with a height of " + tallestHeight + " cm.");
    }
}