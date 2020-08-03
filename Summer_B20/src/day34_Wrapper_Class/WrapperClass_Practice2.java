package day34_Wrapper_Class;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        System.out.println("========================");
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(max);
        for(int i = 0; i <= 5; i++) {
            System.out.println("Enter number: ");
            int n = scan.nextInt();
            if(max < n ) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

}
