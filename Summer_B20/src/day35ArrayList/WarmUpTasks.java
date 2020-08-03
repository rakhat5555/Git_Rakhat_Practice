package day35ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTasks {
    /*
      1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<> ();
        int size = 5;
        for(int i = 1; i <= size; i++) {
            numbers.add(i);
        }

        numbers.set(numbers.size()-1, 0);
        System.out.println(numbers);


        /*
        . write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
         */
//        int[] arrNums = {1,2,3,4,5};
//        for(int i = 0; i < arrNums.length; i++) {
//            if(arrNums[i] % 2 != 0) {
//                arrNums[i] *= 2;
//            }
//        }
//        System.out.println(Arrays.toString(arrNums));

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1; i <= 20; i++) {
            list2.add(i);
        }
        for (int i = 0; i < list2.size(); i++) {
           Integer each = list2.get(i); // unboxing. you can assign for each Integer. or you can use directly. list2.get(i) instead of each;
            if(each % 2 != 0) {
                list2.set(i, each * 2);
            } else  {
                list2.set(i, each * 3);
            }
        }
        System.out.println(list2);

        /*


    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
         */

        ArrayList<Integer> numberList = new ArrayList<> ();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of your array:");
        int size1 = scan.nextInt();

        for(int i = 0; i < size1; i++) {
            numberList.add(scan.nextInt() );
        }
        ArrayList<Integer> uniques = new ArrayList<> ();
//        for(Integer each : numberList) { // I did it. second one Muhtar did.
//            int count = 0;
//            for(Integer eachNumber : numberList ) {
//                if(each.equals(eachNumber)) {
//                    count++;
//                }
//            }
//            if(count == 1) {
//                uniques.add(each);
//            }
//        }
        for (Integer element : numberList) {
            int count = 0;
            for (Integer each : numberList) {
                if(each == element) {
                    count++;
                }
            }
            if(count == 1) {
                uniques.add(element);
            }
        }



        System.out.println(uniques);
    }

}
