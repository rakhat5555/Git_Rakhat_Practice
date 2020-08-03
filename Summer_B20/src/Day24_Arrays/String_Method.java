package Day24_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Method {
    public static void main(String[] args) {
        String str = "AEIUO";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("====================");
        String str1 = "FEDCBA";
        String str2 = "ABCDEF";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       boolean r1 =  Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("=====================");
         String sentence = "I lone Programming Language";
        String[] words =  sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }


}
