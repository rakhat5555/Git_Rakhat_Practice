package day35ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays_List {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "E"};
        ArrayList<String> arr3 = new ArrayList<>();

//        for(int i = 0; i < arr1.length; i++) {
//            arr3.add(arr1[i]);
//        }
//        for(int k = 0; k < arr2.length; k++) {
//            arr3.add(arr2[k]);
//        }
        for(String each : arr1) {
            arr3.add(each);
        }
        for (String each : arr2) {
            arr3.add(each);
        }
        System.out.println(arr3);
    }
}
