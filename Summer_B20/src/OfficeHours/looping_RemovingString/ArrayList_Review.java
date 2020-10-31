package OfficeHours.looping_RemovingString;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5) );
        list1.add(5, 6);

        Integer[] nums1 = {8,9,67,36, 67};

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList( nums1) );

//        Integer a = 67;
       list2.remove(new Integer(67) );
       list2.remove(new Integer(36));
        list2.removeAll(Arrays.asList(3, 6,67) ) ;

        list2.removeIf(p -> p > 5);
        System.out.println(list2);

        list2.addAll(Arrays.asList(100,200,300,400,100,100,100) );

        System.out.println(list2);
        list2.retainAll(Arrays.asList(100, 200, 300) );

        System.out.println(list2.size());
        list2.clear();
        System.out.println("list2 = " + list2);
        System.out.println(list2.isEmpty());
        System.out.println("list2.size() = " + list2.size());
        System.out.println("==========================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15) );
//        list3.set(list3.size()-1, 30);
        System.out.println(list3);

        for(int i = 0; i <= list3.size()-1; i++ ) {
           Integer each = list3.get(i);
            if(each % 2 != 0) {
                list3.set(i, each * 2) ;
            } else {
                list3.set(i, each * 3);
            }
        }
        System.out.println(list3);
        System.out.println("=========================================");

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America", "England", "Australia", "New Zeland", "Russia", "Canada") );
//        countries.removeIf(p -> p.endsWith("a")) ;
        countries.removeIf(p -> p.charAt(p.length() -1) == 'd') ;
        System.out.println(countries);

     }
}
