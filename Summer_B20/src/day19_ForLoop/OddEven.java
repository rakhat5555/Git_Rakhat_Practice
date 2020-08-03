package day19_ForLoop;

public class OddEven {
    /*  1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
     */

    public static void main(String[] args) {
        for(int i = 1; i <= 99; i += 2) { // pre condition : i MUST be odd number
            if(i % 5 == 0 && i % 3 == 0) {  // sub: MUst be divisible by 3 & 5
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("==============================");
        // Task2
        // 2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
        for(int i = 0;  i <=100; i +=2) {
            if(i % 15 == 0) { // if i % 3 && i % 5 == 0
                System.out.print(i + " ");
            }
        }
    }
}
