package OfficeHours.looping_RemovingString.Practice_08_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 1;
        System.out.println(Arrays.toString(arr1));
        System.out.println("===========================");

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        for(int i = 0; i < names.length; i++) {
            System.out.println("Enter your name: ");
            names[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(names));
    }

}
