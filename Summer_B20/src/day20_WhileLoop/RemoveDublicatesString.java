package day20_WhileLoop;

import java.util.Scanner;

public class RemoveDublicatesString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";


        for(int i = 0; i <= str.length()-1; i++) {
            String s = "" + str.charAt(i);
                if(!result.contains(s)) {
                    result += s;
                }

        }
        System.out.println(result);
    }

}
