package day30_CustomMethod;
import Library.Util;

import java.util.Scanner;

public class MethodCalls {
    public static void main(String[] args) {
        String str = "aaaaannnnncccccbbbbb";
        String str2 = Util.removeDup(str);

        System.out.println(str2);

        int result = frequency();
        System.out.println(result);



    }
    public static int frequency() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentenses: ");
        String letters = scan.nextLine();
        System.out.println("Enter a letter what you what to count:");
        char letter = scan.next().charAt(0);
        int count = 0;
        String[] arr =  letters.split("");
        for(int i = 0; i < arr.length; i++ ) {

            if(arr[i].equals(letter)) {
                count++;
            }
        }
        return count;
    }

}
