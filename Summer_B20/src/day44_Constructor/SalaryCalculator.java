package day44_Constructor;

import javax.print.attribute.standard.PresentationDirection;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary() {
        double totalSalary = 0;
        totalSalary = hourlyRate * weeklyHours * 48;
        return totalSalary;
    }
    public double stateTax() {
        double totalStateTax = 0;
        totalStateTax = salary() * stateTaxRate;
        return totalStateTax;
    }
    public double federalTax() {
        double totalFederalTax = 0;

        totalFederalTax = salary() * federalTaxRate;
        return  totalFederalTax;
    }


    public double afterTax() {
        double salaryAfterTax = 0;
        salaryAfterTax = salary() - federalTax() - stateTax();
        return salaryAfterTax;
    }

    public String toString() {
        return  "Hourly rate: " + hourlyRate + "\nWeekly Hours: " + weeklyHours + "\nSalary Before tax: " + salary() +
                "\nState Tax: " + stateTax() + "\nFederal Tax: " + federalTax() + "\nTotal salary after tax: " + afterTax() + "\n====================================";
    }
}
