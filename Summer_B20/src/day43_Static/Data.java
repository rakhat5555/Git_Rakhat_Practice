package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    static int[] arr = new int[3];
    static ArrayList<Integer> list = new ArrayList<>();
    static {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        list.addAll(Arrays.asList(4,5,6) );
    }

}
