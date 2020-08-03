package day25_PracticeArray_MultidimensionalArray;

import java.util.Arrays;

public class Multi_DimensionalArray {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

        char[][] ch2D = { {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'} };
        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(ch2D[2][2]); // prints "H"
        System.out.println(ch2D[1][0]); // prints "C";

        System.out.println( ch2D[2][1] + " " + ch2D[0][1] );
        int[][] numbers = { {1,2,3}, {4}, {5,6,7}, {8,9} };
        for(int i = 0; i <= numbers.length-1; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

    }
}
