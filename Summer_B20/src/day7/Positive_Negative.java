package day7;

public class Positive_Negative {
    public static void main(String[] args) {
        int num = 100;
        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero = num == 0;
        System.out.println(num + " is positive? " + positive);
        System.out.println(num + " is negative? " + negative);
        System.out.println(num + " is zero? " + zero);

    }
}
