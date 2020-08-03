package day15_String;

import java.util.Scanner;

public class String_Method {
    public static void main(String[] args) {
        String name1 = "Cybertek";
        //             01234567
        char ch1 = name1.charAt(0); // returns 'c'
        char ch2 = name1.charAt(5); // returns 't'
        System.out.println(ch1);
        System.out.println(ch2);
        Scanner inputName = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = inputName.next();
        char char1 = name.charAt(0);
        System.out.println("Enter you last name: ");
        String lastName = inputName.next();
        char  char2 = lastName.charAt(0);
        System.out.println("Your initila is: " + char1 + char2);

    }
}
