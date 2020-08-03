package day30_CustomMethod;

import java.util.Arrays;

/*
warmmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */
public class WarmUpTasks {
    public static void main(String[] args) {
        maxNum(7,19);
        int[] numbers = {3,2,1,8,7,6,5,8,9,6,54,34};
        printDesc(numbers);
        PosNegZero(0);
        System.out.println("===============================");
        int[] a3 = {100, -100, -200, -300, 0, 0, 900, 5000};

        for( int each : a3){
            PosNegZero(each);
        }

    }
    public static void maxNum(int num1, int num2) {
        if(num1 == num2) {
            System.out.println("equal");
            return;
        }
        System.out.println((num1 > num2)?num1 + " is max":num2 +" is max");
    }
    // task 2:
    public static void printDesc(int[] arr) {
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    //Task04:
    public static void PosNegZero(int num){

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num <0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }

    }

}
