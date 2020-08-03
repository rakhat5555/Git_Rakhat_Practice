package day32;

import java.lang.reflect.Array;
import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int num = 4;
        int[] arr2 = addElement(arr, num);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] addElement(int[] arr, int numb) {
        int[] newArray = new int[arr.length + 1];
        int index = 0;
        for( int each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
}
