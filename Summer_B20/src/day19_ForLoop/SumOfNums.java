package day19_ForLoop;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        /*  7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        int sum = 0;
        if (num > 1) {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Invailid number");
        }
    }
}
