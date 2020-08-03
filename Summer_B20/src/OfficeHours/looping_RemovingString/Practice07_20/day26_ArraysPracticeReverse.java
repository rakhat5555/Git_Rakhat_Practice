package OfficeHours.looping_RemovingString.Practice07_20;

import java.util.Arrays;

public class day26_ArraysPracticeReverse {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,3,6,8,7,9,1,0,10};
        Arrays.sort(arr);

        int[] desc = new int[arr.length];
         int k =arr.length-1;
         for(int i = 0; i<= desc.length-1; i++ ) {
             desc[i] = arr[k];
             k--;
         }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(desc));
    }
}
