import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        System.out.println("Enter the month and day");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        if ((day>19&&month==3)||month==4||month==5||(month==6&&day<21)) {
            System.out.println("Its a spring");
        }
        else{
            System.out.println("Not a spring");
        }



    }
}
