package day16_String;

import java.util.Scanner;

public class FirstAndLastLetterSame {
    public static void main(String[] args) {
        /*  Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length() -1);

//        boolean result = true;
//        if (first == last ) {
//            result = true;
//        } else {
//            result = false;
//        }
//        System.out.println(result);
        System.out.println(first == last);


        }
    }

