package day8;

public class Practice4 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double summ = (num1 + num2) * 25 % 40;
        boolean result = summ <= 20;
        System.out.println(result);
    }
}
