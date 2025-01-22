import java.util.Scanner;
public class parameter{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the side's length of the square");
int side = input.nextInt();
int perimeter = 4*side;
System.out.println("The length of the side is "+side+"whose perimeter is "+perimeter);
}
}
