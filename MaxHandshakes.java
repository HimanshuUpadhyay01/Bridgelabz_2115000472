import java.util.Scanner;
public class MaxHandshakes {

 
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of possible handshakes
        int Handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("Maximum number of possible handshakes: " + Handshakes);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
    

