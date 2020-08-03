package OfficeHours.looping_RemovingString.Practice07_20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How mnay numbers you want to enter?");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("enter a number");
           arr[i] = scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] descArr = new int[size];
        int k = arr.length-1;
        for(int each : arr) {
            descArr[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(descArr));
    }
}
