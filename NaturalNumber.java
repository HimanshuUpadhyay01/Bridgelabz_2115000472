import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to be checked");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number>0) {
            int sum = number*(number+1)/2;
            System.out.println("The sum " +number+ " natural numbers is "+sum);
        }
        else{
            System.out.println("The number "+number+ " is not a natural number");
        }
    }
    
}
