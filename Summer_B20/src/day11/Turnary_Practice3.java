package day11;

public class Turnary_Practice3 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String result = (a > b ) ? a + " is greater" :(a < b )? b + " is greater" : "a is equal to b";
        System.out.println(result);
    }
}
