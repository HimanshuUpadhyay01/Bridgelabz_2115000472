import java.util.Scanner;

public class CharRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to remove: ");
        char c = scanner.next().charAt(0);
        System.out.println("Modified string: " + removeChar(str, c));
    }

    public static String removeChar(String str, char c) {
        StringBuilder modified = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != c) {
                modified.append(ch);
            }
        }
        return modified.toString();
    }
}