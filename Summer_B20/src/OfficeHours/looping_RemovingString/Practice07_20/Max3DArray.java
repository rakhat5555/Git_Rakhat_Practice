package OfficeHours.looping_RemovingString.Practice07_20;

public class Max3DArray {
    public static void main(String[] args) {

        //                    0       1        0       1
        int[][][] arr3D = {{{1,2}, {3,4}}, {{5,6,7}, {8,9, 10}}};
        //                        0             1
        int max = arr3D [0][0][0];

        for(int[][] each2D : arr3D) {
            for(int[] each1D  :  each2D) {
                for(int eachNum : each1D) {
                    if(eachNum > max) {
                        max = eachNum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
