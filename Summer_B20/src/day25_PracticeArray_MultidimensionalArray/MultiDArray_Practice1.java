package day25_PracticeArray_MultidimensionalArray;

public class MultiDArray_Practice1 {
    public static void main(String[] args) {
        int [][] scores ={{10,20,30, 45} , { 60,55,75,105}, {93, 48, 125, 135}};
        for ( int[] eachDArray: scores) {
            for(  int eachElement : eachDArray) {
                if(eachElement % 3 == 0 || eachElement % 5 == 0) {
                    System.out.print(eachElement + " ");
                }
            }
        }
    }
}

