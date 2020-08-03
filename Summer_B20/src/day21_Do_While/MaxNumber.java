package day21_Do_While;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        int max = -23345346;
        for(int i = 1; i <= 50; i+= 10) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max + " is your max number.");
    }
}
