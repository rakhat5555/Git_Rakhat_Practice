package day34_Wrapper_Class;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        Integer[] arr1 = {1,2,3,4};
         for(Integer each : arr1) {
             System.out.println(each);
         }
         Double[] arr3 = {1.0, 2.1, 3.5 };

         char[] arr5 = {65, 66, 68,67};
        System.out.println(Arrays.toString(arr5));

        Character ch2 = 79;
        String[] num1 = {"12.6", "13.3", "14.9"};
        double[] num2 = new double[num1.length];
        for (int i = 0; i <= num1.length-1; i++) {
           num2[i] = Double.parseDouble(num1[i]);
        }
        System.out.println(Arrays.toString(num2));
    }
}
