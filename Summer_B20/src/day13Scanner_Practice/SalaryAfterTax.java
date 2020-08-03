package day13Scanner_Practice;

import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        double salary, stateTax, federalTax, result, stateTaxRate, federalTaxRate;
         salary = scan.nextDouble();
        System.out.println("Enter you state tax rate: ");
         stateTaxRate = scan.nextDouble();
        System.out.println("Enter you federal tax rate:");
         federalTaxRate = scan.nextDouble();
         federalTax = salary * federalTaxRate;
         stateTax = salary * stateTaxRate;
         result = salary - stateTax - federalTax;
        System.out.println(salary + " is your annual salary.");
        System.out.println("Your state tax: $ " + stateTax);
        System.out.println("Your federal tax: $ " + federalTax);
        System.out.println(result + " is your salary after tax.");
    }
}
