package day33_Date_time;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("=================================");
        int[] scores = {100, 75, 85,94,65,55};
        scores = sordDesc(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("====================");
        double[] n1 = {5.5, 6.4, 3.5, 2.4, 0.5};
        n1 = sordDecs(n1);
        System.out.println(Arrays.toString(n1));
    }
    public static int[] sordDesc(int[] arr) {
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    public static double[] sordDecs(double[] arr) {
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    public static char[] sordDesc(char[] arr) {
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    public static String[] sordDesc(String[] arr) {
        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
}
