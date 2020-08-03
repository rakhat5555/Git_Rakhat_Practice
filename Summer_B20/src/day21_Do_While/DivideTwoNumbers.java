package day21_Do_While;

import jdk.swing.interop.SwingInterOpUtils;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = -10, b = 3, count = 0;
        if(b != 0 && b < a) {
            while (a >= b) {
                a -= b;
                count++;
            }
            System.out.println(count + " with a remainder of " + a);
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}
