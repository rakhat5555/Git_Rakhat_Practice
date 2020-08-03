package day12;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        double num2 = scan2.nextDouble();
        double result = num1 + num2;
        System.out.println(result + " is summ of two numbers that you entered");
    }
}
