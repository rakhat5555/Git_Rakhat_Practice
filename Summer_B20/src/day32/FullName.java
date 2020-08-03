package day32;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String last = scan.nextLine();
        String fullName = formatFullName(first, last);
        System.out.println(fullName);


    }
    public static String formatFullName(String name, String last) {

        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = name + " " + last;
        return fullName;
    }

}
