package day15_String;

import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        String str = "Hello";
        Scanner scan = new Scanner(System.in); // saves in heap
        String s1 = "Cat"; // saves in String pool // save no dublicates
        String s2 = "Cat";
        System.out.println(s1 == s2);

    }
}
