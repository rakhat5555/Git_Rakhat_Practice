package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {
    static int[] arr = {1,2,3,4};
    static ArrayList<Integer> list = new ArrayList<>();






    public static void main(String[] args) {
        System.out.println("Main");
    }
    static {
        list.addAll(Arrays.asList(5,6,7) );
        System.out.println("static block");
    }
}
