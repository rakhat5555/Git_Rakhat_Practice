package day16_String;

import java.util.Scanner;

public class Substring_Practice {
    public static void main(String[] args) {
        /*  Ask user to enter two words. Print first word without its first character then print the
        second word without its first character. Input:
                    apple
                    banana
                Output:
                    ppleanana
*/;

        String str = "I like to drink Pepsi";
        //            0123456789112345
        String drink = str.substring(16);
        System.out.println(drink);
        String action = str.substring(10 , 14 + 1 );
        System.out.println( action);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scan.next();
        System.out.println("Enter second word: ");
        String secondWord = scan.next();
//        firstWord = firstWord.substring(1);
//        secondWord = secondWord.substring(1);
//        String result = firstWord + secondWord;

        String result = firstWord.substring(1).concat(secondWord.substring(1));
                System.out.println(result);
    }
}
