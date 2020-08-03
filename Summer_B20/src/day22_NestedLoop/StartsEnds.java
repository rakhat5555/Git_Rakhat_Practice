package day22_NestedLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StartsEnds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();
        char ch1 = word.charAt(0);
        char chLast = word.charAt(word.length()-1);
        boolean start = ch1 >= 'A' && ch1 <= 'Z';
        boolean end = chLast >= 'a' && chLast <= 'z';
        System.out.println(start && end);
    }

}
