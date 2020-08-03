package day19_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reversedWord = "";
        for(int i = word.length()-1; i >=0; i--) {
             reversedWord += word.charAt(i);
        }
        System.out.println(word.equalsIgnoreCase(reversedWord));
    }
}
