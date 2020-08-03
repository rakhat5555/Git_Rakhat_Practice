package day36_Array_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupl {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C', 'C'));
        System.out.println(list);
        ArrayList<Character> nonDup = new ArrayList<>(); // A , B , C
        for( Character each : list) {
            if(!nonDup.contains(each)) {
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);
        System.out.println("===================");
// method equals
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("rakhat Tutueva");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("rakhat");
        System.out.println(list1.equals(list2));
        System.out.println("=================isEmpty");
// isEmpty
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty());
    }
}
