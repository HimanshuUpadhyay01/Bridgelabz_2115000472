import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a substring: ");
        String substr = scanner.nextLine();
        int count = countOccurrences(str, substr);
        System.out.println("Substring occurs " + count + " times.");
    }

    public static int countOccurrences(String str, String substr) {
        int count = 0;
        int index = str.indexOf(substr);
        while (index != -1) {
            count++;
            index = str.indexOf(substr, index + 1);
        }
        return count;
    }
}