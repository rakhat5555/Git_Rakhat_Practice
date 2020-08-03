package day21_Do_While;

import java.util.Scanner;

public class MinAndMaxNumber {
    public static void main(String[] args) {
        int min = 999999999, max = -999999999;
        for(int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num < min) {
               min = num;
            }
            if ( num > max) {
                max = num;
            }
        }
        System.out.println(max + " is your max number\n"+ min + " is your min number");
    }
}
