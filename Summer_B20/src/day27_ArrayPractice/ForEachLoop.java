package day27_ArrayPractice;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int each : arr) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("===============");
        for(int i = arr.length-1; i >= 0; i--) { // reverse the int
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=================");
        int[] scores = {10,20,30,40,50,60,70,80,90,100,110};
        for (int each : scores) {
            if (each % 3 != 0) {
                continue;
            }
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("=====================");
        String[] names = {"AB", "ABC", "A", "ABCD"};
        for (String each : names) {
            if(!each.contains("C")) {
                continue;
            }
            System.out.print(each + " ");
        }


        System.out.println();
        System.out.println("+================");

        int [] score = {80,75,65,110,80,45,56,78};
        int max = score[0];
        int min = score[0];
        for (int each : score) {
            if(max < each) {
                max = each;
            } else if ( min > each) {
                min = each;
            }

        }
        System.out.println(max);
        System.out.println(min + " is minimum");

    }
}
