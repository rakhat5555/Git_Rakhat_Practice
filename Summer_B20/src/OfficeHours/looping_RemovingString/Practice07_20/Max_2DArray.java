package OfficeHours.looping_RemovingString.Practice07_20;

public class Max_2DArray {
    public static void main(String[] args) {
        //                0 1 2    0 1 2 3      0 1 2  3  4
        int[][] arr2D = {{1,2,3}, {4,5,6,7,} , {8,9,10,11,12}};
    //                     0         1            2

         int max = arr2D[0][0];

         for(int j = 0; j<= arr2D.length-1; j++) {
             int[] eachArray = arr2D[j];
             for(int i = 0; i <= eachArray.length-1; i++) {
                 int eachNum =  eachArray[i];
                 if(eachNum > max) {
                     max = eachNum;
                 }
             }
         }


        System.out.println(max);
    }

}
