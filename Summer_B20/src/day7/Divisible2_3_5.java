package day7;
import  java.util.Scanner;

public class Divisible2_3_5 {
    public static void main(String[] args) {

        int number = 65;
        boolean divisibleBy2 = number % 2 == 0 ;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
    if( divisibleBy2 == true) {
        System.out.println(number + " is divisible by 2: " + divisibleBy2);
    }else if( divisibleBy3 == true) {
            System.out.println(number + " is divisible by 3: " + divisibleBy3);
        } else if( divisibleBy5 == true) {
            System.out.println(number + " is divisible by 5: " + divisibleBy5);
        } else {
        System.out.println("No one is true, try again!");
    }


    }
}
