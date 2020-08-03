package Day24_Arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class ReverseArrayIn {
    public static void main(String[] args) {
    /*            int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
    */
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for(int i = arr2D.length-1; i >=0; i--) {
            int[] arr1D = arr2D[i];
//            System.out.println(Arrays.toString(arr1D));
            for(int k = 0; k <= arr1D.length-1; k++) {
                System.out.print(arr1D[k] + " ");
            }
            System.out.println();
        }
        System.out.println("task 2");
        //    task2:
        //                3 2 1
        //                 8 7 6 5 4
        //                 13 12 11 10 9
        for(int i = 0; i < arr2D.length; i++ ) {
            int[] arr1D = arr2D[i];
//            System.out.println(Arrays.toString(arr1D));
            for(int k = arr1D.length-1; k >= 0; k--) {
                System.out.print(arr1D[k] + " ");
            }
            System.out.println();
        }
        /*    task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1*/
        System.out.println("Task 3");
        for(int i = arr2D.length-1; i >= 0; i--) {
            int[] arr1D = arr2D[i];
            for (int k = arr1D.length-1; k >= 0 ; k--) {
                System.out.print(arr1D[k] + " ");
            }
            System.out.println();
        }
    }
}
