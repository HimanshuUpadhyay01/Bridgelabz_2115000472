import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        float[] heights = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter " + names[i] + "'s height (in meters): ");
            heights[i] = scanner.nextFloat();
        }

        String youngest = youngestPerson(names, ages);
        float youngestAge = youngestAge(ages);
        String tallest = tallestPerson(names, heights);
        float tallestHeight = tallestHeight(heights);

        System.out.println("\nThe youngest friend is " + youngest + " with an age of " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with a height of " + tallestHeight + " meters.");
    }

    public static String youngestPerson(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    public static float youngestAge(int[] ages) {
        float minAge = ages[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
            }
        }
        return minAge;
    }

    public static String tallestPerson(String[] names, float[] heights) {
        float maxheight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxheight) {
                maxheight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static float tallestHeight(float[] heights) {
        float maxheight = heights[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxheight) {
                maxheight = heights[i];
            }
        }
        return maxheight;
    }
}