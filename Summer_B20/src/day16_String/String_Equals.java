package day16_String;

import java.util.Scanner;

public class String_Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first word:");
        String  word1 = scan.next();
        System.out.println("Enter second word:");
        String word2 = scan.next();
        String result =  (word1.equalsIgnoreCase(word2))?"Equal": "Not equal";
        System.out.println(result);
    }
}
