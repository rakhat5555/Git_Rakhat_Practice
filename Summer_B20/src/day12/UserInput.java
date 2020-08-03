package day12;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = scan.nextDouble();
        String result = (num1 % 2 ==0)? num1 + " is Even":num1 + " is Odd";
        System.out.println(result);
    }

}
