package day36_Array_List;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collections;

public class UniqueString_method {
    public static void main(String[] args) {
        /*
           1. write a program that can find the unique characters from a string
                DO NOT use nested loop
                "ABABCDEE"
                output: C D
         */
        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("A");
        str.add("B");
        str.add("B");
        str.add("C");
        str.add("D");
        ArrayList<String> uniques = new ArrayList<>();
        for(String each : str) {
            if(Collections.frequency(str, each) == 1) {
                uniques.add(each);
            }
        }
        System.out.println(uniques);
        System.out.println("====================");
        /*
         2. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

         */
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("A");
        str2.add("A");
        str2.add("B");
        str2.add("B");
        str2.add("C");
        str2.add("C");
        str2.add("D");
        str2.add("D");
        str2.add("E");
        str2.add("E");

        ArrayList<String> nonDup = new ArrayList<>();
        for(String each : str2) {
            if(!nonDup.contains(each)) {
                nonDup.add(each);
            }
        }
        ArrayList<String> result = new ArrayList<>();


        for(String each : nonDup) {
           int  count = Collections.frequency(str2, each);
            System.out.print(each + count + " ");
        }


    }
}
