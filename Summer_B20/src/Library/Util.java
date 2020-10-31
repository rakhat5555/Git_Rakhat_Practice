package Library;

import java.util.Arrays;

public class Util {
    public static String removeDup(String str){
        String nonDup = "";

        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        return nonDup;
    }
    // removes the duplicates and returns the value string

    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }
    // reverse the string and retunr the value

    public static int frequency(String str, char ch){

        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from string str and returns it as int

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
    // retunrs the uniiques from the string
    public static String frequencyOfChars(String str) {
        String expectedResult = "";
        String noDupl =  Util.removeDup(str);

        for(char ch : noDupl.toCharArray()) {
            int count = Util.frequency(str, ch);
            expectedResult += "" + ch + count + " ";
        }
        return expectedResult;
    }
    // returns the frequency of every single characters from a string

    public static String formatFullName(String name, String last) {

        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = name + " " + last;
        return fullName;
    }
    //formats the full name Rakhat Tutueva

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
    public static Integer[] sordDesc(Integer[] arr) {
        Arrays.sort(arr);
        Integer[] arr2 = new Integer[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts int array in descending order
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
    public static Double[] sordDecs(Double[] arr) {
        Arrays.sort(arr);
        Double[] arr2 = new Double[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts double array in descending order
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
    public static Character[] sordDesc(Character[] arr) {
        Arrays.sort(arr);
        Character[] arr2 = new Character[arr.length];
        int k = arr.length-1;
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    // sorts int char in descending order
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
    // sorts int String in descending order


    public static Integer maxNum(Integer[] arr){
        Integer max = arr[0];

        for( Integer each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    public static Double maxNum(Double[] arr){
        Double max = arr[0];

        for( Double each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    public static int maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    public static double maxNum(double[] arr){
        double max = arr[0];

        for( double each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }

    // find and returns the max number from in array

    public static int minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    public static Integer minNum(Integer[] arr){
        Integer min= arr[0];

        for( Integer each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    public static double minNum(double[] arr){
        double min= arr[0];

        for( double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }
    public static Double minNum(Double[] arr){
        Double min= arr[0];

        for( Double each : arr ){
            if(each < min){
                min = each;
            }
        }

        return min;
    }


    // find and returns the min number from in array

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for(String each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(String each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int i = 0;
        for(Double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for(char each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(char each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(Integer each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Integer each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for(Character each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(Character each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for(double each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(double each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it


    public static int[] addElement(int[] arr, int numb) {
        int[] newArray = new int[arr.length + 1];
        int index = 0;
        for( int each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
    public static Integer[] addElement(Integer[] arr, Integer numb) {
        Integer[] newArray = new Integer[arr.length + 1];
        Integer index = 0;
        for( Integer each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
    public static double[] addElement(double[] arr, double numb) {
        double[] newArray = new double[arr.length + 1];
        int index = 0;
        for( double each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
    public static String[] addElement(String[] arr, String numb) {
        String[] newArray = new String[arr.length + 1];
        int index = 0;
        for( String each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
    public static char[] addElement(char[] arr, char numb) {
        char[] newArray = new char[arr.length + 1];
        int index = 0;
        for( char  each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
    public static Character[] addElement(Character[] arr, Character numb) {
        Character[] newArray = new Character[arr.length + 1];
        int index = 0;
        for( Character each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }
    public static Double[] addElement(Double[] arr, Double numb) {
        Double[] newArray = new Double[arr.length + 1];
        int index = 0;
        for( Double each : arr) {
            newArray[index] = each;
            index++;
        }
        newArray[index] = numb;
        return newArray;
    }

    // add element to array

}