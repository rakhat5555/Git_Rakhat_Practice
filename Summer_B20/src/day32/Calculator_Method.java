package day32;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Calculator_Method {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter operator:");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number:");
        double num2 = scan.nextDouble();
        double result = calculator(num1, operator, num2);
        System.out.println(result);

    }
    public static double calculator(double num1, char operator, double num2) {
        double result = 0;

        if (operator == '+') { result = num1 + num2; }
        else if (operator == '-') {result = num1 - num2; }
        else if (operator == '*') {result = num1 * num2; }
        else if (operator == '/') {result = num1 / num2; }
        else if (operator == '%') {result = num1 % num2; }
        else { result = 0; }

        return result;
    }
}
