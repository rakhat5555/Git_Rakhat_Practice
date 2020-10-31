package OfficeHours.looping_RemovingString.Practice_08_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
         list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90) );
        Collections.swap(list1, 0,1);
        System.out.println(list1);
        Collections.swap(list1, list1.size() -1, list1.size()-2);
        System.out.println(list1);

        Integer maxNumber = Collections.max(list1);
        Integer minNumber = Collections.min(list1);
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("==========================");

        String[] arr = {"Eggs", "Orange", "Banana", "Milk", "Milk", "Toilet Paper", "Toilet Paper", "Avocado", "Toilet Paper" };
        ArrayList<String> item = new ArrayList<>();
        item.addAll(Arrays.asList(arr ) );
      Integer countPaper =  Collections.frequency(item, "Toilet Paper");
        System.out.println("countPaper = " + countPaper);

        item.removeIf(I -> Collections.frequency(item, I) != 1 );
        System.out.println(item);


    }
}
