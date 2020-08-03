package day15_String;

import java.util.Scanner;

public class String_Concat {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = nameInput.next();
        System.out.println("Enter your last name: ");
        String lastName = nameInput.next();
        String fullName = firstName.concat((" " ).concat(lastName));
        System.out.println(fullName);

    }
}
