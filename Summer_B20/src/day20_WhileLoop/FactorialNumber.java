package day20_WhileLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 5; i >= 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }

}
