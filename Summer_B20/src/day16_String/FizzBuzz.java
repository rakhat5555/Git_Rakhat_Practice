package day16_String;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /* 1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If
Collapse



*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = scan.next();
        System.out.println("Enter you second word:");
        String word2 = scan.next();
        boolean result = word1.length() == 5 && word2.length() == 5;
        if(result) {
            char ch1 = word1.charAt(word1.length()-1 ); // last ch of word1;
            char ch2 = word2.charAt(0);
//            if (ch1 == ch2) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println("Buzz");
//            }
            boolean b1 = word1.endsWith("" + word2.charAt(0)) ; // word 1 nds
            boolean b2 = word2.startsWith("" +word1.charAt(word1.length() -1));
//            if(word1.endsWith("" + word2.charAt(0)) && word2.startsWith("" +word1.charAt(word1.length() -1))) {
              if(b1 && b2) { // or we can do like this
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }


        } else {
            System.out.println("need to be exactly 5 chars length");
        }
    }
}
