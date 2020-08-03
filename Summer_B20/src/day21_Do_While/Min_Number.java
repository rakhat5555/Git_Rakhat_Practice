package day21_Do_While;

import java.util.Scanner;

public class Min_Number {
    public static void main(String[] args) {
        int min = 999999999;
        for(int i = 10; i <= 50; i += 10) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " is your min number.");
    }
}
