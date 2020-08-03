package day28_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,4};
        int[] num2 = {5,6,7};
        int[] num3 =  new int[num1.length + num2.length];
        int index = 0;
        for (int i = 0; i <= num1.length -1; i++) {
            num3[index] = num1[i];
            index++;
        }
        for(int k = 0; k <= num2.length-1; k++) {
            num3[index] = num2[k];
            index++;
        }
        System.out.println(Arrays.toString(num3));
       }
    }

