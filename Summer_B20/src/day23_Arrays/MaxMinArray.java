package day23_Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,2,1,10};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<= arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
