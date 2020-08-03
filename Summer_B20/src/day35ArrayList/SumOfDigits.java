package day35ArrayList;

import java.util.Arrays;

public class SumOfDigits {
    /*
      2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

     */
    public static void main(String[] args) {
        String str = "java java java java";
        int sum = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each char by one by. a, 1, b, 2 ,c , 3
            if(each >= 48 && each <= 57) {
               sum +=  Integer.parseInt("" + each);
            }
        }

//        System.out.println(sum);
        String result = "";
      String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));
    }
}
