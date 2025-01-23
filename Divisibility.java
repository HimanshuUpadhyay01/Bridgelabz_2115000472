import java.util.Scanner;
public class Divisibility{
    public static void main(String[] args) {
        System.out.println("Enter the to check its divisibilty by 5");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}