package day16_String;

import java.util.Scanner;

public class String_CaseSensetiveIgnores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();

        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("Employed");
        } else {
            System.out.println("Not employeed");
        }
        // contains
        String str = "I like to learn java programming language";
        System.out.println(!str.contains("python")); // true
        System.out.println(str.contains("python")); // false

        // startsWith();
        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M")); // true;
        System.out.println(s1.startsWith("J")); // false;
        System.out.println(s1.startsWith("Mu")); // true;
        System.out.println(s1.toLowerCase().contains("mu")); //true
        // endsWith
        System.out.println(s1.endsWith("r")); // true





    }
}
