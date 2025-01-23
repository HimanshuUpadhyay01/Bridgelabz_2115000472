import java.util.Scanner;
public class Numbercheck {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
