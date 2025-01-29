import java.util.Scanner;

public class Frequent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        char mostFrequent = findMostFrequentChar(str);
        System.out.println("Most frequent character: " + mostFrequent);
    }

    public static char findMostFrequentChar(String str) {
        int[] charCount = new int[256]; // ASCII size
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        int maxCount = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequent = (char) i;
            }
        }
        return mostFrequent;
    }
}