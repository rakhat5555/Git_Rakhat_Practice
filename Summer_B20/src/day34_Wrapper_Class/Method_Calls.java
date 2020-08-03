package day34_Wrapper_Class;
import  Library.Util;

import java.util.Arrays;

public class Method_Calls {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {5,6,7,8};
        Integer[] arr3 = Util.combine2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        Integer max = Util.maxNum(arr3);
        Integer min = Util.minNum(arr3);
        System.out.println(max);
        System.out.println(min);
        Character[] ch = {'A', 'A', 'B', 'C','D'};
        ch =  Util.sordDesc(ch);
        System.out.println(Arrays.toString(ch));
    }
}
