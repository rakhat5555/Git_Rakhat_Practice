package day13Scanner_Practice;

import java.util.Scanner;

public class nestline_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: "); // 120000Enter
        double salary = scan.nextDouble();
        scan.nextLine(); // use it to take out enter that are left in the scanner. so that we can use the nextLine
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Salary: " + salary);
        System.out.println("Full name: " + fullName);
    }
}
