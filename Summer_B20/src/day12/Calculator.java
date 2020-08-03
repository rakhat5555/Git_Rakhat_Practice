package day12;

import java.util.Scanner;

public class
Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double  salary = scan.nextDouble();
        Scanner hourInput = new Scanner(System.in);
        System.out.println("How many hours do you work in a week: ");
        double weekHours = hourInput.nextDouble();
        double result = salary / (52 * weekHours)  ;
        System.out.println("Your salary is " + result + " for a hour");

    }
}
