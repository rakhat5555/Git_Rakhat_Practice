package day15_String;

import java.util.Scanner;

public class String_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() -1);
        System.out.println(firstChar + lastChar); // return you a 184. 1 char + 1 char return number
        System.out.println("" + firstChar + lastChar); // convert to the String adding empty string


    }
}
