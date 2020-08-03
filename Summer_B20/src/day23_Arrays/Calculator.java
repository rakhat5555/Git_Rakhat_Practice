package day23_Arrays;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Calculator {
    /*   1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("Enter the math operator");
            char o = input.next().charAt(0);

         /*   double result = (o == '+')? num1 + num2:(o == '-')? num1 - num2 :(o == '*')?num1 * num2
                    :(o == '/')?num1 * num2: (o == '%')? num1% num2: 0;
            System.out.println(result); */
            switch (o) {
                case '+':
                    System.out.println(num1+ num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid operator");
            }

            System.out.println("Do you want to continue?");
            String a = input.next();
            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next();
            }
            if (a.equalsIgnoreCase("no")) {
                break;
            }
        }


    }
}