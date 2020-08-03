package day25_PracticeArray_MultidimensionalArray;

public class Array_1_100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i  = 0; i <= numbers.length-1; i++ ) {
            numbers[i] =i +  1;
        }
        for(int each: numbers) {
            if(each % 2 != 0) {
                continue;

            }
            else {
                System.out.print(each + " ");
            }
        }
    }
}
