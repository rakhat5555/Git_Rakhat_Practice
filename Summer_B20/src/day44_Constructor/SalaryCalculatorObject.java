package day44_Constructor;

public class SalaryCalculatorObject {
    public static void main(String[] args) {
        SalaryCalculator  salary1 = new SalaryCalculator(38, 40,0.09,0.22 );
        System.out.println(salary1);
        SalaryCalculator salary2 = new SalaryCalculator(45,40,0.09,0.22);
        System.out.println(salary2);
    }
}
