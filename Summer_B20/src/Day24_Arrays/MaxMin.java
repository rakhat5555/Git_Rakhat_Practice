package Day24_Arrays;

import java.util.Scanner;

public class MaxMin {
    /* 2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();
        int[] arrNumber = new int[n];

        for(int i = 0; i<=n-1; i++) {
            System.out.println("Enter a number");
            arrNumber[i] = scan.nextInt();

        }
    int max = arrNumber[0];
        int min = arrNumber[0];
        for(int i = 1; i <= arrNumber.length-1; i++) {
            if(arrNumber[i] > max) {
                max = arrNumber[i];
            }
            if(arrNumber[i] < min) {
                min = arrNumber[i];
            }
        }

        System.out.println(max + " is Maximum number");
        System.out.println(min + " is minimum number");
    }
}
