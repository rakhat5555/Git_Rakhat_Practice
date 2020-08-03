package day29_CustomMethods;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,678,90,1000};
        maxNumber(numbers);
        minNumber(numbers);
    }

    public static void maxNumber(int[] num) {
        int max = num[0];
        for(int each : num) {
            if( max < each) {
                max = each;
            }
        }
        System.out.println(max + " is your max");
    }
    public static void minNumber(int[] num) {

        int min = num[0];
        for(int each : num) {
            if (min > each) {
                min = each;
            }
        }
        System.out.println(min + " is your min");
    }
}
