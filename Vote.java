import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age>=18) {
            System.out.println("The person's age is " +age+ " and can vote.");
            }
        else{
            System.out.println("The person's age is "+age+" and cannot vote.");
        }    
    }
}
