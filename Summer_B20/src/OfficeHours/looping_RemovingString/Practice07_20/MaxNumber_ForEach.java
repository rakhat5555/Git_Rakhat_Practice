package OfficeHours.looping_RemovingString.Practice07_20;

public class MaxNumber_ForEach {
    public static void main(String[] args) {
        //                0 1 2    0 1 2 3      0 1 2  3  4
        int[][] arr2D = {{1,2,3}, {4,5,6,7,} , {8,9,10,11,12}};
        //
        int max = arr2D[0][0];
        for(int[] eachArray : arr2D) {
            for(int eachNum : eachArray) {
                if(eachNum > max) {
                    max = eachNum;
                }
            }
        }
        System.out.println(max);
    }
}
